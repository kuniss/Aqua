/**
 */
package de.gammarcraft.aqua.aqua;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Output Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.gammarcraft.aqua.aqua.OutputPort#isErrorPort <em>Error Port</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.gammarcraft.aqua.aqua.AquaPackage#getOutputPort()
 * @model
 * @generated
 */
public interface OutputPort extends PortDeclaration
{
  /**
   * Returns the value of the '<em><b>Error Port</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Error Port</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Error Port</em>' attribute.
   * @see #setErrorPort(boolean)
   * @see de.gammarcraft.aqua.aqua.AquaPackage#getOutputPort_ErrorPort()
   * @model
   * @generated
   */
  boolean isErrorPort();

  /**
   * Sets the value of the '{@link de.gammarcraft.aqua.aqua.OutputPort#isErrorPort <em>Error Port</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Error Port</em>' attribute.
   * @see #isErrorPort()
   * @generated
   */
  void setErrorPort(boolean value);

} // OutputPort
