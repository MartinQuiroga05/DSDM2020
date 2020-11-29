/**
 */
package diagramaClasesCompleto;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Artefacto</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link diagramaClasesCompleto.Artefacto#getNombre <em>Nombre</em>}</li>
 *   <li>{@link diagramaClasesCompleto.Artefacto#getGrupoId <em>Grupo Id</em>}</li>
 *   <li>{@link diagramaClasesCompleto.Artefacto#getArtefactotId <em>Artefactot Id</em>}</li>
 *   <li>{@link diagramaClasesCompleto.Artefacto#getDescripcion <em>Descripcion</em>}</li>
 *   <li>{@link diagramaClasesCompleto.Artefacto#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @see diagramaClasesCompleto.DiagramaClasesCompletoPackage#getArtefacto()
 * @model
 * @generated
 */
public interface Artefacto extends EObject {
	/**
	 * Returns the value of the '<em><b>Nombre</b></em>' attribute.
	 * The default value is <code>"Demo"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre</em>' attribute.
	 * @see #setNombre(String)
	 * @see diagramaClasesCompleto.DiagramaClasesCompletoPackage#getArtefacto_Nombre()
	 * @model default="Demo"
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link diagramaClasesCompleto.Artefacto#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Grupo Id</b></em>' attribute.
	 * The default value is <code>"com.example"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grupo Id</em>' attribute.
	 * @see #setGrupoId(String)
	 * @see diagramaClasesCompleto.DiagramaClasesCompletoPackage#getArtefacto_GrupoId()
	 * @model default="com.example"
	 * @generated
	 */
	String getGrupoId();

	/**
	 * Sets the value of the '{@link diagramaClasesCompleto.Artefacto#getGrupoId <em>Grupo Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grupo Id</em>' attribute.
	 * @see #getGrupoId()
	 * @generated
	 */
	void setGrupoId(String value);

	/**
	 * Returns the value of the '<em><b>Artefactot Id</b></em>' attribute.
	 * The default value is <code>"demo"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Artefactot Id</em>' attribute.
	 * @see #setArtefactotId(String)
	 * @see diagramaClasesCompleto.DiagramaClasesCompletoPackage#getArtefacto_ArtefactotId()
	 * @model default="demo"
	 * @generated
	 */
	String getArtefactotId();

	/**
	 * Sets the value of the '{@link diagramaClasesCompleto.Artefacto#getArtefactotId <em>Artefactot Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Artefactot Id</em>' attribute.
	 * @see #getArtefactotId()
	 * @generated
	 */
	void setArtefactotId(String value);

	/**
	 * Returns the value of the '<em><b>Descripcion</b></em>' attribute.
	 * The default value is <code>"Demo project"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Descripcion</em>' attribute.
	 * @see #setDescripcion(String)
	 * @see diagramaClasesCompleto.DiagramaClasesCompletoPackage#getArtefacto_Descripcion()
	 * @model default="Demo project"
	 * @generated
	 */
	String getDescripcion();

	/**
	 * Sets the value of the '{@link diagramaClasesCompleto.Artefacto#getDescripcion <em>Descripcion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Descripcion</em>' attribute.
	 * @see #getDescripcion()
	 * @generated
	 */
	void setDescripcion(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * The default value is <code>"0.0.1-SNAPSHOT"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see diagramaClasesCompleto.DiagramaClasesCompletoPackage#getArtefacto_Version()
	 * @model default="0.0.1-SNAPSHOT"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link diagramaClasesCompleto.Artefacto#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

} // Artefacto
