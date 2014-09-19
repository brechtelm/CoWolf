/*
* generated by Xtext
*/
package de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.services.PCTLGrammarAccess;

public class PCTLParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private PCTLGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS");
	}
	
	@Override
	protected de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.parser.antlr.internal.InternalPCTLParser createParser(XtextTokenStream stream) {
		return new de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.parser.antlr.internal.InternalPCTLParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "Start";
	}
	
	public PCTLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(PCTLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}
