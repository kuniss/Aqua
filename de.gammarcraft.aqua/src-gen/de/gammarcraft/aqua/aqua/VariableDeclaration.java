/**
 */
package de.gammarcraft.aqua.aqua;

import org.eclipse.xtext.xbase.XExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.gammarcraft.aqua.aqua.VariableDeclaration#getVarDecl <em>Var Decl</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.gammarcraft.aqua.aqua.AquaPackage#getVariableDeclaration()
 * @model
 * @generated
 */
public interface VariableDeclaration extends Declaration
{
  /**
   * Returns the value of the '<em><b>Var Decl</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Var Decl</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Var Decl</em>' containment reference.
   * @see #setVarDecl(XExpression)
   * @see de.gammarcraft.aqua.aqua.AquaPackage#getVariableDeclaration_VarDecl()
   * @model containment="true"
   * @generated
   */
  XExpression getVarDecl();

  /**
   * Sets the value of the '{@link de.gammarcraft.aqua.aqua.VariableDeclaration#getVarDecl <em>Var Decl</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Var Decl</em>' containment reference.
   * @see #getVarDecl()
   * @generated
   */
  void setVarDecl(XExpression value);

} // VariableDeclaration
