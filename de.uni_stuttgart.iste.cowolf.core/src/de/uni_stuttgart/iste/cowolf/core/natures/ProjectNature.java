package de.uni_stuttgart.iste.cowolf.core.natures;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectNature;
import org.eclipse.core.runtime.CoreException;

/**
 * our own project nature
 *
 */
public class ProjectNature implements IProjectNature {

	public static final String NATURE_ID = "de.uni_stuttgart.iste.cowolf.ui.projectNature"; //$NON-NLS-1$
	public static final String MODELING_NATURE_ID = "org.eclipse.sirius.nature.modelingproject";

	@Override
	public void configure() throws CoreException {
		// TODO Auto-generated method stub

	}

	@Override
	public void deconfigure() throws CoreException {
		// TODO Auto-generated method stub

	}

	@Override
	public IProject getProject() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setProject(IProject project) {
		// TODO Auto-generated method stub

	}

}