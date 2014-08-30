/**
 *
 * $Id$
 */
package de.uni_stuttgart.iste.cowolf.model.LqnCore.validation;


/**
 * A sample validator interface for {@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ResultConf99Type1}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ResultConf99Type1Validator {
	boolean validate();

	boolean validateOpenWaitTime(Object value);
	boolean validatePhase1ProcWaiting(Object value);
	boolean validatePhase1ServiceTime(Object value);
	boolean validatePhase1ServiceTimeVariance(Object value);
	boolean validatePhase1Utilization(Object value);
	boolean validatePhase2ProcWaiting(Object value);
	boolean validatePhase2ServiceTime(Object value);
	boolean validatePhase2ServiceTimeVariance(Object value);
	boolean validatePhase2Utilization(Object value);
	boolean validatePhase3ProcWaiting(Object value);
	boolean validatePhase3ServiceTime(Object value);
	boolean validatePhase3ServiceTimeVariance(Object value);
	boolean validatePhase3Utilization(Object value);
	boolean validateProbExceedMaxServiceTime(Object value);
	boolean validateProcUtilization(Object value);
	boolean validateProcWaiting(Object value);
	boolean validateServiceTime(Object value);
	boolean validateServiceTimeVariance(Object value);
	boolean validateSquaredCoeffVariation(Object value);
	boolean validateThroughput(Object value);
	boolean validateThroughputBound(Object value);
	boolean validateUtilization(Object value);
	boolean validateWaiting(Object value);
	boolean validateWaitingVariance(Object value);
}