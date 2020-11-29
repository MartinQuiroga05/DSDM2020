/**
 */
package diagramaClasesCompleto.impl;

import diagramaClasesCompleto.Artefacto;
import diagramaClasesCompleto.Atributo;
import diagramaClasesCompleto.Clase;
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
import diagramaClasesCompleto.TipoABM;
import diagramaClasesCompleto.TipoDato;
import diagramaClasesCompleto.TipoReinicio;
import diagramaClasesCompleto.TipoRelacion;
import diagramaClasesCompleto.TipoRetorno;
import diagramaClasesCompleto.TipoTransferencia;
import diagramaClasesCompleto.VerbosHTTP;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class DiagramaClasesCompletoFactoryImpl extends EFactoryImpl implements DiagramaClasesCompletoFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DiagramaClasesCompletoFactory init() {
		try {
			DiagramaClasesCompletoFactory theDiagramaClasesCompletoFactory = (DiagramaClasesCompletoFactory) EPackage.Registry.INSTANCE
					.getEFactory(DiagramaClasesCompletoPackage.eNS_URI);
			if (theDiagramaClasesCompletoFactory != null) {
				return theDiagramaClasesCompletoFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DiagramaClasesCompletoFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagramaClasesCompletoFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case DiagramaClasesCompletoPackage.DIAGRAMA_CLASES:
			return createDiagramaClases();
		case DiagramaClasesCompletoPackage.CLASE:
			return createClase();
		case DiagramaClasesCompletoPackage.INTERFACE:
			return createInterface();
		case DiagramaClasesCompletoPackage.RELACION:
			return createRelacion();
		case DiagramaClasesCompletoPackage.OPERACION:
			return createOperacion();
		case DiagramaClasesCompletoPackage.ATRIBUTO:
			return createAtributo();
		case DiagramaClasesCompletoPackage.PACKAGE:
			return createPackage();
		case DiagramaClasesCompletoPackage.HERENCIA:
			return createHerencia();
		case DiagramaClasesCompletoPackage.REALIZACION:
			return createRealizacion();
		case DiagramaClasesCompletoPackage.ARTEFACTO:
			return createArtefacto();
		case DiagramaClasesCompletoPackage.END_POINT:
			return createEndPoint();
		case DiagramaClasesCompletoPackage.CONFIGURACION_DB:
			return createConfiguracionDB();
		case DiagramaClasesCompletoPackage.CONFIGURACION_DOCKER:
			return createConfiguracionDocker();
		case DiagramaClasesCompletoPackage.CONFIGURACION_LENGUAJE:
			return createConfiguracionLenguaje();
		case DiagramaClasesCompletoPackage.PARAMETRO_INTERNO:
			return createParametroInterno();
		case DiagramaClasesCompletoPackage.CONFIGURACION_MICROSERVICIOS:
			return createConfiguracionMicroservicios();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case DiagramaClasesCompletoPackage.TIPO_RELACION:
			return createTipoRelacionFromString(eDataType, initialValue);
		case DiagramaClasesCompletoPackage.TIPO_DATO:
			return createTipoDatoFromString(eDataType, initialValue);
		case DiagramaClasesCompletoPackage.TIPO_RETORNO:
			return createTipoRetornoFromString(eDataType, initialValue);
		case DiagramaClasesCompletoPackage.MODICADORES_ACCESO:
			return createModicadoresAccesoFromString(eDataType, initialValue);
		case DiagramaClasesCompletoPackage.MULTIPLICIDAD:
			return createMultiplicidadFromString(eDataType, initialValue);
		case DiagramaClasesCompletoPackage.VERBOS_HTTP:
			return createVerbosHTTPFromString(eDataType, initialValue);
		case DiagramaClasesCompletoPackage.TIPO_TRANSFERENCIA:
			return createTipoTransferenciaFromString(eDataType, initialValue);
		case DiagramaClasesCompletoPackage.TIPO_REINICIO:
			return createTipoReinicioFromString(eDataType, initialValue);
		case DiagramaClasesCompletoPackage.PROVEEDOR_DB:
			return createProveedorDbFromString(eDataType, initialValue);
		case DiagramaClasesCompletoPackage.LENGUAJE:
			return createLenguajeFromString(eDataType, initialValue);
		case DiagramaClasesCompletoPackage.REPRESENTACION_GRAFICA:
			return createRepresentacionGraficaFromString(eDataType, initialValue);
		case DiagramaClasesCompletoPackage.TIPO_ABM:
			return createTipoABMFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case DiagramaClasesCompletoPackage.TIPO_RELACION:
			return convertTipoRelacionToString(eDataType, instanceValue);
		case DiagramaClasesCompletoPackage.TIPO_DATO:
			return convertTipoDatoToString(eDataType, instanceValue);
		case DiagramaClasesCompletoPackage.TIPO_RETORNO:
			return convertTipoRetornoToString(eDataType, instanceValue);
		case DiagramaClasesCompletoPackage.MODICADORES_ACCESO:
			return convertModicadoresAccesoToString(eDataType, instanceValue);
		case DiagramaClasesCompletoPackage.MULTIPLICIDAD:
			return convertMultiplicidadToString(eDataType, instanceValue);
		case DiagramaClasesCompletoPackage.VERBOS_HTTP:
			return convertVerbosHTTPToString(eDataType, instanceValue);
		case DiagramaClasesCompletoPackage.TIPO_TRANSFERENCIA:
			return convertTipoTransferenciaToString(eDataType, instanceValue);
		case DiagramaClasesCompletoPackage.TIPO_REINICIO:
			return convertTipoReinicioToString(eDataType, instanceValue);
		case DiagramaClasesCompletoPackage.PROVEEDOR_DB:
			return convertProveedorDbToString(eDataType, instanceValue);
		case DiagramaClasesCompletoPackage.LENGUAJE:
			return convertLenguajeToString(eDataType, instanceValue);
		case DiagramaClasesCompletoPackage.REPRESENTACION_GRAFICA:
			return convertRepresentacionGraficaToString(eDataType, instanceValue);
		case DiagramaClasesCompletoPackage.TIPO_ABM:
			return convertTipoABMToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiagramaClases createDiagramaClases() {
		DiagramaClasesImpl diagramaClases = new DiagramaClasesImpl();
		return diagramaClases;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Clase createClase() {
		ClaseImpl clase = new ClaseImpl();
		return clase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Interface createInterface() {
		InterfaceImpl interface_ = new InterfaceImpl();
		return interface_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Relacion createRelacion() {
		RelacionImpl relacion = new RelacionImpl();
		return relacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Operacion createOperacion() {
		OperacionImpl operacion = new OperacionImpl();
		return operacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Atributo createAtributo() {
		AtributoImpl atributo = new AtributoImpl();
		return atributo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public diagramaClasesCompleto.Package createPackage() {
		PackageImpl package_ = new PackageImpl();
		return package_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Herencia createHerencia() {
		HerenciaImpl herencia = new HerenciaImpl();
		return herencia;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Realizacion createRealizacion() {
		RealizacionImpl realizacion = new RealizacionImpl();
		return realizacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Artefacto createArtefacto() {
		ArtefactoImpl artefacto = new ArtefactoImpl();
		return artefacto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EndPoint createEndPoint() {
		EndPointImpl endPoint = new EndPointImpl();
		return endPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConfiguracionDB createConfiguracionDB() {
		ConfiguracionDBImpl configuracionDB = new ConfiguracionDBImpl();
		return configuracionDB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConfiguracionDocker createConfiguracionDocker() {
		ConfiguracionDockerImpl configuracionDocker = new ConfiguracionDockerImpl();
		return configuracionDocker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConfiguracionLenguaje createConfiguracionLenguaje() {
		ConfiguracionLenguajeImpl configuracionLenguaje = new ConfiguracionLenguajeImpl();
		return configuracionLenguaje;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ParametroInterno createParametroInterno() {
		ParametroInternoImpl parametroInterno = new ParametroInternoImpl();
		return parametroInterno;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConfiguracionMicroservicios createConfiguracionMicroservicios() {
		ConfiguracionMicroserviciosImpl configuracionMicroservicios = new ConfiguracionMicroserviciosImpl();
		return configuracionMicroservicios;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TipoRelacion createTipoRelacionFromString(EDataType eDataType, String initialValue) {
		TipoRelacion result = TipoRelacion.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTipoRelacionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TipoDato createTipoDatoFromString(EDataType eDataType, String initialValue) {
		TipoDato result = TipoDato.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTipoDatoToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TipoRetorno createTipoRetornoFromString(EDataType eDataType, String initialValue) {
		TipoRetorno result = TipoRetorno.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTipoRetornoToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModicadoresAcceso createModicadoresAccesoFromString(EDataType eDataType, String initialValue) {
		ModicadoresAcceso result = ModicadoresAcceso.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertModicadoresAccesoToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Multiplicidad createMultiplicidadFromString(EDataType eDataType, String initialValue) {
		Multiplicidad result = Multiplicidad.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMultiplicidadToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VerbosHTTP createVerbosHTTPFromString(EDataType eDataType, String initialValue) {
		VerbosHTTP result = VerbosHTTP.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVerbosHTTPToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TipoTransferencia createTipoTransferenciaFromString(EDataType eDataType, String initialValue) {
		TipoTransferencia result = TipoTransferencia.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTipoTransferenciaToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TipoReinicio createTipoReinicioFromString(EDataType eDataType, String initialValue) {
		TipoReinicio result = TipoReinicio.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTipoReinicioToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProveedorDb createProveedorDbFromString(EDataType eDataType, String initialValue) {
		ProveedorDb result = ProveedorDb.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProveedorDbToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lenguaje createLenguajeFromString(EDataType eDataType, String initialValue) {
		Lenguaje result = Lenguaje.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLenguajeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepresentacionGrafica createRepresentacionGraficaFromString(EDataType eDataType, String initialValue) {
		RepresentacionGrafica result = RepresentacionGrafica.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRepresentacionGraficaToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TipoABM createTipoABMFromString(EDataType eDataType, String initialValue) {
		TipoABM result = TipoABM.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTipoABMToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiagramaClasesCompletoPackage getDiagramaClasesCompletoPackage() {
		return (DiagramaClasesCompletoPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DiagramaClasesCompletoPackage getPackage() {
		return DiagramaClasesCompletoPackage.eINSTANCE;
	}

} //DiagramaClasesCompletoFactoryImpl
