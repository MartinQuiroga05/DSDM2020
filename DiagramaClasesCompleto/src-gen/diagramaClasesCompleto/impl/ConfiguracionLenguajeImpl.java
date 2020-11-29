/**
 */
package diagramaClasesCompleto.impl;

import diagramaClasesCompleto.ConfiguracionLenguaje;
import diagramaClasesCompleto.DiagramaClasesCompletoPackage;
import diagramaClasesCompleto.Lenguaje;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Configuracion Lenguaje</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link diagramaClasesCompleto.impl.ConfiguracionLenguajeImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link diagramaClasesCompleto.impl.ConfiguracionLenguajeImpl#getLenguaje <em>Lenguaje</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConfiguracionLenguajeImpl extends MinimalEObjectImpl.Container implements ConfiguracionLenguaje {
	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getLenguaje() <em>Lenguaje</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLenguaje()
	 * @generated
	 * @ordered
	 */
	protected static final Lenguaje LENGUAJE_EDEFAULT = Lenguaje.JAVA;

	/**
	 * The cached value of the '{@link #getLenguaje() <em>Lenguaje</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLenguaje()
	 * @generated
	 * @ordered
	 */
	protected Lenguaje lenguaje = LENGUAJE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfiguracionLenguajeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DiagramaClasesCompletoPackage.Literals.CONFIGURACION_LENGUAJE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DiagramaClasesCompletoPackage.CONFIGURACION_LENGUAJE__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Lenguaje getLenguaje() {
		return lenguaje;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLenguaje(Lenguaje newLenguaje) {
		Lenguaje oldLenguaje = lenguaje;
		lenguaje = newLenguaje == null ? LENGUAJE_EDEFAULT : newLenguaje;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DiagramaClasesCompletoPackage.CONFIGURACION_LENGUAJE__LENGUAJE, oldLenguaje, lenguaje));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case DiagramaClasesCompletoPackage.CONFIGURACION_LENGUAJE__VERSION:
			return getVersion();
		case DiagramaClasesCompletoPackage.CONFIGURACION_LENGUAJE__LENGUAJE:
			return getLenguaje();
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
		case DiagramaClasesCompletoPackage.CONFIGURACION_LENGUAJE__VERSION:
			setVersion((String) newValue);
			return;
		case DiagramaClasesCompletoPackage.CONFIGURACION_LENGUAJE__LENGUAJE:
			setLenguaje((Lenguaje) newValue);
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
		case DiagramaClasesCompletoPackage.CONFIGURACION_LENGUAJE__VERSION:
			setVersion(VERSION_EDEFAULT);
			return;
		case DiagramaClasesCompletoPackage.CONFIGURACION_LENGUAJE__LENGUAJE:
			setLenguaje(LENGUAJE_EDEFAULT);
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
		case DiagramaClasesCompletoPackage.CONFIGURACION_LENGUAJE__VERSION:
			return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
		case DiagramaClasesCompletoPackage.CONFIGURACION_LENGUAJE__LENGUAJE:
			return lenguaje != LENGUAJE_EDEFAULT;
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
		result.append(" (version: ");
		result.append(version);
		result.append(", lenguaje: ");
		result.append(lenguaje);
		result.append(')');
		return result.toString();
	}

} //ConfiguracionLenguajeImpl
