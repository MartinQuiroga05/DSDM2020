/**
 */
package diagramaClasesCompleto.impl;

import diagramaClasesCompleto.Artefacto;
import diagramaClasesCompleto.DiagramaClasesCompletoPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Artefacto</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link diagramaClasesCompleto.impl.ArtefactoImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link diagramaClasesCompleto.impl.ArtefactoImpl#getGrupoId <em>Grupo Id</em>}</li>
 *   <li>{@link diagramaClasesCompleto.impl.ArtefactoImpl#getArtefactotId <em>Artefactot Id</em>}</li>
 *   <li>{@link diagramaClasesCompleto.impl.ArtefactoImpl#getDescripcion <em>Descripcion</em>}</li>
 *   <li>{@link diagramaClasesCompleto.impl.ArtefactoImpl#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArtefactoImpl extends MinimalEObjectImpl.Container implements Artefacto {
	/**
	 * The default value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected static final String NOMBRE_EDEFAULT = "Demo";

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
	 * The default value of the '{@link #getGrupoId() <em>Grupo Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrupoId()
	 * @generated
	 * @ordered
	 */
	protected static final String GRUPO_ID_EDEFAULT = "com.example";

	/**
	 * The cached value of the '{@link #getGrupoId() <em>Grupo Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrupoId()
	 * @generated
	 * @ordered
	 */
	protected String grupoId = GRUPO_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getArtefactotId() <em>Artefactot Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtefactotId()
	 * @generated
	 * @ordered
	 */
	protected static final String ARTEFACTOT_ID_EDEFAULT = "demo";

	/**
	 * The cached value of the '{@link #getArtefactotId() <em>Artefactot Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtefactotId()
	 * @generated
	 * @ordered
	 */
	protected String artefactotId = ARTEFACTOT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescripcion() <em>Descripcion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescripcion()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPCION_EDEFAULT = "Demo project";

	/**
	 * The cached value of the '{@link #getDescripcion() <em>Descripcion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescripcion()
	 * @generated
	 * @ordered
	 */
	protected String descripcion = DESCRIPCION_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = "0.0.1-SNAPSHOT";

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArtefactoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DiagramaClasesCompletoPackage.Literals.ARTEFACTO;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DiagramaClasesCompletoPackage.ARTEFACTO__NOMBRE,
					oldNombre, nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGrupoId() {
		return grupoId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGrupoId(String newGrupoId) {
		String oldGrupoId = grupoId;
		grupoId = newGrupoId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiagramaClasesCompletoPackage.ARTEFACTO__GRUPO_ID,
					oldGrupoId, grupoId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getArtefactotId() {
		return artefactotId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setArtefactotId(String newArtefactotId) {
		String oldArtefactotId = artefactotId;
		artefactotId = newArtefactotId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DiagramaClasesCompletoPackage.ARTEFACTO__ARTEFACTOT_ID, oldArtefactotId, artefactotId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescripcion(String newDescripcion) {
		String oldDescripcion = descripcion;
		descripcion = newDescripcion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiagramaClasesCompletoPackage.ARTEFACTO__DESCRIPCION,
					oldDescripcion, descripcion));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DiagramaClasesCompletoPackage.ARTEFACTO__VERSION,
					oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case DiagramaClasesCompletoPackage.ARTEFACTO__NOMBRE:
			return getNombre();
		case DiagramaClasesCompletoPackage.ARTEFACTO__GRUPO_ID:
			return getGrupoId();
		case DiagramaClasesCompletoPackage.ARTEFACTO__ARTEFACTOT_ID:
			return getArtefactotId();
		case DiagramaClasesCompletoPackage.ARTEFACTO__DESCRIPCION:
			return getDescripcion();
		case DiagramaClasesCompletoPackage.ARTEFACTO__VERSION:
			return getVersion();
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
		case DiagramaClasesCompletoPackage.ARTEFACTO__NOMBRE:
			setNombre((String) newValue);
			return;
		case DiagramaClasesCompletoPackage.ARTEFACTO__GRUPO_ID:
			setGrupoId((String) newValue);
			return;
		case DiagramaClasesCompletoPackage.ARTEFACTO__ARTEFACTOT_ID:
			setArtefactotId((String) newValue);
			return;
		case DiagramaClasesCompletoPackage.ARTEFACTO__DESCRIPCION:
			setDescripcion((String) newValue);
			return;
		case DiagramaClasesCompletoPackage.ARTEFACTO__VERSION:
			setVersion((String) newValue);
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
		case DiagramaClasesCompletoPackage.ARTEFACTO__NOMBRE:
			setNombre(NOMBRE_EDEFAULT);
			return;
		case DiagramaClasesCompletoPackage.ARTEFACTO__GRUPO_ID:
			setGrupoId(GRUPO_ID_EDEFAULT);
			return;
		case DiagramaClasesCompletoPackage.ARTEFACTO__ARTEFACTOT_ID:
			setArtefactotId(ARTEFACTOT_ID_EDEFAULT);
			return;
		case DiagramaClasesCompletoPackage.ARTEFACTO__DESCRIPCION:
			setDescripcion(DESCRIPCION_EDEFAULT);
			return;
		case DiagramaClasesCompletoPackage.ARTEFACTO__VERSION:
			setVersion(VERSION_EDEFAULT);
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
		case DiagramaClasesCompletoPackage.ARTEFACTO__NOMBRE:
			return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
		case DiagramaClasesCompletoPackage.ARTEFACTO__GRUPO_ID:
			return GRUPO_ID_EDEFAULT == null ? grupoId != null : !GRUPO_ID_EDEFAULT.equals(grupoId);
		case DiagramaClasesCompletoPackage.ARTEFACTO__ARTEFACTOT_ID:
			return ARTEFACTOT_ID_EDEFAULT == null ? artefactotId != null : !ARTEFACTOT_ID_EDEFAULT.equals(artefactotId);
		case DiagramaClasesCompletoPackage.ARTEFACTO__DESCRIPCION:
			return DESCRIPCION_EDEFAULT == null ? descripcion != null : !DESCRIPCION_EDEFAULT.equals(descripcion);
		case DiagramaClasesCompletoPackage.ARTEFACTO__VERSION:
			return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
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
		result.append(", grupoId: ");
		result.append(grupoId);
		result.append(", artefactotId: ");
		result.append(artefactotId);
		result.append(", descripcion: ");
		result.append(descripcion);
		result.append(", version: ");
		result.append(version);
		result.append(')');
		return result.toString();
	}

} //ArtefactoImpl
