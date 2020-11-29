/**
 */
package diagramaClasesCompleto.impl;

import diagramaClasesCompleto.Clase;
import diagramaClasesCompleto.Clasificador;
import diagramaClasesCompleto.DiagramaClasesCompletoPackage;
import diagramaClasesCompleto.ModicadoresAcceso;
import diagramaClasesCompleto.Multiplicidad;
import diagramaClasesCompleto.Relacion;
import diagramaClasesCompleto.TipoABM;
import diagramaClasesCompleto.TipoRelacion;

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
 * An implementation of the model object '<em><b>Relacion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link diagramaClasesCompleto.impl.RelacionImpl#getDestino <em>Destino</em>}</li>
 *   <li>{@link diagramaClasesCompleto.impl.RelacionImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link diagramaClasesCompleto.impl.RelacionImpl#getTipo <em>Tipo</em>}</li>
 *   <li>{@link diagramaClasesCompleto.impl.RelacionImpl#getMultiplicidad <em>Multiplicidad</em>}</li>
 *   <li>{@link diagramaClasesCompleto.impl.RelacionImpl#getOrigen <em>Origen</em>}</li>
 *   <li>{@link diagramaClasesCompleto.impl.RelacionImpl#getClases_asociativas_contenidas <em>Clases asociativas contenidas</em>}</li>
 *   <li>{@link diagramaClasesCompleto.impl.RelacionImpl#isEsFinal <em>Es Final</em>}</li>
 *   <li>{@link diagramaClasesCompleto.impl.RelacionImpl#isEsStatic <em>Es Static</em>}</li>
 *   <li>{@link diagramaClasesCompleto.impl.RelacionImpl#getVisibilidad <em>Visibilidad</em>}</li>
 *   <li>{@link diagramaClasesCompleto.impl.RelacionImpl#getTipoABM <em>Tipo ABM</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RelacionImpl extends MinimalEObjectImpl.Container implements Relacion {
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
	 * The default value of the '{@link #getTipo() <em>Tipo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipo()
	 * @generated
	 * @ordered
	 */
	protected static final TipoRelacion TIPO_EDEFAULT = TipoRelacion.UNIDIRECCIONAL;

	/**
	 * The cached value of the '{@link #getTipo() <em>Tipo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipo()
	 * @generated
	 * @ordered
	 */
	protected TipoRelacion tipo = TIPO_EDEFAULT;

	/**
	 * The default value of the '{@link #getMultiplicidad() <em>Multiplicidad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicidad()
	 * @generated
	 * @ordered
	 */
	protected static final Multiplicidad MULTIPLICIDAD_EDEFAULT = Multiplicidad.ONE_TO_ONE;

	/**
	 * The cached value of the '{@link #getMultiplicidad() <em>Multiplicidad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicidad()
	 * @generated
	 * @ordered
	 */
	protected Multiplicidad multiplicidad = MULTIPLICIDAD_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOrigen() <em>Origen</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrigen()
	 * @generated
	 * @ordered
	 */
	protected Clase origen;

	/**
	 * The cached value of the '{@link #getClases_asociativas_contenidas() <em>Clases asociativas contenidas</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClases_asociativas_contenidas()
	 * @generated
	 * @ordered
	 */
	protected EList<Clase> clases_asociativas_contenidas;

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
	 * The default value of the '{@link #getVisibilidad() <em>Visibilidad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibilidad()
	 * @generated
	 * @ordered
	 */
	protected static final ModicadoresAcceso VISIBILIDAD_EDEFAULT = ModicadoresAcceso.PRIVATE;

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
	 * The default value of the '{@link #getTipoABM() <em>Tipo ABM</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipoABM()
	 * @generated
	 * @ordered
	 */
	protected static final TipoABM TIPO_ABM_EDEFAULT = TipoABM.SIN_REPRESENTACION;

	/**
	 * The cached value of the '{@link #getTipoABM() <em>Tipo ABM</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipoABM()
	 * @generated
	 * @ordered
	 */
	protected TipoABM tipoABM = TIPO_ABM_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelacionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DiagramaClasesCompletoPackage.Literals.RELACION;
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
							DiagramaClasesCompletoPackage.RELACION__DESTINO, oldDestino, destino));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DiagramaClasesCompletoPackage.RELACION__DESTINO,
					oldDestino, destino));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DiagramaClasesCompletoPackage.RELACION__NOMBRE,
					oldNombre, nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TipoRelacion getTipo() {
		return tipo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTipo(TipoRelacion newTipo) {
		TipoRelacion oldTipo = tipo;
		tipo = newTipo == null ? TIPO_EDEFAULT : newTipo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiagramaClasesCompletoPackage.RELACION__TIPO, oldTipo,
					tipo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Multiplicidad getMultiplicidad() {
		return multiplicidad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMultiplicidad(Multiplicidad newMultiplicidad) {
		Multiplicidad oldMultiplicidad = multiplicidad;
		multiplicidad = newMultiplicidad == null ? MULTIPLICIDAD_EDEFAULT : newMultiplicidad;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiagramaClasesCompletoPackage.RELACION__MULTIPLICIDAD,
					oldMultiplicidad, multiplicidad));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Clase getOrigen() {
		if (origen != null && origen.eIsProxy()) {
			InternalEObject oldOrigen = (InternalEObject) origen;
			origen = (Clase) eResolveProxy(oldOrigen);
			if (origen != oldOrigen) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							DiagramaClasesCompletoPackage.RELACION__ORIGEN, oldOrigen, origen));
			}
		}
		return origen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Clase basicGetOrigen() {
		return origen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrigen(Clase newOrigen) {
		Clase oldOrigen = origen;
		origen = newOrigen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiagramaClasesCompletoPackage.RELACION__ORIGEN,
					oldOrigen, origen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Clase> getClases_asociativas_contenidas() {
		if (clases_asociativas_contenidas == null) {
			clases_asociativas_contenidas = new EObjectContainmentEList<Clase>(Clase.class, this,
					DiagramaClasesCompletoPackage.RELACION__CLASES_ASOCIATIVAS_CONTENIDAS);
		}
		return clases_asociativas_contenidas;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DiagramaClasesCompletoPackage.RELACION__ES_FINAL,
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
			eNotify(new ENotificationImpl(this, Notification.SET, DiagramaClasesCompletoPackage.RELACION__ES_STATIC,
					oldEsStatic, esStatic));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DiagramaClasesCompletoPackage.RELACION__VISIBILIDAD,
					oldVisibilidad, visibilidad));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TipoABM getTipoABM() {
		return tipoABM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTipoABM(TipoABM newTipoABM) {
		TipoABM oldTipoABM = tipoABM;
		tipoABM = newTipoABM == null ? TIPO_ABM_EDEFAULT : newTipoABM;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiagramaClasesCompletoPackage.RELACION__TIPO_ABM,
					oldTipoABM, tipoABM));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case DiagramaClasesCompletoPackage.RELACION__CLASES_ASOCIATIVAS_CONTENIDAS:
			return ((InternalEList<?>) getClases_asociativas_contenidas()).basicRemove(otherEnd, msgs);
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
		case DiagramaClasesCompletoPackage.RELACION__DESTINO:
			if (resolve)
				return getDestino();
			return basicGetDestino();
		case DiagramaClasesCompletoPackage.RELACION__NOMBRE:
			return getNombre();
		case DiagramaClasesCompletoPackage.RELACION__TIPO:
			return getTipo();
		case DiagramaClasesCompletoPackage.RELACION__MULTIPLICIDAD:
			return getMultiplicidad();
		case DiagramaClasesCompletoPackage.RELACION__ORIGEN:
			if (resolve)
				return getOrigen();
			return basicGetOrigen();
		case DiagramaClasesCompletoPackage.RELACION__CLASES_ASOCIATIVAS_CONTENIDAS:
			return getClases_asociativas_contenidas();
		case DiagramaClasesCompletoPackage.RELACION__ES_FINAL:
			return isEsFinal();
		case DiagramaClasesCompletoPackage.RELACION__ES_STATIC:
			return isEsStatic();
		case DiagramaClasesCompletoPackage.RELACION__VISIBILIDAD:
			return getVisibilidad();
		case DiagramaClasesCompletoPackage.RELACION__TIPO_ABM:
			return getTipoABM();
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
		case DiagramaClasesCompletoPackage.RELACION__DESTINO:
			setDestino((Clasificador) newValue);
			return;
		case DiagramaClasesCompletoPackage.RELACION__NOMBRE:
			setNombre((String) newValue);
			return;
		case DiagramaClasesCompletoPackage.RELACION__TIPO:
			setTipo((TipoRelacion) newValue);
			return;
		case DiagramaClasesCompletoPackage.RELACION__MULTIPLICIDAD:
			setMultiplicidad((Multiplicidad) newValue);
			return;
		case DiagramaClasesCompletoPackage.RELACION__ORIGEN:
			setOrigen((Clase) newValue);
			return;
		case DiagramaClasesCompletoPackage.RELACION__CLASES_ASOCIATIVAS_CONTENIDAS:
			getClases_asociativas_contenidas().clear();
			getClases_asociativas_contenidas().addAll((Collection<? extends Clase>) newValue);
			return;
		case DiagramaClasesCompletoPackage.RELACION__ES_FINAL:
			setEsFinal((Boolean) newValue);
			return;
		case DiagramaClasesCompletoPackage.RELACION__ES_STATIC:
			setEsStatic((Boolean) newValue);
			return;
		case DiagramaClasesCompletoPackage.RELACION__VISIBILIDAD:
			setVisibilidad((ModicadoresAcceso) newValue);
			return;
		case DiagramaClasesCompletoPackage.RELACION__TIPO_ABM:
			setTipoABM((TipoABM) newValue);
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
		case DiagramaClasesCompletoPackage.RELACION__DESTINO:
			setDestino((Clasificador) null);
			return;
		case DiagramaClasesCompletoPackage.RELACION__NOMBRE:
			setNombre(NOMBRE_EDEFAULT);
			return;
		case DiagramaClasesCompletoPackage.RELACION__TIPO:
			setTipo(TIPO_EDEFAULT);
			return;
		case DiagramaClasesCompletoPackage.RELACION__MULTIPLICIDAD:
			setMultiplicidad(MULTIPLICIDAD_EDEFAULT);
			return;
		case DiagramaClasesCompletoPackage.RELACION__ORIGEN:
			setOrigen((Clase) null);
			return;
		case DiagramaClasesCompletoPackage.RELACION__CLASES_ASOCIATIVAS_CONTENIDAS:
			getClases_asociativas_contenidas().clear();
			return;
		case DiagramaClasesCompletoPackage.RELACION__ES_FINAL:
			setEsFinal(ES_FINAL_EDEFAULT);
			return;
		case DiagramaClasesCompletoPackage.RELACION__ES_STATIC:
			setEsStatic(ES_STATIC_EDEFAULT);
			return;
		case DiagramaClasesCompletoPackage.RELACION__VISIBILIDAD:
			setVisibilidad(VISIBILIDAD_EDEFAULT);
			return;
		case DiagramaClasesCompletoPackage.RELACION__TIPO_ABM:
			setTipoABM(TIPO_ABM_EDEFAULT);
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
		case DiagramaClasesCompletoPackage.RELACION__DESTINO:
			return destino != null;
		case DiagramaClasesCompletoPackage.RELACION__NOMBRE:
			return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
		case DiagramaClasesCompletoPackage.RELACION__TIPO:
			return tipo != TIPO_EDEFAULT;
		case DiagramaClasesCompletoPackage.RELACION__MULTIPLICIDAD:
			return multiplicidad != MULTIPLICIDAD_EDEFAULT;
		case DiagramaClasesCompletoPackage.RELACION__ORIGEN:
			return origen != null;
		case DiagramaClasesCompletoPackage.RELACION__CLASES_ASOCIATIVAS_CONTENIDAS:
			return clases_asociativas_contenidas != null && !clases_asociativas_contenidas.isEmpty();
		case DiagramaClasesCompletoPackage.RELACION__ES_FINAL:
			return esFinal != ES_FINAL_EDEFAULT;
		case DiagramaClasesCompletoPackage.RELACION__ES_STATIC:
			return esStatic != ES_STATIC_EDEFAULT;
		case DiagramaClasesCompletoPackage.RELACION__VISIBILIDAD:
			return visibilidad != VISIBILIDAD_EDEFAULT;
		case DiagramaClasesCompletoPackage.RELACION__TIPO_ABM:
			return tipoABM != TIPO_ABM_EDEFAULT;
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
		result.append(", tipo: ");
		result.append(tipo);
		result.append(", multiplicidad: ");
		result.append(multiplicidad);
		result.append(", esFinal: ");
		result.append(esFinal);
		result.append(", esStatic: ");
		result.append(esStatic);
		result.append(", visibilidad: ");
		result.append(visibilidad);
		result.append(", tipoABM: ");
		result.append(tipoABM);
		result.append(')');
		return result.toString();
	}

} //RelacionImpl
