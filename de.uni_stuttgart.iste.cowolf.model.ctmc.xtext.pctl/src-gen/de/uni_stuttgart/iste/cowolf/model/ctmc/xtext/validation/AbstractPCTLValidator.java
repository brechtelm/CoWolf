/*
 * generated by Xtext
 */
package de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;

public class AbstractPCTLValidator extends org.eclipse.xtext.validation.AbstractDeclarativeValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.PCTLPackage.eINSTANCE);
		return result;
	}
}
