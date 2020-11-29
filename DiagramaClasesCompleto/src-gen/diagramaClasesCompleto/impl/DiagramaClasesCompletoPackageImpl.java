/**
 */
package diagramaClasesCompleto.impl;

import diagramaClasesCompleto.Artefacto;
import diagramaClasesCompleto.Atributo;
import diagramaClasesCompleto.Clase;
import diagramaClasesCompleto.Clasificador;
import diagramaClasesCompleto.ConfiguracionDB;
import diagramaClasesCompleto.ConfiguracionDocker;
import diagramaClasesCompleto.ConfiguracionLenguaje;
import diagramaClasesCompleto.ConfiguracionMicroservicios;
import diagramaClasesCompleto.DiagramaClases;
import diagramaClasesCompleto.DiagramaClasesCompletoFactory;
import diagramaClasesCompleto.DiagramaClasesCompletoPackage;
import diagramaClasesCompleto.EndPoint;
import diagramaClasesCompleto.Herencia;
import diagramaClasesCompleto.Interface;
import diagramaClasesCompleto.Lenguaje;
import diagramaClasesCompleto.ModicadoresAcceso;
import diagramaClasesCompleto.Multiplicidad;
import diagramaClasesCompleto.Operacion;
import diagramaClasesCompleto.ParametroInterno;
import diagramaClasesCompleto.ProveedorDb;
import diagramaClasesCompleto.Realizacion;
import diagramaClasesCompleto.Relacion;
import diagramaClasesCompleto.RepresentacionGrafica;
import diagramaClasesCompleto.Retornable;
import diagramaClasesCompleto.TipoABM;
import diagramaClasesCompleto.TipoDato;
import diagramaClasesCompleto.TipoReinicio;
import diagramaClasesCompleto.TipoRelacion;
import diagramaClasesCompleto.TipoRetorno;
import diagramaClasesCompleto.TipoTransferencia;
import diagramaClasesCompleto.VerbosHTTP;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DiagramaClasesCompletoPackageImpl extends EPackageImpl implements DiagramaClasesCompletoPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diagramaClasesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clasificadorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass claseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relacionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operacionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass atributoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass packageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass herenciaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass realizacionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass artefactoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass retornableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass endPointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configuracionDBEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configuracionDockerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configuracionLenguajeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parametroInternoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configuracionMicroserviciosEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tipoRelacionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tipoDatoEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tipoRetornoEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum modicadoresAccesoEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum multiplicidadEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum verbosHTTPEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tipoTransferenciaEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tipoReinicioEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum proveedorDbEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum lenguajeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum representacionGraficaEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tipoABMEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see diagramaClasesCompleto.DiagramaClasesCompletoPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DiagramaClasesCompletoPackageImpl() {
		super(eNS_URI, DiagramaClasesCompletoFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link DiagramaClasesCompletoPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DiagramaClasesCompletoPackage init() {
		if (isInited)
			return (DiagramaClasesCompletoPackage) EPackage.Registry.INSTANCE
					.getEPackage(DiagramaClasesCompletoPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredDiagramaClasesCompletoPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		DiagramaClasesCompletoPackageImpl theDiagramaClasesCompletoPackage = registeredDiagramaClasesCompletoPackage instanceof DiagramaClasesCompletoPackageImpl
				? (DiagramaClasesCompletoPackageImpl) registeredDiagramaClasesCompletoPackage
				: new DiagramaClasesCompletoPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theDiagramaClasesCompletoPackage.createPackageContents();

		// Initialize created meta-data
		theDiagramaClasesCompletoPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDiagramaClasesCompletoPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DiagramaClasesCompletoPackage.eNS_URI, theDiagramaClasesCompletoPackage);
		return theDiagramaClasesCompletoPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiagramaClases() {
		return diagramaClasesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDiagramaClases_Packages_contenidos() {
		return (EReference) diagramaClasesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDiagramaClases_Artefacto_contenido() {
		return (EReference) diagramaClasesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDiagramaClases_Configuraciondb() {
		return (EReference) diagramaClasesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDiagramaClases_Configuraciondocker() {
		return (EReference) diagramaClasesEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDiagramaClases_Configuracionlenguaje() {
		return (EReference) diagramaClasesEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDiagramaClases_Configuracionmicroservicios() {
		return (EReference) diagramaClasesEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getClasificador() {
		return clasificadorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getClasificador_Nombre() {
		return (EAttribute) clasificadorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getClasificador_Atributos_contenidos() {
		return (EReference) clasificadorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getClasificador_Operaciones_contenidas() {
		return (EReference) clasificadorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getClasificador_Herencias_contenidas() {
		return (EReference) clasificadorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getClase() {
		return claseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getClase_Relaciones_contenidas() {
		return (EReference) claseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getClase_EsAbstracta() {
		return (EAttribute) claseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getClase_Realizaciones_contenidas() {
		return (EReference) claseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getClase_EsAsociativa() {
		return (EAttribute) claseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getClase_EsAuditable() {
		return (EAttribute) claseEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getClase_TieneABM() {
		return (EAttribute) claseEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInterface() {
		return interfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRelacion() {
		return relacionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRelacion_Destino() {
		return (EReference) relacionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRelacion_Nombre() {
		return (EAttribute) relacionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRelacion_Tipo() {
		return (EAttribute) relacionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRelacion_Multiplicidad() {
		return (EAttribute) relacionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRelacion_Origen() {
		return (EReference) relacionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRelacion_Clases_asociativas_contenidas() {
		return (EReference) relacionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRelacion_EsFinal() {
		return (EAttribute) relacionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRelacion_EsStatic() {
		return (EAttribute) relacionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRelacion_Visibilidad() {
		return (EAttribute) relacionEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRelacion_TipoABM() {
		return (EAttribute) relacionEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOperacion() {
		return operacionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOperacion_TipoRetorno() {
		return (EAttribute) operacionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOperacion_EsAbstracta() {
		return (EAttribute) operacionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOperacion_Parametros_contenidos() {
		return (EReference) operacionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOperacion_Endpoint() {
		return (EReference) operacionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOperacion_Parametros_internos() {
		return (EReference) operacionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAtributo() {
		return atributoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAtributo_Tipo() {
		return (EAttribute) atributoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAtributo_EsAuditable() {
		return (EAttribute) atributoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAtributo_Pseudonimo() {
		return (EAttribute) atributoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAtributo_RepresentacionGrafica() {
		return (EAttribute) atributoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPackage() {
		return packageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPackage_Clasificadores_contenidos() {
		return (EReference) packageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPackage_Nombre() {
		return (EAttribute) packageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHerencia() {
		return herenciaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHerencia_Origen() {
		return (EReference) herenciaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHerencia_Destino() {
		return (EReference) herenciaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRealizacion() {
		return realizacionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRealizacion_Destino() {
		return (EReference) realizacionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRealizacion_Origen() {
		return (EReference) realizacionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getArtefacto() {
		return artefactoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getArtefacto_Nombre() {
		return (EAttribute) artefactoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getArtefacto_GrupoId() {
		return (EAttribute) artefactoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getArtefacto_ArtefactotId() {
		return (EAttribute) artefactoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getArtefacto_Descripcion() {
		return (EAttribute) artefactoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getArtefacto_Version() {
		return (EAttribute) artefactoEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRetornable() {
		return retornableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRetornable_Nombre() {
		return (EAttribute) retornableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRetornable_Visibilidad() {
		return (EAttribute) retornableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRetornable_EsFinal() {
		return (EAttribute) retornableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRetornable_EsStatic() {
		return (EAttribute) retornableEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEndPoint() {
		return endPointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEndPoint_TipoVerdo() {
		return (EAttribute) endPointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEndPoint_TipoTransferenciaEntrada() {
		return (EAttribute) endPointEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEndPoint_TipoTransferenciaSalida() {
		return (EAttribute) endPointEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEndPoint_NombrePublicado() {
		return (EAttribute) endPointEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConfiguracionDB() {
		return configuracionDBEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConfiguracionDB_DbNombre() {
		return (EAttribute) configuracionDBEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConfiguracionDB_DbUsuario() {
		return (EAttribute) configuracionDBEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConfiguracionDB_DbPuerto() {
		return (EAttribute) configuracionDBEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConfiguracionDB_Ip() {
		return (EAttribute) configuracionDBEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConfiguracionDB_DbContrasena() {
		return (EAttribute) configuracionDBEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConfiguracionDB_ServerPuerto() {
		return (EAttribute) configuracionDBEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConfiguracionDB_TipoProveedor() {
		return (EAttribute) configuracionDBEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConfiguracionDocker() {
		return configuracionDockerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConfiguracionDocker_NombreContenedor() {
		return (EAttribute) configuracionDockerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConfiguracionDocker_PuertoInterior() {
		return (EAttribute) configuracionDockerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConfiguracionDocker_TipoReinicio() {
		return (EAttribute) configuracionDockerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConfiguracionDocker_NombreImagen() {
		return (EAttribute) configuracionDockerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConfiguracionLenguaje() {
		return configuracionLenguajeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConfiguracionLenguaje_Version() {
		return (EAttribute) configuracionLenguajeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConfiguracionLenguaje_Lenguaje() {
		return (EAttribute) configuracionLenguajeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getParametroInterno() {
		return parametroInternoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParametroInterno_Tipo() {
		return (EAttribute) parametroInternoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConfiguracionMicroservicios() {
		return configuracionMicroserviciosEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConfiguracionMicroservicios_IpDiscovery() {
		return (EAttribute) configuracionMicroserviciosEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConfiguracionMicroservicios_PuertoDiscovery() {
		return (EAttribute) configuracionMicroserviciosEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getTipoRelacion() {
		return tipoRelacionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getTipoDato() {
		return tipoDatoEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getTipoRetorno() {
		return tipoRetornoEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getModicadoresAcceso() {
		return modicadoresAccesoEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getMultiplicidad() {
		return multiplicidadEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getVerbosHTTP() {
		return verbosHTTPEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getTipoTransferencia() {
		return tipoTransferenciaEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getTipoReinicio() {
		return tipoReinicioEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getProveedorDb() {
		return proveedorDbEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getLenguaje() {
		return lenguajeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getRepresentacionGrafica() {
		return representacionGraficaEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getTipoABM() {
		return tipoABMEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiagramaClasesCompletoFactory getDiagramaClasesCompletoFactory() {
		return (DiagramaClasesCompletoFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		diagramaClasesEClass = createEClass(DIAGRAMA_CLASES);
		createEReference(diagramaClasesEClass, DIAGRAMA_CLASES__PACKAGES_CONTENIDOS);
		createEReference(diagramaClasesEClass, DIAGRAMA_CLASES__ARTEFACTO_CONTENIDO);
		createEReference(diagramaClasesEClass, DIAGRAMA_CLASES__CONFIGURACIONDB);
		createEReference(diagramaClasesEClass, DIAGRAMA_CLASES__CONFIGURACIONDOCKER);
		createEReference(diagramaClasesEClass, DIAGRAMA_CLASES__CONFIGURACIONLENGUAJE);
		createEReference(diagramaClasesEClass, DIAGRAMA_CLASES__CONFIGURACIONMICROSERVICIOS);

		clasificadorEClass = createEClass(CLASIFICADOR);
		createEAttribute(clasificadorEClass, CLASIFICADOR__NOMBRE);
		createEReference(clasificadorEClass, CLASIFICADOR__ATRIBUTOS_CONTENIDOS);
		createEReference(clasificadorEClass, CLASIFICADOR__OPERACIONES_CONTENIDAS);
		createEReference(clasificadorEClass, CLASIFICADOR__HERENCIAS_CONTENIDAS);

		claseEClass = createEClass(CLASE);
		createEReference(claseEClass, CLASE__RELACIONES_CONTENIDAS);
		createEAttribute(claseEClass, CLASE__ES_ABSTRACTA);
		createEReference(claseEClass, CLASE__REALIZACIONES_CONTENIDAS);
		createEAttribute(claseEClass, CLASE__ES_ASOCIATIVA);
		createEAttribute(claseEClass, CLASE__ES_AUDITABLE);
		createEAttribute(claseEClass, CLASE__TIENE_ABM);

		interfaceEClass = createEClass(INTERFACE);

		relacionEClass = createEClass(RELACION);
		createEReference(relacionEClass, RELACION__DESTINO);
		createEAttribute(relacionEClass, RELACION__NOMBRE);
		createEAttribute(relacionEClass, RELACION__TIPO);
		createEAttribute(relacionEClass, RELACION__MULTIPLICIDAD);
		createEReference(relacionEClass, RELACION__ORIGEN);
		createEReference(relacionEClass, RELACION__CLASES_ASOCIATIVAS_CONTENIDAS);
		createEAttribute(relacionEClass, RELACION__ES_FINAL);
		createEAttribute(relacionEClass, RELACION__ES_STATIC);
		createEAttribute(relacionEClass, RELACION__VISIBILIDAD);
		createEAttribute(relacionEClass, RELACION__TIPO_ABM);

		operacionEClass = createEClass(OPERACION);
		createEAttribute(operacionEClass, OPERACION__TIPO_RETORNO);
		createEAttribute(operacionEClass, OPERACION__ES_ABSTRACTA);
		createEReference(operacionEClass, OPERACION__PARAMETROS_CONTENIDOS);
		createEReference(operacionEClass, OPERACION__ENDPOINT);
		createEReference(operacionEClass, OPERACION__PARAMETROS_INTERNOS);

		atributoEClass = createEClass(ATRIBUTO);
		createEAttribute(atributoEClass, ATRIBUTO__TIPO);
		createEAttribute(atributoEClass, ATRIBUTO__ES_AUDITABLE);
		createEAttribute(atributoEClass, ATRIBUTO__PSEUDONIMO);
		createEAttribute(atributoEClass, ATRIBUTO__REPRESENTACION_GRAFICA);

		packageEClass = createEClass(PACKAGE);
		createEReference(packageEClass, PACKAGE__CLASIFICADORES_CONTENIDOS);
		createEAttribute(packageEClass, PACKAGE__NOMBRE);

		herenciaEClass = createEClass(HERENCIA);
		createEReference(herenciaEClass, HERENCIA__ORIGEN);
		createEReference(herenciaEClass, HERENCIA__DESTINO);

		realizacionEClass = createEClass(REALIZACION);
		createEReference(realizacionEClass, REALIZACION__DESTINO);
		createEReference(realizacionEClass, REALIZACION__ORIGEN);

		artefactoEClass = createEClass(ARTEFACTO);
		createEAttribute(artefactoEClass, ARTEFACTO__NOMBRE);
		createEAttribute(artefactoEClass, ARTEFACTO__GRUPO_ID);
		createEAttribute(artefactoEClass, ARTEFACTO__ARTEFACTOT_ID);
		createEAttribute(artefactoEClass, ARTEFACTO__DESCRIPCION);
		createEAttribute(artefactoEClass, ARTEFACTO__VERSION);

		retornableEClass = createEClass(RETORNABLE);
		createEAttribute(retornableEClass, RETORNABLE__NOMBRE);
		createEAttribute(retornableEClass, RETORNABLE__VISIBILIDAD);
		createEAttribute(retornableEClass, RETORNABLE__ES_FINAL);
		createEAttribute(retornableEClass, RETORNABLE__ES_STATIC);

		endPointEClass = createEClass(END_POINT);
		createEAttribute(endPointEClass, END_POINT__TIPO_VERDO);
		createEAttribute(endPointEClass, END_POINT__TIPO_TRANSFERENCIA_ENTRADA);
		createEAttribute(endPointEClass, END_POINT__TIPO_TRANSFERENCIA_SALIDA);
		createEAttribute(endPointEClass, END_POINT__NOMBRE_PUBLICADO);

		configuracionDBEClass = createEClass(CONFIGURACION_DB);
		createEAttribute(configuracionDBEClass, CONFIGURACION_DB__DB_NOMBRE);
		createEAttribute(configuracionDBEClass, CONFIGURACION_DB__DB_USUARIO);
		createEAttribute(configuracionDBEClass, CONFIGURACION_DB__DB_PUERTO);
		createEAttribute(configuracionDBEClass, CONFIGURACION_DB__IP);
		createEAttribute(configuracionDBEClass, CONFIGURACION_DB__DB_CONTRASENA);
		createEAttribute(configuracionDBEClass, CONFIGURACION_DB__SERVER_PUERTO);
		createEAttribute(configuracionDBEClass, CONFIGURACION_DB__TIPO_PROVEEDOR);

		configuracionDockerEClass = createEClass(CONFIGURACION_DOCKER);
		createEAttribute(configuracionDockerEClass, CONFIGURACION_DOCKER__NOMBRE_CONTENEDOR);
		createEAttribute(configuracionDockerEClass, CONFIGURACION_DOCKER__PUERTO_INTERIOR);
		createEAttribute(configuracionDockerEClass, CONFIGURACION_DOCKER__TIPO_REINICIO);
		createEAttribute(configuracionDockerEClass, CONFIGURACION_DOCKER__NOMBRE_IMAGEN);

		configuracionLenguajeEClass = createEClass(CONFIGURACION_LENGUAJE);
		createEAttribute(configuracionLenguajeEClass, CONFIGURACION_LENGUAJE__VERSION);
		createEAttribute(configuracionLenguajeEClass, CONFIGURACION_LENGUAJE__LENGUAJE);

		parametroInternoEClass = createEClass(PARAMETRO_INTERNO);
		createEAttribute(parametroInternoEClass, PARAMETRO_INTERNO__TIPO);

		configuracionMicroserviciosEClass = createEClass(CONFIGURACION_MICROSERVICIOS);
		createEAttribute(configuracionMicroserviciosEClass, CONFIGURACION_MICROSERVICIOS__IP_DISCOVERY);
		createEAttribute(configuracionMicroserviciosEClass, CONFIGURACION_MICROSERVICIOS__PUERTO_DISCOVERY);

		// Create enums
		tipoRelacionEEnum = createEEnum(TIPO_RELACION);
		tipoDatoEEnum = createEEnum(TIPO_DATO);
		tipoRetornoEEnum = createEEnum(TIPO_RETORNO);
		modicadoresAccesoEEnum = createEEnum(MODICADORES_ACCESO);
		multiplicidadEEnum = createEEnum(MULTIPLICIDAD);
		verbosHTTPEEnum = createEEnum(VERBOS_HTTP);
		tipoTransferenciaEEnum = createEEnum(TIPO_TRANSFERENCIA);
		tipoReinicioEEnum = createEEnum(TIPO_REINICIO);
		proveedorDbEEnum = createEEnum(PROVEEDOR_DB);
		lenguajeEEnum = createEEnum(LENGUAJE);
		representacionGraficaEEnum = createEEnum(REPRESENTACION_GRAFICA);
		tipoABMEEnum = createEEnum(TIPO_ABM);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		claseEClass.getESuperTypes().add(this.getClasificador());
		interfaceEClass.getESuperTypes().add(this.getClasificador());
		operacionEClass.getESuperTypes().add(this.getRetornable());
		atributoEClass.getESuperTypes().add(this.getRetornable());

		// Initialize classes, features, and operations; add parameters
		initEClass(diagramaClasesEClass, DiagramaClases.class, "DiagramaClases", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDiagramaClases_Packages_contenidos(), this.getPackage(), null, "packages_contenidos", null, 0,
				-1, DiagramaClases.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiagramaClases_Artefacto_contenido(), this.getArtefacto(), null, "artefacto_contenido", null,
				1, 1, DiagramaClases.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiagramaClases_Configuraciondb(), this.getConfiguracionDB(), null, "configuraciondb", null, 0,
				-1, DiagramaClases.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiagramaClases_Configuraciondocker(), this.getConfiguracionDocker(), null,
				"configuraciondocker", null, 0, -1, DiagramaClases.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiagramaClases_Configuracionlenguaje(), this.getConfiguracionLenguaje(), null,
				"configuracionlenguaje", null, 0, -1, DiagramaClases.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiagramaClases_Configuracionmicroservicios(), this.getConfiguracionMicroservicios(), null,
				"configuracionmicroservicios", null, 0, -1, DiagramaClases.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(clasificadorEClass, Clasificador.class, "Clasificador", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getClasificador_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, Clasificador.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClasificador_Atributos_contenidos(), this.getAtributo(), null, "atributos_contenidos", null,
				0, -1, Clasificador.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClasificador_Operaciones_contenidas(), this.getOperacion(), null, "operaciones_contenidas",
				null, 0, -1, Clasificador.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClasificador_Herencias_contenidas(), this.getHerencia(), null, "herencias_contenidas", null,
				0, -1, Clasificador.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(claseEClass, Clase.class, "Clase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClase_Relaciones_contenidas(), this.getRelacion(), null, "relaciones_contenidas", null, 0, -1,
				Clase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClase_EsAbstracta(), ecorePackage.getEBoolean(), "esAbstracta", null, 0, 1, Clase.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClase_Realizaciones_contenidas(), this.getRealizacion(), null, "realizaciones_contenidas",
				null, 0, -1, Clase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClase_EsAsociativa(), ecorePackage.getEBoolean(), "esAsociativa", null, 0, 1, Clase.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClase_EsAuditable(), ecorePackage.getEBoolean(), "esAuditable", null, 0, 1, Clase.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClase_TieneABM(), ecorePackage.getEBoolean(), "tieneABM", null, 0, 1, Clase.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interfaceEClass, Interface.class, "Interface", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(relacionEClass, Relacion.class, "Relacion", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelacion_Destino(), this.getClasificador(), null, "destino", null, 0, 1, Relacion.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelacion_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, Relacion.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelacion_Tipo(), this.getTipoRelacion(), "tipo", null, 0, 1, Relacion.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelacion_Multiplicidad(), this.getMultiplicidad(), "multiplicidad", null, 0, 1,
				Relacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getRelacion_Origen(), this.getClase(), null, "origen", null, 0, 1, Relacion.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getRelacion_Clases_asociativas_contenidas(), this.getClase(), null,
				"clases_asociativas_contenidas", null, 0, -1, Relacion.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelacion_EsFinal(), ecorePackage.getEBoolean(), "esFinal", null, 0, 1, Relacion.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelacion_EsStatic(), ecorePackage.getEBoolean(), "esStatic", null, 0, 1, Relacion.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelacion_Visibilidad(), this.getModicadoresAcceso(), "visibilidad", "private", 0, 1,
				Relacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelacion_TipoABM(), this.getTipoABM(), "tipoABM", "sinRepresentacion", 0, 1, Relacion.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operacionEClass, Operacion.class, "Operacion", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOperacion_TipoRetorno(), this.getTipoRetorno(), "tipoRetorno", null, 0, 1, Operacion.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperacion_EsAbstracta(), ecorePackage.getEBoolean(), "esAbstracta", "false", 0, 1,
				Operacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getOperacion_Parametros_contenidos(), this.getRetornable(), null, "parametros_contenidos", null,
				0, -1, Operacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperacion_Endpoint(), this.getEndPoint(), null, "endpoint", null, 1, 1, Operacion.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperacion_Parametros_internos(), this.getParametroInterno(), null, "parametros_internos",
				null, 0, -1, Operacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(atributoEClass, Atributo.class, "Atributo", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAtributo_Tipo(), this.getTipoDato(), "tipo", "int", 0, 1, Atributo.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAtributo_EsAuditable(), ecorePackage.getEBoolean(), "esAuditable", null, 0, 1, Atributo.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAtributo_Pseudonimo(), ecorePackage.getEString(), "pseudonimo", null, 0, 1, Atributo.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAtributo_RepresentacionGrafica(), this.getRepresentacionGrafica(), "representacionGrafica",
				null, 0, 1, Atributo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(packageEClass, diagramaClasesCompleto.Package.class, "Package", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPackage_Clasificadores_contenidos(), this.getClasificador(), null,
				"clasificadores_contenidos", null, 0, -1, diagramaClasesCompleto.Package.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getPackage_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1,
				diagramaClasesCompleto.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(herenciaEClass, Herencia.class, "Herencia", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHerencia_Origen(), this.getClasificador(), null, "origen", null, 0, 1, Herencia.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHerencia_Destino(), this.getClasificador(), null, "destino", null, 0, 1, Herencia.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(realizacionEClass, Realizacion.class, "Realizacion", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRealizacion_Destino(), this.getInterface(), null, "destino", null, 0, 1, Realizacion.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRealizacion_Origen(), this.getClase(), null, "origen", null, 0, 1, Realizacion.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(artefactoEClass, Artefacto.class, "Artefacto", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArtefacto_Nombre(), ecorePackage.getEString(), "nombre", "Demo", 0, 1, Artefacto.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArtefacto_GrupoId(), ecorePackage.getEString(), "grupoId", "com.example", 0, 1,
				Artefacto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getArtefacto_ArtefactotId(), ecorePackage.getEString(), "artefactotId", "demo", 0, 1,
				Artefacto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getArtefacto_Descripcion(), ecorePackage.getEString(), "descripcion", "Demo project", 0, 1,
				Artefacto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getArtefacto_Version(), ecorePackage.getEString(), "version", "0.0.1-SNAPSHOT", 0, 1,
				Artefacto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(retornableEClass, Retornable.class, "Retornable", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRetornable_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, Retornable.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRetornable_Visibilidad(), this.getModicadoresAcceso(), "visibilidad", null, 0, 1,
				Retornable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getRetornable_EsFinal(), ecorePackage.getEBoolean(), "esFinal", "false", 0, 1, Retornable.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRetornable_EsStatic(), ecorePackage.getEBoolean(), "esStatic", null, 0, 1, Retornable.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(endPointEClass, EndPoint.class, "EndPoint", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEndPoint_TipoVerdo(), this.getVerbosHTTP(), "tipoVerdo", null, 0, 1, EndPoint.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEndPoint_TipoTransferenciaEntrada(), this.getTipoTransferencia(), "tipoTransferenciaEntrada",
				null, 0, 1, EndPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEndPoint_TipoTransferenciaSalida(), this.getTipoTransferencia(), "tipoTransferenciaSalida",
				null, 0, 1, EndPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEndPoint_NombrePublicado(), ecorePackage.getEString(), "nombrePublicado", null, 0, 1,
				EndPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(configuracionDBEClass, ConfiguracionDB.class, "ConfiguracionDB", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConfiguracionDB_DbNombre(), ecorePackage.getEString(), "dbNombre", null, 0, 1,
				ConfiguracionDB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getConfiguracionDB_DbUsuario(), ecorePackage.getEString(), "dbUsuario", "", 0, 1,
				ConfiguracionDB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getConfiguracionDB_DbPuerto(), ecorePackage.getEInt(), "dbPuerto", null, 0, 1,
				ConfiguracionDB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getConfiguracionDB_Ip(), ecorePackage.getEString(), "ip", null, 0, 1, ConfiguracionDB.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConfiguracionDB_DbContrasena(), ecorePackage.getEString(), "dbContrasena", null, 0, 1,
				ConfiguracionDB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getConfiguracionDB_ServerPuerto(), ecorePackage.getEInt(), "serverPuerto", null, 0, 1,
				ConfiguracionDB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getConfiguracionDB_TipoProveedor(), this.getProveedorDb(), "tipoProveedor", null, 0, 1,
				ConfiguracionDB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(configuracionDockerEClass, ConfiguracionDocker.class, "ConfiguracionDocker", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConfiguracionDocker_NombreContenedor(), ecorePackage.getEString(), "nombreContenedor", null,
				0, 1, ConfiguracionDocker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConfiguracionDocker_PuertoInterior(), ecorePackage.getEInt(), "puertoInterior", null, 0, 1,
				ConfiguracionDocker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConfiguracionDocker_TipoReinicio(), this.getTipoReinicio(), "tipoReinicio", null, 0, 1,
				ConfiguracionDocker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConfiguracionDocker_NombreImagen(), ecorePackage.getEString(), "nombreImagen", null, 0, 1,
				ConfiguracionDocker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(configuracionLenguajeEClass, ConfiguracionLenguaje.class, "ConfiguracionLenguaje", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConfiguracionLenguaje_Version(), ecorePackage.getEString(), "version", null, 0, 1,
				ConfiguracionLenguaje.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConfiguracionLenguaje_Lenguaje(), this.getLenguaje(), "lenguaje", null, 0, 1,
				ConfiguracionLenguaje.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parametroInternoEClass, ParametroInterno.class, "ParametroInterno", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParametroInterno_Tipo(), this.getTipoRetorno(), "tipo", null, 0, 1, ParametroInterno.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(configuracionMicroserviciosEClass, ConfiguracionMicroservicios.class, "ConfiguracionMicroservicios",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConfiguracionMicroservicios_IpDiscovery(), ecorePackage.getEString(), "ipDiscovery",
				"http://localhost", 0, 1, ConfiguracionMicroservicios.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConfiguracionMicroservicios_PuertoDiscovery(), ecorePackage.getEInt(), "puertoDiscovery",
				"8761", 0, 1, ConfiguracionMicroservicios.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(tipoRelacionEEnum, TipoRelacion.class, "TipoRelacion");
		addEEnumLiteral(tipoRelacionEEnum, TipoRelacion.UNIDIRECCIONAL);
		addEEnumLiteral(tipoRelacionEEnum, TipoRelacion.BIDIRECCIONAL);
		addEEnumLiteral(tipoRelacionEEnum, TipoRelacion.COMPOSICION);
		addEEnumLiteral(tipoRelacionEEnum, TipoRelacion.AGREGACION);
		addEEnumLiteral(tipoRelacionEEnum, TipoRelacion.DEPENDENCIA_USO);
		addEEnumLiteral(tipoRelacionEEnum, TipoRelacion.DEPENDENCIA_CREACION);

		initEEnum(tipoDatoEEnum, TipoDato.class, "TipoDato");
		addEEnumLiteral(tipoDatoEEnum, TipoDato.INT);
		addEEnumLiteral(tipoDatoEEnum, TipoDato.FLOAT);
		addEEnumLiteral(tipoDatoEEnum, TipoDato.DOUBLE);
		addEEnumLiteral(tipoDatoEEnum, TipoDato.CHAR);
		addEEnumLiteral(tipoDatoEEnum, TipoDato.BYTE);
		addEEnumLiteral(tipoDatoEEnum, TipoDato.BOOLEAN);
		addEEnumLiteral(tipoDatoEEnum, TipoDato.STRING);
		addEEnumLiteral(tipoDatoEEnum, TipoDato.DATE);

		initEEnum(tipoRetornoEEnum, TipoRetorno.class, "TipoRetorno");
		addEEnumLiteral(tipoRetornoEEnum, TipoRetorno.VOID);
		addEEnumLiteral(tipoRetornoEEnum, TipoRetorno.FLOAT);
		addEEnumLiteral(tipoRetornoEEnum, TipoRetorno.INT);
		addEEnumLiteral(tipoRetornoEEnum, TipoRetorno.DOUBLE);
		addEEnumLiteral(tipoRetornoEEnum, TipoRetorno.CHAR);
		addEEnumLiteral(tipoRetornoEEnum, TipoRetorno.BYTE);
		addEEnumLiteral(tipoRetornoEEnum, TipoRetorno.BOOLEAN);
		addEEnumLiteral(tipoRetornoEEnum, TipoRetorno.STRING);

		initEEnum(modicadoresAccesoEEnum, ModicadoresAcceso.class, "ModicadoresAcceso");
		addEEnumLiteral(modicadoresAccesoEEnum, ModicadoresAcceso.PACKAGE);
		addEEnumLiteral(modicadoresAccesoEEnum, ModicadoresAcceso.PRIVATE);
		addEEnumLiteral(modicadoresAccesoEEnum, ModicadoresAcceso.PUBLIC);
		addEEnumLiteral(modicadoresAccesoEEnum, ModicadoresAcceso.PROTECTED);

		initEEnum(multiplicidadEEnum, Multiplicidad.class, "Multiplicidad");
		addEEnumLiteral(multiplicidadEEnum, Multiplicidad.ONE_TO_ONE);
		addEEnumLiteral(multiplicidadEEnum, Multiplicidad.ONE_TO_MANY);
		addEEnumLiteral(multiplicidadEEnum, Multiplicidad.MANY_TO_ONE);
		addEEnumLiteral(multiplicidadEEnum, Multiplicidad.MANY_TO_MANY);

		initEEnum(verbosHTTPEEnum, VerbosHTTP.class, "VerbosHTTP");
		addEEnumLiteral(verbosHTTPEEnum, VerbosHTTP.GET);
		addEEnumLiteral(verbosHTTPEEnum, VerbosHTTP.POST);
		addEEnumLiteral(verbosHTTPEEnum, VerbosHTTP.PUT);
		addEEnumLiteral(verbosHTTPEEnum, VerbosHTTP.DELETE);
		addEEnumLiteral(verbosHTTPEEnum, VerbosHTTP.PATCH);

		initEEnum(tipoTransferenciaEEnum, TipoTransferencia.class, "TipoTransferencia");
		addEEnumLiteral(tipoTransferenciaEEnum, TipoTransferencia.STRING);
		addEEnumLiteral(tipoTransferenciaEEnum, TipoTransferencia.XML);
		addEEnumLiteral(tipoTransferenciaEEnum, TipoTransferencia.JSON);

		initEEnum(tipoReinicioEEnum, TipoReinicio.class, "TipoReinicio");
		addEEnumLiteral(tipoReinicioEEnum, TipoReinicio.SIEMPRE);
		addEEnumLiteral(tipoReinicioEEnum, TipoReinicio.NUNCA);

		initEEnum(proveedorDbEEnum, ProveedorDb.class, "ProveedorDb");
		addEEnumLiteral(proveedorDbEEnum, ProveedorDb.MY_SQL);
		addEEnumLiteral(proveedorDbEEnum, ProveedorDb.MONGO);
		addEEnumLiteral(proveedorDbEEnum, ProveedorDb.ORACLE);
		addEEnumLiteral(proveedorDbEEnum, ProveedorDb.DB2);

		initEEnum(lenguajeEEnum, Lenguaje.class, "Lenguaje");
		addEEnumLiteral(lenguajeEEnum, Lenguaje.JAVA);
		addEEnumLiteral(lenguajeEEnum, Lenguaje.PYTHON);
		addEEnumLiteral(lenguajeEEnum, Lenguaje.NET);
		addEEnumLiteral(lenguajeEEnum, Lenguaje.NODE);

		initEEnum(representacionGraficaEEnum, RepresentacionGrafica.class, "RepresentacionGrafica");
		addEEnumLiteral(representacionGraficaEEnum, RepresentacionGrafica.TEXT);
		addEEnumLiteral(representacionGraficaEEnum, RepresentacionGrafica.COMBO);
		addEEnumLiteral(representacionGraficaEEnum, RepresentacionGrafica.RADIO);
		addEEnumLiteral(representacionGraficaEEnum, RepresentacionGrafica.CHECKBOX);
		addEEnumLiteral(representacionGraficaEEnum, RepresentacionGrafica.DATE);

		initEEnum(tipoABMEEnum, TipoABM.class, "TipoABM");
		addEEnumLiteral(tipoABMEEnum, TipoABM.SIMPLE);
		addEEnumLiteral(tipoABMEEnum, TipoABM.SELECCIONABLE);
		addEEnumLiteral(tipoABMEEnum, TipoABM.MAESTRO_DETALLE);
		addEEnumLiteral(tipoABMEEnum, TipoABM.MAESTRO_COMBO_DETALLE);
		addEEnumLiteral(tipoABMEEnum, TipoABM.MAESTRO_DETALLE_COMBO);
		addEEnumLiteral(tipoABMEEnum, TipoABM.MAESTRO_COMBO_DETALLE_COMBO);
		addEEnumLiteral(tipoABMEEnum, TipoABM.SIN_REPRESENTACION);

		// Create resource
		createResource(eNS_URI);
	}

} //DiagramaClasesCompletoPackageImpl
