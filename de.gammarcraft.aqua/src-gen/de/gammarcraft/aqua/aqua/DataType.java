/**
 */
package de.gammarcraft.aqua.aqua;

import org.eclipse.emf.common.util.EList;

import org.eclipse.xtext.common.types.JvmParameterizedTypeReference;
import org.eclipse.xtext.common.types.JvmTypeParameter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.gammarcraft.aqua.aqua.DataType#getTypeParameters <em>Type Parameters</em>}</li>
 *   <li>{@link de.gammarcraft.aqua.aqua.DataType#getExtends <em>Extends</em>}</li>
 *   <li>{@link de.gammarcraft.aqua.aqua.DataType#getImplements <em>Implements</em>}</li>
 *   <li>{@link de.gammarcraft.aqua.aqua.DataType#getMembers <em>Members</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.gammarcraft.aqua.aqua.AquaPackage#getDataType()
 * @model
 * @generated
 */
public interface DataType extends Type
{
  /**
   * Returns the value of the '<em><b>Type Parameters</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.xtext.common.types.JvmTypeParameter}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type Parameters</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type Parameters</em>' containment reference list.
   * @see de.gammarcraft.aqua.aqua.AquaPackage#getDataType_TypeParameters()
   * @model containment="true"
   * @generated
   */
  EList<JvmTypeParameter> getTypeParameters();

  /**
   * Returns the value of the '<em><b>Extends</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Extends</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Extends</em>' containment reference.
   * @see #setExtends(JvmParameterizedTypeReference)
   * @see de.gammarcraft.aqua.aqua.AquaPackage#getDataType_Extends()
   * @model containment="true"
   * @generated
   */
  JvmParameterizedTypeReference getExtends();

  /**
   * Sets the value of the '{@link de.gammarcraft.aqua.aqua.DataType#getExtends <em>Extends</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Extends</em>' containment reference.
   * @see #getExtends()
   * @generated
   */
  void setExtends(JvmParameterizedTypeReference value);

  /**
   * Returns the value of the '<em><b>Implements</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.xtext.common.types.JvmParameterizedTypeReference}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Implements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Implements</em>' containment reference list.
   * @see de.gammarcraft.aqua.aqua.AquaPackage#getDataType_Implements()
   * @model containment="true"
   * @generated
   */
  EList<JvmParameterizedTypeReference> getImplements();

  /**
   * Returns the value of the '<em><b>Members</b></em>' containment reference list.
   * The list contents are of type {@link de.gammarcraft.aqua.aqua.Member}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Members</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Members</em>' containment reference list.
   * @see de.gammarcraft.aqua.aqua.AquaPackage#getDataType_Members()
   * @model containment="true"
   * @generated
   */
  EList<Member> getMembers();

} // DataType
