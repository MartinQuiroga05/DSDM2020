/**
 */
package diagramaClasesCompleto;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Retornable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link diagramaClasesCompleto.Retornable#getNombre <em>Nombre</em>}</li>
 *   <li>{@link diagramaClasesCompleto.Retornable#getVisibilidad <em>Visibilidad</em>}</li>
 *   <li>{@link diagramaClasesCompleto.Retornable#isEsFinal <em>Es Final</em>}</li>
 *   <li>{@link diagramaClasesCompleto.Retornable#isEsStatic <em>Es Static</em>}</li>
 * </ul>
 *
 * @see diagramaClasesCompleto.DiagramaClasesCompletoPackage#getRetornable()
 * @model abstract="true"
 * @generated
 */
public interface Retornable extends EObject {
	/**
	 * Returns the value of the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre</em>' attribute.
	 * @see #setNombre(String)
	 * @see diagramaClasesCompleto.DiagramaClasesCompletoPackage#getRetornable_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link diagramaClasesCompleto.Retornable#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Visibilidad</b></em>' attribute.
	 * The literals are from the enumeration {@link diagramaClasesCompleto.ModicadoresAcceso}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visibilidad</em>' attribute.
	 * @see diagramaClasesCompleto.ModicadoresAcceso
	 * @see #setVisibilidad(ModicadoresAcceso)
	 * @see diagramaClasesCompleto.DiagramaClasesCompletoPackage#getRetornable_Visibilidad()
	 * @model
	 * @generated
	 */
	ModicadoresAcceso getVisibilidad();

	/**
	 * Sets the value of the '{@link diagramaClasesCompleto.Retornable#getVisibilidad <em>Visibilidad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visibilidad</em>' attribute.
	 * @see diagramaClasesCompleto.ModicadoresAcceso
	 * @see #getVisibilidad()
	 * @generated
	 */
	void setVisibilidad(ModicadoresAcceso value);

	/**
	 * Returns the value of the '<em><b>Es Final</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Es Final</em>' attribute.
	 * @see #setEsFinal(boolean)
	 * @see diagramaClasesCompleto.DiagramaClasesCompletoPackage#getRetornable_EsFinal()
	 * @model default="false"
	 * @generated
	 */
	boolean isEsFinal();

	/**
	 * Sets the value of the '{@link diagramaClasesCompleto.Retornable#isEsFinal <em>Es Final</em>}' attribute.
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
	 * @see diagramaClasesCompleto.DiagramaClasesCompletoPackage#getRetornable_EsStatic()
	 * @model
	 * @generated
	 */
	boolean isEsStatic();

	/**
	 * Sets the value of the '{@link diagramaClasesCompleto.Retornable#isEsStatic <em>Es Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Es Static</em>' attribute.
	 * @see #isEsStatic()
	 * @generated
	 */
	void setEsStatic(boolean value);

} // Retornable
