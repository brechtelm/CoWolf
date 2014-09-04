/**
 *
 * $Id$
 */
package de.uni_stuttgart.iste.cowolf.model.component_diagram.validation;

import de.uni_stuttgart.iste.cowolf.model.component_diagram.ComponentInstance;
import de.uni_stuttgart.iste.cowolf.model.component_diagram.Connector;
import de.uni_stuttgart.iste.cowolf.model.component_diagram.PortType;

/**
 * A sample validator interface for {@link de.uni_stuttgart.iste.cowolf.model.component_diagram.PortInstance}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface PortInstanceValidator {
	boolean validate();

	boolean validateName(String value);
	boolean validateConnect(Connector value);
	boolean validateOutComponent(ComponentInstance value);
	boolean validateInComponent(ComponentInstance value);
	boolean validateType(PortType value);
}
