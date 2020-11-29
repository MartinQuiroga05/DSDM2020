/**
 */
package diagramaClasesCompleto.impl;

import diagramaClasesCompleto.Clase;
import diagramaClasesCompleto.DiagramaClasesCompletoPackage;
import diagramaClasesCompleto.Realizacion;
import diagramaClasesCompleto.Relacion;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Clase</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link diagramaClasesCompleto.impl.ClaseImpl#getRelaciones_contenidas <em>Relaciones contenidas</em>}</li>
 *   <li>{@link diagramaClasesCompleto.impl.ClaseImpl#isEsAbstracta <em>Es Abstracta</em>}</li>
 *   <li>{@link diagramaClasesCompleto.impl.ClaseImpl#getRealizaciones_contenidas <em>Realizaciones contenidas</em>}</li>
 *   <li>{@link diagramaClasesCompleto.impl.ClaseImpl#isEsAsociativa <em>Es Asociativa</em>}</li>
 *   <li>{@link diagramaClasesCompleto.impl.ClaseImpl#isEsAuditable <em>Es Auditable</em>}</li>
 *   <li>{@link diagramaClasesCompleto.impl.ClaseImpl#isTieneABM <em>Tiene ABM</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClaseImpl extends ClasificadorImpl implements Clase {
	/**
	 * The cached value of the '{@link #getRelaciones_contenidas() <em>Relaciones contenidas</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelaciones_contenidas()
	 * @generated
	 * @ordered
	 */
	protected EList<Relacion> relaciones_contenidas;

	/**
	 * The default value of the '{@link #isEsAbstracta() <em>Es Abstracta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEsAbstracta()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ES_ABSTRACTA_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEsAbstracta() <em>Es Abstracta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEsAbstracta()
	 * @generated
	 * @ordered
	 */
	protected boolean esAbstracta = ES_ABSTRACTA_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRealizaciones_contenidas() <em>Realizaciones contenidas</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealizaciones_contenidas()
	 * @generated
	 * @ordered
	 */
	protected EList<Realizacion> realizaciones_contenidas;

	/**
	 * The default value of the '{@link #isEsAsociativa() <em>Es Asociativa</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEsAsociativa()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ES_ASOCIATIVA_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEsAsociativa() <em>Es Asociativa</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEsAsociativa()
	 * @generated
	 * @ordered
	 */
	protected boolean esAsociativa = ES_ASOCIATIVA_EDEFAULT;

	/**
	 * The default value of the '{@link #isEsAuditable() <em>Es Auditable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEsAuditable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ES_AUDITABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEsAuditable() <em>Es Auditable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEsAuditable()
	 * @generated
	 * @ordered
	 */
	protected boolean esAuditable = ES_AUDITABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #isTieneABM() <em>Tiene ABM</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTieneABM()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TIENE_ABM_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTieneABM() <em>Tiene ABM</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTieneABM()
	 * @generated
	 * @ordered
	 */
	protected boolean tieneABM = TIENE_ABM_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DiagramaClasesCompletoPackage.Literals.CLASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Relacion> getRelaciones_contenidas() {
		if (relaciones_contenidas == null) {
			relaciones_contenidas = new EObjectContainmentEList<Relacion>(Relacion.class, this,
					DiagramaClasesCompletoPackage.CLASE__RELACIONES_CONTENIDAS);
		}
		return relaciones_contenidas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isEsAbstracta() {
		return esAbstracta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEsAbstracta(boolean newEsAbstracta) {
		boolean oldEsAbstracta = esAbstracta;
		esAbstracta = newEsAbstracta;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiagramaClasesCompletoPackage.CLASE__ES_ABSTRACTA,
					oldEsAbstracta, esAbstracta));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Realizacion> getRealizaciones_contenidas() {
		if (realizaciones_contenidas == null) {
			realizaciones_contenidas = new EObjectContainmentEList<Realizacion>(Realizacion.class, this,
					DiagramaClasesCompletoPackage.CLASE__REALIZACIONES_CONTENIDAS);
		}
		return realizaciones_contenidas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isEsAsociativa() {
		return esAsociativa;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEsAsociativa(boolean newEsAsociativa) {
		boolean oldEsAsociativa = esAsociativa;
		esAsociativa = newEsAsociativa;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiagramaClasesCompletoPackage.CLASE__ES_ASOCIATIVA,
					oldEsAsociativa, esAsociativa));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isEsAuditable() {
		return esAuditable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEsAuditable(boolean newEsAuditable) {
		boolean oldEsAuditable = esAuditable;
		esAuditable = newEsAuditable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiagramaClasesCompletoPackage.CLASE__ES_AUDITABLE,
					oldEsAuditable, esAuditable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isTieneABM() {
		return tieneABM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTieneABM(boolean newTieneABM) {
		boolean oldTieneABM = tieneABM;
		tieneABM = newTieneABM;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiagramaClasesCompletoPackage.CLASE__TIENE_ABM,
					oldTieneABM, tieneABM));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case DiagramaClasesCompletoPackage.CLASE__RELACIONES_CONTENIDAS:
			return ((InternalEList<?>) getRelaciones_contenidas()).basicRemove(otherEnd, msgs);
		case DiagramaClasesCompletoPackage.CLASE__REALIZACIONES_CONTENIDAS:
			return ((InternalEList<?>) getRealizaciones_contenidas()).basicRemove(otherEnd, msgs);
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
		case DiagramaClasesCompletoPackage.CLASE__RELACIONES_CONTENIDAS:
			return getRelaciones_contenidas();
		case DiagramaClasesCompletoPackage.CLASE__ES_ABSTRACTA:
			return isEsAbstracta();
		case DiagramaClasesCompletoPackage.CLASE__REALIZACIONES_CONTENIDAS:
			return getRealizaciones_contenidas();
		case DiagramaClasesCompletoPackage.CLASE__ES_ASOCIATIVA:
			return isEsAsociativa();
		case DiagramaClasesCompletoPackage.CLASE__ES_AUDITABLE:
			return isEsAuditable();
		case DiagramaClasesCompletoPackage.CLASE__TIENE_ABM:
			return isTieneABM();
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
		case DiagramaClasesCompletoPackage.CLASE__RELACIONES_CONTENIDAS:
			getRelaciones_contenidas().clear();
			getRelaciones_contenidas().addAll((Collection<? extends Relacion>) newValue);
			return;
		case DiagramaClasesCompletoPackage.CLASE__ES_ABSTRACTA:
			setEsAbstracta((Boolean) newValue);
			return;
		case DiagramaClasesCompletoPackage.CLASE__REALIZACIONES_CONTENIDAS:
			getRealizaciones_contenidas().clear();
			getRealizaciones_contenidas().addAll((Collection<? extends Realizacion>) newValue);
			return;
		case DiagramaClasesCompletoPackage.CLASE__ES_ASOCIATIVA:
			setEsAsociativa((Boolean) newValue);
			return;
		case DiagramaClasesCompletoPackage.CLASE__ES_AUDITABLE:
			setEsAuditable((Boolean) newValue);
			return;
		case DiagramaClasesCompletoPackage.CLASE__TIENE_ABM:
			setTieneABM((Boolean) newValue);
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
		case DiagramaClasesCompletoPackage.CLASE__RELACIONES_CONTENIDAS:
			getRelaciones_contenidas().clear();
			return;
		case DiagramaClasesCompletoPackage.CLASE__ES_ABSTRACTA:
			setEsAbstracta(ES_ABSTRACTA_EDEFAULT);
			return;
		case DiagramaClasesCompletoPackage.CLASE__REALIZACIONES_CONTENIDAS:
			getRealizaciones_contenidas().clear();
			return;
		case DiagramaClasesCompletoPackage.CLASE__ES_ASOCIATIVA:
			setEsAsociativa(ES_ASOCIATIVA_EDEFAULT);
			return;
		case DiagramaClasesCompletoPackage.CLASE__ES_AUDITABLE:
			setEsAuditable(ES_AUDITABLE_EDEFAULT);
			return;
		case DiagramaClasesCompletoPackage.CLASE__TIENE_ABM:
			setTieneABM(TIENE_ABM_EDEFAULT);
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
		case DiagramaClasesCompletoPackage.CLASE__RELACIONES_CONTENIDAS:
			return relaciones_contenidas != null && !relaciones_contenidas.isEmpty();
		case DiagramaClasesCompletoPackage.CLASE__ES_ABSTRACTA:
			return esAbstracta != ES_ABSTRACTA_EDEFAULT;
		case DiagramaClasesCompletoPackage.CLASE__REALIZACIONES_CONTENIDAS:
			return realizaciones_contenidas != null && !realizaciones_contenidas.isEmpty();
		case DiagramaClasesCompletoPackage.CLASE__ES_ASOCIATIVA:
			return esAsociativa != ES_ASOCIATIVA_EDEFAULT;
		case DiagramaClasesCompletoPackage.CLASE__ES_AUDITABLE:
			return esAuditable != ES_AUDITABLE_EDEFAULT;
		case DiagramaClasesCompletoPackage.CLASE__TIENE_ABM:
			return tieneABM != TIENE_ABM_EDEFAULT;
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
		result.append(" (esAbstracta: ");
		result.append(esAbstracta);
		result.append(", esAsociativa: ");
		result.append(esAsociativa);
		result.append(", esAuditable: ");
		result.append(esAuditable);
		result.append(", tieneABM: ");
		result.append(tieneABM);
		result.append(')');
		return result.toString();
	}

} //ClaseImpl
