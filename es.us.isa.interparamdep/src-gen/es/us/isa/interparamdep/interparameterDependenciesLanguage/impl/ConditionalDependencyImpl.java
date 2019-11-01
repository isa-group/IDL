/**
 * generated by Xtext 2.19.0
 */
package es.us.isa.interparamdep.interparameterDependenciesLanguage.impl;

import es.us.isa.interparamdep.interparameterDependenciesLanguage.ConditionalDependency;
import es.us.isa.interparamdep.interparameterDependenciesLanguage.InterparameterDependenciesLanguagePackage;
import es.us.isa.interparamdep.interparameterDependenciesLanguage.Predicate;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conditional Dependency</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.us.isa.interparamdep.interparameterDependenciesLanguage.impl.ConditionalDependencyImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link es.us.isa.interparamdep.interparameterDependenciesLanguage.impl.ConditionalDependencyImpl#getConsequence <em>Consequence</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConditionalDependencyImpl extends MinimalEObjectImpl.Container implements ConditionalDependency
{
  /**
   * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCondition()
   * @generated
   * @ordered
   */
  protected Predicate condition;

  /**
   * The cached value of the '{@link #getConsequence() <em>Consequence</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConsequence()
   * @generated
   * @ordered
   */
  protected Predicate consequence;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ConditionalDependencyImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return InterparameterDependenciesLanguagePackage.Literals.CONDITIONAL_DEPENDENCY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Predicate getCondition()
  {
    return condition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCondition(Predicate newCondition, NotificationChain msgs)
  {
    Predicate oldCondition = condition;
    condition = newCondition;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InterparameterDependenciesLanguagePackage.CONDITIONAL_DEPENDENCY__CONDITION, oldCondition, newCondition);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setCondition(Predicate newCondition)
  {
    if (newCondition != condition)
    {
      NotificationChain msgs = null;
      if (condition != null)
        msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InterparameterDependenciesLanguagePackage.CONDITIONAL_DEPENDENCY__CONDITION, null, msgs);
      if (newCondition != null)
        msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InterparameterDependenciesLanguagePackage.CONDITIONAL_DEPENDENCY__CONDITION, null, msgs);
      msgs = basicSetCondition(newCondition, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, InterparameterDependenciesLanguagePackage.CONDITIONAL_DEPENDENCY__CONDITION, newCondition, newCondition));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Predicate getConsequence()
  {
    return consequence;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetConsequence(Predicate newConsequence, NotificationChain msgs)
  {
    Predicate oldConsequence = consequence;
    consequence = newConsequence;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InterparameterDependenciesLanguagePackage.CONDITIONAL_DEPENDENCY__CONSEQUENCE, oldConsequence, newConsequence);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setConsequence(Predicate newConsequence)
  {
    if (newConsequence != consequence)
    {
      NotificationChain msgs = null;
      if (consequence != null)
        msgs = ((InternalEObject)consequence).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InterparameterDependenciesLanguagePackage.CONDITIONAL_DEPENDENCY__CONSEQUENCE, null, msgs);
      if (newConsequence != null)
        msgs = ((InternalEObject)newConsequence).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InterparameterDependenciesLanguagePackage.CONDITIONAL_DEPENDENCY__CONSEQUENCE, null, msgs);
      msgs = basicSetConsequence(newConsequence, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, InterparameterDependenciesLanguagePackage.CONDITIONAL_DEPENDENCY__CONSEQUENCE, newConsequence, newConsequence));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case InterparameterDependenciesLanguagePackage.CONDITIONAL_DEPENDENCY__CONDITION:
        return basicSetCondition(null, msgs);
      case InterparameterDependenciesLanguagePackage.CONDITIONAL_DEPENDENCY__CONSEQUENCE:
        return basicSetConsequence(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case InterparameterDependenciesLanguagePackage.CONDITIONAL_DEPENDENCY__CONDITION:
        return getCondition();
      case InterparameterDependenciesLanguagePackage.CONDITIONAL_DEPENDENCY__CONSEQUENCE:
        return getConsequence();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case InterparameterDependenciesLanguagePackage.CONDITIONAL_DEPENDENCY__CONDITION:
        setCondition((Predicate)newValue);
        return;
      case InterparameterDependenciesLanguagePackage.CONDITIONAL_DEPENDENCY__CONSEQUENCE:
        setConsequence((Predicate)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case InterparameterDependenciesLanguagePackage.CONDITIONAL_DEPENDENCY__CONDITION:
        setCondition((Predicate)null);
        return;
      case InterparameterDependenciesLanguagePackage.CONDITIONAL_DEPENDENCY__CONSEQUENCE:
        setConsequence((Predicate)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case InterparameterDependenciesLanguagePackage.CONDITIONAL_DEPENDENCY__CONDITION:
        return condition != null;
      case InterparameterDependenciesLanguagePackage.CONDITIONAL_DEPENDENCY__CONSEQUENCE:
        return consequence != null;
    }
    return super.eIsSet(featureID);
  }

} //ConditionalDependencyImpl
