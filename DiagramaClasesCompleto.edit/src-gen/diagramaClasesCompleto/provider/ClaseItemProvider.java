/**
 */
package diagramaClasesCompleto.provider;

import diagramaClasesCompleto.Clase;
import diagramaClasesCompleto.DiagramaClasesCompletoFactory;
import diagramaClasesCompleto.DiagramaClasesCompletoPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link diagramaClasesCompleto.Clase} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ClaseItemProvider extends ClasificadorItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaseItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addEsAbstractaPropertyDescriptor(object);
			addEsAsociativaPropertyDescriptor(object);
			addEsAuditablePropertyDescriptor(object);
			addTieneABMPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Es Abstracta feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEsAbstractaPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Clase_esAbstracta_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Clase_esAbstracta_feature",
								"_UI_Clase_type"),
						DiagramaClasesCompletoPackage.Literals.CLASE__ES_ABSTRACTA, true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Es Asociativa feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEsAsociativaPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Clase_esAsociativa_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Clase_esAsociativa_feature",
								"_UI_Clase_type"),
						DiagramaClasesCompletoPackage.Literals.CLASE__ES_ASOCIATIVA, true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Es Auditable feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEsAuditablePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Clase_esAuditable_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Clase_esAuditable_feature",
								"_UI_Clase_type"),
						DiagramaClasesCompletoPackage.Literals.CLASE__ES_AUDITABLE, true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Tiene ABM feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTieneABMPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Clase_tieneABM_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Clase_tieneABM_feature", "_UI_Clase_type"),
						DiagramaClasesCompletoPackage.Literals.CLASE__TIENE_ABM, true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(DiagramaClasesCompletoPackage.Literals.CLASE__RELACIONES_CONTENIDAS);
			childrenFeatures.add(DiagramaClasesCompletoPackage.Literals.CLASE__REALIZACIONES_CONTENIDAS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Clase.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Clase"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Clase) object).getNombre();
		return label == null || label.length() == 0 ? getString("_UI_Clase_type")
				: getString("_UI_Clase_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Clase.class)) {
		case DiagramaClasesCompletoPackage.CLASE__ES_ABSTRACTA:
		case DiagramaClasesCompletoPackage.CLASE__ES_ASOCIATIVA:
		case DiagramaClasesCompletoPackage.CLASE__ES_AUDITABLE:
		case DiagramaClasesCompletoPackage.CLASE__TIENE_ABM:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case DiagramaClasesCompletoPackage.CLASE__RELACIONES_CONTENIDAS:
		case DiagramaClasesCompletoPackage.CLASE__REALIZACIONES_CONTENIDAS:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors
				.add(createChildParameter(DiagramaClasesCompletoPackage.Literals.CLASE__RELACIONES_CONTENIDAS,
						DiagramaClasesCompletoFactory.eINSTANCE.createRelacion()));

		newChildDescriptors
				.add(createChildParameter(DiagramaClasesCompletoPackage.Literals.CLASE__REALIZACIONES_CONTENIDAS,
						DiagramaClasesCompletoFactory.eINSTANCE.createRealizacion()));
	}

}
