# IDL: Inter-parameter Dependency Language

Inter-Parameter Dependency Language (IDL) is a textual domain-specific language for the specification of dependencies among input parameters in web APIs. IDL is designed to express the seven types of inter-parameter dependencies identified on real-world APIs, including (**Requires**, **Or**, **OnlyOne**, **AllOrNone**, **ZeroOrOne**, **Arithmetic/Relational**, **Complex**).
                
## Dependency types with examples:

* **Requires:** This type of dependency is expressed as **“IF predicate THEN predicate;”**, where the first predicate is the condition and the second is the consequence. 
  * Example: **IF p1 THEN p2=='A';**

* **Or:** This type of dependency is expressed using the keyword **“Or”** followed by a list of two or more predicates placed inside parentheses: **“Or(predicate, predicate [, ...]);”**. The dependency is satisfied if at least one of the predicates evaluates to true.
  * Example: **Or(p1, p2, p3);**

* **OnlyOne:** These dependencies are specified using the keyword **“OnlyOne”** followed by a list of two or more predicates placed inside parentheses: **“OnlyOne(predicate, predicate [, ...]);”**. The dependency is satisfied if one, and only one of the predicates evaluates to true.
  * Example: **OnlyOne(p1, p2=='B');**

* **AllOrNone:** This type of dependency is specified using the keyword **“AllOrNone”** followed by a list of two or more predicates placed inside parentheses: **“AllOrNone(predicate, predicate [, ...]);”**. The dependency is satisfied if either all the predicates evaluate to true, or all of them evaluate to false.
  * Example: **AllOrNone(p1, p2==true);**

* **ZeroOrOne:** These dependencies are specified using the keyword **“ZeroOrOne”** followed by a list of two or more predicates placed inside parentheses: **“ZeroOrOne(predicate, predicate [, ...]);”**. The dependency is satisfied if none or at most one of the predicates evaluates to true.
  * Example: **ZeroOrOne(p1, p2<=100);**

* **Arithmetic/Relational:** Relational dependencies are specified as pairs of parameters joined by any of the following relational operators: ==, !=, <=, <, >= or >. Arithmetic dependencies relate two or more parameters using the operators +, - , *, / followed by a final comparison using a relational operator.
  * Example: **p1 < p2;**

* **Complex:** These dependencies are specified as a combination of the previous ones. As an exception to this rule, predicates cannot include Requires dependencies to avoid over-complicated specifications (such dependencies can be expressed in simpler ways).
  * Example: **IF p1 THEN ZeroOrOne(p2, OnlyOne(p3, p4>p5));**

## Real API Example:
Example below shows the IDL specification of Google Maps Places API.

    // Operation: Search for places within specified area:
     ZeroOrOne(radius, rankby=='distance');
     IF rankby=='distance' THEN keyword OR name OR type;
     maxprice >= minprice;

     // Operation: Query information about places:
     AllOrNone(location, radius);
     Or(query, type);
     maxprice >= minprice;

     // Operation: Get photo of place:
     OnlyOne(maxheight, maxwidth);

     // Operation: Automcomplete place name:
     IF strictbounds THEN location AND radius;

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

The IDL is implemented using Xtext, a popular framework for the development of programming languages and DSLs. Xtext takes a grammar as input and generates a complete set of tools as output, including a linker, a compiler, a parser and a fully-fledged editor supporting features such as code completion, type checking, syntax coloring and validation as can be observed in the figure below.. For instructions on how to generate the Xtext artifacts and test the DSL, refer to [this tutorial](https://www.eclipse.org/Xtext/documentation/102_domainmodelwalkthrough.html).

![IDL Editor](http://idlanalysis.com/wp-content/uploads/2021/11/editor.png)



## IDL4OAS: An OAS Extension:

We propose an extension of OAS for the specification of inter-parameter dependencies using IDL. We call this extension IDL4OAS. An OAS document describes a REST API in terms of the elements it comprises, namely paths, operations, resources, request parameters and responses. OpenAPI provides a way to add extra information that may not be supported natively. This information is included in custom properties that start with **“x-”**, called extensions. IDL4OAS is an OAS extension that allows to specify a set of IDL dependencies for each API operation. An extra property called **“x-dependencies”** must be added at the operation level, including the set of dependencies among the input parameters of the operation. Example below shows an excerpt of an OAS document extended with IDL4OAS, corresponding to the Search operation from the Google Maps Places API.

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
                   - IF rankby=='distance' THEN keyword OR name OR
                        type;
                   - maxprice >= minprice;

### Things to notice
- The project containing the grammar definition and all language-specific components (parser, lexer, linker, validation, etc.) is ```'es.us.isa.interparamdep'```.
- For instructions on how to generate the Xtext artifacts and test the DSL, refer to [this tutorial](https://www.eclipse.org/Xtext/documentation/102_domainmodelwalkthrough.html).

### IDL examples
If you want to see examples of IDL specifications from real APIs, check [here](es.us.isa.interparamdep/resources/expressiveness_evaluation).
