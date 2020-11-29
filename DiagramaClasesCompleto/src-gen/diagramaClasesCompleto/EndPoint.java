/**
 */
package diagramaClasesCompleto;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>End Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link diagramaClasesCompleto.EndPoint#getTipoVerdo <em>Tipo Verdo</em>}</li>
 *   <li>{@link diagramaClasesCompleto.EndPoint#getTipoTransferenciaEntrada <em>Tipo Transferencia Entrada</em>}</li>
 *   <li>{@link diagramaClasesCompleto.EndPoint#getTipoTransferenciaSalida <em>Tipo Transferencia Salida</em>}</li>
 *   <li>{@link diagramaClasesCompleto.EndPoint#getNombrePublicado <em>Nombre Publicado</em>}</li>
 * </ul>
 *
 * @see diagramaClasesCompleto.DiagramaClasesCompletoPackage#getEndPoint()
 * @model
 * @generated
 */
public interface EndPoint extends EObject {
	/**
	 * Returns the value of the '<em><b>Tipo Verdo</b></em>' attribute.
	 * The literals are from the enumeration {@link diagramaClasesCompleto.VerbosHTTP}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tipo Verdo</em>' attribute.
	 * @see diagramaClasesCompleto.VerbosHTTP
	 * @see #setTipoVerdo(VerbosHTTP)
	 * @see diagramaClasesCompleto.DiagramaClasesCompletoPackage#getEndPoint_TipoVerdo()
	 * @model
	 * @generated
	 */
	VerbosHTTP getTipoVerdo();

	/**
	 * Sets the value of the '{@link diagramaClasesCompleto.EndPoint#getTipoVerdo <em>Tipo Verdo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tipo Verdo</em>' attribute.
	 * @see diagramaClasesCompleto.VerbosHTTP
	 * @see #getTipoVerdo()
	 * @generated
	 */
	void setTipoVerdo(VerbosHTTP value);

	/**
	 * Returns the value of the '<em><b>Tipo Transferencia Entrada</b></em>' attribute.
	 * The literals are from the enumeration {@link diagramaClasesCompleto.TipoTransferencia}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tipo Transferencia Entrada</em>' attribute.
	 * @see diagramaClasesCompleto.TipoTransferencia
	 * @see #setTipoTransferenciaEntrada(TipoTransferencia)
	 * @see diagramaClasesCompleto.DiagramaClasesCompletoPackage#getEndPoint_TipoTransferenciaEntrada()
	 * @model
	 * @generated
	 */
	TipoTransferencia getTipoTransferenciaEntrada();

	/**
	 * Sets the value of the '{@link diagramaClasesCompleto.EndPoint#getTipoTransferenciaEntrada <em>Tipo Transferencia Entrada</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tipo Transferencia Entrada</em>' attribute.
	 * @see diagramaClasesCompleto.TipoTransferencia
	 * @see #getTipoTransferenciaEntrada()
	 * @generated
	 */
	void setTipoTransferenciaEntrada(TipoTransferencia value);

	/**
	 * Returns the value of the '<em><b>Tipo Transferencia Salida</b></em>' attribute.
	 * The literals are from the enumeration {@link diagramaClasesCompleto.TipoTransferencia}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tipo Transferencia Salida</em>' attribute.
	 * @see diagramaClasesCompleto.TipoTransferencia
	 * @see #setTipoTransferenciaSalida(TipoTransferencia)
	 * @see diagramaClasesCompleto.DiagramaClasesCompletoPackage#getEndPoint_TipoTransferenciaSalida()
	 * @model
	 * @generated
	 */
	TipoTransferencia getTipoTransferenciaSalida();

	/**
	 * Sets the value of the '{@link diagramaClasesCompleto.EndPoint#getTipoTransferenciaSalida <em>Tipo Transferencia Salida</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tipo Transferencia Salida</em>' attribute.
	 * @see diagramaClasesCompleto.TipoTransferencia
	 * @see #getTipoTransferenciaSalida()
	 * @generated
	 */
	void setTipoTransferenciaSalida(TipoTransferencia value);

	/**
	 * Returns the value of the '<em><b>Nombre Publicado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre Publicado</em>' attribute.
	 * @see #setNombrePublicado(String)
	 * @see diagramaClasesCompleto.DiagramaClasesCompletoPackage#getEndPoint_NombrePublicado()
	 * @model
	 * @generated
	 */
	String getNombrePublicado();

	/**
	 * Sets the value of the '{@link diagramaClasesCompleto.EndPoint#getNombrePublicado <em>Nombre Publicado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre Publicado</em>' attribute.
	 * @see #getNombrePublicado()
	 * @generated
	 */
	void setNombrePublicado(String value);

} // EndPoint
