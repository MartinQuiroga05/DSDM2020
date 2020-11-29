/**
 */
package diagramaClasesCompleto;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see diagramaClasesCompleto.DiagramaClasesCompletoFactory
 * @model kind="package"
 * @generated
 */
public interface DiagramaClasesCompletoPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "diagramaClasesCompleto";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/diagramaClasesCompleto";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "diagramaClasesCompleto";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DiagramaClasesCompletoPackage eINSTANCE = diagramaClasesCompleto.impl.DiagramaClasesCompletoPackageImpl.init();

	/**
	 * The meta object id for the '{@link diagramaClasesCompleto.impl.DiagramaClasesImpl <em>Diagrama Clases</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagramaClasesCompleto.impl.DiagramaClasesImpl
	 * @see diagramaClasesCompleto.impl.DiagramaClasesCompletoPackageImpl#getDiagramaClases()
	 * @generated
	 */
	int DIAGRAMA_CLASES = 0;

	/**
	 * The feature id for the '<em><b>Packages contenidos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAMA_CLASES__PACKAGES_CONTENIDOS = 0;

	/**
	 * The feature id for the '<em><b>Artefacto contenido</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAMA_CLASES__ARTEFACTO_CONTENIDO = 1;

	/**
	 * The feature id for the '<em><b>Configuraciondb</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAMA_CLASES__CONFIGURACIONDB = 2;

	/**
	 * The feature id for the '<em><b>Configuraciondocker</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAMA_CLASES__CONFIGURACIONDOCKER = 3;

	/**
	 * The feature id for the '<em><b>Configuracionlenguaje</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAMA_CLASES__CONFIGURACIONLENGUAJE = 4;

	/**
	 * The feature id for the '<em><b>Configuracionmicroservicios</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAMA_CLASES__CONFIGURACIONMICROSERVICIOS = 5;

	/**
	 * The number of structural features of the '<em>Diagrama Clases</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAMA_CLASES_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Diagrama Clases</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAMA_CLASES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link diagramaClasesCompleto.impl.ClasificadorImpl <em>Clasificador</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagramaClasesCompleto.impl.ClasificadorImpl
	 * @see diagramaClasesCompleto.impl.DiagramaClasesCompletoPackageImpl#getClasificador()
	 * @generated
	 */
	int CLASIFICADOR = 1;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASIFICADOR__NOMBRE = 0;

	/**
	 * The feature id for the '<em><b>Atributos contenidos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASIFICADOR__ATRIBUTOS_CONTENIDOS = 1;

	/**
	 * The feature id for the '<em><b>Operaciones contenidas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASIFICADOR__OPERACIONES_CONTENIDAS = 2;

	/**
	 * The feature id for the '<em><b>Herencias contenidas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASIFICADOR__HERENCIAS_CONTENIDAS = 3;

	/**
	 * The number of structural features of the '<em>Clasificador</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASIFICADOR_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Clasificador</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASIFICADOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link diagramaClasesCompleto.impl.ClaseImpl <em>Clase</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagramaClasesCompleto.impl.ClaseImpl
	 * @see diagramaClasesCompleto.impl.DiagramaClasesCompletoPackageImpl#getClase()
	 * @generated
	 */
	int CLASE = 2;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASE__NOMBRE = CLASIFICADOR__NOMBRE;

	/**
	 * The feature id for the '<em><b>Atributos contenidos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASE__ATRIBUTOS_CONTENIDOS = CLASIFICADOR__ATRIBUTOS_CONTENIDOS;

	/**
	 * The feature id for the '<em><b>Operaciones contenidas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASE__OPERACIONES_CONTENIDAS = CLASIFICADOR__OPERACIONES_CONTENIDAS;

	/**
	 * The feature id for the '<em><b>Herencias contenidas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASE__HERENCIAS_CONTENIDAS = CLASIFICADOR__HERENCIAS_CONTENIDAS;

	/**
	 * The feature id for the '<em><b>Relaciones contenidas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASE__RELACIONES_CONTENIDAS = CLASIFICADOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Es Abstracta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASE__ES_ABSTRACTA = CLASIFICADOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Realizaciones contenidas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASE__REALIZACIONES_CONTENIDAS = CLASIFICADOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Es Asociativa</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASE__ES_ASOCIATIVA = CLASIFICADOR_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Es Auditable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASE__ES_AUDITABLE = CLASIFICADOR_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Tiene ABM</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASE__TIENE_ABM = CLASIFICADOR_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Clase</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASE_FEATURE_COUNT = CLASIFICADOR_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Clase</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASE_OPERATION_COUNT = CLASIFICADOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link diagramaClasesCompleto.impl.InterfaceImpl <em>Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagramaClasesCompleto.impl.InterfaceImpl
	 * @see diagramaClasesCompleto.impl.DiagramaClasesCompletoPackageImpl#getInterface()
	 * @generated
	 */
	int INTERFACE = 3;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__NOMBRE = CLASIFICADOR__NOMBRE;

	/**
	 * The feature id for the '<em><b>Atributos contenidos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__ATRIBUTOS_CONTENIDOS = CLASIFICADOR__ATRIBUTOS_CONTENIDOS;

	/**
	 * The feature id for the '<em><b>Operaciones contenidas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__OPERACIONES_CONTENIDAS = CLASIFICADOR__OPERACIONES_CONTENIDAS;

	/**
	 * The feature id for the '<em><b>Herencias contenidas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__HERENCIAS_CONTENIDAS = CLASIFICADOR__HERENCIAS_CONTENIDAS;

	/**
	 * The number of structural features of the '<em>Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FEATURE_COUNT = CLASIFICADOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_OPERATION_COUNT = CLASIFICADOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link diagramaClasesCompleto.impl.RelacionImpl <em>Relacion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagramaClasesCompleto.impl.RelacionImpl
	 * @see diagramaClasesCompleto.impl.DiagramaClasesCompletoPackageImpl#getRelacion()
	 * @generated
	 */
	int RELACION = 4;

	/**
	 * The feature id for the '<em><b>Destino</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELACION__DESTINO = 0;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELACION__NOMBRE = 1;

	/**
	 * The feature id for the '<em><b>Tipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELACION__TIPO = 2;

	/**
	 * The feature id for the '<em><b>Multiplicidad</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELACION__MULTIPLICIDAD = 3;

	/**
	 * The feature id for the '<em><b>Origen</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELACION__ORIGEN = 4;

	/**
	 * The feature id for the '<em><b>Clases asociativas contenidas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELACION__CLASES_ASOCIATIVAS_CONTENIDAS = 5;

	/**
	 * The feature id for the '<em><b>Es Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELACION__ES_FINAL = 6;

	/**
	 * The feature id for the '<em><b>Es Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELACION__ES_STATIC = 7;

	/**
	 * The feature id for the '<em><b>Visibilidad</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELACION__VISIBILIDAD = 8;

	/**
	 * The feature id for the '<em><b>Tipo ABM</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELACION__TIPO_ABM = 9;

	/**
	 * The number of structural features of the '<em>Relacion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELACION_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Relacion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELACION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link diagramaClasesCompleto.impl.RetornableImpl <em>Retornable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagramaClasesCompleto.impl.RetornableImpl
	 * @see diagramaClasesCompleto.impl.DiagramaClasesCompletoPackageImpl#getRetornable()
	 * @generated
	 */
	int RETORNABLE = 11;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETORNABLE__NOMBRE = 0;

	/**
	 * The feature id for the '<em><b>Visibilidad</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETORNABLE__VISIBILIDAD = 1;

	/**
	 * The feature id for the '<em><b>Es Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETORNABLE__ES_FINAL = 2;

	/**
	 * The feature id for the '<em><b>Es Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETORNABLE__ES_STATIC = 3;

	/**
	 * The number of structural features of the '<em>Retornable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETORNABLE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Retornable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETORNABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link diagramaClasesCompleto.impl.OperacionImpl <em>Operacion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagramaClasesCompleto.impl.OperacionImpl
	 * @see diagramaClasesCompleto.impl.DiagramaClasesCompletoPackageImpl#getOperacion()
	 * @generated
	 */
	int OPERACION = 5;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERACION__NOMBRE = RETORNABLE__NOMBRE;

	/**
	 * The feature id for the '<em><b>Visibilidad</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERACION__VISIBILIDAD = RETORNABLE__VISIBILIDAD;

	/**
	 * The feature id for the '<em><b>Es Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERACION__ES_FINAL = RETORNABLE__ES_FINAL;

	/**
	 * The feature id for the '<em><b>Es Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERACION__ES_STATIC = RETORNABLE__ES_STATIC;

	/**
	 * The feature id for the '<em><b>Tipo Retorno</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERACION__TIPO_RETORNO = RETORNABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Es Abstracta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERACION__ES_ABSTRACTA = RETORNABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parametros contenidos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERACION__PARAMETROS_CONTENIDOS = RETORNABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Endpoint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERACION__ENDPOINT = RETORNABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Parametros internos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERACION__PARAMETROS_INTERNOS = RETORNABLE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Operacion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERACION_FEATURE_COUNT = RETORNABLE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Operacion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERACION_OPERATION_COUNT = RETORNABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link diagramaClasesCompleto.impl.AtributoImpl <em>Atributo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagramaClasesCompleto.impl.AtributoImpl
	 * @see diagramaClasesCompleto.impl.DiagramaClasesCompletoPackageImpl#getAtributo()
	 * @generated
	 */
	int ATRIBUTO = 6;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO__NOMBRE = RETORNABLE__NOMBRE;

	/**
	 * The feature id for the '<em><b>Visibilidad</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO__VISIBILIDAD = RETORNABLE__VISIBILIDAD;

	/**
	 * The feature id for the '<em><b>Es Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO__ES_FINAL = RETORNABLE__ES_FINAL;

	/**
	 * The feature id for the '<em><b>Es Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO__ES_STATIC = RETORNABLE__ES_STATIC;

	/**
	 * The feature id for the '<em><b>Tipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO__TIPO = RETORNABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Es Auditable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO__ES_AUDITABLE = RETORNABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Pseudonimo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO__PSEUDONIMO = RETORNABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Representacion Grafica</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO__REPRESENTACION_GRAFICA = RETORNABLE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Atributo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO_FEATURE_COUNT = RETORNABLE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Atributo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO_OPERATION_COUNT = RETORNABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link diagramaClasesCompleto.impl.PackageImpl <em>Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagramaClasesCompleto.impl.PackageImpl
	 * @see diagramaClasesCompleto.impl.DiagramaClasesCompletoPackageImpl#getPackage()
	 * @generated
	 */
	int PACKAGE = 7;

	/**
	 * The feature id for the '<em><b>Clasificadores contenidos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__CLASIFICADORES_CONTENIDOS = 0;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__NOMBRE = 1;

	/**
	 * The number of structural features of the '<em>Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link diagramaClasesCompleto.impl.HerenciaImpl <em>Herencia</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagramaClasesCompleto.impl.HerenciaImpl
	 * @see diagramaClasesCompleto.impl.DiagramaClasesCompletoPackageImpl#getHerencia()
	 * @generated
	 */
	int HERENCIA = 8;

	/**
	 * The feature id for the '<em><b>Origen</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HERENCIA__ORIGEN = 0;

	/**
	 * The feature id for the '<em><b>Destino</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HERENCIA__DESTINO = 1;

	/**
	 * The number of structural features of the '<em>Herencia</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HERENCIA_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Herencia</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HERENCIA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link diagramaClasesCompleto.impl.RealizacionImpl <em>Realizacion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagramaClasesCompleto.impl.RealizacionImpl
	 * @see diagramaClasesCompleto.impl.DiagramaClasesCompletoPackageImpl#getRealizacion()
	 * @generated
	 */
	int REALIZACION = 9;

	/**
	 * The feature id for the '<em><b>Destino</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALIZACION__DESTINO = 0;

	/**
	 * The feature id for the '<em><b>Origen</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALIZACION__ORIGEN = 1;

	/**
	 * The number of structural features of the '<em>Realizacion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALIZACION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Realizacion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALIZACION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link diagramaClasesCompleto.impl.ArtefactoImpl <em>Artefacto</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagramaClasesCompleto.impl.ArtefactoImpl
	 * @see diagramaClasesCompleto.impl.DiagramaClasesCompletoPackageImpl#getArtefacto()
	 * @generated
	 */
	int ARTEFACTO = 10;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTEFACTO__NOMBRE = 0;

	/**
	 * The feature id for the '<em><b>Grupo Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTEFACTO__GRUPO_ID = 1;

	/**
	 * The feature id for the '<em><b>Artefactot Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTEFACTO__ARTEFACTOT_ID = 2;

	/**
	 * The feature id for the '<em><b>Descripcion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTEFACTO__DESCRIPCION = 3;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTEFACTO__VERSION = 4;

	/**
	 * The number of structural features of the '<em>Artefacto</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTEFACTO_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Artefacto</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTEFACTO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link diagramaClasesCompleto.impl.EndPointImpl <em>End Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagramaClasesCompleto.impl.EndPointImpl
	 * @see diagramaClasesCompleto.impl.DiagramaClasesCompletoPackageImpl#getEndPoint()
	 * @generated
	 */
	int END_POINT = 12;

	/**
	 * The feature id for the '<em><b>Tipo Verdo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_POINT__TIPO_VERDO = 0;

	/**
	 * The feature id for the '<em><b>Tipo Transferencia Entrada</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_POINT__TIPO_TRANSFERENCIA_ENTRADA = 1;

	/**
	 * The feature id for the '<em><b>Tipo Transferencia Salida</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_POINT__TIPO_TRANSFERENCIA_SALIDA = 2;

	/**
	 * The feature id for the '<em><b>Nombre Publicado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_POINT__NOMBRE_PUBLICADO = 3;

	/**
	 * The number of structural features of the '<em>End Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_POINT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>End Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_POINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link diagramaClasesCompleto.impl.ConfiguracionDBImpl <em>Configuracion DB</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagramaClasesCompleto.impl.ConfiguracionDBImpl
	 * @see diagramaClasesCompleto.impl.DiagramaClasesCompletoPackageImpl#getConfiguracionDB()
	 * @generated
	 */
	int CONFIGURACION_DB = 13;

	/**
	 * The feature id for the '<em><b>Db Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURACION_DB__DB_NOMBRE = 0;

	/**
	 * The feature id for the '<em><b>Db Usuario</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURACION_DB__DB_USUARIO = 1;

	/**
	 * The feature id for the '<em><b>Db Puerto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURACION_DB__DB_PUERTO = 2;

	/**
	 * The feature id for the '<em><b>Ip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURACION_DB__IP = 3;

	/**
	 * The feature id for the '<em><b>Db Contrasena</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURACION_DB__DB_CONTRASENA = 4;

	/**
	 * The feature id for the '<em><b>Server Puerto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURACION_DB__SERVER_PUERTO = 5;

	/**
	 * The feature id for the '<em><b>Tipo Proveedor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURACION_DB__TIPO_PROVEEDOR = 6;

	/**
	 * The number of structural features of the '<em>Configuracion DB</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURACION_DB_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Configuracion DB</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURACION_DB_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link diagramaClasesCompleto.impl.ConfiguracionDockerImpl <em>Configuracion Docker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagramaClasesCompleto.impl.ConfiguracionDockerImpl
	 * @see diagramaClasesCompleto.impl.DiagramaClasesCompletoPackageImpl#getConfiguracionDocker()
	 * @generated
	 */
	int CONFIGURACION_DOCKER = 14;

	/**
	 * The feature id for the '<em><b>Nombre Contenedor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURACION_DOCKER__NOMBRE_CONTENEDOR = 0;

	/**
	 * The feature id for the '<em><b>Puerto Interior</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURACION_DOCKER__PUERTO_INTERIOR = 1;

	/**
	 * The feature id for the '<em><b>Tipo Reinicio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURACION_DOCKER__TIPO_REINICIO = 2;

	/**
	 * The feature id for the '<em><b>Nombre Imagen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURACION_DOCKER__NOMBRE_IMAGEN = 3;

	/**
	 * The number of structural features of the '<em>Configuracion Docker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURACION_DOCKER_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Configuracion Docker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURACION_DOCKER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link diagramaClasesCompleto.impl.ConfiguracionLenguajeImpl <em>Configuracion Lenguaje</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagramaClasesCompleto.impl.ConfiguracionLenguajeImpl
	 * @see diagramaClasesCompleto.impl.DiagramaClasesCompletoPackageImpl#getConfiguracionLenguaje()
	 * @generated
	 */
	int CONFIGURACION_LENGUAJE = 15;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURACION_LENGUAJE__VERSION = 0;

	/**
	 * The feature id for the '<em><b>Lenguaje</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURACION_LENGUAJE__LENGUAJE = 1;

	/**
	 * The number of structural features of the '<em>Configuracion Lenguaje</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURACION_LENGUAJE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Configuracion Lenguaje</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURACION_LENGUAJE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link diagramaClasesCompleto.impl.ParametroInternoImpl <em>Parametro Interno</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagramaClasesCompleto.impl.ParametroInternoImpl
	 * @see diagramaClasesCompleto.impl.DiagramaClasesCompletoPackageImpl#getParametroInterno()
	 * @generated
	 */
	int PARAMETRO_INTERNO = 16;

	/**
	 * The feature id for the '<em><b>Tipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETRO_INTERNO__TIPO = 0;

	/**
	 * The number of structural features of the '<em>Parametro Interno</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETRO_INTERNO_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Parametro Interno</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETRO_INTERNO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link diagramaClasesCompleto.impl.ConfiguracionMicroserviciosImpl <em>Configuracion Microservicios</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagramaClasesCompleto.impl.ConfiguracionMicroserviciosImpl
	 * @see diagramaClasesCompleto.impl.DiagramaClasesCompletoPackageImpl#getConfiguracionMicroservicios()
	 * @generated
	 */
	int CONFIGURACION_MICROSERVICIOS = 17;

	/**
	 * The feature id for the '<em><b>Ip Discovery</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURACION_MICROSERVICIOS__IP_DISCOVERY = 0;

	/**
	 * The feature id for the '<em><b>Puerto Discovery</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURACION_MICROSERVICIOS__PUERTO_DISCOVERY = 1;

	/**
	 * The number of structural features of the '<em>Configuracion Microservicios</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURACION_MICROSERVICIOS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Configuracion Microservicios</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURACION_MICROSERVICIOS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link diagramaClasesCompleto.TipoRelacion <em>Tipo Relacion</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagramaClasesCompleto.TipoRelacion
	 * @see diagramaClasesCompleto.impl.DiagramaClasesCompletoPackageImpl#getTipoRelacion()
	 * @generated
	 */
	int TIPO_RELACION = 18;

	/**
	 * The meta object id for the '{@link diagramaClasesCompleto.TipoDato <em>Tipo Dato</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagramaClasesCompleto.TipoDato
	 * @see diagramaClasesCompleto.impl.DiagramaClasesCompletoPackageImpl#getTipoDato()
	 * @generated
	 */
	int TIPO_DATO = 19;

	/**
	 * The meta object id for the '{@link diagramaClasesCompleto.TipoRetorno <em>Tipo Retorno</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagramaClasesCompleto.TipoRetorno
	 * @see diagramaClasesCompleto.impl.DiagramaClasesCompletoPackageImpl#getTipoRetorno()
	 * @generated
	 */
	int TIPO_RETORNO = 20;

	/**
	 * The meta object id for the '{@link diagramaClasesCompleto.ModicadoresAcceso <em>Modicadores Acceso</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagramaClasesCompleto.ModicadoresAcceso
	 * @see diagramaClasesCompleto.impl.DiagramaClasesCompletoPackageImpl#getModicadoresAcceso()
	 * @generated
	 */
	int MODICADORES_ACCESO = 21;

	/**
	 * The meta object id for the '{@link diagramaClasesCompleto.Multiplicidad <em>Multiplicidad</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagramaClasesCompleto.Multiplicidad
	 * @see diagramaClasesCompleto.impl.DiagramaClasesCompletoPackageImpl#getMultiplicidad()
	 * @generated
	 */
	int MULTIPLICIDAD = 22;

	/**
	 * The meta object id for the '{@link diagramaClasesCompleto.VerbosHTTP <em>Verbos HTTP</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagramaClasesCompleto.VerbosHTTP
	 * @see diagramaClasesCompleto.impl.DiagramaClasesCompletoPackageImpl#getVerbosHTTP()
	 * @generated
	 */
	int VERBOS_HTTP = 23;

	/**
	 * The meta object id for the '{@link diagramaClasesCompleto.TipoTransferencia <em>Tipo Transferencia</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagramaClasesCompleto.TipoTransferencia
	 * @see diagramaClasesCompleto.impl.DiagramaClasesCompletoPackageImpl#getTipoTransferencia()
	 * @generated
	 */
	int TIPO_TRANSFERENCIA = 24;

	/**
	 * The meta object id for the '{@link diagramaClasesCompleto.TipoReinicio <em>Tipo Reinicio</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagramaClasesCompleto.TipoReinicio
	 * @see diagramaClasesCompleto.impl.DiagramaClasesCompletoPackageImpl#getTipoReinicio()
	 * @generated
	 */
	int TIPO_REINICIO = 25;

	/**
	 * The meta object id for the '{@link diagramaClasesCompleto.ProveedorDb <em>Proveedor Db</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagramaClasesCompleto.ProveedorDb
	 * @see diagramaClasesCompleto.impl.DiagramaClasesCompletoPackageImpl#getProveedorDb()
	 * @generated
	 */
	int PROVEEDOR_DB = 26;

	/**
	 * The meta object id for the '{@link diagramaClasesCompleto.Lenguaje <em>Lenguaje</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagramaClasesCompleto.Lenguaje
	 * @see diagramaClasesCompleto.impl.DiagramaClasesCompletoPackageImpl#getLenguaje()
	 * @generated
	 */
	int LENGUAJE = 27;

	/**
	 * The meta object id for the '{@link diagramaClasesCompleto.RepresentacionGrafica <em>Representacion Grafica</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagramaClasesCompleto.RepresentacionGrafica
	 * @see diagramaClasesCompleto.impl.DiagramaClasesCompletoPackageImpl#getRepresentacionGrafica()
	 * @generated
	 */
	int REPRESENTACION_GRAFICA = 28;

	/**
	 * The meta object id for the '{@link diagramaClasesCompleto.TipoABM <em>Tipo ABM</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagramaClasesCompleto.TipoABM
	 * @see diagramaClasesCompleto.impl.DiagramaClasesCompletoPackageImpl#getTipoABM()
	 * @generated
	 */
	int TIPO_ABM = 29;

	/**
	 * Returns the meta object for class '{@link diagramaClasesCompleto.DiagramaClases <em>Diagrama Clases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diagrama Clases</em>'.
	 * @see diagramaClasesCompleto.DiagramaClases
	 * @generated
	 */
	EClass getDiagramaClases();

	/**
	 * Returns the meta object for the containment reference list '{@link diagramaClasesCompleto.DiagramaClases#getPackages_contenidos <em>Packages contenidos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Packages contenidos</em>'.
	 * @see diagramaClasesCompleto.DiagramaClases#getPackages_contenidos()
	 * @see #getDiagramaClases()
	 * @generated
	 */
	EReference getDiagramaClases_Packages_contenidos();

	/**
	 * Returns the meta object for the containment reference '{@link diagramaClasesCompleto.DiagramaClases#getArtefacto_contenido <em>Artefacto contenido</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Artefacto contenido</em>'.
	 * @see diagramaClasesCompleto.DiagramaClases#getArtefacto_contenido()
	 * @see #getDiagramaClases()
	 * @generated
	 */
	EReference getDiagramaClases_Artefacto_contenido();

	/**
	 * Returns the meta object for the containment reference list '{@link diagramaClasesCompleto.DiagramaClases#getConfiguraciondb <em>Configuraciondb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Configuraciondb</em>'.
	 * @see diagramaClasesCompleto.DiagramaClases#getConfiguraciondb()
	 * @see #getDiagramaClases()
	 * @generated
	 */
	EReference getDiagramaClases_Configuraciondb();

	/**
	 * Returns the meta object for the containment reference list '{@link diagramaClasesCompleto.DiagramaClases#getConfiguraciondocker <em>Configuraciondocker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Configuraciondocker</em>'.
	 * @see diagramaClasesCompleto.DiagramaClases#getConfiguraciondocker()
	 * @see #getDiagramaClases()
	 * @generated
	 */
	EReference getDiagramaClases_Configuraciondocker();

	/**
	 * Returns the meta object for the containment reference list '{@link diagramaClasesCompleto.DiagramaClases#getConfiguracionlenguaje <em>Configuracionlenguaje</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Configuracionlenguaje</em>'.
	 * @see diagramaClasesCompleto.DiagramaClases#getConfiguracionlenguaje()
	 * @see #getDiagramaClases()
	 * @generated
	 */
	EReference getDiagramaClases_Configuracionlenguaje();

	/**
	 * Returns the meta object for the containment reference list '{@link diagramaClasesCompleto.DiagramaClases#getConfiguracionmicroservicios <em>Configuracionmicroservicios</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Configuracionmicroservicios</em>'.
	 * @see diagramaClasesCompleto.DiagramaClases#getConfiguracionmicroservicios()
	 * @see #getDiagramaClases()
	 * @generated
	 */
	EReference getDiagramaClases_Configuracionmicroservicios();

	/**
	 * Returns the meta object for class '{@link diagramaClasesCompleto.Clasificador <em>Clasificador</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clasificador</em>'.
	 * @see diagramaClasesCompleto.Clasificador
	 * @generated
	 */
	EClass getClasificador();

	/**
	 * Returns the meta object for the attribute '{@link diagramaClasesCompleto.Clasificador#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see diagramaClasesCompleto.Clasificador#getNombre()
	 * @see #getClasificador()
	 * @generated
	 */
	EAttribute getClasificador_Nombre();

	/**
	 * Returns the meta object for the containment reference list '{@link diagramaClasesCompleto.Clasificador#getAtributos_contenidos <em>Atributos contenidos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Atributos contenidos</em>'.
	 * @see diagramaClasesCompleto.Clasificador#getAtributos_contenidos()
	 * @see #getClasificador()
	 * @generated
	 */
	EReference getClasificador_Atributos_contenidos();

	/**
	 * Returns the meta object for the containment reference list '{@link diagramaClasesCompleto.Clasificador#getOperaciones_contenidas <em>Operaciones contenidas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operaciones contenidas</em>'.
	 * @see diagramaClasesCompleto.Clasificador#getOperaciones_contenidas()
	 * @see #getClasificador()
	 * @generated
	 */
	EReference getClasificador_Operaciones_contenidas();

	/**
	 * Returns the meta object for the containment reference list '{@link diagramaClasesCompleto.Clasificador#getHerencias_contenidas <em>Herencias contenidas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Herencias contenidas</em>'.
	 * @see diagramaClasesCompleto.Clasificador#getHerencias_contenidas()
	 * @see #getClasificador()
	 * @generated
	 */
	EReference getClasificador_Herencias_contenidas();

	/**
	 * Returns the meta object for class '{@link diagramaClasesCompleto.Clase <em>Clase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clase</em>'.
	 * @see diagramaClasesCompleto.Clase
	 * @generated
	 */
	EClass getClase();

	/**
	 * Returns the meta object for the containment reference list '{@link diagramaClasesCompleto.Clase#getRelaciones_contenidas <em>Relaciones contenidas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relaciones contenidas</em>'.
	 * @see diagramaClasesCompleto.Clase#getRelaciones_contenidas()
	 * @see #getClase()
	 * @generated
	 */
	EReference getClase_Relaciones_contenidas();

	/**
	 * Returns the meta object for the attribute '{@link diagramaClasesCompleto.Clase#isEsAbstracta <em>Es Abstracta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Es Abstracta</em>'.
	 * @see diagramaClasesCompleto.Clase#isEsAbstracta()
	 * @see #getClase()
	 * @generated
	 */
	EAttribute getClase_EsAbstracta();

	/**
	 * Returns the meta object for the containment reference list '{@link diagramaClasesCompleto.Clase#getRealizaciones_contenidas <em>Realizaciones contenidas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Realizaciones contenidas</em>'.
	 * @see diagramaClasesCompleto.Clase#getRealizaciones_contenidas()
	 * @see #getClase()
	 * @generated
	 */
	EReference getClase_Realizaciones_contenidas();

	/**
	 * Returns the meta object for the attribute '{@link diagramaClasesCompleto.Clase#isEsAsociativa <em>Es Asociativa</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Es Asociativa</em>'.
	 * @see diagramaClasesCompleto.Clase#isEsAsociativa()
	 * @see #getClase()
	 * @generated
	 */
	EAttribute getClase_EsAsociativa();

	/**
	 * Returns the meta object for the attribute '{@link diagramaClasesCompleto.Clase#isEsAuditable <em>Es Auditable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Es Auditable</em>'.
	 * @see diagramaClasesCompleto.Clase#isEsAuditable()
	 * @see #getClase()
	 * @generated
	 */
	EAttribute getClase_EsAuditable();

	/**
	 * Returns the meta object for the attribute '{@link diagramaClasesCompleto.Clase#isTieneABM <em>Tiene ABM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tiene ABM</em>'.
	 * @see diagramaClasesCompleto.Clase#isTieneABM()
	 * @see #getClase()
	 * @generated
	 */
	EAttribute getClase_TieneABM();

	/**
	 * Returns the meta object for class '{@link diagramaClasesCompleto.Interface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface</em>'.
	 * @see diagramaClasesCompleto.Interface
	 * @generated
	 */
	EClass getInterface();

	/**
	 * Returns the meta object for class '{@link diagramaClasesCompleto.Relacion <em>Relacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relacion</em>'.
	 * @see diagramaClasesCompleto.Relacion
	 * @generated
	 */
	EClass getRelacion();

	/**
	 * Returns the meta object for the reference '{@link diagramaClasesCompleto.Relacion#getDestino <em>Destino</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Destino</em>'.
	 * @see diagramaClasesCompleto.Relacion#getDestino()
	 * @see #getRelacion()
	 * @generated
	 */
	EReference getRelacion_Destino();

	/**
	 * Returns the meta object for the attribute '{@link diagramaClasesCompleto.Relacion#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see diagramaClasesCompleto.Relacion#getNombre()
	 * @see #getRelacion()
	 * @generated
	 */
	EAttribute getRelacion_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link diagramaClasesCompleto.Relacion#getTipo <em>Tipo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tipo</em>'.
	 * @see diagramaClasesCompleto.Relacion#getTipo()
	 * @see #getRelacion()
	 * @generated
	 */
	EAttribute getRelacion_Tipo();

	/**
	 * Returns the meta object for the attribute '{@link diagramaClasesCompleto.Relacion#getMultiplicidad <em>Multiplicidad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplicidad</em>'.
	 * @see diagramaClasesCompleto.Relacion#getMultiplicidad()
	 * @see #getRelacion()
	 * @generated
	 */
	EAttribute getRelacion_Multiplicidad();

	/**
	 * Returns the meta object for the reference '{@link diagramaClasesCompleto.Relacion#getOrigen <em>Origen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Origen</em>'.
	 * @see diagramaClasesCompleto.Relacion#getOrigen()
	 * @see #getRelacion()
	 * @generated
	 */
	EReference getRelacion_Origen();

	/**
	 * Returns the meta object for the containment reference list '{@link diagramaClasesCompleto.Relacion#getClases_asociativas_contenidas <em>Clases asociativas contenidas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Clases asociativas contenidas</em>'.
	 * @see diagramaClasesCompleto.Relacion#getClases_asociativas_contenidas()
	 * @see #getRelacion()
	 * @generated
	 */
	EReference getRelacion_Clases_asociativas_contenidas();

	/**
	 * Returns the meta object for the attribute '{@link diagramaClasesCompleto.Relacion#isEsFinal <em>Es Final</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Es Final</em>'.
	 * @see diagramaClasesCompleto.Relacion#isEsFinal()
	 * @see #getRelacion()
	 * @generated
	 */
	EAttribute getRelacion_EsFinal();

	/**
	 * Returns the meta object for the attribute '{@link diagramaClasesCompleto.Relacion#isEsStatic <em>Es Static</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Es Static</em>'.
	 * @see diagramaClasesCompleto.Relacion#isEsStatic()
	 * @see #getRelacion()
	 * @generated
	 */
	EAttribute getRelacion_EsStatic();

	/**
	 * Returns the meta object for the attribute '{@link diagramaClasesCompleto.Relacion#getVisibilidad <em>Visibilidad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visibilidad</em>'.
	 * @see diagramaClasesCompleto.Relacion#getVisibilidad()
	 * @see #getRelacion()
	 * @generated
	 */
	EAttribute getRelacion_Visibilidad();

	/**
	 * Returns the meta object for the attribute '{@link diagramaClasesCompleto.Relacion#getTipoABM <em>Tipo ABM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tipo ABM</em>'.
	 * @see diagramaClasesCompleto.Relacion#getTipoABM()
	 * @see #getRelacion()
	 * @generated
	 */
	EAttribute getRelacion_TipoABM();

	/**
	 * Returns the meta object for class '{@link diagramaClasesCompleto.Operacion <em>Operacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operacion</em>'.
	 * @see diagramaClasesCompleto.Operacion
	 * @generated
	 */
	EClass getOperacion();

	/**
	 * Returns the meta object for the attribute '{@link diagramaClasesCompleto.Operacion#getTipoRetorno <em>Tipo Retorno</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tipo Retorno</em>'.
	 * @see diagramaClasesCompleto.Operacion#getTipoRetorno()
	 * @see #getOperacion()
	 * @generated
	 */
	EAttribute getOperacion_TipoRetorno();

	/**
	 * Returns the meta object for the attribute '{@link diagramaClasesCompleto.Operacion#isEsAbstracta <em>Es Abstracta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Es Abstracta</em>'.
	 * @see diagramaClasesCompleto.Operacion#isEsAbstracta()
	 * @see #getOperacion()
	 * @generated
	 */
	EAttribute getOperacion_EsAbstracta();

	/**
	 * Returns the meta object for the containment reference list '{@link diagramaClasesCompleto.Operacion#getParametros_contenidos <em>Parametros contenidos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parametros contenidos</em>'.
	 * @see diagramaClasesCompleto.Operacion#getParametros_contenidos()
	 * @see #getOperacion()
	 * @generated
	 */
	EReference getOperacion_Parametros_contenidos();

	/**
	 * Returns the meta object for the containment reference '{@link diagramaClasesCompleto.Operacion#getEndpoint <em>Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Endpoint</em>'.
	 * @see diagramaClasesCompleto.Operacion#getEndpoint()
	 * @see #getOperacion()
	 * @generated
	 */
	EReference getOperacion_Endpoint();

	/**
	 * Returns the meta object for the containment reference list '{@link diagramaClasesCompleto.Operacion#getParametros_internos <em>Parametros internos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parametros internos</em>'.
	 * @see diagramaClasesCompleto.Operacion#getParametros_internos()
	 * @see #getOperacion()
	 * @generated
	 */
	EReference getOperacion_Parametros_internos();

	/**
	 * Returns the meta object for class '{@link diagramaClasesCompleto.Atributo <em>Atributo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Atributo</em>'.
	 * @see diagramaClasesCompleto.Atributo
	 * @generated
	 */
	EClass getAtributo();

	/**
	 * Returns the meta object for the attribute '{@link diagramaClasesCompleto.Atributo#getTipo <em>Tipo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tipo</em>'.
	 * @see diagramaClasesCompleto.Atributo#getTipo()
	 * @see #getAtributo()
	 * @generated
	 */
	EAttribute getAtributo_Tipo();

	/**
	 * Returns the meta object for the attribute '{@link diagramaClasesCompleto.Atributo#isEsAuditable <em>Es Auditable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Es Auditable</em>'.
	 * @see diagramaClasesCompleto.Atributo#isEsAuditable()
	 * @see #getAtributo()
	 * @generated
	 */
	EAttribute getAtributo_EsAuditable();

	/**
	 * Returns the meta object for the attribute '{@link diagramaClasesCompleto.Atributo#getPseudonimo <em>Pseudonimo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pseudonimo</em>'.
	 * @see diagramaClasesCompleto.Atributo#getPseudonimo()
	 * @see #getAtributo()
	 * @generated
	 */
	EAttribute getAtributo_Pseudonimo();

	/**
	 * Returns the meta object for the attribute '{@link diagramaClasesCompleto.Atributo#getRepresentacionGrafica <em>Representacion Grafica</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Representacion Grafica</em>'.
	 * @see diagramaClasesCompleto.Atributo#getRepresentacionGrafica()
	 * @see #getAtributo()
	 * @generated
	 */
	EAttribute getAtributo_RepresentacionGrafica();

	/**
	 * Returns the meta object for class '{@link diagramaClasesCompleto.Package <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package</em>'.
	 * @see diagramaClasesCompleto.Package
	 * @generated
	 */
	EClass getPackage();

	/**
	 * Returns the meta object for the containment reference list '{@link diagramaClasesCompleto.Package#getClasificadores_contenidos <em>Clasificadores contenidos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Clasificadores contenidos</em>'.
	 * @see diagramaClasesCompleto.Package#getClasificadores_contenidos()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_Clasificadores_contenidos();

	/**
	 * Returns the meta object for the attribute '{@link diagramaClasesCompleto.Package#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see diagramaClasesCompleto.Package#getNombre()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_Nombre();

	/**
	 * Returns the meta object for class '{@link diagramaClasesCompleto.Herencia <em>Herencia</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Herencia</em>'.
	 * @see diagramaClasesCompleto.Herencia
	 * @generated
	 */
	EClass getHerencia();

	/**
	 * Returns the meta object for the reference '{@link diagramaClasesCompleto.Herencia#getOrigen <em>Origen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Origen</em>'.
	 * @see diagramaClasesCompleto.Herencia#getOrigen()
	 * @see #getHerencia()
	 * @generated
	 */
	EReference getHerencia_Origen();

	/**
	 * Returns the meta object for the reference '{@link diagramaClasesCompleto.Herencia#getDestino <em>Destino</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Destino</em>'.
	 * @see diagramaClasesCompleto.Herencia#getDestino()
	 * @see #getHerencia()
	 * @generated
	 */
	EReference getHerencia_Destino();

	/**
	 * Returns the meta object for class '{@link diagramaClasesCompleto.Realizacion <em>Realizacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Realizacion</em>'.
	 * @see diagramaClasesCompleto.Realizacion
	 * @generated
	 */
	EClass getRealizacion();

	/**
	 * Returns the meta object for the reference '{@link diagramaClasesCompleto.Realizacion#getDestino <em>Destino</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Destino</em>'.
	 * @see diagramaClasesCompleto.Realizacion#getDestino()
	 * @see #getRealizacion()
	 * @generated
	 */
	EReference getRealizacion_Destino();

	/**
	 * Returns the meta object for the reference '{@link diagramaClasesCompleto.Realizacion#getOrigen <em>Origen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Origen</em>'.
	 * @see diagramaClasesCompleto.Realizacion#getOrigen()
	 * @see #getRealizacion()
	 * @generated
	 */
	EReference getRealizacion_Origen();

	/**
	 * Returns the meta object for class '{@link diagramaClasesCompleto.Artefacto <em>Artefacto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Artefacto</em>'.
	 * @see diagramaClasesCompleto.Artefacto
	 * @generated
	 */
	EClass getArtefacto();

	/**
	 * Returns the meta object for the attribute '{@link diagramaClasesCompleto.Artefacto#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see diagramaClasesCompleto.Artefacto#getNombre()
	 * @see #getArtefacto()
	 * @generated
	 */
	EAttribute getArtefacto_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link diagramaClasesCompleto.Artefacto#getGrupoId <em>Grupo Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Grupo Id</em>'.
	 * @see diagramaClasesCompleto.Artefacto#getGrupoId()
	 * @see #getArtefacto()
	 * @generated
	 */
	EAttribute getArtefacto_GrupoId();

	/**
	 * Returns the meta object for the attribute '{@link diagramaClasesCompleto.Artefacto#getArtefactotId <em>Artefactot Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Artefactot Id</em>'.
	 * @see diagramaClasesCompleto.Artefacto#getArtefactotId()
	 * @see #getArtefacto()
	 * @generated
	 */
	EAttribute getArtefacto_ArtefactotId();

	/**
	 * Returns the meta object for the attribute '{@link diagramaClasesCompleto.Artefacto#getDescripcion <em>Descripcion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Descripcion</em>'.
	 * @see diagramaClasesCompleto.Artefacto#getDescripcion()
	 * @see #getArtefacto()
	 * @generated
	 */
	EAttribute getArtefacto_Descripcion();

	/**
	 * Returns the meta object for the attribute '{@link diagramaClasesCompleto.Artefacto#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see diagramaClasesCompleto.Artefacto#getVersion()
	 * @see #getArtefacto()
	 * @generated
	 */
	EAttribute getArtefacto_Version();

	/**
	 * Returns the meta object for class '{@link diagramaClasesCompleto.Retornable <em>Retornable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Retornable</em>'.
	 * @see diagramaClasesCompleto.Retornable
	 * @generated
	 */
	EClass getRetornable();

	/**
	 * Returns the meta object for the attribute '{@link diagramaClasesCompleto.Retornable#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see diagramaClasesCompleto.Retornable#getNombre()
	 * @see #getRetornable()
	 * @generated
	 */
	EAttribute getRetornable_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link diagramaClasesCompleto.Retornable#getVisibilidad <em>Visibilidad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visibilidad</em>'.
	 * @see diagramaClasesCompleto.Retornable#getVisibilidad()
	 * @see #getRetornable()
	 * @generated
	 */
	EAttribute getRetornable_Visibilidad();

	/**
	 * Returns the meta object for the attribute '{@link diagramaClasesCompleto.Retornable#isEsFinal <em>Es Final</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Es Final</em>'.
	 * @see diagramaClasesCompleto.Retornable#isEsFinal()
	 * @see #getRetornable()
	 * @generated
	 */
	EAttribute getRetornable_EsFinal();

	/**
	 * Returns the meta object for the attribute '{@link diagramaClasesCompleto.Retornable#isEsStatic <em>Es Static</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Es Static</em>'.
	 * @see diagramaClasesCompleto.Retornable#isEsStatic()
	 * @see #getRetornable()
	 * @generated
	 */
	EAttribute getRetornable_EsStatic();

	/**
	 * Returns the meta object for class '{@link diagramaClasesCompleto.EndPoint <em>End Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>End Point</em>'.
	 * @see diagramaClasesCompleto.EndPoint
	 * @generated
	 */
	EClass getEndPoint();

	/**
	 * Returns the meta object for the attribute '{@link diagramaClasesCompleto.EndPoint#getTipoVerdo <em>Tipo Verdo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tipo Verdo</em>'.
	 * @see diagramaClasesCompleto.EndPoint#getTipoVerdo()
	 * @see #getEndPoint()
	 * @generated
	 */
	EAttribute getEndPoint_TipoVerdo();

	/**
	 * Returns the meta object for the attribute '{@link diagramaClasesCompleto.EndPoint#getTipoTransferenciaEntrada <em>Tipo Transferencia Entrada</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tipo Transferencia Entrada</em>'.
	 * @see diagramaClasesCompleto.EndPoint#getTipoTransferenciaEntrada()
	 * @see #getEndPoint()
	 * @generated
	 */
	EAttribute getEndPoint_TipoTransferenciaEntrada();

	/**
	 * Returns the meta object for the attribute '{@link diagramaClasesCompleto.EndPoint#getTipoTransferenciaSalida <em>Tipo Transferencia Salida</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tipo Transferencia Salida</em>'.
	 * @see diagramaClasesCompleto.EndPoint#getTipoTransferenciaSalida()
	 * @see #getEndPoint()
	 * @generated
	 */
	EAttribute getEndPoint_TipoTransferenciaSalida();

	/**
	 * Returns the meta object for the attribute '{@link diagramaClasesCompleto.EndPoint#getNombrePublicado <em>Nombre Publicado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre Publicado</em>'.
	 * @see diagramaClasesCompleto.EndPoint#getNombrePublicado()
	 * @see #getEndPoint()
	 * @generated
	 */
	EAttribute getEndPoint_NombrePublicado();

	/**
	 * Returns the meta object for class '{@link diagramaClasesCompleto.ConfiguracionDB <em>Configuracion DB</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuracion DB</em>'.
	 * @see diagramaClasesCompleto.ConfiguracionDB
	 * @generated
	 */
	EClass getConfiguracionDB();

	/**
	 * Returns the meta object for the attribute '{@link diagramaClasesCompleto.ConfiguracionDB#getDbNombre <em>Db Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Db Nombre</em>'.
	 * @see diagramaClasesCompleto.ConfiguracionDB#getDbNombre()
	 * @see #getConfiguracionDB()
	 * @generated
	 */
	EAttribute getConfiguracionDB_DbNombre();

	/**
	 * Returns the meta object for the attribute '{@link diagramaClasesCompleto.ConfiguracionDB#getDbUsuario <em>Db Usuario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Db Usuario</em>'.
	 * @see diagramaClasesCompleto.ConfiguracionDB#getDbUsuario()
	 * @see #getConfiguracionDB()
	 * @generated
	 */
	EAttribute getConfiguracionDB_DbUsuario();

	/**
	 * Returns the meta object for the attribute '{@link diagramaClasesCompleto.ConfiguracionDB#getDbPuerto <em>Db Puerto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Db Puerto</em>'.
	 * @see diagramaClasesCompleto.ConfiguracionDB#getDbPuerto()
	 * @see #getConfiguracionDB()
	 * @generated
	 */
	EAttribute getConfiguracionDB_DbPuerto();

	/**
	 * Returns the meta object for the attribute '{@link diagramaClasesCompleto.ConfiguracionDB#getIp <em>Ip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ip</em>'.
	 * @see diagramaClasesCompleto.ConfiguracionDB#getIp()
	 * @see #getConfiguracionDB()
	 * @generated
	 */
	EAttribute getConfiguracionDB_Ip();

	/**
	 * Returns the meta object for the attribute '{@link diagramaClasesCompleto.ConfiguracionDB#getDbContrasena <em>Db Contrasena</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Db Contrasena</em>'.
	 * @see diagramaClasesCompleto.ConfiguracionDB#getDbContrasena()
	 * @see #getConfiguracionDB()
	 * @generated
	 */
	EAttribute getConfiguracionDB_DbContrasena();

	/**
	 * Returns the meta object for the attribute '{@link diagramaClasesCompleto.ConfiguracionDB#getServerPuerto <em>Server Puerto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Server Puerto</em>'.
	 * @see diagramaClasesCompleto.ConfiguracionDB#getServerPuerto()
	 * @see #getConfiguracionDB()
	 * @generated
	 */
	EAttribute getConfiguracionDB_ServerPuerto();

	/**
	 * Returns the meta object for the attribute '{@link diagramaClasesCompleto.ConfiguracionDB#getTipoProveedor <em>Tipo Proveedor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tipo Proveedor</em>'.
	 * @see diagramaClasesCompleto.ConfiguracionDB#getTipoProveedor()
	 * @see #getConfiguracionDB()
	 * @generated
	 */
	EAttribute getConfiguracionDB_TipoProveedor();

	/**
	 * Returns the meta object for class '{@link diagramaClasesCompleto.ConfiguracionDocker <em>Configuracion Docker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuracion Docker</em>'.
	 * @see diagramaClasesCompleto.ConfiguracionDocker
	 * @generated
	 */
	EClass getConfiguracionDocker();

	/**
	 * Returns the meta object for the attribute '{@link diagramaClasesCompleto.ConfiguracionDocker#getNombreContenedor <em>Nombre Contenedor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre Contenedor</em>'.
	 * @see diagramaClasesCompleto.ConfiguracionDocker#getNombreContenedor()
	 * @see #getConfiguracionDocker()
	 * @generated
	 */
	EAttribute getConfiguracionDocker_NombreContenedor();

	/**
	 * Returns the meta object for the attribute '{@link diagramaClasesCompleto.ConfiguracionDocker#getPuertoInterior <em>Puerto Interior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Puerto Interior</em>'.
	 * @see diagramaClasesCompleto.ConfiguracionDocker#getPuertoInterior()
	 * @see #getConfiguracionDocker()
	 * @generated
	 */
	EAttribute getConfiguracionDocker_PuertoInterior();

	/**
	 * Returns the meta object for the attribute '{@link diagramaClasesCompleto.ConfiguracionDocker#getTipoReinicio <em>Tipo Reinicio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tipo Reinicio</em>'.
	 * @see diagramaClasesCompleto.ConfiguracionDocker#getTipoReinicio()
	 * @see #getConfiguracionDocker()
	 * @generated
	 */
	EAttribute getConfiguracionDocker_TipoReinicio();

	/**
	 * Returns the meta object for the attribute '{@link diagramaClasesCompleto.ConfiguracionDocker#getNombreImagen <em>Nombre Imagen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre Imagen</em>'.
	 * @see diagramaClasesCompleto.ConfiguracionDocker#getNombreImagen()
	 * @see #getConfiguracionDocker()
	 * @generated
	 */
	EAttribute getConfiguracionDocker_NombreImagen();

	/**
	 * Returns the meta object for class '{@link diagramaClasesCompleto.ConfiguracionLenguaje <em>Configuracion Lenguaje</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuracion Lenguaje</em>'.
	 * @see diagramaClasesCompleto.ConfiguracionLenguaje
	 * @generated
	 */
	EClass getConfiguracionLenguaje();

	/**
	 * Returns the meta object for the attribute '{@link diagramaClasesCompleto.ConfiguracionLenguaje#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see diagramaClasesCompleto.ConfiguracionLenguaje#getVersion()
	 * @see #getConfiguracionLenguaje()
	 * @generated
	 */
	EAttribute getConfiguracionLenguaje_Version();

	/**
	 * Returns the meta object for the attribute '{@link diagramaClasesCompleto.ConfiguracionLenguaje#getLenguaje <em>Lenguaje</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lenguaje</em>'.
	 * @see diagramaClasesCompleto.ConfiguracionLenguaje#getLenguaje()
	 * @see #getConfiguracionLenguaje()
	 * @generated
	 */
	EAttribute getConfiguracionLenguaje_Lenguaje();

	/**
	 * Returns the meta object for class '{@link diagramaClasesCompleto.ParametroInterno <em>Parametro Interno</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parametro Interno</em>'.
	 * @see diagramaClasesCompleto.ParametroInterno
	 * @generated
	 */
	EClass getParametroInterno();

	/**
	 * Returns the meta object for the attribute '{@link diagramaClasesCompleto.ParametroInterno#getTipo <em>Tipo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tipo</em>'.
	 * @see diagramaClasesCompleto.ParametroInterno#getTipo()
	 * @see #getParametroInterno()
	 * @generated
	 */
	EAttribute getParametroInterno_Tipo();

	/**
	 * Returns the meta object for class '{@link diagramaClasesCompleto.ConfiguracionMicroservicios <em>Configuracion Microservicios</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuracion Microservicios</em>'.
	 * @see diagramaClasesCompleto.ConfiguracionMicroservicios
	 * @generated
	 */
	EClass getConfiguracionMicroservicios();

	/**
	 * Returns the meta object for the attribute '{@link diagramaClasesCompleto.ConfiguracionMicroservicios#getIpDiscovery <em>Ip Discovery</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ip Discovery</em>'.
	 * @see diagramaClasesCompleto.ConfiguracionMicroservicios#getIpDiscovery()
	 * @see #getConfiguracionMicroservicios()
	 * @generated
	 */
	EAttribute getConfiguracionMicroservicios_IpDiscovery();

	/**
	 * Returns the meta object for the attribute '{@link diagramaClasesCompleto.ConfiguracionMicroservicios#getPuertoDiscovery <em>Puerto Discovery</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Puerto Discovery</em>'.
	 * @see diagramaClasesCompleto.ConfiguracionMicroservicios#getPuertoDiscovery()
	 * @see #getConfiguracionMicroservicios()
	 * @generated
	 */
	EAttribute getConfiguracionMicroservicios_PuertoDiscovery();

	/**
	 * Returns the meta object for enum '{@link diagramaClasesCompleto.TipoRelacion <em>Tipo Relacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Tipo Relacion</em>'.
	 * @see diagramaClasesCompleto.TipoRelacion
	 * @generated
	 */
	EEnum getTipoRelacion();

	/**
	 * Returns the meta object for enum '{@link diagramaClasesCompleto.TipoDato <em>Tipo Dato</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Tipo Dato</em>'.
	 * @see diagramaClasesCompleto.TipoDato
	 * @generated
	 */
	EEnum getTipoDato();

	/**
	 * Returns the meta object for enum '{@link diagramaClasesCompleto.TipoRetorno <em>Tipo Retorno</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Tipo Retorno</em>'.
	 * @see diagramaClasesCompleto.TipoRetorno
	 * @generated
	 */
	EEnum getTipoRetorno();

	/**
	 * Returns the meta object for enum '{@link diagramaClasesCompleto.ModicadoresAcceso <em>Modicadores Acceso</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Modicadores Acceso</em>'.
	 * @see diagramaClasesCompleto.ModicadoresAcceso
	 * @generated
	 */
	EEnum getModicadoresAcceso();

	/**
	 * Returns the meta object for enum '{@link diagramaClasesCompleto.Multiplicidad <em>Multiplicidad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Multiplicidad</em>'.
	 * @see diagramaClasesCompleto.Multiplicidad
	 * @generated
	 */
	EEnum getMultiplicidad();

	/**
	 * Returns the meta object for enum '{@link diagramaClasesCompleto.VerbosHTTP <em>Verbos HTTP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Verbos HTTP</em>'.
	 * @see diagramaClasesCompleto.VerbosHTTP
	 * @generated
	 */
	EEnum getVerbosHTTP();

	/**
	 * Returns the meta object for enum '{@link diagramaClasesCompleto.TipoTransferencia <em>Tipo Transferencia</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Tipo Transferencia</em>'.
	 * @see diagramaClasesCompleto.TipoTransferencia
	 * @generated
	 */
	EEnum getTipoTransferencia();

	/**
	 * Returns the meta object for enum '{@link diagramaClasesCompleto.TipoReinicio <em>Tipo Reinicio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Tipo Reinicio</em>'.
	 * @see diagramaClasesCompleto.TipoReinicio
	 * @generated
	 */
	EEnum getTipoReinicio();

	/**
	 * Returns the meta object for enum '{@link diagramaClasesCompleto.ProveedorDb <em>Proveedor Db</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Proveedor Db</em>'.
	 * @see diagramaClasesCompleto.ProveedorDb
	 * @generated
	 */
	EEnum getProveedorDb();

	/**
	 * Returns the meta object for enum '{@link diagramaClasesCompleto.Lenguaje <em>Lenguaje</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Lenguaje</em>'.
	 * @see diagramaClasesCompleto.Lenguaje
	 * @generated
	 */
	EEnum getLenguaje();

	/**
	 * Returns the meta object for enum '{@link diagramaClasesCompleto.RepresentacionGrafica <em>Representacion Grafica</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Representacion Grafica</em>'.
	 * @see diagramaClasesCompleto.RepresentacionGrafica
	 * @generated
	 */
	EEnum getRepresentacionGrafica();

	/**
	 * Returns the meta object for enum '{@link diagramaClasesCompleto.TipoABM <em>Tipo ABM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Tipo ABM</em>'.
	 * @see diagramaClasesCompleto.TipoABM
	 * @generated
	 */
	EEnum getTipoABM();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DiagramaClasesCompletoFactory getDiagramaClasesCompletoFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link diagramaClasesCompleto.impl.DiagramaClasesImpl <em>Diagrama Clases</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagramaClasesCompleto.impl.DiagramaClasesImpl
		 * @see diagramaClasesCompleto.impl.DiagramaClasesCompletoPackageImpl#getDiagramaClases()
		 * @generated
		 */
		EClass DIAGRAMA_CLASES = eINSTANCE.getDiagramaClases();

		/**
		 * The meta object literal for the '<em><b>Packages contenidos</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAMA_CLASES__PACKAGES_CONTENIDOS = eINSTANCE.getDiagramaClases_Packages_contenidos();

		/**
		 * The meta object literal for the '<em><b>Artefacto contenido</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAMA_CLASES__ARTEFACTO_CONTENIDO = eINSTANCE.getDiagramaClases_Artefacto_contenido();

		/**
		 * The meta object literal for the '<em><b>Configuraciondb</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAMA_CLASES__CONFIGURACIONDB = eINSTANCE.getDiagramaClases_Configuraciondb();

		/**
		 * The meta object literal for the '<em><b>Configuraciondocker</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAMA_CLASES__CONFIGURACIONDOCKER = eINSTANCE.getDiagramaClases_Configuraciondocker();

		/**
		 * The meta object literal for the '<em><b>Configuracionlenguaje</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAMA_CLASES__CONFIGURACIONLENGUAJE = eINSTANCE.getDiagramaClases_Configuracionlenguaje();

		/**
		 * The meta object literal for the '<em><b>Configuracionmicroservicios</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAMA_CLASES__CONFIGURACIONMICROSERVICIOS = eINSTANCE
				.getDiagramaClases_Configuracionmicroservicios();

		/**
		 * The meta object literal for the '{@link diagramaClasesCompleto.impl.ClasificadorImpl <em>Clasificador</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagramaClasesCompleto.impl.ClasificadorImpl
		 * @see diagramaClasesCompleto.impl.DiagramaClasesCompletoPackageImpl#getClasificador()
		 * @generated
		 */
		EClass CLASIFICADOR = eINSTANCE.getClasificador();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASIFICADOR__NOMBRE = eINSTANCE.getClasificador_Nombre();

		/**
		 * The meta object literal for the '<em><b>Atributos contenidos</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASIFICADOR__ATRIBUTOS_CONTENIDOS = eINSTANCE.getClasificador_Atributos_contenidos();

		/**
		 * The meta object literal for the '<em><b>Operaciones contenidas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASIFICADOR__OPERACIONES_CONTENIDAS = eINSTANCE.getClasificador_Operaciones_contenidas();

		/**
		 * The meta object literal for the '<em><b>Herencias contenidas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASIFICADOR__HERENCIAS_CONTENIDAS = eINSTANCE.getClasificador_Herencias_contenidas();

		/**
		 * The meta object literal for the '{@link diagramaClasesCompleto.impl.ClaseImpl <em>Clase</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagramaClasesCompleto.impl.ClaseImpl
		 * @see diagramaClasesCompleto.impl.DiagramaClasesCompletoPackageImpl#getClase()
		 * @generated
		 */
		EClass CLASE = eINSTANCE.getClase();

		/**
		 * The meta object literal for the '<em><b>Relaciones contenidas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASE__RELACIONES_CONTENIDAS = eINSTANCE.getClase_Relaciones_contenidas();

		/**
		 * The meta object literal for the '<em><b>Es Abstracta</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASE__ES_ABSTRACTA = eINSTANCE.getClase_EsAbstracta();

		/**
		 * The meta object literal for the '<em><b>Realizaciones contenidas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASE__REALIZACIONES_CONTENIDAS = eINSTANCE.getClase_Realizaciones_contenidas();

		/**
		 * The meta object literal for the '<em><b>Es Asociativa</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASE__ES_ASOCIATIVA = eINSTANCE.getClase_EsAsociativa();

		/**
		 * The meta object literal for the '<em><b>Es Auditable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASE__ES_AUDITABLE = eINSTANCE.getClase_EsAuditable();

		/**
		 * The meta object literal for the '<em><b>Tiene ABM</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASE__TIENE_ABM = eINSTANCE.getClase_TieneABM();

		/**
		 * The meta object literal for the '{@link diagramaClasesCompleto.impl.InterfaceImpl <em>Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagramaClasesCompleto.impl.InterfaceImpl
		 * @see diagramaClasesCompleto.impl.DiagramaClasesCompletoPackageImpl#getInterface()
		 * @generated
		 */
		EClass INTERFACE = eINSTANCE.getInterface();

		/**
		 * The meta object literal for the '{@link diagramaClasesCompleto.impl.RelacionImpl <em>Relacion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagramaClasesCompleto.impl.RelacionImpl
		 * @see diagramaClasesCompleto.impl.DiagramaClasesCompletoPackageImpl#getRelacion()
		 * @generated
		 */
		EClass RELACION = eINSTANCE.getRelacion();

		/**
		 * The meta object literal for the '<em><b>Destino</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELACION__DESTINO = eINSTANCE.getRelacion_Destino();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELACION__NOMBRE = eINSTANCE.getRelacion_Nombre();

		/**
		 * The meta object literal for the '<em><b>Tipo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELACION__TIPO = eINSTANCE.getRelacion_Tipo();

		/**
		 * The meta object literal for the '<em><b>Multiplicidad</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELACION__MULTIPLICIDAD = eINSTANCE.getRelacion_Multiplicidad();

		/**
		 * The meta object literal for the '<em><b>Origen</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELACION__ORIGEN = eINSTANCE.getRelacion_Origen();

		/**
		 * The meta object literal for the '<em><b>Clases asociativas contenidas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELACION__CLASES_ASOCIATIVAS_CONTENIDAS = eINSTANCE.getRelacion_Clases_asociativas_contenidas();

		/**
		 * The meta object literal for the '<em><b>Es Final</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELACION__ES_FINAL = eINSTANCE.getRelacion_EsFinal();

		/**
		 * The meta object literal for the '<em><b>Es Static</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELACION__ES_STATIC = eINSTANCE.getRelacion_EsStatic();

		/**
		 * The meta object literal for the '<em><b>Visibilidad</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELACION__VISIBILIDAD = eINSTANCE.getRelacion_Visibilidad();

		/**
		 * The meta object literal for the '<em><b>Tipo ABM</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELACION__TIPO_ABM = eINSTANCE.getRelacion_TipoABM();

		/**
		 * The meta object literal for the '{@link diagramaClasesCompleto.impl.OperacionImpl <em>Operacion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagramaClasesCompleto.impl.OperacionImpl
		 * @see diagramaClasesCompleto.impl.DiagramaClasesCompletoPackageImpl#getOperacion()
		 * @generated
		 */
		EClass OPERACION = eINSTANCE.getOperacion();

		/**
		 * The meta object literal for the '<em><b>Tipo Retorno</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERACION__TIPO_RETORNO = eINSTANCE.getOperacion_TipoRetorno();

		/**
		 * The meta object literal for the '<em><b>Es Abstracta</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERACION__ES_ABSTRACTA = eINSTANCE.getOperacion_EsAbstracta();

		/**
		 * The meta object literal for the '<em><b>Parametros contenidos</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERACION__PARAMETROS_CONTENIDOS = eINSTANCE.getOperacion_Parametros_contenidos();

		/**
		 * The meta object literal for the '<em><b>Endpoint</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERACION__ENDPOINT = eINSTANCE.getOperacion_Endpoint();

		/**
		 * The meta object literal for the '<em><b>Parametros internos</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERACION__PARAMETROS_INTERNOS = eINSTANCE.getOperacion_Parametros_internos();

		/**
		 * The meta object literal for the '{@link diagramaClasesCompleto.impl.AtributoImpl <em>Atributo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagramaClasesCompleto.impl.AtributoImpl
		 * @see diagramaClasesCompleto.impl.DiagramaClasesCompletoPackageImpl#getAtributo()
		 * @generated
		 */
		EClass ATRIBUTO = eINSTANCE.getAtributo();

		/**
		 * The meta object literal for the '<em><b>Tipo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATRIBUTO__TIPO = eINSTANCE.getAtributo_Tipo();

		/**
		 * The meta object literal for the '<em><b>Es Auditable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATRIBUTO__ES_AUDITABLE = eINSTANCE.getAtributo_EsAuditable();

		/**
		 * The meta object literal for the '<em><b>Pseudonimo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATRIBUTO__PSEUDONIMO = eINSTANCE.getAtributo_Pseudonimo();

		/**
		 * The meta object literal for the '<em><b>Representacion Grafica</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATRIBUTO__REPRESENTACION_GRAFICA = eINSTANCE.getAtributo_RepresentacionGrafica();

		/**
		 * The meta object literal for the '{@link diagramaClasesCompleto.impl.PackageImpl <em>Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagramaClasesCompleto.impl.PackageImpl
		 * @see diagramaClasesCompleto.impl.DiagramaClasesCompletoPackageImpl#getPackage()
		 * @generated
		 */
		EClass PACKAGE = eINSTANCE.getPackage();

		/**
		 * The meta object literal for the '<em><b>Clasificadores contenidos</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__CLASIFICADORES_CONTENIDOS = eINSTANCE.getPackage_Clasificadores_contenidos();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE__NOMBRE = eINSTANCE.getPackage_Nombre();

		/**
		 * The meta object literal for the '{@link diagramaClasesCompleto.impl.HerenciaImpl <em>Herencia</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagramaClasesCompleto.impl.HerenciaImpl
		 * @see diagramaClasesCompleto.impl.DiagramaClasesCompletoPackageImpl#getHerencia()
		 * @generated
		 */
		EClass HERENCIA = eINSTANCE.getHerencia();

		/**
		 * The meta object literal for the '<em><b>Origen</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HERENCIA__ORIGEN = eINSTANCE.getHerencia_Origen();

		/**
		 * The meta object literal for the '<em><b>Destino</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HERENCIA__DESTINO = eINSTANCE.getHerencia_Destino();

		/**
		 * The meta object literal for the '{@link diagramaClasesCompleto.impl.RealizacionImpl <em>Realizacion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagramaClasesCompleto.impl.RealizacionImpl
		 * @see diagramaClasesCompleto.impl.DiagramaClasesCompletoPackageImpl#getRealizacion()
		 * @generated
		 */
		EClass REALIZACION = eINSTANCE.getRealizacion();

		/**
		 * The meta object literal for the '<em><b>Destino</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REALIZACION__DESTINO = eINSTANCE.getRealizacion_Destino();

		/**
		 * The meta object literal for the '<em><b>Origen</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REALIZACION__ORIGEN = eINSTANCE.getRealizacion_Origen();

		/**
		 * The meta object literal for the '{@link diagramaClasesCompleto.impl.ArtefactoImpl <em>Artefacto</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagramaClasesCompleto.impl.ArtefactoImpl
		 * @see diagramaClasesCompleto.impl.DiagramaClasesCompletoPackageImpl#getArtefacto()
		 * @generated
		 */
		EClass ARTEFACTO = eINSTANCE.getArtefacto();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARTEFACTO__NOMBRE = eINSTANCE.getArtefacto_Nombre();

		/**
		 * The meta object literal for the '<em><b>Grupo Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARTEFACTO__GRUPO_ID = eINSTANCE.getArtefacto_GrupoId();

		/**
		 * The meta object literal for the '<em><b>Artefactot Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARTEFACTO__ARTEFACTOT_ID = eINSTANCE.getArtefacto_ArtefactotId();

		/**
		 * The meta object literal for the '<em><b>Descripcion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARTEFACTO__DESCRIPCION = eINSTANCE.getArtefacto_Descripcion();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARTEFACTO__VERSION = eINSTANCE.getArtefacto_Version();

		/**
		 * The meta object literal for the '{@link diagramaClasesCompleto.impl.RetornableImpl <em>Retornable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagramaClasesCompleto.impl.RetornableImpl
		 * @see diagramaClasesCompleto.impl.DiagramaClasesCompletoPackageImpl#getRetornable()
		 * @generated
		 */
		EClass RETORNABLE = eINSTANCE.getRetornable();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETORNABLE__NOMBRE = eINSTANCE.getRetornable_Nombre();

		/**
		 * The meta object literal for the '<em><b>Visibilidad</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETORNABLE__VISIBILIDAD = eINSTANCE.getRetornable_Visibilidad();

		/**
		 * The meta object literal for the '<em><b>Es Final</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETORNABLE__ES_FINAL = eINSTANCE.getRetornable_EsFinal();

		/**
		 * The meta object literal for the '<em><b>Es Static</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETORNABLE__ES_STATIC = eINSTANCE.getRetornable_EsStatic();

		/**
		 * The meta object literal for the '{@link diagramaClasesCompleto.impl.EndPointImpl <em>End Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagramaClasesCompleto.impl.EndPointImpl
		 * @see diagramaClasesCompleto.impl.DiagramaClasesCompletoPackageImpl#getEndPoint()
		 * @generated
		 */
		EClass END_POINT = eINSTANCE.getEndPoint();

		/**
		 * The meta object literal for the '<em><b>Tipo Verdo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute END_POINT__TIPO_VERDO = eINSTANCE.getEndPoint_TipoVerdo();

		/**
		 * The meta object literal for the '<em><b>Tipo Transferencia Entrada</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute END_POINT__TIPO_TRANSFERENCIA_ENTRADA = eINSTANCE.getEndPoint_TipoTransferenciaEntrada();

		/**
		 * The meta object literal for the '<em><b>Tipo Transferencia Salida</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute END_POINT__TIPO_TRANSFERENCIA_SALIDA = eINSTANCE.getEndPoint_TipoTransferenciaSalida();

		/**
		 * The meta object literal for the '<em><b>Nombre Publicado</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute END_POINT__NOMBRE_PUBLICADO = eINSTANCE.getEndPoint_NombrePublicado();

		/**
		 * The meta object literal for the '{@link diagramaClasesCompleto.impl.ConfiguracionDBImpl <em>Configuracion DB</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagramaClasesCompleto.impl.ConfiguracionDBImpl
		 * @see diagramaClasesCompleto.impl.DiagramaClasesCompletoPackageImpl#getConfiguracionDB()
		 * @generated
		 */
		EClass CONFIGURACION_DB = eINSTANCE.getConfiguracionDB();

		/**
		 * The meta object literal for the '<em><b>Db Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURACION_DB__DB_NOMBRE = eINSTANCE.getConfiguracionDB_DbNombre();

		/**
		 * The meta object literal for the '<em><b>Db Usuario</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURACION_DB__DB_USUARIO = eINSTANCE.getConfiguracionDB_DbUsuario();

		/**
		 * The meta object literal for the '<em><b>Db Puerto</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURACION_DB__DB_PUERTO = eINSTANCE.getConfiguracionDB_DbPuerto();

		/**
		 * The meta object literal for the '<em><b>Ip</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURACION_DB__IP = eINSTANCE.getConfiguracionDB_Ip();

		/**
		 * The meta object literal for the '<em><b>Db Contrasena</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURACION_DB__DB_CONTRASENA = eINSTANCE.getConfiguracionDB_DbContrasena();

		/**
		 * The meta object literal for the '<em><b>Server Puerto</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURACION_DB__SERVER_PUERTO = eINSTANCE.getConfiguracionDB_ServerPuerto();

		/**
		 * The meta object literal for the '<em><b>Tipo Proveedor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURACION_DB__TIPO_PROVEEDOR = eINSTANCE.getConfiguracionDB_TipoProveedor();

		/**
		 * The meta object literal for the '{@link diagramaClasesCompleto.impl.ConfiguracionDockerImpl <em>Configuracion Docker</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagramaClasesCompleto.impl.ConfiguracionDockerImpl
		 * @see diagramaClasesCompleto.impl.DiagramaClasesCompletoPackageImpl#getConfiguracionDocker()
		 * @generated
		 */
		EClass CONFIGURACION_DOCKER = eINSTANCE.getConfiguracionDocker();

		/**
		 * The meta object literal for the '<em><b>Nombre Contenedor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURACION_DOCKER__NOMBRE_CONTENEDOR = eINSTANCE.getConfiguracionDocker_NombreContenedor();

		/**
		 * The meta object literal for the '<em><b>Puerto Interior</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURACION_DOCKER__PUERTO_INTERIOR = eINSTANCE.getConfiguracionDocker_PuertoInterior();

		/**
		 * The meta object literal for the '<em><b>Tipo Reinicio</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURACION_DOCKER__TIPO_REINICIO = eINSTANCE.getConfiguracionDocker_TipoReinicio();

		/**
		 * The meta object literal for the '<em><b>Nombre Imagen</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURACION_DOCKER__NOMBRE_IMAGEN = eINSTANCE.getConfiguracionDocker_NombreImagen();

		/**
		 * The meta object literal for the '{@link diagramaClasesCompleto.impl.ConfiguracionLenguajeImpl <em>Configuracion Lenguaje</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagramaClasesCompleto.impl.ConfiguracionLenguajeImpl
		 * @see diagramaClasesCompleto.impl.DiagramaClasesCompletoPackageImpl#getConfiguracionLenguaje()
		 * @generated
		 */
		EClass CONFIGURACION_LENGUAJE = eINSTANCE.getConfiguracionLenguaje();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURACION_LENGUAJE__VERSION = eINSTANCE.getConfiguracionLenguaje_Version();

		/**
		 * The meta object literal for the '<em><b>Lenguaje</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURACION_LENGUAJE__LENGUAJE = eINSTANCE.getConfiguracionLenguaje_Lenguaje();

		/**
		 * The meta object literal for the '{@link diagramaClasesCompleto.impl.ParametroInternoImpl <em>Parametro Interno</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagramaClasesCompleto.impl.ParametroInternoImpl
		 * @see diagramaClasesCompleto.impl.DiagramaClasesCompletoPackageImpl#getParametroInterno()
		 * @generated
		 */
		EClass PARAMETRO_INTERNO = eINSTANCE.getParametroInterno();

		/**
		 * The meta object literal for the '<em><b>Tipo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETRO_INTERNO__TIPO = eINSTANCE.getParametroInterno_Tipo();

		/**
		 * The meta object literal for the '{@link diagramaClasesCompleto.impl.ConfiguracionMicroserviciosImpl <em>Configuracion Microservicios</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagramaClasesCompleto.impl.ConfiguracionMicroserviciosImpl
		 * @see diagramaClasesCompleto.impl.DiagramaClasesCompletoPackageImpl#getConfiguracionMicroservicios()
		 * @generated
		 */
		EClass CONFIGURACION_MICROSERVICIOS = eINSTANCE.getConfiguracionMicroservicios();

		/**
		 * The meta object literal for the '<em><b>Ip Discovery</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURACION_MICROSERVICIOS__IP_DISCOVERY = eINSTANCE.getConfiguracionMicroservicios_IpDiscovery();

		/**
		 * The meta object literal for the '<em><b>Puerto Discovery</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURACION_MICROSERVICIOS__PUERTO_DISCOVERY = eINSTANCE
				.getConfiguracionMicroservicios_PuertoDiscovery();

		/**
		 * The meta object literal for the '{@link diagramaClasesCompleto.TipoRelacion <em>Tipo Relacion</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagramaClasesCompleto.TipoRelacion
		 * @see diagramaClasesCompleto.impl.DiagramaClasesCompletoPackageImpl#getTipoRelacion()
		 * @generated
		 */
		EEnum TIPO_RELACION = eINSTANCE.getTipoRelacion();

		/**
		 * The meta object literal for the '{@link diagramaClasesCompleto.TipoDato <em>Tipo Dato</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagramaClasesCompleto.TipoDato
		 * @see diagramaClasesCompleto.impl.DiagramaClasesCompletoPackageImpl#getTipoDato()
		 * @generated
		 */
		EEnum TIPO_DATO = eINSTANCE.getTipoDato();

		/**
		 * The meta object literal for the '{@link diagramaClasesCompleto.TipoRetorno <em>Tipo Retorno</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagramaClasesCompleto.TipoRetorno
		 * @see diagramaClasesCompleto.impl.DiagramaClasesCompletoPackageImpl#getTipoRetorno()
		 * @generated
		 */
		EEnum TIPO_RETORNO = eINSTANCE.getTipoRetorno();

		/**
		 * The meta object literal for the '{@link diagramaClasesCompleto.ModicadoresAcceso <em>Modicadores Acceso</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagramaClasesCompleto.ModicadoresAcceso
		 * @see diagramaClasesCompleto.impl.DiagramaClasesCompletoPackageImpl#getModicadoresAcceso()
		 * @generated
		 */
		EEnum MODICADORES_ACCESO = eINSTANCE.getModicadoresAcceso();

		/**
		 * The meta object literal for the '{@link diagramaClasesCompleto.Multiplicidad <em>Multiplicidad</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagramaClasesCompleto.Multiplicidad
		 * @see diagramaClasesCompleto.impl.DiagramaClasesCompletoPackageImpl#getMultiplicidad()
		 * @generated
		 */
		EEnum MULTIPLICIDAD = eINSTANCE.getMultiplicidad();

		/**
		 * The meta object literal for the '{@link diagramaClasesCompleto.VerbosHTTP <em>Verbos HTTP</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagramaClasesCompleto.VerbosHTTP
		 * @see diagramaClasesCompleto.impl.DiagramaClasesCompletoPackageImpl#getVerbosHTTP()
		 * @generated
		 */
		EEnum VERBOS_HTTP = eINSTANCE.getVerbosHTTP();

		/**
		 * The meta object literal for the '{@link diagramaClasesCompleto.TipoTransferencia <em>Tipo Transferencia</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagramaClasesCompleto.TipoTransferencia
		 * @see diagramaClasesCompleto.impl.DiagramaClasesCompletoPackageImpl#getTipoTransferencia()
		 * @generated
		 */
		EEnum TIPO_TRANSFERENCIA = eINSTANCE.getTipoTransferencia();

		/**
		 * The meta object literal for the '{@link diagramaClasesCompleto.TipoReinicio <em>Tipo Reinicio</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagramaClasesCompleto.TipoReinicio
		 * @see diagramaClasesCompleto.impl.DiagramaClasesCompletoPackageImpl#getTipoReinicio()
		 * @generated
		 */
		EEnum TIPO_REINICIO = eINSTANCE.getTipoReinicio();

		/**
		 * The meta object literal for the '{@link diagramaClasesCompleto.ProveedorDb <em>Proveedor Db</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagramaClasesCompleto.ProveedorDb
		 * @see diagramaClasesCompleto.impl.DiagramaClasesCompletoPackageImpl#getProveedorDb()
		 * @generated
		 */
		EEnum PROVEEDOR_DB = eINSTANCE.getProveedorDb();

		/**
		 * The meta object literal for the '{@link diagramaClasesCompleto.Lenguaje <em>Lenguaje</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagramaClasesCompleto.Lenguaje
		 * @see diagramaClasesCompleto.impl.DiagramaClasesCompletoPackageImpl#getLenguaje()
		 * @generated
		 */
		EEnum LENGUAJE = eINSTANCE.getLenguaje();

		/**
		 * The meta object literal for the '{@link diagramaClasesCompleto.RepresentacionGrafica <em>Representacion Grafica</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagramaClasesCompleto.RepresentacionGrafica
		 * @see diagramaClasesCompleto.impl.DiagramaClasesCompletoPackageImpl#getRepresentacionGrafica()
		 * @generated
		 */
		EEnum REPRESENTACION_GRAFICA = eINSTANCE.getRepresentacionGrafica();

		/**
		 * The meta object literal for the '{@link diagramaClasesCompleto.TipoABM <em>Tipo ABM</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagramaClasesCompleto.TipoABM
		 * @see diagramaClasesCompleto.impl.DiagramaClasesCompletoPackageImpl#getTipoABM()
		 * @generated
		 */
		EEnum TIPO_ABM = eINSTANCE.getTipoABM();

	}

} //DiagramaClasesCompletoPackage
