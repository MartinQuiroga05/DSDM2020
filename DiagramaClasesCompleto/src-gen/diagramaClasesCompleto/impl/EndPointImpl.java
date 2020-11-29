/**
 */
package diagramaClasesCompleto.impl;

import diagramaClasesCompleto.DiagramaClasesCompletoPackage;
import diagramaClasesCompleto.EndPoint;
import diagramaClasesCompleto.TipoTransferencia;
import diagramaClasesCompleto.VerbosHTTP;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>End Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link diagramaClasesCompleto.impl.EndPointImpl#getTipoVerdo <em>Tipo Verdo</em>}</li>
 *   <li>{@link diagramaClasesCompleto.impl.EndPointImpl#getTipoTransferenciaEntrada <em>Tipo Transferencia Entrada</em>}</li>
 *   <li>{@link diagramaClasesCompleto.impl.EndPointImpl#getTipoTransferenciaSalida <em>Tipo Transferencia Salida</em>}</li>
 *   <li>{@link diagramaClasesCompleto.impl.EndPointImpl#getNombrePublicado <em>Nombre Publicado</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EndPointImpl extends MinimalEObjectImpl.Container implements EndPoint {
	/**
	 * The default value of the '{@link #getTipoVerdo() <em>Tipo Verdo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipoVerdo()
	 * @generated
	 * @ordered
	 */
	protected static final VerbosHTTP TIPO_VERDO_EDEFAULT = VerbosHTTP.GET;

	/**
	 * The cached value of the '{@link #getTipoVerdo() <em>Tipo Verdo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipoVerdo()
	 * @generated
	 * @ordered
	 */
	protected VerbosHTTP tipoVerdo = TIPO_VERDO_EDEFAULT;

	/**
	 * The default value of the '{@link #getTipoTransferenciaEntrada() <em>Tipo Transferencia Entrada</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipoTransferenciaEntrada()
	 * @generated
	 * @ordered
	 */
	protected static final TipoTransferencia TIPO_TRANSFERENCIA_ENTRADA_EDEFAULT = TipoTransferencia.STRING;

	/**
	 * The cached value of the '{@link #getTipoTransferenciaEntrada() <em>Tipo Transferencia Entrada</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipoTransferenciaEntrada()
	 * @generated
	 * @ordered
	 */
	protected TipoTransferencia tipoTransferenciaEntrada = TIPO_TRANSFERENCIA_ENTRADA_EDEFAULT;

	/**
	 * The default value of the '{@link #getTipoTransferenciaSalida() <em>Tipo Transferencia Salida</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipoTransferenciaSalida()
	 * @generated
	 * @ordered
	 */
	protected static final TipoTransferencia TIPO_TRANSFERENCIA_SALIDA_EDEFAULT = TipoTransferencia.STRING;

	/**
	 * The cached value of the '{@link #getTipoTransferenciaSalida() <em>Tipo Transferencia Salida</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipoTransferenciaSalida()
	 * @generated
	 * @ordered
	 */
	protected TipoTransferencia tipoTransferenciaSalida = TIPO_TRANSFERENCIA_SALIDA_EDEFAULT;

	/**
	 * The default value of the '{@link #getNombrePublicado() <em>Nombre Publicado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombrePublicado()
	 * @generated
	 * @ordered
	 */
	protected static final String NOMBRE_PUBLICADO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNombrePublicado() <em>Nombre Publicado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombrePublicado()
	 * @generated
	 * @ordered
	 */
	protected String nombrePublicado = NOMBRE_PUBLICADO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EndPointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DiagramaClasesCompletoPackage.Literals.END_POINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VerbosHTTP getTipoVerdo() {
		return tipoVerdo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTipoVerdo(VerbosHTTP newTipoVerdo) {
		VerbosHTTP oldTipoVerdo = tipoVerdo;
		tipoVerdo = newTipoVerdo == null ? TIPO_VERDO_EDEFAULT : newTipoVerdo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiagramaClasesCompletoPackage.END_POINT__TIPO_VERDO,
					oldTipoVerdo, tipoVerdo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TipoTransferencia getTipoTransferenciaEntrada() {
		return tipoTransferenciaEntrada;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTipoTransferenciaEntrada(TipoTransferencia newTipoTransferenciaEntrada) {
		TipoTransferencia oldTipoTransferenciaEntrada = tipoTransferenciaEntrada;
		tipoTransferenciaEntrada = newTipoTransferenciaEntrada == null ? TIPO_TRANSFERENCIA_ENTRADA_EDEFAULT
				: newTipoTransferenciaEntrada;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DiagramaClasesCompletoPackage.END_POINT__TIPO_TRANSFERENCIA_ENTRADA, oldTipoTransferenciaEntrada,
					tipoTransferenciaEntrada));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TipoTransferencia getTipoTransferenciaSalida() {
		return tipoTransferenciaSalida;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTipoTransferenciaSalida(TipoTransferencia newTipoTransferenciaSalida) {
		TipoTransferencia oldTipoTransferenciaSalida = tipoTransferenciaSalida;
		tipoTransferenciaSalida = newTipoTransferenciaSalida == null ? TIPO_TRANSFERENCIA_SALIDA_EDEFAULT
				: newTipoTransferenciaSalida;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DiagramaClasesCompletoPackage.END_POINT__TIPO_TRANSFERENCIA_SALIDA, oldTipoTransferenciaSalida,
					tipoTransferenciaSalida));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNombrePublicado() {
		return nombrePublicado;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNombrePublicado(String newNombrePublicado) {
		String oldNombrePublicado = nombrePublicado;
		nombrePublicado = newNombrePublicado;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DiagramaClasesCompletoPackage.END_POINT__NOMBRE_PUBLICADO, oldNombrePublicado, nombrePublicado));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case DiagramaClasesCompletoPackage.END_POINT__TIPO_VERDO:
			return getTipoVerdo();
		case DiagramaClasesCompletoPackage.END_POINT__TIPO_TRANSFERENCIA_ENTRADA:
			return getTipoTransferenciaEntrada();
		case DiagramaClasesCompletoPackage.END_POINT__TIPO_TRANSFERENCIA_SALIDA:
			return getTipoTransferenciaSalida();
		case DiagramaClasesCompletoPackage.END_POINT__NOMBRE_PUBLICADO:
			return getNombrePublicado();
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
		case DiagramaClasesCompletoPackage.END_POINT__TIPO_VERDO:
			setTipoVerdo((VerbosHTTP) newValue);
			return;
		case DiagramaClasesCompletoPackage.END_POINT__TIPO_TRANSFERENCIA_ENTRADA:
			setTipoTransferenciaEntrada((TipoTransferencia) newValue);
			return;
		case DiagramaClasesCompletoPackage.END_POINT__TIPO_TRANSFERENCIA_SALIDA:
			setTipoTransferenciaSalida((TipoTransferencia) newValue);
			return;
		case DiagramaClasesCompletoPackage.END_POINT__NOMBRE_PUBLICADO:
			setNombrePublicado((String) newValue);
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
		case DiagramaClasesCompletoPackage.END_POINT__TIPO_VERDO:
			setTipoVerdo(TIPO_VERDO_EDEFAULT);
			return;
		case DiagramaClasesCompletoPackage.END_POINT__TIPO_TRANSFERENCIA_ENTRADA:
			setTipoTransferenciaEntrada(TIPO_TRANSFERENCIA_ENTRADA_EDEFAULT);
			return;
		case DiagramaClasesCompletoPackage.END_POINT__TIPO_TRANSFERENCIA_SALIDA:
			setTipoTransferenciaSalida(TIPO_TRANSFERENCIA_SALIDA_EDEFAULT);
			return;
		case DiagramaClasesCompletoPackage.END_POINT__NOMBRE_PUBLICADO:
			setNombrePublicado(NOMBRE_PUBLICADO_EDEFAULT);
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
		case DiagramaClasesCompletoPackage.END_POINT__TIPO_VERDO:
			return tipoVerdo != TIPO_VERDO_EDEFAULT;
		case DiagramaClasesCompletoPackage.END_POINT__TIPO_TRANSFERENCIA_ENTRADA:
			return tipoTransferenciaEntrada != TIPO_TRANSFERENCIA_ENTRADA_EDEFAULT;
		case DiagramaClasesCompletoPackage.END_POINT__TIPO_TRANSFERENCIA_SALIDA:
			return tipoTransferenciaSalida != TIPO_TRANSFERENCIA_SALIDA_EDEFAULT;
		case DiagramaClasesCompletoPackage.END_POINT__NOMBRE_PUBLICADO:
			return NOMBRE_PUBLICADO_EDEFAULT == null ? nombrePublicado != null
					: !NOMBRE_PUBLICADO_EDEFAULT.equals(nombrePublicado);
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
		result.append(" (tipoVerdo: ");
		result.append(tipoVerdo);
		result.append(", tipoTransferenciaEntrada: ");
		result.append(tipoTransferenciaEntrada);
		result.append(", tipoTransferenciaSalida: ");
		result.append(tipoTransferenciaSalida);
		result.append(", nombrePublicado: ");
		result.append(nombrePublicado);
		result.append(')');
		return result.toString();
	}

} //EndPointImpl
