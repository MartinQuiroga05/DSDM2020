/**
 */
package diagramaClasesCompleto.impl;

import diagramaClasesCompleto.ConfiguracionDocker;
import diagramaClasesCompleto.DiagramaClasesCompletoPackage;
import diagramaClasesCompleto.TipoReinicio;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Configuracion Docker</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link diagramaClasesCompleto.impl.ConfiguracionDockerImpl#getNombreContenedor <em>Nombre Contenedor</em>}</li>
 *   <li>{@link diagramaClasesCompleto.impl.ConfiguracionDockerImpl#getPuertoInterior <em>Puerto Interior</em>}</li>
 *   <li>{@link diagramaClasesCompleto.impl.ConfiguracionDockerImpl#getTipoReinicio <em>Tipo Reinicio</em>}</li>
 *   <li>{@link diagramaClasesCompleto.impl.ConfiguracionDockerImpl#getNombreImagen <em>Nombre Imagen</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConfiguracionDockerImpl extends MinimalEObjectImpl.Container implements ConfiguracionDocker {
	/**
	 * The default value of the '{@link #getNombreContenedor() <em>Nombre Contenedor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreContenedor()
	 * @generated
	 * @ordered
	 */
	protected static final String NOMBRE_CONTENEDOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNombreContenedor() <em>Nombre Contenedor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreContenedor()
	 * @generated
	 * @ordered
	 */
	protected String nombreContenedor = NOMBRE_CONTENEDOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getPuertoInterior() <em>Puerto Interior</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPuertoInterior()
	 * @generated
	 * @ordered
	 */
	protected static final int PUERTO_INTERIOR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPuertoInterior() <em>Puerto Interior</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPuertoInterior()
	 * @generated
	 * @ordered
	 */
	protected int puertoInterior = PUERTO_INTERIOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getTipoReinicio() <em>Tipo Reinicio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipoReinicio()
	 * @generated
	 * @ordered
	 */
	protected static final TipoReinicio TIPO_REINICIO_EDEFAULT = TipoReinicio.SIEMPRE;

	/**
	 * The cached value of the '{@link #getTipoReinicio() <em>Tipo Reinicio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipoReinicio()
	 * @generated
	 * @ordered
	 */
	protected TipoReinicio tipoReinicio = TIPO_REINICIO_EDEFAULT;

	/**
	 * The default value of the '{@link #getNombreImagen() <em>Nombre Imagen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreImagen()
	 * @generated
	 * @ordered
	 */
	protected static final String NOMBRE_IMAGEN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNombreImagen() <em>Nombre Imagen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreImagen()
	 * @generated
	 * @ordered
	 */
	protected String nombreImagen = NOMBRE_IMAGEN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfiguracionDockerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DiagramaClasesCompletoPackage.Literals.CONFIGURACION_DOCKER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNombreContenedor() {
		return nombreContenedor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNombreContenedor(String newNombreContenedor) {
		String oldNombreContenedor = nombreContenedor;
		nombreContenedor = newNombreContenedor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DiagramaClasesCompletoPackage.CONFIGURACION_DOCKER__NOMBRE_CONTENEDOR, oldNombreContenedor,
					nombreContenedor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getPuertoInterior() {
		return puertoInterior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPuertoInterior(int newPuertoInterior) {
		int oldPuertoInterior = puertoInterior;
		puertoInterior = newPuertoInterior;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DiagramaClasesCompletoPackage.CONFIGURACION_DOCKER__PUERTO_INTERIOR, oldPuertoInterior,
					puertoInterior));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TipoReinicio getTipoReinicio() {
		return tipoReinicio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTipoReinicio(TipoReinicio newTipoReinicio) {
		TipoReinicio oldTipoReinicio = tipoReinicio;
		tipoReinicio = newTipoReinicio == null ? TIPO_REINICIO_EDEFAULT : newTipoReinicio;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DiagramaClasesCompletoPackage.CONFIGURACION_DOCKER__TIPO_REINICIO, oldTipoReinicio, tipoReinicio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNombreImagen() {
		return nombreImagen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNombreImagen(String newNombreImagen) {
		String oldNombreImagen = nombreImagen;
		nombreImagen = newNombreImagen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DiagramaClasesCompletoPackage.CONFIGURACION_DOCKER__NOMBRE_IMAGEN, oldNombreImagen, nombreImagen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case DiagramaClasesCompletoPackage.CONFIGURACION_DOCKER__NOMBRE_CONTENEDOR:
			return getNombreContenedor();
		case DiagramaClasesCompletoPackage.CONFIGURACION_DOCKER__PUERTO_INTERIOR:
			return getPuertoInterior();
		case DiagramaClasesCompletoPackage.CONFIGURACION_DOCKER__TIPO_REINICIO:
			return getTipoReinicio();
		case DiagramaClasesCompletoPackage.CONFIGURACION_DOCKER__NOMBRE_IMAGEN:
			return getNombreImagen();
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
		case DiagramaClasesCompletoPackage.CONFIGURACION_DOCKER__NOMBRE_CONTENEDOR:
			setNombreContenedor((String) newValue);
			return;
		case DiagramaClasesCompletoPackage.CONFIGURACION_DOCKER__PUERTO_INTERIOR:
			setPuertoInterior((Integer) newValue);
			return;
		case DiagramaClasesCompletoPackage.CONFIGURACION_DOCKER__TIPO_REINICIO:
			setTipoReinicio((TipoReinicio) newValue);
			return;
		case DiagramaClasesCompletoPackage.CONFIGURACION_DOCKER__NOMBRE_IMAGEN:
			setNombreImagen((String) newValue);
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
		case DiagramaClasesCompletoPackage.CONFIGURACION_DOCKER__NOMBRE_CONTENEDOR:
			setNombreContenedor(NOMBRE_CONTENEDOR_EDEFAULT);
			return;
		case DiagramaClasesCompletoPackage.CONFIGURACION_DOCKER__PUERTO_INTERIOR:
			setPuertoInterior(PUERTO_INTERIOR_EDEFAULT);
			return;
		case DiagramaClasesCompletoPackage.CONFIGURACION_DOCKER__TIPO_REINICIO:
			setTipoReinicio(TIPO_REINICIO_EDEFAULT);
			return;
		case DiagramaClasesCompletoPackage.CONFIGURACION_DOCKER__NOMBRE_IMAGEN:
			setNombreImagen(NOMBRE_IMAGEN_EDEFAULT);
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
		case DiagramaClasesCompletoPackage.CONFIGURACION_DOCKER__NOMBRE_CONTENEDOR:
			return NOMBRE_CONTENEDOR_EDEFAULT == null ? nombreContenedor != null
					: !NOMBRE_CONTENEDOR_EDEFAULT.equals(nombreContenedor);
		case DiagramaClasesCompletoPackage.CONFIGURACION_DOCKER__PUERTO_INTERIOR:
			return puertoInterior != PUERTO_INTERIOR_EDEFAULT;
		case DiagramaClasesCompletoPackage.CONFIGURACION_DOCKER__TIPO_REINICIO:
			return tipoReinicio != TIPO_REINICIO_EDEFAULT;
		case DiagramaClasesCompletoPackage.CONFIGURACION_DOCKER__NOMBRE_IMAGEN:
			return NOMBRE_IMAGEN_EDEFAULT == null ? nombreImagen != null : !NOMBRE_IMAGEN_EDEFAULT.equals(nombreImagen);
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
		result.append(" (nombreContenedor: ");
		result.append(nombreContenedor);
		result.append(", puertoInterior: ");
		result.append(puertoInterior);
		result.append(", tipoReinicio: ");
		result.append(tipoReinicio);
		result.append(", nombreImagen: ");
		result.append(nombreImagen);
		result.append(')');
		return result.toString();
	}

} //ConfiguracionDockerImpl
