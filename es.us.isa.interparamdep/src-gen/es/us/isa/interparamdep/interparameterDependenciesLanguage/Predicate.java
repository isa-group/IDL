/**
 * generated by Xtext 2.19.0
 */
package es.us.isa.interparamdep.interparameterDependenciesLanguage;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Predicate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.us.isa.interparamdep.interparameterDependenciesLanguage.Predicate#getFirstClause <em>First Clause</em>}</li>
 *   <li>{@link es.us.isa.interparamdep.interparameterDependenciesLanguage.Predicate#getClauseContinuation <em>Clause Continuation</em>}</li>
 * </ul>
 *
 * @see es.us.isa.interparamdep.interparameterDependenciesLanguage.InterparameterDependenciesLanguagePackage#getPredicate()
 * @model
 * @generated
 */
public interface Predicate extends EObject
{
  /**
   * Returns the value of the '<em><b>First Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>First Clause</em>' containment reference.
   * @see #setFirstClause(GeneralClause)
   * @see es.us.isa.interparamdep.interparameterDependenciesLanguage.InterparameterDependenciesLanguagePackage#getPredicate_FirstClause()
   * @model containment="true"
   * @generated
   */
  GeneralClause getFirstClause();

  /**
   * Sets the value of the '{@link es.us.isa.interparamdep.interparameterDependenciesLanguage.Predicate#getFirstClause <em>First Clause</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>First Clause</em>' containment reference.
   * @see #getFirstClause()
   * @generated
   */
  void setFirstClause(GeneralClause value);

  /**
   * Returns the value of the '<em><b>Clause Continuation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Clause Continuation</em>' containment reference.
   * @see #setClauseContinuation(GeneralClauseContinuation)
   * @see es.us.isa.interparamdep.interparameterDependenciesLanguage.InterparameterDependenciesLanguagePackage#getPredicate_ClauseContinuation()
   * @model containment="true"
   * @generated
   */
  GeneralClauseContinuation getClauseContinuation();

  /**
   * Sets the value of the '{@link es.us.isa.interparamdep.interparameterDependenciesLanguage.Predicate#getClauseContinuation <em>Clause Continuation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Clause Continuation</em>' containment reference.
   * @see #getClauseContinuation()
   * @generated
   */
  void setClauseContinuation(GeneralClauseContinuation value);

} // Predicate
