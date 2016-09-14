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
package org.polarsys.capella.test.diagram.filters.ju.testsuites;

import java.util.List;

import junit.framework.Test;

import org.polarsys.capella.test.framework.api.AutoLoadTestSuite;

/**
 * @author Erwan Brottier
 */
public class DiagramFiltersAutoLoadTestSuite extends AutoLoadTestSuite {

  /**
   * Returns the suite. This is required to unary launch this test.
   */
  public static Test suite() {
    return new DiagramFiltersAutoLoadTestSuite();
  }
	
  @Override
  protected String getTestCasesRootPackage() {
    return "org.polarsys.capella.test.diagram.filters.ju.testcases"; //$NON-NLS-1$
  }

	@Override
	public List<String> getRequiredTestModels() {
		return null;
	}

}