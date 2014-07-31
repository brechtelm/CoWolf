package de.uni.stuttgart.informatik.iste.cowolf.wizards;

import java.net.URI;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExecutableExtension;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;
import org.eclipse.ui.wizards.newresource.BasicNewProjectResourceWizard;

import de.uni.stuttgart.informatik.iste.cowolf.basicExampleFunctions.ExampleCreations;
import de.uni.stuttgart.informatik.iste.cowolf.externalizedStrings.Messages;

public class CustomNewProjectWizard extends Wizard implements INewWizard,
		IExecutableExtension {

	private static final String PAGE_NAME = Messages.CustomNewProjectWizard_page_1_name;
	private static final String WIZARD_NAME = Messages.CustomNewProjectWizard_new_project_wizard_name;

	private WizardNewProjectCreationPage pageOne;
	private IConfigurationElement configurationElement;

	public CustomNewProjectWizard() {
		setWindowTitle(WIZARD_NAME);
	}

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean performFinish() {
		// TODO
		String name = pageOne.getProjectName();
		URI location = null;
		if (!pageOne.useDefaults()) {
			location = pageOne.getLocationURI();
		} // else location == null

		ExampleCreations.createProject(name, location);
		
		//now the wizard automatically opens the correct perspective
		BasicNewProjectResourceWizard.updatePerspective(configurationElement);

		return true;
	}

	@Override
	public void addPages() {
		super.addPages();

		pageOne = new WizardNewProjectCreationPage(PAGE_NAME);
		pageOne.setTitle(Messages.CustomNewProjectWizard_page_1_title);
		pageOne.setDescription(Messages.CustomNewProjectWizard_page_1_description);

		addPage(pageOne);
	}

	@Override
	public void setInitializationData(IConfigurationElement config,
			String propertyName, Object data) throws CoreException {
		configurationElement = config;
	}

}