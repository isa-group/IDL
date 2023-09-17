# IDL: Inter-parameter Dependency Language

Inter-Parameter Dependency Language (IDL) is a textual domain-specific language for the specification of dependencies among input parameters in web APIs.
IDL is designed to express the seven types of inter-parameter dependencies identified on real-world APIs, including (**Requires**, **Or**, **OnlyOne**, **AllOrNone**, **ZeroOrOne**, **Arithmetic/Relational**, **Complex**).

## Index:

1. [Catalogue of inter-parameter dependencies](#catalogue-of-inter-parameter-dependencies)
2. [How to use IDL?](#how-to-use-idl)
3. [IDL grammar](#idl-grammar)
4. [IDL Editor](#idl-editor)


## Catalogue of inter-parameter dependencies:

* **Requires:** This type of dependency is expressed as **“IF predicate THEN predicate;”**, where the first predicate is the condition and the second is the consequence. 
  * Example: **[PayPal API - Create invoice](https://developer.paypal.com/docs/api/invoicing/v1/#invoices_create)**

        IF custom.label THEN custom.amount;
        IF minimum_amount_due THEN allow_partial_payment==true;

* **Or:** This type of dependency is expressed using the keyword **“Or”** followed by a list of two or more predicates placed inside parentheses: **“Or(predicate, predicate [, ...]);”**. The dependency is satisfied if at least one of the predicates evaluates to true.
  * Example: **[Reddit API - Upload subreddit image](https://www.reddit.com/dev/api#POST_api_upload_sr_img)**

        IF upload_type=='img' THEN name;
        Or(header, upload_type);

* **OnlyOne:** These dependencies are specified using the keyword **“OnlyOne”** followed by a list of two or more predicates placed inside parentheses: **“OnlyOne(predicate, predicate [, ...]);”**. The dependency is satisfied if one, and only one of the predicates evaluates to true.
  * Example: **[Stripe API - Create coupon](https://stripe.com/docs/api/coupons/create)**
  
        OnlyOne(amount_off, percent_off);
        IF amount_off THEN currency;
        AllOrNone(duration=='repeating', duration_in_months);

* **AllOrNone:** This type of dependency is specified using the keyword **“AllOrNone”** followed by a list of two or more predicates placed inside parentheses: **“AllOrNone(predicate, predicate [, ...]);”**. The dependency is satisfied if either all the predicates evaluate to true, or all of them evaluate to false.
  * Example: **[Napster API - Get favorites](https://developer.prod.napster.com/#member-favorites)**

        AllOrNone(rights, filter=='track'|'album');

* **ZeroOrOne:** These dependencies are specified using the keyword **“ZeroOrOne”** followed by a list of two or more predicates placed inside parentheses: **“ZeroOrOne(predicate, predicate [, ...]);”**. The dependency is satisfied if none or at most one of the predicates evaluates to true.
  * Example: **[Github API - Get User Repos](https://docs.github.com/en/rest/repos/repos#list-repositories-for-the-authenticated-user)**

        ZeroOrOne(type, visibility);
        ZeroOrOne(type, affiliation);

* **Arithmetic/Relational:** Relational dependencies are specified as pairs of parameters joined by any of the following relational operators: ==, !=, <=, <, >= or >. Arithmetic dependencies relate two or more parameters using the operators +, - , *, / followed by a final comparison using a relational operator.
  * Example: **[Shopify API - Get price rules](https://shopify.dev/api/admin-rest/2022-10/resources/pricerule#index-2020-01)**

        created_at_min <= created_at_max;
        updated_at_min <= updated_at_max;
        starts_at_min <= starts_at_max;
        ends_at_min <= ends_at_max;
  
* **Complex:** These dependencies are specified as a combination of the previous ones. As an exception to this rule, predicates cannot include Requires dependencies to avoid over-complicated specifications (such dependencies can be expressed in simpler ways).

### More IDL examples
If you want to see more examples of IDL specifications from real APIs, check [here](es.us.isa.interparamdep/resources/expressiveness_evaluation).

## How to use IDL?

IDL dependencies can be straightforwardly specified in OAS specifications using **IDL4OAS**, an OAS extension. 
You just need to include the keyword `x-dependencies` at the operation level, and include the list of dependencies as an array. See this example from the search operation from
the Google Maps Places API extended with IDL4OAS.

             paths:
               /search:
                 get:
                 parameters:
                   - name: radius [...]
                   - name: rankby [...]
                   - name: keyword [...]
                   - name: name [...]
                   - name: type [...]
                   - name: minprice [...]
                   - name: maxprice [...]
                   - [...]
                   [...]
                 x-dependencies:
                   - ZeroOrOne(radius, rankby=='distance');
                   - IF rankby=='distance' THEN keyword OR name OR type;
                   - maxprice >= minprice;

## IDL grammar
The following section presents a simplified version of the IDL grammar. The full version is available as a part of the implementation of IDL can be found [here](https://github.com/isa-group/IDL/blob/master/es.us.isa.interparamdep/src/es/us/isa/interparamdep/InterparameterDependenciesLanguage.xtext).

            Model:
                Dependency*;
            Dependency:
                RelationalDependency | ArithmeticDependency |
                ConditionalDependency | PredefinedDependency;
            RelationalDependency:
                Param RelationalOperator Param;
            ArithmeticDependency:
                Operation RelationalOperator DOUBLE;
            Operation:
                Param OperationContinuation |
                '(' Operation ')' OperationContinuation?;
            OperationContinuation:
                ArithmeticOperator (Param | Operation);
            ConditionalDependency:
                'IF' Predicate 'THEN' Predicate;
            Predicate:
                Clause ClauseContinuation?;
            Clause:
                (Term | RelationalDependency | ArithmeticDependency
                | PredefinedDependency) | 'NOT'? '(' Predicate ')';
            Term:
                'NOT'? (Param | ParamValueRelation);
            Param:
                ID | '[' ID ']';
            ParamValueRelation:
                Param '==' STRING('|'STRING)* |
                Param 'LIKE' PATTERN_STRING | Param '==' BOOLEAN |
                Param RelationalOperator DOUBLE;
            ClauseContinuation:
                ('AND' | 'OR') Predicate;
            PredefinedDependency:
                'NOT'? ('Or' | 'OnlyOne' | 'AllOrNone' |
                'ZeroOrOne') '(' Clause (',' Clause)+ ')';
            RelationalOperator:
                '<' | '>' | '<=' | '>=' | '==' | '!=';
            ArithmeticOperator:
                '+' | '-' | '*' | '/';

## IDL Editor:

The IDL is implemented using Xtext, a popular framework for the development of programming languages and DSLs. Xtext takes a grammar as input and generates a complete set of tools as output, including a linker, a compiler, a parser and a fully-fledged editor supporting features such as code completion, type checking, syntax coloring and validation as can be observed in the figure below. For instructions on how to generate the Xtext artifacts and test the DSL, refer to [this tutorial](https://www.eclipse.org/Xtext/documentation/102_domainmodelwalkthrough.html).

![IDL Editor]([http://idlanalysis.com/wp-content/uploads/2021/11/editor.png](https://github.com/isa-group/IDL/blob/IDLWebsite/assets/images/IDLEditor.png))

### Things to notice
- The project containing the grammar definition and all language-specific components (parser, lexer, linker, validation, etc.) is ```'es.us.isa.interparamdep'```.
- For instructions on how to generate the Xtext artifacts and test the DSL, refer to [this tutorial](https://www.eclipse.org/Xtext/documentation/102_domainmodelwalkthrough.html).


