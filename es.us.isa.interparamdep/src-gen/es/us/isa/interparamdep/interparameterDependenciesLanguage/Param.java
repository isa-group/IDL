/**
 * generated by Xtext 2.19.0
 */
package es.us.isa.interparamdep.interparameterDependenciesLanguage;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Param</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.us.isa.interparamdep.interparameterDependenciesLanguage.Param#getName <em>Name</em>}</li>
 *   <li>{@link es.us.isa.interparamdep.interparameterDependenciesLanguage.Param#getParamValues <em>Param Values</em>}</li>
 * </ul>
 *
 * @see es.us.isa.interparamdep.interparameterDependenciesLanguage.InterparameterDependenciesLanguagePackage#getParam()
 * @model
 * @generated
 */
public interface Param extends Atomic, NegativeAtomic, ParamAssignment, PositiveAtomic
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see es.us.isa.interparamdep.interparameterDependenciesLanguage.InterparameterDependenciesLanguagePackage#getParam_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link es.us.isa.interparamdep.interparameterDependenciesLanguage.Param#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Param Values</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Param Values</em>' attribute list.
   * @see es.us.isa.interparamdep.interparameterDependenciesLanguage.InterparameterDependenciesLanguagePackage#getParam_ParamValues()
   * @model unique="false"
   * @generated
   */
  EList<String> getParamValues();

} // Param
