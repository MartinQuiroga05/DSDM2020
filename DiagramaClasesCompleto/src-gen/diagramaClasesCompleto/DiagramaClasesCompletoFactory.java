/**
 */
package diagramaClasesCompleto;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see diagramaClasesCompleto.DiagramaClasesCompletoPackage
 * @generated
 */
public interface DiagramaClasesCompletoFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DiagramaClasesCompletoFactory eINSTANCE = diagramaClasesCompleto.impl.DiagramaClasesCompletoFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Diagrama Clases</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diagrama Clases</em>'.
	 * @generated
	 */
	DiagramaClases createDiagramaClases();

	/**
	 * Returns a new object of class '<em>Clase</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Clase</em>'.
	 * @generated
	 */
	Clase createClase();

	/**
	 * Returns a new object of class '<em>Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interface</em>'.
	 * @generated
	 */
	Interface createInterface();

	/**
	 * Returns a new object of class '<em>Relacion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relacion</em>'.
	 * @generated
	 */
	Relacion createRelacion();

	/**
	 * Returns a new object of class '<em>Operacion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operacion</em>'.
	 * @generated
	 */
	Operacion createOperacion();

	/**
	 * Returns a new object of class '<em>Atributo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Atributo</em>'.
	 * @generated
	 */
	Atributo createAtributo();

	/**
	 * Returns a new object of class '<em>Package</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Package</em>'.
	 * @generated
	 */
	Package createPackage();

	/**
	 * Returns a new object of class '<em>Herencia</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Herencia</em>'.
	 * @generated
	 */
	Herencia createHerencia();

	/**
	 * Returns a new object of class '<em>Realizacion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Realizacion</em>'.
	 * @generated
	 */
	Realizacion createRealizacion();

	/**
	 * Returns a new object of class '<em>Artefacto</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Artefacto</em>'.
	 * @generated
	 */
	Artefacto createArtefacto();

	/**
	 * Returns a new object of class '<em>End Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>End Point</em>'.
	 * @generated
	 */
	EndPoint createEndPoint();

	/**
	 * Returns a new object of class '<em>Configuracion DB</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Configuracion DB</em>'.
	 * @generated
	 */
	ConfiguracionDB createConfiguracionDB();

	/**
	 * Returns a new object of class '<em>Configuracion Docker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Configuracion Docker</em>'.
	 * @generated
	 */
	ConfiguracionDocker createConfiguracionDocker();

	/**
	 * Returns a new object of class '<em>Configuracion Lenguaje</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Configuracion Lenguaje</em>'.
	 * @generated
	 */
	ConfiguracionLenguaje createConfiguracionLenguaje();

	/**
	 * Returns a new object of class '<em>Parametro Interno</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parametro Interno</em>'.
	 * @generated
	 */
	ParametroInterno createParametroInterno();

	/**
	 * Returns a new object of class '<em>Configuracion Microservicios</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Configuracion Microservicios</em>'.
	 * @generated
	 */
	ConfiguracionMicroservicios createConfiguracionMicroservicios();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DiagramaClasesCompletoPackage getDiagramaClasesCompletoPackage();

} //DiagramaClasesCompletoFactory
