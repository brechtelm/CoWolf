/**
 *
 * $Id$
 */
package de.uni_stuttgart.iste.cowolf.model.statechart.Statechart.validation;

import de.uni_stuttgart.iste.cowolf.model.statechart.Statechart.Event;
import de.uni_stuttgart.iste.cowolf.model.statechart.Statechart.Guard;
import de.uni_stuttgart.iste.cowolf.model.statechart.Statechart.State;
import de.uni_stuttgart.iste.cowolf.model.statechart.Statechart.StateMachine;
import de.uni_stuttgart.iste.cowolf.model.statechart.Statechart.StateVertex;

/**
 * A sample validator interface for {@link de.uni_stuttgart.iste.cowolf.model.statechart.Statechart.Transition}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface TransitionValidator {
	boolean validate();

	boolean validateTransSM_container(StateMachine value);
	boolean validateTransS_container(State value);
	boolean validateTrigger(Event value);
	boolean validateGuard(Guard value);
	boolean validateSource(StateVertex value);
	boolean validateTarget(StateVertex value);
}
