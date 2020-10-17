/**
 * generated by Xtext 2.23.0
 */
package ml.classification.dSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Strategy choose</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ml.classification.dSL.Strategy_choose#getStrategy <em>Strategy</em>}</li>
 *   <li>{@link ml.classification.dSL.Strategy_choose#getRatio <em>Ratio</em>}</li>
 *   <li>{@link ml.classification.dSL.Strategy_choose#getNb <em>Nb</em>}</li>
 * </ul>
 *
 * @see ml.classification.dSL.DSLPackage#getStrategy_choose()
 * @model
 * @generated
 */
public interface Strategy_choose extends EObject
{
  /**
   * Returns the value of the '<em><b>Strategy</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Strategy</em>' attribute.
   * @see #setStrategy(String)
   * @see ml.classification.dSL.DSLPackage#getStrategy_choose_Strategy()
   * @model
   * @generated
   */
  String getStrategy();

  /**
   * Sets the value of the '{@link ml.classification.dSL.Strategy_choose#getStrategy <em>Strategy</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Strategy</em>' attribute.
   * @see #getStrategy()
   * @generated
   */
  void setStrategy(String value);

  /**
   * Returns the value of the '<em><b>Ratio</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ratio</em>' attribute.
   * @see #setRatio(String)
   * @see ml.classification.dSL.DSLPackage#getStrategy_choose_Ratio()
   * @model
   * @generated
   */
  String getRatio();

  /**
   * Sets the value of the '{@link ml.classification.dSL.Strategy_choose#getRatio <em>Ratio</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ratio</em>' attribute.
   * @see #getRatio()
   * @generated
   */
  void setRatio(String value);

  /**
   * Returns the value of the '<em><b>Nb</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nb</em>' attribute.
   * @see #setNb(int)
   * @see ml.classification.dSL.DSLPackage#getStrategy_choose_Nb()
   * @model
   * @generated
   */
  int getNb();

  /**
   * Sets the value of the '{@link ml.classification.dSL.Strategy_choose#getNb <em>Nb</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nb</em>' attribute.
   * @see #getNb()
   * @generated
   */
  void setNb(int value);

} // Strategy_choose