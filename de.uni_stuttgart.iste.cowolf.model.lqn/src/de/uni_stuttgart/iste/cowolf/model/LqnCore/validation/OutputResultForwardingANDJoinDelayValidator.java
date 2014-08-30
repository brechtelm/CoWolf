/**
 *
 * $Id$
 */
package de.uni_stuttgart.iste.cowolf.model.LqnCore.validation;

import de.uni_stuttgart.iste.cowolf.model.LqnCore.ResultConf95Type;
import de.uni_stuttgart.iste.cowolf.model.LqnCore.ResultConf99Type;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link de.uni_stuttgart.iste.cowolf.model.LqnCore.OutputResultForwardingANDJoinDelay}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface OutputResultForwardingANDJoinDelayValidator {
	boolean validate();

	boolean validateResultConf95(EList<ResultConf95Type> value);
	boolean validateResultConf99(EList<ResultConf99Type> value);
	boolean validateDest(String value);
	boolean validateJoinVariance(Object value);
	boolean validateJoinWaiting(Object value);
	boolean validateWaiting(Object value);
}