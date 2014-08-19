/**
 *
 * $Id$
 */
package de.uni_stuttgart.iste.cowolf.model.dtmc.validation;

import de.uni_stuttgart.iste.cowolf.model.dtmc.Label;
import de.uni_stuttgart.iste.cowolf.model.dtmc.Transition;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link de.uni_stuttgart.iste.cowolf.model.dtmc.State}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface StateValidator {
	boolean validate();

	boolean validateName(String value);
	boolean validateIncoming(EList<Transition> value);
	boolean validateOutgoing(EList<Transition> value);
	boolean validateLabels(EList<Label> value);
}