/**
 */
package diagramaClasesCompleto;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configuracion Docker</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link diagramaClasesCompleto.ConfiguracionDocker#getNombreContenedor <em>Nombre Contenedor</em>}</li>
 *   <li>{@link diagramaClasesCompleto.ConfiguracionDocker#getPuertoInterior <em>Puerto Interior</em>}</li>
 *   <li>{@link diagramaClasesCompleto.ConfiguracionDocker#getTipoReinicio <em>Tipo Reinicio</em>}</li>
 *   <li>{@link diagramaClasesCompleto.ConfiguracionDocker#getNombreImagen <em>Nombre Imagen</em>}</li>
 * </ul>
 *
 * @see diagramaClasesCompleto.DiagramaClasesCompletoPackage#getConfiguracionDocker()
 * @model
 * @generated
 */
public interface ConfiguracionDocker extends EObject {
	/**
	 * Returns the value of the '<em><b>Nombre Contenedor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre Contenedor</em>' attribute.
	 * @see #setNombreContenedor(String)
	 * @see diagramaClasesCompleto.DiagramaClasesCompletoPackage#getConfiguracionDocker_NombreContenedor()
	 * @model
	 * @generated
	 */
	String getNombreContenedor();

	/**
	 * Sets the value of the '{@link diagramaClasesCompleto.ConfiguracionDocker#getNombreContenedor <em>Nombre Contenedor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre Contenedor</em>' attribute.
	 * @see #getNombreContenedor()
	 * @generated
	 */
	void setNombreContenedor(String value);

	/**
	 * Returns the value of the '<em><b>Puerto Interior</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Puerto Interior</em>' attribute.
	 * @see #setPuertoInterior(int)
	 * @see diagramaClasesCompleto.DiagramaClasesCompletoPackage#getConfiguracionDocker_PuertoInterior()
	 * @model
	 * @generated
	 */
	int getPuertoInterior();

	/**
	 * Sets the value of the '{@link diagramaClasesCompleto.ConfiguracionDocker#getPuertoInterior <em>Puerto Interior</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Puerto Interior</em>' attribute.
	 * @see #getPuertoInterior()
	 * @generated
	 */
	void setPuertoInterior(int value);

	/**
	 * Returns the value of the '<em><b>Tipo Reinicio</b></em>' attribute.
	 * The literals are from the enumeration {@link diagramaClasesCompleto.TipoReinicio}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tipo Reinicio</em>' attribute.
	 * @see diagramaClasesCompleto.TipoReinicio
	 * @see #setTipoReinicio(TipoReinicio)
	 * @see diagramaClasesCompleto.DiagramaClasesCompletoPackage#getConfiguracionDocker_TipoReinicio()
	 * @model
	 * @generated
	 */
	TipoReinicio getTipoReinicio();

	/**
	 * Sets the value of the '{@link diagramaClasesCompleto.ConfiguracionDocker#getTipoReinicio <em>Tipo Reinicio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tipo Reinicio</em>' attribute.
	 * @see diagramaClasesCompleto.TipoReinicio
	 * @see #getTipoReinicio()
	 * @generated
	 */
	void setTipoReinicio(TipoReinicio value);

	/**
	 * Returns the value of the '<em><b>Nombre Imagen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre Imagen</em>' attribute.
	 * @see #setNombreImagen(String)
	 * @see diagramaClasesCompleto.DiagramaClasesCompletoPackage#getConfiguracionDocker_NombreImagen()
	 * @model
	 * @generated
	 */
	String getNombreImagen();

	/**
	 * Sets the value of the '{@link diagramaClasesCompleto.ConfiguracionDocker#getNombreImagen <em>Nombre Imagen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre Imagen</em>' attribute.
	 * @see #getNombreImagen()
	 * @generated
	 */
	void setNombreImagen(String value);

} // ConfiguracionDocker
