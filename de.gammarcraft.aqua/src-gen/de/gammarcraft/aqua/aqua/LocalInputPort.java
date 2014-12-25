/**
 */
package de.gammarcraft.aqua.aqua;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Local Input Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.gammarcraft.aqua.aqua.LocalInputPort#getPort <em>Port</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.gammarcraft.aqua.aqua.AquaPackage#getLocalInputPort()
 * @model
 * @generated
 */
public interface LocalInputPort extends OutputPortReference
{
  /**
   * Returns the value of the '<em><b>Port</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Port</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Port</em>' reference.
   * @see #setPort(InputPort)
   * @see de.gammarcraft.aqua.aqua.AquaPackage#getLocalInputPort_Port()
   * @model
   * @generated
   */
  InputPort getPort();

  /**
   * Sets the value of the '{@link de.gammarcraft.aqua.aqua.LocalInputPort#getPort <em>Port</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Port</em>' reference.
   * @see #getPort()
   * @generated
   */
  void setPort(InputPort value);

} // LocalInputPort
