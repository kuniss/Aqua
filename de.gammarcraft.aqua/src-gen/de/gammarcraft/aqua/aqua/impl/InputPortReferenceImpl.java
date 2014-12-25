/**
 */
package de.gammarcraft.aqua.aqua.impl;

import de.gammarcraft.aqua.aqua.AquaPackage;
import de.gammarcraft.aqua.aqua.InputPortReference;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.xtext.xbase.XExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Input Port Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.gammarcraft.aqua.aqua.impl.InputPortReferenceImpl#getClosure <em>Closure</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InputPortReferenceImpl extends MinimalEObjectImpl.Container implements InputPortReference
{
  /**
   * The cached value of the '{@link #getClosure() <em>Closure</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClosure()
   * @generated
   * @ordered
   */
  protected XExpression closure;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InputPortReferenceImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return AquaPackage.Literals.INPUT_PORT_REFERENCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XExpression getClosure()
  {
    return closure;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetClosure(XExpression newClosure, NotificationChain msgs)
  {
    XExpression oldClosure = closure;
    closure = newClosure;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AquaPackage.INPUT_PORT_REFERENCE__CLOSURE, oldClosure, newClosure);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setClosure(XExpression newClosure)
  {
    if (newClosure != closure)
    {
      NotificationChain msgs = null;
      if (closure != null)
        msgs = ((InternalEObject)closure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AquaPackage.INPUT_PORT_REFERENCE__CLOSURE, null, msgs);
      if (newClosure != null)
        msgs = ((InternalEObject)newClosure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AquaPackage.INPUT_PORT_REFERENCE__CLOSURE, null, msgs);
      msgs = basicSetClosure(newClosure, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AquaPackage.INPUT_PORT_REFERENCE__CLOSURE, newClosure, newClosure));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case AquaPackage.INPUT_PORT_REFERENCE__CLOSURE:
        return basicSetClosure(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case AquaPackage.INPUT_PORT_REFERENCE__CLOSURE:
        return getClosure();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case AquaPackage.INPUT_PORT_REFERENCE__CLOSURE:
        setClosure((XExpression)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case AquaPackage.INPUT_PORT_REFERENCE__CLOSURE:
        setClosure((XExpression)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case AquaPackage.INPUT_PORT_REFERENCE__CLOSURE:
        return closure != null;
    }
    return super.eIsSet(featureID);
  }

} //InputPortReferenceImpl
