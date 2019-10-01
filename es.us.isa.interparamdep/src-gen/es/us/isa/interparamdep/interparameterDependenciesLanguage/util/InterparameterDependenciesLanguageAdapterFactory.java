/**
 * generated by Xtext 2.19.0
 */
package es.us.isa.interparamdep.interparameterDependenciesLanguage.util;

import es.us.isa.interparamdep.interparameterDependenciesLanguage.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see es.us.isa.interparamdep.interparameterDependenciesLanguage.InterparameterDependenciesLanguagePackage
 * @generated
 */
public class InterparameterDependenciesLanguageAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static InterparameterDependenciesLanguagePackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InterparameterDependenciesLanguageAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = InterparameterDependenciesLanguagePackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InterparameterDependenciesLanguageSwitch<Adapter> modelSwitch =
    new InterparameterDependenciesLanguageSwitch<Adapter>()
    {
      @Override
      public Adapter caseModel(Model object)
      {
        return createModelAdapter();
      }
      @Override
      public Adapter caseDependency(Dependency object)
      {
        return createDependencyAdapter();
      }
      @Override
      public Adapter caseArithmeticDependency(ArithmeticDependency object)
      {
        return createArithmeticDependencyAdapter();
      }
      @Override
      public Adapter caseConditionalDependency(ConditionalDependency object)
      {
        return createConditionalDependencyAdapter();
      }
      @Override
      public Adapter caseGeneralPredicate(GeneralPredicate object)
      {
        return createGeneralPredicateAdapter();
      }
      @Override
      public Adapter caseGeneralAtomic(GeneralAtomic object)
      {
        return createGeneralAtomicAdapter();
      }
      @Override
      public Adapter caseParam(Param object)
      {
        return createParamAdapter();
      }
      @Override
      public Adapter caseParamAssignment(ParamAssignment object)
      {
        return createParamAssignmentAdapter();
      }
      @Override
      public Adapter caseGeneralClause(GeneralClause object)
      {
        return createGeneralClauseAdapter();
      }
      @Override
      public Adapter caseGeneralClauseContinuation(GeneralClauseContinuation object)
      {
        return createGeneralClauseContinuationAdapter();
      }
      @Override
      public Adapter caseGeneralPredefinedDependency(GeneralPredefinedDependency object)
      {
        return createGeneralPredefinedDependencyAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link es.us.isa.interparamdep.interparameterDependenciesLanguage.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see es.us.isa.interparamdep.interparameterDependenciesLanguage.Model
   * @generated
   */
  public Adapter createModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link es.us.isa.interparamdep.interparameterDependenciesLanguage.Dependency <em>Dependency</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see es.us.isa.interparamdep.interparameterDependenciesLanguage.Dependency
   * @generated
   */
  public Adapter createDependencyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link es.us.isa.interparamdep.interparameterDependenciesLanguage.ArithmeticDependency <em>Arithmetic Dependency</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see es.us.isa.interparamdep.interparameterDependenciesLanguage.ArithmeticDependency
   * @generated
   */
  public Adapter createArithmeticDependencyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link es.us.isa.interparamdep.interparameterDependenciesLanguage.ConditionalDependency <em>Conditional Dependency</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see es.us.isa.interparamdep.interparameterDependenciesLanguage.ConditionalDependency
   * @generated
   */
  public Adapter createConditionalDependencyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link es.us.isa.interparamdep.interparameterDependenciesLanguage.GeneralPredicate <em>General Predicate</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see es.us.isa.interparamdep.interparameterDependenciesLanguage.GeneralPredicate
   * @generated
   */
  public Adapter createGeneralPredicateAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link es.us.isa.interparamdep.interparameterDependenciesLanguage.GeneralAtomic <em>General Atomic</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see es.us.isa.interparamdep.interparameterDependenciesLanguage.GeneralAtomic
   * @generated
   */
  public Adapter createGeneralAtomicAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link es.us.isa.interparamdep.interparameterDependenciesLanguage.Param <em>Param</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see es.us.isa.interparamdep.interparameterDependenciesLanguage.Param
   * @generated
   */
  public Adapter createParamAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link es.us.isa.interparamdep.interparameterDependenciesLanguage.ParamAssignment <em>Param Assignment</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see es.us.isa.interparamdep.interparameterDependenciesLanguage.ParamAssignment
   * @generated
   */
  public Adapter createParamAssignmentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link es.us.isa.interparamdep.interparameterDependenciesLanguage.GeneralClause <em>General Clause</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see es.us.isa.interparamdep.interparameterDependenciesLanguage.GeneralClause
   * @generated
   */
  public Adapter createGeneralClauseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link es.us.isa.interparamdep.interparameterDependenciesLanguage.GeneralClauseContinuation <em>General Clause Continuation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see es.us.isa.interparamdep.interparameterDependenciesLanguage.GeneralClauseContinuation
   * @generated
   */
  public Adapter createGeneralClauseContinuationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link es.us.isa.interparamdep.interparameterDependenciesLanguage.GeneralPredefinedDependency <em>General Predefined Dependency</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see es.us.isa.interparamdep.interparameterDependenciesLanguage.GeneralPredefinedDependency
   * @generated
   */
  public Adapter createGeneralPredefinedDependencyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //InterparameterDependenciesLanguageAdapterFactory
