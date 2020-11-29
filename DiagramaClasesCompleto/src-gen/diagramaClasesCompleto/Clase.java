/**
 */
package diagramaClasesCompleto;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Clase</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link diagramaClasesCompleto.Clase#getRelaciones_contenidas <em>Relaciones contenidas</em>}</li>
 *   <li>{@link diagramaClasesCompleto.Clase#isEsAbstracta <em>Es Abstracta</em>}</li>
 *   <li>{@link diagramaClasesCompleto.Clase#getRealizaciones_contenidas <em>Realizaciones contenidas</em>}</li>
 *   <li>{@link diagramaClasesCompleto.Clase#isEsAsociativa <em>Es Asociativa</em>}</li>
 *   <li>{@link diagramaClasesCompleto.Clase#isEsAuditable <em>Es Auditable</em>}</li>
 *   <li>{@link diagramaClasesCompleto.Clase#isTieneABM <em>Tiene ABM</em>}</li>
 * </ul>
 *
 * @see diagramaClasesCompleto.DiagramaClasesCompletoPackage#getClase()
 * @model
 * @generated
 */
public interface Clase extends Clasificador {
	/**
	 * Returns the value of the '<em><b>Relaciones contenidas</b></em>' containment reference list.
	 * The list contents are of type {@link diagramaClasesCompleto.Relacion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relaciones contenidas</em>' containment reference list.
	 * @see diagramaClasesCompleto.DiagramaClasesCompletoPackage#getClase_Relaciones_contenidas()
	 * @model containment="true"
	 * @generated
	 */
	EList<Relacion> getRelaciones_contenidas();

	/**
	 * Returns the value of the '<em><b>Es Abstracta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Es Abstracta</em>' attribute.
	 * @see #setEsAbstracta(boolean)
	 * @see diagramaClasesCompleto.DiagramaClasesCompletoPackage#getClase_EsAbstracta()
	 * @model
	 * @generated
	 */
	boolean isEsAbstracta();

	/**
	 * Sets the value of the '{@link diagramaClasesCompleto.Clase#isEsAbstracta <em>Es Abstracta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Es Abstracta</em>' attribute.
	 * @see #isEsAbstracta()
	 * @generated
	 */
	void setEsAbstracta(boolean value);

	/**
	 * Returns the value of the '<em><b>Realizaciones contenidas</b></em>' containment reference list.
	 * The list contents are of type {@link diagramaClasesCompleto.Realizacion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Realizaciones contenidas</em>' containment reference list.
	 * @see diagramaClasesCompleto.DiagramaClasesCompletoPackage#getClase_Realizaciones_contenidas()
	 * @model containment="true"
	 * @generated
	 */
	EList<Realizacion> getRealizaciones_contenidas();

	/**
	 * Returns the value of the '<em><b>Es Asociativa</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Es Asociativa</em>' attribute.
	 * @see #setEsAsociativa(boolean)
	 * @see diagramaClasesCompleto.DiagramaClasesCompletoPackage#getClase_EsAsociativa()
	 * @model
	 * @generated
	 */
	boolean isEsAsociativa();

	/**
	 * Sets the value of the '{@link diagramaClasesCompleto.Clase#isEsAsociativa <em>Es Asociativa</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Es Asociativa</em>' attribute.
	 * @see #isEsAsociativa()
	 * @generated
	 */
	void setEsAsociativa(boolean value);

	/**
	 * Returns the value of the '<em><b>Es Auditable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Es Auditable</em>' attribute.
	 * @see #setEsAuditable(boolean)
	 * @see diagramaClasesCompleto.DiagramaClasesCompletoPackage#getClase_EsAuditable()
	 * @model
	 * @generated
	 */
	boolean isEsAuditable();

	/**
	 * Sets the value of the '{@link diagramaClasesCompleto.Clase#isEsAuditable <em>Es Auditable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Es Auditable</em>' attribute.
	 * @see #isEsAuditable()
	 * @generated
	 */
	void setEsAuditable(boolean value);

	/**
	 * Returns the value of the '<em><b>Tiene ABM</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tiene ABM</em>' attribute.
	 * @see #setTieneABM(boolean)
	 * @see diagramaClasesCompleto.DiagramaClasesCompletoPackage#getClase_TieneABM()
	 * @model
	 * @generated
	 */
	boolean isTieneABM();

	/**
	 * Sets the value of the '{@link diagramaClasesCompleto.Clase#isTieneABM <em>Tiene ABM</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tiene ABM</em>' attribute.
	 * @see #isTieneABM()
	 * @generated
	 */
	void setTieneABM(boolean value);

} // Clase
