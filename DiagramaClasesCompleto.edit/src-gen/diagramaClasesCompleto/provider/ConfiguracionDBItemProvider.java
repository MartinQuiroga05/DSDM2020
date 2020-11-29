/**
 */
package diagramaClasesCompleto.provider;

import diagramaClasesCompleto.ConfiguracionDB;
import diagramaClasesCompleto.DiagramaClasesCompletoPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link diagramaClasesCompleto.ConfiguracionDB} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ConfiguracionDBItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfiguracionDBItemProvider(AdapterFactory adapterFactory) {
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

			addDbNombrePropertyDescriptor(object);
			addDbUsuarioPropertyDescriptor(object);
			addDbPuertoPropertyDescriptor(object);
			addIpPropertyDescriptor(object);
			addDbContrasenaPropertyDescriptor(object);
			addServerPuertoPropertyDescriptor(object);
			addTipoProveedorPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Db Nombre feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDbNombrePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ConfiguracionDB_dbNombre_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_ConfiguracionDB_dbNombre_feature",
						"_UI_ConfiguracionDB_type"),
				DiagramaClasesCompletoPackage.Literals.CONFIGURACION_DB__DB_NOMBRE, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Db Usuario feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDbUsuarioPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ConfiguracionDB_dbUsuario_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ConfiguracionDB_dbUsuario_feature",
								"_UI_ConfiguracionDB_type"),
						DiagramaClasesCompletoPackage.Literals.CONFIGURACION_DB__DB_USUARIO, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Db Puerto feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDbPuertoPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ConfiguracionDB_dbPuerto_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_ConfiguracionDB_dbPuerto_feature",
						"_UI_ConfiguracionDB_type"),
				DiagramaClasesCompletoPackage.Literals.CONFIGURACION_DB__DB_PUERTO, true, false, false,
				ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Ip feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIpPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ConfiguracionDB_ip_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_ConfiguracionDB_ip_feature",
						"_UI_ConfiguracionDB_type"),
				DiagramaClasesCompletoPackage.Literals.CONFIGURACION_DB__IP, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Db Contrasena feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDbContrasenaPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ConfiguracionDB_dbContrasena_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ConfiguracionDB_dbContrasena_feature",
								"_UI_ConfiguracionDB_type"),
						DiagramaClasesCompletoPackage.Literals.CONFIGURACION_DB__DB_CONTRASENA, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Server Puerto feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addServerPuertoPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ConfiguracionDB_serverPuerto_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ConfiguracionDB_serverPuerto_feature",
								"_UI_ConfiguracionDB_type"),
						DiagramaClasesCompletoPackage.Literals.CONFIGURACION_DB__SERVER_PUERTO, true, false, false,
						ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Tipo Proveedor feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTipoProveedorPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ConfiguracionDB_tipoProveedor_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ConfiguracionDB_tipoProveedor_feature",
								"_UI_ConfiguracionDB_type"),
						DiagramaClasesCompletoPackage.Literals.CONFIGURACION_DB__TIPO_PROVEEDOR, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns ConfiguracionDB.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ConfiguracionDB"));
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
		String label = ((ConfiguracionDB) object).getDbNombre();
		return label == null || label.length() == 0 ? getString("_UI_ConfiguracionDB_type")
				: getString("_UI_ConfiguracionDB_type") + " " + label;
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

		switch (notification.getFeatureID(ConfiguracionDB.class)) {
		case DiagramaClasesCompletoPackage.CONFIGURACION_DB__DB_NOMBRE:
		case DiagramaClasesCompletoPackage.CONFIGURACION_DB__DB_USUARIO:
		case DiagramaClasesCompletoPackage.CONFIGURACION_DB__DB_PUERTO:
		case DiagramaClasesCompletoPackage.CONFIGURACION_DB__IP:
		case DiagramaClasesCompletoPackage.CONFIGURACION_DB__DB_CONTRASENA:
		case DiagramaClasesCompletoPackage.CONFIGURACION_DB__SERVER_PUERTO:
		case DiagramaClasesCompletoPackage.CONFIGURACION_DB__TIPO_PROVEEDOR:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
