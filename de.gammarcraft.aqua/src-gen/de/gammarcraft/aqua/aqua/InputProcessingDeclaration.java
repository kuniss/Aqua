/**
 */
package de.gammarcraft.aqua.aqua;

import org.eclipse.xtext.xbase.XExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input Processing Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.gammarcraft.aqua.aqua.InputProcessingDeclaration#getInputPort <em>Input Port</em>}</li>
 *   <li>{@link de.gammarcraft.aqua.aqua.InputProcessingDeclaration#getExpr <em>Expr</em>}</li>
 *   <li>{@link de.gammarcraft.aqua.aqua.InputProcessingDeclaration#getOutputPort <em>Output Port</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.gammarcraft.aqua.aqua.AquaPackage#getInputProcessingDeclaration()
 * @model
 * @generated
 */
public interface InputProcessingDeclaration extends Declaration
{
  /**
   * Returns the value of the '<em><b>Input Port</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Input Port</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Input Port</em>' reference.
   * @see #setInputPort(InputPort)
   * @see de.gammarcraft.aqua.aqua.AquaPackage#getInputProcessingDeclaration_InputPort()
   * @model
   * @generated
   */
  InputPort getInputPort();

  /**
   * Sets the value of the '{@link de.gammarcraft.aqua.aqua.InputProcessingDeclaration#getInputPort <em>Input Port</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Input Port</em>' reference.
   * @see #getInputPort()
   * @generated
   */
  void setInputPort(InputPort value);

  /**
   * Returns the value of the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expr</em>' containment reference.
   * @see #setExpr(XExpression)
   * @see de.gammarcraft.aqua.aqua.AquaPackage#getInputProcessingDeclaration_Expr()
   * @model containment="true"
   * @generated
   */
  XExpression getExpr();

  /**
   * Sets the value of the '{@link de.gammarcraft.aqua.aqua.InputProcessingDeclaration#getExpr <em>Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr</em>' containment reference.
   * @see #getExpr()
   * @generated
   */
  void setExpr(XExpression value);

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
   * @see de.gammarcraft.aqua.aqua.AquaPackage#getInputProcessingDeclaration_OutputPort()
   * @model containment="true"
   * @generated
   */
  LocalOutputPort getOutputPort();

  /**
   * Sets the value of the '{@link de.gammarcraft.aqua.aqua.InputProcessingDeclaration#getOutputPort <em>Output Port</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Output Port</em>' containment reference.
   * @see #getOutputPort()
   * @generated
   */
  void setOutputPort(LocalOutputPort value);

} // InputProcessingDeclaration
