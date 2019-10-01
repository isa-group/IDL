/**
 * generated by Xtext 2.19.0
 */
package es.us.isa.interparamdep.interparameterDependenciesLanguage.impl;

import es.us.isa.interparamdep.interparameterDependenciesLanguage.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class InterparameterDependenciesLanguageFactoryImpl extends EFactoryImpl implements InterparameterDependenciesLanguageFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static InterparameterDependenciesLanguageFactory init()
  {
    try
    {
      InterparameterDependenciesLanguageFactory theInterparameterDependenciesLanguageFactory = (InterparameterDependenciesLanguageFactory)EPackage.Registry.INSTANCE.getEFactory(InterparameterDependenciesLanguagePackage.eNS_URI);
      if (theInterparameterDependenciesLanguageFactory != null)
      {
        return theInterparameterDependenciesLanguageFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new InterparameterDependenciesLanguageFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InterparameterDependenciesLanguageFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case InterparameterDependenciesLanguagePackage.MODEL: return createModel();
      case InterparameterDependenciesLanguagePackage.DEPENDENCY: return createDependency();
      case InterparameterDependenciesLanguagePackage.ARITHMETIC_DEPENDENCY: return createArithmeticDependency();
      case InterparameterDependenciesLanguagePackage.CONDITIONAL_DEPENDENCY: return createConditionalDependency();
      case InterparameterDependenciesLanguagePackage.GENERAL_PREDICATE: return createGeneralPredicate();
      case InterparameterDependenciesLanguagePackage.GENERAL_ATOMIC: return createGeneralAtomic();
      case InterparameterDependenciesLanguagePackage.PARAM: return createParam();
      case InterparameterDependenciesLanguagePackage.PARAM_ASSIGNMENT: return createParamAssignment();
      case InterparameterDependenciesLanguagePackage.GENERAL_CLAUSE: return createGeneralClause();
      case InterparameterDependenciesLanguagePackage.GENERAL_CLAUSE_CONTINUATION: return createGeneralClauseContinuation();
      case InterparameterDependenciesLanguagePackage.GENERAL_PREDEFINED_DEPENDENCY: return createGeneralPredefinedDependency();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Dependency createDependency()
  {
    DependencyImpl dependency = new DependencyImpl();
    return dependency;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ArithmeticDependency createArithmeticDependency()
  {
    ArithmeticDependencyImpl arithmeticDependency = new ArithmeticDependencyImpl();
    return arithmeticDependency;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ConditionalDependency createConditionalDependency()
  {
    ConditionalDependencyImpl conditionalDependency = new ConditionalDependencyImpl();
    return conditionalDependency;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public GeneralPredicate createGeneralPredicate()
  {
    GeneralPredicateImpl generalPredicate = new GeneralPredicateImpl();
    return generalPredicate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public GeneralAtomic createGeneralAtomic()
  {
    GeneralAtomicImpl generalAtomic = new GeneralAtomicImpl();
    return generalAtomic;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Param createParam()
  {
    ParamImpl param = new ParamImpl();
    return param;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ParamAssignment createParamAssignment()
  {
    ParamAssignmentImpl paramAssignment = new ParamAssignmentImpl();
    return paramAssignment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public GeneralClause createGeneralClause()
  {
    GeneralClauseImpl generalClause = new GeneralClauseImpl();
    return generalClause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public GeneralClauseContinuation createGeneralClauseContinuation()
  {
    GeneralClauseContinuationImpl generalClauseContinuation = new GeneralClauseContinuationImpl();
    return generalClauseContinuation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public GeneralPredefinedDependency createGeneralPredefinedDependency()
  {
    GeneralPredefinedDependencyImpl generalPredefinedDependency = new GeneralPredefinedDependencyImpl();
    return generalPredefinedDependency;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public InterparameterDependenciesLanguagePackage getInterparameterDependenciesLanguagePackage()
  {
    return (InterparameterDependenciesLanguagePackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static InterparameterDependenciesLanguagePackage getPackage()
  {
    return InterparameterDependenciesLanguagePackage.eINSTANCE;
  }

} //InterparameterDependenciesLanguageFactoryImpl
