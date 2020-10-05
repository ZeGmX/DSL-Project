/**
 * generated by Xtext 2.23.0
 */
package ml.classification.dSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Column</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ml.classification.dSL.Column#getUse <em>Use</em>}</li>
 *   <li>{@link ml.classification.dSL.Column#getUnuse <em>Unuse</em>}</li>
 *   <li>{@link ml.classification.dSL.Column#getPredict <em>Predict</em>}</li>
 * </ul>
 *
 * @see ml.classification.dSL.DSLPackage#getColumn()
 * @model
 * @generated
 */
public interface Column extends EObject
{
  /**
   * Returns the value of the '<em><b>Use</b></em>' attribute list.
   * The list contents are of type {@link java.lang.Integer}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Use</em>' attribute list.
   * @see ml.classification.dSL.DSLPackage#getColumn_Use()
   * @model unique="false"
   * @generated
   */
  EList<Integer> getUse();

  /**
   * Returns the value of the '<em><b>Unuse</b></em>' attribute list.
   * The list contents are of type {@link java.lang.Integer}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Unuse</em>' attribute list.
   * @see ml.classification.dSL.DSLPackage#getColumn_Unuse()
   * @model unique="false"
   * @generated
   */
  EList<Integer> getUnuse();

  /**
   * Returns the value of the '<em><b>Predict</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Predict</em>' attribute.
   * @see #setPredict(int)
   * @see ml.classification.dSL.DSLPackage#getColumn_Predict()
   * @model
   * @generated
   */
  int getPredict();

  /**
   * Sets the value of the '{@link ml.classification.dSL.Column#getPredict <em>Predict</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Predict</em>' attribute.
   * @see #getPredict()
   * @generated
   */
  void setPredict(int value);

} // Column
