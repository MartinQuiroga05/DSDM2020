/**
 */
package diagramaClasesCompleto;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configuracion Microservicios</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link diagramaClasesCompleto.ConfiguracionMicroservicios#getIpDiscovery <em>Ip Discovery</em>}</li>
 *   <li>{@link diagramaClasesCompleto.ConfiguracionMicroservicios#getPuertoDiscovery <em>Puerto Discovery</em>}</li>
 * </ul>
 *
 * @see diagramaClasesCompleto.DiagramaClasesCompletoPackage#getConfiguracionMicroservicios()
 * @model
 * @generated
 */
public interface ConfiguracionMicroservicios extends EObject {
	/**
	 * Returns the value of the '<em><b>Ip Discovery</b></em>' attribute.
	 * The default value is <code>"http://localhost"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ip Discovery</em>' attribute.
	 * @see #setIpDiscovery(String)
	 * @see diagramaClasesCompleto.DiagramaClasesCompletoPackage#getConfiguracionMicroservicios_IpDiscovery()
	 * @model default="http://localhost"
	 * @generated
	 */
	String getIpDiscovery();

	/**
	 * Sets the value of the '{@link diagramaClasesCompleto.ConfiguracionMicroservicios#getIpDiscovery <em>Ip Discovery</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ip Discovery</em>' attribute.
	 * @see #getIpDiscovery()
	 * @generated
	 */
	void setIpDiscovery(String value);

	/**
	 * Returns the value of the '<em><b>Puerto Discovery</b></em>' attribute.
	 * The default value is <code>"8761"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Puerto Discovery</em>' attribute.
	 * @see #setPuertoDiscovery(int)
	 * @see diagramaClasesCompleto.DiagramaClasesCompletoPackage#getConfiguracionMicroservicios_PuertoDiscovery()
	 * @model default="8761"
	 * @generated
	 */
	int getPuertoDiscovery();

	/**
	 * Sets the value of the '{@link diagramaClasesCompleto.ConfiguracionMicroservicios#getPuertoDiscovery <em>Puerto Discovery</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Puerto Discovery</em>' attribute.
	 * @see #getPuertoDiscovery()
	 * @generated
	 */
	void setPuertoDiscovery(int value);

} // ConfiguracionMicroservicios
