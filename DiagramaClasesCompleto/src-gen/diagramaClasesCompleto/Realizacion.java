/**
 */
package diagramaClasesCompleto;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Realizacion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link diagramaClasesCompleto.Realizacion#getDestino <em>Destino</em>}</li>
 *   <li>{@link diagramaClasesCompleto.Realizacion#getOrigen <em>Origen</em>}</li>
 * </ul>
 *
 * @see diagramaClasesCompleto.DiagramaClasesCompletoPackage#getRealizacion()
 * @model
 * @generated
 */
public interface Realizacion extends EObject {
	/**
	 * Returns the value of the '<em><b>Destino</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destino</em>' reference.
	 * @see #setDestino(Interface)
	 * @see diagramaClasesCompleto.DiagramaClasesCompletoPackage#getRealizacion_Destino()
	 * @model
	 * @generated
	 */
	Interface getDestino();

	/**
	 * Sets the value of the '{@link diagramaClasesCompleto.Realizacion#getDestino <em>Destino</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destino</em>' reference.
	 * @see #getDestino()
	 * @generated
	 */
	void setDestino(Interface value);

	/**
	 * Returns the value of the '<em><b>Origen</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origen</em>' reference.
	 * @see #setOrigen(Clase)
	 * @see diagramaClasesCompleto.DiagramaClasesCompletoPackage#getRealizacion_Origen()
	 * @model
	 * @generated
	 */
	Clase getOrigen();

	/**
	 * Sets the value of the '{@link diagramaClasesCompleto.Realizacion#getOrigen <em>Origen</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origen</em>' reference.
	 * @see #getOrigen()
	 * @generated
	 */
	void setOrigen(Clase value);

} // Realizacion
