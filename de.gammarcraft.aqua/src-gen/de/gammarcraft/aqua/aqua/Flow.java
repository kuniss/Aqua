/**
 */
package de.gammarcraft.aqua.aqua;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.gammarcraft.aqua.aqua.Flow#getFrom <em>From</em>}</li>
 *   <li>{@link de.gammarcraft.aqua.aqua.Flow#getTo <em>To</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.gammarcraft.aqua.aqua.AquaPackage#getFlow()
 * @model
 * @generated
 */
public interface Flow extends EObject
{
  /**
   * Returns the value of the '<em><b>From</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>From</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>From</em>' containment reference.
   * @see #setFrom(OutputPortReference)
   * @see de.gammarcraft.aqua.aqua.AquaPackage#getFlow_From()
   * @model containment="true"
   * @generated
   */
  OutputPortReference getFrom();

  /**
   * Sets the value of the '{@link de.gammarcraft.aqua.aqua.Flow#getFrom <em>From</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>From</em>' containment reference.
   * @see #getFrom()
   * @generated
   */
  void setFrom(OutputPortReference value);

  /**
   * Returns the value of the '<em><b>To</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>To</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>To</em>' containment reference.
   * @see #setTo(InputPortReference)
   * @see de.gammarcraft.aqua.aqua.AquaPackage#getFlow_To()
   * @model containment="true"
   * @generated
   */
  InputPortReference getTo();

  /**
   * Sets the value of the '{@link de.gammarcraft.aqua.aqua.Flow#getTo <em>To</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>To</em>' containment reference.
   * @see #getTo()
   * @generated
   */
  void setTo(InputPortReference value);

} // Flow
