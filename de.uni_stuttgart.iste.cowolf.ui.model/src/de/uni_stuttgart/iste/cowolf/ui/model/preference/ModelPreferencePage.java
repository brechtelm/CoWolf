package de.uni_stuttgart.iste.cowolf.ui.model.preference;

import org.eclipse.jface.preference.BooleanFieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

import de.uni_stuttgart.iste.cowolf.ui.model.Activator;

public class ModelPreferencePage extends FieldEditorPreferencePage implements
		IWorkbenchPreferencePage {

	public ModelPreferencePage() {
		super(GRID);
		this.setPreferenceStore(Activator.getDefault().getPreferenceStore());
	    this.setDescription("General Settings for Models");
	}

	@Override
	protected void createFieldEditors() {
		// TODO Auto-generated method stub
		BooleanFieldEditor editor = new BooleanFieldEditor("FOLDER_CREATION",
				"&Create model folders", BooleanFieldEditor.SEPARATE_LABEL, this.getFieldEditorParent());
		Activator.getDefault().getPreferenceStore().setValue("FOLDER_CREATION", true);
		Activator.getDefault().getPreferenceStore().setDefault("FOLDER_CREATION", true);
		this.addField(editor);
	}

	@Override
	public void init(IWorkbench workbench) {
		// TODO Auto-generated method stub

	}
	
	public static boolean getFolderPreference() {
		return Activator.getDefault().getPreferenceStore()
				.getBoolean("FOLDER_CREATION");
	}
}
