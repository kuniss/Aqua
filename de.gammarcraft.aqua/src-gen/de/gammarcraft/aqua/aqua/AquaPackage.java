/**
 */
package de.gammarcraft.aqua.aqua;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.xtext.xbase.XbasePackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.gammarcraft.aqua.aqua.AquaFactory
 * @model kind="package"
 * @generated
 */
public interface AquaPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "aqua";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.gammarcraft.de/aqua/Aqua";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "aqua";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  AquaPackage eINSTANCE = de.gammarcraft.aqua.aqua.impl.AquaPackageImpl.init();

  /**
   * The meta object id for the '{@link de.gammarcraft.aqua.aqua.impl.AquaModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.gammarcraft.aqua.aqua.impl.AquaModelImpl
   * @see de.gammarcraft.aqua.aqua.impl.AquaPackageImpl#getAquaModel()
   * @generated
   */
  int AQUA_MODEL = 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AQUA_MODEL_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link de.gammarcraft.aqua.aqua.impl.PackageDeclarationImpl <em>Package Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.gammarcraft.aqua.aqua.impl.PackageDeclarationImpl
   * @see de.gammarcraft.aqua.aqua.impl.AquaPackageImpl#getPackageDeclaration()
   * @generated
   */
  int PACKAGE_DECLARATION = 1;

  /**
   * The feature id for the '<em><b>Import Section</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_DECLARATION__IMPORT_SECTION = AQUA_MODEL_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_DECLARATION__TYPES = AQUA_MODEL_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_DECLARATION__NAME = AQUA_MODEL_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Package Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_DECLARATION_FEATURE_COUNT = AQUA_MODEL_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link de.gammarcraft.aqua.aqua.impl.TypeImpl <em>Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.gammarcraft.aqua.aqua.impl.TypeImpl
   * @see de.gammarcraft.aqua.aqua.impl.AquaPackageImpl#getType()
   * @generated
   */
  int TYPE = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__NAME = 0;

  /**
   * The number of structural features of the '<em>Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.gammarcraft.aqua.aqua.impl.UnitOrBoardImpl <em>Unit Or Board</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.gammarcraft.aqua.aqua.impl.UnitOrBoardImpl
   * @see de.gammarcraft.aqua.aqua.impl.AquaPackageImpl#getUnitOrBoard()
   * @generated
   */
  int UNIT_OR_BOARD = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNIT_OR_BOARD__NAME = TYPE__NAME;

  /**
   * The feature id for the '<em><b>Ports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNIT_OR_BOARD__PORTS = TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Unit Or Board</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNIT_OR_BOARD_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.gammarcraft.aqua.aqua.impl.BoardImpl <em>Board</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.gammarcraft.aqua.aqua.impl.BoardImpl
   * @see de.gammarcraft.aqua.aqua.impl.AquaPackageImpl#getBoard()
   * @generated
   */
  int BOARD = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOARD__NAME = UNIT_OR_BOARD__NAME;

  /**
   * The feature id for the '<em><b>Ports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOARD__PORTS = UNIT_OR_BOARD__PORTS;

  /**
   * The feature id for the '<em><b>Flows</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOARD__FLOWS = UNIT_OR_BOARD_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Board</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOARD_FEATURE_COUNT = UNIT_OR_BOARD_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.gammarcraft.aqua.aqua.impl.PortDeclarationImpl <em>Port Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.gammarcraft.aqua.aqua.impl.PortDeclarationImpl
   * @see de.gammarcraft.aqua.aqua.impl.AquaPackageImpl#getPortDeclaration()
   * @generated
   */
  int PORT_DECLARATION = 5;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PORT_DECLARATION__TYPE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PORT_DECLARATION__NAME = 1;

  /**
   * The number of structural features of the '<em>Port Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PORT_DECLARATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.gammarcraft.aqua.aqua.impl.InputPortImpl <em>Input Port</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.gammarcraft.aqua.aqua.impl.InputPortImpl
   * @see de.gammarcraft.aqua.aqua.impl.AquaPackageImpl#getInputPort()
   * @generated
   */
  int INPUT_PORT = 6;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_PORT__TYPE = PORT_DECLARATION__TYPE;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_PORT__NAME = PORT_DECLARATION__NAME;

  /**
   * The number of structural features of the '<em>Input Port</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_PORT_FEATURE_COUNT = PORT_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.gammarcraft.aqua.aqua.impl.OutputPortImpl <em>Output Port</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.gammarcraft.aqua.aqua.impl.OutputPortImpl
   * @see de.gammarcraft.aqua.aqua.impl.AquaPackageImpl#getOutputPort()
   * @generated
   */
  int OUTPUT_PORT = 7;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_PORT__TYPE = PORT_DECLARATION__TYPE;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_PORT__NAME = PORT_DECLARATION__NAME;

  /**
   * The feature id for the '<em><b>Error Port</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_PORT__ERROR_PORT = PORT_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Output Port</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_PORT_FEATURE_COUNT = PORT_DECLARATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.gammarcraft.aqua.aqua.impl.FlowImpl <em>Flow</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.gammarcraft.aqua.aqua.impl.FlowImpl
   * @see de.gammarcraft.aqua.aqua.impl.AquaPackageImpl#getFlow()
   * @generated
   */
  int FLOW = 8;

  /**
   * The feature id for the '<em><b>From</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOW__FROM = 0;

  /**
   * The feature id for the '<em><b>To</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOW__TO = 1;

  /**
   * The number of structural features of the '<em>Flow</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOW_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.gammarcraft.aqua.aqua.impl.OutputPortReferenceImpl <em>Output Port Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.gammarcraft.aqua.aqua.impl.OutputPortReferenceImpl
   * @see de.gammarcraft.aqua.aqua.impl.AquaPackageImpl#getOutputPortReference()
   * @generated
   */
  int OUTPUT_PORT_REFERENCE = 9;

  /**
   * The number of structural features of the '<em>Output Port Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_PORT_REFERENCE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link de.gammarcraft.aqua.aqua.impl.IntegratedPortImpl <em>Integrated Port</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.gammarcraft.aqua.aqua.impl.IntegratedPortImpl
   * @see de.gammarcraft.aqua.aqua.impl.AquaPackageImpl#getIntegratedPort()
   * @generated
   */
  int INTEGRATED_PORT = 10;

  /**
   * The feature id for the '<em><b>Closure</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGRATED_PORT__CLOSURE = OUTPUT_PORT_REFERENCE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Unit</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGRATED_PORT__UNIT = OUTPUT_PORT_REFERENCE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Port</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGRATED_PORT__PORT = OUTPUT_PORT_REFERENCE_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Integrated Port</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGRATED_PORT_FEATURE_COUNT = OUTPUT_PORT_REFERENCE_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link de.gammarcraft.aqua.aqua.impl.PortImpl <em>Port</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.gammarcraft.aqua.aqua.impl.PortImpl
   * @see de.gammarcraft.aqua.aqua.impl.AquaPackageImpl#getPort()
   * @generated
   */
  int PORT = 11;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PORT__NAME = 0;

  /**
   * The number of structural features of the '<em>Port</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PORT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.gammarcraft.aqua.aqua.impl.LocalInputPortImpl <em>Local Input Port</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.gammarcraft.aqua.aqua.impl.LocalInputPortImpl
   * @see de.gammarcraft.aqua.aqua.impl.AquaPackageImpl#getLocalInputPort()
   * @generated
   */
  int LOCAL_INPUT_PORT = 12;

  /**
   * The feature id for the '<em><b>Port</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_INPUT_PORT__PORT = OUTPUT_PORT_REFERENCE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Local Input Port</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_INPUT_PORT_FEATURE_COUNT = OUTPUT_PORT_REFERENCE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.gammarcraft.aqua.aqua.impl.InputPortReferenceImpl <em>Input Port Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.gammarcraft.aqua.aqua.impl.InputPortReferenceImpl
   * @see de.gammarcraft.aqua.aqua.impl.AquaPackageImpl#getInputPortReference()
   * @generated
   */
  int INPUT_PORT_REFERENCE = 13;

  /**
   * The feature id for the '<em><b>Closure</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_PORT_REFERENCE__CLOSURE = 0;

  /**
   * The number of structural features of the '<em>Input Port Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_PORT_REFERENCE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.gammarcraft.aqua.aqua.impl.LocalOutputPortImpl <em>Local Output Port</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.gammarcraft.aqua.aqua.impl.LocalOutputPortImpl
   * @see de.gammarcraft.aqua.aqua.impl.AquaPackageImpl#getLocalOutputPort()
   * @generated
   */
  int LOCAL_OUTPUT_PORT = 14;

  /**
   * The feature id for the '<em><b>Closure</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_OUTPUT_PORT__CLOSURE = INPUT_PORT_REFERENCE__CLOSURE;

  /**
   * The feature id for the '<em><b>Port</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_OUTPUT_PORT__PORT = INPUT_PORT_REFERENCE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Local Output Port</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_OUTPUT_PORT_FEATURE_COUNT = INPUT_PORT_REFERENCE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.gammarcraft.aqua.aqua.impl.UnitImpl <em>Unit</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.gammarcraft.aqua.aqua.impl.UnitImpl
   * @see de.gammarcraft.aqua.aqua.impl.AquaPackageImpl#getUnit()
   * @generated
   */
  int UNIT = 15;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNIT__NAME = UNIT_OR_BOARD__NAME;

  /**
   * The feature id for the '<em><b>Ports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNIT__PORTS = UNIT_OR_BOARD__PORTS;

  /**
   * The feature id for the '<em><b>Declarations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNIT__DECLARATIONS = UNIT_OR_BOARD_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Unit</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNIT_FEATURE_COUNT = UNIT_OR_BOARD_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.gammarcraft.aqua.aqua.impl.DeclarationImpl <em>Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.gammarcraft.aqua.aqua.impl.DeclarationImpl
   * @see de.gammarcraft.aqua.aqua.impl.AquaPackageImpl#getDeclaration()
   * @generated
   */
  int DECLARATION = 16;

  /**
   * The number of structural features of the '<em>Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link de.gammarcraft.aqua.aqua.impl.ConstructorImpl <em>Constructor</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.gammarcraft.aqua.aqua.impl.ConstructorImpl
   * @see de.gammarcraft.aqua.aqua.impl.AquaPackageImpl#getConstructor()
   * @generated
   */
  int CONSTRUCTOR = 17;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRUCTOR__PARAMS = DECLARATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRUCTOR__BODY = DECLARATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Constructor</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRUCTOR_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.gammarcraft.aqua.aqua.impl.VariableDeclarationImpl <em>Variable Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.gammarcraft.aqua.aqua.impl.VariableDeclarationImpl
   * @see de.gammarcraft.aqua.aqua.impl.AquaPackageImpl#getVariableDeclaration()
   * @generated
   */
  int VARIABLE_DECLARATION = 18;

  /**
   * The feature id for the '<em><b>Var Decl</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECLARATION__VAR_DECL = DECLARATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Variable Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECLARATION_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.gammarcraft.aqua.aqua.impl.InputProcessingDeclarationImpl <em>Input Processing Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.gammarcraft.aqua.aqua.impl.InputProcessingDeclarationImpl
   * @see de.gammarcraft.aqua.aqua.impl.AquaPackageImpl#getInputProcessingDeclaration()
   * @generated
   */
  int INPUT_PROCESSING_DECLARATION = 19;

  /**
   * The feature id for the '<em><b>Input Port</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_PROCESSING_DECLARATION__INPUT_PORT = DECLARATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_PROCESSING_DECLARATION__EXPR = DECLARATION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Output Port</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_PROCESSING_DECLARATION__OUTPUT_PORT = DECLARATION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Input Processing Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_PROCESSING_DECLARATION_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link de.gammarcraft.aqua.aqua.impl.MethodDeclarationImpl <em>Method Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.gammarcraft.aqua.aqua.impl.MethodDeclarationImpl
   * @see de.gammarcraft.aqua.aqua.impl.AquaPackageImpl#getMethodDeclaration()
   * @generated
   */
  int METHOD_DECLARATION = 20;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_DECLARATION__TYPE = DECLARATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_DECLARATION__NAME = DECLARATION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_DECLARATION__PARAMS = DECLARATION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_DECLARATION__BODY = DECLARATION_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Method Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_DECLARATION_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link de.gammarcraft.aqua.aqua.impl.DataTypeImpl <em>Data Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.gammarcraft.aqua.aqua.impl.DataTypeImpl
   * @see de.gammarcraft.aqua.aqua.impl.AquaPackageImpl#getDataType()
   * @generated
   */
  int DATA_TYPE = 21;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE__NAME = TYPE__NAME;

  /**
   * The feature id for the '<em><b>Type Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE__TYPE_PARAMETERS = TYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Extends</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE__EXTENDS = TYPE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Implements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE__IMPLEMENTS = TYPE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Members</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE__MEMBERS = TYPE_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Data Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link de.gammarcraft.aqua.aqua.impl.MemberImpl <em>Member</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.gammarcraft.aqua.aqua.impl.MemberImpl
   * @see de.gammarcraft.aqua.aqua.impl.AquaPackageImpl#getMember()
   * @generated
   */
  int MEMBER = 22;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEMBER__TYPE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEMBER__NAME = 1;

  /**
   * The number of structural features of the '<em>Member</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEMBER_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.gammarcraft.aqua.aqua.impl.PropertyDeclarationImpl <em>Property Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.gammarcraft.aqua.aqua.impl.PropertyDeclarationImpl
   * @see de.gammarcraft.aqua.aqua.impl.AquaPackageImpl#getPropertyDeclaration()
   * @generated
   */
  int PROPERTY_DECLARATION = 23;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_DECLARATION__TYPE = MEMBER__TYPE;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_DECLARATION__NAME = MEMBER__NAME;

  /**
   * The feature id for the '<em><b>Initial Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_DECLARATION__INITIAL_VALUE = MEMBER_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Property Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_DECLARATION_FEATURE_COUNT = MEMBER_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.gammarcraft.aqua.aqua.impl.OutputForwardingImpl <em>Output Forwarding</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.gammarcraft.aqua.aqua.impl.OutputForwardingImpl
   * @see de.gammarcraft.aqua.aqua.impl.AquaPackageImpl#getOutputForwarding()
   * @generated
   */
  int OUTPUT_FORWARDING = 24;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_FORWARDING__EXPRESSION = XbasePackage.XEXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Output Port</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_FORWARDING__OUTPUT_PORT = XbasePackage.XEXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Output Forwarding</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_FORWARDING_FEATURE_COUNT = XbasePackage.XEXPRESSION_FEATURE_COUNT + 2;


  /**
   * Returns the meta object for class '{@link de.gammarcraft.aqua.aqua.AquaModel <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see de.gammarcraft.aqua.aqua.AquaModel
   * @generated
   */
  EClass getAquaModel();

  /**
   * Returns the meta object for class '{@link de.gammarcraft.aqua.aqua.PackageDeclaration <em>Package Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Package Declaration</em>'.
   * @see de.gammarcraft.aqua.aqua.PackageDeclaration
   * @generated
   */
  EClass getPackageDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link de.gammarcraft.aqua.aqua.PackageDeclaration#getImportSection <em>Import Section</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Import Section</em>'.
   * @see de.gammarcraft.aqua.aqua.PackageDeclaration#getImportSection()
   * @see #getPackageDeclaration()
   * @generated
   */
  EReference getPackageDeclaration_ImportSection();

  /**
   * Returns the meta object for the containment reference list '{@link de.gammarcraft.aqua.aqua.PackageDeclaration#getTypes <em>Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Types</em>'.
   * @see de.gammarcraft.aqua.aqua.PackageDeclaration#getTypes()
   * @see #getPackageDeclaration()
   * @generated
   */
  EReference getPackageDeclaration_Types();

  /**
   * Returns the meta object for the attribute '{@link de.gammarcraft.aqua.aqua.PackageDeclaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.gammarcraft.aqua.aqua.PackageDeclaration#getName()
   * @see #getPackageDeclaration()
   * @generated
   */
  EAttribute getPackageDeclaration_Name();

  /**
   * Returns the meta object for class '{@link de.gammarcraft.aqua.aqua.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type</em>'.
   * @see de.gammarcraft.aqua.aqua.Type
   * @generated
   */
  EClass getType();

  /**
   * Returns the meta object for the attribute '{@link de.gammarcraft.aqua.aqua.Type#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.gammarcraft.aqua.aqua.Type#getName()
   * @see #getType()
   * @generated
   */
  EAttribute getType_Name();

  /**
   * Returns the meta object for class '{@link de.gammarcraft.aqua.aqua.UnitOrBoard <em>Unit Or Board</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Unit Or Board</em>'.
   * @see de.gammarcraft.aqua.aqua.UnitOrBoard
   * @generated
   */
  EClass getUnitOrBoard();

  /**
   * Returns the meta object for the containment reference list '{@link de.gammarcraft.aqua.aqua.UnitOrBoard#getPorts <em>Ports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Ports</em>'.
   * @see de.gammarcraft.aqua.aqua.UnitOrBoard#getPorts()
   * @see #getUnitOrBoard()
   * @generated
   */
  EReference getUnitOrBoard_Ports();

  /**
   * Returns the meta object for class '{@link de.gammarcraft.aqua.aqua.Board <em>Board</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Board</em>'.
   * @see de.gammarcraft.aqua.aqua.Board
   * @generated
   */
  EClass getBoard();

  /**
   * Returns the meta object for the containment reference list '{@link de.gammarcraft.aqua.aqua.Board#getFlows <em>Flows</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Flows</em>'.
   * @see de.gammarcraft.aqua.aqua.Board#getFlows()
   * @see #getBoard()
   * @generated
   */
  EReference getBoard_Flows();

  /**
   * Returns the meta object for class '{@link de.gammarcraft.aqua.aqua.PortDeclaration <em>Port Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Port Declaration</em>'.
   * @see de.gammarcraft.aqua.aqua.PortDeclaration
   * @generated
   */
  EClass getPortDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link de.gammarcraft.aqua.aqua.PortDeclaration#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see de.gammarcraft.aqua.aqua.PortDeclaration#getType()
   * @see #getPortDeclaration()
   * @generated
   */
  EReference getPortDeclaration_Type();

  /**
   * Returns the meta object for the attribute '{@link de.gammarcraft.aqua.aqua.PortDeclaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.gammarcraft.aqua.aqua.PortDeclaration#getName()
   * @see #getPortDeclaration()
   * @generated
   */
  EAttribute getPortDeclaration_Name();

  /**
   * Returns the meta object for class '{@link de.gammarcraft.aqua.aqua.InputPort <em>Input Port</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Input Port</em>'.
   * @see de.gammarcraft.aqua.aqua.InputPort
   * @generated
   */
  EClass getInputPort();

  /**
   * Returns the meta object for class '{@link de.gammarcraft.aqua.aqua.OutputPort <em>Output Port</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Output Port</em>'.
   * @see de.gammarcraft.aqua.aqua.OutputPort
   * @generated
   */
  EClass getOutputPort();

  /**
   * Returns the meta object for the attribute '{@link de.gammarcraft.aqua.aqua.OutputPort#isErrorPort <em>Error Port</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Error Port</em>'.
   * @see de.gammarcraft.aqua.aqua.OutputPort#isErrorPort()
   * @see #getOutputPort()
   * @generated
   */
  EAttribute getOutputPort_ErrorPort();

  /**
   * Returns the meta object for class '{@link de.gammarcraft.aqua.aqua.Flow <em>Flow</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Flow</em>'.
   * @see de.gammarcraft.aqua.aqua.Flow
   * @generated
   */
  EClass getFlow();

  /**
   * Returns the meta object for the containment reference '{@link de.gammarcraft.aqua.aqua.Flow#getFrom <em>From</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>From</em>'.
   * @see de.gammarcraft.aqua.aqua.Flow#getFrom()
   * @see #getFlow()
   * @generated
   */
  EReference getFlow_From();

  /**
   * Returns the meta object for the containment reference '{@link de.gammarcraft.aqua.aqua.Flow#getTo <em>To</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>To</em>'.
   * @see de.gammarcraft.aqua.aqua.Flow#getTo()
   * @see #getFlow()
   * @generated
   */
  EReference getFlow_To();

  /**
   * Returns the meta object for class '{@link de.gammarcraft.aqua.aqua.OutputPortReference <em>Output Port Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Output Port Reference</em>'.
   * @see de.gammarcraft.aqua.aqua.OutputPortReference
   * @generated
   */
  EClass getOutputPortReference();

  /**
   * Returns the meta object for class '{@link de.gammarcraft.aqua.aqua.IntegratedPort <em>Integrated Port</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Integrated Port</em>'.
   * @see de.gammarcraft.aqua.aqua.IntegratedPort
   * @generated
   */
  EClass getIntegratedPort();

  /**
   * Returns the meta object for the reference '{@link de.gammarcraft.aqua.aqua.IntegratedPort#getUnit <em>Unit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Unit</em>'.
   * @see de.gammarcraft.aqua.aqua.IntegratedPort#getUnit()
   * @see #getIntegratedPort()
   * @generated
   */
  EReference getIntegratedPort_Unit();

  /**
   * Returns the meta object for the containment reference '{@link de.gammarcraft.aqua.aqua.IntegratedPort#getPort <em>Port</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Port</em>'.
   * @see de.gammarcraft.aqua.aqua.IntegratedPort#getPort()
   * @see #getIntegratedPort()
   * @generated
   */
  EReference getIntegratedPort_Port();

  /**
   * Returns the meta object for class '{@link de.gammarcraft.aqua.aqua.Port <em>Port</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Port</em>'.
   * @see de.gammarcraft.aqua.aqua.Port
   * @generated
   */
  EClass getPort();

  /**
   * Returns the meta object for the attribute '{@link de.gammarcraft.aqua.aqua.Port#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.gammarcraft.aqua.aqua.Port#getName()
   * @see #getPort()
   * @generated
   */
  EAttribute getPort_Name();

  /**
   * Returns the meta object for class '{@link de.gammarcraft.aqua.aqua.LocalInputPort <em>Local Input Port</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Local Input Port</em>'.
   * @see de.gammarcraft.aqua.aqua.LocalInputPort
   * @generated
   */
  EClass getLocalInputPort();

  /**
   * Returns the meta object for the reference '{@link de.gammarcraft.aqua.aqua.LocalInputPort#getPort <em>Port</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Port</em>'.
   * @see de.gammarcraft.aqua.aqua.LocalInputPort#getPort()
   * @see #getLocalInputPort()
   * @generated
   */
  EReference getLocalInputPort_Port();

  /**
   * Returns the meta object for class '{@link de.gammarcraft.aqua.aqua.InputPortReference <em>Input Port Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Input Port Reference</em>'.
   * @see de.gammarcraft.aqua.aqua.InputPortReference
   * @generated
   */
  EClass getInputPortReference();

  /**
   * Returns the meta object for the containment reference '{@link de.gammarcraft.aqua.aqua.InputPortReference#getClosure <em>Closure</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Closure</em>'.
   * @see de.gammarcraft.aqua.aqua.InputPortReference#getClosure()
   * @see #getInputPortReference()
   * @generated
   */
  EReference getInputPortReference_Closure();

  /**
   * Returns the meta object for class '{@link de.gammarcraft.aqua.aqua.LocalOutputPort <em>Local Output Port</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Local Output Port</em>'.
   * @see de.gammarcraft.aqua.aqua.LocalOutputPort
   * @generated
   */
  EClass getLocalOutputPort();

  /**
   * Returns the meta object for the reference '{@link de.gammarcraft.aqua.aqua.LocalOutputPort#getPort <em>Port</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Port</em>'.
   * @see de.gammarcraft.aqua.aqua.LocalOutputPort#getPort()
   * @see #getLocalOutputPort()
   * @generated
   */
  EReference getLocalOutputPort_Port();

  /**
   * Returns the meta object for class '{@link de.gammarcraft.aqua.aqua.Unit <em>Unit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Unit</em>'.
   * @see de.gammarcraft.aqua.aqua.Unit
   * @generated
   */
  EClass getUnit();

  /**
   * Returns the meta object for the containment reference list '{@link de.gammarcraft.aqua.aqua.Unit#getDeclarations <em>Declarations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Declarations</em>'.
   * @see de.gammarcraft.aqua.aqua.Unit#getDeclarations()
   * @see #getUnit()
   * @generated
   */
  EReference getUnit_Declarations();

  /**
   * Returns the meta object for class '{@link de.gammarcraft.aqua.aqua.Declaration <em>Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Declaration</em>'.
   * @see de.gammarcraft.aqua.aqua.Declaration
   * @generated
   */
  EClass getDeclaration();

  /**
   * Returns the meta object for class '{@link de.gammarcraft.aqua.aqua.Constructor <em>Constructor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Constructor</em>'.
   * @see de.gammarcraft.aqua.aqua.Constructor
   * @generated
   */
  EClass getConstructor();

  /**
   * Returns the meta object for the containment reference list '{@link de.gammarcraft.aqua.aqua.Constructor#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Params</em>'.
   * @see de.gammarcraft.aqua.aqua.Constructor#getParams()
   * @see #getConstructor()
   * @generated
   */
  EReference getConstructor_Params();

  /**
   * Returns the meta object for the containment reference '{@link de.gammarcraft.aqua.aqua.Constructor#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see de.gammarcraft.aqua.aqua.Constructor#getBody()
   * @see #getConstructor()
   * @generated
   */
  EReference getConstructor_Body();

  /**
   * Returns the meta object for class '{@link de.gammarcraft.aqua.aqua.VariableDeclaration <em>Variable Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable Declaration</em>'.
   * @see de.gammarcraft.aqua.aqua.VariableDeclaration
   * @generated
   */
  EClass getVariableDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link de.gammarcraft.aqua.aqua.VariableDeclaration#getVarDecl <em>Var Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Var Decl</em>'.
   * @see de.gammarcraft.aqua.aqua.VariableDeclaration#getVarDecl()
   * @see #getVariableDeclaration()
   * @generated
   */
  EReference getVariableDeclaration_VarDecl();

  /**
   * Returns the meta object for class '{@link de.gammarcraft.aqua.aqua.InputProcessingDeclaration <em>Input Processing Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Input Processing Declaration</em>'.
   * @see de.gammarcraft.aqua.aqua.InputProcessingDeclaration
   * @generated
   */
  EClass getInputProcessingDeclaration();

  /**
   * Returns the meta object for the reference '{@link de.gammarcraft.aqua.aqua.InputProcessingDeclaration#getInputPort <em>Input Port</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Input Port</em>'.
   * @see de.gammarcraft.aqua.aqua.InputProcessingDeclaration#getInputPort()
   * @see #getInputProcessingDeclaration()
   * @generated
   */
  EReference getInputProcessingDeclaration_InputPort();

  /**
   * Returns the meta object for the containment reference '{@link de.gammarcraft.aqua.aqua.InputProcessingDeclaration#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see de.gammarcraft.aqua.aqua.InputProcessingDeclaration#getExpr()
   * @see #getInputProcessingDeclaration()
   * @generated
   */
  EReference getInputProcessingDeclaration_Expr();

  /**
   * Returns the meta object for the containment reference '{@link de.gammarcraft.aqua.aqua.InputProcessingDeclaration#getOutputPort <em>Output Port</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Output Port</em>'.
   * @see de.gammarcraft.aqua.aqua.InputProcessingDeclaration#getOutputPort()
   * @see #getInputProcessingDeclaration()
   * @generated
   */
  EReference getInputProcessingDeclaration_OutputPort();

  /**
   * Returns the meta object for class '{@link de.gammarcraft.aqua.aqua.MethodDeclaration <em>Method Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Method Declaration</em>'.
   * @see de.gammarcraft.aqua.aqua.MethodDeclaration
   * @generated
   */
  EClass getMethodDeclaration();

  /**
   * Returns the meta object for the containment reference list '{@link de.gammarcraft.aqua.aqua.MethodDeclaration#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Params</em>'.
   * @see de.gammarcraft.aqua.aqua.MethodDeclaration#getParams()
   * @see #getMethodDeclaration()
   * @generated
   */
  EReference getMethodDeclaration_Params();

  /**
   * Returns the meta object for the containment reference '{@link de.gammarcraft.aqua.aqua.MethodDeclaration#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see de.gammarcraft.aqua.aqua.MethodDeclaration#getBody()
   * @see #getMethodDeclaration()
   * @generated
   */
  EReference getMethodDeclaration_Body();

  /**
   * Returns the meta object for class '{@link de.gammarcraft.aqua.aqua.DataType <em>Data Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Type</em>'.
   * @see de.gammarcraft.aqua.aqua.DataType
   * @generated
   */
  EClass getDataType();

  /**
   * Returns the meta object for the containment reference list '{@link de.gammarcraft.aqua.aqua.DataType#getTypeParameters <em>Type Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Type Parameters</em>'.
   * @see de.gammarcraft.aqua.aqua.DataType#getTypeParameters()
   * @see #getDataType()
   * @generated
   */
  EReference getDataType_TypeParameters();

  /**
   * Returns the meta object for the containment reference '{@link de.gammarcraft.aqua.aqua.DataType#getExtends <em>Extends</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Extends</em>'.
   * @see de.gammarcraft.aqua.aqua.DataType#getExtends()
   * @see #getDataType()
   * @generated
   */
  EReference getDataType_Extends();

  /**
   * Returns the meta object for the containment reference list '{@link de.gammarcraft.aqua.aqua.DataType#getImplements <em>Implements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Implements</em>'.
   * @see de.gammarcraft.aqua.aqua.DataType#getImplements()
   * @see #getDataType()
   * @generated
   */
  EReference getDataType_Implements();

  /**
   * Returns the meta object for the containment reference list '{@link de.gammarcraft.aqua.aqua.DataType#getMembers <em>Members</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Members</em>'.
   * @see de.gammarcraft.aqua.aqua.DataType#getMembers()
   * @see #getDataType()
   * @generated
   */
  EReference getDataType_Members();

  /**
   * Returns the meta object for class '{@link de.gammarcraft.aqua.aqua.Member <em>Member</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Member</em>'.
   * @see de.gammarcraft.aqua.aqua.Member
   * @generated
   */
  EClass getMember();

  /**
   * Returns the meta object for the containment reference '{@link de.gammarcraft.aqua.aqua.Member#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see de.gammarcraft.aqua.aqua.Member#getType()
   * @see #getMember()
   * @generated
   */
  EReference getMember_Type();

  /**
   * Returns the meta object for the attribute '{@link de.gammarcraft.aqua.aqua.Member#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.gammarcraft.aqua.aqua.Member#getName()
   * @see #getMember()
   * @generated
   */
  EAttribute getMember_Name();

  /**
   * Returns the meta object for class '{@link de.gammarcraft.aqua.aqua.PropertyDeclaration <em>Property Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Property Declaration</em>'.
   * @see de.gammarcraft.aqua.aqua.PropertyDeclaration
   * @generated
   */
  EClass getPropertyDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link de.gammarcraft.aqua.aqua.PropertyDeclaration#getInitialValue <em>Initial Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Initial Value</em>'.
   * @see de.gammarcraft.aqua.aqua.PropertyDeclaration#getInitialValue()
   * @see #getPropertyDeclaration()
   * @generated
   */
  EReference getPropertyDeclaration_InitialValue();

  /**
   * Returns the meta object for class '{@link de.gammarcraft.aqua.aqua.OutputForwarding <em>Output Forwarding</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Output Forwarding</em>'.
   * @see de.gammarcraft.aqua.aqua.OutputForwarding
   * @generated
   */
  EClass getOutputForwarding();

  /**
   * Returns the meta object for the containment reference '{@link de.gammarcraft.aqua.aqua.OutputForwarding#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see de.gammarcraft.aqua.aqua.OutputForwarding#getExpression()
   * @see #getOutputForwarding()
   * @generated
   */
  EReference getOutputForwarding_Expression();

  /**
   * Returns the meta object for the containment reference '{@link de.gammarcraft.aqua.aqua.OutputForwarding#getOutputPort <em>Output Port</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Output Port</em>'.
   * @see de.gammarcraft.aqua.aqua.OutputForwarding#getOutputPort()
   * @see #getOutputForwarding()
   * @generated
   */
  EReference getOutputForwarding_OutputPort();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  AquaFactory getAquaFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link de.gammarcraft.aqua.aqua.impl.AquaModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.gammarcraft.aqua.aqua.impl.AquaModelImpl
     * @see de.gammarcraft.aqua.aqua.impl.AquaPackageImpl#getAquaModel()
     * @generated
     */
    EClass AQUA_MODEL = eINSTANCE.getAquaModel();

    /**
     * The meta object literal for the '{@link de.gammarcraft.aqua.aqua.impl.PackageDeclarationImpl <em>Package Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.gammarcraft.aqua.aqua.impl.PackageDeclarationImpl
     * @see de.gammarcraft.aqua.aqua.impl.AquaPackageImpl#getPackageDeclaration()
     * @generated
     */
    EClass PACKAGE_DECLARATION = eINSTANCE.getPackageDeclaration();

    /**
     * The meta object literal for the '<em><b>Import Section</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PACKAGE_DECLARATION__IMPORT_SECTION = eINSTANCE.getPackageDeclaration_ImportSection();

    /**
     * The meta object literal for the '<em><b>Types</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PACKAGE_DECLARATION__TYPES = eINSTANCE.getPackageDeclaration_Types();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PACKAGE_DECLARATION__NAME = eINSTANCE.getPackageDeclaration_Name();

    /**
     * The meta object literal for the '{@link de.gammarcraft.aqua.aqua.impl.TypeImpl <em>Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.gammarcraft.aqua.aqua.impl.TypeImpl
     * @see de.gammarcraft.aqua.aqua.impl.AquaPackageImpl#getType()
     * @generated
     */
    EClass TYPE = eINSTANCE.getType();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE__NAME = eINSTANCE.getType_Name();

    /**
     * The meta object literal for the '{@link de.gammarcraft.aqua.aqua.impl.UnitOrBoardImpl <em>Unit Or Board</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.gammarcraft.aqua.aqua.impl.UnitOrBoardImpl
     * @see de.gammarcraft.aqua.aqua.impl.AquaPackageImpl#getUnitOrBoard()
     * @generated
     */
    EClass UNIT_OR_BOARD = eINSTANCE.getUnitOrBoard();

    /**
     * The meta object literal for the '<em><b>Ports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UNIT_OR_BOARD__PORTS = eINSTANCE.getUnitOrBoard_Ports();

    /**
     * The meta object literal for the '{@link de.gammarcraft.aqua.aqua.impl.BoardImpl <em>Board</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.gammarcraft.aqua.aqua.impl.BoardImpl
     * @see de.gammarcraft.aqua.aqua.impl.AquaPackageImpl#getBoard()
     * @generated
     */
    EClass BOARD = eINSTANCE.getBoard();

    /**
     * The meta object literal for the '<em><b>Flows</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BOARD__FLOWS = eINSTANCE.getBoard_Flows();

    /**
     * The meta object literal for the '{@link de.gammarcraft.aqua.aqua.impl.PortDeclarationImpl <em>Port Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.gammarcraft.aqua.aqua.impl.PortDeclarationImpl
     * @see de.gammarcraft.aqua.aqua.impl.AquaPackageImpl#getPortDeclaration()
     * @generated
     */
    EClass PORT_DECLARATION = eINSTANCE.getPortDeclaration();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PORT_DECLARATION__TYPE = eINSTANCE.getPortDeclaration_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PORT_DECLARATION__NAME = eINSTANCE.getPortDeclaration_Name();

    /**
     * The meta object literal for the '{@link de.gammarcraft.aqua.aqua.impl.InputPortImpl <em>Input Port</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.gammarcraft.aqua.aqua.impl.InputPortImpl
     * @see de.gammarcraft.aqua.aqua.impl.AquaPackageImpl#getInputPort()
     * @generated
     */
    EClass INPUT_PORT = eINSTANCE.getInputPort();

    /**
     * The meta object literal for the '{@link de.gammarcraft.aqua.aqua.impl.OutputPortImpl <em>Output Port</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.gammarcraft.aqua.aqua.impl.OutputPortImpl
     * @see de.gammarcraft.aqua.aqua.impl.AquaPackageImpl#getOutputPort()
     * @generated
     */
    EClass OUTPUT_PORT = eINSTANCE.getOutputPort();

    /**
     * The meta object literal for the '<em><b>Error Port</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OUTPUT_PORT__ERROR_PORT = eINSTANCE.getOutputPort_ErrorPort();

    /**
     * The meta object literal for the '{@link de.gammarcraft.aqua.aqua.impl.FlowImpl <em>Flow</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.gammarcraft.aqua.aqua.impl.FlowImpl
     * @see de.gammarcraft.aqua.aqua.impl.AquaPackageImpl#getFlow()
     * @generated
     */
    EClass FLOW = eINSTANCE.getFlow();

    /**
     * The meta object literal for the '<em><b>From</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FLOW__FROM = eINSTANCE.getFlow_From();

    /**
     * The meta object literal for the '<em><b>To</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FLOW__TO = eINSTANCE.getFlow_To();

    /**
     * The meta object literal for the '{@link de.gammarcraft.aqua.aqua.impl.OutputPortReferenceImpl <em>Output Port Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.gammarcraft.aqua.aqua.impl.OutputPortReferenceImpl
     * @see de.gammarcraft.aqua.aqua.impl.AquaPackageImpl#getOutputPortReference()
     * @generated
     */
    EClass OUTPUT_PORT_REFERENCE = eINSTANCE.getOutputPortReference();

    /**
     * The meta object literal for the '{@link de.gammarcraft.aqua.aqua.impl.IntegratedPortImpl <em>Integrated Port</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.gammarcraft.aqua.aqua.impl.IntegratedPortImpl
     * @see de.gammarcraft.aqua.aqua.impl.AquaPackageImpl#getIntegratedPort()
     * @generated
     */
    EClass INTEGRATED_PORT = eINSTANCE.getIntegratedPort();

    /**
     * The meta object literal for the '<em><b>Unit</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTEGRATED_PORT__UNIT = eINSTANCE.getIntegratedPort_Unit();

    /**
     * The meta object literal for the '<em><b>Port</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTEGRATED_PORT__PORT = eINSTANCE.getIntegratedPort_Port();

    /**
     * The meta object literal for the '{@link de.gammarcraft.aqua.aqua.impl.PortImpl <em>Port</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.gammarcraft.aqua.aqua.impl.PortImpl
     * @see de.gammarcraft.aqua.aqua.impl.AquaPackageImpl#getPort()
     * @generated
     */
    EClass PORT = eINSTANCE.getPort();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PORT__NAME = eINSTANCE.getPort_Name();

    /**
     * The meta object literal for the '{@link de.gammarcraft.aqua.aqua.impl.LocalInputPortImpl <em>Local Input Port</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.gammarcraft.aqua.aqua.impl.LocalInputPortImpl
     * @see de.gammarcraft.aqua.aqua.impl.AquaPackageImpl#getLocalInputPort()
     * @generated
     */
    EClass LOCAL_INPUT_PORT = eINSTANCE.getLocalInputPort();

    /**
     * The meta object literal for the '<em><b>Port</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOCAL_INPUT_PORT__PORT = eINSTANCE.getLocalInputPort_Port();

    /**
     * The meta object literal for the '{@link de.gammarcraft.aqua.aqua.impl.InputPortReferenceImpl <em>Input Port Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.gammarcraft.aqua.aqua.impl.InputPortReferenceImpl
     * @see de.gammarcraft.aqua.aqua.impl.AquaPackageImpl#getInputPortReference()
     * @generated
     */
    EClass INPUT_PORT_REFERENCE = eINSTANCE.getInputPortReference();

    /**
     * The meta object literal for the '<em><b>Closure</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INPUT_PORT_REFERENCE__CLOSURE = eINSTANCE.getInputPortReference_Closure();

    /**
     * The meta object literal for the '{@link de.gammarcraft.aqua.aqua.impl.LocalOutputPortImpl <em>Local Output Port</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.gammarcraft.aqua.aqua.impl.LocalOutputPortImpl
     * @see de.gammarcraft.aqua.aqua.impl.AquaPackageImpl#getLocalOutputPort()
     * @generated
     */
    EClass LOCAL_OUTPUT_PORT = eINSTANCE.getLocalOutputPort();

    /**
     * The meta object literal for the '<em><b>Port</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOCAL_OUTPUT_PORT__PORT = eINSTANCE.getLocalOutputPort_Port();

    /**
     * The meta object literal for the '{@link de.gammarcraft.aqua.aqua.impl.UnitImpl <em>Unit</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.gammarcraft.aqua.aqua.impl.UnitImpl
     * @see de.gammarcraft.aqua.aqua.impl.AquaPackageImpl#getUnit()
     * @generated
     */
    EClass UNIT = eINSTANCE.getUnit();

    /**
     * The meta object literal for the '<em><b>Declarations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UNIT__DECLARATIONS = eINSTANCE.getUnit_Declarations();

    /**
     * The meta object literal for the '{@link de.gammarcraft.aqua.aqua.impl.DeclarationImpl <em>Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.gammarcraft.aqua.aqua.impl.DeclarationImpl
     * @see de.gammarcraft.aqua.aqua.impl.AquaPackageImpl#getDeclaration()
     * @generated
     */
    EClass DECLARATION = eINSTANCE.getDeclaration();

    /**
     * The meta object literal for the '{@link de.gammarcraft.aqua.aqua.impl.ConstructorImpl <em>Constructor</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.gammarcraft.aqua.aqua.impl.ConstructorImpl
     * @see de.gammarcraft.aqua.aqua.impl.AquaPackageImpl#getConstructor()
     * @generated
     */
    EClass CONSTRUCTOR = eINSTANCE.getConstructor();

    /**
     * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTRUCTOR__PARAMS = eINSTANCE.getConstructor_Params();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTRUCTOR__BODY = eINSTANCE.getConstructor_Body();

    /**
     * The meta object literal for the '{@link de.gammarcraft.aqua.aqua.impl.VariableDeclarationImpl <em>Variable Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.gammarcraft.aqua.aqua.impl.VariableDeclarationImpl
     * @see de.gammarcraft.aqua.aqua.impl.AquaPackageImpl#getVariableDeclaration()
     * @generated
     */
    EClass VARIABLE_DECLARATION = eINSTANCE.getVariableDeclaration();

    /**
     * The meta object literal for the '<em><b>Var Decl</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE_DECLARATION__VAR_DECL = eINSTANCE.getVariableDeclaration_VarDecl();

    /**
     * The meta object literal for the '{@link de.gammarcraft.aqua.aqua.impl.InputProcessingDeclarationImpl <em>Input Processing Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.gammarcraft.aqua.aqua.impl.InputProcessingDeclarationImpl
     * @see de.gammarcraft.aqua.aqua.impl.AquaPackageImpl#getInputProcessingDeclaration()
     * @generated
     */
    EClass INPUT_PROCESSING_DECLARATION = eINSTANCE.getInputProcessingDeclaration();

    /**
     * The meta object literal for the '<em><b>Input Port</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INPUT_PROCESSING_DECLARATION__INPUT_PORT = eINSTANCE.getInputProcessingDeclaration_InputPort();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INPUT_PROCESSING_DECLARATION__EXPR = eINSTANCE.getInputProcessingDeclaration_Expr();

    /**
     * The meta object literal for the '<em><b>Output Port</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INPUT_PROCESSING_DECLARATION__OUTPUT_PORT = eINSTANCE.getInputProcessingDeclaration_OutputPort();

    /**
     * The meta object literal for the '{@link de.gammarcraft.aqua.aqua.impl.MethodDeclarationImpl <em>Method Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.gammarcraft.aqua.aqua.impl.MethodDeclarationImpl
     * @see de.gammarcraft.aqua.aqua.impl.AquaPackageImpl#getMethodDeclaration()
     * @generated
     */
    EClass METHOD_DECLARATION = eINSTANCE.getMethodDeclaration();

    /**
     * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METHOD_DECLARATION__PARAMS = eINSTANCE.getMethodDeclaration_Params();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METHOD_DECLARATION__BODY = eINSTANCE.getMethodDeclaration_Body();

    /**
     * The meta object literal for the '{@link de.gammarcraft.aqua.aqua.impl.DataTypeImpl <em>Data Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.gammarcraft.aqua.aqua.impl.DataTypeImpl
     * @see de.gammarcraft.aqua.aqua.impl.AquaPackageImpl#getDataType()
     * @generated
     */
    EClass DATA_TYPE = eINSTANCE.getDataType();

    /**
     * The meta object literal for the '<em><b>Type Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_TYPE__TYPE_PARAMETERS = eINSTANCE.getDataType_TypeParameters();

    /**
     * The meta object literal for the '<em><b>Extends</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_TYPE__EXTENDS = eINSTANCE.getDataType_Extends();

    /**
     * The meta object literal for the '<em><b>Implements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_TYPE__IMPLEMENTS = eINSTANCE.getDataType_Implements();

    /**
     * The meta object literal for the '<em><b>Members</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_TYPE__MEMBERS = eINSTANCE.getDataType_Members();

    /**
     * The meta object literal for the '{@link de.gammarcraft.aqua.aqua.impl.MemberImpl <em>Member</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.gammarcraft.aqua.aqua.impl.MemberImpl
     * @see de.gammarcraft.aqua.aqua.impl.AquaPackageImpl#getMember()
     * @generated
     */
    EClass MEMBER = eINSTANCE.getMember();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MEMBER__TYPE = eINSTANCE.getMember_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MEMBER__NAME = eINSTANCE.getMember_Name();

    /**
     * The meta object literal for the '{@link de.gammarcraft.aqua.aqua.impl.PropertyDeclarationImpl <em>Property Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.gammarcraft.aqua.aqua.impl.PropertyDeclarationImpl
     * @see de.gammarcraft.aqua.aqua.impl.AquaPackageImpl#getPropertyDeclaration()
     * @generated
     */
    EClass PROPERTY_DECLARATION = eINSTANCE.getPropertyDeclaration();

    /**
     * The meta object literal for the '<em><b>Initial Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROPERTY_DECLARATION__INITIAL_VALUE = eINSTANCE.getPropertyDeclaration_InitialValue();

    /**
     * The meta object literal for the '{@link de.gammarcraft.aqua.aqua.impl.OutputForwardingImpl <em>Output Forwarding</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.gammarcraft.aqua.aqua.impl.OutputForwardingImpl
     * @see de.gammarcraft.aqua.aqua.impl.AquaPackageImpl#getOutputForwarding()
     * @generated
     */
    EClass OUTPUT_FORWARDING = eINSTANCE.getOutputForwarding();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OUTPUT_FORWARDING__EXPRESSION = eINSTANCE.getOutputForwarding_Expression();

    /**
     * The meta object literal for the '<em><b>Output Port</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OUTPUT_FORWARDING__OUTPUT_PORT = eINSTANCE.getOutputForwarding_OutputPort();

  }

} //AquaPackage
