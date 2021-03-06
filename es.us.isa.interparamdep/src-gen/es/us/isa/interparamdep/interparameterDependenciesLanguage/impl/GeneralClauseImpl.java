/**
 * generated by Xtext 2.19.0
 */
package es.us.isa.interparamdep.interparameterDependenciesLanguage.impl;

import es.us.isa.interparamdep.interparameterDependenciesLanguage.GeneralClause;
import es.us.isa.interparamdep.interparameterDependenciesLanguage.GeneralPredicate;
import es.us.isa.interparamdep.interparameterDependenciesLanguage.InterparameterDependenciesLanguagePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>General Clause</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.us.isa.interparamdep.interparameterDependenciesLanguage.impl.GeneralClauseImpl#getFirstElement <em>First Element</em>}</li>
 *   <li>{@link es.us.isa.interparamdep.interparameterDependenciesLanguage.impl.GeneralClauseImpl#getNot <em>Not</em>}</li>
 *   <li>{@link es.us.isa.interparamdep.interparameterDependenciesLanguage.impl.GeneralClauseImpl#getOpeningParenthesis <em>Opening Parenthesis</em>}</li>
 *   <li>{@link es.us.isa.interparamdep.interparameterDependenciesLanguage.impl.GeneralClauseImpl#getPredicate <em>Predicate</em>}</li>
 *   <li>{@link es.us.isa.interparamdep.interparameterDependenciesLanguage.impl.GeneralClauseImpl#getClosingParenthesis <em>Closing Parenthesis</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GeneralClauseImpl extends MinimalEObjectImpl.Container implements GeneralClause
{
  /**
   * The cached value of the '{@link #getFirstElement() <em>First Element</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFirstElement()
   * @generated
   * @ordered
   */
  protected EObject firstElement;

  /**
   * The default value of the '{@link #getNot() <em>Not</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNot()
   * @generated
   * @ordered
   */
  protected static final String NOT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNot() <em>Not</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNot()
   * @generated
   * @ordered
   */
  protected String not = NOT_EDEFAULT;

  /**
   * The default value of the '{@link #getOpeningParenthesis() <em>Opening Parenthesis</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOpeningParenthesis()
   * @generated
   * @ordered
   */
  protected static final String OPENING_PARENTHESIS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOpeningParenthesis() <em>Opening Parenthesis</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOpeningParenthesis()
   * @generated
   * @ordered
   */
  protected String openingParenthesis = OPENING_PARENTHESIS_EDEFAULT;

  /**
   * The cached value of the '{@link #getPredicate() <em>Predicate</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPredicate()
   * @generated
   * @ordered
   */
  protected GeneralPredicate predicate;

  /**
   * The default value of the '{@link #getClosingParenthesis() <em>Closing Parenthesis</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClosingParenthesis()
   * @generated
   * @ordered
   */
  protected static final String CLOSING_PARENTHESIS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getClosingParenthesis() <em>Closing Parenthesis</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClosingParenthesis()
   * @generated
   * @ordered
   */
  protected String closingParenthesis = CLOSING_PARENTHESIS_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GeneralClauseImpl()
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
    return InterparameterDependenciesLanguagePackage.Literals.GENERAL_CLAUSE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject getFirstElement()
  {
    return firstElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFirstElement(EObject newFirstElement, NotificationChain msgs)
  {
    EObject oldFirstElement = firstElement;
    firstElement = newFirstElement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InterparameterDependenciesLanguagePackage.GENERAL_CLAUSE__FIRST_ELEMENT, oldFirstElement, newFirstElement);
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
  public void setFirstElement(EObject newFirstElement)
  {
    if (newFirstElement != firstElement)
    {
      NotificationChain msgs = null;
      if (firstElement != null)
        msgs = ((InternalEObject)firstElement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InterparameterDependenciesLanguagePackage.GENERAL_CLAUSE__FIRST_ELEMENT, null, msgs);
      if (newFirstElement != null)
        msgs = ((InternalEObject)newFirstElement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InterparameterDependenciesLanguagePackage.GENERAL_CLAUSE__FIRST_ELEMENT, null, msgs);
      msgs = basicSetFirstElement(newFirstElement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, InterparameterDependenciesLanguagePackage.GENERAL_CLAUSE__FIRST_ELEMENT, newFirstElement, newFirstElement));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getNot()
  {
    return not;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setNot(String newNot)
  {
    String oldNot = not;
    not = newNot;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, InterparameterDependenciesLanguagePackage.GENERAL_CLAUSE__NOT, oldNot, not));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getOpeningParenthesis()
  {
    return openingParenthesis;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setOpeningParenthesis(String newOpeningParenthesis)
  {
    String oldOpeningParenthesis = openingParenthesis;
    openingParenthesis = newOpeningParenthesis;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, InterparameterDependenciesLanguagePackage.GENERAL_CLAUSE__OPENING_PARENTHESIS, oldOpeningParenthesis, openingParenthesis));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public GeneralPredicate getPredicate()
  {
    return predicate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPredicate(GeneralPredicate newPredicate, NotificationChain msgs)
  {
    GeneralPredicate oldPredicate = predicate;
    predicate = newPredicate;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InterparameterDependenciesLanguagePackage.GENERAL_CLAUSE__PREDICATE, oldPredicate, newPredicate);
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
  public void setPredicate(GeneralPredicate newPredicate)
  {
    if (newPredicate != predicate)
    {
      NotificationChain msgs = null;
      if (predicate != null)
        msgs = ((InternalEObject)predicate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InterparameterDependenciesLanguagePackage.GENERAL_CLAUSE__PREDICATE, null, msgs);
      if (newPredicate != null)
        msgs = ((InternalEObject)newPredicate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InterparameterDependenciesLanguagePackage.GENERAL_CLAUSE__PREDICATE, null, msgs);
      msgs = basicSetPredicate(newPredicate, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, InterparameterDependenciesLanguagePackage.GENERAL_CLAUSE__PREDICATE, newPredicate, newPredicate));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getClosingParenthesis()
  {
    return closingParenthesis;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setClosingParenthesis(String newClosingParenthesis)
  {
    String oldClosingParenthesis = closingParenthesis;
    closingParenthesis = newClosingParenthesis;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, InterparameterDependenciesLanguagePackage.GENERAL_CLAUSE__CLOSING_PARENTHESIS, oldClosingParenthesis, closingParenthesis));
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
      case InterparameterDependenciesLanguagePackage.GENERAL_CLAUSE__FIRST_ELEMENT:
        return basicSetFirstElement(null, msgs);
      case InterparameterDependenciesLanguagePackage.GENERAL_CLAUSE__PREDICATE:
        return basicSetPredicate(null, msgs);
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
      case InterparameterDependenciesLanguagePackage.GENERAL_CLAUSE__FIRST_ELEMENT:
        return getFirstElement();
      case InterparameterDependenciesLanguagePackage.GENERAL_CLAUSE__NOT:
        return getNot();
      case InterparameterDependenciesLanguagePackage.GENERAL_CLAUSE__OPENING_PARENTHESIS:
        return getOpeningParenthesis();
      case InterparameterDependenciesLanguagePackage.GENERAL_CLAUSE__PREDICATE:
        return getPredicate();
      case InterparameterDependenciesLanguagePackage.GENERAL_CLAUSE__CLOSING_PARENTHESIS:
        return getClosingParenthesis();
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
      case InterparameterDependenciesLanguagePackage.GENERAL_CLAUSE__FIRST_ELEMENT:
        setFirstElement((EObject)newValue);
        return;
      case InterparameterDependenciesLanguagePackage.GENERAL_CLAUSE__NOT:
        setNot((String)newValue);
        return;
      case InterparameterDependenciesLanguagePackage.GENERAL_CLAUSE__OPENING_PARENTHESIS:
        setOpeningParenthesis((String)newValue);
        return;
      case InterparameterDependenciesLanguagePackage.GENERAL_CLAUSE__PREDICATE:
        setPredicate((GeneralPredicate)newValue);
        return;
      case InterparameterDependenciesLanguagePackage.GENERAL_CLAUSE__CLOSING_PARENTHESIS:
        setClosingParenthesis((String)newValue);
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
      case InterparameterDependenciesLanguagePackage.GENERAL_CLAUSE__FIRST_ELEMENT:
        setFirstElement((EObject)null);
        return;
      case InterparameterDependenciesLanguagePackage.GENERAL_CLAUSE__NOT:
        setNot(NOT_EDEFAULT);
        return;
      case InterparameterDependenciesLanguagePackage.GENERAL_CLAUSE__OPENING_PARENTHESIS:
        setOpeningParenthesis(OPENING_PARENTHESIS_EDEFAULT);
        return;
      case InterparameterDependenciesLanguagePackage.GENERAL_CLAUSE__PREDICATE:
        setPredicate((GeneralPredicate)null);
        return;
      case InterparameterDependenciesLanguagePackage.GENERAL_CLAUSE__CLOSING_PARENTHESIS:
        setClosingParenthesis(CLOSING_PARENTHESIS_EDEFAULT);
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
      case InterparameterDependenciesLanguagePackage.GENERAL_CLAUSE__FIRST_ELEMENT:
        return firstElement != null;
      case InterparameterDependenciesLanguagePackage.GENERAL_CLAUSE__NOT:
        return NOT_EDEFAULT == null ? not != null : !NOT_EDEFAULT.equals(not);
      case InterparameterDependenciesLanguagePackage.GENERAL_CLAUSE__OPENING_PARENTHESIS:
        return OPENING_PARENTHESIS_EDEFAULT == null ? openingParenthesis != null : !OPENING_PARENTHESIS_EDEFAULT.equals(openingParenthesis);
      case InterparameterDependenciesLanguagePackage.GENERAL_CLAUSE__PREDICATE:
        return predicate != null;
      case InterparameterDependenciesLanguagePackage.GENERAL_CLAUSE__CLOSING_PARENTHESIS:
        return CLOSING_PARENTHESIS_EDEFAULT == null ? closingParenthesis != null : !CLOSING_PARENTHESIS_EDEFAULT.equals(closingParenthesis);
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
    result.append(" (not: ");
    result.append(not);
    result.append(", openingParenthesis: ");
    result.append(openingParenthesis);
    result.append(", closingParenthesis: ");
    result.append(closingParenthesis);
    result.append(')');
    return result.toString();
  }

} //GeneralClauseImpl
