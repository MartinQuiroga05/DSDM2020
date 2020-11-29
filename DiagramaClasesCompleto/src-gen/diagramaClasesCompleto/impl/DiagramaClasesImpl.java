/**
 */
package diagramaClasesCompleto.impl;

import diagramaClasesCompleto.Artefacto;
import diagramaClasesCompleto.ConfiguracionDB;
import diagramaClasesCompleto.ConfiguracionDocker;
import diagramaClasesCompleto.ConfiguracionLenguaje;
import diagramaClasesCompleto.ConfiguracionMicroservicios;
import diagramaClasesCompleto.DiagramaClases;
import diagramaClasesCompleto.DiagramaClasesCompletoPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diagrama Clases</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link diagramaClasesCompleto.impl.DiagramaClasesImpl#getPackages_contenidos <em>Packages contenidos</em>}</li>
 *   <li>{@link diagramaClasesCompleto.impl.DiagramaClasesImpl#getArtefacto_contenido <em>Artefacto contenido</em>}</li>
 *   <li>{@link diagramaClasesCompleto.impl.DiagramaClasesImpl#getConfiguraciondb <em>Configuraciondb</em>}</li>
 *   <li>{@link diagramaClasesCompleto.impl.DiagramaClasesImpl#getConfiguraciondocker <em>Configuraciondocker</em>}</li>
 *   <li>{@link diagramaClasesCompleto.impl.DiagramaClasesImpl#getConfiguracionlenguaje <em>Configuracionlenguaje</em>}</li>
 *   <li>{@link diagramaClasesCompleto.impl.DiagramaClasesImpl#getConfiguracionmicroservicios <em>Configuracionmicroservicios</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DiagramaClasesImpl extends MinimalEObjectImpl.Container implements DiagramaClases {
	/**
	 * The cached value of the '{@link #getPackages_contenidos() <em>Packages contenidos</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackages_contenidos()
	 * @generated
	 * @ordered
	 */
	protected EList<diagramaClasesCompleto.Package> packages_contenidos;

	/**
	 * The cached value of the '{@link #getArtefacto_contenido() <em>Artefacto contenido</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtefacto_contenido()
	 * @generated
	 * @ordered
	 */
	protected Artefacto artefacto_contenido;

	/**
	 * The cached value of the '{@link #getConfiguraciondb() <em>Configuraciondb</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfiguraciondb()
	 * @generated
	 * @ordered
	 */
	protected EList<ConfiguracionDB> configuraciondb;

	/**
	 * The cached value of the '{@link #getConfiguraciondocker() <em>Configuraciondocker</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfiguraciondocker()
	 * @generated
	 * @ordered
	 */
	protected EList<ConfiguracionDocker> configuraciondocker;

	/**
	 * The cached value of the '{@link #getConfiguracionlenguaje() <em>Configuracionlenguaje</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfiguracionlenguaje()
	 * @generated
	 * @ordered
	 */
	protected EList<ConfiguracionLenguaje> configuracionlenguaje;

	/**
	 * The cached value of the '{@link #getConfiguracionmicroservicios() <em>Configuracionmicroservicios</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfiguracionmicroservicios()
	 * @generated
	 * @ordered
	 */
	protected EList<ConfiguracionMicroservicios> configuracionmicroservicios;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiagramaClasesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DiagramaClasesCompletoPackage.Literals.DIAGRAMA_CLASES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<diagramaClasesCompleto.Package> getPackages_contenidos() {
		if (packages_contenidos == null) {
			packages_contenidos = new EObjectContainmentEList<diagramaClasesCompleto.Package>(
					diagramaClasesCompleto.Package.class, this,
					DiagramaClasesCompletoPackage.DIAGRAMA_CLASES__PACKAGES_CONTENIDOS);
		}
		return packages_contenidos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Artefacto getArtefacto_contenido() {
		return artefacto_contenido;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArtefacto_contenido(Artefacto newArtefacto_contenido, NotificationChain msgs) {
		Artefacto oldArtefacto_contenido = artefacto_contenido;
		artefacto_contenido = newArtefacto_contenido;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					DiagramaClasesCompletoPackage.DIAGRAMA_CLASES__ARTEFACTO_CONTENIDO, oldArtefacto_contenido,
					newArtefacto_contenido);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setArtefacto_contenido(Artefacto newArtefacto_contenido) {
		if (newArtefacto_contenido != artefacto_contenido) {
			NotificationChain msgs = null;
			if (artefacto_contenido != null)
				msgs = ((InternalEObject) artefacto_contenido).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - DiagramaClasesCompletoPackage.DIAGRAMA_CLASES__ARTEFACTO_CONTENIDO,
						null, msgs);
			if (newArtefacto_contenido != null)
				msgs = ((InternalEObject) newArtefacto_contenido).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - DiagramaClasesCompletoPackage.DIAGRAMA_CLASES__ARTEFACTO_CONTENIDO,
						null, msgs);
			msgs = basicSetArtefacto_contenido(newArtefacto_contenido, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DiagramaClasesCompletoPackage.DIAGRAMA_CLASES__ARTEFACTO_CONTENIDO, newArtefacto_contenido,
					newArtefacto_contenido));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConfiguracionDB> getConfiguraciondb() {
		if (configuraciondb == null) {
			configuraciondb = new EObjectContainmentEList<ConfiguracionDB>(ConfiguracionDB.class, this,
					DiagramaClasesCompletoPackage.DIAGRAMA_CLASES__CONFIGURACIONDB);
		}
		return configuraciondb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConfiguracionDocker> getConfiguraciondocker() {
		if (configuraciondocker == null) {
			configuraciondocker = new EObjectContainmentEList<ConfiguracionDocker>(ConfiguracionDocker.class, this,
					DiagramaClasesCompletoPackage.DIAGRAMA_CLASES__CONFIGURACIONDOCKER);
		}
		return configuraciondocker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConfiguracionLenguaje> getConfiguracionlenguaje() {
		if (configuracionlenguaje == null) {
			configuracionlenguaje = new EObjectContainmentEList<ConfiguracionLenguaje>(ConfiguracionLenguaje.class,
					this, DiagramaClasesCompletoPackage.DIAGRAMA_CLASES__CONFIGURACIONLENGUAJE);
		}
		return configuracionlenguaje;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConfiguracionMicroservicios> getConfiguracionmicroservicios() {
		if (configuracionmicroservicios == null) {
			configuracionmicroservicios = new EObjectContainmentEList<ConfiguracionMicroservicios>(
					ConfiguracionMicroservicios.class, this,
					DiagramaClasesCompletoPackage.DIAGRAMA_CLASES__CONFIGURACIONMICROSERVICIOS);
		}
		return configuracionmicroservicios;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case DiagramaClasesCompletoPackage.DIAGRAMA_CLASES__PACKAGES_CONTENIDOS:
			return ((InternalEList<?>) getPackages_contenidos()).basicRemove(otherEnd, msgs);
		case DiagramaClasesCompletoPackage.DIAGRAMA_CLASES__ARTEFACTO_CONTENIDO:
			return basicSetArtefacto_contenido(null, msgs);
		case DiagramaClasesCompletoPackage.DIAGRAMA_CLASES__CONFIGURACIONDB:
			return ((InternalEList<?>) getConfiguraciondb()).basicRemove(otherEnd, msgs);
		case DiagramaClasesCompletoPackage.DIAGRAMA_CLASES__CONFIGURACIONDOCKER:
			return ((InternalEList<?>) getConfiguraciondocker()).basicRemove(otherEnd, msgs);
		case DiagramaClasesCompletoPackage.DIAGRAMA_CLASES__CONFIGURACIONLENGUAJE:
			return ((InternalEList<?>) getConfiguracionlenguaje()).basicRemove(otherEnd, msgs);
		case DiagramaClasesCompletoPackage.DIAGRAMA_CLASES__CONFIGURACIONMICROSERVICIOS:
			return ((InternalEList<?>) getConfiguracionmicroservicios()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case DiagramaClasesCompletoPackage.DIAGRAMA_CLASES__PACKAGES_CONTENIDOS:
			return getPackages_contenidos();
		case DiagramaClasesCompletoPackage.DIAGRAMA_CLASES__ARTEFACTO_CONTENIDO:
			return getArtefacto_contenido();
		case DiagramaClasesCompletoPackage.DIAGRAMA_CLASES__CONFIGURACIONDB:
			return getConfiguraciondb();
		case DiagramaClasesCompletoPackage.DIAGRAMA_CLASES__CONFIGURACIONDOCKER:
			return getConfiguraciondocker();
		case DiagramaClasesCompletoPackage.DIAGRAMA_CLASES__CONFIGURACIONLENGUAJE:
			return getConfiguracionlenguaje();
		case DiagramaClasesCompletoPackage.DIAGRAMA_CLASES__CONFIGURACIONMICROSERVICIOS:
			return getConfiguracionmicroservicios();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case DiagramaClasesCompletoPackage.DIAGRAMA_CLASES__PACKAGES_CONTENIDOS:
			getPackages_contenidos().clear();
			getPackages_contenidos().addAll((Collection<? extends diagramaClasesCompleto.Package>) newValue);
			return;
		case DiagramaClasesCompletoPackage.DIAGRAMA_CLASES__ARTEFACTO_CONTENIDO:
			setArtefacto_contenido((Artefacto) newValue);
			return;
		case DiagramaClasesCompletoPackage.DIAGRAMA_CLASES__CONFIGURACIONDB:
			getConfiguraciondb().clear();
			getConfiguraciondb().addAll((Collection<? extends ConfiguracionDB>) newValue);
			return;
		case DiagramaClasesCompletoPackage.DIAGRAMA_CLASES__CONFIGURACIONDOCKER:
			getConfiguraciondocker().clear();
			getConfiguraciondocker().addAll((Collection<? extends ConfiguracionDocker>) newValue);
			return;
		case DiagramaClasesCompletoPackage.DIAGRAMA_CLASES__CONFIGURACIONLENGUAJE:
			getConfiguracionlenguaje().clear();
			getConfiguracionlenguaje().addAll((Collection<? extends ConfiguracionLenguaje>) newValue);
			return;
		case DiagramaClasesCompletoPackage.DIAGRAMA_CLASES__CONFIGURACIONMICROSERVICIOS:
			getConfiguracionmicroservicios().clear();
			getConfiguracionmicroservicios().addAll((Collection<? extends ConfiguracionMicroservicios>) newValue);
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
		case DiagramaClasesCompletoPackage.DIAGRAMA_CLASES__PACKAGES_CONTENIDOS:
			getPackages_contenidos().clear();
			return;
		case DiagramaClasesCompletoPackage.DIAGRAMA_CLASES__ARTEFACTO_CONTENIDO:
			setArtefacto_contenido((Artefacto) null);
			return;
		case DiagramaClasesCompletoPackage.DIAGRAMA_CLASES__CONFIGURACIONDB:
			getConfiguraciondb().clear();
			return;
		case DiagramaClasesCompletoPackage.DIAGRAMA_CLASES__CONFIGURACIONDOCKER:
			getConfiguraciondocker().clear();
			return;
		case DiagramaClasesCompletoPackage.DIAGRAMA_CLASES__CONFIGURACIONLENGUAJE:
			getConfiguracionlenguaje().clear();
			return;
		case DiagramaClasesCompletoPackage.DIAGRAMA_CLASES__CONFIGURACIONMICROSERVICIOS:
			getConfiguracionmicroservicios().clear();
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
		case DiagramaClasesCompletoPackage.DIAGRAMA_CLASES__PACKAGES_CONTENIDOS:
			return packages_contenidos != null && !packages_contenidos.isEmpty();
		case DiagramaClasesCompletoPackage.DIAGRAMA_CLASES__ARTEFACTO_CONTENIDO:
			return artefacto_contenido != null;
		case DiagramaClasesCompletoPackage.DIAGRAMA_CLASES__CONFIGURACIONDB:
			return configuraciondb != null && !configuraciondb.isEmpty();
		case DiagramaClasesCompletoPackage.DIAGRAMA_CLASES__CONFIGURACIONDOCKER:
			return configuraciondocker != null && !configuraciondocker.isEmpty();
		case DiagramaClasesCompletoPackage.DIAGRAMA_CLASES__CONFIGURACIONLENGUAJE:
			return configuracionlenguaje != null && !configuracionlenguaje.isEmpty();
		case DiagramaClasesCompletoPackage.DIAGRAMA_CLASES__CONFIGURACIONMICROSERVICIOS:
			return configuracionmicroservicios != null && !configuracionmicroservicios.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DiagramaClasesImpl
