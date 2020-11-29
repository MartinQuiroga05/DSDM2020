/**
 */
package diagramaClasesCompleto;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Proveedor Db</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see diagramaClasesCompleto.DiagramaClasesCompletoPackage#getProveedorDb()
 * @model
 * @generated
 */
public enum ProveedorDb implements Enumerator {
	/**
	 * The '<em><b>My Sql</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MY_SQL_VALUE
	 * @generated
	 * @ordered
	 */
	MY_SQL(0, "mySql", "mySql"),

	/**
	 * The '<em><b>Mongo</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MONGO_VALUE
	 * @generated
	 * @ordered
	 */
	MONGO(1, "Mongo", "Mongo"),

	/**
	 * The '<em><b>Oracle</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ORACLE_VALUE
	 * @generated
	 * @ordered
	 */
	ORACLE(2, "Oracle", "Oracle"),

	/**
	 * The '<em><b>DB2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DB2_VALUE
	 * @generated
	 * @ordered
	 */
	DB2(3, "DB2", "DB2");

	/**
	 * The '<em><b>My Sql</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MY_SQL
	 * @model name="mySql"
	 * @generated
	 * @ordered
	 */
	public static final int MY_SQL_VALUE = 0;

	/**
	 * The '<em><b>Mongo</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MONGO
	 * @model name="Mongo"
	 * @generated
	 * @ordered
	 */
	public static final int MONGO_VALUE = 1;

	/**
	 * The '<em><b>Oracle</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ORACLE
	 * @model name="Oracle"
	 * @generated
	 * @ordered
	 */
	public static final int ORACLE_VALUE = 2;

	/**
	 * The '<em><b>DB2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DB2
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DB2_VALUE = 3;

	/**
	 * An array of all the '<em><b>Proveedor Db</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ProveedorDb[] VALUES_ARRAY = new ProveedorDb[] { MY_SQL, MONGO, ORACLE, DB2, };

	/**
	 * A public read-only list of all the '<em><b>Proveedor Db</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ProveedorDb> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Proveedor Db</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ProveedorDb get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ProveedorDb result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Proveedor Db</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ProveedorDb getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ProveedorDb result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Proveedor Db</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ProveedorDb get(int value) {
		switch (value) {
		case MY_SQL_VALUE:
			return MY_SQL;
		case MONGO_VALUE:
			return MONGO;
		case ORACLE_VALUE:
			return ORACLE;
		case DB2_VALUE:
			return DB2;
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
	private ProveedorDb(int value, String name, String literal) {
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

} //ProveedorDb
