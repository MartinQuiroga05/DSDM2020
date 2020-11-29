/**
 */
package diagramaClasesCompleto.impl;

import diagramaClasesCompleto.Atributo;
import diagramaClasesCompleto.Clasificador;
import diagramaClasesCompleto.DiagramaClasesCompletoPackage;
import diagramaClasesCompleto.Herencia;
import diagramaClasesCompleto.Operacion;

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
 * An implementation of the model object '<em><b>Clasificador</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link diagramaClasesCompleto.impl.ClasificadorImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link diagramaClasesCompleto.impl.ClasificadorImpl#getAtributos_contenidos <em>Atributos contenidos</em>}</li>
 *   <li>{@link diagramaClasesCompleto.impl.ClasificadorImpl#getOperaciones_contenidas <em>Operaciones contenidas</em>}</li>
 *   <li>{@link diagramaClasesCompleto.impl.ClasificadorImpl#getHerencias_contenidas <em>Herencias contenidas</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ClasificadorImpl extends MinimalEObjectImpl.Container implements Clasificador {
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
	 * The cached value of the '{@link #getAtributos_contenidos() <em>Atributos contenidos</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAtributos_contenidos()
	 * @generated
	 * @ordered
	 */
	protected EList<Atributo> atributos_contenidos;

	/**
	 * The cached value of the '{@link #getOperaciones_contenidas() <em>Operaciones contenidas</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperaciones_contenidas()
	 * @generated
	 * @ordered
	 */
	protected EList<Operacion> operaciones_contenidas;

	/**
	 * The cached value of the '{@link #getHerencias_contenidas() <em>Herencias contenidas</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHerencias_contenidas()
	 * @generated
	 * @ordered
	 */
	protected EList<Herencia> herencias_contenidas;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClasificadorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DiagramaClasesCompletoPackage.Literals.CLASIFICADOR;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DiagramaClasesCompletoPackage.CLASIFICADOR__NOMBRE,
					oldNombre, nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Atributo> getAtributos_contenidos() {
		if (atributos_contenidos == null) {
			atributos_contenidos = new EObjectContainmentEList<Atributo>(Atributo.class, this,
					DiagramaClasesCompletoPackage.CLASIFICADOR__ATRIBUTOS_CONTENIDOS);
		}
		return atributos_contenidos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Operacion> getOperaciones_contenidas() {
		if (operaciones_contenidas == null) {
			operaciones_contenidas = new EObjectContainmentEList<Operacion>(Operacion.class, this,
					DiagramaClasesCompletoPackage.CLASIFICADOR__OPERACIONES_CONTENIDAS);
		}
		return operaciones_contenidas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Herencia> getHerencias_contenidas() {
		if (herencias_contenidas == null) {
			herencias_contenidas = new EObjectContainmentEList<Herencia>(Herencia.class, this,
					DiagramaClasesCompletoPackage.CLASIFICADOR__HERENCIAS_CONTENIDAS);
		}
		return herencias_contenidas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case DiagramaClasesCompletoPackage.CLASIFICADOR__ATRIBUTOS_CONTENIDOS:
			return ((InternalEList<?>) getAtributos_contenidos()).basicRemove(otherEnd, msgs);
		case DiagramaClasesCompletoPackage.CLASIFICADOR__OPERACIONES_CONTENIDAS:
			return ((InternalEList<?>) getOperaciones_contenidas()).basicRemove(otherEnd, msgs);
		case DiagramaClasesCompletoPackage.CLASIFICADOR__HERENCIAS_CONTENIDAS:
			return ((InternalEList<?>) getHerencias_contenidas()).basicRemove(otherEnd, msgs);
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
		case DiagramaClasesCompletoPackage.CLASIFICADOR__NOMBRE:
			return getNombre();
		case DiagramaClasesCompletoPackage.CLASIFICADOR__ATRIBUTOS_CONTENIDOS:
			return getAtributos_contenidos();
		case DiagramaClasesCompletoPackage.CLASIFICADOR__OPERACIONES_CONTENIDAS:
			return getOperaciones_contenidas();
		case DiagramaClasesCompletoPackage.CLASIFICADOR__HERENCIAS_CONTENIDAS:
			return getHerencias_contenidas();
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
		case DiagramaClasesCompletoPackage.CLASIFICADOR__NOMBRE:
			setNombre((String) newValue);
			return;
		case DiagramaClasesCompletoPackage.CLASIFICADOR__ATRIBUTOS_CONTENIDOS:
			getAtributos_contenidos().clear();
			getAtributos_contenidos().addAll((Collection<? extends Atributo>) newValue);
			return;
		case DiagramaClasesCompletoPackage.CLASIFICADOR__OPERACIONES_CONTENIDAS:
			getOperaciones_contenidas().clear();
			getOperaciones_contenidas().addAll((Collection<? extends Operacion>) newValue);
			return;
		case DiagramaClasesCompletoPackage.CLASIFICADOR__HERENCIAS_CONTENIDAS:
			getHerencias_contenidas().clear();
			getHerencias_contenidas().addAll((Collection<? extends Herencia>) newValue);
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
		case DiagramaClasesCompletoPackage.CLASIFICADOR__NOMBRE:
			setNombre(NOMBRE_EDEFAULT);
			return;
		case DiagramaClasesCompletoPackage.CLASIFICADOR__ATRIBUTOS_CONTENIDOS:
			getAtributos_contenidos().clear();
			return;
		case DiagramaClasesCompletoPackage.CLASIFICADOR__OPERACIONES_CONTENIDAS:
			getOperaciones_contenidas().clear();
			return;
		case DiagramaClasesCompletoPackage.CLASIFICADOR__HERENCIAS_CONTENIDAS:
			getHerencias_contenidas().clear();
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
		case DiagramaClasesCompletoPackage.CLASIFICADOR__NOMBRE:
			return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
		case DiagramaClasesCompletoPackage.CLASIFICADOR__ATRIBUTOS_CONTENIDOS:
			return atributos_contenidos != null && !atributos_contenidos.isEmpty();
		case DiagramaClasesCompletoPackage.CLASIFICADOR__OPERACIONES_CONTENIDAS:
			return operaciones_contenidas != null && !operaciones_contenidas.isEmpty();
		case DiagramaClasesCompletoPackage.CLASIFICADOR__HERENCIAS_CONTENIDAS:
			return herencias_contenidas != null && !herencias_contenidas.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //ClasificadorImpl
