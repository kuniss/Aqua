/**
 */
package de.gammarcraft.aqua.aqua;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Integrated Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.gammarcraft.aqua.aqua.IntegratedPort#getUnit <em>Unit</em>}</li>
 *   <li>{@link de.gammarcraft.aqua.aqua.IntegratedPort#getPort <em>Port</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.gammarcraft.aqua.aqua.AquaPackage#getIntegratedPort()
 * @model
 * @generated
 */
public interface IntegratedPort extends OutputPortReference, InputPortReference
{
  /**
   * Returns the value of the '<em><b>Unit</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Unit</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Unit</em>' reference.
   * @see #setUnit(UnitOrBoard)
   * @see de.gammarcraft.aqua.aqua.AquaPackage#getIntegratedPort_Unit()
   * @model
   * @generated
   */
  UnitOrBoard getUnit();

  /**
   * Sets the value of the '{@link de.gammarcraft.aqua.aqua.IntegratedPort#getUnit <em>Unit</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Unit</em>' reference.
   * @see #getUnit()
   * @generated
   */
  void setUnit(UnitOrBoard value);

  /**
   * Returns the value of the '<em><b>Port</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Port</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Port</em>' containment reference.
   * @see #setPort(Port)
   * @see de.gammarcraft.aqua.aqua.AquaPackage#getIntegratedPort_Port()
   * @model containment="true"
   * @generated
   */
  Port getPort();

  /**
   * Sets the value of the '{@link de.gammarcraft.aqua.aqua.IntegratedPort#getPort <em>Port</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Port</em>' containment reference.
   * @see #getPort()
   * @generated
   */
  void setPort(Port value);

} // IntegratedPort
