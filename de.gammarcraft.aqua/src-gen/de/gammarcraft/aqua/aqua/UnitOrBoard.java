/**
 */
package de.gammarcraft.aqua.aqua;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unit Or Board</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.gammarcraft.aqua.aqua.UnitOrBoard#getPorts <em>Ports</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.gammarcraft.aqua.aqua.AquaPackage#getUnitOrBoard()
 * @model
 * @generated
 */
public interface UnitOrBoard extends Type
{
  /**
   * Returns the value of the '<em><b>Ports</b></em>' containment reference list.
   * The list contents are of type {@link de.gammarcraft.aqua.aqua.PortDeclaration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ports</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ports</em>' containment reference list.
   * @see de.gammarcraft.aqua.aqua.AquaPackage#getUnitOrBoard_Ports()
   * @model containment="true"
   * @generated
   */
  EList<PortDeclaration> getPorts();

} // UnitOrBoard
