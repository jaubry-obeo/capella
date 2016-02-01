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
package org.polarsys.capella.core.business.queries.information;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.polarsys.capella.common.queries.interpretor.QueryInterpretor;
import org.polarsys.capella.common.queries.queryContext.QueryContext;
import org.polarsys.capella.core.business.queries.IBusinessQuery;
import org.polarsys.capella.core.business.queries.QueryConstants;
import org.polarsys.capella.core.data.capellacore.CapellaElement;
import org.polarsys.capella.core.data.capellacore.CapellacorePackage;
import org.polarsys.capella.core.data.information.InformationPackage;

/**
 */
public class Class_InheritedClasses extends AbstractClassInheritedClasses implements IBusinessQuery {

  @Override
	public List<EReference> getEStructuralFeatures() {
		List<EReference> list = new ArrayList<EReference>(1);
		list.add(CapellacorePackage.Literals.GENERALIZABLE_ELEMENT__OWNED_GENERALIZATIONS);
		list.add(CapellacorePackage.Literals.GENERALIZABLE_ELEMENT__SUPER_GENERALIZATIONS);
		return list;
	}

	/**
   * @see org.polarsys.capella.core.business.queries.capellacore.IBusinessQuery#getEClass()
   */
  @Override
	public EClass getEClass() {
    return InformationPackage.Literals.CLASS;
  }

  @Override
  public List<CapellaElement> getAvailableElements(CapellaElement element) {
    QueryContext context = new QueryContext();
		context.putValue(QueryConstants.ECLASS_PARAMETER, getEClass());
		return QueryInterpretor.executeQuery(QueryConstants.GET_AVAILABLE__CLASS__INHERITED_CLASSES___LIB, element, context);
  }

  @Override
  public List<CapellaElement> getCurrentElements(CapellaElement element, boolean onlyGenerated) {
    QueryContext context = new QueryContext();
		context.putValue(QueryConstants.ECLASS_PARAMETER, getEClass());
		return QueryInterpretor.executeQuery(QueryConstants.GET_CURRENT__CLASS__INHERITED_CLASSES, element, context);
  }

}
