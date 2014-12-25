/**
 */
package de.gammarcraft.aqua.aqua;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.xtext.xbase.XExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input Port Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.gammarcraft.aqua.aqua.InputPortReference#getClosure <em>Closure</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.gammarcraft.aqua.aqua.AquaPackage#getInputPortReference()
 * @model
 * @generated
 */
public interface InputPortReference extends EObject
{
  /**
   * Returns the value of the '<em><b>Closure</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Closure</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Closure</em>' containment reference.
   * @see #setClosure(XExpression)
   * @see de.gammarcraft.aqua.aqua.AquaPackage#getInputPortReference_Closure()
   * @model containment="true"
   * @generated
   */
  XExpression getClosure();

  /**
   * Sets the value of the '{@link de.gammarcraft.aqua.aqua.InputPortReference#getClosure <em>Closure</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Closure</em>' containment reference.
   * @see #getClosure()
   * @generated
   */
  void setClosure(XExpression value);

} // InputPortReference
