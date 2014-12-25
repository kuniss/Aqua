/**
 */
package de.gammarcraft.aqua.aqua;

import org.eclipse.xtext.xbase.XExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Output Forwarding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.gammarcraft.aqua.aqua.OutputForwarding#getExpression <em>Expression</em>}</li>
 *   <li>{@link de.gammarcraft.aqua.aqua.OutputForwarding#getOutputPort <em>Output Port</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.gammarcraft.aqua.aqua.AquaPackage#getOutputForwarding()
 * @model
 * @generated
 */
public interface OutputForwarding extends XExpression
{
  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference.
   * @see #setExpression(XExpression)
   * @see de.gammarcraft.aqua.aqua.AquaPackage#getOutputForwarding_Expression()
   * @model containment="true"
   * @generated
   */
  XExpression getExpression();

  /**
   * Sets the value of the '{@link de.gammarcraft.aqua.aqua.OutputForwarding#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(XExpression value);

  /**
   * Returns the value of the '<em><b>Output Port</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Output Port</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Output Port</em>' containment reference.
   * @see #setOutputPort(LocalOutputPort)
   * @see de.gammarcraft.aqua.aqua.AquaPackage#getOutputForwarding_OutputPort()
   * @model containment="true"
   * @generated
   */
  LocalOutputPort getOutputPort();

  /**
   * Sets the value of the '{@link de.gammarcraft.aqua.aqua.OutputForwarding#getOutputPort <em>Output Port</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Output Port</em>' containment reference.
   * @see #getOutputPort()
   * @generated
   */
  void setOutputPort(LocalOutputPort value);

} // OutputForwarding
