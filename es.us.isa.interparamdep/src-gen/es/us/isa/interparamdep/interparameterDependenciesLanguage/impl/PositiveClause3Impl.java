/**
 * generated by Xtext 2.19.0
 */
package es.us.isa.interparamdep.interparameterDependenciesLanguage.impl;

import es.us.isa.interparamdep.interparameterDependenciesLanguage.InterparameterDependenciesLanguagePackage;
import es.us.isa.interparamdep.interparameterDependenciesLanguage.PositiveClause3;
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
 * An implementation of the model object '<em><b>Positive Clause3</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.us.isa.interparamdep.interparameterDependenciesLanguage.impl.PositiveClause3Impl#getPositiveFirstElement <em>Positive First Element</em>}</li>
 *   <li>{@link es.us.isa.interparamdep.interparameterDependenciesLanguage.impl.PositiveClause3Impl#getPositiveClauseContinuation <em>Positive Clause Continuation</em>}</li>
 *   <li>{@link es.us.isa.interparamdep.interparameterDependenciesLanguage.impl.PositiveClause3Impl#getPositiveClauseContinuation2 <em>Positive Clause Continuation2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PositiveClause3Impl extends MinimalEObjectImpl.Container implements PositiveClause3
{
  /**
   * The cached value of the '{@link #getPositiveFirstElement() <em>Positive First Element</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPositiveFirstElement()
   * @generated
   * @ordered
   */
  protected EObject positiveFirstElement;

  /**
   * The cached value of the '{@link #getPositiveClauseContinuation() <em>Positive Clause Continuation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPositiveClauseContinuation()
   * @generated
   * @ordered
   */
  protected PositiveClauseContinuation positiveClauseContinuation;

  /**
   * The cached value of the '{@link #getPositiveClauseContinuation2() <em>Positive Clause Continuation2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPositiveClauseContinuation2()
   * @generated
   * @ordered
   */
  protected PositiveClauseContinuation positiveClauseContinuation2;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PositiveClause3Impl()
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
    return InterparameterDependenciesLanguagePackage.Literals.POSITIVE_CLAUSE3;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject getPositiveFirstElement()
  {
    return positiveFirstElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPositiveFirstElement(EObject newPositiveFirstElement, NotificationChain msgs)
  {
    EObject oldPositiveFirstElement = positiveFirstElement;
    positiveFirstElement = newPositiveFirstElement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InterparameterDependenciesLanguagePackage.POSITIVE_CLAUSE3__POSITIVE_FIRST_ELEMENT, oldPositiveFirstElement, newPositiveFirstElement);
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
  public void setPositiveFirstElement(EObject newPositiveFirstElement)
  {
    if (newPositiveFirstElement != positiveFirstElement)
    {
      NotificationChain msgs = null;
      if (positiveFirstElement != null)
        msgs = ((InternalEObject)positiveFirstElement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InterparameterDependenciesLanguagePackage.POSITIVE_CLAUSE3__POSITIVE_FIRST_ELEMENT, null, msgs);
      if (newPositiveFirstElement != null)
        msgs = ((InternalEObject)newPositiveFirstElement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InterparameterDependenciesLanguagePackage.POSITIVE_CLAUSE3__POSITIVE_FIRST_ELEMENT, null, msgs);
      msgs = basicSetPositiveFirstElement(newPositiveFirstElement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, InterparameterDependenciesLanguagePackage.POSITIVE_CLAUSE3__POSITIVE_FIRST_ELEMENT, newPositiveFirstElement, newPositiveFirstElement));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PositiveClauseContinuation getPositiveClauseContinuation()
  {
    return positiveClauseContinuation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPositiveClauseContinuation(PositiveClauseContinuation newPositiveClauseContinuation, NotificationChain msgs)
  {
    PositiveClauseContinuation oldPositiveClauseContinuation = positiveClauseContinuation;
    positiveClauseContinuation = newPositiveClauseContinuation;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InterparameterDependenciesLanguagePackage.POSITIVE_CLAUSE3__POSITIVE_CLAUSE_CONTINUATION, oldPositiveClauseContinuation, newPositiveClauseContinuation);
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
  public void setPositiveClauseContinuation(PositiveClauseContinuation newPositiveClauseContinuation)
  {
    if (newPositiveClauseContinuation != positiveClauseContinuation)
    {
      NotificationChain msgs = null;
      if (positiveClauseContinuation != null)
        msgs = ((InternalEObject)positiveClauseContinuation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InterparameterDependenciesLanguagePackage.POSITIVE_CLAUSE3__POSITIVE_CLAUSE_CONTINUATION, null, msgs);
      if (newPositiveClauseContinuation != null)
        msgs = ((InternalEObject)newPositiveClauseContinuation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InterparameterDependenciesLanguagePackage.POSITIVE_CLAUSE3__POSITIVE_CLAUSE_CONTINUATION, null, msgs);
      msgs = basicSetPositiveClauseContinuation(newPositiveClauseContinuation, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, InterparameterDependenciesLanguagePackage.POSITIVE_CLAUSE3__POSITIVE_CLAUSE_CONTINUATION, newPositiveClauseContinuation, newPositiveClauseContinuation));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PositiveClauseContinuation getPositiveClauseContinuation2()
  {
    return positiveClauseContinuation2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPositiveClauseContinuation2(PositiveClauseContinuation newPositiveClauseContinuation2, NotificationChain msgs)
  {
    PositiveClauseContinuation oldPositiveClauseContinuation2 = positiveClauseContinuation2;
    positiveClauseContinuation2 = newPositiveClauseContinuation2;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InterparameterDependenciesLanguagePackage.POSITIVE_CLAUSE3__POSITIVE_CLAUSE_CONTINUATION2, oldPositiveClauseContinuation2, newPositiveClauseContinuation2);
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
  public void setPositiveClauseContinuation2(PositiveClauseContinuation newPositiveClauseContinuation2)
  {
    if (newPositiveClauseContinuation2 != positiveClauseContinuation2)
    {
      NotificationChain msgs = null;
      if (positiveClauseContinuation2 != null)
        msgs = ((InternalEObject)positiveClauseContinuation2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InterparameterDependenciesLanguagePackage.POSITIVE_CLAUSE3__POSITIVE_CLAUSE_CONTINUATION2, null, msgs);
      if (newPositiveClauseContinuation2 != null)
        msgs = ((InternalEObject)newPositiveClauseContinuation2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InterparameterDependenciesLanguagePackage.POSITIVE_CLAUSE3__POSITIVE_CLAUSE_CONTINUATION2, null, msgs);
      msgs = basicSetPositiveClauseContinuation2(newPositiveClauseContinuation2, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, InterparameterDependenciesLanguagePackage.POSITIVE_CLAUSE3__POSITIVE_CLAUSE_CONTINUATION2, newPositiveClauseContinuation2, newPositiveClauseContinuation2));
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
      case InterparameterDependenciesLanguagePackage.POSITIVE_CLAUSE3__POSITIVE_FIRST_ELEMENT:
        return basicSetPositiveFirstElement(null, msgs);
      case InterparameterDependenciesLanguagePackage.POSITIVE_CLAUSE3__POSITIVE_CLAUSE_CONTINUATION:
        return basicSetPositiveClauseContinuation(null, msgs);
      case InterparameterDependenciesLanguagePackage.POSITIVE_CLAUSE3__POSITIVE_CLAUSE_CONTINUATION2:
        return basicSetPositiveClauseContinuation2(null, msgs);
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
      case InterparameterDependenciesLanguagePackage.POSITIVE_CLAUSE3__POSITIVE_FIRST_ELEMENT:
        return getPositiveFirstElement();
      case InterparameterDependenciesLanguagePackage.POSITIVE_CLAUSE3__POSITIVE_CLAUSE_CONTINUATION:
        return getPositiveClauseContinuation();
      case InterparameterDependenciesLanguagePackage.POSITIVE_CLAUSE3__POSITIVE_CLAUSE_CONTINUATION2:
        return getPositiveClauseContinuation2();
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
      case InterparameterDependenciesLanguagePackage.POSITIVE_CLAUSE3__POSITIVE_FIRST_ELEMENT:
        setPositiveFirstElement((EObject)newValue);
        return;
      case InterparameterDependenciesLanguagePackage.POSITIVE_CLAUSE3__POSITIVE_CLAUSE_CONTINUATION:
        setPositiveClauseContinuation((PositiveClauseContinuation)newValue);
        return;
      case InterparameterDependenciesLanguagePackage.POSITIVE_CLAUSE3__POSITIVE_CLAUSE_CONTINUATION2:
        setPositiveClauseContinuation2((PositiveClauseContinuation)newValue);
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
      case InterparameterDependenciesLanguagePackage.POSITIVE_CLAUSE3__POSITIVE_FIRST_ELEMENT:
        setPositiveFirstElement((EObject)null);
        return;
      case InterparameterDependenciesLanguagePackage.POSITIVE_CLAUSE3__POSITIVE_CLAUSE_CONTINUATION:
        setPositiveClauseContinuation((PositiveClauseContinuation)null);
        return;
      case InterparameterDependenciesLanguagePackage.POSITIVE_CLAUSE3__POSITIVE_CLAUSE_CONTINUATION2:
        setPositiveClauseContinuation2((PositiveClauseContinuation)null);
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
      case InterparameterDependenciesLanguagePackage.POSITIVE_CLAUSE3__POSITIVE_FIRST_ELEMENT:
        return positiveFirstElement != null;
      case InterparameterDependenciesLanguagePackage.POSITIVE_CLAUSE3__POSITIVE_CLAUSE_CONTINUATION:
        return positiveClauseContinuation != null;
      case InterparameterDependenciesLanguagePackage.POSITIVE_CLAUSE3__POSITIVE_CLAUSE_CONTINUATION2:
        return positiveClauseContinuation2 != null;
    }
    return super.eIsSet(featureID);
  }

} //PositiveClause3Impl
