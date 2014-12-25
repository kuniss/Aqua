/**
 */
package de.gammarcraft.aqua.aqua.impl;

import de.gammarcraft.aqua.aqua.AquaPackage;
import de.gammarcraft.aqua.aqua.InputPortReference;
import de.gammarcraft.aqua.aqua.IntegratedPort;
import de.gammarcraft.aqua.aqua.Port;
import de.gammarcraft.aqua.aqua.UnitOrBoard;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.xtext.xbase.XExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Integrated Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.gammarcraft.aqua.aqua.impl.IntegratedPortImpl#getClosure <em>Closure</em>}</li>
 *   <li>{@link de.gammarcraft.aqua.aqua.impl.IntegratedPortImpl#getUnit <em>Unit</em>}</li>
 *   <li>{@link de.gammarcraft.aqua.aqua.impl.IntegratedPortImpl#getPort <em>Port</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IntegratedPortImpl extends OutputPortReferenceImpl implements IntegratedPort
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
   * The cached value of the '{@link #getUnit() <em>Unit</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUnit()
   * @generated
   * @ordered
   */
  protected UnitOrBoard unit;

  /**
   * The cached value of the '{@link #getPort() <em>Port</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPort()
   * @generated
   * @ordered
   */
  protected Port port;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IntegratedPortImpl()
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
    return AquaPackage.Literals.INTEGRATED_PORT;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AquaPackage.INTEGRATED_PORT__CLOSURE, oldClosure, newClosure);
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
        msgs = ((InternalEObject)closure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AquaPackage.INTEGRATED_PORT__CLOSURE, null, msgs);
      if (newClosure != null)
        msgs = ((InternalEObject)newClosure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AquaPackage.INTEGRATED_PORT__CLOSURE, null, msgs);
      msgs = basicSetClosure(newClosure, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AquaPackage.INTEGRATED_PORT__CLOSURE, newClosure, newClosure));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnitOrBoard getUnit()
  {
    if (unit != null && unit.eIsProxy())
    {
      InternalEObject oldUnit = (InternalEObject)unit;
      unit = (UnitOrBoard)eResolveProxy(oldUnit);
      if (unit != oldUnit)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AquaPackage.INTEGRATED_PORT__UNIT, oldUnit, unit));
      }
    }
    return unit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnitOrBoard basicGetUnit()
  {
    return unit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUnit(UnitOrBoard newUnit)
  {
    UnitOrBoard oldUnit = unit;
    unit = newUnit;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AquaPackage.INTEGRATED_PORT__UNIT, oldUnit, unit));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Port getPort()
  {
    return port;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPort(Port newPort, NotificationChain msgs)
  {
    Port oldPort = port;
    port = newPort;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AquaPackage.INTEGRATED_PORT__PORT, oldPort, newPort);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPort(Port newPort)
  {
    if (newPort != port)
    {
      NotificationChain msgs = null;
      if (port != null)
        msgs = ((InternalEObject)port).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AquaPackage.INTEGRATED_PORT__PORT, null, msgs);
      if (newPort != null)
        msgs = ((InternalEObject)newPort).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AquaPackage.INTEGRATED_PORT__PORT, null, msgs);
      msgs = basicSetPort(newPort, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AquaPackage.INTEGRATED_PORT__PORT, newPort, newPort));
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
      case AquaPackage.INTEGRATED_PORT__CLOSURE:
        return basicSetClosure(null, msgs);
      case AquaPackage.INTEGRATED_PORT__PORT:
        return basicSetPort(null, msgs);
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
      case AquaPackage.INTEGRATED_PORT__CLOSURE:
        return getClosure();
      case AquaPackage.INTEGRATED_PORT__UNIT:
        if (resolve) return getUnit();
        return basicGetUnit();
      case AquaPackage.INTEGRATED_PORT__PORT:
        return getPort();
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
      case AquaPackage.INTEGRATED_PORT__CLOSURE:
        setClosure((XExpression)newValue);
        return;
      case AquaPackage.INTEGRATED_PORT__UNIT:
        setUnit((UnitOrBoard)newValue);
        return;
      case AquaPackage.INTEGRATED_PORT__PORT:
        setPort((Port)newValue);
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
      case AquaPackage.INTEGRATED_PORT__CLOSURE:
        setClosure((XExpression)null);
        return;
      case AquaPackage.INTEGRATED_PORT__UNIT:
        setUnit((UnitOrBoard)null);
        return;
      case AquaPackage.INTEGRATED_PORT__PORT:
        setPort((Port)null);
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
      case AquaPackage.INTEGRATED_PORT__CLOSURE:
        return closure != null;
      case AquaPackage.INTEGRATED_PORT__UNIT:
        return unit != null;
      case AquaPackage.INTEGRATED_PORT__PORT:
        return port != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
  {
    if (baseClass == InputPortReference.class)
    {
      switch (derivedFeatureID)
      {
        case AquaPackage.INTEGRATED_PORT__CLOSURE: return AquaPackage.INPUT_PORT_REFERENCE__CLOSURE;
        default: return -1;
      }
    }
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
  {
    if (baseClass == InputPortReference.class)
    {
      switch (baseFeatureID)
      {
        case AquaPackage.INPUT_PORT_REFERENCE__CLOSURE: return AquaPackage.INTEGRATED_PORT__CLOSURE;
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }

} //IntegratedPortImpl
