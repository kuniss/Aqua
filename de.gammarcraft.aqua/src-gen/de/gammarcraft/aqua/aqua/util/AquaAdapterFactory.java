/**
 */
package de.gammarcraft.aqua.aqua.util;

import de.gammarcraft.aqua.aqua.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.xtext.xbase.XExpression;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.gammarcraft.aqua.aqua.AquaPackage
 * @generated
 */
public class AquaAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static AquaPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AquaAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = AquaPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AquaSwitch<Adapter> modelSwitch =
    new AquaSwitch<Adapter>()
    {
      @Override
      public Adapter caseAquaModel(AquaModel object)
      {
        return createAquaModelAdapter();
      }
      @Override
      public Adapter casePackageDeclaration(PackageDeclaration object)
      {
        return createPackageDeclarationAdapter();
      }
      @Override
      public Adapter caseType(Type object)
      {
        return createTypeAdapter();
      }
      @Override
      public Adapter caseUnitOrBoard(UnitOrBoard object)
      {
        return createUnitOrBoardAdapter();
      }
      @Override
      public Adapter caseBoard(Board object)
      {
        return createBoardAdapter();
      }
      @Override
      public Adapter casePortDeclaration(PortDeclaration object)
      {
        return createPortDeclarationAdapter();
      }
      @Override
      public Adapter caseInputPort(InputPort object)
      {
        return createInputPortAdapter();
      }
      @Override
      public Adapter caseOutputPort(OutputPort object)
      {
        return createOutputPortAdapter();
      }
      @Override
      public Adapter caseFlow(Flow object)
      {
        return createFlowAdapter();
      }
      @Override
      public Adapter caseOutputPortReference(OutputPortReference object)
      {
        return createOutputPortReferenceAdapter();
      }
      @Override
      public Adapter caseIntegratedPort(IntegratedPort object)
      {
        return createIntegratedPortAdapter();
      }
      @Override
      public Adapter casePort(Port object)
      {
        return createPortAdapter();
      }
      @Override
      public Adapter caseLocalInputPort(LocalInputPort object)
      {
        return createLocalInputPortAdapter();
      }
      @Override
      public Adapter caseInputPortReference(InputPortReference object)
      {
        return createInputPortReferenceAdapter();
      }
      @Override
      public Adapter caseLocalOutputPort(LocalOutputPort object)
      {
        return createLocalOutputPortAdapter();
      }
      @Override
      public Adapter caseUnit(Unit object)
      {
        return createUnitAdapter();
      }
      @Override
      public Adapter caseDeclaration(Declaration object)
      {
        return createDeclarationAdapter();
      }
      @Override
      public Adapter caseConstructor(Constructor object)
      {
        return createConstructorAdapter();
      }
      @Override
      public Adapter caseVariableDeclaration(VariableDeclaration object)
      {
        return createVariableDeclarationAdapter();
      }
      @Override
      public Adapter caseInputProcessingDeclaration(InputProcessingDeclaration object)
      {
        return createInputProcessingDeclarationAdapter();
      }
      @Override
      public Adapter caseMethodDeclaration(MethodDeclaration object)
      {
        return createMethodDeclarationAdapter();
      }
      @Override
      public Adapter caseDataType(DataType object)
      {
        return createDataTypeAdapter();
      }
      @Override
      public Adapter caseMember(Member object)
      {
        return createMemberAdapter();
      }
      @Override
      public Adapter casePropertyDeclaration(PropertyDeclaration object)
      {
        return createPropertyDeclarationAdapter();
      }
      @Override
      public Adapter caseOutputForwarding(OutputForwarding object)
      {
        return createOutputForwardingAdapter();
      }
      @Override
      public Adapter caseXExpression(XExpression object)
      {
        return createXExpressionAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link de.gammarcraft.aqua.aqua.AquaModel <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.gammarcraft.aqua.aqua.AquaModel
   * @generated
   */
  public Adapter createAquaModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.gammarcraft.aqua.aqua.PackageDeclaration <em>Package Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.gammarcraft.aqua.aqua.PackageDeclaration
   * @generated
   */
  public Adapter createPackageDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.gammarcraft.aqua.aqua.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.gammarcraft.aqua.aqua.Type
   * @generated
   */
  public Adapter createTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.gammarcraft.aqua.aqua.UnitOrBoard <em>Unit Or Board</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.gammarcraft.aqua.aqua.UnitOrBoard
   * @generated
   */
  public Adapter createUnitOrBoardAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.gammarcraft.aqua.aqua.Board <em>Board</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.gammarcraft.aqua.aqua.Board
   * @generated
   */
  public Adapter createBoardAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.gammarcraft.aqua.aqua.PortDeclaration <em>Port Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.gammarcraft.aqua.aqua.PortDeclaration
   * @generated
   */
  public Adapter createPortDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.gammarcraft.aqua.aqua.InputPort <em>Input Port</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.gammarcraft.aqua.aqua.InputPort
   * @generated
   */
  public Adapter createInputPortAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.gammarcraft.aqua.aqua.OutputPort <em>Output Port</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.gammarcraft.aqua.aqua.OutputPort
   * @generated
   */
  public Adapter createOutputPortAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.gammarcraft.aqua.aqua.Flow <em>Flow</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.gammarcraft.aqua.aqua.Flow
   * @generated
   */
  public Adapter createFlowAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.gammarcraft.aqua.aqua.OutputPortReference <em>Output Port Reference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.gammarcraft.aqua.aqua.OutputPortReference
   * @generated
   */
  public Adapter createOutputPortReferenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.gammarcraft.aqua.aqua.IntegratedPort <em>Integrated Port</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.gammarcraft.aqua.aqua.IntegratedPort
   * @generated
   */
  public Adapter createIntegratedPortAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.gammarcraft.aqua.aqua.Port <em>Port</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.gammarcraft.aqua.aqua.Port
   * @generated
   */
  public Adapter createPortAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.gammarcraft.aqua.aqua.LocalInputPort <em>Local Input Port</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.gammarcraft.aqua.aqua.LocalInputPort
   * @generated
   */
  public Adapter createLocalInputPortAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.gammarcraft.aqua.aqua.InputPortReference <em>Input Port Reference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.gammarcraft.aqua.aqua.InputPortReference
   * @generated
   */
  public Adapter createInputPortReferenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.gammarcraft.aqua.aqua.LocalOutputPort <em>Local Output Port</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.gammarcraft.aqua.aqua.LocalOutputPort
   * @generated
   */
  public Adapter createLocalOutputPortAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.gammarcraft.aqua.aqua.Unit <em>Unit</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.gammarcraft.aqua.aqua.Unit
   * @generated
   */
  public Adapter createUnitAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.gammarcraft.aqua.aqua.Declaration <em>Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.gammarcraft.aqua.aqua.Declaration
   * @generated
   */
  public Adapter createDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.gammarcraft.aqua.aqua.Constructor <em>Constructor</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.gammarcraft.aqua.aqua.Constructor
   * @generated
   */
  public Adapter createConstructorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.gammarcraft.aqua.aqua.VariableDeclaration <em>Variable Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.gammarcraft.aqua.aqua.VariableDeclaration
   * @generated
   */
  public Adapter createVariableDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.gammarcraft.aqua.aqua.InputProcessingDeclaration <em>Input Processing Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.gammarcraft.aqua.aqua.InputProcessingDeclaration
   * @generated
   */
  public Adapter createInputProcessingDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.gammarcraft.aqua.aqua.MethodDeclaration <em>Method Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.gammarcraft.aqua.aqua.MethodDeclaration
   * @generated
   */
  public Adapter createMethodDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.gammarcraft.aqua.aqua.DataType <em>Data Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.gammarcraft.aqua.aqua.DataType
   * @generated
   */
  public Adapter createDataTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.gammarcraft.aqua.aqua.Member <em>Member</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.gammarcraft.aqua.aqua.Member
   * @generated
   */
  public Adapter createMemberAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.gammarcraft.aqua.aqua.PropertyDeclaration <em>Property Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.gammarcraft.aqua.aqua.PropertyDeclaration
   * @generated
   */
  public Adapter createPropertyDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.gammarcraft.aqua.aqua.OutputForwarding <em>Output Forwarding</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.gammarcraft.aqua.aqua.OutputForwarding
   * @generated
   */
  public Adapter createOutputForwardingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.xtext.xbase.XExpression <em>XExpression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.xtext.xbase.XExpression
   * @generated
   */
  public Adapter createXExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //AquaAdapterFactory
