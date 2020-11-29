/**
 */
package diagramaClasesCompleto.util;

import diagramaClasesCompleto.Artefacto;
import diagramaClasesCompleto.Atributo;
import diagramaClasesCompleto.Clase;
import diagramaClasesCompleto.Clasificador;
import diagramaClasesCompleto.ConfiguracionDB;
import diagramaClasesCompleto.ConfiguracionDocker;
import diagramaClasesCompleto.ConfiguracionLenguaje;
import diagramaClasesCompleto.ConfiguracionMicroservicios;
import diagramaClasesCompleto.DiagramaClases;
import diagramaClasesCompleto.DiagramaClasesCompletoPackage;
import diagramaClasesCompleto.EndPoint;
import diagramaClasesCompleto.Herencia;
import diagramaClasesCompleto.Interface;
import diagramaClasesCompleto.Operacion;
import diagramaClasesCompleto.ParametroInterno;
import diagramaClasesCompleto.Realizacion;
import diagramaClasesCompleto.Relacion;
import diagramaClasesCompleto.Retornable;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see diagramaClasesCompleto.DiagramaClasesCompletoPackage
 * @generated
 */
public class DiagramaClasesCompletoAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DiagramaClasesCompletoPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagramaClasesCompletoAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = DiagramaClasesCompletoPackage.eINSTANCE;
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
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiagramaClasesCompletoSwitch<Adapter> modelSwitch = new DiagramaClasesCompletoSwitch<Adapter>() {
		@Override
		public Adapter caseDiagramaClases(DiagramaClases object) {
			return createDiagramaClasesAdapter();
		}

		@Override
		public Adapter caseClasificador(Clasificador object) {
			return createClasificadorAdapter();
		}

		@Override
		public Adapter caseClase(Clase object) {
			return createClaseAdapter();
		}

		@Override
		public Adapter caseInterface(Interface object) {
			return createInterfaceAdapter();
		}

		@Override
		public Adapter caseRelacion(Relacion object) {
			return createRelacionAdapter();
		}

		@Override
		public Adapter caseOperacion(Operacion object) {
			return createOperacionAdapter();
		}

		@Override
		public Adapter caseAtributo(Atributo object) {
			return createAtributoAdapter();
		}

		@Override
		public Adapter casePackage(diagramaClasesCompleto.Package object) {
			return createPackageAdapter();
		}

		@Override
		public Adapter caseHerencia(Herencia object) {
			return createHerenciaAdapter();
		}

		@Override
		public Adapter caseRealizacion(Realizacion object) {
			return createRealizacionAdapter();
		}

		@Override
		public Adapter caseArtefacto(Artefacto object) {
			return createArtefactoAdapter();
		}

		@Override
		public Adapter caseRetornable(Retornable object) {
			return createRetornableAdapter();
		}

		@Override
		public Adapter caseEndPoint(EndPoint object) {
			return createEndPointAdapter();
		}

		@Override
		public Adapter caseConfiguracionDB(ConfiguracionDB object) {
			return createConfiguracionDBAdapter();
		}

		@Override
		public Adapter caseConfiguracionDocker(ConfiguracionDocker object) {
			return createConfiguracionDockerAdapter();
		}

		@Override
		public Adapter caseConfiguracionLenguaje(ConfiguracionLenguaje object) {
			return createConfiguracionLenguajeAdapter();
		}

		@Override
		public Adapter caseParametroInterno(ParametroInterno object) {
			return createParametroInternoAdapter();
		}

		@Override
		public Adapter caseConfiguracionMicroservicios(ConfiguracionMicroservicios object) {
			return createConfiguracionMicroserviciosAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
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
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link diagramaClasesCompleto.DiagramaClases <em>Diagrama Clases</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diagramaClasesCompleto.DiagramaClases
	 * @generated
	 */
	public Adapter createDiagramaClasesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diagramaClasesCompleto.Clasificador <em>Clasificador</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diagramaClasesCompleto.Clasificador
	 * @generated
	 */
	public Adapter createClasificadorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diagramaClasesCompleto.Clase <em>Clase</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diagramaClasesCompleto.Clase
	 * @generated
	 */
	public Adapter createClaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diagramaClasesCompleto.Interface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diagramaClasesCompleto.Interface
	 * @generated
	 */
	public Adapter createInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diagramaClasesCompleto.Relacion <em>Relacion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diagramaClasesCompleto.Relacion
	 * @generated
	 */
	public Adapter createRelacionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diagramaClasesCompleto.Operacion <em>Operacion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diagramaClasesCompleto.Operacion
	 * @generated
	 */
	public Adapter createOperacionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diagramaClasesCompleto.Atributo <em>Atributo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diagramaClasesCompleto.Atributo
	 * @generated
	 */
	public Adapter createAtributoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diagramaClasesCompleto.Package <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diagramaClasesCompleto.Package
	 * @generated
	 */
	public Adapter createPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diagramaClasesCompleto.Herencia <em>Herencia</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diagramaClasesCompleto.Herencia
	 * @generated
	 */
	public Adapter createHerenciaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diagramaClasesCompleto.Realizacion <em>Realizacion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diagramaClasesCompleto.Realizacion
	 * @generated
	 */
	public Adapter createRealizacionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diagramaClasesCompleto.Artefacto <em>Artefacto</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diagramaClasesCompleto.Artefacto
	 * @generated
	 */
	public Adapter createArtefactoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diagramaClasesCompleto.Retornable <em>Retornable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diagramaClasesCompleto.Retornable
	 * @generated
	 */
	public Adapter createRetornableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diagramaClasesCompleto.EndPoint <em>End Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diagramaClasesCompleto.EndPoint
	 * @generated
	 */
	public Adapter createEndPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diagramaClasesCompleto.ConfiguracionDB <em>Configuracion DB</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diagramaClasesCompleto.ConfiguracionDB
	 * @generated
	 */
	public Adapter createConfiguracionDBAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diagramaClasesCompleto.ConfiguracionDocker <em>Configuracion Docker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diagramaClasesCompleto.ConfiguracionDocker
	 * @generated
	 */
	public Adapter createConfiguracionDockerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diagramaClasesCompleto.ConfiguracionLenguaje <em>Configuracion Lenguaje</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diagramaClasesCompleto.ConfiguracionLenguaje
	 * @generated
	 */
	public Adapter createConfiguracionLenguajeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diagramaClasesCompleto.ParametroInterno <em>Parametro Interno</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diagramaClasesCompleto.ParametroInterno
	 * @generated
	 */
	public Adapter createParametroInternoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diagramaClasesCompleto.ConfiguracionMicroservicios <em>Configuracion Microservicios</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diagramaClasesCompleto.ConfiguracionMicroservicios
	 * @generated
	 */
	public Adapter createConfiguracionMicroserviciosAdapter() {
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
	public Adapter createEObjectAdapter() {
		return null;
	}

} //DiagramaClasesCompletoAdapterFactory
