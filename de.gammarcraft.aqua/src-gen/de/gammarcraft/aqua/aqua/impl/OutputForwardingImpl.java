/**
 */
package de.gammarcraft.aqua.aqua.impl;

import de.gammarcraft.aqua.aqua.AquaPackage;
import de.gammarcraft.aqua.aqua.LocalOutputPort;
import de.gammarcraft.aqua.aqua.OutputForwarding;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.xtext.xbase.XExpression;

import org.eclipse.xtext.xbase.impl.XExpressionImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Output Forwarding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.gammarcraft.aqua.aqua.impl.OutputForwardingImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link de.gammarcraft.aqua.aqua.impl.OutputForwardingImpl#getOutputPort <em>Output Port</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OutputForwardingImpl extends XExpressionImpl implements OutputForwarding
{
  /**
   * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpression()
   * @generated
   * @ordered
   */
  protected XExpression expression;

  /**
   * The cached value of the '{@link #getOutputPort() <em>Output Port</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOutputPort()
   * @generated
   * @ordered
   */
  protected LocalOutputPort outputPort;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OutputForwardingImpl()
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
    return AquaPackage.Literals.OUTPUT_FORWARDING;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XExpression getExpression()
  {
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpression(XExpression newExpression, NotificationChain msgs)
  {
    XExpression oldExpression = expression;
    expression = newExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AquaPackage.OUTPUT_FORWARDING__EXPRESSION, oldExpression, newExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpression(XExpression newExpression)
  {
    if (newExpression != expression)
    {
      NotificationChain msgs = null;
      if (expression != null)
        msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AquaPackage.OUTPUT_FORWARDING__EXPRESSION, null, msgs);
      if (newExpression != null)
        msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AquaPackage.OUTPUT_FORWARDING__EXPRESSION, null, msgs);
      msgs = basicSetExpression(newExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AquaPackage.OUTPUT_FORWARDING__EXPRESSION, newExpression, newExpression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LocalOutputPort getOutputPort()
  {
    return outputPort;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOutputPort(LocalOutputPort newOutputPort, NotificationChain msgs)
  {
    LocalOutputPort oldOutputPort = outputPort;
    outputPort = newOutputPort;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AquaPackage.OUTPUT_FORWARDING__OUTPUT_PORT, oldOutputPort, newOutputPort);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOutputPort(LocalOutputPort newOutputPort)
  {
    if (newOutputPort != outputPort)
    {
      NotificationChain msgs = null;
      if (outputPort != null)
        msgs = ((InternalEObject)outputPort).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AquaPackage.OUTPUT_FORWARDING__OUTPUT_PORT, null, msgs);
      if (newOutputPort != null)
        msgs = ((InternalEObject)newOutputPort).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AquaPackage.OUTPUT_FORWARDING__OUTPUT_PORT, null, msgs);
      msgs = basicSetOutputPort(newOutputPort, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AquaPackage.OUTPUT_FORWARDING__OUTPUT_PORT, newOutputPort, newOutputPort));
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
      case AquaPackage.OUTPUT_FORWARDING__EXPRESSION:
        return basicSetExpression(null, msgs);
      case AquaPackage.OUTPUT_FORWARDING__OUTPUT_PORT:
        return basicSetOutputPort(null, msgs);
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
      case AquaPackage.OUTPUT_FORWARDING__EXPRESSION:
        return getExpression();
      case AquaPackage.OUTPUT_FORWARDING__OUTPUT_PORT:
        return getOutputPort();
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
      case AquaPackage.OUTPUT_FORWARDING__EXPRESSION:
        setExpression((XExpression)newValue);
        return;
      case AquaPackage.OUTPUT_FORWARDING__OUTPUT_PORT:
        setOutputPort((LocalOutputPort)newValue);
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
      case AquaPackage.OUTPUT_FORWARDING__EXPRESSION:
        setExpression((XExpression)null);
        return;
      case AquaPackage.OUTPUT_FORWARDING__OUTPUT_PORT:
        setOutputPort((LocalOutputPort)null);
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
      case AquaPackage.OUTPUT_FORWARDING__EXPRESSION:
        return expression != null;
      case AquaPackage.OUTPUT_FORWARDING__OUTPUT_PORT:
        return outputPort != null;
    }
    return super.eIsSet(featureID);
  }

} //OutputForwardingImpl
