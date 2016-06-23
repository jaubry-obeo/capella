/*******************************************************************************
 * Copyright (c) 2006, 2016 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *    Thales - initial API and implementation
 *******************************************************************************/

package org.polarsys.capella.core.libraries.extendedqueries.epbs;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.polarsys.capella.common.queries.AbstractQuery;
import org.polarsys.capella.common.queries.queryContext.IQueryContext;
import org.polarsys.capella.core.data.capellacore.CapellaElement;
import org.polarsys.capella.core.data.cs.AbstractPhysicalArtifact;
import org.polarsys.capella.core.data.epbs.ConfigurationItem;
import org.polarsys.capella.core.data.pa.PhysicalComponent;
import org.polarsys.capella.core.model.utils.ListExt;

public class GetAvailable_ConfigurationItem_ImplementedInterfaces__Lib extends AbstractQuery {

  @Override
  public List<Object> execute(Object input, IQueryContext context) {
    CapellaElement capellaElement = (CapellaElement) input;
    List<EObject> availableElements = getAvailableElements(capellaElement);
    return (List) availableElements;
  }

  public List<EObject> getAvailableElements(CapellaElement element) {
    List<EObject> availableElements = new ArrayList<EObject>();
    if (element instanceof ConfigurationItem) {
      for (AbstractPhysicalArtifact physicalArtifact : ((ConfigurationItem) element).getAllocatedPhysicalArtifacts()) {
        if (physicalArtifact instanceof PhysicalComponent) {
          availableElements.addAll(((PhysicalComponent) physicalArtifact).getImplementedInterfaces());
        }
      }
    }
    availableElements = ListExt.removeDuplicates(availableElements);
    return availableElements;
  }

}
