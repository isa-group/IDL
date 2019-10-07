/**
 * generated by Xtext 2.19.0
 */
package es.us.isa.interparamdep.interparameterDependenciesLanguage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>General Predefined Dependency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.us.isa.interparamdep.interparameterDependenciesLanguage.GeneralPredefinedDependency#getNot <em>Not</em>}</li>
 *   <li>{@link es.us.isa.interparamdep.interparameterDependenciesLanguage.GeneralPredefinedDependency#getPredefDepType <em>Predef Dep Type</em>}</li>
 *   <li>{@link es.us.isa.interparamdep.interparameterDependenciesLanguage.GeneralPredefinedDependency#getPredefDepClauses <em>Predef Dep Clauses</em>}</li>
 * </ul>
 *
 * @see es.us.isa.interparamdep.interparameterDependenciesLanguage.InterparameterDependenciesLanguagePackage#getGeneralPredefinedDependency()
 * @model
 * @generated
 */
public interface GeneralPredefinedDependency extends EObject
{
  /**
   * Returns the value of the '<em><b>Not</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Not</em>' attribute.
   * @see #setNot(String)
   * @see es.us.isa.interparamdep.interparameterDependenciesLanguage.InterparameterDependenciesLanguagePackage#getGeneralPredefinedDependency_Not()
   * @model
   * @generated
   */
  String getNot();

  /**
   * Sets the value of the '{@link es.us.isa.interparamdep.interparameterDependenciesLanguage.GeneralPredefinedDependency#getNot <em>Not</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Not</em>' attribute.
   * @see #getNot()
   * @generated
   */
  void setNot(String value);

  /**
   * Returns the value of the '<em><b>Predef Dep Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Predef Dep Type</em>' attribute.
   * @see #setPredefDepType(String)
   * @see es.us.isa.interparamdep.interparameterDependenciesLanguage.InterparameterDependenciesLanguagePackage#getGeneralPredefinedDependency_PredefDepType()
   * @model
   * @generated
   */
  String getPredefDepType();

  /**
   * Sets the value of the '{@link es.us.isa.interparamdep.interparameterDependenciesLanguage.GeneralPredefinedDependency#getPredefDepType <em>Predef Dep Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Predef Dep Type</em>' attribute.
   * @see #getPredefDepType()
   * @generated
   */
  void setPredefDepType(String value);

  /**
   * Returns the value of the '<em><b>Predef Dep Clauses</b></em>' containment reference list.
   * The list contents are of type {@link es.us.isa.interparamdep.interparameterDependenciesLanguage.GeneralClause}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Predef Dep Clauses</em>' containment reference list.
   * @see es.us.isa.interparamdep.interparameterDependenciesLanguage.InterparameterDependenciesLanguagePackage#getGeneralPredefinedDependency_PredefDepClauses()
   * @model containment="true"
   * @generated
   */
  EList<GeneralClause> getPredefDepClauses();

} // GeneralPredefinedDependency
