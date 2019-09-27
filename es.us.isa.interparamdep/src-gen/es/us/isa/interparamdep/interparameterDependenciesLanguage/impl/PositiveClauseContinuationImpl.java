/**
 * generated by Xtext 2.19.0
 */
package es.us.isa.interparamdep.interparameterDependenciesLanguage.impl;

import es.us.isa.interparamdep.interparameterDependenciesLanguage.InterparameterDependenciesLanguagePackage;
import es.us.isa.interparamdep.interparameterDependenciesLanguage.PositiveClauseContinuation;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Positive Clause Continuation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.us.isa.interparamdep.interparameterDependenciesLanguage.impl.PositiveClauseContinuationImpl#getLogicalOp <em>Logical Op</em>}</li>
 *   <li>{@link es.us.isa.interparamdep.interparameterDependenciesLanguage.impl.PositiveClauseContinuationImpl#getAdditionalElements <em>Additional Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PositiveClauseContinuationImpl extends MinimalEObjectImpl.Container implements PositiveClauseContinuation
{
  /**
   * The default value of the '{@link #getLogicalOp() <em>Logical Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLogicalOp()
   * @generated
   * @ordered
   */
  protected static final String LOGICAL_OP_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLogicalOp() <em>Logical Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLogicalOp()
   * @generated
   * @ordered
   */
  protected String logicalOp = LOGICAL_OP_EDEFAULT;

  /**
   * The cached value of the '{@link #getAdditionalElements() <em>Additional Elements</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAdditionalElements()
   * @generated
   * @ordered
   */
  protected EObject additionalElements;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PositiveClauseContinuationImpl()
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
    return InterparameterDependenciesLanguagePackage.Literals.POSITIVE_CLAUSE_CONTINUATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getLogicalOp()
  {
    return logicalOp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setLogicalOp(String newLogicalOp)
  {
    String oldLogicalOp = logicalOp;
    logicalOp = newLogicalOp;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, InterparameterDependenciesLanguagePackage.POSITIVE_CLAUSE_CONTINUATION__LOGICAL_OP, oldLogicalOp, logicalOp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject getAdditionalElements()
  {
    return additionalElements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAdditionalElements(EObject newAdditionalElements, NotificationChain msgs)
  {
    EObject oldAdditionalElements = additionalElements;
    additionalElements = newAdditionalElements;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InterparameterDependenciesLanguagePackage.POSITIVE_CLAUSE_CONTINUATION__ADDITIONAL_ELEMENTS, oldAdditionalElements, newAdditionalElements);
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
  public void setAdditionalElements(EObject newAdditionalElements)
  {
    if (newAdditionalElements != additionalElements)
    {
      NotificationChain msgs = null;
      if (additionalElements != null)
        msgs = ((InternalEObject)additionalElements).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InterparameterDependenciesLanguagePackage.POSITIVE_CLAUSE_CONTINUATION__ADDITIONAL_ELEMENTS, null, msgs);
      if (newAdditionalElements != null)
        msgs = ((InternalEObject)newAdditionalElements).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InterparameterDependenciesLanguagePackage.POSITIVE_CLAUSE_CONTINUATION__ADDITIONAL_ELEMENTS, null, msgs);
      msgs = basicSetAdditionalElements(newAdditionalElements, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, InterparameterDependenciesLanguagePackage.POSITIVE_CLAUSE_CONTINUATION__ADDITIONAL_ELEMENTS, newAdditionalElements, newAdditionalElements));
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
      case InterparameterDependenciesLanguagePackage.POSITIVE_CLAUSE_CONTINUATION__ADDITIONAL_ELEMENTS:
        return basicSetAdditionalElements(null, msgs);
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
      case InterparameterDependenciesLanguagePackage.POSITIVE_CLAUSE_CONTINUATION__LOGICAL_OP:
        return getLogicalOp();
      case InterparameterDependenciesLanguagePackage.POSITIVE_CLAUSE_CONTINUATION__ADDITIONAL_ELEMENTS:
        return getAdditionalElements();
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
      case InterparameterDependenciesLanguagePackage.POSITIVE_CLAUSE_CONTINUATION__LOGICAL_OP:
        setLogicalOp((String)newValue);
        return;
      case InterparameterDependenciesLanguagePackage.POSITIVE_CLAUSE_CONTINUATION__ADDITIONAL_ELEMENTS:
        setAdditionalElements((EObject)newValue);
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
      case InterparameterDependenciesLanguagePackage.POSITIVE_CLAUSE_CONTINUATION__LOGICAL_OP:
        setLogicalOp(LOGICAL_OP_EDEFAULT);
        return;
      case InterparameterDependenciesLanguagePackage.POSITIVE_CLAUSE_CONTINUATION__ADDITIONAL_ELEMENTS:
        setAdditionalElements((EObject)null);
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
      case InterparameterDependenciesLanguagePackage.POSITIVE_CLAUSE_CONTINUATION__LOGICAL_OP:
        return LOGICAL_OP_EDEFAULT == null ? logicalOp != null : !LOGICAL_OP_EDEFAULT.equals(logicalOp);
      case InterparameterDependenciesLanguagePackage.POSITIVE_CLAUSE_CONTINUATION__ADDITIONAL_ELEMENTS:
        return additionalElements != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (logicalOp: ");
    result.append(logicalOp);
    result.append(')');
    return result.toString();
  }

} //PositiveClauseContinuationImpl
