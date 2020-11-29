/**
 */
package diagramaClasesCompleto.impl;

import diagramaClasesCompleto.Atributo;
import diagramaClasesCompleto.DiagramaClasesCompletoPackage;
import diagramaClasesCompleto.RepresentacionGrafica;
import diagramaClasesCompleto.TipoDato;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Atributo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link diagramaClasesCompleto.impl.AtributoImpl#getTipo <em>Tipo</em>}</li>
 *   <li>{@link diagramaClasesCompleto.impl.AtributoImpl#isEsAuditable <em>Es Auditable</em>}</li>
 *   <li>{@link diagramaClasesCompleto.impl.AtributoImpl#getPseudonimo <em>Pseudonimo</em>}</li>
 *   <li>{@link diagramaClasesCompleto.impl.AtributoImpl#getRepresentacionGrafica <em>Representacion Grafica</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AtributoImpl extends RetornableImpl implements Atributo {
	/**
	 * The default value of the '{@link #getTipo() <em>Tipo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipo()
	 * @generated
	 * @ordered
	 */
	protected static final TipoDato TIPO_EDEFAULT = TipoDato.INT;

	/**
	 * The cached value of the '{@link #getTipo() <em>Tipo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipo()
	 * @generated
	 * @ordered
	 */
	protected TipoDato tipo = TIPO_EDEFAULT;

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
	 * The default value of the '{@link #getPseudonimo() <em>Pseudonimo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPseudonimo()
	 * @generated
	 * @ordered
	 */
	protected static final String PSEUDONIMO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPseudonimo() <em>Pseudonimo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPseudonimo()
	 * @generated
	 * @ordered
	 */
	protected String pseudonimo = PSEUDONIMO_EDEFAULT;

	/**
	 * The default value of the '{@link #getRepresentacionGrafica() <em>Representacion Grafica</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepresentacionGrafica()
	 * @generated
	 * @ordered
	 */
	protected static final RepresentacionGrafica REPRESENTACION_GRAFICA_EDEFAULT = RepresentacionGrafica.TEXT;

	/**
	 * The cached value of the '{@link #getRepresentacionGrafica() <em>Representacion Grafica</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepresentacionGrafica()
	 * @generated
	 * @ordered
	 */
	protected RepresentacionGrafica representacionGrafica = REPRESENTACION_GRAFICA_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AtributoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DiagramaClasesCompletoPackage.Literals.ATRIBUTO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TipoDato getTipo() {
		return tipo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTipo(TipoDato newTipo) {
		TipoDato oldTipo = tipo;
		tipo = newTipo == null ? TIPO_EDEFAULT : newTipo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiagramaClasesCompletoPackage.ATRIBUTO__TIPO, oldTipo,
					tipo));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DiagramaClasesCompletoPackage.ATRIBUTO__ES_AUDITABLE,
					oldEsAuditable, esAuditable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPseudonimo() {
		return pseudonimo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPseudonimo(String newPseudonimo) {
		String oldPseudonimo = pseudonimo;
		pseudonimo = newPseudonimo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiagramaClasesCompletoPackage.ATRIBUTO__PSEUDONIMO,
					oldPseudonimo, pseudonimo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RepresentacionGrafica getRepresentacionGrafica() {
		return representacionGrafica;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRepresentacionGrafica(RepresentacionGrafica newRepresentacionGrafica) {
		RepresentacionGrafica oldRepresentacionGrafica = representacionGrafica;
		representacionGrafica = newRepresentacionGrafica == null ? REPRESENTACION_GRAFICA_EDEFAULT
				: newRepresentacionGrafica;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DiagramaClasesCompletoPackage.ATRIBUTO__REPRESENTACION_GRAFICA, oldRepresentacionGrafica,
					representacionGrafica));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case DiagramaClasesCompletoPackage.ATRIBUTO__TIPO:
			return getTipo();
		case DiagramaClasesCompletoPackage.ATRIBUTO__ES_AUDITABLE:
			return isEsAuditable();
		case DiagramaClasesCompletoPackage.ATRIBUTO__PSEUDONIMO:
			return getPseudonimo();
		case DiagramaClasesCompletoPackage.ATRIBUTO__REPRESENTACION_GRAFICA:
			return getRepresentacionGrafica();
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
		case DiagramaClasesCompletoPackage.ATRIBUTO__TIPO:
			setTipo((TipoDato) newValue);
			return;
		case DiagramaClasesCompletoPackage.ATRIBUTO__ES_AUDITABLE:
			setEsAuditable((Boolean) newValue);
			return;
		case DiagramaClasesCompletoPackage.ATRIBUTO__PSEUDONIMO:
			setPseudonimo((String) newValue);
			return;
		case DiagramaClasesCompletoPackage.ATRIBUTO__REPRESENTACION_GRAFICA:
			setRepresentacionGrafica((RepresentacionGrafica) newValue);
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
		case DiagramaClasesCompletoPackage.ATRIBUTO__TIPO:
			setTipo(TIPO_EDEFAULT);
			return;
		case DiagramaClasesCompletoPackage.ATRIBUTO__ES_AUDITABLE:
			setEsAuditable(ES_AUDITABLE_EDEFAULT);
			return;
		case DiagramaClasesCompletoPackage.ATRIBUTO__PSEUDONIMO:
			setPseudonimo(PSEUDONIMO_EDEFAULT);
			return;
		case DiagramaClasesCompletoPackage.ATRIBUTO__REPRESENTACION_GRAFICA:
			setRepresentacionGrafica(REPRESENTACION_GRAFICA_EDEFAULT);
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
		case DiagramaClasesCompletoPackage.ATRIBUTO__TIPO:
			return tipo != TIPO_EDEFAULT;
		case DiagramaClasesCompletoPackage.ATRIBUTO__ES_AUDITABLE:
			return esAuditable != ES_AUDITABLE_EDEFAULT;
		case DiagramaClasesCompletoPackage.ATRIBUTO__PSEUDONIMO:
			return PSEUDONIMO_EDEFAULT == null ? pseudonimo != null : !PSEUDONIMO_EDEFAULT.equals(pseudonimo);
		case DiagramaClasesCompletoPackage.ATRIBUTO__REPRESENTACION_GRAFICA:
			return representacionGrafica != REPRESENTACION_GRAFICA_EDEFAULT;
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
		result.append(" (tipo: ");
		result.append(tipo);
		result.append(", esAuditable: ");
		result.append(esAuditable);
		result.append(", pseudonimo: ");
		result.append(pseudonimo);
		result.append(", representacionGrafica: ");
		result.append(representacionGrafica);
		result.append(')');
		return result.toString();
	}

} //AtributoImpl
