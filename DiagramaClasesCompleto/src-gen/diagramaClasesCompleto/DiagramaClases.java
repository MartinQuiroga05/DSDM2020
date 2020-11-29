/**
 */
package diagramaClasesCompleto;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diagrama Clases</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link diagramaClasesCompleto.DiagramaClases#getPackages_contenidos <em>Packages contenidos</em>}</li>
 *   <li>{@link diagramaClasesCompleto.DiagramaClases#getArtefacto_contenido <em>Artefacto contenido</em>}</li>
 *   <li>{@link diagramaClasesCompleto.DiagramaClases#getConfiguraciondb <em>Configuraciondb</em>}</li>
 *   <li>{@link diagramaClasesCompleto.DiagramaClases#getConfiguraciondocker <em>Configuraciondocker</em>}</li>
 *   <li>{@link diagramaClasesCompleto.DiagramaClases#getConfiguracionlenguaje <em>Configuracionlenguaje</em>}</li>
 *   <li>{@link diagramaClasesCompleto.DiagramaClases#getConfiguracionmicroservicios <em>Configuracionmicroservicios</em>}</li>
 * </ul>
 *
 * @see diagramaClasesCompleto.DiagramaClasesCompletoPackage#getDiagramaClases()
 * @model
 * @generated
 */
public interface DiagramaClases extends EObject {
	/**
	 * Returns the value of the '<em><b>Packages contenidos</b></em>' containment reference list.
	 * The list contents are of type {@link diagramaClasesCompleto.Package}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Packages contenidos</em>' containment reference list.
	 * @see diagramaClasesCompleto.DiagramaClasesCompletoPackage#getDiagramaClases_Packages_contenidos()
	 * @model containment="true"
	 * @generated
	 */
	EList<diagramaClasesCompleto.Package> getPackages_contenidos();

	/**
	 * Returns the value of the '<em><b>Artefacto contenido</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Artefacto contenido</em>' containment reference.
	 * @see #setArtefacto_contenido(Artefacto)
	 * @see diagramaClasesCompleto.DiagramaClasesCompletoPackage#getDiagramaClases_Artefacto_contenido()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Artefacto getArtefacto_contenido();

	/**
	 * Sets the value of the '{@link diagramaClasesCompleto.DiagramaClases#getArtefacto_contenido <em>Artefacto contenido</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Artefacto contenido</em>' containment reference.
	 * @see #getArtefacto_contenido()
	 * @generated
	 */
	void setArtefacto_contenido(Artefacto value);

	/**
	 * Returns the value of the '<em><b>Configuraciondb</b></em>' containment reference list.
	 * The list contents are of type {@link diagramaClasesCompleto.ConfiguracionDB}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuraciondb</em>' containment reference list.
	 * @see diagramaClasesCompleto.DiagramaClasesCompletoPackage#getDiagramaClases_Configuraciondb()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConfiguracionDB> getConfiguraciondb();

	/**
	 * Returns the value of the '<em><b>Configuraciondocker</b></em>' containment reference list.
	 * The list contents are of type {@link diagramaClasesCompleto.ConfiguracionDocker}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuraciondocker</em>' containment reference list.
	 * @see diagramaClasesCompleto.DiagramaClasesCompletoPackage#getDiagramaClases_Configuraciondocker()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConfiguracionDocker> getConfiguraciondocker();

	/**
	 * Returns the value of the '<em><b>Configuracionlenguaje</b></em>' containment reference list.
	 * The list contents are of type {@link diagramaClasesCompleto.ConfiguracionLenguaje}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuracionlenguaje</em>' containment reference list.
	 * @see diagramaClasesCompleto.DiagramaClasesCompletoPackage#getDiagramaClases_Configuracionlenguaje()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConfiguracionLenguaje> getConfiguracionlenguaje();

	/**
	 * Returns the value of the '<em><b>Configuracionmicroservicios</b></em>' containment reference list.
	 * The list contents are of type {@link diagramaClasesCompleto.ConfiguracionMicroservicios}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuracionmicroservicios</em>' containment reference list.
	 * @see diagramaClasesCompleto.DiagramaClasesCompletoPackage#getDiagramaClases_Configuracionmicroservicios()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConfiguracionMicroservicios> getConfiguracionmicroservicios();

} // DiagramaClases
