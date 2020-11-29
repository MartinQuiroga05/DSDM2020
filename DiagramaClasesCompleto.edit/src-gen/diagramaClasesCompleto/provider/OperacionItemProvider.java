/**
 */
package diagramaClasesCompleto.provider;

import diagramaClasesCompleto.DiagramaClasesCompletoFactory;
import diagramaClasesCompleto.DiagramaClasesCompletoPackage;
import diagramaClasesCompleto.Operacion;

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
 * This is the item provider adapter for a {@link diagramaClasesCompleto.Operacion} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class OperacionItemProvider extends RetornableItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperacionItemProvider(AdapterFactory adapterFactory) {
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

			addTipoRetornoPropertyDescriptor(object);
			addEsAbstractaPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Tipo Retorno feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTipoRetornoPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Operacion_tipoRetorno_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Operacion_tipoRetorno_feature",
								"_UI_Operacion_type"),
						DiagramaClasesCompletoPackage.Literals.OPERACION__TIPO_RETORNO, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
						getResourceLocator(), getString("_UI_Operacion_esAbstracta_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Operacion_esAbstracta_feature",
								"_UI_Operacion_type"),
						DiagramaClasesCompletoPackage.Literals.OPERACION__ES_ABSTRACTA, true, false, false,
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
			childrenFeatures.add(DiagramaClasesCompletoPackage.Literals.OPERACION__PARAMETROS_CONTENIDOS);
			childrenFeatures.add(DiagramaClasesCompletoPackage.Literals.OPERACION__ENDPOINT);
			childrenFeatures.add(DiagramaClasesCompletoPackage.Literals.OPERACION__PARAMETROS_INTERNOS);
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
	 * This returns Operacion.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Operacion"));
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
		String label = ((Operacion) object).getNombre();
		return label == null || label.length() == 0 ? getString("_UI_Operacion_type")
				: getString("_UI_Operacion_type") + " " + label;
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

		switch (notification.getFeatureID(Operacion.class)) {
		case DiagramaClasesCompletoPackage.OPERACION__TIPO_RETORNO:
		case DiagramaClasesCompletoPackage.OPERACION__ES_ABSTRACTA:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case DiagramaClasesCompletoPackage.OPERACION__PARAMETROS_CONTENIDOS:
		case DiagramaClasesCompletoPackage.OPERACION__ENDPOINT:
		case DiagramaClasesCompletoPackage.OPERACION__PARAMETROS_INTERNOS:
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
				.add(createChildParameter(DiagramaClasesCompletoPackage.Literals.OPERACION__PARAMETROS_CONTENIDOS,
						DiagramaClasesCompletoFactory.eINSTANCE.createOperacion()));

		newChildDescriptors
				.add(createChildParameter(DiagramaClasesCompletoPackage.Literals.OPERACION__PARAMETROS_CONTENIDOS,
						DiagramaClasesCompletoFactory.eINSTANCE.createAtributo()));

		newChildDescriptors.add(createChildParameter(DiagramaClasesCompletoPackage.Literals.OPERACION__ENDPOINT,
				DiagramaClasesCompletoFactory.eINSTANCE.createEndPoint()));

		newChildDescriptors
				.add(createChildParameter(DiagramaClasesCompletoPackage.Literals.OPERACION__PARAMETROS_INTERNOS,
						DiagramaClasesCompletoFactory.eINSTANCE.createParametroInterno()));
	}

}
