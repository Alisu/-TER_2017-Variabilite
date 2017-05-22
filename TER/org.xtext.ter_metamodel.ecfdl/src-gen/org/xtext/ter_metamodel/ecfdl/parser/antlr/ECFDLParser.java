/*
 * generated by Xtext 2.10.0
 */
package org.xtext.ter_metamodel.ecfdl.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.xtext.ter_metamodel.ecfdl.parser.antlr.internal.InternalECFDLParser;
import org.xtext.ter_metamodel.ecfdl.services.ECFDLGrammarAccess;

public class ECFDLParser extends AbstractAntlrParser {

	@Inject
	private ECFDLGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalECFDLParser createParser(XtextTokenStream stream) {
		return new InternalECFDLParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "File";
	}

	public ECFDLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(ECFDLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}