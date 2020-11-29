/**
 */
package diagramaClasesCompleto.impl;

import diagramaClasesCompleto.ConfiguracionMicroservicios;
import diagramaClasesCompleto.DiagramaClasesCompletoPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Configuracion Microservicios</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link diagramaClasesCompleto.impl.ConfiguracionMicroserviciosImpl#getIpDiscovery <em>Ip Discovery</em>}</li>
 *   <li>{@link diagramaClasesCompleto.impl.ConfiguracionMicroserviciosImpl#getPuertoDiscovery <em>Puerto Discovery</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConfiguracionMicroserviciosImpl extends MinimalEObjectImpl.Container
		implements ConfiguracionMicroservicios {
	/**
	 * The default value of the '{@link #getIpDiscovery() <em>Ip Discovery</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIpDiscovery()
	 * @generated
	 * @ordered
	 */
	protected static final String IP_DISCOVERY_EDEFAULT = "http://localhost";

	/**
	 * The cached value of the '{@link #getIpDiscovery() <em>Ip Discovery</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIpDiscovery()
	 * @generated
	 * @ordered
	 */
	protected String ipDiscovery = IP_DISCOVERY_EDEFAULT;

	/**
	 * The default value of the '{@link #getPuertoDiscovery() <em>Puerto Discovery</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPuertoDiscovery()
	 * @generated
	 * @ordered
	 */
	protected static final int PUERTO_DISCOVERY_EDEFAULT = 8761;

	/**
	 * The cached value of the '{@link #getPuertoDiscovery() <em>Puerto Discovery</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPuertoDiscovery()
	 * @generated
	 * @ordered
	 */
	protected int puertoDiscovery = PUERTO_DISCOVERY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfiguracionMicroserviciosImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DiagramaClasesCompletoPackage.Literals.CONFIGURACION_MICROSERVICIOS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIpDiscovery() {
		return ipDiscovery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIpDiscovery(String newIpDiscovery) {
		String oldIpDiscovery = ipDiscovery;
		ipDiscovery = newIpDiscovery;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DiagramaClasesCompletoPackage.CONFIGURACION_MICROSERVICIOS__IP_DISCOVERY, oldIpDiscovery,
					ipDiscovery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getPuertoDiscovery() {
		return puertoDiscovery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPuertoDiscovery(int newPuertoDiscovery) {
		int oldPuertoDiscovery = puertoDiscovery;
		puertoDiscovery = newPuertoDiscovery;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DiagramaClasesCompletoPackage.CONFIGURACION_MICROSERVICIOS__PUERTO_DISCOVERY, oldPuertoDiscovery,
					puertoDiscovery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case DiagramaClasesCompletoPackage.CONFIGURACION_MICROSERVICIOS__IP_DISCOVERY:
			return getIpDiscovery();
		case DiagramaClasesCompletoPackage.CONFIGURACION_MICROSERVICIOS__PUERTO_DISCOVERY:
			return getPuertoDiscovery();
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
		case DiagramaClasesCompletoPackage.CONFIGURACION_MICROSERVICIOS__IP_DISCOVERY:
			setIpDiscovery((String) newValue);
			return;
		case DiagramaClasesCompletoPackage.CONFIGURACION_MICROSERVICIOS__PUERTO_DISCOVERY:
			setPuertoDiscovery((Integer) newValue);
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
		case DiagramaClasesCompletoPackage.CONFIGURACION_MICROSERVICIOS__IP_DISCOVERY:
			setIpDiscovery(IP_DISCOVERY_EDEFAULT);
			return;
		case DiagramaClasesCompletoPackage.CONFIGURACION_MICROSERVICIOS__PUERTO_DISCOVERY:
			setPuertoDiscovery(PUERTO_DISCOVERY_EDEFAULT);
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
		case DiagramaClasesCompletoPackage.CONFIGURACION_MICROSERVICIOS__IP_DISCOVERY:
			return IP_DISCOVERY_EDEFAULT == null ? ipDiscovery != null : !IP_DISCOVERY_EDEFAULT.equals(ipDiscovery);
		case DiagramaClasesCompletoPackage.CONFIGURACION_MICROSERVICIOS__PUERTO_DISCOVERY:
			return puertoDiscovery != PUERTO_DISCOVERY_EDEFAULT;
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
		result.append(" (ipDiscovery: ");
		result.append(ipDiscovery);
		result.append(", puertoDiscovery: ");
		result.append(puertoDiscovery);
		result.append(')');
		return result.toString();
	}

} //ConfiguracionMicroserviciosImpl
