/*******************************************************************************
 * Copyright (c) 2006, 2014 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Thales - initial API and implementation
 *******************************************************************************/
package org.polarsys.capella.core.data.information.communication.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.CopyCommand.Helper;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.polarsys.capella.common.data.modellingcore.AbstractNamedElement;
import org.polarsys.capella.common.data.modellingcore.AbstractTrace;
import org.polarsys.capella.common.model.copypaste.SharedInitializeCopyCommand;
import org.polarsys.capella.core.data.capellacore.provider.AllocationItemProvider;
import org.polarsys.capella.core.data.information.communication.CommunicationPackage;
import org.polarsys.kitalpha.emde.extension.ExtensionModelManager;
import org.polarsys.kitalpha.emde.extension.ModelExtensionHelper;

/**
 * This is the item provider adapter for a {@link org.polarsys.capella.core.data.information.communication.CommunicationLinkAllocation} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CommunicationLinkAllocationItemProvider
	extends AllocationItemProvider
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IItemPropertyDescriptor allocatingLinkPropertyDescriptor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IItemPropertyDescriptor allocatedLinkPropertyDescriptor;

	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationLinkAllocationItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void checkChildCreationExtender(Object object) {
		super.checkChildCreationExtender(object);
		if (object instanceof EObject) {
			EObject eObject = (EObject) object;
			// Process CommunicationPackage.Literals.COMMUNICATION_LINK_ALLOCATION__ALLOCATING_LINK
			if (allocatingLinkPropertyDescriptor != null) {
				Object allocatingLinkValue = eObject.eGet(CommunicationPackage.Literals.COMMUNICATION_LINK_ALLOCATION__ALLOCATING_LINK, true);
				if (allocatingLinkValue != null && allocatingLinkValue instanceof EObject && ModelExtensionHelper.getInstance().isExtensionModelDisabled((EObject) allocatingLinkValue)) {
					itemPropertyDescriptors.remove(allocatingLinkPropertyDescriptor);
				} else if (allocatingLinkValue == null && ExtensionModelManager.getAnyType(eObject, CommunicationPackage.Literals.COMMUNICATION_LINK_ALLOCATION__ALLOCATING_LINK) != null) {
					itemPropertyDescriptors.remove(allocatingLinkPropertyDescriptor);				  					
				} else if (itemPropertyDescriptors.contains(allocatingLinkPropertyDescriptor) == false) {
					itemPropertyDescriptors.add(allocatingLinkPropertyDescriptor);
				}
			}
			// Process CommunicationPackage.Literals.COMMUNICATION_LINK_ALLOCATION__ALLOCATED_LINK
			if (allocatedLinkPropertyDescriptor != null) {
				Object allocatedLinkValue = eObject.eGet(CommunicationPackage.Literals.COMMUNICATION_LINK_ALLOCATION__ALLOCATED_LINK, true);
				if (allocatedLinkValue != null && allocatedLinkValue instanceof EObject && ModelExtensionHelper.getInstance().isExtensionModelDisabled((EObject) allocatedLinkValue)) {
					itemPropertyDescriptors.remove(allocatedLinkPropertyDescriptor);
				} else if (allocatedLinkValue == null && ExtensionModelManager.getAnyType(eObject, CommunicationPackage.Literals.COMMUNICATION_LINK_ALLOCATION__ALLOCATED_LINK) != null) {
					itemPropertyDescriptors.remove(allocatedLinkPropertyDescriptor);				  					
				} else if (itemPropertyDescriptors.contains(allocatedLinkPropertyDescriptor) == false) {
					itemPropertyDescriptors.add(allocatedLinkPropertyDescriptor);
				}
			}
		}		
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

			addAllocatingLinkPropertyDescriptor(object);
			addAllocatedLinkPropertyDescriptor(object);
		}
		// begin-extension-code
		checkChildCreationExtender(object);
		// end-extension-code
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Allocating Link feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAllocatingLinkPropertyDescriptor(Object object) {
		// begin-extension-code
		allocatingLinkPropertyDescriptor = createItemPropertyDescriptor
		// end-extension-code		
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CommunicationLinkAllocation_allocatingLink_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_CommunicationLinkAllocation_allocatingLink_feature", "_UI_CommunicationLinkAllocation_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 CommunicationPackage.Literals.COMMUNICATION_LINK_ALLOCATION__ALLOCATING_LINK,
				 false,
				 false,
				 false,
				 null,
				 null,
		// begin-extension-code
				 null);
		itemPropertyDescriptors.add(allocatingLinkPropertyDescriptor);
		// end-extension-code
	}

	/**
	 * This adds a property descriptor for the Allocated Link feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAllocatedLinkPropertyDescriptor(Object object) {
		// begin-extension-code
		allocatedLinkPropertyDescriptor = createItemPropertyDescriptor
		// end-extension-code		
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CommunicationLinkAllocation_allocatedLink_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_CommunicationLinkAllocation_allocatedLink_feature", "_UI_CommunicationLinkAllocation_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 CommunicationPackage.Literals.COMMUNICATION_LINK_ALLOCATION__ALLOCATED_LINK,
				 false,
				 false,
				 false,
				 null,
				 null,
		// begin-extension-code
				 null);
		itemPropertyDescriptors.add(allocatedLinkPropertyDescriptor);
		// end-extension-code
	}

	/**
	 * This returns CommunicationLinkAllocation.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CommunicationLinkAllocation")); //$NON-NLS-1$
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
	 String[] result = new String[] { null };

    	//begin-capella-code
        String label = ""; //$NON-NLS-1$
        String targetName = ""; //$NON-NLS-1$
        EObject target = null;

 		target = ((AbstractTrace) object).getTargetElement();
	
	 	if (null != target) {
			if (target instanceof AbstractNamedElement) {
				targetName = ((AbstractNamedElement) target).getName();
			}

			if (null == targetName || "" == targetName) { //$NON-NLS-1$
				targetName = "[" + target.eClass().getName() + "]"; //$NON-NLS-1$ //$NON-NLS-2$
			}
	 	}
	 	label = "[" + getString("_UI_CommunicationLinkAllocation_type") + "] to " + targetName; //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		
		//end-capella-code
	  
	
			result[0] = label == null || label.length() == 0 ?
			//begin-capella-code
			"[" + getString("_UI_CommunicationLinkAllocation_type") + "]" : label; //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
			//end-capella-code

		return result[0];

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

	// begin-capella-code
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Command createInitializeCopyCommand(EditingDomain domain_p, EObject owner_p, Helper helper_p) {
		return new SharedInitializeCopyCommand(domain_p, owner_p, helper_p);
	}
	// end-capella-code
}