/**
 */
package diagramaClasesCompleto.impl;

import diagramaClasesCompleto.DiagramaClasesCompletoPackage;
import diagramaClasesCompleto.ModicadoresAcceso;
import diagramaClasesCompleto.Retornable;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Retornable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link diagramaClasesCompleto.impl.RetornableImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link diagramaClasesCompleto.impl.RetornableImpl#getVisibilidad <em>Visibilidad</em>}</li>
 *   <li>{@link diagramaClasesCompleto.impl.RetornableImpl#isEsFinal <em>Es Final</em>}</li>
 *   <li>{@link diagramaClasesCompleto.impl.RetornableImpl#isEsStatic <em>Es Static</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class RetornableImpl extends MinimalEObjectImpl.Container implements Retornable {
	/**
	 * The default value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected static final String NOMBRE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected String nombre = NOMBRE_EDEFAULT;

	/**
	 * The default value of the '{@link #getVisibilidad() <em>Visibilidad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibilidad()
	 * @generated
	 * @ordered
	 */
	protected static final ModicadoresAcceso VISIBILIDAD_EDEFAULT = ModicadoresAcceso.PACKAGE;

	/**
	 * The cached value of the '{@link #getVisibilidad() <em>Visibilidad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibilidad()
	 * @generated
	 * @ordered
	 */
	protected ModicadoresAcceso visibilidad = VISIBILIDAD_EDEFAULT;

	/**
	 * The default value of the '{@link #isEsFinal() <em>Es Final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEsFinal()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ES_FINAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEsFinal() <em>Es Final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEsFinal()
	 * @generated
	 * @ordered
	 */
	protected boolean esFinal = ES_FINAL_EDEFAULT;

	/**
	 * The default value of the '{@link #isEsStatic() <em>Es Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEsStatic()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ES_STATIC_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEsStatic() <em>Es Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEsStatic()
	 * @generated
	 * @ordered
	 */
	protected boolean esStatic = ES_STATIC_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RetornableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DiagramaClasesCompletoPackage.Literals.RETORNABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNombre() {
		return nombre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNombre(String newNombre) {
		String oldNombre = nombre;
		nombre = newNombre;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiagramaClasesCompletoPackage.RETORNABLE__NOMBRE,
					oldNombre, nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModicadoresAcceso getVisibilidad() {
		return visibilidad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVisibilidad(ModicadoresAcceso newVisibilidad) {
		ModicadoresAcceso oldVisibilidad = visibilidad;
		visibilidad = newVisibilidad == null ? VISIBILIDAD_EDEFAULT : newVisibilidad;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiagramaClasesCompletoPackage.RETORNABLE__VISIBILIDAD,
					oldVisibilidad, visibilidad));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isEsFinal() {
		return esFinal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEsFinal(boolean newEsFinal) {
		boolean oldEsFinal = esFinal;
		esFinal = newEsFinal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiagramaClasesCompletoPackage.RETORNABLE__ES_FINAL,
					oldEsFinal, esFinal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isEsStatic() {
		return esStatic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEsStatic(boolean newEsStatic) {
		boolean oldEsStatic = esStatic;
		esStatic = newEsStatic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiagramaClasesCompletoPackage.RETORNABLE__ES_STATIC,
					oldEsStatic, esStatic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case DiagramaClasesCompletoPackage.RETORNABLE__NOMBRE:
			return getNombre();
		case DiagramaClasesCompletoPackage.RETORNABLE__VISIBILIDAD:
			return getVisibilidad();
		case DiagramaClasesCompletoPackage.RETORNABLE__ES_FINAL:
			return isEsFinal();
		case DiagramaClasesCompletoPackage.RETORNABLE__ES_STATIC:
			return isEsStatic();
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
		case DiagramaClasesCompletoPackage.RETORNABLE__NOMBRE:
			setNombre((String) newValue);
			return;
		case DiagramaClasesCompletoPackage.RETORNABLE__VISIBILIDAD:
			setVisibilidad((ModicadoresAcceso) newValue);
			return;
		case DiagramaClasesCompletoPackage.RETORNABLE__ES_FINAL:
			setEsFinal((Boolean) newValue);
			return;
		case DiagramaClasesCompletoPackage.RETORNABLE__ES_STATIC:
			setEsStatic((Boolean) newValue);
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
		case DiagramaClasesCompletoPackage.RETORNABLE__NOMBRE:
			setNombre(NOMBRE_EDEFAULT);
			return;
		case DiagramaClasesCompletoPackage.RETORNABLE__VISIBILIDAD:
			setVisibilidad(VISIBILIDAD_EDEFAULT);
			return;
		case DiagramaClasesCompletoPackage.RETORNABLE__ES_FINAL:
			setEsFinal(ES_FINAL_EDEFAULT);
			return;
		case DiagramaClasesCompletoPackage.RETORNABLE__ES_STATIC:
			setEsStatic(ES_STATIC_EDEFAULT);
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
		case DiagramaClasesCompletoPackage.RETORNABLE__NOMBRE:
			return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
		case DiagramaClasesCompletoPackage.RETORNABLE__VISIBILIDAD:
			return visibilidad != VISIBILIDAD_EDEFAULT;
		case DiagramaClasesCompletoPackage.RETORNABLE__ES_FINAL:
			return esFinal != ES_FINAL_EDEFAULT;
		case DiagramaClasesCompletoPackage.RETORNABLE__ES_STATIC:
			return esStatic != ES_STATIC_EDEFAULT;
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
		result.append(" (nombre: ");
		result.append(nombre);
		result.append(", visibilidad: ");
		result.append(visibilidad);
		result.append(", esFinal: ");
		result.append(esFinal);
		result.append(", esStatic: ");
		result.append(esStatic);
		result.append(')');
		return result.toString();
	}

} //RetornableImpl
