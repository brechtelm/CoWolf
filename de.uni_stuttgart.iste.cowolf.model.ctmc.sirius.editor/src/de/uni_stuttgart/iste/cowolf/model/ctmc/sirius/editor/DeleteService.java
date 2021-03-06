package de.uni_stuttgart.iste.cowolf.model.ctmc.sirius.editor;

import de.uni_stuttgart.iste.cowolf.model.ctmc.State;
import de.uni_stuttgart.iste.cowolf.model.ctmc.Transition;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;

public class DeleteService {

	public void delete(State state) {

		EList<Transition> incoming = state.getIncoming();
		for (int i = incoming.size() - 1; i > -1; i--) {
			EObject object = incoming.get(i);
			EcoreUtil.remove(object);
		}

		EList<Transition> outgoing = state.getOutgoing();

		for (int i = outgoing.size() - 1; i > -1; i--) {
			EObject object = outgoing.get(i);
			EcoreUtil.remove(object);
		}

		EcoreUtil.remove(state);
	}

}
