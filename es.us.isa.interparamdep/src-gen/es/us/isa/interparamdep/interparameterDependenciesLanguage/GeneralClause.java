/**
 * generated by Xtext 2.19.0
 */
package es.us.isa.interparamdep.interparameterDependenciesLanguage;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>General Clause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.us.isa.interparamdep.interparameterDependenciesLanguage.GeneralClause#getFirstElement <em>First Element</em>}</li>
 *   <li>{@link es.us.isa.interparamdep.interparameterDependenciesLanguage.GeneralClause#getNot <em>Not</em>}</li>
 *   <li>{@link es.us.isa.interparamdep.interparameterDependenciesLanguage.GeneralClause#getOpeningParenthesis <em>Opening Parenthesis</em>}</li>
 *   <li>{@link es.us.isa.interparamdep.interparameterDependenciesLanguage.GeneralClause#getPredicate <em>Predicate</em>}</li>
 *   <li>{@link es.us.isa.interparamdep.interparameterDependenciesLanguage.GeneralClause#getClosingParenthesis <em>Closing Parenthesis</em>}</li>
 * </ul>
 *
 * @see es.us.isa.interparamdep.interparameterDependenciesLanguage.InterparameterDependenciesLanguagePackage#getGeneralClause()
 * @model
 * @generated
 */
public interface GeneralClause extends EObject
{
  /**
   * Returns the value of the '<em><b>First Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>First Element</em>' containment reference.
   * @see #setFirstElement(EObject)
   * @see es.us.isa.interparamdep.interparameterDependenciesLanguage.InterparameterDependenciesLanguagePackage#getGeneralClause_FirstElement()
   * @model containment="true"
   * @generated
   */
  EObject getFirstElement();

  /**
   * Sets the value of the '{@link es.us.isa.interparamdep.interparameterDependenciesLanguage.GeneralClause#getFirstElement <em>First Element</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>First Element</em>' containment reference.
   * @see #getFirstElement()
   * @generated
   */
  void setFirstElement(EObject value);

  /**
   * Returns the value of the '<em><b>Not</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Not</em>' attribute.
   * @see #setNot(String)
   * @see es.us.isa.interparamdep.interparameterDependenciesLanguage.InterparameterDependenciesLanguagePackage#getGeneralClause_Not()
   * @model
   * @generated
   */
  String getNot();

  /**
   * Sets the value of the '{@link es.us.isa.interparamdep.interparameterDependenciesLanguage.GeneralClause#getNot <em>Not</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Not</em>' attribute.
   * @see #getNot()
   * @generated
   */
  void setNot(String value);

  /**
   * Returns the value of the '<em><b>Opening Parenthesis</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Opening Parenthesis</em>' attribute.
   * @see #setOpeningParenthesis(String)
   * @see es.us.isa.interparamdep.interparameterDependenciesLanguage.InterparameterDependenciesLanguagePackage#getGeneralClause_OpeningParenthesis()
   * @model
   * @generated
   */
  String getOpeningParenthesis();

  /**
   * Sets the value of the '{@link es.us.isa.interparamdep.interparameterDependenciesLanguage.GeneralClause#getOpeningParenthesis <em>Opening Parenthesis</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Opening Parenthesis</em>' attribute.
   * @see #getOpeningParenthesis()
   * @generated
   */
  void setOpeningParenthesis(String value);

  /**
   * Returns the value of the '<em><b>Predicate</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Predicate</em>' containment reference.
   * @see #setPredicate(GeneralPredicate)
   * @see es.us.isa.interparamdep.interparameterDependenciesLanguage.InterparameterDependenciesLanguagePackage#getGeneralClause_Predicate()
   * @model containment="true"
   * @generated
   */
  GeneralPredicate getPredicate();

  /**
   * Sets the value of the '{@link es.us.isa.interparamdep.interparameterDependenciesLanguage.GeneralClause#getPredicate <em>Predicate</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Predicate</em>' containment reference.
   * @see #getPredicate()
   * @generated
   */
  void setPredicate(GeneralPredicate value);

  /**
   * Returns the value of the '<em><b>Closing Parenthesis</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Closing Parenthesis</em>' attribute.
   * @see #setClosingParenthesis(String)
   * @see es.us.isa.interparamdep.interparameterDependenciesLanguage.InterparameterDependenciesLanguagePackage#getGeneralClause_ClosingParenthesis()
   * @model
   * @generated
   */
  String getClosingParenthesis();

  /**
   * Sets the value of the '{@link es.us.isa.interparamdep.interparameterDependenciesLanguage.GeneralClause#getClosingParenthesis <em>Closing Parenthesis</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Closing Parenthesis</em>' attribute.
   * @see #getClosingParenthesis()
   * @generated
   */
  void setClosingParenthesis(String value);

} // GeneralClause
