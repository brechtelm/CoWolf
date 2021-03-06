/**
 *
 * $Id$
 */
package de.uni_stuttgart.iste.cowolf.model.statechart.validation;

import de.uni_stuttgart.iste.cowolf.model.statechart.Event;
import de.uni_stuttgart.iste.cowolf.model.statechart.StateAction;
import de.uni_stuttgart.iste.cowolf.model.statechart.StateMachine;
import de.uni_stuttgart.iste.cowolf.model.statechart.Transition;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link de.uni_stuttgart.iste.cowolf.model.statechart.State}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface StateValidator {
	boolean validate();

	boolean validateLabel(EList<String> value);
	boolean validateState_container(StateMachine value);
	boolean validateInternalTransitions(EList<Transition> value);
	boolean validateDeferrableEvents(EList<Event> value);
	boolean validateActions(EList<StateAction> value);
}
