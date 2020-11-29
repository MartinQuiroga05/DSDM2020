/**
 */
package diagramaClasesCompleto.provider;

import diagramaClasesCompleto.DiagramaClases;
import diagramaClasesCompleto.DiagramaClasesCompletoFactory;
import diagramaClasesCompleto.DiagramaClasesCompletoPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link diagramaClasesCompleto.DiagramaClases} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DiagramaClasesItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagramaClasesItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(DiagramaClasesCompletoPackage.Literals.DIAGRAMA_CLASES__PACKAGES_CONTENIDOS);
			childrenFeatures.add(DiagramaClasesCompletoPackage.Literals.DIAGRAMA_CLASES__ARTEFACTO_CONTENIDO);
			childrenFeatures.add(DiagramaClasesCompletoPackage.Literals.DIAGRAMA_CLASES__CONFIGURACIONDB);
			childrenFeatures.add(DiagramaClasesCompletoPackage.Literals.DIAGRAMA_CLASES__CONFIGURACIONDOCKER);
			childrenFeatures.add(DiagramaClasesCompletoPackage.Literals.DIAGRAMA_CLASES__CONFIGURACIONLENGUAJE);
			childrenFeatures.add(DiagramaClasesCompletoPackage.Literals.DIAGRAMA_CLASES__CONFIGURACIONMICROSERVICIOS);
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
	 * This returns DiagramaClases.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DiagramaClases"));
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
		return getString("_UI_DiagramaClases_type");
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

		switch (notification.getFeatureID(DiagramaClases.class)) {
		case DiagramaClasesCompletoPackage.DIAGRAMA_CLASES__PACKAGES_CONTENIDOS:
		case DiagramaClasesCompletoPackage.DIAGRAMA_CLASES__ARTEFACTO_CONTENIDO:
		case DiagramaClasesCompletoPackage.DIAGRAMA_CLASES__CONFIGURACIONDB:
		case DiagramaClasesCompletoPackage.DIAGRAMA_CLASES__CONFIGURACIONDOCKER:
		case DiagramaClasesCompletoPackage.DIAGRAMA_CLASES__CONFIGURACIONLENGUAJE:
		case DiagramaClasesCompletoPackage.DIAGRAMA_CLASES__CONFIGURACIONMICROSERVICIOS:
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
				.add(createChildParameter(DiagramaClasesCompletoPackage.Literals.DIAGRAMA_CLASES__PACKAGES_CONTENIDOS,
						DiagramaClasesCompletoFactory.eINSTANCE.createPackage()));

		newChildDescriptors
				.add(createChildParameter(DiagramaClasesCompletoPackage.Literals.DIAGRAMA_CLASES__ARTEFACTO_CONTENIDO,
						DiagramaClasesCompletoFactory.eINSTANCE.createArtefacto()));

		newChildDescriptors
				.add(createChildParameter(DiagramaClasesCompletoPackage.Literals.DIAGRAMA_CLASES__CONFIGURACIONDB,
						DiagramaClasesCompletoFactory.eINSTANCE.createConfiguracionDB()));

		newChildDescriptors
				.add(createChildParameter(DiagramaClasesCompletoPackage.Literals.DIAGRAMA_CLASES__CONFIGURACIONDOCKER,
						DiagramaClasesCompletoFactory.eINSTANCE.createConfiguracionDocker()));

		newChildDescriptors
				.add(createChildParameter(DiagramaClasesCompletoPackage.Literals.DIAGRAMA_CLASES__CONFIGURACIONLENGUAJE,
						DiagramaClasesCompletoFactory.eINSTANCE.createConfiguracionLenguaje()));

		newChildDescriptors.add(createChildParameter(
				DiagramaClasesCompletoPackage.Literals.DIAGRAMA_CLASES__CONFIGURACIONMICROSERVICIOS,
				DiagramaClasesCompletoFactory.eINSTANCE.createConfiguracionMicroservicios()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return DiagramaClasesCompletoEditPlugin.INSTANCE;
	}

}
