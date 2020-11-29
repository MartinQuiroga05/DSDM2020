/**
 */
package diagramaClasesCompleto;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Tipo Relacion</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see diagramaClasesCompleto.DiagramaClasesCompletoPackage#getTipoRelacion()
 * @model
 * @generated
 */
public enum TipoRelacion implements Enumerator {
	/**
	 * The '<em><b>Unidireccional</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNIDIRECCIONAL_VALUE
	 * @generated
	 * @ordered
	 */
	UNIDIRECCIONAL(0, "unidireccional", "unidireccional"),

	/**
	 * The '<em><b>Bidireccional</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BIDIRECCIONAL_VALUE
	 * @generated
	 * @ordered
	 */
	BIDIRECCIONAL(1, "bidireccional", "bidireccional"),

	/**
	 * The '<em><b>Composicion</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPOSICION_VALUE
	 * @generated
	 * @ordered
	 */
	COMPOSICION(2, "composicion", "composicion"),

	/**
	 * The '<em><b>Agregacion</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AGREGACION_VALUE
	 * @generated
	 * @ordered
	 */
	AGREGACION(3, "agregacion", "agregacion"),

	/**
	 * The '<em><b>Dependencia Uso</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEPENDENCIA_USO_VALUE
	 * @generated
	 * @ordered
	 */
	DEPENDENCIA_USO(4, "dependenciaUso", "dependenciaUso"),

	/**
	 * The '<em><b>Dependencia Creacion</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEPENDENCIA_CREACION_VALUE
	 * @generated
	 * @ordered
	 */
	DEPENDENCIA_CREACION(5, "dependenciaCreacion", "dependenciaCreacion");

	/**
	 * The '<em><b>Unidireccional</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNIDIRECCIONAL
	 * @model name="unidireccional"
	 * @generated
	 * @ordered
	 */
	public static final int UNIDIRECCIONAL_VALUE = 0;

	/**
	 * The '<em><b>Bidireccional</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BIDIRECCIONAL
	 * @model name="bidireccional"
	 * @generated
	 * @ordered
	 */
	public static final int BIDIRECCIONAL_VALUE = 1;

	/**
	 * The '<em><b>Composicion</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPOSICION
	 * @model name="composicion"
	 * @generated
	 * @ordered
	 */
	public static final int COMPOSICION_VALUE = 2;

	/**
	 * The '<em><b>Agregacion</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AGREGACION
	 * @model name="agregacion"
	 * @generated
	 * @ordered
	 */
	public static final int AGREGACION_VALUE = 3;

	/**
	 * The '<em><b>Dependencia Uso</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEPENDENCIA_USO
	 * @model name="dependenciaUso"
	 * @generated
	 * @ordered
	 */
	public static final int DEPENDENCIA_USO_VALUE = 4;

	/**
	 * The '<em><b>Dependencia Creacion</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEPENDENCIA_CREACION
	 * @model name="dependenciaCreacion"
	 * @generated
	 * @ordered
	 */
	public static final int DEPENDENCIA_CREACION_VALUE = 5;

	/**
	 * An array of all the '<em><b>Tipo Relacion</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TipoRelacion[] VALUES_ARRAY = new TipoRelacion[] { UNIDIRECCIONAL, BIDIRECCIONAL, COMPOSICION,
			AGREGACION, DEPENDENCIA_USO, DEPENDENCIA_CREACION, };

	/**
	 * A public read-only list of all the '<em><b>Tipo Relacion</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TipoRelacion> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Tipo Relacion</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TipoRelacion get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TipoRelacion result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Tipo Relacion</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TipoRelacion getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TipoRelacion result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Tipo Relacion</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TipoRelacion get(int value) {
		switch (value) {
		case UNIDIRECCIONAL_VALUE:
			return UNIDIRECCIONAL;
		case BIDIRECCIONAL_VALUE:
			return BIDIRECCIONAL;
		case COMPOSICION_VALUE:
			return COMPOSICION;
		case AGREGACION_VALUE:
			return AGREGACION;
		case DEPENDENCIA_USO_VALUE:
			return DEPENDENCIA_USO;
		case DEPENDENCIA_CREACION_VALUE:
			return DEPENDENCIA_CREACION;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private TipoRelacion(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //TipoRelacion
