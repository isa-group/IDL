/**
 * generated by Xtext 2.19.0
 */
package es.us.isa.interparamdep.interparameterDependenciesLanguage.impl;

import es.us.isa.interparamdep.interparameterDependenciesLanguage.InterparameterDependenciesLanguagePackage;
import es.us.isa.interparamdep.interparameterDependenciesLanguage.OperationContinuation;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation Continuation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.us.isa.interparamdep.interparameterDependenciesLanguage.impl.OperationContinuationImpl#getMathOp <em>Math Op</em>}</li>
 *   <li>{@link es.us.isa.interparamdep.interparameterDependenciesLanguage.impl.OperationContinuationImpl#getAdditionalParams <em>Additional Params</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperationContinuationImpl extends MinimalEObjectImpl.Container implements OperationContinuation
{
  /**
   * The default value of the '{@link #getMathOp() <em>Math Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMathOp()
   * @generated
   * @ordered
   */
  protected static final String MATH_OP_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMathOp() <em>Math Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMathOp()
   * @generated
   * @ordered
   */
  protected String mathOp = MATH_OP_EDEFAULT;

  /**
   * The cached value of the '{@link #getAdditionalParams() <em>Additional Params</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAdditionalParams()
   * @generated
   * @ordered
   */
  protected EObject additionalParams;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OperationContinuationImpl()
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
    return InterparameterDependenciesLanguagePackage.Literals.OPERATION_CONTINUATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getMathOp()
  {
    return mathOp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setMathOp(String newMathOp)
  {
    String oldMathOp = mathOp;
    mathOp = newMathOp;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, InterparameterDependenciesLanguagePackage.OPERATION_CONTINUATION__MATH_OP, oldMathOp, mathOp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject getAdditionalParams()
  {
    return additionalParams;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAdditionalParams(EObject newAdditionalParams, NotificationChain msgs)
  {
    EObject oldAdditionalParams = additionalParams;
    additionalParams = newAdditionalParams;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InterparameterDependenciesLanguagePackage.OPERATION_CONTINUATION__ADDITIONAL_PARAMS, oldAdditionalParams, newAdditionalParams);
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
  public void setAdditionalParams(EObject newAdditionalParams)
  {
    if (newAdditionalParams != additionalParams)
    {
      NotificationChain msgs = null;
      if (additionalParams != null)
        msgs = ((InternalEObject)additionalParams).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InterparameterDependenciesLanguagePackage.OPERATION_CONTINUATION__ADDITIONAL_PARAMS, null, msgs);
      if (newAdditionalParams != null)
        msgs = ((InternalEObject)newAdditionalParams).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InterparameterDependenciesLanguagePackage.OPERATION_CONTINUATION__ADDITIONAL_PARAMS, null, msgs);
      msgs = basicSetAdditionalParams(newAdditionalParams, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, InterparameterDependenciesLanguagePackage.OPERATION_CONTINUATION__ADDITIONAL_PARAMS, newAdditionalParams, newAdditionalParams));
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
      case InterparameterDependenciesLanguagePackage.OPERATION_CONTINUATION__ADDITIONAL_PARAMS:
        return basicSetAdditionalParams(null, msgs);
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
      case InterparameterDependenciesLanguagePackage.OPERATION_CONTINUATION__MATH_OP:
        return getMathOp();
      case InterparameterDependenciesLanguagePackage.OPERATION_CONTINUATION__ADDITIONAL_PARAMS:
        return getAdditionalParams();
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
      case InterparameterDependenciesLanguagePackage.OPERATION_CONTINUATION__MATH_OP:
        setMathOp((String)newValue);
        return;
      case InterparameterDependenciesLanguagePackage.OPERATION_CONTINUATION__ADDITIONAL_PARAMS:
        setAdditionalParams((EObject)newValue);
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
      case InterparameterDependenciesLanguagePackage.OPERATION_CONTINUATION__MATH_OP:
        setMathOp(MATH_OP_EDEFAULT);
        return;
      case InterparameterDependenciesLanguagePackage.OPERATION_CONTINUATION__ADDITIONAL_PARAMS:
        setAdditionalParams((EObject)null);
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
      case InterparameterDependenciesLanguagePackage.OPERATION_CONTINUATION__MATH_OP:
        return MATH_OP_EDEFAULT == null ? mathOp != null : !MATH_OP_EDEFAULT.equals(mathOp);
      case InterparameterDependenciesLanguagePackage.OPERATION_CONTINUATION__ADDITIONAL_PARAMS:
        return additionalParams != null;
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
    result.append(" (mathOp: ");
    result.append(mathOp);
    result.append(')');
    return result.toString();
  }

} //OperationContinuationImpl