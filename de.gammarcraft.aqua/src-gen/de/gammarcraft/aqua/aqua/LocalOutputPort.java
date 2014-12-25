/**
 */
package de.gammarcraft.aqua.aqua;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Local Output Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.gammarcraft.aqua.aqua.LocalOutputPort#getPort <em>Port</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.gammarcraft.aqua.aqua.AquaPackage#getLocalOutputPort()
 * @model
 * @generated
 */
public interface LocalOutputPort extends InputPortReference
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
   * @see #setPort(OutputPort)
   * @see de.gammarcraft.aqua.aqua.AquaPackage#getLocalOutputPort_Port()
   * @model
   * @generated
   */
  OutputPort getPort();

  /**
   * Sets the value of the '{@link de.gammarcraft.aqua.aqua.LocalOutputPort#getPort <em>Port</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Port</em>' reference.
   * @see #getPort()
   * @generated
   */
  void setPort(OutputPort value);

} // LocalOutputPort
