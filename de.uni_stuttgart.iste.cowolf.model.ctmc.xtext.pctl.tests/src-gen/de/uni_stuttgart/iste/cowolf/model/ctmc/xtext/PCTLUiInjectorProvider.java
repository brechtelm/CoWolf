/*
* generated by Xtext
*/
package de.uni_stuttgart.iste.cowolf.model.ctmc.xtext;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class PCTLUiInjectorProvider implements IInjectorProvider {
	
	public Injector getInjector() {
		return de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.ui.internal.PCTLActivator.getInstance().getInjector("de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.PCTL");
	}
	
}