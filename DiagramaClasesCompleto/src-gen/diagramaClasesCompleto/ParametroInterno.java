/**
 */
package diagramaClasesCompleto;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parametro Interno</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link diagramaClasesCompleto.ParametroInterno#getTipo <em>Tipo</em>}</li>
 * </ul>
 *
 * @see diagramaClasesCompleto.DiagramaClasesCompletoPackage#getParametroInterno()
 * @model
 * @generated
 */
public interface ParametroInterno extends EObject {
	/**
	 * Returns the value of the '<em><b>Tipo</b></em>' attribute.
	 * The literals are from the enumeration {@link diagramaClasesCompleto.TipoRetorno}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tipo</em>' attribute.
	 * @see diagramaClasesCompleto.TipoRetorno
	 * @see #setTipo(TipoRetorno)
	 * @see diagramaClasesCompleto.DiagramaClasesCompletoPackage#getParametroInterno_Tipo()
	 * @model
	 * @generated
	 */
	TipoRetorno getTipo();

	/**
	 * Sets the value of the '{@link diagramaClasesCompleto.ParametroInterno#getTipo <em>Tipo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tipo</em>' attribute.
	 * @see diagramaClasesCompleto.TipoRetorno
	 * @see #getTipo()
	 * @generated
	 */
	void setTipo(TipoRetorno value);

} // ParametroInterno
