/**
 * generated by Xtext 2.19.0
 */
package es.us.isa.interparamdep.interparameterDependenciesLanguage.impl;

import es.us.isa.interparamdep.interparameterDependenciesLanguage.ArithmeticDependency;
import es.us.isa.interparamdep.interparameterDependenciesLanguage.ComparisonDependency;
import es.us.isa.interparamdep.interparameterDependenciesLanguage.ConditionalDependency;
import es.us.isa.interparamdep.interparameterDependenciesLanguage.Dependency;
import es.us.isa.interparamdep.interparameterDependenciesLanguage.GeneralAtomic;
import es.us.isa.interparamdep.interparameterDependenciesLanguage.GeneralClause;
import es.us.isa.interparamdep.interparameterDependenciesLanguage.GeneralClauseContinuation;
import es.us.isa.interparamdep.interparameterDependenciesLanguage.GeneralPredefinedDependency;
import es.us.isa.interparamdep.interparameterDependenciesLanguage.InterparameterDependenciesLanguageFactory;
import es.us.isa.interparamdep.interparameterDependenciesLanguage.InterparameterDependenciesLanguagePackage;
import es.us.isa.interparamdep.interparameterDependenciesLanguage.Model;
import es.us.isa.interparamdep.interparameterDependenciesLanguage.Operation;
import es.us.isa.interparamdep.interparameterDependenciesLanguage.OperationContinuation;
import es.us.isa.interparamdep.interparameterDependenciesLanguage.Param;
import es.us.isa.interparamdep.interparameterDependenciesLanguage.ParamAssignment;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class InterparameterDependenciesLanguagePackageImpl extends EPackageImpl implements InterparameterDependenciesLanguagePackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dependencyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass comparisonDependencyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass arithmeticDependencyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass operationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass operationContinuationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass conditionalDependencyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass generalAtomicEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass paramEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass paramAssignmentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass generalClauseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass generalClauseContinuationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass generalPredefinedDependencyEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see es.us.isa.interparamdep.interparameterDependenciesLanguage.InterparameterDependenciesLanguagePackage#eNS_URI
   * @see #init()
   * @generated
   */
  private InterparameterDependenciesLanguagePackageImpl()
  {
    super(eNS_URI, InterparameterDependenciesLanguageFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   *
   * <p>This method is used to initialize {@link InterparameterDependenciesLanguagePackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static InterparameterDependenciesLanguagePackage init()
  {
    if (isInited) return (InterparameterDependenciesLanguagePackage)EPackage.Registry.INSTANCE.getEPackage(InterparameterDependenciesLanguagePackage.eNS_URI);

    // Obtain or create and register package
    Object registeredInterparameterDependenciesLanguagePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
    InterparameterDependenciesLanguagePackageImpl theInterparameterDependenciesLanguagePackage = registeredInterparameterDependenciesLanguagePackage instanceof InterparameterDependenciesLanguagePackageImpl ? (InterparameterDependenciesLanguagePackageImpl)registeredInterparameterDependenciesLanguagePackage : new InterparameterDependenciesLanguagePackageImpl();

    isInited = true;

    // Create package meta-data objects
    theInterparameterDependenciesLanguagePackage.createPackageContents();

    // Initialize created meta-data
    theInterparameterDependenciesLanguagePackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theInterparameterDependenciesLanguagePackage.freeze();

    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(InterparameterDependenciesLanguagePackage.eNS_URI, theInterparameterDependenciesLanguagePackage);
    return theInterparameterDependenciesLanguagePackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getModel()
  {
    return modelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getModel_Dependencies()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getDependency()
  {
    return dependencyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getDependency_Dep()
  {
    return (EReference)dependencyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getComparisonDependency()
  {
    return comparisonDependencyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getComparisonDependency_Param1()
  {
    return (EAttribute)comparisonDependencyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getComparisonDependency_ArithOp()
  {
    return (EAttribute)comparisonDependencyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getComparisonDependency_Param2()
  {
    return (EAttribute)comparisonDependencyEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getArithmeticDependency()
  {
    return arithmeticDependencyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getArithmeticDependency_Operation()
  {
    return (EReference)arithmeticDependencyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getArithmeticDependency_ArithOp()
  {
    return (EAttribute)arithmeticDependencyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getArithmeticDependency_Result()
  {
    return (EAttribute)arithmeticDependencyEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getOperation()
  {
    return operationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getOperation_FirstParam()
  {
    return (EReference)operationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getOperation_OperationContinuation()
  {
    return (EReference)operationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getOperation_OpeningParenthesis()
  {
    return (EAttribute)operationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getOperation_Operation()
  {
    return (EReference)operationEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getOperation_ClosingParenthesis()
  {
    return (EAttribute)operationEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getOperationContinuation()
  {
    return operationContinuationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getOperationContinuation_MathOp()
  {
    return (EAttribute)operationContinuationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getOperationContinuation_AdditionalParams()
  {
    return (EReference)operationContinuationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getConditionalDependency()
  {
    return conditionalDependencyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getConditionalDependency_Condition()
  {
    return (EReference)conditionalDependencyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getConditionalDependency_Consequence()
  {
    return (EReference)conditionalDependencyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getGeneralAtomic()
  {
    return generalAtomicEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getGeneralAtomic_Not()
  {
    return (EAttribute)generalAtomicEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getGeneralAtomic_Param()
  {
    return (EReference)generalAtomicEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getParam()
  {
    return paramEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getParam_Name()
  {
    return (EAttribute)paramEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getParam_StringValues()
  {
    return (EAttribute)paramEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getParam_AdditionalValues()
  {
    return (EAttribute)paramEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getParam_BooleanValue()
  {
    return (EAttribute)paramEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getParam_ArithOp()
  {
    return (EAttribute)paramEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getParam_DoubleValue()
  {
    return (EAttribute)paramEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getParamAssignment()
  {
    return paramAssignmentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getGeneralClause()
  {
    return generalClauseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getGeneralClause_FirstElement()
  {
    return (EReference)generalClauseEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getGeneralClause_ClauseContinuation()
  {
    return (EReference)generalClauseEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getGeneralClause_Not()
  {
    return (EAttribute)generalClauseEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getGeneralClause_OpeningParenthesis()
  {
    return (EAttribute)generalClauseEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getGeneralClause_Clause()
  {
    return (EReference)generalClauseEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getGeneralClause_ClosingParenthesis()
  {
    return (EAttribute)generalClauseEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getGeneralClauseContinuation()
  {
    return generalClauseContinuationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getGeneralClauseContinuation_LogicalOp()
  {
    return (EAttribute)generalClauseContinuationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getGeneralClauseContinuation_AdditionalElements()
  {
    return (EReference)generalClauseContinuationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getGeneralPredefinedDependency()
  {
    return generalPredefinedDependencyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getGeneralPredefinedDependency_Not()
  {
    return (EAttribute)generalPredefinedDependencyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getGeneralPredefinedDependency_PredefDepType()
  {
    return (EAttribute)generalPredefinedDependencyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getGeneralPredefinedDependency_PredefDepElements()
  {
    return (EReference)generalPredefinedDependencyEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public InterparameterDependenciesLanguageFactory getInterparameterDependenciesLanguageFactory()
  {
    return (InterparameterDependenciesLanguageFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    modelEClass = createEClass(MODEL);
    createEReference(modelEClass, MODEL__DEPENDENCIES);

    dependencyEClass = createEClass(DEPENDENCY);
    createEReference(dependencyEClass, DEPENDENCY__DEP);

    comparisonDependencyEClass = createEClass(COMPARISON_DEPENDENCY);
    createEAttribute(comparisonDependencyEClass, COMPARISON_DEPENDENCY__PARAM1);
    createEAttribute(comparisonDependencyEClass, COMPARISON_DEPENDENCY__ARITH_OP);
    createEAttribute(comparisonDependencyEClass, COMPARISON_DEPENDENCY__PARAM2);

    arithmeticDependencyEClass = createEClass(ARITHMETIC_DEPENDENCY);
    createEReference(arithmeticDependencyEClass, ARITHMETIC_DEPENDENCY__OPERATION);
    createEAttribute(arithmeticDependencyEClass, ARITHMETIC_DEPENDENCY__ARITH_OP);
    createEAttribute(arithmeticDependencyEClass, ARITHMETIC_DEPENDENCY__RESULT);

    operationEClass = createEClass(OPERATION);
    createEReference(operationEClass, OPERATION__FIRST_PARAM);
    createEReference(operationEClass, OPERATION__OPERATION_CONTINUATION);
    createEAttribute(operationEClass, OPERATION__OPENING_PARENTHESIS);
    createEReference(operationEClass, OPERATION__OPERATION);
    createEAttribute(operationEClass, OPERATION__CLOSING_PARENTHESIS);

    operationContinuationEClass = createEClass(OPERATION_CONTINUATION);
    createEAttribute(operationContinuationEClass, OPERATION_CONTINUATION__MATH_OP);
    createEReference(operationContinuationEClass, OPERATION_CONTINUATION__ADDITIONAL_PARAMS);

    conditionalDependencyEClass = createEClass(CONDITIONAL_DEPENDENCY);
    createEReference(conditionalDependencyEClass, CONDITIONAL_DEPENDENCY__CONDITION);
    createEReference(conditionalDependencyEClass, CONDITIONAL_DEPENDENCY__CONSEQUENCE);

    generalAtomicEClass = createEClass(GENERAL_ATOMIC);
    createEAttribute(generalAtomicEClass, GENERAL_ATOMIC__NOT);
    createEReference(generalAtomicEClass, GENERAL_ATOMIC__PARAM);

    paramEClass = createEClass(PARAM);
    createEAttribute(paramEClass, PARAM__NAME);
    createEAttribute(paramEClass, PARAM__STRING_VALUES);
    createEAttribute(paramEClass, PARAM__ADDITIONAL_VALUES);
    createEAttribute(paramEClass, PARAM__BOOLEAN_VALUE);
    createEAttribute(paramEClass, PARAM__ARITH_OP);
    createEAttribute(paramEClass, PARAM__DOUBLE_VALUE);

    paramAssignmentEClass = createEClass(PARAM_ASSIGNMENT);

    generalClauseEClass = createEClass(GENERAL_CLAUSE);
    createEReference(generalClauseEClass, GENERAL_CLAUSE__FIRST_ELEMENT);
    createEReference(generalClauseEClass, GENERAL_CLAUSE__CLAUSE_CONTINUATION);
    createEAttribute(generalClauseEClass, GENERAL_CLAUSE__NOT);
    createEAttribute(generalClauseEClass, GENERAL_CLAUSE__OPENING_PARENTHESIS);
    createEReference(generalClauseEClass, GENERAL_CLAUSE__CLAUSE);
    createEAttribute(generalClauseEClass, GENERAL_CLAUSE__CLOSING_PARENTHESIS);

    generalClauseContinuationEClass = createEClass(GENERAL_CLAUSE_CONTINUATION);
    createEAttribute(generalClauseContinuationEClass, GENERAL_CLAUSE_CONTINUATION__LOGICAL_OP);
    createEReference(generalClauseContinuationEClass, GENERAL_CLAUSE_CONTINUATION__ADDITIONAL_ELEMENTS);

    generalPredefinedDependencyEClass = createEClass(GENERAL_PREDEFINED_DEPENDENCY);
    createEAttribute(generalPredefinedDependencyEClass, GENERAL_PREDEFINED_DEPENDENCY__NOT);
    createEAttribute(generalPredefinedDependencyEClass, GENERAL_PREDEFINED_DEPENDENCY__PREDEF_DEP_TYPE);
    createEReference(generalPredefinedDependencyEClass, GENERAL_PREDEFINED_DEPENDENCY__PREDEF_DEP_ELEMENTS);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    comparisonDependencyEClass.getESuperTypes().add(this.getGeneralAtomic());
    paramEClass.getESuperTypes().add(this.getParamAssignment());

    // Initialize classes and features; add operations and parameters
    initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getModel_Dependencies(), this.getDependency(), null, "dependencies", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dependencyEClass, Dependency.class, "Dependency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDependency_Dep(), ecorePackage.getEObject(), null, "dep", null, 0, 1, Dependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(comparisonDependencyEClass, ComparisonDependency.class, "ComparisonDependency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getComparisonDependency_Param1(), ecorePackage.getEString(), "param1", null, 0, 1, ComparisonDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getComparisonDependency_ArithOp(), ecorePackage.getEString(), "arithOp", null, 0, 1, ComparisonDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getComparisonDependency_Param2(), ecorePackage.getEString(), "param2", null, 0, 1, ComparisonDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(arithmeticDependencyEClass, ArithmeticDependency.class, "ArithmeticDependency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getArithmeticDependency_Operation(), this.getOperation(), null, "operation", null, 0, 1, ArithmeticDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getArithmeticDependency_ArithOp(), ecorePackage.getEString(), "arithOp", null, 0, 1, ArithmeticDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getArithmeticDependency_Result(), ecorePackage.getEString(), "result", null, 0, 1, ArithmeticDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(operationEClass, Operation.class, "Operation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOperation_FirstParam(), this.getParam(), null, "firstParam", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOperation_OperationContinuation(), this.getOperationContinuation(), null, "operationContinuation", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getOperation_OpeningParenthesis(), ecorePackage.getEString(), "openingParenthesis", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOperation_Operation(), this.getOperation(), null, "operation", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getOperation_ClosingParenthesis(), ecorePackage.getEString(), "closingParenthesis", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(operationContinuationEClass, OperationContinuation.class, "OperationContinuation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getOperationContinuation_MathOp(), ecorePackage.getEString(), "mathOp", null, 0, 1, OperationContinuation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOperationContinuation_AdditionalParams(), ecorePackage.getEObject(), null, "additionalParams", null, 0, 1, OperationContinuation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(conditionalDependencyEClass, ConditionalDependency.class, "ConditionalDependency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getConditionalDependency_Condition(), ecorePackage.getEObject(), null, "condition", null, 0, 1, ConditionalDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getConditionalDependency_Consequence(), ecorePackage.getEObject(), null, "consequence", null, 0, 1, ConditionalDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(generalAtomicEClass, GeneralAtomic.class, "GeneralAtomic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getGeneralAtomic_Not(), ecorePackage.getEString(), "not", null, 0, 1, GeneralAtomic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGeneralAtomic_Param(), this.getParamAssignment(), null, "param", null, 0, 1, GeneralAtomic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(paramEClass, Param.class, "Param", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getParam_Name(), ecorePackage.getEString(), "name", null, 0, 1, Param.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getParam_StringValues(), ecorePackage.getEString(), "stringValues", null, 0, -1, Param.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getParam_AdditionalValues(), ecorePackage.getEString(), "additionalValues", null, 0, 1, Param.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getParam_BooleanValue(), ecorePackage.getEString(), "booleanValue", null, 0, 1, Param.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getParam_ArithOp(), ecorePackage.getEString(), "arithOp", null, 0, 1, Param.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getParam_DoubleValue(), ecorePackage.getEString(), "doubleValue", null, 0, 1, Param.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(paramAssignmentEClass, ParamAssignment.class, "ParamAssignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(generalClauseEClass, GeneralClause.class, "GeneralClause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getGeneralClause_FirstElement(), ecorePackage.getEObject(), null, "firstElement", null, 0, 1, GeneralClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGeneralClause_ClauseContinuation(), this.getGeneralClauseContinuation(), null, "clauseContinuation", null, 0, 1, GeneralClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getGeneralClause_Not(), ecorePackage.getEString(), "not", null, 0, 1, GeneralClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getGeneralClause_OpeningParenthesis(), ecorePackage.getEString(), "openingParenthesis", null, 0, 1, GeneralClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGeneralClause_Clause(), this.getGeneralClause(), null, "clause", null, 0, 1, GeneralClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getGeneralClause_ClosingParenthesis(), ecorePackage.getEString(), "closingParenthesis", null, 0, 1, GeneralClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(generalClauseContinuationEClass, GeneralClauseContinuation.class, "GeneralClauseContinuation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getGeneralClauseContinuation_LogicalOp(), ecorePackage.getEString(), "logicalOp", null, 0, 1, GeneralClauseContinuation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGeneralClauseContinuation_AdditionalElements(), ecorePackage.getEObject(), null, "additionalElements", null, 0, 1, GeneralClauseContinuation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(generalPredefinedDependencyEClass, GeneralPredefinedDependency.class, "GeneralPredefinedDependency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getGeneralPredefinedDependency_Not(), ecorePackage.getEString(), "not", null, 0, 1, GeneralPredefinedDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getGeneralPredefinedDependency_PredefDepType(), ecorePackage.getEString(), "predefDepType", null, 0, 1, GeneralPredefinedDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGeneralPredefinedDependency_PredefDepElements(), ecorePackage.getEObject(), null, "predefDepElements", null, 0, -1, GeneralPredefinedDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //InterparameterDependenciesLanguagePackageImpl
