/*
* generated by Xtext
*/
package de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class PCTLAntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.tokens");
	}
}
