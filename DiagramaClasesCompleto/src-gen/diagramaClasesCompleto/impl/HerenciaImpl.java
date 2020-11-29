/**
 */
package diagramaClasesCompleto.impl;

import diagramaClasesCompleto.Clasificador;
import diagramaClasesCompleto.DiagramaClasesCompletoPackage;
import diagramaClasesCompleto.Herencia;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Herencia</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link diagramaClasesCompleto.impl.HerenciaImpl#getOrigen <em>Origen</em>}</li>
 *   <li>{@link diagramaClasesCompleto.impl.HerenciaImpl#getDestino <em>Destino</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HerenciaImpl extends MinimalEObjectImpl.Container implements Herencia {
	/**
	 * The cached value of the '{@link #getOrigen() <em>Origen</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrigen()
	 * @generated
	 * @ordered
	 */
	protected Clasificador origen;

	/**
	 * The cached value of the '{@link #getDestino() <em>Destino</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestino()
	 * @generated
	 * @ordered
	 */
	protected Clasificador destino;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HerenciaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DiagramaClasesCompletoPackage.Literals.HERENCIA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Clasificador getOrigen() {
		if (origen != null && origen.eIsProxy()) {
			InternalEObject oldOrigen = (InternalEObject) origen;
			origen = (Clasificador) eResolveProxy(oldOrigen);
			if (origen != oldOrigen) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							DiagramaClasesCompletoPackage.HERENCIA__ORIGEN, oldOrigen, origen));
			}
		}
		return origen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Clasificador basicGetOrigen() {
		return origen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrigen(Clasificador newOrigen) {
		Clasificador oldOrigen = origen;
		origen = newOrigen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiagramaClasesCompletoPackage.HERENCIA__ORIGEN,
					oldOrigen, origen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Clasificador getDestino() {
		if (destino != null && destino.eIsProxy()) {
			InternalEObject oldDestino = (InternalEObject) destino;
			destino = (Clasificador) eResolveProxy(oldDestino);
			if (destino != oldDestino) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							DiagramaClasesCompletoPackage.HERENCIA__DESTINO, oldDestino, destino));
			}
		}
		return destino;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Clasificador basicGetDestino() {
		return destino;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDestino(Clasificador newDestino) {
		Clasificador oldDestino = destino;
		destino = newDestino;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiagramaClasesCompletoPackage.HERENCIA__DESTINO,
					oldDestino, destino));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case DiagramaClasesCompletoPackage.HERENCIA__ORIGEN:
			if (resolve)
				return getOrigen();
			return basicGetOrigen();
		case DiagramaClasesCompletoPackage.HERENCIA__DESTINO:
			if (resolve)
				return getDestino();
			return basicGetDestino();
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
		case DiagramaClasesCompletoPackage.HERENCIA__ORIGEN:
			setOrigen((Clasificador) newValue);
			return;
		case DiagramaClasesCompletoPackage.HERENCIA__DESTINO:
			setDestino((Clasificador) newValue);
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
		case DiagramaClasesCompletoPackage.HERENCIA__ORIGEN:
			setOrigen((Clasificador) null);
			return;
		case DiagramaClasesCompletoPackage.HERENCIA__DESTINO:
			setDestino((Clasificador) null);
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
		case DiagramaClasesCompletoPackage.HERENCIA__ORIGEN:
			return origen != null;
		case DiagramaClasesCompletoPackage.HERENCIA__DESTINO:
			return destino != null;
		}
		return super.eIsSet(featureID);
	}

} //HerenciaImpl
