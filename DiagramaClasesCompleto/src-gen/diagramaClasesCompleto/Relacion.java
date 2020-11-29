/**
 */
package diagramaClasesCompleto;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relacion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link diagramaClasesCompleto.Relacion#getDestino <em>Destino</em>}</li>
 *   <li>{@link diagramaClasesCompleto.Relacion#getNombre <em>Nombre</em>}</li>
 *   <li>{@link diagramaClasesCompleto.Relacion#getTipo <em>Tipo</em>}</li>
 *   <li>{@link diagramaClasesCompleto.Relacion#getMultiplicidad <em>Multiplicidad</em>}</li>
 *   <li>{@link diagramaClasesCompleto.Relacion#getOrigen <em>Origen</em>}</li>
 *   <li>{@link diagramaClasesCompleto.Relacion#getClases_asociativas_contenidas <em>Clases asociativas contenidas</em>}</li>
 *   <li>{@link diagramaClasesCompleto.Relacion#isEsFinal <em>Es Final</em>}</li>
 *   <li>{@link diagramaClasesCompleto.Relacion#isEsStatic <em>Es Static</em>}</li>
 *   <li>{@link diagramaClasesCompleto.Relacion#getVisibilidad <em>Visibilidad</em>}</li>
 *   <li>{@link diagramaClasesCompleto.Relacion#getTipoABM <em>Tipo ABM</em>}</li>
 * </ul>
 *
 * @see diagramaClasesCompleto.DiagramaClasesCompletoPackage#getRelacion()
 * @model
 * @generated
 */
public interface Relacion extends EObject {
	/**
	 * Returns the value of the '<em><b>Destino</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destino</em>' reference.
	 * @see #setDestino(Clasificador)
	 * @see diagramaClasesCompleto.DiagramaClasesCompletoPackage#getRelacion_Destino()
	 * @model
	 * @generated
	 */
	Clasificador getDestino();

	/**
	 * Sets the value of the '{@link diagramaClasesCompleto.Relacion#getDestino <em>Destino</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destino</em>' reference.
	 * @see #getDestino()
	 * @generated
	 */
	void setDestino(Clasificador value);

	/**
	 * Returns the value of the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre</em>' attribute.
	 * @see #setNombre(String)
	 * @see diagramaClasesCompleto.DiagramaClasesCompletoPackage#getRelacion_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link diagramaClasesCompleto.Relacion#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Tipo</b></em>' attribute.
	 * The literals are from the enumeration {@link diagramaClasesCompleto.TipoRelacion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tipo</em>' attribute.
	 * @see diagramaClasesCompleto.TipoRelacion
	 * @see #setTipo(TipoRelacion)
	 * @see diagramaClasesCompleto.DiagramaClasesCompletoPackage#getRelacion_Tipo()
	 * @model
	 * @generated
	 */
	TipoRelacion getTipo();

	/**
	 * Sets the value of the '{@link diagramaClasesCompleto.Relacion#getTipo <em>Tipo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tipo</em>' attribute.
	 * @see diagramaClasesCompleto.TipoRelacion
	 * @see #getTipo()
	 * @generated
	 */
	void setTipo(TipoRelacion value);

	/**
	 * Returns the value of the '<em><b>Multiplicidad</b></em>' attribute.
	 * The literals are from the enumeration {@link diagramaClasesCompleto.Multiplicidad}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiplicidad</em>' attribute.
	 * @see diagramaClasesCompleto.Multiplicidad
	 * @see #setMultiplicidad(Multiplicidad)
	 * @see diagramaClasesCompleto.DiagramaClasesCompletoPackage#getRelacion_Multiplicidad()
	 * @model
	 * @generated
	 */
	Multiplicidad getMultiplicidad();

	/**
	 * Sets the value of the '{@link diagramaClasesCompleto.Relacion#getMultiplicidad <em>Multiplicidad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiplicidad</em>' attribute.
	 * @see diagramaClasesCompleto.Multiplicidad
	 * @see #getMultiplicidad()
	 * @generated
	 */
	void setMultiplicidad(Multiplicidad value);

	/**
	 * Returns the value of the '<em><b>Origen</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origen</em>' reference.
	 * @see #setOrigen(Clase)
	 * @see diagramaClasesCompleto.DiagramaClasesCompletoPackage#getRelacion_Origen()
	 * @model
	 * @generated
	 */
	Clase getOrigen();

	/**
	 * Sets the value of the '{@link diagramaClasesCompleto.Relacion#getOrigen <em>Origen</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origen</em>' reference.
	 * @see #getOrigen()
	 * @generated
	 */
	void setOrigen(Clase value);

	/**
	 * Returns the value of the '<em><b>Clases asociativas contenidas</b></em>' containment reference list.
	 * The list contents are of type {@link diagramaClasesCompleto.Clase}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clases asociativas contenidas</em>' containment reference list.
	 * @see diagramaClasesCompleto.DiagramaClasesCompletoPackage#getRelacion_Clases_asociativas_contenidas()
	 * @model containment="true"
	 * @generated
	 */
	EList<Clase> getClases_asociativas_contenidas();

	/**
	 * Returns the value of the '<em><b>Es Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Es Final</em>' attribute.
	 * @see #setEsFinal(boolean)
	 * @see diagramaClasesCompleto.DiagramaClasesCompletoPackage#getRelacion_EsFinal()
	 * @model
	 * @generated
	 */
	boolean isEsFinal();

	/**
	 * Sets the value of the '{@link diagramaClasesCompleto.Relacion#isEsFinal <em>Es Final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Es Final</em>' attribute.
	 * @see #isEsFinal()
	 * @generated
	 */
	void setEsFinal(boolean value);

	/**
	 * Returns the value of the '<em><b>Es Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Es Static</em>' attribute.
	 * @see #setEsStatic(boolean)
	 * @see diagramaClasesCompleto.DiagramaClasesCompletoPackage#getRelacion_EsStatic()
	 * @model
	 * @generated
	 */
	boolean isEsStatic();

	/**
	 * Sets the value of the '{@link diagramaClasesCompleto.Relacion#isEsStatic <em>Es Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Es Static</em>' attribute.
	 * @see #isEsStatic()
	 * @generated
	 */
	void setEsStatic(boolean value);

	/**
	 * Returns the value of the '<em><b>Visibilidad</b></em>' attribute.
	 * The default value is <code>"private"</code>.
	 * The literals are from the enumeration {@link diagramaClasesCompleto.ModicadoresAcceso}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visibilidad</em>' attribute.
	 * @see diagramaClasesCompleto.ModicadoresAcceso
	 * @see #setVisibilidad(ModicadoresAcceso)
	 * @see diagramaClasesCompleto.DiagramaClasesCompletoPackage#getRelacion_Visibilidad()
	 * @model default="private"
	 * @generated
	 */
	ModicadoresAcceso getVisibilidad();

	/**
	 * Sets the value of the '{@link diagramaClasesCompleto.Relacion#getVisibilidad <em>Visibilidad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visibilidad</em>' attribute.
	 * @see diagramaClasesCompleto.ModicadoresAcceso
	 * @see #getVisibilidad()
	 * @generated
	 */
	void setVisibilidad(ModicadoresAcceso value);

	/**
	 * Returns the value of the '<em><b>Tipo ABM</b></em>' attribute.
	 * The default value is <code>"sinRepresentacion"</code>.
	 * The literals are from the enumeration {@link diagramaClasesCompleto.TipoABM}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tipo ABM</em>' attribute.
	 * @see diagramaClasesCompleto.TipoABM
	 * @see #setTipoABM(TipoABM)
	 * @see diagramaClasesCompleto.DiagramaClasesCompletoPackage#getRelacion_TipoABM()
	 * @model default="sinRepresentacion"
	 * @generated
	 */
	TipoABM getTipoABM();

	/**
	 * Sets the value of the '{@link diagramaClasesCompleto.Relacion#getTipoABM <em>Tipo ABM</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tipo ABM</em>' attribute.
	 * @see diagramaClasesCompleto.TipoABM
	 * @see #getTipoABM()
	 * @generated
	 */
	void setTipoABM(TipoABM value);

} // Relacion
