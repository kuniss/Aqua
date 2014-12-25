/**
 */
package de.gammarcraft.aqua.aqua.impl;

import de.gammarcraft.aqua.aqua.AquaPackage;
import de.gammarcraft.aqua.aqua.InputPort;
import de.gammarcraft.aqua.aqua.InputProcessingDeclaration;
import de.gammarcraft.aqua.aqua.LocalOutputPort;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.xtext.xbase.XExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Input Processing Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.gammarcraft.aqua.aqua.impl.InputProcessingDeclarationImpl#getInputPort <em>Input Port</em>}</li>
 *   <li>{@link de.gammarcraft.aqua.aqua.impl.InputProcessingDeclarationImpl#getExpr <em>Expr</em>}</li>
 *   <li>{@link de.gammarcraft.aqua.aqua.impl.InputProcessingDeclarationImpl#getOutputPort <em>Output Port</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InputProcessingDeclarationImpl extends DeclarationImpl implements InputProcessingDeclaration
{
  /**
   * The cached value of the '{@link #getInputPort() <em>Input Port</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInputPort()
   * @generated
   * @ordered
   */
  protected InputPort inputPort;

  /**
   * The cached value of the '{@link #getExpr() <em>Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpr()
   * @generated
   * @ordered
   */
  protected XExpression expr;

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
  protected InputProcessingDeclarationImpl()
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
    return AquaPackage.Literals.INPUT_PROCESSING_DECLARATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InputPort getInputPort()
  {
    if (inputPort != null && inputPort.eIsProxy())
    {
      InternalEObject oldInputPort = (InternalEObject)inputPort;
      inputPort = (InputPort)eResolveProxy(oldInputPort);
      if (inputPort != oldInputPort)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AquaPackage.INPUT_PROCESSING_DECLARATION__INPUT_PORT, oldInputPort, inputPort));
      }
    }
    return inputPort;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InputPort basicGetInputPort()
  {
    return inputPort;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInputPort(InputPort newInputPort)
  {
    InputPort oldInputPort = inputPort;
    inputPort = newInputPort;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AquaPackage.INPUT_PROCESSING_DECLARATION__INPUT_PORT, oldInputPort, inputPort));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XExpression getExpr()
  {
    return expr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpr(XExpression newExpr, NotificationChain msgs)
  {
    XExpression oldExpr = expr;
    expr = newExpr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AquaPackage.INPUT_PROCESSING_DECLARATION__EXPR, oldExpr, newExpr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpr(XExpression newExpr)
  {
    if (newExpr != expr)
    {
      NotificationChain msgs = null;
      if (expr != null)
        msgs = ((InternalEObject)expr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AquaPackage.INPUT_PROCESSING_DECLARATION__EXPR, null, msgs);
      if (newExpr != null)
        msgs = ((InternalEObject)newExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AquaPackage.INPUT_PROCESSING_DECLARATION__EXPR, null, msgs);
      msgs = basicSetExpr(newExpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AquaPackage.INPUT_PROCESSING_DECLARATION__EXPR, newExpr, newExpr));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AquaPackage.INPUT_PROCESSING_DECLARATION__OUTPUT_PORT, oldOutputPort, newOutputPort);
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
        msgs = ((InternalEObject)outputPort).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AquaPackage.INPUT_PROCESSING_DECLARATION__OUTPUT_PORT, null, msgs);
      if (newOutputPort != null)
        msgs = ((InternalEObject)newOutputPort).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AquaPackage.INPUT_PROCESSING_DECLARATION__OUTPUT_PORT, null, msgs);
      msgs = basicSetOutputPort(newOutputPort, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AquaPackage.INPUT_PROCESSING_DECLARATION__OUTPUT_PORT, newOutputPort, newOutputPort));
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
      case AquaPackage.INPUT_PROCESSING_DECLARATION__EXPR:
        return basicSetExpr(null, msgs);
      case AquaPackage.INPUT_PROCESSING_DECLARATION__OUTPUT_PORT:
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
      case AquaPackage.INPUT_PROCESSING_DECLARATION__INPUT_PORT:
        if (resolve) return getInputPort();
        return basicGetInputPort();
      case AquaPackage.INPUT_PROCESSING_DECLARATION__EXPR:
        return getExpr();
      case AquaPackage.INPUT_PROCESSING_DECLARATION__OUTPUT_PORT:
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
      case AquaPackage.INPUT_PROCESSING_DECLARATION__INPUT_PORT:
        setInputPort((InputPort)newValue);
        return;
      case AquaPackage.INPUT_PROCESSING_DECLARATION__EXPR:
        setExpr((XExpression)newValue);
        return;
      case AquaPackage.INPUT_PROCESSING_DECLARATION__OUTPUT_PORT:
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
      case AquaPackage.INPUT_PROCESSING_DECLARATION__INPUT_PORT:
        setInputPort((InputPort)null);
        return;
      case AquaPackage.INPUT_PROCESSING_DECLARATION__EXPR:
        setExpr((XExpression)null);
        return;
      case AquaPackage.INPUT_PROCESSING_DECLARATION__OUTPUT_PORT:
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
      case AquaPackage.INPUT_PROCESSING_DECLARATION__INPUT_PORT:
        return inputPort != null;
      case AquaPackage.INPUT_PROCESSING_DECLARATION__EXPR:
        return expr != null;
      case AquaPackage.INPUT_PROCESSING_DECLARATION__OUTPUT_PORT:
        return outputPort != null;
    }
    return super.eIsSet(featureID);
  }

} //InputProcessingDeclarationImpl
