/**
 */
package diagramaClasesCompleto;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Tipo ABM</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see diagramaClasesCompleto.DiagramaClasesCompletoPackage#getTipoABM()
 * @model
 * @generated
 */
public enum TipoABM implements Enumerator {
	/**
	 * The '<em><b>Simple</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIMPLE_VALUE
	 * @generated
	 * @ordered
	 */
	SIMPLE(0, "simple", "simple"),

	/**
	 * The '<em><b>Seleccionable</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SELECCIONABLE_VALUE
	 * @generated
	 * @ordered
	 */
	SELECCIONABLE(1, "seleccionable", "seleccionable"),

	/**
	 * The '<em><b>Maestro Detalle</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAESTRO_DETALLE_VALUE
	 * @generated
	 * @ordered
	 */
	MAESTRO_DETALLE(3, "maestroDetalle", "maestroDetalle"),

	/**
	 * The '<em><b>Maestro Combo Detalle</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAESTRO_COMBO_DETALLE_VALUE
	 * @generated
	 * @ordered
	 */
	MAESTRO_COMBO_DETALLE(3, "maestroComboDetalle", "maestroComboDetalle"),

	/**
	 * The '<em><b>Maestro Detalle Combo</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAESTRO_DETALLE_COMBO_VALUE
	 * @generated
	 * @ordered
	 */
	MAESTRO_DETALLE_COMBO(4, "maestroDetalleCombo", "maestroDetalleCombo"),

	/**
	 * The '<em><b>Maestro Combo Detalle Combo</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAESTRO_COMBO_DETALLE_COMBO_VALUE
	 * @generated
	 * @ordered
	 */
	MAESTRO_COMBO_DETALLE_COMBO(5, "maestroComboDetalleCombo", "maestroComboDetalleCombo"),

	/**
	 * The '<em><b>Sin Representacion</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIN_REPRESENTACION_VALUE
	 * @generated
	 * @ordered
	 */
	SIN_REPRESENTACION(6, "sinRepresentacion", "sinRepresentacion");

	/**
	 * The '<em><b>Simple</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIMPLE
	 * @model name="simple"
	 * @generated
	 * @ordered
	 */
	public static final int SIMPLE_VALUE = 0;

	/**
	 * The '<em><b>Seleccionable</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SELECCIONABLE
	 * @model name="seleccionable"
	 * @generated
	 * @ordered
	 */
	public static final int SELECCIONABLE_VALUE = 1;

	/**
	 * The '<em><b>Maestro Detalle</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAESTRO_DETALLE
	 * @model name="maestroDetalle"
	 * @generated
	 * @ordered
	 */
	public static final int MAESTRO_DETALLE_VALUE = 3;

	/**
	 * The '<em><b>Maestro Combo Detalle</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAESTRO_COMBO_DETALLE
	 * @model name="maestroComboDetalle"
	 * @generated
	 * @ordered
	 */
	public static final int MAESTRO_COMBO_DETALLE_VALUE = 3;

	/**
	 * The '<em><b>Maestro Detalle Combo</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAESTRO_DETALLE_COMBO
	 * @model name="maestroDetalleCombo"
	 * @generated
	 * @ordered
	 */
	public static final int MAESTRO_DETALLE_COMBO_VALUE = 4;

	/**
	 * The '<em><b>Maestro Combo Detalle Combo</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAESTRO_COMBO_DETALLE_COMBO
	 * @model name="maestroComboDetalleCombo"
	 * @generated
	 * @ordered
	 */
	public static final int MAESTRO_COMBO_DETALLE_COMBO_VALUE = 5;

	/**
	 * The '<em><b>Sin Representacion</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIN_REPRESENTACION
	 * @model name="sinRepresentacion"
	 * @generated
	 * @ordered
	 */
	public static final int SIN_REPRESENTACION_VALUE = 6;

	/**
	 * An array of all the '<em><b>Tipo ABM</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TipoABM[] VALUES_ARRAY = new TipoABM[] { SIMPLE, SELECCIONABLE, MAESTRO_DETALLE,
			MAESTRO_COMBO_DETALLE, MAESTRO_DETALLE_COMBO, MAESTRO_COMBO_DETALLE_COMBO, SIN_REPRESENTACION, };

	/**
	 * A public read-only list of all the '<em><b>Tipo ABM</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TipoABM> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Tipo ABM</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TipoABM get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TipoABM result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Tipo ABM</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TipoABM getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TipoABM result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Tipo ABM</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TipoABM get(int value) {
		switch (value) {
		case SIMPLE_VALUE:
			return SIMPLE;
		case SELECCIONABLE_VALUE:
			return SELECCIONABLE;
		case MAESTRO_DETALLE_VALUE:
			return MAESTRO_DETALLE;
		case MAESTRO_DETALLE_COMBO_VALUE:
			return MAESTRO_DETALLE_COMBO;
		case MAESTRO_COMBO_DETALLE_COMBO_VALUE:
			return MAESTRO_COMBO_DETALLE_COMBO;
		case SIN_REPRESENTACION_VALUE:
			return SIN_REPRESENTACION;
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
	private TipoABM(int value, String name, String literal) {
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

} //TipoABM
