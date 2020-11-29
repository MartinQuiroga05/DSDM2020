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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see diagramaClasesCompleto.DiagramaClasesCompletoPackage
 * @generated
 */
public class DiagramaClasesCompletoSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DiagramaClasesCompletoPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagramaClasesCompletoSwitch() {
		if (modelPackage == null) {
			modelPackage = DiagramaClasesCompletoPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case DiagramaClasesCompletoPackage.DIAGRAMA_CLASES: {
			DiagramaClases diagramaClases = (DiagramaClases) theEObject;
			T result = caseDiagramaClases(diagramaClases);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DiagramaClasesCompletoPackage.CLASIFICADOR: {
			Clasificador clasificador = (Clasificador) theEObject;
			T result = caseClasificador(clasificador);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DiagramaClasesCompletoPackage.CLASE: {
			Clase clase = (Clase) theEObject;
			T result = caseClase(clase);
			if (result == null)
				result = caseClasificador(clase);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DiagramaClasesCompletoPackage.INTERFACE: {
			Interface interface_ = (Interface) theEObject;
			T result = caseInterface(interface_);
			if (result == null)
				result = caseClasificador(interface_);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DiagramaClasesCompletoPackage.RELACION: {
			Relacion relacion = (Relacion) theEObject;
			T result = caseRelacion(relacion);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DiagramaClasesCompletoPackage.OPERACION: {
			Operacion operacion = (Operacion) theEObject;
			T result = caseOperacion(operacion);
			if (result == null)
				result = caseRetornable(operacion);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DiagramaClasesCompletoPackage.ATRIBUTO: {
			Atributo atributo = (Atributo) theEObject;
			T result = caseAtributo(atributo);
			if (result == null)
				result = caseRetornable(atributo);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DiagramaClasesCompletoPackage.PACKAGE: {
			diagramaClasesCompleto.Package package_ = (diagramaClasesCompleto.Package) theEObject;
			T result = casePackage(package_);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DiagramaClasesCompletoPackage.HERENCIA: {
			Herencia herencia = (Herencia) theEObject;
			T result = caseHerencia(herencia);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DiagramaClasesCompletoPackage.REALIZACION: {
			Realizacion realizacion = (Realizacion) theEObject;
			T result = caseRealizacion(realizacion);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DiagramaClasesCompletoPackage.ARTEFACTO: {
			Artefacto artefacto = (Artefacto) theEObject;
			T result = caseArtefacto(artefacto);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DiagramaClasesCompletoPackage.RETORNABLE: {
			Retornable retornable = (Retornable) theEObject;
			T result = caseRetornable(retornable);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DiagramaClasesCompletoPackage.END_POINT: {
			EndPoint endPoint = (EndPoint) theEObject;
			T result = caseEndPoint(endPoint);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DiagramaClasesCompletoPackage.CONFIGURACION_DB: {
			ConfiguracionDB configuracionDB = (ConfiguracionDB) theEObject;
			T result = caseConfiguracionDB(configuracionDB);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DiagramaClasesCompletoPackage.CONFIGURACION_DOCKER: {
			ConfiguracionDocker configuracionDocker = (ConfiguracionDocker) theEObject;
			T result = caseConfiguracionDocker(configuracionDocker);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DiagramaClasesCompletoPackage.CONFIGURACION_LENGUAJE: {
			ConfiguracionLenguaje configuracionLenguaje = (ConfiguracionLenguaje) theEObject;
			T result = caseConfiguracionLenguaje(configuracionLenguaje);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DiagramaClasesCompletoPackage.PARAMETRO_INTERNO: {
			ParametroInterno parametroInterno = (ParametroInterno) theEObject;
			T result = caseParametroInterno(parametroInterno);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DiagramaClasesCompletoPackage.CONFIGURACION_MICROSERVICIOS: {
			ConfiguracionMicroservicios configuracionMicroservicios = (ConfiguracionMicroservicios) theEObject;
			T result = caseConfiguracionMicroservicios(configuracionMicroservicios);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diagrama Clases</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diagrama Clases</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiagramaClases(DiagramaClases object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clasificador</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clasificador</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClasificador(Clasificador object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clase</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clase</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClase(Clase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterface(Interface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relacion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relacion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelacion(Relacion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operacion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operacion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperacion(Operacion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Atributo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Atributo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAtributo(Atributo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePackage(diagramaClasesCompleto.Package object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Herencia</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Herencia</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHerencia(Herencia object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Realizacion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Realizacion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRealizacion(Realizacion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Artefacto</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Artefacto</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArtefacto(Artefacto object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Retornable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Retornable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRetornable(Retornable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>End Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>End Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEndPoint(EndPoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Configuracion DB</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Configuracion DB</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfiguracionDB(ConfiguracionDB object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Configuracion Docker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Configuracion Docker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfiguracionDocker(ConfiguracionDocker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Configuracion Lenguaje</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Configuracion Lenguaje</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfiguracionLenguaje(ConfiguracionLenguaje object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parametro Interno</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parametro Interno</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParametroInterno(ParametroInterno object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Configuracion Microservicios</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Configuracion Microservicios</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfiguracionMicroservicios(ConfiguracionMicroservicios object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //DiagramaClasesCompletoSwitch
