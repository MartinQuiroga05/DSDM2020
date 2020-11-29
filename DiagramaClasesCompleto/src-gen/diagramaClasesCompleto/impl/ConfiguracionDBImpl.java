/**
 */
package diagramaClasesCompleto.impl;

import diagramaClasesCompleto.ConfiguracionDB;
import diagramaClasesCompleto.DiagramaClasesCompletoPackage;
import diagramaClasesCompleto.ProveedorDb;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Configuracion DB</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link diagramaClasesCompleto.impl.ConfiguracionDBImpl#getDbNombre <em>Db Nombre</em>}</li>
 *   <li>{@link diagramaClasesCompleto.impl.ConfiguracionDBImpl#getDbUsuario <em>Db Usuario</em>}</li>
 *   <li>{@link diagramaClasesCompleto.impl.ConfiguracionDBImpl#getDbPuerto <em>Db Puerto</em>}</li>
 *   <li>{@link diagramaClasesCompleto.impl.ConfiguracionDBImpl#getIp <em>Ip</em>}</li>
 *   <li>{@link diagramaClasesCompleto.impl.ConfiguracionDBImpl#getDbContrasena <em>Db Contrasena</em>}</li>
 *   <li>{@link diagramaClasesCompleto.impl.ConfiguracionDBImpl#getServerPuerto <em>Server Puerto</em>}</li>
 *   <li>{@link diagramaClasesCompleto.impl.ConfiguracionDBImpl#getTipoProveedor <em>Tipo Proveedor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConfiguracionDBImpl extends MinimalEObjectImpl.Container implements ConfiguracionDB {
	/**
	 * The default value of the '{@link #getDbNombre() <em>Db Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbNombre()
	 * @generated
	 * @ordered
	 */
	protected static final String DB_NOMBRE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDbNombre() <em>Db Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbNombre()
	 * @generated
	 * @ordered
	 */
	protected String dbNombre = DB_NOMBRE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDbUsuario() <em>Db Usuario</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbUsuario()
	 * @generated
	 * @ordered
	 */
	protected static final String DB_USUARIO_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getDbUsuario() <em>Db Usuario</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbUsuario()
	 * @generated
	 * @ordered
	 */
	protected String dbUsuario = DB_USUARIO_EDEFAULT;

	/**
	 * The default value of the '{@link #getDbPuerto() <em>Db Puerto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbPuerto()
	 * @generated
	 * @ordered
	 */
	protected static final int DB_PUERTO_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDbPuerto() <em>Db Puerto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbPuerto()
	 * @generated
	 * @ordered
	 */
	protected int dbPuerto = DB_PUERTO_EDEFAULT;

	/**
	 * The default value of the '{@link #getIp() <em>Ip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIp()
	 * @generated
	 * @ordered
	 */
	protected static final String IP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIp() <em>Ip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIp()
	 * @generated
	 * @ordered
	 */
	protected String ip = IP_EDEFAULT;

	/**
	 * The default value of the '{@link #getDbContrasena() <em>Db Contrasena</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbContrasena()
	 * @generated
	 * @ordered
	 */
	protected static final String DB_CONTRASENA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDbContrasena() <em>Db Contrasena</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbContrasena()
	 * @generated
	 * @ordered
	 */
	protected String dbContrasena = DB_CONTRASENA_EDEFAULT;

	/**
	 * The default value of the '{@link #getServerPuerto() <em>Server Puerto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServerPuerto()
	 * @generated
	 * @ordered
	 */
	protected static final int SERVER_PUERTO_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getServerPuerto() <em>Server Puerto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServerPuerto()
	 * @generated
	 * @ordered
	 */
	protected int serverPuerto = SERVER_PUERTO_EDEFAULT;

	/**
	 * The default value of the '{@link #getTipoProveedor() <em>Tipo Proveedor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipoProveedor()
	 * @generated
	 * @ordered
	 */
	protected static final ProveedorDb TIPO_PROVEEDOR_EDEFAULT = ProveedorDb.MY_SQL;

	/**
	 * The cached value of the '{@link #getTipoProveedor() <em>Tipo Proveedor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipoProveedor()
	 * @generated
	 * @ordered
	 */
	protected ProveedorDb tipoProveedor = TIPO_PROVEEDOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfiguracionDBImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DiagramaClasesCompletoPackage.Literals.CONFIGURACION_DB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDbNombre() {
		return dbNombre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDbNombre(String newDbNombre) {
		String oldDbNombre = dbNombre;
		dbNombre = newDbNombre;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DiagramaClasesCompletoPackage.CONFIGURACION_DB__DB_NOMBRE, oldDbNombre, dbNombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDbUsuario() {
		return dbUsuario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDbUsuario(String newDbUsuario) {
		String oldDbUsuario = dbUsuario;
		dbUsuario = newDbUsuario;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DiagramaClasesCompletoPackage.CONFIGURACION_DB__DB_USUARIO, oldDbUsuario, dbUsuario));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getDbPuerto() {
		return dbPuerto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDbPuerto(int newDbPuerto) {
		int oldDbPuerto = dbPuerto;
		dbPuerto = newDbPuerto;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DiagramaClasesCompletoPackage.CONFIGURACION_DB__DB_PUERTO, oldDbPuerto, dbPuerto));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIp() {
		return ip;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIp(String newIp) {
		String oldIp = ip;
		ip = newIp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiagramaClasesCompletoPackage.CONFIGURACION_DB__IP,
					oldIp, ip));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDbContrasena() {
		return dbContrasena;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDbContrasena(String newDbContrasena) {
		String oldDbContrasena = dbContrasena;
		dbContrasena = newDbContrasena;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DiagramaClasesCompletoPackage.CONFIGURACION_DB__DB_CONTRASENA, oldDbContrasena, dbContrasena));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getServerPuerto() {
		return serverPuerto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setServerPuerto(int newServerPuerto) {
		int oldServerPuerto = serverPuerto;
		serverPuerto = newServerPuerto;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DiagramaClasesCompletoPackage.CONFIGURACION_DB__SERVER_PUERTO, oldServerPuerto, serverPuerto));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProveedorDb getTipoProveedor() {
		return tipoProveedor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTipoProveedor(ProveedorDb newTipoProveedor) {
		ProveedorDb oldTipoProveedor = tipoProveedor;
		tipoProveedor = newTipoProveedor == null ? TIPO_PROVEEDOR_EDEFAULT : newTipoProveedor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DiagramaClasesCompletoPackage.CONFIGURACION_DB__TIPO_PROVEEDOR, oldTipoProveedor, tipoProveedor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case DiagramaClasesCompletoPackage.CONFIGURACION_DB__DB_NOMBRE:
			return getDbNombre();
		case DiagramaClasesCompletoPackage.CONFIGURACION_DB__DB_USUARIO:
			return getDbUsuario();
		case DiagramaClasesCompletoPackage.CONFIGURACION_DB__DB_PUERTO:
			return getDbPuerto();
		case DiagramaClasesCompletoPackage.CONFIGURACION_DB__IP:
			return getIp();
		case DiagramaClasesCompletoPackage.CONFIGURACION_DB__DB_CONTRASENA:
			return getDbContrasena();
		case DiagramaClasesCompletoPackage.CONFIGURACION_DB__SERVER_PUERTO:
			return getServerPuerto();
		case DiagramaClasesCompletoPackage.CONFIGURACION_DB__TIPO_PROVEEDOR:
			return getTipoProveedor();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case DiagramaClasesCompletoPackage.CONFIGURACION_DB__DB_NOMBRE:
			setDbNombre((String) newValue);
			return;
		case DiagramaClasesCompletoPackage.CONFIGURACION_DB__DB_USUARIO:
			setDbUsuario((String) newValue);
			return;
		case DiagramaClasesCompletoPackage.CONFIGURACION_DB__DB_PUERTO:
			setDbPuerto((Integer) newValue);
			return;
		case DiagramaClasesCompletoPackage.CONFIGURACION_DB__IP:
			setIp((String) newValue);
			return;
		case DiagramaClasesCompletoPackage.CONFIGURACION_DB__DB_CONTRASENA:
			setDbContrasena((String) newValue);
			return;
		case DiagramaClasesCompletoPackage.CONFIGURACION_DB__SERVER_PUERTO:
			setServerPuerto((Integer) newValue);
			return;
		case DiagramaClasesCompletoPackage.CONFIGURACION_DB__TIPO_PROVEEDOR:
			setTipoProveedor((ProveedorDb) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case DiagramaClasesCompletoPackage.CONFIGURACION_DB__DB_NOMBRE:
			setDbNombre(DB_NOMBRE_EDEFAULT);
			return;
		case DiagramaClasesCompletoPackage.CONFIGURACION_DB__DB_USUARIO:
			setDbUsuario(DB_USUARIO_EDEFAULT);
			return;
		case DiagramaClasesCompletoPackage.CONFIGURACION_DB__DB_PUERTO:
			setDbPuerto(DB_PUERTO_EDEFAULT);
			return;
		case DiagramaClasesCompletoPackage.CONFIGURACION_DB__IP:
			setIp(IP_EDEFAULT);
			return;
		case DiagramaClasesCompletoPackage.CONFIGURACION_DB__DB_CONTRASENA:
			setDbContrasena(DB_CONTRASENA_EDEFAULT);
			return;
		case DiagramaClasesCompletoPackage.CONFIGURACION_DB__SERVER_PUERTO:
			setServerPuerto(SERVER_PUERTO_EDEFAULT);
			return;
		case DiagramaClasesCompletoPackage.CONFIGURACION_DB__TIPO_PROVEEDOR:
			setTipoProveedor(TIPO_PROVEEDOR_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case DiagramaClasesCompletoPackage.CONFIGURACION_DB__DB_NOMBRE:
			return DB_NOMBRE_EDEFAULT == null ? dbNombre != null : !DB_NOMBRE_EDEFAULT.equals(dbNombre);
		case DiagramaClasesCompletoPackage.CONFIGURACION_DB__DB_USUARIO:
			return DB_USUARIO_EDEFAULT == null ? dbUsuario != null : !DB_USUARIO_EDEFAULT.equals(dbUsuario);
		case DiagramaClasesCompletoPackage.CONFIGURACION_DB__DB_PUERTO:
			return dbPuerto != DB_PUERTO_EDEFAULT;
		case DiagramaClasesCompletoPackage.CONFIGURACION_DB__IP:
			return IP_EDEFAULT == null ? ip != null : !IP_EDEFAULT.equals(ip);
		case DiagramaClasesCompletoPackage.CONFIGURACION_DB__DB_CONTRASENA:
			return DB_CONTRASENA_EDEFAULT == null ? dbContrasena != null : !DB_CONTRASENA_EDEFAULT.equals(dbContrasena);
		case DiagramaClasesCompletoPackage.CONFIGURACION_DB__SERVER_PUERTO:
			return serverPuerto != SERVER_PUERTO_EDEFAULT;
		case DiagramaClasesCompletoPackage.CONFIGURACION_DB__TIPO_PROVEEDOR:
			return tipoProveedor != TIPO_PROVEEDOR_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (dbNombre: ");
		result.append(dbNombre);
		result.append(", dbUsuario: ");
		result.append(dbUsuario);
		result.append(", dbPuerto: ");
		result.append(dbPuerto);
		result.append(", ip: ");
		result.append(ip);
		result.append(", dbContrasena: ");
		result.append(dbContrasena);
		result.append(", serverPuerto: ");
		result.append(serverPuerto);
		result.append(", tipoProveedor: ");
		result.append(tipoProveedor);
		result.append(')');
		return result.toString();
	}

} //ConfiguracionDBImpl
