/**
 */
package diagramaClasesCompleto;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Clasificador</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link diagramaClasesCompleto.Clasificador#getNombre <em>Nombre</em>}</li>
 *   <li>{@link diagramaClasesCompleto.Clasificador#getAtributos_contenidos <em>Atributos contenidos</em>}</li>
 *   <li>{@link diagramaClasesCompleto.Clasificador#getOperaciones_contenidas <em>Operaciones contenidas</em>}</li>
 *   <li>{@link diagramaClasesCompleto.Clasificador#getHerencias_contenidas <em>Herencias contenidas</em>}</li>
 * </ul>
 *
 * @see diagramaClasesCompleto.DiagramaClasesCompletoPackage#getClasificador()
 * @model abstract="true"
 * @generated
 */
public interface Clasificador extends EObject {
	/**
	 * Returns the value of the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre</em>' attribute.
	 * @see #setNombre(String)
	 * @see diagramaClasesCompleto.DiagramaClasesCompletoPackage#getClasificador_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link diagramaClasesCompleto.Clasificador#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Atributos contenidos</b></em>' containment reference list.
	 * The list contents are of type {@link diagramaClasesCompleto.Atributo}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Atributos contenidos</em>' containment reference list.
	 * @see diagramaClasesCompleto.DiagramaClasesCompletoPackage#getClasificador_Atributos_contenidos()
	 * @model containment="true"
	 * @generated
	 */
	EList<Atributo> getAtributos_contenidos();

	/**
	 * Returns the value of the '<em><b>Operaciones contenidas</b></em>' containment reference list.
	 * The list contents are of type {@link diagramaClasesCompleto.Operacion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operaciones contenidas</em>' containment reference list.
	 * @see diagramaClasesCompleto.DiagramaClasesCompletoPackage#getClasificador_Operaciones_contenidas()
	 * @model containment="true"
	 * @generated
	 */
	EList<Operacion> getOperaciones_contenidas();

	/**
	 * Returns the value of the '<em><b>Herencias contenidas</b></em>' containment reference list.
	 * The list contents are of type {@link diagramaClasesCompleto.Herencia}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Herencias contenidas</em>' containment reference list.
	 * @see diagramaClasesCompleto.DiagramaClasesCompletoPackage#getClasificador_Herencias_contenidas()
	 * @model containment="true"
	 * @generated
	 */
	EList<Herencia> getHerencias_contenidas();

} // Clasificador
