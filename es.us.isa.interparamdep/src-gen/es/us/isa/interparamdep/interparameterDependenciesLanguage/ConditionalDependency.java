/**
 * generated by Xtext 2.19.0
 */
package es.us.isa.interparamdep.interparameterDependenciesLanguage;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conditional Dependency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.us.isa.interparamdep.interparameterDependenciesLanguage.ConditionalDependency#getCondition <em>Condition</em>}</li>
 *   <li>{@link es.us.isa.interparamdep.interparameterDependenciesLanguage.ConditionalDependency#getConsequence <em>Consequence</em>}</li>
 * </ul>
 *
 * @see es.us.isa.interparamdep.interparameterDependenciesLanguage.InterparameterDependenciesLanguagePackage#getConditionalDependency()
 * @model
 * @generated
 */
public interface ConditionalDependency extends EObject
{
  /**
   * Returns the value of the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Condition</em>' containment reference.
   * @see #setCondition(GeneralPredicate)
   * @see es.us.isa.interparamdep.interparameterDependenciesLanguage.InterparameterDependenciesLanguagePackage#getConditionalDependency_Condition()
   * @model containment="true"
   * @generated
   */
  GeneralPredicate getCondition();

  /**
   * Sets the value of the '{@link es.us.isa.interparamdep.interparameterDependenciesLanguage.ConditionalDependency#getCondition <em>Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Condition</em>' containment reference.
   * @see #getCondition()
   * @generated
   */
  void setCondition(GeneralPredicate value);

  /**
   * Returns the value of the '<em><b>Consequence</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Consequence</em>' containment reference.
   * @see #setConsequence(GeneralPredicate)
   * @see es.us.isa.interparamdep.interparameterDependenciesLanguage.InterparameterDependenciesLanguagePackage#getConditionalDependency_Consequence()
   * @model containment="true"
   * @generated
   */
  GeneralPredicate getConsequence();

  /**
   * Sets the value of the '{@link es.us.isa.interparamdep.interparameterDependenciesLanguage.ConditionalDependency#getConsequence <em>Consequence</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Consequence</em>' containment reference.
   * @see #getConsequence()
   * @generated
   */
  void setConsequence(GeneralPredicate value);

} // ConditionalDependency
