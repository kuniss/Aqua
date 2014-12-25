/**
 */
package de.gammarcraft.aqua.aqua;

import org.eclipse.xtext.xbase.XExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.gammarcraft.aqua.aqua.PropertyDeclaration#getInitialValue <em>Initial Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.gammarcraft.aqua.aqua.AquaPackage#getPropertyDeclaration()
 * @model
 * @generated
 */
public interface PropertyDeclaration extends Member
{
  /**
   * Returns the value of the '<em><b>Initial Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Initial Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Initial Value</em>' containment reference.
   * @see #setInitialValue(XExpression)
   * @see de.gammarcraft.aqua.aqua.AquaPackage#getPropertyDeclaration_InitialValue()
   * @model containment="true"
   * @generated
   */
  XExpression getInitialValue();

  /**
   * Sets the value of the '{@link de.gammarcraft.aqua.aqua.PropertyDeclaration#getInitialValue <em>Initial Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Initial Value</em>' containment reference.
   * @see #getInitialValue()
   * @generated
   */
  void setInitialValue(XExpression value);

} // PropertyDeclaration
