/**
 */
package diagramaClasesCompleto.impl;

import diagramaClasesCompleto.DiagramaClasesCompletoPackage;
import diagramaClasesCompleto.EndPoint;
import diagramaClasesCompleto.Operacion;
import diagramaClasesCompleto.ParametroInterno;
import diagramaClasesCompleto.Retornable;
import diagramaClasesCompleto.TipoRetorno;

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
 * An implementation of the model object '<em><b>Operacion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link diagramaClasesCompleto.impl.OperacionImpl#getTipoRetorno <em>Tipo Retorno</em>}</li>
 *   <li>{@link diagramaClasesCompleto.impl.OperacionImpl#isEsAbstracta <em>Es Abstracta</em>}</li>
 *   <li>{@link diagramaClasesCompleto.impl.OperacionImpl#getParametros_contenidos <em>Parametros contenidos</em>}</li>
 *   <li>{@link diagramaClasesCompleto.impl.OperacionImpl#getEndpoint <em>Endpoint</em>}</li>
 *   <li>{@link diagramaClasesCompleto.impl.OperacionImpl#getParametros_internos <em>Parametros internos</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperacionImpl extends RetornableImpl implements Operacion {
	/**
	 * The default value of the '{@link #getTipoRetorno() <em>Tipo Retorno</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipoRetorno()
	 * @generated
	 * @ordered
	 */
	protected static final TipoRetorno TIPO_RETORNO_EDEFAULT = TipoRetorno.VOID;

	/**
	 * The cached value of the '{@link #getTipoRetorno() <em>Tipo Retorno</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipoRetorno()
	 * @generated
	 * @ordered
	 */
	protected TipoRetorno tipoRetorno = TIPO_RETORNO_EDEFAULT;

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
	 * The cached value of the '{@link #getParametros_contenidos() <em>Parametros contenidos</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParametros_contenidos()
	 * @generated
	 * @ordered
	 */
	protected EList<Retornable> parametros_contenidos;

	/**
	 * The cached value of the '{@link #getEndpoint() <em>Endpoint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndpoint()
	 * @generated
	 * @ordered
	 */
	protected EndPoint endpoint;

	/**
	 * The cached value of the '{@link #getParametros_internos() <em>Parametros internos</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParametros_internos()
	 * @generated
	 * @ordered
	 */
	protected EList<ParametroInterno> parametros_internos;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperacionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DiagramaClasesCompletoPackage.Literals.OPERACION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TipoRetorno getTipoRetorno() {
		return tipoRetorno;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTipoRetorno(TipoRetorno newTipoRetorno) {
		TipoRetorno oldTipoRetorno = tipoRetorno;
		tipoRetorno = newTipoRetorno == null ? TIPO_RETORNO_EDEFAULT : newTipoRetorno;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiagramaClasesCompletoPackage.OPERACION__TIPO_RETORNO,
					oldTipoRetorno, tipoRetorno));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DiagramaClasesCompletoPackage.OPERACION__ES_ABSTRACTA,
					oldEsAbstracta, esAbstracta));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Retornable> getParametros_contenidos() {
		if (parametros_contenidos == null) {
			parametros_contenidos = new EObjectContainmentEList<Retornable>(Retornable.class, this,
					DiagramaClasesCompletoPackage.OPERACION__PARAMETROS_CONTENIDOS);
		}
		return parametros_contenidos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EndPoint getEndpoint() {
		return endpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEndpoint(EndPoint newEndpoint, NotificationChain msgs) {
		EndPoint oldEndpoint = endpoint;
		endpoint = newEndpoint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					DiagramaClasesCompletoPackage.OPERACION__ENDPOINT, oldEndpoint, newEndpoint);
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
	public void setEndpoint(EndPoint newEndpoint) {
		if (newEndpoint != endpoint) {
			NotificationChain msgs = null;
			if (endpoint != null)
				msgs = ((InternalEObject) endpoint).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - DiagramaClasesCompletoPackage.OPERACION__ENDPOINT, null, msgs);
			if (newEndpoint != null)
				msgs = ((InternalEObject) newEndpoint).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - DiagramaClasesCompletoPackage.OPERACION__ENDPOINT, null, msgs);
			msgs = basicSetEndpoint(newEndpoint, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiagramaClasesCompletoPackage.OPERACION__ENDPOINT,
					newEndpoint, newEndpoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ParametroInterno> getParametros_internos() {
		if (parametros_internos == null) {
			parametros_internos = new EObjectContainmentEList<ParametroInterno>(ParametroInterno.class, this,
					DiagramaClasesCompletoPackage.OPERACION__PARAMETROS_INTERNOS);
		}
		return parametros_internos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case DiagramaClasesCompletoPackage.OPERACION__PARAMETROS_CONTENIDOS:
			return ((InternalEList<?>) getParametros_contenidos()).basicRemove(otherEnd, msgs);
		case DiagramaClasesCompletoPackage.OPERACION__ENDPOINT:
			return basicSetEndpoint(null, msgs);
		case DiagramaClasesCompletoPackage.OPERACION__PARAMETROS_INTERNOS:
			return ((InternalEList<?>) getParametros_internos()).basicRemove(otherEnd, msgs);
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
		case DiagramaClasesCompletoPackage.OPERACION__TIPO_RETORNO:
			return getTipoRetorno();
		case DiagramaClasesCompletoPackage.OPERACION__ES_ABSTRACTA:
			return isEsAbstracta();
		case DiagramaClasesCompletoPackage.OPERACION__PARAMETROS_CONTENIDOS:
			return getParametros_contenidos();
		case DiagramaClasesCompletoPackage.OPERACION__ENDPOINT:
			return getEndpoint();
		case DiagramaClasesCompletoPackage.OPERACION__PARAMETROS_INTERNOS:
			return getParametros_internos();
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
		case DiagramaClasesCompletoPackage.OPERACION__TIPO_RETORNO:
			setTipoRetorno((TipoRetorno) newValue);
			return;
		case DiagramaClasesCompletoPackage.OPERACION__ES_ABSTRACTA:
			setEsAbstracta((Boolean) newValue);
			return;
		case DiagramaClasesCompletoPackage.OPERACION__PARAMETROS_CONTENIDOS:
			getParametros_contenidos().clear();
			getParametros_contenidos().addAll((Collection<? extends Retornable>) newValue);
			return;
		case DiagramaClasesCompletoPackage.OPERACION__ENDPOINT:
			setEndpoint((EndPoint) newValue);
			return;
		case DiagramaClasesCompletoPackage.OPERACION__PARAMETROS_INTERNOS:
			getParametros_internos().clear();
			getParametros_internos().addAll((Collection<? extends ParametroInterno>) newValue);
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
		case DiagramaClasesCompletoPackage.OPERACION__TIPO_RETORNO:
			setTipoRetorno(TIPO_RETORNO_EDEFAULT);
			return;
		case DiagramaClasesCompletoPackage.OPERACION__ES_ABSTRACTA:
			setEsAbstracta(ES_ABSTRACTA_EDEFAULT);
			return;
		case DiagramaClasesCompletoPackage.OPERACION__PARAMETROS_CONTENIDOS:
			getParametros_contenidos().clear();
			return;
		case DiagramaClasesCompletoPackage.OPERACION__ENDPOINT:
			setEndpoint((EndPoint) null);
			return;
		case DiagramaClasesCompletoPackage.OPERACION__PARAMETROS_INTERNOS:
			getParametros_internos().clear();
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
		case DiagramaClasesCompletoPackage.OPERACION__TIPO_RETORNO:
			return tipoRetorno != TIPO_RETORNO_EDEFAULT;
		case DiagramaClasesCompletoPackage.OPERACION__ES_ABSTRACTA:
			return esAbstracta != ES_ABSTRACTA_EDEFAULT;
		case DiagramaClasesCompletoPackage.OPERACION__PARAMETROS_CONTENIDOS:
			return parametros_contenidos != null && !parametros_contenidos.isEmpty();
		case DiagramaClasesCompletoPackage.OPERACION__ENDPOINT:
			return endpoint != null;
		case DiagramaClasesCompletoPackage.OPERACION__PARAMETROS_INTERNOS:
			return parametros_internos != null && !parametros_internos.isEmpty();
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
		result.append(" (tipoRetorno: ");
		result.append(tipoRetorno);
		result.append(", esAbstracta: ");
		result.append(esAbstracta);
		result.append(')');
		return result.toString();
	}

} //OperacionImpl
