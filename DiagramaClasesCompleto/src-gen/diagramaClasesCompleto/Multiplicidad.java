/**
 */
package diagramaClasesCompleto;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Multiplicidad</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see diagramaClasesCompleto.DiagramaClasesCompletoPackage#getMultiplicidad()
 * @model
 * @generated
 */
public enum Multiplicidad implements Enumerator {
	/**
	 * The '<em><b>One To One</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ONE_TO_ONE_VALUE
	 * @generated
	 * @ordered
	 */
	ONE_TO_ONE(0, "oneToOne", "oneToOne"),

	/**
	 * The '<em><b>One To Many</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ONE_TO_MANY_VALUE
	 * @generated
	 * @ordered
	 */
	ONE_TO_MANY(2, "oneToMany", "oneToMany"),

	/**
	 * The '<em><b>Many To One</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MANY_TO_ONE_VALUE
	 * @generated
	 * @ordered
	 */
	MANY_TO_ONE(3, "manyToOne", "manyToOne"),

	/**
	 * The '<em><b>Many To Many</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MANY_TO_MANY_VALUE
	 * @generated
	 * @ordered
	 */
	MANY_TO_MANY(5, "manyToMany", "manyToMany");

	/**
	 * The '<em><b>One To One</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ONE_TO_ONE
	 * @model name="oneToOne"
	 * @generated
	 * @ordered
	 */
	public static final int ONE_TO_ONE_VALUE = 0;

	/**
	 * The '<em><b>One To Many</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ONE_TO_MANY
	 * @model name="oneToMany"
	 * @generated
	 * @ordered
	 */
	public static final int ONE_TO_MANY_VALUE = 2;

	/**
	 * The '<em><b>Many To One</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MANY_TO_ONE
	 * @model name="manyToOne"
	 * @generated
	 * @ordered
	 */
	public static final int MANY_TO_ONE_VALUE = 3;

	/**
	 * The '<em><b>Many To Many</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MANY_TO_MANY
	 * @model name="manyToMany"
	 * @generated
	 * @ordered
	 */
	public static final int MANY_TO_MANY_VALUE = 5;

	/**
	 * An array of all the '<em><b>Multiplicidad</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Multiplicidad[] VALUES_ARRAY = new Multiplicidad[] { ONE_TO_ONE, ONE_TO_MANY, MANY_TO_ONE,
			MANY_TO_MANY, };

	/**
	 * A public read-only list of all the '<em><b>Multiplicidad</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Multiplicidad> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Multiplicidad</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Multiplicidad get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Multiplicidad result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Multiplicidad</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Multiplicidad getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Multiplicidad result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Multiplicidad</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Multiplicidad get(int value) {
		switch (value) {
		case ONE_TO_ONE_VALUE:
			return ONE_TO_ONE;
		case ONE_TO_MANY_VALUE:
			return ONE_TO_MANY;
		case MANY_TO_ONE_VALUE:
			return MANY_TO_ONE;
		case MANY_TO_MANY_VALUE:
			return MANY_TO_MANY;
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
	private Multiplicidad(int value, String name, String literal) {
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

} //Multiplicidad
