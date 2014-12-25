/**
 */
package de.gammarcraft.aqua.aqua.impl;

import de.gammarcraft.aqua.aqua.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AquaFactoryImpl extends EFactoryImpl implements AquaFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static AquaFactory init()
  {
    try
    {
      AquaFactory theAquaFactory = (AquaFactory)EPackage.Registry.INSTANCE.getEFactory(AquaPackage.eNS_URI);
      if (theAquaFactory != null)
      {
        return theAquaFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new AquaFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AquaFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case AquaPackage.AQUA_MODEL: return createAquaModel();
      case AquaPackage.PACKAGE_DECLARATION: return createPackageDeclaration();
      case AquaPackage.TYPE: return createType();
      case AquaPackage.UNIT_OR_BOARD: return createUnitOrBoard();
      case AquaPackage.BOARD: return createBoard();
      case AquaPackage.PORT_DECLARATION: return createPortDeclaration();
      case AquaPackage.INPUT_PORT: return createInputPort();
      case AquaPackage.OUTPUT_PORT: return createOutputPort();
      case AquaPackage.FLOW: return createFlow();
      case AquaPackage.OUTPUT_PORT_REFERENCE: return createOutputPortReference();
      case AquaPackage.INTEGRATED_PORT: return createIntegratedPort();
      case AquaPackage.PORT: return createPort();
      case AquaPackage.LOCAL_INPUT_PORT: return createLocalInputPort();
      case AquaPackage.INPUT_PORT_REFERENCE: return createInputPortReference();
      case AquaPackage.LOCAL_OUTPUT_PORT: return createLocalOutputPort();
      case AquaPackage.UNIT: return createUnit();
      case AquaPackage.DECLARATION: return createDeclaration();
      case AquaPackage.CONSTRUCTOR: return createConstructor();
      case AquaPackage.VARIABLE_DECLARATION: return createVariableDeclaration();
      case AquaPackage.INPUT_PROCESSING_DECLARATION: return createInputProcessingDeclaration();
      case AquaPackage.METHOD_DECLARATION: return createMethodDeclaration();
      case AquaPackage.DATA_TYPE: return createDataType();
      case AquaPackage.MEMBER: return createMember();
      case AquaPackage.PROPERTY_DECLARATION: return createPropertyDeclaration();
      case AquaPackage.OUTPUT_FORWARDING: return createOutputForwarding();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AquaModel createAquaModel()
  {
    AquaModelImpl aquaModel = new AquaModelImpl();
    return aquaModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PackageDeclaration createPackageDeclaration()
  {
    PackageDeclarationImpl packageDeclaration = new PackageDeclarationImpl();
    return packageDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type createType()
  {
    TypeImpl type = new TypeImpl();
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnitOrBoard createUnitOrBoard()
  {
    UnitOrBoardImpl unitOrBoard = new UnitOrBoardImpl();
    return unitOrBoard;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Board createBoard()
  {
    BoardImpl board = new BoardImpl();
    return board;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PortDeclaration createPortDeclaration()
  {
    PortDeclarationImpl portDeclaration = new PortDeclarationImpl();
    return portDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InputPort createInputPort()
  {
    InputPortImpl inputPort = new InputPortImpl();
    return inputPort;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OutputPort createOutputPort()
  {
    OutputPortImpl outputPort = new OutputPortImpl();
    return outputPort;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Flow createFlow()
  {
    FlowImpl flow = new FlowImpl();
    return flow;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OutputPortReference createOutputPortReference()
  {
    OutputPortReferenceImpl outputPortReference = new OutputPortReferenceImpl();
    return outputPortReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntegratedPort createIntegratedPort()
  {
    IntegratedPortImpl integratedPort = new IntegratedPortImpl();
    return integratedPort;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Port createPort()
  {
    PortImpl port = new PortImpl();
    return port;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LocalInputPort createLocalInputPort()
  {
    LocalInputPortImpl localInputPort = new LocalInputPortImpl();
    return localInputPort;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InputPortReference createInputPortReference()
  {
    InputPortReferenceImpl inputPortReference = new InputPortReferenceImpl();
    return inputPortReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LocalOutputPort createLocalOutputPort()
  {
    LocalOutputPortImpl localOutputPort = new LocalOutputPortImpl();
    return localOutputPort;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Unit createUnit()
  {
    UnitImpl unit = new UnitImpl();
    return unit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Declaration createDeclaration()
  {
    DeclarationImpl declaration = new DeclarationImpl();
    return declaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Constructor createConstructor()
  {
    ConstructorImpl constructor = new ConstructorImpl();
    return constructor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableDeclaration createVariableDeclaration()
  {
    VariableDeclarationImpl variableDeclaration = new VariableDeclarationImpl();
    return variableDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InputProcessingDeclaration createInputProcessingDeclaration()
  {
    InputProcessingDeclarationImpl inputProcessingDeclaration = new InputProcessingDeclarationImpl();
    return inputProcessingDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MethodDeclaration createMethodDeclaration()
  {
    MethodDeclarationImpl methodDeclaration = new MethodDeclarationImpl();
    return methodDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataType createDataType()
  {
    DataTypeImpl dataType = new DataTypeImpl();
    return dataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Member createMember()
  {
    MemberImpl member = new MemberImpl();
    return member;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PropertyDeclaration createPropertyDeclaration()
  {
    PropertyDeclarationImpl propertyDeclaration = new PropertyDeclarationImpl();
    return propertyDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OutputForwarding createOutputForwarding()
  {
    OutputForwardingImpl outputForwarding = new OutputForwardingImpl();
    return outputForwarding;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AquaPackage getAquaPackage()
  {
    return (AquaPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static AquaPackage getPackage()
  {
    return AquaPackage.eINSTANCE;
  }

} //AquaFactoryImpl
