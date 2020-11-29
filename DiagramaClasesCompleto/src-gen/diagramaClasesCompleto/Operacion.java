/**
 */
package diagramaClasesCompleto;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operacion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link diagramaClasesCompleto.Operacion#getTipoRetorno <em>Tipo Retorno</em>}</li>
 *   <li>{@link diagramaClasesCompleto.Operacion#isEsAbstracta <em>Es Abstracta</em>}</li>
 *   <li>{@link diagramaClasesCompleto.Operacion#getParametros_contenidos <em>Parametros contenidos</em>}</li>
 *   <li>{@link diagramaClasesCompleto.Operacion#getEndpoint <em>Endpoint</em>}</li>
 *   <li>{@link diagramaClasesCompleto.Operacion#getParametros_internos <em>Parametros internos</em>}</li>
 * </ul>
 *
 * @see diagramaClasesCompleto.DiagramaClasesCompletoPackage#getOperacion()
 * @model
 * @generated
 */
public interface Operacion extends Retornable {
	/**
	 * Returns the value of the '<em><b>Tipo Retorno</b></em>' attribute.
	 * The literals are from the enumeration {@link diagramaClasesCompleto.TipoRetorno}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tipo Retorno</em>' attribute.
	 * @see diagramaClasesCompleto.TipoRetorno
	 * @see #setTipoRetorno(TipoRetorno)
	 * @see diagramaClasesCompleto.DiagramaClasesCompletoPackage#getOperacion_TipoRetorno()
	 * @model
	 * @generated
	 */
	TipoRetorno getTipoRetorno();

	/**
	 * Sets the value of the '{@link diagramaClasesCompleto.Operacion#getTipoRetorno <em>Tipo Retorno</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tipo Retorno</em>' attribute.
	 * @see diagramaClasesCompleto.TipoRetorno
	 * @see #getTipoRetorno()
	 * @generated
	 */
	void setTipoRetorno(TipoRetorno value);

	/**
	 * Returns the value of the '<em><b>Es Abstracta</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Es Abstracta</em>' attribute.
	 * @see #setEsAbstracta(boolean)
	 * @see diagramaClasesCompleto.DiagramaClasesCompletoPackage#getOperacion_EsAbstracta()
	 * @model default="false"
	 * @generated
	 */
	boolean isEsAbstracta();

	/**
	 * Sets the value of the '{@link diagramaClasesCompleto.Operacion#isEsAbstracta <em>Es Abstracta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Es Abstracta</em>' attribute.
	 * @see #isEsAbstracta()
	 * @generated
	 */
	void setEsAbstracta(boolean value);

	/**
	 * Returns the value of the '<em><b>Parametros contenidos</b></em>' containment reference list.
	 * The list contents are of type {@link diagramaClasesCompleto.Retornable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parametros contenidos</em>' containment reference list.
	 * @see diagramaClasesCompleto.DiagramaClasesCompletoPackage#getOperacion_Parametros_contenidos()
	 * @model containment="true"
	 * @generated
	 */
	EList<Retornable> getParametros_contenidos();

	/**
	 * Returns the value of the '<em><b>Endpoint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Endpoint</em>' containment reference.
	 * @see #setEndpoint(EndPoint)
	 * @see diagramaClasesCompleto.DiagramaClasesCompletoPackage#getOperacion_Endpoint()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EndPoint getEndpoint();

	/**
	 * Sets the value of the '{@link diagramaClasesCompleto.Operacion#getEndpoint <em>Endpoint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Endpoint</em>' containment reference.
	 * @see #getEndpoint()
	 * @generated
	 */
	void setEndpoint(EndPoint value);

	/**
	 * Returns the value of the '<em><b>Parametros internos</b></em>' containment reference list.
	 * The list contents are of type {@link diagramaClasesCompleto.ParametroInterno}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parametros internos</em>' containment reference list.
	 * @see diagramaClasesCompleto.DiagramaClasesCompletoPackage#getOperacion_Parametros_internos()
	 * @model containment="true"
	 * @generated
	 */
	EList<ParametroInterno> getParametros_internos();

} // Operacion
