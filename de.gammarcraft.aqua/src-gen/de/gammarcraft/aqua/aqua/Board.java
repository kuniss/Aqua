/**
 */
package de.gammarcraft.aqua.aqua;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Board</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.gammarcraft.aqua.aqua.Board#getFlows <em>Flows</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.gammarcraft.aqua.aqua.AquaPackage#getBoard()
 * @model
 * @generated
 */
public interface Board extends UnitOrBoard
{
  /**
   * Returns the value of the '<em><b>Flows</b></em>' containment reference list.
   * The list contents are of type {@link de.gammarcraft.aqua.aqua.Flow}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Flows</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Flows</em>' containment reference list.
   * @see de.gammarcraft.aqua.aqua.AquaPackage#getBoard_Flows()
   * @model containment="true"
   * @generated
   */
  EList<Flow> getFlows();

} // Board
