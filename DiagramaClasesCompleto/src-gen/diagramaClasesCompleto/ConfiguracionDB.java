/**
 */
package diagramaClasesCompleto;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configuracion DB</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link diagramaClasesCompleto.ConfiguracionDB#getDbNombre <em>Db Nombre</em>}</li>
 *   <li>{@link diagramaClasesCompleto.ConfiguracionDB#getDbUsuario <em>Db Usuario</em>}</li>
 *   <li>{@link diagramaClasesCompleto.ConfiguracionDB#getDbPuerto <em>Db Puerto</em>}</li>
 *   <li>{@link diagramaClasesCompleto.ConfiguracionDB#getIp <em>Ip</em>}</li>
 *   <li>{@link diagramaClasesCompleto.ConfiguracionDB#getDbContrasena <em>Db Contrasena</em>}</li>
 *   <li>{@link diagramaClasesCompleto.ConfiguracionDB#getServerPuerto <em>Server Puerto</em>}</li>
 *   <li>{@link diagramaClasesCompleto.ConfiguracionDB#getTipoProveedor <em>Tipo Proveedor</em>}</li>
 * </ul>
 *
 * @see diagramaClasesCompleto.DiagramaClasesCompletoPackage#getConfiguracionDB()
 * @model
 * @generated
 */
public interface ConfiguracionDB extends EObject {
	/**
	 * Returns the value of the '<em><b>Db Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Db Nombre</em>' attribute.
	 * @see #setDbNombre(String)
	 * @see diagramaClasesCompleto.DiagramaClasesCompletoPackage#getConfiguracionDB_DbNombre()
	 * @model
	 * @generated
	 */
	String getDbNombre();

	/**
	 * Sets the value of the '{@link diagramaClasesCompleto.ConfiguracionDB#getDbNombre <em>Db Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Db Nombre</em>' attribute.
	 * @see #getDbNombre()
	 * @generated
	 */
	void setDbNombre(String value);

	/**
	 * Returns the value of the '<em><b>Db Usuario</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Db Usuario</em>' attribute.
	 * @see #setDbUsuario(String)
	 * @see diagramaClasesCompleto.DiagramaClasesCompletoPackage#getConfiguracionDB_DbUsuario()
	 * @model default=""
	 * @generated
	 */
	String getDbUsuario();

	/**
	 * Sets the value of the '{@link diagramaClasesCompleto.ConfiguracionDB#getDbUsuario <em>Db Usuario</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Db Usuario</em>' attribute.
	 * @see #getDbUsuario()
	 * @generated
	 */
	void setDbUsuario(String value);

	/**
	 * Returns the value of the '<em><b>Db Puerto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Db Puerto</em>' attribute.
	 * @see #setDbPuerto(int)
	 * @see diagramaClasesCompleto.DiagramaClasesCompletoPackage#getConfiguracionDB_DbPuerto()
	 * @model
	 * @generated
	 */
	int getDbPuerto();

	/**
	 * Sets the value of the '{@link diagramaClasesCompleto.ConfiguracionDB#getDbPuerto <em>Db Puerto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Db Puerto</em>' attribute.
	 * @see #getDbPuerto()
	 * @generated
	 */
	void setDbPuerto(int value);

	/**
	 * Returns the value of the '<em><b>Ip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ip</em>' attribute.
	 * @see #setIp(String)
	 * @see diagramaClasesCompleto.DiagramaClasesCompletoPackage#getConfiguracionDB_Ip()
	 * @model
	 * @generated
	 */
	String getIp();

	/**
	 * Sets the value of the '{@link diagramaClasesCompleto.ConfiguracionDB#getIp <em>Ip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ip</em>' attribute.
	 * @see #getIp()
	 * @generated
	 */
	void setIp(String value);

	/**
	 * Returns the value of the '<em><b>Db Contrasena</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Db Contrasena</em>' attribute.
	 * @see #setDbContrasena(String)
	 * @see diagramaClasesCompleto.DiagramaClasesCompletoPackage#getConfiguracionDB_DbContrasena()
	 * @model
	 * @generated
	 */
	String getDbContrasena();

	/**
	 * Sets the value of the '{@link diagramaClasesCompleto.ConfiguracionDB#getDbContrasena <em>Db Contrasena</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Db Contrasena</em>' attribute.
	 * @see #getDbContrasena()
	 * @generated
	 */
	void setDbContrasena(String value);

	/**
	 * Returns the value of the '<em><b>Server Puerto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Server Puerto</em>' attribute.
	 * @see #setServerPuerto(int)
	 * @see diagramaClasesCompleto.DiagramaClasesCompletoPackage#getConfiguracionDB_ServerPuerto()
	 * @model
	 * @generated
	 */
	int getServerPuerto();

	/**
	 * Sets the value of the '{@link diagramaClasesCompleto.ConfiguracionDB#getServerPuerto <em>Server Puerto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Server Puerto</em>' attribute.
	 * @see #getServerPuerto()
	 * @generated
	 */
	void setServerPuerto(int value);

	/**
	 * Returns the value of the '<em><b>Tipo Proveedor</b></em>' attribute.
	 * The literals are from the enumeration {@link diagramaClasesCompleto.ProveedorDb}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tipo Proveedor</em>' attribute.
	 * @see diagramaClasesCompleto.ProveedorDb
	 * @see #setTipoProveedor(ProveedorDb)
	 * @see diagramaClasesCompleto.DiagramaClasesCompletoPackage#getConfiguracionDB_TipoProveedor()
	 * @model
	 * @generated
	 */
	ProveedorDb getTipoProveedor();

	/**
	 * Sets the value of the '{@link diagramaClasesCompleto.ConfiguracionDB#getTipoProveedor <em>Tipo Proveedor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tipo Proveedor</em>' attribute.
	 * @see diagramaClasesCompleto.ProveedorDb
	 * @see #getTipoProveedor()
	 * @generated
	 */
	void setTipoProveedor(ProveedorDb value);

} // ConfiguracionDB
