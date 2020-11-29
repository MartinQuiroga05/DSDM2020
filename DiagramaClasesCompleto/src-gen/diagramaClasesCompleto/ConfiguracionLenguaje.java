/**
 */
package diagramaClasesCompleto;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configuracion Lenguaje</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link diagramaClasesCompleto.ConfiguracionLenguaje#getVersion <em>Version</em>}</li>
 *   <li>{@link diagramaClasesCompleto.ConfiguracionLenguaje#getLenguaje <em>Lenguaje</em>}</li>
 * </ul>
 *
 * @see diagramaClasesCompleto.DiagramaClasesCompletoPackage#getConfiguracionLenguaje()
 * @model
 * @generated
 */
public interface ConfiguracionLenguaje extends EObject {
	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see diagramaClasesCompleto.DiagramaClasesCompletoPackage#getConfiguracionLenguaje_Version()
	 * @model
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link diagramaClasesCompleto.ConfiguracionLenguaje#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Lenguaje</b></em>' attribute.
	 * The literals are from the enumeration {@link diagramaClasesCompleto.Lenguaje}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lenguaje</em>' attribute.
	 * @see diagramaClasesCompleto.Lenguaje
	 * @see #setLenguaje(Lenguaje)
	 * @see diagramaClasesCompleto.DiagramaClasesCompletoPackage#getConfiguracionLenguaje_Lenguaje()
	 * @model
	 * @generated
	 */
	Lenguaje getLenguaje();

	/**
	 * Sets the value of the '{@link diagramaClasesCompleto.ConfiguracionLenguaje#getLenguaje <em>Lenguaje</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lenguaje</em>' attribute.
	 * @see diagramaClasesCompleto.Lenguaje
	 * @see #getLenguaje()
	 * @generated
	 */
	void setLenguaje(Lenguaje value);

} // ConfiguracionLenguaje
