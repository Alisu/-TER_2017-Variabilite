package org.xtext.ter_metamodel.ecfdl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.ter_metamodel.ecfdl.services.ECFDLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalECFDLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'listEcfd'", "'{'", "'}'", "','", "'Ecfd'", "':'", "'boxes'", "'groups'", "'mutex'", "'Mutex'", "'('", "')'", "'Box'", "'superBox'", "'groupbox'", "'motherOf'", "'motherOfGroup'", "'features'", "'GroupBox'", "'Root'", "'Exclusif'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalECFDLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalECFDLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalECFDLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalECFDL.g"; }


    	private ECFDLGrammarAccess grammarAccess;

    	public void setGrammarAccess(ECFDLGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleFile"
    // InternalECFDL.g:53:1: entryRuleFile : ruleFile EOF ;
    public final void entryRuleFile() throws RecognitionException {
        try {
            // InternalECFDL.g:54:1: ( ruleFile EOF )
            // InternalECFDL.g:55:1: ruleFile EOF
            {
             before(grammarAccess.getFileRule()); 
            pushFollow(FOLLOW_1);
            ruleFile();

            state._fsp--;

             after(grammarAccess.getFileRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFile"


    // $ANTLR start "ruleFile"
    // InternalECFDL.g:62:1: ruleFile : ( ( rule__File__Group__0 ) ) ;
    public final void ruleFile() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:66:2: ( ( ( rule__File__Group__0 ) ) )
            // InternalECFDL.g:67:2: ( ( rule__File__Group__0 ) )
            {
            // InternalECFDL.g:67:2: ( ( rule__File__Group__0 ) )
            // InternalECFDL.g:68:3: ( rule__File__Group__0 )
            {
             before(grammarAccess.getFileAccess().getGroup()); 
            // InternalECFDL.g:69:3: ( rule__File__Group__0 )
            // InternalECFDL.g:69:4: rule__File__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__File__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFileAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFile"


    // $ANTLR start "entryRuleEcfd"
    // InternalECFDL.g:78:1: entryRuleEcfd : ruleEcfd EOF ;
    public final void entryRuleEcfd() throws RecognitionException {
        try {
            // InternalECFDL.g:79:1: ( ruleEcfd EOF )
            // InternalECFDL.g:80:1: ruleEcfd EOF
            {
             before(grammarAccess.getEcfdRule()); 
            pushFollow(FOLLOW_1);
            ruleEcfd();

            state._fsp--;

             after(grammarAccess.getEcfdRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEcfd"


    // $ANTLR start "ruleEcfd"
    // InternalECFDL.g:87:1: ruleEcfd : ( ( rule__Ecfd__Group__0 ) ) ;
    public final void ruleEcfd() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:91:2: ( ( ( rule__Ecfd__Group__0 ) ) )
            // InternalECFDL.g:92:2: ( ( rule__Ecfd__Group__0 ) )
            {
            // InternalECFDL.g:92:2: ( ( rule__Ecfd__Group__0 ) )
            // InternalECFDL.g:93:3: ( rule__Ecfd__Group__0 )
            {
             before(grammarAccess.getEcfdAccess().getGroup()); 
            // InternalECFDL.g:94:3: ( rule__Ecfd__Group__0 )
            // InternalECFDL.g:94:4: rule__Ecfd__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Ecfd__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEcfdAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEcfd"


    // $ANTLR start "entryRuleMutex"
    // InternalECFDL.g:103:1: entryRuleMutex : ruleMutex EOF ;
    public final void entryRuleMutex() throws RecognitionException {
        try {
            // InternalECFDL.g:104:1: ( ruleMutex EOF )
            // InternalECFDL.g:105:1: ruleMutex EOF
            {
             before(grammarAccess.getMutexRule()); 
            pushFollow(FOLLOW_1);
            ruleMutex();

            state._fsp--;

             after(grammarAccess.getMutexRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMutex"


    // $ANTLR start "ruleMutex"
    // InternalECFDL.g:112:1: ruleMutex : ( ( rule__Mutex__Group__0 ) ) ;
    public final void ruleMutex() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:116:2: ( ( ( rule__Mutex__Group__0 ) ) )
            // InternalECFDL.g:117:2: ( ( rule__Mutex__Group__0 ) )
            {
            // InternalECFDL.g:117:2: ( ( rule__Mutex__Group__0 ) )
            // InternalECFDL.g:118:3: ( rule__Mutex__Group__0 )
            {
             before(grammarAccess.getMutexAccess().getGroup()); 
            // InternalECFDL.g:119:3: ( rule__Mutex__Group__0 )
            // InternalECFDL.g:119:4: rule__Mutex__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Mutex__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMutexAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMutex"


    // $ANTLR start "entryRuleBox"
    // InternalECFDL.g:128:1: entryRuleBox : ruleBox EOF ;
    public final void entryRuleBox() throws RecognitionException {
        try {
            // InternalECFDL.g:129:1: ( ruleBox EOF )
            // InternalECFDL.g:130:1: ruleBox EOF
            {
             before(grammarAccess.getBoxRule()); 
            pushFollow(FOLLOW_1);
            ruleBox();

            state._fsp--;

             after(grammarAccess.getBoxRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBox"


    // $ANTLR start "ruleBox"
    // InternalECFDL.g:137:1: ruleBox : ( ( rule__Box__Group__0 ) ) ;
    public final void ruleBox() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:141:2: ( ( ( rule__Box__Group__0 ) ) )
            // InternalECFDL.g:142:2: ( ( rule__Box__Group__0 ) )
            {
            // InternalECFDL.g:142:2: ( ( rule__Box__Group__0 ) )
            // InternalECFDL.g:143:3: ( rule__Box__Group__0 )
            {
             before(grammarAccess.getBoxAccess().getGroup()); 
            // InternalECFDL.g:144:3: ( rule__Box__Group__0 )
            // InternalECFDL.g:144:4: rule__Box__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Box__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBoxAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBox"


    // $ANTLR start "entryRuleGroupBox"
    // InternalECFDL.g:153:1: entryRuleGroupBox : ruleGroupBox EOF ;
    public final void entryRuleGroupBox() throws RecognitionException {
        try {
            // InternalECFDL.g:154:1: ( ruleGroupBox EOF )
            // InternalECFDL.g:155:1: ruleGroupBox EOF
            {
             before(grammarAccess.getGroupBoxRule()); 
            pushFollow(FOLLOW_1);
            ruleGroupBox();

            state._fsp--;

             after(grammarAccess.getGroupBoxRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGroupBox"


    // $ANTLR start "ruleGroupBox"
    // InternalECFDL.g:162:1: ruleGroupBox : ( ( rule__GroupBox__Group__0 ) ) ;
    public final void ruleGroupBox() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:166:2: ( ( ( rule__GroupBox__Group__0 ) ) )
            // InternalECFDL.g:167:2: ( ( rule__GroupBox__Group__0 ) )
            {
            // InternalECFDL.g:167:2: ( ( rule__GroupBox__Group__0 ) )
            // InternalECFDL.g:168:3: ( rule__GroupBox__Group__0 )
            {
             before(grammarAccess.getGroupBoxAccess().getGroup()); 
            // InternalECFDL.g:169:3: ( rule__GroupBox__Group__0 )
            // InternalECFDL.g:169:4: rule__GroupBox__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GroupBox__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGroupBoxAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGroupBox"


    // $ANTLR start "entryRuleFeature"
    // InternalECFDL.g:178:1: entryRuleFeature : ruleFeature EOF ;
    public final void entryRuleFeature() throws RecognitionException {
        try {
            // InternalECFDL.g:179:1: ( ruleFeature EOF )
            // InternalECFDL.g:180:1: ruleFeature EOF
            {
             before(grammarAccess.getFeatureRule()); 
            pushFollow(FOLLOW_1);
            ruleFeature();

            state._fsp--;

             after(grammarAccess.getFeatureRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFeature"


    // $ANTLR start "ruleFeature"
    // InternalECFDL.g:187:1: ruleFeature : ( ( rule__Feature__Group__0 ) ) ;
    public final void ruleFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:191:2: ( ( ( rule__Feature__Group__0 ) ) )
            // InternalECFDL.g:192:2: ( ( rule__Feature__Group__0 ) )
            {
            // InternalECFDL.g:192:2: ( ( rule__Feature__Group__0 ) )
            // InternalECFDL.g:193:3: ( rule__Feature__Group__0 )
            {
             before(grammarAccess.getFeatureAccess().getGroup()); 
            // InternalECFDL.g:194:3: ( rule__Feature__Group__0 )
            // InternalECFDL.g:194:4: rule__Feature__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Feature__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFeature"


    // $ANTLR start "entryRuleEString"
    // InternalECFDL.g:203:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalECFDL.g:204:1: ( ruleEString EOF )
            // InternalECFDL.g:205:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalECFDL.g:212:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:216:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalECFDL.g:217:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalECFDL.g:217:2: ( ( rule__EString__Alternatives ) )
            // InternalECFDL.g:218:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalECFDL.g:219:3: ( rule__EString__Alternatives )
            // InternalECFDL.g:219:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalECFDL.g:227:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:231:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalECFDL.g:232:2: ( RULE_STRING )
                    {
                    // InternalECFDL.g:232:2: ( RULE_STRING )
                    // InternalECFDL.g:233:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalECFDL.g:238:2: ( RULE_ID )
                    {
                    // InternalECFDL.g:238:2: ( RULE_ID )
                    // InternalECFDL.g:239:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__File__Group__0"
    // InternalECFDL.g:248:1: rule__File__Group__0 : rule__File__Group__0__Impl rule__File__Group__1 ;
    public final void rule__File__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:252:1: ( rule__File__Group__0__Impl rule__File__Group__1 )
            // InternalECFDL.g:253:2: rule__File__Group__0__Impl rule__File__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__File__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__File__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__Group__0"


    // $ANTLR start "rule__File__Group__0__Impl"
    // InternalECFDL.g:260:1: rule__File__Group__0__Impl : ( 'listEcfd' ) ;
    public final void rule__File__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:264:1: ( ( 'listEcfd' ) )
            // InternalECFDL.g:265:1: ( 'listEcfd' )
            {
            // InternalECFDL.g:265:1: ( 'listEcfd' )
            // InternalECFDL.g:266:2: 'listEcfd'
            {
             before(grammarAccess.getFileAccess().getListEcfdKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getFileAccess().getListEcfdKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__Group__0__Impl"


    // $ANTLR start "rule__File__Group__1"
    // InternalECFDL.g:275:1: rule__File__Group__1 : rule__File__Group__1__Impl rule__File__Group__2 ;
    public final void rule__File__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:279:1: ( rule__File__Group__1__Impl rule__File__Group__2 )
            // InternalECFDL.g:280:2: rule__File__Group__1__Impl rule__File__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__File__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__File__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__Group__1"


    // $ANTLR start "rule__File__Group__1__Impl"
    // InternalECFDL.g:287:1: rule__File__Group__1__Impl : ( '{' ) ;
    public final void rule__File__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:291:1: ( ( '{' ) )
            // InternalECFDL.g:292:1: ( '{' )
            {
            // InternalECFDL.g:292:1: ( '{' )
            // InternalECFDL.g:293:2: '{'
            {
             before(grammarAccess.getFileAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getFileAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__Group__1__Impl"


    // $ANTLR start "rule__File__Group__2"
    // InternalECFDL.g:302:1: rule__File__Group__2 : rule__File__Group__2__Impl rule__File__Group__3 ;
    public final void rule__File__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:306:1: ( rule__File__Group__2__Impl rule__File__Group__3 )
            // InternalECFDL.g:307:2: rule__File__Group__2__Impl rule__File__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__File__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__File__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__Group__2"


    // $ANTLR start "rule__File__Group__2__Impl"
    // InternalECFDL.g:314:1: rule__File__Group__2__Impl : ( ( rule__File__EcfdAssignment_2 ) ) ;
    public final void rule__File__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:318:1: ( ( ( rule__File__EcfdAssignment_2 ) ) )
            // InternalECFDL.g:319:1: ( ( rule__File__EcfdAssignment_2 ) )
            {
            // InternalECFDL.g:319:1: ( ( rule__File__EcfdAssignment_2 ) )
            // InternalECFDL.g:320:2: ( rule__File__EcfdAssignment_2 )
            {
             before(grammarAccess.getFileAccess().getEcfdAssignment_2()); 
            // InternalECFDL.g:321:2: ( rule__File__EcfdAssignment_2 )
            // InternalECFDL.g:321:3: rule__File__EcfdAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__File__EcfdAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFileAccess().getEcfdAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__Group__2__Impl"


    // $ANTLR start "rule__File__Group__3"
    // InternalECFDL.g:329:1: rule__File__Group__3 : rule__File__Group__3__Impl rule__File__Group__4 ;
    public final void rule__File__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:333:1: ( rule__File__Group__3__Impl rule__File__Group__4 )
            // InternalECFDL.g:334:2: rule__File__Group__3__Impl rule__File__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__File__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__File__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__Group__3"


    // $ANTLR start "rule__File__Group__3__Impl"
    // InternalECFDL.g:341:1: rule__File__Group__3__Impl : ( ( rule__File__Group_3__0 )* ) ;
    public final void rule__File__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:345:1: ( ( ( rule__File__Group_3__0 )* ) )
            // InternalECFDL.g:346:1: ( ( rule__File__Group_3__0 )* )
            {
            // InternalECFDL.g:346:1: ( ( rule__File__Group_3__0 )* )
            // InternalECFDL.g:347:2: ( rule__File__Group_3__0 )*
            {
             before(grammarAccess.getFileAccess().getGroup_3()); 
            // InternalECFDL.g:348:2: ( rule__File__Group_3__0 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalECFDL.g:348:3: rule__File__Group_3__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__File__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getFileAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__Group__3__Impl"


    // $ANTLR start "rule__File__Group__4"
    // InternalECFDL.g:356:1: rule__File__Group__4 : rule__File__Group__4__Impl ;
    public final void rule__File__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:360:1: ( rule__File__Group__4__Impl )
            // InternalECFDL.g:361:2: rule__File__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__File__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__Group__4"


    // $ANTLR start "rule__File__Group__4__Impl"
    // InternalECFDL.g:367:1: rule__File__Group__4__Impl : ( '}' ) ;
    public final void rule__File__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:371:1: ( ( '}' ) )
            // InternalECFDL.g:372:1: ( '}' )
            {
            // InternalECFDL.g:372:1: ( '}' )
            // InternalECFDL.g:373:2: '}'
            {
             before(grammarAccess.getFileAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getFileAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__Group__4__Impl"


    // $ANTLR start "rule__File__Group_3__0"
    // InternalECFDL.g:383:1: rule__File__Group_3__0 : rule__File__Group_3__0__Impl rule__File__Group_3__1 ;
    public final void rule__File__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:387:1: ( rule__File__Group_3__0__Impl rule__File__Group_3__1 )
            // InternalECFDL.g:388:2: rule__File__Group_3__0__Impl rule__File__Group_3__1
            {
            pushFollow(FOLLOW_4);
            rule__File__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__File__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__Group_3__0"


    // $ANTLR start "rule__File__Group_3__0__Impl"
    // InternalECFDL.g:395:1: rule__File__Group_3__0__Impl : ( ',' ) ;
    public final void rule__File__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:399:1: ( ( ',' ) )
            // InternalECFDL.g:400:1: ( ',' )
            {
            // InternalECFDL.g:400:1: ( ',' )
            // InternalECFDL.g:401:2: ','
            {
             before(grammarAccess.getFileAccess().getCommaKeyword_3_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getFileAccess().getCommaKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__Group_3__0__Impl"


    // $ANTLR start "rule__File__Group_3__1"
    // InternalECFDL.g:410:1: rule__File__Group_3__1 : rule__File__Group_3__1__Impl ;
    public final void rule__File__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:414:1: ( rule__File__Group_3__1__Impl )
            // InternalECFDL.g:415:2: rule__File__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__File__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__Group_3__1"


    // $ANTLR start "rule__File__Group_3__1__Impl"
    // InternalECFDL.g:421:1: rule__File__Group_3__1__Impl : ( ( rule__File__EcfdAssignment_3_1 ) ) ;
    public final void rule__File__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:425:1: ( ( ( rule__File__EcfdAssignment_3_1 ) ) )
            // InternalECFDL.g:426:1: ( ( rule__File__EcfdAssignment_3_1 ) )
            {
            // InternalECFDL.g:426:1: ( ( rule__File__EcfdAssignment_3_1 ) )
            // InternalECFDL.g:427:2: ( rule__File__EcfdAssignment_3_1 )
            {
             before(grammarAccess.getFileAccess().getEcfdAssignment_3_1()); 
            // InternalECFDL.g:428:2: ( rule__File__EcfdAssignment_3_1 )
            // InternalECFDL.g:428:3: rule__File__EcfdAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__File__EcfdAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getFileAccess().getEcfdAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__Group_3__1__Impl"


    // $ANTLR start "rule__Ecfd__Group__0"
    // InternalECFDL.g:437:1: rule__Ecfd__Group__0 : rule__Ecfd__Group__0__Impl rule__Ecfd__Group__1 ;
    public final void rule__Ecfd__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:441:1: ( rule__Ecfd__Group__0__Impl rule__Ecfd__Group__1 )
            // InternalECFDL.g:442:2: rule__Ecfd__Group__0__Impl rule__Ecfd__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Ecfd__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ecfd__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ecfd__Group__0"


    // $ANTLR start "rule__Ecfd__Group__0__Impl"
    // InternalECFDL.g:449:1: rule__Ecfd__Group__0__Impl : ( () ) ;
    public final void rule__Ecfd__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:453:1: ( ( () ) )
            // InternalECFDL.g:454:1: ( () )
            {
            // InternalECFDL.g:454:1: ( () )
            // InternalECFDL.g:455:2: ()
            {
             before(grammarAccess.getEcfdAccess().getEcfdAction_0()); 
            // InternalECFDL.g:456:2: ()
            // InternalECFDL.g:456:3: 
            {
            }

             after(grammarAccess.getEcfdAccess().getEcfdAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ecfd__Group__0__Impl"


    // $ANTLR start "rule__Ecfd__Group__1"
    // InternalECFDL.g:464:1: rule__Ecfd__Group__1 : rule__Ecfd__Group__1__Impl rule__Ecfd__Group__2 ;
    public final void rule__Ecfd__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:468:1: ( rule__Ecfd__Group__1__Impl rule__Ecfd__Group__2 )
            // InternalECFDL.g:469:2: rule__Ecfd__Group__1__Impl rule__Ecfd__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Ecfd__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ecfd__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ecfd__Group__1"


    // $ANTLR start "rule__Ecfd__Group__1__Impl"
    // InternalECFDL.g:476:1: rule__Ecfd__Group__1__Impl : ( 'Ecfd' ) ;
    public final void rule__Ecfd__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:480:1: ( ( 'Ecfd' ) )
            // InternalECFDL.g:481:1: ( 'Ecfd' )
            {
            // InternalECFDL.g:481:1: ( 'Ecfd' )
            // InternalECFDL.g:482:2: 'Ecfd'
            {
             before(grammarAccess.getEcfdAccess().getEcfdKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getEcfdAccess().getEcfdKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ecfd__Group__1__Impl"


    // $ANTLR start "rule__Ecfd__Group__2"
    // InternalECFDL.g:491:1: rule__Ecfd__Group__2 : rule__Ecfd__Group__2__Impl rule__Ecfd__Group__3 ;
    public final void rule__Ecfd__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:495:1: ( rule__Ecfd__Group__2__Impl rule__Ecfd__Group__3 )
            // InternalECFDL.g:496:2: rule__Ecfd__Group__2__Impl rule__Ecfd__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__Ecfd__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ecfd__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ecfd__Group__2"


    // $ANTLR start "rule__Ecfd__Group__2__Impl"
    // InternalECFDL.g:503:1: rule__Ecfd__Group__2__Impl : ( ':' ) ;
    public final void rule__Ecfd__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:507:1: ( ( ':' ) )
            // InternalECFDL.g:508:1: ( ':' )
            {
            // InternalECFDL.g:508:1: ( ':' )
            // InternalECFDL.g:509:2: ':'
            {
             before(grammarAccess.getEcfdAccess().getColonKeyword_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getEcfdAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ecfd__Group__2__Impl"


    // $ANTLR start "rule__Ecfd__Group__3"
    // InternalECFDL.g:518:1: rule__Ecfd__Group__3 : rule__Ecfd__Group__3__Impl rule__Ecfd__Group__4 ;
    public final void rule__Ecfd__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:522:1: ( rule__Ecfd__Group__3__Impl rule__Ecfd__Group__4 )
            // InternalECFDL.g:523:2: rule__Ecfd__Group__3__Impl rule__Ecfd__Group__4
            {
            pushFollow(FOLLOW_3);
            rule__Ecfd__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ecfd__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ecfd__Group__3"


    // $ANTLR start "rule__Ecfd__Group__3__Impl"
    // InternalECFDL.g:530:1: rule__Ecfd__Group__3__Impl : ( ( rule__Ecfd__NameAssignment_3 ) ) ;
    public final void rule__Ecfd__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:534:1: ( ( ( rule__Ecfd__NameAssignment_3 ) ) )
            // InternalECFDL.g:535:1: ( ( rule__Ecfd__NameAssignment_3 ) )
            {
            // InternalECFDL.g:535:1: ( ( rule__Ecfd__NameAssignment_3 ) )
            // InternalECFDL.g:536:2: ( rule__Ecfd__NameAssignment_3 )
            {
             before(grammarAccess.getEcfdAccess().getNameAssignment_3()); 
            // InternalECFDL.g:537:2: ( rule__Ecfd__NameAssignment_3 )
            // InternalECFDL.g:537:3: rule__Ecfd__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Ecfd__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getEcfdAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ecfd__Group__3__Impl"


    // $ANTLR start "rule__Ecfd__Group__4"
    // InternalECFDL.g:545:1: rule__Ecfd__Group__4 : rule__Ecfd__Group__4__Impl rule__Ecfd__Group__5 ;
    public final void rule__Ecfd__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:549:1: ( rule__Ecfd__Group__4__Impl rule__Ecfd__Group__5 )
            // InternalECFDL.g:550:2: rule__Ecfd__Group__4__Impl rule__Ecfd__Group__5
            {
            pushFollow(FOLLOW_9);
            rule__Ecfd__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ecfd__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ecfd__Group__4"


    // $ANTLR start "rule__Ecfd__Group__4__Impl"
    // InternalECFDL.g:557:1: rule__Ecfd__Group__4__Impl : ( '{' ) ;
    public final void rule__Ecfd__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:561:1: ( ( '{' ) )
            // InternalECFDL.g:562:1: ( '{' )
            {
            // InternalECFDL.g:562:1: ( '{' )
            // InternalECFDL.g:563:2: '{'
            {
             before(grammarAccess.getEcfdAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getEcfdAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ecfd__Group__4__Impl"


    // $ANTLR start "rule__Ecfd__Group__5"
    // InternalECFDL.g:572:1: rule__Ecfd__Group__5 : rule__Ecfd__Group__5__Impl rule__Ecfd__Group__6 ;
    public final void rule__Ecfd__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:576:1: ( rule__Ecfd__Group__5__Impl rule__Ecfd__Group__6 )
            // InternalECFDL.g:577:2: rule__Ecfd__Group__5__Impl rule__Ecfd__Group__6
            {
            pushFollow(FOLLOW_10);
            rule__Ecfd__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ecfd__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ecfd__Group__5"


    // $ANTLR start "rule__Ecfd__Group__5__Impl"
    // InternalECFDL.g:584:1: rule__Ecfd__Group__5__Impl : ( ( rule__Ecfd__Group_5__0 ) ) ;
    public final void rule__Ecfd__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:588:1: ( ( ( rule__Ecfd__Group_5__0 ) ) )
            // InternalECFDL.g:589:1: ( ( rule__Ecfd__Group_5__0 ) )
            {
            // InternalECFDL.g:589:1: ( ( rule__Ecfd__Group_5__0 ) )
            // InternalECFDL.g:590:2: ( rule__Ecfd__Group_5__0 )
            {
             before(grammarAccess.getEcfdAccess().getGroup_5()); 
            // InternalECFDL.g:591:2: ( rule__Ecfd__Group_5__0 )
            // InternalECFDL.g:591:3: rule__Ecfd__Group_5__0
            {
            pushFollow(FOLLOW_2);
            rule__Ecfd__Group_5__0();

            state._fsp--;


            }

             after(grammarAccess.getEcfdAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ecfd__Group__5__Impl"


    // $ANTLR start "rule__Ecfd__Group__6"
    // InternalECFDL.g:599:1: rule__Ecfd__Group__6 : rule__Ecfd__Group__6__Impl rule__Ecfd__Group__7 ;
    public final void rule__Ecfd__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:603:1: ( rule__Ecfd__Group__6__Impl rule__Ecfd__Group__7 )
            // InternalECFDL.g:604:2: rule__Ecfd__Group__6__Impl rule__Ecfd__Group__7
            {
            pushFollow(FOLLOW_10);
            rule__Ecfd__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ecfd__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ecfd__Group__6"


    // $ANTLR start "rule__Ecfd__Group__6__Impl"
    // InternalECFDL.g:611:1: rule__Ecfd__Group__6__Impl : ( ( rule__Ecfd__Group_6__0 )? ) ;
    public final void rule__Ecfd__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:615:1: ( ( ( rule__Ecfd__Group_6__0 )? ) )
            // InternalECFDL.g:616:1: ( ( rule__Ecfd__Group_6__0 )? )
            {
            // InternalECFDL.g:616:1: ( ( rule__Ecfd__Group_6__0 )? )
            // InternalECFDL.g:617:2: ( rule__Ecfd__Group_6__0 )?
            {
             before(grammarAccess.getEcfdAccess().getGroup_6()); 
            // InternalECFDL.g:618:2: ( rule__Ecfd__Group_6__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==18) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalECFDL.g:618:3: rule__Ecfd__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Ecfd__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEcfdAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ecfd__Group__6__Impl"


    // $ANTLR start "rule__Ecfd__Group__7"
    // InternalECFDL.g:626:1: rule__Ecfd__Group__7 : rule__Ecfd__Group__7__Impl rule__Ecfd__Group__8 ;
    public final void rule__Ecfd__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:630:1: ( rule__Ecfd__Group__7__Impl rule__Ecfd__Group__8 )
            // InternalECFDL.g:631:2: rule__Ecfd__Group__7__Impl rule__Ecfd__Group__8
            {
            pushFollow(FOLLOW_10);
            rule__Ecfd__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ecfd__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ecfd__Group__7"


    // $ANTLR start "rule__Ecfd__Group__7__Impl"
    // InternalECFDL.g:638:1: rule__Ecfd__Group__7__Impl : ( ( rule__Ecfd__Group_7__0 )? ) ;
    public final void rule__Ecfd__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:642:1: ( ( ( rule__Ecfd__Group_7__0 )? ) )
            // InternalECFDL.g:643:1: ( ( rule__Ecfd__Group_7__0 )? )
            {
            // InternalECFDL.g:643:1: ( ( rule__Ecfd__Group_7__0 )? )
            // InternalECFDL.g:644:2: ( rule__Ecfd__Group_7__0 )?
            {
             before(grammarAccess.getEcfdAccess().getGroup_7()); 
            // InternalECFDL.g:645:2: ( rule__Ecfd__Group_7__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==19) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalECFDL.g:645:3: rule__Ecfd__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Ecfd__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEcfdAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ecfd__Group__7__Impl"


    // $ANTLR start "rule__Ecfd__Group__8"
    // InternalECFDL.g:653:1: rule__Ecfd__Group__8 : rule__Ecfd__Group__8__Impl ;
    public final void rule__Ecfd__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:657:1: ( rule__Ecfd__Group__8__Impl )
            // InternalECFDL.g:658:2: rule__Ecfd__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Ecfd__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ecfd__Group__8"


    // $ANTLR start "rule__Ecfd__Group__8__Impl"
    // InternalECFDL.g:664:1: rule__Ecfd__Group__8__Impl : ( '}' ) ;
    public final void rule__Ecfd__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:668:1: ( ( '}' ) )
            // InternalECFDL.g:669:1: ( '}' )
            {
            // InternalECFDL.g:669:1: ( '}' )
            // InternalECFDL.g:670:2: '}'
            {
             before(grammarAccess.getEcfdAccess().getRightCurlyBracketKeyword_8()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getEcfdAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ecfd__Group__8__Impl"


    // $ANTLR start "rule__Ecfd__Group_5__0"
    // InternalECFDL.g:680:1: rule__Ecfd__Group_5__0 : rule__Ecfd__Group_5__0__Impl rule__Ecfd__Group_5__1 ;
    public final void rule__Ecfd__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:684:1: ( rule__Ecfd__Group_5__0__Impl rule__Ecfd__Group_5__1 )
            // InternalECFDL.g:685:2: rule__Ecfd__Group_5__0__Impl rule__Ecfd__Group_5__1
            {
            pushFollow(FOLLOW_3);
            rule__Ecfd__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ecfd__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ecfd__Group_5__0"


    // $ANTLR start "rule__Ecfd__Group_5__0__Impl"
    // InternalECFDL.g:692:1: rule__Ecfd__Group_5__0__Impl : ( 'boxes' ) ;
    public final void rule__Ecfd__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:696:1: ( ( 'boxes' ) )
            // InternalECFDL.g:697:1: ( 'boxes' )
            {
            // InternalECFDL.g:697:1: ( 'boxes' )
            // InternalECFDL.g:698:2: 'boxes'
            {
             before(grammarAccess.getEcfdAccess().getBoxesKeyword_5_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getEcfdAccess().getBoxesKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ecfd__Group_5__0__Impl"


    // $ANTLR start "rule__Ecfd__Group_5__1"
    // InternalECFDL.g:707:1: rule__Ecfd__Group_5__1 : rule__Ecfd__Group_5__1__Impl rule__Ecfd__Group_5__2 ;
    public final void rule__Ecfd__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:711:1: ( rule__Ecfd__Group_5__1__Impl rule__Ecfd__Group_5__2 )
            // InternalECFDL.g:712:2: rule__Ecfd__Group_5__1__Impl rule__Ecfd__Group_5__2
            {
            pushFollow(FOLLOW_11);
            rule__Ecfd__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ecfd__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ecfd__Group_5__1"


    // $ANTLR start "rule__Ecfd__Group_5__1__Impl"
    // InternalECFDL.g:719:1: rule__Ecfd__Group_5__1__Impl : ( '{' ) ;
    public final void rule__Ecfd__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:723:1: ( ( '{' ) )
            // InternalECFDL.g:724:1: ( '{' )
            {
            // InternalECFDL.g:724:1: ( '{' )
            // InternalECFDL.g:725:2: '{'
            {
             before(grammarAccess.getEcfdAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getEcfdAccess().getLeftCurlyBracketKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ecfd__Group_5__1__Impl"


    // $ANTLR start "rule__Ecfd__Group_5__2"
    // InternalECFDL.g:734:1: rule__Ecfd__Group_5__2 : rule__Ecfd__Group_5__2__Impl rule__Ecfd__Group_5__3 ;
    public final void rule__Ecfd__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:738:1: ( rule__Ecfd__Group_5__2__Impl rule__Ecfd__Group_5__3 )
            // InternalECFDL.g:739:2: rule__Ecfd__Group_5__2__Impl rule__Ecfd__Group_5__3
            {
            pushFollow(FOLLOW_5);
            rule__Ecfd__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ecfd__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ecfd__Group_5__2"


    // $ANTLR start "rule__Ecfd__Group_5__2__Impl"
    // InternalECFDL.g:746:1: rule__Ecfd__Group_5__2__Impl : ( ( rule__Ecfd__BoxesAssignment_5_2 ) ) ;
    public final void rule__Ecfd__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:750:1: ( ( ( rule__Ecfd__BoxesAssignment_5_2 ) ) )
            // InternalECFDL.g:751:1: ( ( rule__Ecfd__BoxesAssignment_5_2 ) )
            {
            // InternalECFDL.g:751:1: ( ( rule__Ecfd__BoxesAssignment_5_2 ) )
            // InternalECFDL.g:752:2: ( rule__Ecfd__BoxesAssignment_5_2 )
            {
             before(grammarAccess.getEcfdAccess().getBoxesAssignment_5_2()); 
            // InternalECFDL.g:753:2: ( rule__Ecfd__BoxesAssignment_5_2 )
            // InternalECFDL.g:753:3: rule__Ecfd__BoxesAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__Ecfd__BoxesAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getEcfdAccess().getBoxesAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ecfd__Group_5__2__Impl"


    // $ANTLR start "rule__Ecfd__Group_5__3"
    // InternalECFDL.g:761:1: rule__Ecfd__Group_5__3 : rule__Ecfd__Group_5__3__Impl rule__Ecfd__Group_5__4 ;
    public final void rule__Ecfd__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:765:1: ( rule__Ecfd__Group_5__3__Impl rule__Ecfd__Group_5__4 )
            // InternalECFDL.g:766:2: rule__Ecfd__Group_5__3__Impl rule__Ecfd__Group_5__4
            {
            pushFollow(FOLLOW_5);
            rule__Ecfd__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ecfd__Group_5__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ecfd__Group_5__3"


    // $ANTLR start "rule__Ecfd__Group_5__3__Impl"
    // InternalECFDL.g:773:1: rule__Ecfd__Group_5__3__Impl : ( ( rule__Ecfd__Group_5_3__0 )* ) ;
    public final void rule__Ecfd__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:777:1: ( ( ( rule__Ecfd__Group_5_3__0 )* ) )
            // InternalECFDL.g:778:1: ( ( rule__Ecfd__Group_5_3__0 )* )
            {
            // InternalECFDL.g:778:1: ( ( rule__Ecfd__Group_5_3__0 )* )
            // InternalECFDL.g:779:2: ( rule__Ecfd__Group_5_3__0 )*
            {
             before(grammarAccess.getEcfdAccess().getGroup_5_3()); 
            // InternalECFDL.g:780:2: ( rule__Ecfd__Group_5_3__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==14) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalECFDL.g:780:3: rule__Ecfd__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Ecfd__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getEcfdAccess().getGroup_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ecfd__Group_5__3__Impl"


    // $ANTLR start "rule__Ecfd__Group_5__4"
    // InternalECFDL.g:788:1: rule__Ecfd__Group_5__4 : rule__Ecfd__Group_5__4__Impl ;
    public final void rule__Ecfd__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:792:1: ( rule__Ecfd__Group_5__4__Impl )
            // InternalECFDL.g:793:2: rule__Ecfd__Group_5__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Ecfd__Group_5__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ecfd__Group_5__4"


    // $ANTLR start "rule__Ecfd__Group_5__4__Impl"
    // InternalECFDL.g:799:1: rule__Ecfd__Group_5__4__Impl : ( '}' ) ;
    public final void rule__Ecfd__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:803:1: ( ( '}' ) )
            // InternalECFDL.g:804:1: ( '}' )
            {
            // InternalECFDL.g:804:1: ( '}' )
            // InternalECFDL.g:805:2: '}'
            {
             before(grammarAccess.getEcfdAccess().getRightCurlyBracketKeyword_5_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getEcfdAccess().getRightCurlyBracketKeyword_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ecfd__Group_5__4__Impl"


    // $ANTLR start "rule__Ecfd__Group_5_3__0"
    // InternalECFDL.g:815:1: rule__Ecfd__Group_5_3__0 : rule__Ecfd__Group_5_3__0__Impl rule__Ecfd__Group_5_3__1 ;
    public final void rule__Ecfd__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:819:1: ( rule__Ecfd__Group_5_3__0__Impl rule__Ecfd__Group_5_3__1 )
            // InternalECFDL.g:820:2: rule__Ecfd__Group_5_3__0__Impl rule__Ecfd__Group_5_3__1
            {
            pushFollow(FOLLOW_11);
            rule__Ecfd__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ecfd__Group_5_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ecfd__Group_5_3__0"


    // $ANTLR start "rule__Ecfd__Group_5_3__0__Impl"
    // InternalECFDL.g:827:1: rule__Ecfd__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__Ecfd__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:831:1: ( ( ',' ) )
            // InternalECFDL.g:832:1: ( ',' )
            {
            // InternalECFDL.g:832:1: ( ',' )
            // InternalECFDL.g:833:2: ','
            {
             before(grammarAccess.getEcfdAccess().getCommaKeyword_5_3_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getEcfdAccess().getCommaKeyword_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ecfd__Group_5_3__0__Impl"


    // $ANTLR start "rule__Ecfd__Group_5_3__1"
    // InternalECFDL.g:842:1: rule__Ecfd__Group_5_3__1 : rule__Ecfd__Group_5_3__1__Impl ;
    public final void rule__Ecfd__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:846:1: ( rule__Ecfd__Group_5_3__1__Impl )
            // InternalECFDL.g:847:2: rule__Ecfd__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Ecfd__Group_5_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ecfd__Group_5_3__1"


    // $ANTLR start "rule__Ecfd__Group_5_3__1__Impl"
    // InternalECFDL.g:853:1: rule__Ecfd__Group_5_3__1__Impl : ( ( rule__Ecfd__BoxesAssignment_5_3_1 ) ) ;
    public final void rule__Ecfd__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:857:1: ( ( ( rule__Ecfd__BoxesAssignment_5_3_1 ) ) )
            // InternalECFDL.g:858:1: ( ( rule__Ecfd__BoxesAssignment_5_3_1 ) )
            {
            // InternalECFDL.g:858:1: ( ( rule__Ecfd__BoxesAssignment_5_3_1 ) )
            // InternalECFDL.g:859:2: ( rule__Ecfd__BoxesAssignment_5_3_1 )
            {
             before(grammarAccess.getEcfdAccess().getBoxesAssignment_5_3_1()); 
            // InternalECFDL.g:860:2: ( rule__Ecfd__BoxesAssignment_5_3_1 )
            // InternalECFDL.g:860:3: rule__Ecfd__BoxesAssignment_5_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Ecfd__BoxesAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getEcfdAccess().getBoxesAssignment_5_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ecfd__Group_5_3__1__Impl"


    // $ANTLR start "rule__Ecfd__Group_6__0"
    // InternalECFDL.g:869:1: rule__Ecfd__Group_6__0 : rule__Ecfd__Group_6__0__Impl rule__Ecfd__Group_6__1 ;
    public final void rule__Ecfd__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:873:1: ( rule__Ecfd__Group_6__0__Impl rule__Ecfd__Group_6__1 )
            // InternalECFDL.g:874:2: rule__Ecfd__Group_6__0__Impl rule__Ecfd__Group_6__1
            {
            pushFollow(FOLLOW_3);
            rule__Ecfd__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ecfd__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ecfd__Group_6__0"


    // $ANTLR start "rule__Ecfd__Group_6__0__Impl"
    // InternalECFDL.g:881:1: rule__Ecfd__Group_6__0__Impl : ( 'groups' ) ;
    public final void rule__Ecfd__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:885:1: ( ( 'groups' ) )
            // InternalECFDL.g:886:1: ( 'groups' )
            {
            // InternalECFDL.g:886:1: ( 'groups' )
            // InternalECFDL.g:887:2: 'groups'
            {
             before(grammarAccess.getEcfdAccess().getGroupsKeyword_6_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getEcfdAccess().getGroupsKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ecfd__Group_6__0__Impl"


    // $ANTLR start "rule__Ecfd__Group_6__1"
    // InternalECFDL.g:896:1: rule__Ecfd__Group_6__1 : rule__Ecfd__Group_6__1__Impl rule__Ecfd__Group_6__2 ;
    public final void rule__Ecfd__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:900:1: ( rule__Ecfd__Group_6__1__Impl rule__Ecfd__Group_6__2 )
            // InternalECFDL.g:901:2: rule__Ecfd__Group_6__1__Impl rule__Ecfd__Group_6__2
            {
            pushFollow(FOLLOW_12);
            rule__Ecfd__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ecfd__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ecfd__Group_6__1"


    // $ANTLR start "rule__Ecfd__Group_6__1__Impl"
    // InternalECFDL.g:908:1: rule__Ecfd__Group_6__1__Impl : ( '{' ) ;
    public final void rule__Ecfd__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:912:1: ( ( '{' ) )
            // InternalECFDL.g:913:1: ( '{' )
            {
            // InternalECFDL.g:913:1: ( '{' )
            // InternalECFDL.g:914:2: '{'
            {
             before(grammarAccess.getEcfdAccess().getLeftCurlyBracketKeyword_6_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getEcfdAccess().getLeftCurlyBracketKeyword_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ecfd__Group_6__1__Impl"


    // $ANTLR start "rule__Ecfd__Group_6__2"
    // InternalECFDL.g:923:1: rule__Ecfd__Group_6__2 : rule__Ecfd__Group_6__2__Impl rule__Ecfd__Group_6__3 ;
    public final void rule__Ecfd__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:927:1: ( rule__Ecfd__Group_6__2__Impl rule__Ecfd__Group_6__3 )
            // InternalECFDL.g:928:2: rule__Ecfd__Group_6__2__Impl rule__Ecfd__Group_6__3
            {
            pushFollow(FOLLOW_5);
            rule__Ecfd__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ecfd__Group_6__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ecfd__Group_6__2"


    // $ANTLR start "rule__Ecfd__Group_6__2__Impl"
    // InternalECFDL.g:935:1: rule__Ecfd__Group_6__2__Impl : ( ( rule__Ecfd__GroupsAssignment_6_2 ) ) ;
    public final void rule__Ecfd__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:939:1: ( ( ( rule__Ecfd__GroupsAssignment_6_2 ) ) )
            // InternalECFDL.g:940:1: ( ( rule__Ecfd__GroupsAssignment_6_2 ) )
            {
            // InternalECFDL.g:940:1: ( ( rule__Ecfd__GroupsAssignment_6_2 ) )
            // InternalECFDL.g:941:2: ( rule__Ecfd__GroupsAssignment_6_2 )
            {
             before(grammarAccess.getEcfdAccess().getGroupsAssignment_6_2()); 
            // InternalECFDL.g:942:2: ( rule__Ecfd__GroupsAssignment_6_2 )
            // InternalECFDL.g:942:3: rule__Ecfd__GroupsAssignment_6_2
            {
            pushFollow(FOLLOW_2);
            rule__Ecfd__GroupsAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getEcfdAccess().getGroupsAssignment_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ecfd__Group_6__2__Impl"


    // $ANTLR start "rule__Ecfd__Group_6__3"
    // InternalECFDL.g:950:1: rule__Ecfd__Group_6__3 : rule__Ecfd__Group_6__3__Impl rule__Ecfd__Group_6__4 ;
    public final void rule__Ecfd__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:954:1: ( rule__Ecfd__Group_6__3__Impl rule__Ecfd__Group_6__4 )
            // InternalECFDL.g:955:2: rule__Ecfd__Group_6__3__Impl rule__Ecfd__Group_6__4
            {
            pushFollow(FOLLOW_5);
            rule__Ecfd__Group_6__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ecfd__Group_6__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ecfd__Group_6__3"


    // $ANTLR start "rule__Ecfd__Group_6__3__Impl"
    // InternalECFDL.g:962:1: rule__Ecfd__Group_6__3__Impl : ( ( rule__Ecfd__Group_6_3__0 )* ) ;
    public final void rule__Ecfd__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:966:1: ( ( ( rule__Ecfd__Group_6_3__0 )* ) )
            // InternalECFDL.g:967:1: ( ( rule__Ecfd__Group_6_3__0 )* )
            {
            // InternalECFDL.g:967:1: ( ( rule__Ecfd__Group_6_3__0 )* )
            // InternalECFDL.g:968:2: ( rule__Ecfd__Group_6_3__0 )*
            {
             before(grammarAccess.getEcfdAccess().getGroup_6_3()); 
            // InternalECFDL.g:969:2: ( rule__Ecfd__Group_6_3__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==14) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalECFDL.g:969:3: rule__Ecfd__Group_6_3__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Ecfd__Group_6_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getEcfdAccess().getGroup_6_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ecfd__Group_6__3__Impl"


    // $ANTLR start "rule__Ecfd__Group_6__4"
    // InternalECFDL.g:977:1: rule__Ecfd__Group_6__4 : rule__Ecfd__Group_6__4__Impl ;
    public final void rule__Ecfd__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:981:1: ( rule__Ecfd__Group_6__4__Impl )
            // InternalECFDL.g:982:2: rule__Ecfd__Group_6__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Ecfd__Group_6__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ecfd__Group_6__4"


    // $ANTLR start "rule__Ecfd__Group_6__4__Impl"
    // InternalECFDL.g:988:1: rule__Ecfd__Group_6__4__Impl : ( '}' ) ;
    public final void rule__Ecfd__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:992:1: ( ( '}' ) )
            // InternalECFDL.g:993:1: ( '}' )
            {
            // InternalECFDL.g:993:1: ( '}' )
            // InternalECFDL.g:994:2: '}'
            {
             before(grammarAccess.getEcfdAccess().getRightCurlyBracketKeyword_6_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getEcfdAccess().getRightCurlyBracketKeyword_6_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ecfd__Group_6__4__Impl"


    // $ANTLR start "rule__Ecfd__Group_6_3__0"
    // InternalECFDL.g:1004:1: rule__Ecfd__Group_6_3__0 : rule__Ecfd__Group_6_3__0__Impl rule__Ecfd__Group_6_3__1 ;
    public final void rule__Ecfd__Group_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:1008:1: ( rule__Ecfd__Group_6_3__0__Impl rule__Ecfd__Group_6_3__1 )
            // InternalECFDL.g:1009:2: rule__Ecfd__Group_6_3__0__Impl rule__Ecfd__Group_6_3__1
            {
            pushFollow(FOLLOW_12);
            rule__Ecfd__Group_6_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ecfd__Group_6_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ecfd__Group_6_3__0"


    // $ANTLR start "rule__Ecfd__Group_6_3__0__Impl"
    // InternalECFDL.g:1016:1: rule__Ecfd__Group_6_3__0__Impl : ( ',' ) ;
    public final void rule__Ecfd__Group_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:1020:1: ( ( ',' ) )
            // InternalECFDL.g:1021:1: ( ',' )
            {
            // InternalECFDL.g:1021:1: ( ',' )
            // InternalECFDL.g:1022:2: ','
            {
             before(grammarAccess.getEcfdAccess().getCommaKeyword_6_3_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getEcfdAccess().getCommaKeyword_6_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ecfd__Group_6_3__0__Impl"


    // $ANTLR start "rule__Ecfd__Group_6_3__1"
    // InternalECFDL.g:1031:1: rule__Ecfd__Group_6_3__1 : rule__Ecfd__Group_6_3__1__Impl ;
    public final void rule__Ecfd__Group_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:1035:1: ( rule__Ecfd__Group_6_3__1__Impl )
            // InternalECFDL.g:1036:2: rule__Ecfd__Group_6_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Ecfd__Group_6_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ecfd__Group_6_3__1"


    // $ANTLR start "rule__Ecfd__Group_6_3__1__Impl"
    // InternalECFDL.g:1042:1: rule__Ecfd__Group_6_3__1__Impl : ( ( rule__Ecfd__BoxesAssignment_6_3_1 ) ) ;
    public final void rule__Ecfd__Group_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:1046:1: ( ( ( rule__Ecfd__BoxesAssignment_6_3_1 ) ) )
            // InternalECFDL.g:1047:1: ( ( rule__Ecfd__BoxesAssignment_6_3_1 ) )
            {
            // InternalECFDL.g:1047:1: ( ( rule__Ecfd__BoxesAssignment_6_3_1 ) )
            // InternalECFDL.g:1048:2: ( rule__Ecfd__BoxesAssignment_6_3_1 )
            {
             before(grammarAccess.getEcfdAccess().getBoxesAssignment_6_3_1()); 
            // InternalECFDL.g:1049:2: ( rule__Ecfd__BoxesAssignment_6_3_1 )
            // InternalECFDL.g:1049:3: rule__Ecfd__BoxesAssignment_6_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Ecfd__BoxesAssignment_6_3_1();

            state._fsp--;


            }

             after(grammarAccess.getEcfdAccess().getBoxesAssignment_6_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ecfd__Group_6_3__1__Impl"


    // $ANTLR start "rule__Ecfd__Group_7__0"
    // InternalECFDL.g:1058:1: rule__Ecfd__Group_7__0 : rule__Ecfd__Group_7__0__Impl rule__Ecfd__Group_7__1 ;
    public final void rule__Ecfd__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:1062:1: ( rule__Ecfd__Group_7__0__Impl rule__Ecfd__Group_7__1 )
            // InternalECFDL.g:1063:2: rule__Ecfd__Group_7__0__Impl rule__Ecfd__Group_7__1
            {
            pushFollow(FOLLOW_3);
            rule__Ecfd__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ecfd__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ecfd__Group_7__0"


    // $ANTLR start "rule__Ecfd__Group_7__0__Impl"
    // InternalECFDL.g:1070:1: rule__Ecfd__Group_7__0__Impl : ( 'mutex' ) ;
    public final void rule__Ecfd__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:1074:1: ( ( 'mutex' ) )
            // InternalECFDL.g:1075:1: ( 'mutex' )
            {
            // InternalECFDL.g:1075:1: ( 'mutex' )
            // InternalECFDL.g:1076:2: 'mutex'
            {
             before(grammarAccess.getEcfdAccess().getMutexKeyword_7_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getEcfdAccess().getMutexKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ecfd__Group_7__0__Impl"


    // $ANTLR start "rule__Ecfd__Group_7__1"
    // InternalECFDL.g:1085:1: rule__Ecfd__Group_7__1 : rule__Ecfd__Group_7__1__Impl rule__Ecfd__Group_7__2 ;
    public final void rule__Ecfd__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:1089:1: ( rule__Ecfd__Group_7__1__Impl rule__Ecfd__Group_7__2 )
            // InternalECFDL.g:1090:2: rule__Ecfd__Group_7__1__Impl rule__Ecfd__Group_7__2
            {
            pushFollow(FOLLOW_13);
            rule__Ecfd__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ecfd__Group_7__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ecfd__Group_7__1"


    // $ANTLR start "rule__Ecfd__Group_7__1__Impl"
    // InternalECFDL.g:1097:1: rule__Ecfd__Group_7__1__Impl : ( '{' ) ;
    public final void rule__Ecfd__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:1101:1: ( ( '{' ) )
            // InternalECFDL.g:1102:1: ( '{' )
            {
            // InternalECFDL.g:1102:1: ( '{' )
            // InternalECFDL.g:1103:2: '{'
            {
             before(grammarAccess.getEcfdAccess().getLeftCurlyBracketKeyword_7_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getEcfdAccess().getLeftCurlyBracketKeyword_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ecfd__Group_7__1__Impl"


    // $ANTLR start "rule__Ecfd__Group_7__2"
    // InternalECFDL.g:1112:1: rule__Ecfd__Group_7__2 : rule__Ecfd__Group_7__2__Impl rule__Ecfd__Group_7__3 ;
    public final void rule__Ecfd__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:1116:1: ( rule__Ecfd__Group_7__2__Impl rule__Ecfd__Group_7__3 )
            // InternalECFDL.g:1117:2: rule__Ecfd__Group_7__2__Impl rule__Ecfd__Group_7__3
            {
            pushFollow(FOLLOW_13);
            rule__Ecfd__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ecfd__Group_7__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ecfd__Group_7__2"


    // $ANTLR start "rule__Ecfd__Group_7__2__Impl"
    // InternalECFDL.g:1124:1: rule__Ecfd__Group_7__2__Impl : ( ( rule__Ecfd__Group_7_2__0 )? ) ;
    public final void rule__Ecfd__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:1128:1: ( ( ( rule__Ecfd__Group_7_2__0 )? ) )
            // InternalECFDL.g:1129:1: ( ( rule__Ecfd__Group_7_2__0 )? )
            {
            // InternalECFDL.g:1129:1: ( ( rule__Ecfd__Group_7_2__0 )? )
            // InternalECFDL.g:1130:2: ( rule__Ecfd__Group_7_2__0 )?
            {
             before(grammarAccess.getEcfdAccess().getGroup_7_2()); 
            // InternalECFDL.g:1131:2: ( rule__Ecfd__Group_7_2__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalECFDL.g:1131:3: rule__Ecfd__Group_7_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Ecfd__Group_7_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEcfdAccess().getGroup_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ecfd__Group_7__2__Impl"


    // $ANTLR start "rule__Ecfd__Group_7__3"
    // InternalECFDL.g:1139:1: rule__Ecfd__Group_7__3 : rule__Ecfd__Group_7__3__Impl ;
    public final void rule__Ecfd__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:1143:1: ( rule__Ecfd__Group_7__3__Impl )
            // InternalECFDL.g:1144:2: rule__Ecfd__Group_7__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Ecfd__Group_7__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ecfd__Group_7__3"


    // $ANTLR start "rule__Ecfd__Group_7__3__Impl"
    // InternalECFDL.g:1150:1: rule__Ecfd__Group_7__3__Impl : ( '}' ) ;
    public final void rule__Ecfd__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:1154:1: ( ( '}' ) )
            // InternalECFDL.g:1155:1: ( '}' )
            {
            // InternalECFDL.g:1155:1: ( '}' )
            // InternalECFDL.g:1156:2: '}'
            {
             before(grammarAccess.getEcfdAccess().getRightCurlyBracketKeyword_7_3()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getEcfdAccess().getRightCurlyBracketKeyword_7_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ecfd__Group_7__3__Impl"


    // $ANTLR start "rule__Ecfd__Group_7_2__0"
    // InternalECFDL.g:1166:1: rule__Ecfd__Group_7_2__0 : rule__Ecfd__Group_7_2__0__Impl rule__Ecfd__Group_7_2__1 ;
    public final void rule__Ecfd__Group_7_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:1170:1: ( rule__Ecfd__Group_7_2__0__Impl rule__Ecfd__Group_7_2__1 )
            // InternalECFDL.g:1171:2: rule__Ecfd__Group_7_2__0__Impl rule__Ecfd__Group_7_2__1
            {
            pushFollow(FOLLOW_14);
            rule__Ecfd__Group_7_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ecfd__Group_7_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ecfd__Group_7_2__0"


    // $ANTLR start "rule__Ecfd__Group_7_2__0__Impl"
    // InternalECFDL.g:1178:1: rule__Ecfd__Group_7_2__0__Impl : ( ( rule__Ecfd__MutexAssignment_7_2_0 ) ) ;
    public final void rule__Ecfd__Group_7_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:1182:1: ( ( ( rule__Ecfd__MutexAssignment_7_2_0 ) ) )
            // InternalECFDL.g:1183:1: ( ( rule__Ecfd__MutexAssignment_7_2_0 ) )
            {
            // InternalECFDL.g:1183:1: ( ( rule__Ecfd__MutexAssignment_7_2_0 ) )
            // InternalECFDL.g:1184:2: ( rule__Ecfd__MutexAssignment_7_2_0 )
            {
             before(grammarAccess.getEcfdAccess().getMutexAssignment_7_2_0()); 
            // InternalECFDL.g:1185:2: ( rule__Ecfd__MutexAssignment_7_2_0 )
            // InternalECFDL.g:1185:3: rule__Ecfd__MutexAssignment_7_2_0
            {
            pushFollow(FOLLOW_2);
            rule__Ecfd__MutexAssignment_7_2_0();

            state._fsp--;


            }

             after(grammarAccess.getEcfdAccess().getMutexAssignment_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ecfd__Group_7_2__0__Impl"


    // $ANTLR start "rule__Ecfd__Group_7_2__1"
    // InternalECFDL.g:1193:1: rule__Ecfd__Group_7_2__1 : rule__Ecfd__Group_7_2__1__Impl ;
    public final void rule__Ecfd__Group_7_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:1197:1: ( rule__Ecfd__Group_7_2__1__Impl )
            // InternalECFDL.g:1198:2: rule__Ecfd__Group_7_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Ecfd__Group_7_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ecfd__Group_7_2__1"


    // $ANTLR start "rule__Ecfd__Group_7_2__1__Impl"
    // InternalECFDL.g:1204:1: rule__Ecfd__Group_7_2__1__Impl : ( ( rule__Ecfd__Group_7_2_1__0 )* ) ;
    public final void rule__Ecfd__Group_7_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:1208:1: ( ( ( rule__Ecfd__Group_7_2_1__0 )* ) )
            // InternalECFDL.g:1209:1: ( ( rule__Ecfd__Group_7_2_1__0 )* )
            {
            // InternalECFDL.g:1209:1: ( ( rule__Ecfd__Group_7_2_1__0 )* )
            // InternalECFDL.g:1210:2: ( rule__Ecfd__Group_7_2_1__0 )*
            {
             before(grammarAccess.getEcfdAccess().getGroup_7_2_1()); 
            // InternalECFDL.g:1211:2: ( rule__Ecfd__Group_7_2_1__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==14) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalECFDL.g:1211:3: rule__Ecfd__Group_7_2_1__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Ecfd__Group_7_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getEcfdAccess().getGroup_7_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ecfd__Group_7_2__1__Impl"


    // $ANTLR start "rule__Ecfd__Group_7_2_1__0"
    // InternalECFDL.g:1220:1: rule__Ecfd__Group_7_2_1__0 : rule__Ecfd__Group_7_2_1__0__Impl rule__Ecfd__Group_7_2_1__1 ;
    public final void rule__Ecfd__Group_7_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:1224:1: ( rule__Ecfd__Group_7_2_1__0__Impl rule__Ecfd__Group_7_2_1__1 )
            // InternalECFDL.g:1225:2: rule__Ecfd__Group_7_2_1__0__Impl rule__Ecfd__Group_7_2_1__1
            {
            pushFollow(FOLLOW_15);
            rule__Ecfd__Group_7_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ecfd__Group_7_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ecfd__Group_7_2_1__0"


    // $ANTLR start "rule__Ecfd__Group_7_2_1__0__Impl"
    // InternalECFDL.g:1232:1: rule__Ecfd__Group_7_2_1__0__Impl : ( ',' ) ;
    public final void rule__Ecfd__Group_7_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:1236:1: ( ( ',' ) )
            // InternalECFDL.g:1237:1: ( ',' )
            {
            // InternalECFDL.g:1237:1: ( ',' )
            // InternalECFDL.g:1238:2: ','
            {
             before(grammarAccess.getEcfdAccess().getCommaKeyword_7_2_1_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getEcfdAccess().getCommaKeyword_7_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ecfd__Group_7_2_1__0__Impl"


    // $ANTLR start "rule__Ecfd__Group_7_2_1__1"
    // InternalECFDL.g:1247:1: rule__Ecfd__Group_7_2_1__1 : rule__Ecfd__Group_7_2_1__1__Impl ;
    public final void rule__Ecfd__Group_7_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:1251:1: ( rule__Ecfd__Group_7_2_1__1__Impl )
            // InternalECFDL.g:1252:2: rule__Ecfd__Group_7_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Ecfd__Group_7_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ecfd__Group_7_2_1__1"


    // $ANTLR start "rule__Ecfd__Group_7_2_1__1__Impl"
    // InternalECFDL.g:1258:1: rule__Ecfd__Group_7_2_1__1__Impl : ( ( rule__Ecfd__MutexAssignment_7_2_1_1 ) ) ;
    public final void rule__Ecfd__Group_7_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:1262:1: ( ( ( rule__Ecfd__MutexAssignment_7_2_1_1 ) ) )
            // InternalECFDL.g:1263:1: ( ( rule__Ecfd__MutexAssignment_7_2_1_1 ) )
            {
            // InternalECFDL.g:1263:1: ( ( rule__Ecfd__MutexAssignment_7_2_1_1 ) )
            // InternalECFDL.g:1264:2: ( rule__Ecfd__MutexAssignment_7_2_1_1 )
            {
             before(grammarAccess.getEcfdAccess().getMutexAssignment_7_2_1_1()); 
            // InternalECFDL.g:1265:2: ( rule__Ecfd__MutexAssignment_7_2_1_1 )
            // InternalECFDL.g:1265:3: rule__Ecfd__MutexAssignment_7_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Ecfd__MutexAssignment_7_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getEcfdAccess().getMutexAssignment_7_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ecfd__Group_7_2_1__1__Impl"


    // $ANTLR start "rule__Mutex__Group__0"
    // InternalECFDL.g:1274:1: rule__Mutex__Group__0 : rule__Mutex__Group__0__Impl rule__Mutex__Group__1 ;
    public final void rule__Mutex__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:1278:1: ( rule__Mutex__Group__0__Impl rule__Mutex__Group__1 )
            // InternalECFDL.g:1279:2: rule__Mutex__Group__0__Impl rule__Mutex__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Mutex__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mutex__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mutex__Group__0"


    // $ANTLR start "rule__Mutex__Group__0__Impl"
    // InternalECFDL.g:1286:1: rule__Mutex__Group__0__Impl : ( 'Mutex' ) ;
    public final void rule__Mutex__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:1290:1: ( ( 'Mutex' ) )
            // InternalECFDL.g:1291:1: ( 'Mutex' )
            {
            // InternalECFDL.g:1291:1: ( 'Mutex' )
            // InternalECFDL.g:1292:2: 'Mutex'
            {
             before(grammarAccess.getMutexAccess().getMutexKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getMutexAccess().getMutexKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mutex__Group__0__Impl"


    // $ANTLR start "rule__Mutex__Group__1"
    // InternalECFDL.g:1301:1: rule__Mutex__Group__1 : rule__Mutex__Group__1__Impl rule__Mutex__Group__2 ;
    public final void rule__Mutex__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:1305:1: ( rule__Mutex__Group__1__Impl rule__Mutex__Group__2 )
            // InternalECFDL.g:1306:2: rule__Mutex__Group__1__Impl rule__Mutex__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Mutex__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mutex__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mutex__Group__1"


    // $ANTLR start "rule__Mutex__Group__1__Impl"
    // InternalECFDL.g:1313:1: rule__Mutex__Group__1__Impl : ( ':' ) ;
    public final void rule__Mutex__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:1317:1: ( ( ':' ) )
            // InternalECFDL.g:1318:1: ( ':' )
            {
            // InternalECFDL.g:1318:1: ( ':' )
            // InternalECFDL.g:1319:2: ':'
            {
             before(grammarAccess.getMutexAccess().getColonKeyword_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getMutexAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mutex__Group__1__Impl"


    // $ANTLR start "rule__Mutex__Group__2"
    // InternalECFDL.g:1328:1: rule__Mutex__Group__2 : rule__Mutex__Group__2__Impl rule__Mutex__Group__3 ;
    public final void rule__Mutex__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:1332:1: ( rule__Mutex__Group__2__Impl rule__Mutex__Group__3 )
            // InternalECFDL.g:1333:2: rule__Mutex__Group__2__Impl rule__Mutex__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__Mutex__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mutex__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mutex__Group__2"


    // $ANTLR start "rule__Mutex__Group__2__Impl"
    // InternalECFDL.g:1340:1: rule__Mutex__Group__2__Impl : ( ( rule__Mutex__NameAssignment_2 ) ) ;
    public final void rule__Mutex__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:1344:1: ( ( ( rule__Mutex__NameAssignment_2 ) ) )
            // InternalECFDL.g:1345:1: ( ( rule__Mutex__NameAssignment_2 ) )
            {
            // InternalECFDL.g:1345:1: ( ( rule__Mutex__NameAssignment_2 ) )
            // InternalECFDL.g:1346:2: ( rule__Mutex__NameAssignment_2 )
            {
             before(grammarAccess.getMutexAccess().getNameAssignment_2()); 
            // InternalECFDL.g:1347:2: ( rule__Mutex__NameAssignment_2 )
            // InternalECFDL.g:1347:3: rule__Mutex__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Mutex__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMutexAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mutex__Group__2__Impl"


    // $ANTLR start "rule__Mutex__Group__3"
    // InternalECFDL.g:1355:1: rule__Mutex__Group__3 : rule__Mutex__Group__3__Impl rule__Mutex__Group__4 ;
    public final void rule__Mutex__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:1359:1: ( rule__Mutex__Group__3__Impl rule__Mutex__Group__4 )
            // InternalECFDL.g:1360:2: rule__Mutex__Group__3__Impl rule__Mutex__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__Mutex__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mutex__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mutex__Group__3"


    // $ANTLR start "rule__Mutex__Group__3__Impl"
    // InternalECFDL.g:1367:1: rule__Mutex__Group__3__Impl : ( '{' ) ;
    public final void rule__Mutex__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:1371:1: ( ( '{' ) )
            // InternalECFDL.g:1372:1: ( '{' )
            {
            // InternalECFDL.g:1372:1: ( '{' )
            // InternalECFDL.g:1373:2: '{'
            {
             before(grammarAccess.getMutexAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getMutexAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mutex__Group__3__Impl"


    // $ANTLR start "rule__Mutex__Group__4"
    // InternalECFDL.g:1382:1: rule__Mutex__Group__4 : rule__Mutex__Group__4__Impl rule__Mutex__Group__5 ;
    public final void rule__Mutex__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:1386:1: ( rule__Mutex__Group__4__Impl rule__Mutex__Group__5 )
            // InternalECFDL.g:1387:2: rule__Mutex__Group__4__Impl rule__Mutex__Group__5
            {
            pushFollow(FOLLOW_16);
            rule__Mutex__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mutex__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mutex__Group__4"


    // $ANTLR start "rule__Mutex__Group__4__Impl"
    // InternalECFDL.g:1394:1: rule__Mutex__Group__4__Impl : ( 'boxes' ) ;
    public final void rule__Mutex__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:1398:1: ( ( 'boxes' ) )
            // InternalECFDL.g:1399:1: ( 'boxes' )
            {
            // InternalECFDL.g:1399:1: ( 'boxes' )
            // InternalECFDL.g:1400:2: 'boxes'
            {
             before(grammarAccess.getMutexAccess().getBoxesKeyword_4()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getMutexAccess().getBoxesKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mutex__Group__4__Impl"


    // $ANTLR start "rule__Mutex__Group__5"
    // InternalECFDL.g:1409:1: rule__Mutex__Group__5 : rule__Mutex__Group__5__Impl rule__Mutex__Group__6 ;
    public final void rule__Mutex__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:1413:1: ( rule__Mutex__Group__5__Impl rule__Mutex__Group__6 )
            // InternalECFDL.g:1414:2: rule__Mutex__Group__5__Impl rule__Mutex__Group__6
            {
            pushFollow(FOLLOW_8);
            rule__Mutex__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mutex__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mutex__Group__5"


    // $ANTLR start "rule__Mutex__Group__5__Impl"
    // InternalECFDL.g:1421:1: rule__Mutex__Group__5__Impl : ( '(' ) ;
    public final void rule__Mutex__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:1425:1: ( ( '(' ) )
            // InternalECFDL.g:1426:1: ( '(' )
            {
            // InternalECFDL.g:1426:1: ( '(' )
            // InternalECFDL.g:1427:2: '('
            {
             before(grammarAccess.getMutexAccess().getLeftParenthesisKeyword_5()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getMutexAccess().getLeftParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mutex__Group__5__Impl"


    // $ANTLR start "rule__Mutex__Group__6"
    // InternalECFDL.g:1436:1: rule__Mutex__Group__6 : rule__Mutex__Group__6__Impl rule__Mutex__Group__7 ;
    public final void rule__Mutex__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:1440:1: ( rule__Mutex__Group__6__Impl rule__Mutex__Group__7 )
            // InternalECFDL.g:1441:2: rule__Mutex__Group__6__Impl rule__Mutex__Group__7
            {
            pushFollow(FOLLOW_14);
            rule__Mutex__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mutex__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mutex__Group__6"


    // $ANTLR start "rule__Mutex__Group__6__Impl"
    // InternalECFDL.g:1448:1: rule__Mutex__Group__6__Impl : ( ( rule__Mutex__BoxAssignment_6 ) ) ;
    public final void rule__Mutex__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:1452:1: ( ( ( rule__Mutex__BoxAssignment_6 ) ) )
            // InternalECFDL.g:1453:1: ( ( rule__Mutex__BoxAssignment_6 ) )
            {
            // InternalECFDL.g:1453:1: ( ( rule__Mutex__BoxAssignment_6 ) )
            // InternalECFDL.g:1454:2: ( rule__Mutex__BoxAssignment_6 )
            {
             before(grammarAccess.getMutexAccess().getBoxAssignment_6()); 
            // InternalECFDL.g:1455:2: ( rule__Mutex__BoxAssignment_6 )
            // InternalECFDL.g:1455:3: rule__Mutex__BoxAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Mutex__BoxAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getMutexAccess().getBoxAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mutex__Group__6__Impl"


    // $ANTLR start "rule__Mutex__Group__7"
    // InternalECFDL.g:1463:1: rule__Mutex__Group__7 : rule__Mutex__Group__7__Impl rule__Mutex__Group__8 ;
    public final void rule__Mutex__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:1467:1: ( rule__Mutex__Group__7__Impl rule__Mutex__Group__8 )
            // InternalECFDL.g:1468:2: rule__Mutex__Group__7__Impl rule__Mutex__Group__8
            {
            pushFollow(FOLLOW_17);
            rule__Mutex__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mutex__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mutex__Group__7"


    // $ANTLR start "rule__Mutex__Group__7__Impl"
    // InternalECFDL.g:1475:1: rule__Mutex__Group__7__Impl : ( ( ( rule__Mutex__Group_7__0 ) ) ( ( rule__Mutex__Group_7__0 )* ) ) ;
    public final void rule__Mutex__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:1479:1: ( ( ( ( rule__Mutex__Group_7__0 ) ) ( ( rule__Mutex__Group_7__0 )* ) ) )
            // InternalECFDL.g:1480:1: ( ( ( rule__Mutex__Group_7__0 ) ) ( ( rule__Mutex__Group_7__0 )* ) )
            {
            // InternalECFDL.g:1480:1: ( ( ( rule__Mutex__Group_7__0 ) ) ( ( rule__Mutex__Group_7__0 )* ) )
            // InternalECFDL.g:1481:2: ( ( rule__Mutex__Group_7__0 ) ) ( ( rule__Mutex__Group_7__0 )* )
            {
            // InternalECFDL.g:1481:2: ( ( rule__Mutex__Group_7__0 ) )
            // InternalECFDL.g:1482:3: ( rule__Mutex__Group_7__0 )
            {
             before(grammarAccess.getMutexAccess().getGroup_7()); 
            // InternalECFDL.g:1483:3: ( rule__Mutex__Group_7__0 )
            // InternalECFDL.g:1483:4: rule__Mutex__Group_7__0
            {
            pushFollow(FOLLOW_6);
            rule__Mutex__Group_7__0();

            state._fsp--;


            }

             after(grammarAccess.getMutexAccess().getGroup_7()); 

            }

            // InternalECFDL.g:1486:2: ( ( rule__Mutex__Group_7__0 )* )
            // InternalECFDL.g:1487:3: ( rule__Mutex__Group_7__0 )*
            {
             before(grammarAccess.getMutexAccess().getGroup_7()); 
            // InternalECFDL.g:1488:3: ( rule__Mutex__Group_7__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==14) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalECFDL.g:1488:4: rule__Mutex__Group_7__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Mutex__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getMutexAccess().getGroup_7()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mutex__Group__7__Impl"


    // $ANTLR start "rule__Mutex__Group__8"
    // InternalECFDL.g:1497:1: rule__Mutex__Group__8 : rule__Mutex__Group__8__Impl rule__Mutex__Group__9 ;
    public final void rule__Mutex__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:1501:1: ( rule__Mutex__Group__8__Impl rule__Mutex__Group__9 )
            // InternalECFDL.g:1502:2: rule__Mutex__Group__8__Impl rule__Mutex__Group__9
            {
            pushFollow(FOLLOW_18);
            rule__Mutex__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mutex__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mutex__Group__8"


    // $ANTLR start "rule__Mutex__Group__8__Impl"
    // InternalECFDL.g:1509:1: rule__Mutex__Group__8__Impl : ( ')' ) ;
    public final void rule__Mutex__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:1513:1: ( ( ')' ) )
            // InternalECFDL.g:1514:1: ( ')' )
            {
            // InternalECFDL.g:1514:1: ( ')' )
            // InternalECFDL.g:1515:2: ')'
            {
             before(grammarAccess.getMutexAccess().getRightParenthesisKeyword_8()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getMutexAccess().getRightParenthesisKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mutex__Group__8__Impl"


    // $ANTLR start "rule__Mutex__Group__9"
    // InternalECFDL.g:1524:1: rule__Mutex__Group__9 : rule__Mutex__Group__9__Impl ;
    public final void rule__Mutex__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:1528:1: ( rule__Mutex__Group__9__Impl )
            // InternalECFDL.g:1529:2: rule__Mutex__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mutex__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mutex__Group__9"


    // $ANTLR start "rule__Mutex__Group__9__Impl"
    // InternalECFDL.g:1535:1: rule__Mutex__Group__9__Impl : ( '}' ) ;
    public final void rule__Mutex__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:1539:1: ( ( '}' ) )
            // InternalECFDL.g:1540:1: ( '}' )
            {
            // InternalECFDL.g:1540:1: ( '}' )
            // InternalECFDL.g:1541:2: '}'
            {
             before(grammarAccess.getMutexAccess().getRightCurlyBracketKeyword_9()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getMutexAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mutex__Group__9__Impl"


    // $ANTLR start "rule__Mutex__Group_7__0"
    // InternalECFDL.g:1551:1: rule__Mutex__Group_7__0 : rule__Mutex__Group_7__0__Impl rule__Mutex__Group_7__1 ;
    public final void rule__Mutex__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:1555:1: ( rule__Mutex__Group_7__0__Impl rule__Mutex__Group_7__1 )
            // InternalECFDL.g:1556:2: rule__Mutex__Group_7__0__Impl rule__Mutex__Group_7__1
            {
            pushFollow(FOLLOW_8);
            rule__Mutex__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mutex__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mutex__Group_7__0"


    // $ANTLR start "rule__Mutex__Group_7__0__Impl"
    // InternalECFDL.g:1563:1: rule__Mutex__Group_7__0__Impl : ( ',' ) ;
    public final void rule__Mutex__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:1567:1: ( ( ',' ) )
            // InternalECFDL.g:1568:1: ( ',' )
            {
            // InternalECFDL.g:1568:1: ( ',' )
            // InternalECFDL.g:1569:2: ','
            {
             before(grammarAccess.getMutexAccess().getCommaKeyword_7_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getMutexAccess().getCommaKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mutex__Group_7__0__Impl"


    // $ANTLR start "rule__Mutex__Group_7__1"
    // InternalECFDL.g:1578:1: rule__Mutex__Group_7__1 : rule__Mutex__Group_7__1__Impl ;
    public final void rule__Mutex__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:1582:1: ( rule__Mutex__Group_7__1__Impl )
            // InternalECFDL.g:1583:2: rule__Mutex__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mutex__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mutex__Group_7__1"


    // $ANTLR start "rule__Mutex__Group_7__1__Impl"
    // InternalECFDL.g:1589:1: rule__Mutex__Group_7__1__Impl : ( ( rule__Mutex__BoxAssignment_7_1 ) ) ;
    public final void rule__Mutex__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:1593:1: ( ( ( rule__Mutex__BoxAssignment_7_1 ) ) )
            // InternalECFDL.g:1594:1: ( ( rule__Mutex__BoxAssignment_7_1 ) )
            {
            // InternalECFDL.g:1594:1: ( ( rule__Mutex__BoxAssignment_7_1 ) )
            // InternalECFDL.g:1595:2: ( rule__Mutex__BoxAssignment_7_1 )
            {
             before(grammarAccess.getMutexAccess().getBoxAssignment_7_1()); 
            // InternalECFDL.g:1596:2: ( rule__Mutex__BoxAssignment_7_1 )
            // InternalECFDL.g:1596:3: rule__Mutex__BoxAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__Mutex__BoxAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getMutexAccess().getBoxAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mutex__Group_7__1__Impl"


    // $ANTLR start "rule__Box__Group__0"
    // InternalECFDL.g:1605:1: rule__Box__Group__0 : rule__Box__Group__0__Impl rule__Box__Group__1 ;
    public final void rule__Box__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:1609:1: ( rule__Box__Group__0__Impl rule__Box__Group__1 )
            // InternalECFDL.g:1610:2: rule__Box__Group__0__Impl rule__Box__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Box__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Box__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group__0"


    // $ANTLR start "rule__Box__Group__0__Impl"
    // InternalECFDL.g:1617:1: rule__Box__Group__0__Impl : ( () ) ;
    public final void rule__Box__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:1621:1: ( ( () ) )
            // InternalECFDL.g:1622:1: ( () )
            {
            // InternalECFDL.g:1622:1: ( () )
            // InternalECFDL.g:1623:2: ()
            {
             before(grammarAccess.getBoxAccess().getBoxAction_0()); 
            // InternalECFDL.g:1624:2: ()
            // InternalECFDL.g:1624:3: 
            {
            }

             after(grammarAccess.getBoxAccess().getBoxAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group__0__Impl"


    // $ANTLR start "rule__Box__Group__1"
    // InternalECFDL.g:1632:1: rule__Box__Group__1 : rule__Box__Group__1__Impl rule__Box__Group__2 ;
    public final void rule__Box__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:1636:1: ( rule__Box__Group__1__Impl rule__Box__Group__2 )
            // InternalECFDL.g:1637:2: rule__Box__Group__1__Impl rule__Box__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Box__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Box__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group__1"


    // $ANTLR start "rule__Box__Group__1__Impl"
    // InternalECFDL.g:1644:1: rule__Box__Group__1__Impl : ( 'Box' ) ;
    public final void rule__Box__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:1648:1: ( ( 'Box' ) )
            // InternalECFDL.g:1649:1: ( 'Box' )
            {
            // InternalECFDL.g:1649:1: ( 'Box' )
            // InternalECFDL.g:1650:2: 'Box'
            {
             before(grammarAccess.getBoxAccess().getBoxKeyword_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getBoxAccess().getBoxKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group__1__Impl"


    // $ANTLR start "rule__Box__Group__2"
    // InternalECFDL.g:1659:1: rule__Box__Group__2 : rule__Box__Group__2__Impl rule__Box__Group__3 ;
    public final void rule__Box__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:1663:1: ( rule__Box__Group__2__Impl rule__Box__Group__3 )
            // InternalECFDL.g:1664:2: rule__Box__Group__2__Impl rule__Box__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__Box__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Box__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group__2"


    // $ANTLR start "rule__Box__Group__2__Impl"
    // InternalECFDL.g:1671:1: rule__Box__Group__2__Impl : ( ':' ) ;
    public final void rule__Box__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:1675:1: ( ( ':' ) )
            // InternalECFDL.g:1676:1: ( ':' )
            {
            // InternalECFDL.g:1676:1: ( ':' )
            // InternalECFDL.g:1677:2: ':'
            {
             before(grammarAccess.getBoxAccess().getColonKeyword_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getBoxAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group__2__Impl"


    // $ANTLR start "rule__Box__Group__3"
    // InternalECFDL.g:1686:1: rule__Box__Group__3 : rule__Box__Group__3__Impl rule__Box__Group__4 ;
    public final void rule__Box__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:1690:1: ( rule__Box__Group__3__Impl rule__Box__Group__4 )
            // InternalECFDL.g:1691:2: rule__Box__Group__3__Impl rule__Box__Group__4
            {
            pushFollow(FOLLOW_3);
            rule__Box__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Box__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group__3"


    // $ANTLR start "rule__Box__Group__3__Impl"
    // InternalECFDL.g:1698:1: rule__Box__Group__3__Impl : ( ( rule__Box__NameAssignment_3 ) ) ;
    public final void rule__Box__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:1702:1: ( ( ( rule__Box__NameAssignment_3 ) ) )
            // InternalECFDL.g:1703:1: ( ( rule__Box__NameAssignment_3 ) )
            {
            // InternalECFDL.g:1703:1: ( ( rule__Box__NameAssignment_3 ) )
            // InternalECFDL.g:1704:2: ( rule__Box__NameAssignment_3 )
            {
             before(grammarAccess.getBoxAccess().getNameAssignment_3()); 
            // InternalECFDL.g:1705:2: ( rule__Box__NameAssignment_3 )
            // InternalECFDL.g:1705:3: rule__Box__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Box__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getBoxAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group__3__Impl"


    // $ANTLR start "rule__Box__Group__4"
    // InternalECFDL.g:1713:1: rule__Box__Group__4 : rule__Box__Group__4__Impl rule__Box__Group__5 ;
    public final void rule__Box__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:1717:1: ( rule__Box__Group__4__Impl rule__Box__Group__5 )
            // InternalECFDL.g:1718:2: rule__Box__Group__4__Impl rule__Box__Group__5
            {
            pushFollow(FOLLOW_19);
            rule__Box__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Box__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group__4"


    // $ANTLR start "rule__Box__Group__4__Impl"
    // InternalECFDL.g:1725:1: rule__Box__Group__4__Impl : ( '{' ) ;
    public final void rule__Box__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:1729:1: ( ( '{' ) )
            // InternalECFDL.g:1730:1: ( '{' )
            {
            // InternalECFDL.g:1730:1: ( '{' )
            // InternalECFDL.g:1731:2: '{'
            {
             before(grammarAccess.getBoxAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getBoxAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group__4__Impl"


    // $ANTLR start "rule__Box__Group__5"
    // InternalECFDL.g:1740:1: rule__Box__Group__5 : rule__Box__Group__5__Impl rule__Box__Group__6 ;
    public final void rule__Box__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:1744:1: ( rule__Box__Group__5__Impl rule__Box__Group__6 )
            // InternalECFDL.g:1745:2: rule__Box__Group__5__Impl rule__Box__Group__6
            {
            pushFollow(FOLLOW_19);
            rule__Box__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Box__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group__5"


    // $ANTLR start "rule__Box__Group__5__Impl"
    // InternalECFDL.g:1752:1: rule__Box__Group__5__Impl : ( ( rule__Box__RootAssignment_5 )? ) ;
    public final void rule__Box__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:1756:1: ( ( ( rule__Box__RootAssignment_5 )? ) )
            // InternalECFDL.g:1757:1: ( ( rule__Box__RootAssignment_5 )? )
            {
            // InternalECFDL.g:1757:1: ( ( rule__Box__RootAssignment_5 )? )
            // InternalECFDL.g:1758:2: ( rule__Box__RootAssignment_5 )?
            {
             before(grammarAccess.getBoxAccess().getRootAssignment_5()); 
            // InternalECFDL.g:1759:2: ( rule__Box__RootAssignment_5 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==30) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalECFDL.g:1759:3: rule__Box__RootAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__Box__RootAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBoxAccess().getRootAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group__5__Impl"


    // $ANTLR start "rule__Box__Group__6"
    // InternalECFDL.g:1767:1: rule__Box__Group__6 : rule__Box__Group__6__Impl rule__Box__Group__7 ;
    public final void rule__Box__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:1771:1: ( rule__Box__Group__6__Impl rule__Box__Group__7 )
            // InternalECFDL.g:1772:2: rule__Box__Group__6__Impl rule__Box__Group__7
            {
            pushFollow(FOLLOW_19);
            rule__Box__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Box__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group__6"


    // $ANTLR start "rule__Box__Group__6__Impl"
    // InternalECFDL.g:1779:1: rule__Box__Group__6__Impl : ( ( rule__Box__Group_6__0 )? ) ;
    public final void rule__Box__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:1783:1: ( ( ( rule__Box__Group_6__0 )? ) )
            // InternalECFDL.g:1784:1: ( ( rule__Box__Group_6__0 )? )
            {
            // InternalECFDL.g:1784:1: ( ( rule__Box__Group_6__0 )? )
            // InternalECFDL.g:1785:2: ( rule__Box__Group_6__0 )?
            {
             before(grammarAccess.getBoxAccess().getGroup_6()); 
            // InternalECFDL.g:1786:2: ( rule__Box__Group_6__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==24) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalECFDL.g:1786:3: rule__Box__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Box__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBoxAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group__6__Impl"


    // $ANTLR start "rule__Box__Group__7"
    // InternalECFDL.g:1794:1: rule__Box__Group__7 : rule__Box__Group__7__Impl rule__Box__Group__8 ;
    public final void rule__Box__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:1798:1: ( rule__Box__Group__7__Impl rule__Box__Group__8 )
            // InternalECFDL.g:1799:2: rule__Box__Group__7__Impl rule__Box__Group__8
            {
            pushFollow(FOLLOW_19);
            rule__Box__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Box__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group__7"


    // $ANTLR start "rule__Box__Group__7__Impl"
    // InternalECFDL.g:1806:1: rule__Box__Group__7__Impl : ( ( rule__Box__Group_7__0 )? ) ;
    public final void rule__Box__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:1810:1: ( ( ( rule__Box__Group_7__0 )? ) )
            // InternalECFDL.g:1811:1: ( ( rule__Box__Group_7__0 )? )
            {
            // InternalECFDL.g:1811:1: ( ( rule__Box__Group_7__0 )? )
            // InternalECFDL.g:1812:2: ( rule__Box__Group_7__0 )?
            {
             before(grammarAccess.getBoxAccess().getGroup_7()); 
            // InternalECFDL.g:1813:2: ( rule__Box__Group_7__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==25) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalECFDL.g:1813:3: rule__Box__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Box__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBoxAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group__7__Impl"


    // $ANTLR start "rule__Box__Group__8"
    // InternalECFDL.g:1821:1: rule__Box__Group__8 : rule__Box__Group__8__Impl rule__Box__Group__9 ;
    public final void rule__Box__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:1825:1: ( rule__Box__Group__8__Impl rule__Box__Group__9 )
            // InternalECFDL.g:1826:2: rule__Box__Group__8__Impl rule__Box__Group__9
            {
            pushFollow(FOLLOW_19);
            rule__Box__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Box__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group__8"


    // $ANTLR start "rule__Box__Group__8__Impl"
    // InternalECFDL.g:1833:1: rule__Box__Group__8__Impl : ( ( rule__Box__Group_8__0 )? ) ;
    public final void rule__Box__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:1837:1: ( ( ( rule__Box__Group_8__0 )? ) )
            // InternalECFDL.g:1838:1: ( ( rule__Box__Group_8__0 )? )
            {
            // InternalECFDL.g:1838:1: ( ( rule__Box__Group_8__0 )? )
            // InternalECFDL.g:1839:2: ( rule__Box__Group_8__0 )?
            {
             before(grammarAccess.getBoxAccess().getGroup_8()); 
            // InternalECFDL.g:1840:2: ( rule__Box__Group_8__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==26) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalECFDL.g:1840:3: rule__Box__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Box__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBoxAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group__8__Impl"


    // $ANTLR start "rule__Box__Group__9"
    // InternalECFDL.g:1848:1: rule__Box__Group__9 : rule__Box__Group__9__Impl rule__Box__Group__10 ;
    public final void rule__Box__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:1852:1: ( rule__Box__Group__9__Impl rule__Box__Group__10 )
            // InternalECFDL.g:1853:2: rule__Box__Group__9__Impl rule__Box__Group__10
            {
            pushFollow(FOLLOW_19);
            rule__Box__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Box__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group__9"


    // $ANTLR start "rule__Box__Group__9__Impl"
    // InternalECFDL.g:1860:1: rule__Box__Group__9__Impl : ( ( rule__Box__Group_9__0 )? ) ;
    public final void rule__Box__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:1864:1: ( ( ( rule__Box__Group_9__0 )? ) )
            // InternalECFDL.g:1865:1: ( ( rule__Box__Group_9__0 )? )
            {
            // InternalECFDL.g:1865:1: ( ( rule__Box__Group_9__0 )? )
            // InternalECFDL.g:1866:2: ( rule__Box__Group_9__0 )?
            {
             before(grammarAccess.getBoxAccess().getGroup_9()); 
            // InternalECFDL.g:1867:2: ( rule__Box__Group_9__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==27) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalECFDL.g:1867:3: rule__Box__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Box__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBoxAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group__9__Impl"


    // $ANTLR start "rule__Box__Group__10"
    // InternalECFDL.g:1875:1: rule__Box__Group__10 : rule__Box__Group__10__Impl rule__Box__Group__11 ;
    public final void rule__Box__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:1879:1: ( rule__Box__Group__10__Impl rule__Box__Group__11 )
            // InternalECFDL.g:1880:2: rule__Box__Group__10__Impl rule__Box__Group__11
            {
            pushFollow(FOLLOW_19);
            rule__Box__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Box__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group__10"


    // $ANTLR start "rule__Box__Group__10__Impl"
    // InternalECFDL.g:1887:1: rule__Box__Group__10__Impl : ( ( rule__Box__Group_10__0 )? ) ;
    public final void rule__Box__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:1891:1: ( ( ( rule__Box__Group_10__0 )? ) )
            // InternalECFDL.g:1892:1: ( ( rule__Box__Group_10__0 )? )
            {
            // InternalECFDL.g:1892:1: ( ( rule__Box__Group_10__0 )? )
            // InternalECFDL.g:1893:2: ( rule__Box__Group_10__0 )?
            {
             before(grammarAccess.getBoxAccess().getGroup_10()); 
            // InternalECFDL.g:1894:2: ( rule__Box__Group_10__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==19) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalECFDL.g:1894:3: rule__Box__Group_10__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Box__Group_10__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBoxAccess().getGroup_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group__10__Impl"


    // $ANTLR start "rule__Box__Group__11"
    // InternalECFDL.g:1902:1: rule__Box__Group__11 : rule__Box__Group__11__Impl rule__Box__Group__12 ;
    public final void rule__Box__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:1906:1: ( rule__Box__Group__11__Impl rule__Box__Group__12 )
            // InternalECFDL.g:1907:2: rule__Box__Group__11__Impl rule__Box__Group__12
            {
            pushFollow(FOLLOW_19);
            rule__Box__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Box__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group__11"


    // $ANTLR start "rule__Box__Group__11__Impl"
    // InternalECFDL.g:1914:1: rule__Box__Group__11__Impl : ( ( rule__Box__Group_11__0 )? ) ;
    public final void rule__Box__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:1918:1: ( ( ( rule__Box__Group_11__0 )? ) )
            // InternalECFDL.g:1919:1: ( ( rule__Box__Group_11__0 )? )
            {
            // InternalECFDL.g:1919:1: ( ( rule__Box__Group_11__0 )? )
            // InternalECFDL.g:1920:2: ( rule__Box__Group_11__0 )?
            {
             before(grammarAccess.getBoxAccess().getGroup_11()); 
            // InternalECFDL.g:1921:2: ( rule__Box__Group_11__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==28) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalECFDL.g:1921:3: rule__Box__Group_11__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Box__Group_11__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBoxAccess().getGroup_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group__11__Impl"


    // $ANTLR start "rule__Box__Group__12"
    // InternalECFDL.g:1929:1: rule__Box__Group__12 : rule__Box__Group__12__Impl ;
    public final void rule__Box__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:1933:1: ( rule__Box__Group__12__Impl )
            // InternalECFDL.g:1934:2: rule__Box__Group__12__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Box__Group__12__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group__12"


    // $ANTLR start "rule__Box__Group__12__Impl"
    // InternalECFDL.g:1940:1: rule__Box__Group__12__Impl : ( '}' ) ;
    public final void rule__Box__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:1944:1: ( ( '}' ) )
            // InternalECFDL.g:1945:1: ( '}' )
            {
            // InternalECFDL.g:1945:1: ( '}' )
            // InternalECFDL.g:1946:2: '}'
            {
             before(grammarAccess.getBoxAccess().getRightCurlyBracketKeyword_12()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getBoxAccess().getRightCurlyBracketKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group__12__Impl"


    // $ANTLR start "rule__Box__Group_6__0"
    // InternalECFDL.g:1956:1: rule__Box__Group_6__0 : rule__Box__Group_6__0__Impl rule__Box__Group_6__1 ;
    public final void rule__Box__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:1960:1: ( rule__Box__Group_6__0__Impl rule__Box__Group_6__1 )
            // InternalECFDL.g:1961:2: rule__Box__Group_6__0__Impl rule__Box__Group_6__1
            {
            pushFollow(FOLLOW_16);
            rule__Box__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Box__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_6__0"


    // $ANTLR start "rule__Box__Group_6__0__Impl"
    // InternalECFDL.g:1968:1: rule__Box__Group_6__0__Impl : ( 'superBox' ) ;
    public final void rule__Box__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:1972:1: ( ( 'superBox' ) )
            // InternalECFDL.g:1973:1: ( 'superBox' )
            {
            // InternalECFDL.g:1973:1: ( 'superBox' )
            // InternalECFDL.g:1974:2: 'superBox'
            {
             before(grammarAccess.getBoxAccess().getSuperBoxKeyword_6_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getBoxAccess().getSuperBoxKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_6__0__Impl"


    // $ANTLR start "rule__Box__Group_6__1"
    // InternalECFDL.g:1983:1: rule__Box__Group_6__1 : rule__Box__Group_6__1__Impl rule__Box__Group_6__2 ;
    public final void rule__Box__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:1987:1: ( rule__Box__Group_6__1__Impl rule__Box__Group_6__2 )
            // InternalECFDL.g:1988:2: rule__Box__Group_6__1__Impl rule__Box__Group_6__2
            {
            pushFollow(FOLLOW_8);
            rule__Box__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Box__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_6__1"


    // $ANTLR start "rule__Box__Group_6__1__Impl"
    // InternalECFDL.g:1995:1: rule__Box__Group_6__1__Impl : ( '(' ) ;
    public final void rule__Box__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:1999:1: ( ( '(' ) )
            // InternalECFDL.g:2000:1: ( '(' )
            {
            // InternalECFDL.g:2000:1: ( '(' )
            // InternalECFDL.g:2001:2: '('
            {
             before(grammarAccess.getBoxAccess().getLeftParenthesisKeyword_6_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getBoxAccess().getLeftParenthesisKeyword_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_6__1__Impl"


    // $ANTLR start "rule__Box__Group_6__2"
    // InternalECFDL.g:2010:1: rule__Box__Group_6__2 : rule__Box__Group_6__2__Impl rule__Box__Group_6__3 ;
    public final void rule__Box__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:2014:1: ( rule__Box__Group_6__2__Impl rule__Box__Group_6__3 )
            // InternalECFDL.g:2015:2: rule__Box__Group_6__2__Impl rule__Box__Group_6__3
            {
            pushFollow(FOLLOW_20);
            rule__Box__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Box__Group_6__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_6__2"


    // $ANTLR start "rule__Box__Group_6__2__Impl"
    // InternalECFDL.g:2022:1: rule__Box__Group_6__2__Impl : ( ( rule__Box__SuperBoxAssignment_6_2 ) ) ;
    public final void rule__Box__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:2026:1: ( ( ( rule__Box__SuperBoxAssignment_6_2 ) ) )
            // InternalECFDL.g:2027:1: ( ( rule__Box__SuperBoxAssignment_6_2 ) )
            {
            // InternalECFDL.g:2027:1: ( ( rule__Box__SuperBoxAssignment_6_2 ) )
            // InternalECFDL.g:2028:2: ( rule__Box__SuperBoxAssignment_6_2 )
            {
             before(grammarAccess.getBoxAccess().getSuperBoxAssignment_6_2()); 
            // InternalECFDL.g:2029:2: ( rule__Box__SuperBoxAssignment_6_2 )
            // InternalECFDL.g:2029:3: rule__Box__SuperBoxAssignment_6_2
            {
            pushFollow(FOLLOW_2);
            rule__Box__SuperBoxAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getBoxAccess().getSuperBoxAssignment_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_6__2__Impl"


    // $ANTLR start "rule__Box__Group_6__3"
    // InternalECFDL.g:2037:1: rule__Box__Group_6__3 : rule__Box__Group_6__3__Impl rule__Box__Group_6__4 ;
    public final void rule__Box__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:2041:1: ( rule__Box__Group_6__3__Impl rule__Box__Group_6__4 )
            // InternalECFDL.g:2042:2: rule__Box__Group_6__3__Impl rule__Box__Group_6__4
            {
            pushFollow(FOLLOW_20);
            rule__Box__Group_6__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Box__Group_6__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_6__3"


    // $ANTLR start "rule__Box__Group_6__3__Impl"
    // InternalECFDL.g:2049:1: rule__Box__Group_6__3__Impl : ( ( rule__Box__Group_6_3__0 )* ) ;
    public final void rule__Box__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:2053:1: ( ( ( rule__Box__Group_6_3__0 )* ) )
            // InternalECFDL.g:2054:1: ( ( rule__Box__Group_6_3__0 )* )
            {
            // InternalECFDL.g:2054:1: ( ( rule__Box__Group_6_3__0 )* )
            // InternalECFDL.g:2055:2: ( rule__Box__Group_6_3__0 )*
            {
             before(grammarAccess.getBoxAccess().getGroup_6_3()); 
            // InternalECFDL.g:2056:2: ( rule__Box__Group_6_3__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==14) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalECFDL.g:2056:3: rule__Box__Group_6_3__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Box__Group_6_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getBoxAccess().getGroup_6_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_6__3__Impl"


    // $ANTLR start "rule__Box__Group_6__4"
    // InternalECFDL.g:2064:1: rule__Box__Group_6__4 : rule__Box__Group_6__4__Impl ;
    public final void rule__Box__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:2068:1: ( rule__Box__Group_6__4__Impl )
            // InternalECFDL.g:2069:2: rule__Box__Group_6__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Box__Group_6__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_6__4"


    // $ANTLR start "rule__Box__Group_6__4__Impl"
    // InternalECFDL.g:2075:1: rule__Box__Group_6__4__Impl : ( ')' ) ;
    public final void rule__Box__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:2079:1: ( ( ')' ) )
            // InternalECFDL.g:2080:1: ( ')' )
            {
            // InternalECFDL.g:2080:1: ( ')' )
            // InternalECFDL.g:2081:2: ')'
            {
             before(grammarAccess.getBoxAccess().getRightParenthesisKeyword_6_4()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getBoxAccess().getRightParenthesisKeyword_6_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_6__4__Impl"


    // $ANTLR start "rule__Box__Group_6_3__0"
    // InternalECFDL.g:2091:1: rule__Box__Group_6_3__0 : rule__Box__Group_6_3__0__Impl rule__Box__Group_6_3__1 ;
    public final void rule__Box__Group_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:2095:1: ( rule__Box__Group_6_3__0__Impl rule__Box__Group_6_3__1 )
            // InternalECFDL.g:2096:2: rule__Box__Group_6_3__0__Impl rule__Box__Group_6_3__1
            {
            pushFollow(FOLLOW_8);
            rule__Box__Group_6_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Box__Group_6_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_6_3__0"


    // $ANTLR start "rule__Box__Group_6_3__0__Impl"
    // InternalECFDL.g:2103:1: rule__Box__Group_6_3__0__Impl : ( ',' ) ;
    public final void rule__Box__Group_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:2107:1: ( ( ',' ) )
            // InternalECFDL.g:2108:1: ( ',' )
            {
            // InternalECFDL.g:2108:1: ( ',' )
            // InternalECFDL.g:2109:2: ','
            {
             before(grammarAccess.getBoxAccess().getCommaKeyword_6_3_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getBoxAccess().getCommaKeyword_6_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_6_3__0__Impl"


    // $ANTLR start "rule__Box__Group_6_3__1"
    // InternalECFDL.g:2118:1: rule__Box__Group_6_3__1 : rule__Box__Group_6_3__1__Impl ;
    public final void rule__Box__Group_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:2122:1: ( rule__Box__Group_6_3__1__Impl )
            // InternalECFDL.g:2123:2: rule__Box__Group_6_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Box__Group_6_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_6_3__1"


    // $ANTLR start "rule__Box__Group_6_3__1__Impl"
    // InternalECFDL.g:2129:1: rule__Box__Group_6_3__1__Impl : ( ( rule__Box__SuperBoxAssignment_6_3_1 ) ) ;
    public final void rule__Box__Group_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:2133:1: ( ( ( rule__Box__SuperBoxAssignment_6_3_1 ) ) )
            // InternalECFDL.g:2134:1: ( ( rule__Box__SuperBoxAssignment_6_3_1 ) )
            {
            // InternalECFDL.g:2134:1: ( ( rule__Box__SuperBoxAssignment_6_3_1 ) )
            // InternalECFDL.g:2135:2: ( rule__Box__SuperBoxAssignment_6_3_1 )
            {
             before(grammarAccess.getBoxAccess().getSuperBoxAssignment_6_3_1()); 
            // InternalECFDL.g:2136:2: ( rule__Box__SuperBoxAssignment_6_3_1 )
            // InternalECFDL.g:2136:3: rule__Box__SuperBoxAssignment_6_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Box__SuperBoxAssignment_6_3_1();

            state._fsp--;


            }

             after(grammarAccess.getBoxAccess().getSuperBoxAssignment_6_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_6_3__1__Impl"


    // $ANTLR start "rule__Box__Group_7__0"
    // InternalECFDL.g:2145:1: rule__Box__Group_7__0 : rule__Box__Group_7__0__Impl rule__Box__Group_7__1 ;
    public final void rule__Box__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:2149:1: ( rule__Box__Group_7__0__Impl rule__Box__Group_7__1 )
            // InternalECFDL.g:2150:2: rule__Box__Group_7__0__Impl rule__Box__Group_7__1
            {
            pushFollow(FOLLOW_16);
            rule__Box__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Box__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_7__0"


    // $ANTLR start "rule__Box__Group_7__0__Impl"
    // InternalECFDL.g:2157:1: rule__Box__Group_7__0__Impl : ( 'groupbox' ) ;
    public final void rule__Box__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:2161:1: ( ( 'groupbox' ) )
            // InternalECFDL.g:2162:1: ( 'groupbox' )
            {
            // InternalECFDL.g:2162:1: ( 'groupbox' )
            // InternalECFDL.g:2163:2: 'groupbox'
            {
             before(grammarAccess.getBoxAccess().getGroupboxKeyword_7_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getBoxAccess().getGroupboxKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_7__0__Impl"


    // $ANTLR start "rule__Box__Group_7__1"
    // InternalECFDL.g:2172:1: rule__Box__Group_7__1 : rule__Box__Group_7__1__Impl rule__Box__Group_7__2 ;
    public final void rule__Box__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:2176:1: ( rule__Box__Group_7__1__Impl rule__Box__Group_7__2 )
            // InternalECFDL.g:2177:2: rule__Box__Group_7__1__Impl rule__Box__Group_7__2
            {
            pushFollow(FOLLOW_8);
            rule__Box__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Box__Group_7__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_7__1"


    // $ANTLR start "rule__Box__Group_7__1__Impl"
    // InternalECFDL.g:2184:1: rule__Box__Group_7__1__Impl : ( '(' ) ;
    public final void rule__Box__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:2188:1: ( ( '(' ) )
            // InternalECFDL.g:2189:1: ( '(' )
            {
            // InternalECFDL.g:2189:1: ( '(' )
            // InternalECFDL.g:2190:2: '('
            {
             before(grammarAccess.getBoxAccess().getLeftParenthesisKeyword_7_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getBoxAccess().getLeftParenthesisKeyword_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_7__1__Impl"


    // $ANTLR start "rule__Box__Group_7__2"
    // InternalECFDL.g:2199:1: rule__Box__Group_7__2 : rule__Box__Group_7__2__Impl rule__Box__Group_7__3 ;
    public final void rule__Box__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:2203:1: ( rule__Box__Group_7__2__Impl rule__Box__Group_7__3 )
            // InternalECFDL.g:2204:2: rule__Box__Group_7__2__Impl rule__Box__Group_7__3
            {
            pushFollow(FOLLOW_20);
            rule__Box__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Box__Group_7__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_7__2"


    // $ANTLR start "rule__Box__Group_7__2__Impl"
    // InternalECFDL.g:2211:1: rule__Box__Group_7__2__Impl : ( ( rule__Box__GroupboxAssignment_7_2 ) ) ;
    public final void rule__Box__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:2215:1: ( ( ( rule__Box__GroupboxAssignment_7_2 ) ) )
            // InternalECFDL.g:2216:1: ( ( rule__Box__GroupboxAssignment_7_2 ) )
            {
            // InternalECFDL.g:2216:1: ( ( rule__Box__GroupboxAssignment_7_2 ) )
            // InternalECFDL.g:2217:2: ( rule__Box__GroupboxAssignment_7_2 )
            {
             before(grammarAccess.getBoxAccess().getGroupboxAssignment_7_2()); 
            // InternalECFDL.g:2218:2: ( rule__Box__GroupboxAssignment_7_2 )
            // InternalECFDL.g:2218:3: rule__Box__GroupboxAssignment_7_2
            {
            pushFollow(FOLLOW_2);
            rule__Box__GroupboxAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getBoxAccess().getGroupboxAssignment_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_7__2__Impl"


    // $ANTLR start "rule__Box__Group_7__3"
    // InternalECFDL.g:2226:1: rule__Box__Group_7__3 : rule__Box__Group_7__3__Impl rule__Box__Group_7__4 ;
    public final void rule__Box__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:2230:1: ( rule__Box__Group_7__3__Impl rule__Box__Group_7__4 )
            // InternalECFDL.g:2231:2: rule__Box__Group_7__3__Impl rule__Box__Group_7__4
            {
            pushFollow(FOLLOW_20);
            rule__Box__Group_7__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Box__Group_7__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_7__3"


    // $ANTLR start "rule__Box__Group_7__3__Impl"
    // InternalECFDL.g:2238:1: rule__Box__Group_7__3__Impl : ( ( rule__Box__Group_7_3__0 )* ) ;
    public final void rule__Box__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:2242:1: ( ( ( rule__Box__Group_7_3__0 )* ) )
            // InternalECFDL.g:2243:1: ( ( rule__Box__Group_7_3__0 )* )
            {
            // InternalECFDL.g:2243:1: ( ( rule__Box__Group_7_3__0 )* )
            // InternalECFDL.g:2244:2: ( rule__Box__Group_7_3__0 )*
            {
             before(grammarAccess.getBoxAccess().getGroup_7_3()); 
            // InternalECFDL.g:2245:2: ( rule__Box__Group_7_3__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==14) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalECFDL.g:2245:3: rule__Box__Group_7_3__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Box__Group_7_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getBoxAccess().getGroup_7_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_7__3__Impl"


    // $ANTLR start "rule__Box__Group_7__4"
    // InternalECFDL.g:2253:1: rule__Box__Group_7__4 : rule__Box__Group_7__4__Impl ;
    public final void rule__Box__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:2257:1: ( rule__Box__Group_7__4__Impl )
            // InternalECFDL.g:2258:2: rule__Box__Group_7__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Box__Group_7__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_7__4"


    // $ANTLR start "rule__Box__Group_7__4__Impl"
    // InternalECFDL.g:2264:1: rule__Box__Group_7__4__Impl : ( ')' ) ;
    public final void rule__Box__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:2268:1: ( ( ')' ) )
            // InternalECFDL.g:2269:1: ( ')' )
            {
            // InternalECFDL.g:2269:1: ( ')' )
            // InternalECFDL.g:2270:2: ')'
            {
             before(grammarAccess.getBoxAccess().getRightParenthesisKeyword_7_4()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getBoxAccess().getRightParenthesisKeyword_7_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_7__4__Impl"


    // $ANTLR start "rule__Box__Group_7_3__0"
    // InternalECFDL.g:2280:1: rule__Box__Group_7_3__0 : rule__Box__Group_7_3__0__Impl rule__Box__Group_7_3__1 ;
    public final void rule__Box__Group_7_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:2284:1: ( rule__Box__Group_7_3__0__Impl rule__Box__Group_7_3__1 )
            // InternalECFDL.g:2285:2: rule__Box__Group_7_3__0__Impl rule__Box__Group_7_3__1
            {
            pushFollow(FOLLOW_8);
            rule__Box__Group_7_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Box__Group_7_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_7_3__0"


    // $ANTLR start "rule__Box__Group_7_3__0__Impl"
    // InternalECFDL.g:2292:1: rule__Box__Group_7_3__0__Impl : ( ',' ) ;
    public final void rule__Box__Group_7_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:2296:1: ( ( ',' ) )
            // InternalECFDL.g:2297:1: ( ',' )
            {
            // InternalECFDL.g:2297:1: ( ',' )
            // InternalECFDL.g:2298:2: ','
            {
             before(grammarAccess.getBoxAccess().getCommaKeyword_7_3_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getBoxAccess().getCommaKeyword_7_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_7_3__0__Impl"


    // $ANTLR start "rule__Box__Group_7_3__1"
    // InternalECFDL.g:2307:1: rule__Box__Group_7_3__1 : rule__Box__Group_7_3__1__Impl ;
    public final void rule__Box__Group_7_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:2311:1: ( rule__Box__Group_7_3__1__Impl )
            // InternalECFDL.g:2312:2: rule__Box__Group_7_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Box__Group_7_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_7_3__1"


    // $ANTLR start "rule__Box__Group_7_3__1__Impl"
    // InternalECFDL.g:2318:1: rule__Box__Group_7_3__1__Impl : ( ( rule__Box__GroupboxAssignment_7_3_1 ) ) ;
    public final void rule__Box__Group_7_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:2322:1: ( ( ( rule__Box__GroupboxAssignment_7_3_1 ) ) )
            // InternalECFDL.g:2323:1: ( ( rule__Box__GroupboxAssignment_7_3_1 ) )
            {
            // InternalECFDL.g:2323:1: ( ( rule__Box__GroupboxAssignment_7_3_1 ) )
            // InternalECFDL.g:2324:2: ( rule__Box__GroupboxAssignment_7_3_1 )
            {
             before(grammarAccess.getBoxAccess().getGroupboxAssignment_7_3_1()); 
            // InternalECFDL.g:2325:2: ( rule__Box__GroupboxAssignment_7_3_1 )
            // InternalECFDL.g:2325:3: rule__Box__GroupboxAssignment_7_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Box__GroupboxAssignment_7_3_1();

            state._fsp--;


            }

             after(grammarAccess.getBoxAccess().getGroupboxAssignment_7_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_7_3__1__Impl"


    // $ANTLR start "rule__Box__Group_8__0"
    // InternalECFDL.g:2334:1: rule__Box__Group_8__0 : rule__Box__Group_8__0__Impl rule__Box__Group_8__1 ;
    public final void rule__Box__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:2338:1: ( rule__Box__Group_8__0__Impl rule__Box__Group_8__1 )
            // InternalECFDL.g:2339:2: rule__Box__Group_8__0__Impl rule__Box__Group_8__1
            {
            pushFollow(FOLLOW_16);
            rule__Box__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Box__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_8__0"


    // $ANTLR start "rule__Box__Group_8__0__Impl"
    // InternalECFDL.g:2346:1: rule__Box__Group_8__0__Impl : ( 'motherOf' ) ;
    public final void rule__Box__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:2350:1: ( ( 'motherOf' ) )
            // InternalECFDL.g:2351:1: ( 'motherOf' )
            {
            // InternalECFDL.g:2351:1: ( 'motherOf' )
            // InternalECFDL.g:2352:2: 'motherOf'
            {
             before(grammarAccess.getBoxAccess().getMotherOfKeyword_8_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getBoxAccess().getMotherOfKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_8__0__Impl"


    // $ANTLR start "rule__Box__Group_8__1"
    // InternalECFDL.g:2361:1: rule__Box__Group_8__1 : rule__Box__Group_8__1__Impl rule__Box__Group_8__2 ;
    public final void rule__Box__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:2365:1: ( rule__Box__Group_8__1__Impl rule__Box__Group_8__2 )
            // InternalECFDL.g:2366:2: rule__Box__Group_8__1__Impl rule__Box__Group_8__2
            {
            pushFollow(FOLLOW_8);
            rule__Box__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Box__Group_8__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_8__1"


    // $ANTLR start "rule__Box__Group_8__1__Impl"
    // InternalECFDL.g:2373:1: rule__Box__Group_8__1__Impl : ( '(' ) ;
    public final void rule__Box__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:2377:1: ( ( '(' ) )
            // InternalECFDL.g:2378:1: ( '(' )
            {
            // InternalECFDL.g:2378:1: ( '(' )
            // InternalECFDL.g:2379:2: '('
            {
             before(grammarAccess.getBoxAccess().getLeftParenthesisKeyword_8_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getBoxAccess().getLeftParenthesisKeyword_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_8__1__Impl"


    // $ANTLR start "rule__Box__Group_8__2"
    // InternalECFDL.g:2388:1: rule__Box__Group_8__2 : rule__Box__Group_8__2__Impl rule__Box__Group_8__3 ;
    public final void rule__Box__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:2392:1: ( rule__Box__Group_8__2__Impl rule__Box__Group_8__3 )
            // InternalECFDL.g:2393:2: rule__Box__Group_8__2__Impl rule__Box__Group_8__3
            {
            pushFollow(FOLLOW_20);
            rule__Box__Group_8__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Box__Group_8__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_8__2"


    // $ANTLR start "rule__Box__Group_8__2__Impl"
    // InternalECFDL.g:2400:1: rule__Box__Group_8__2__Impl : ( ( rule__Box__ChildBoxAssignment_8_2 ) ) ;
    public final void rule__Box__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:2404:1: ( ( ( rule__Box__ChildBoxAssignment_8_2 ) ) )
            // InternalECFDL.g:2405:1: ( ( rule__Box__ChildBoxAssignment_8_2 ) )
            {
            // InternalECFDL.g:2405:1: ( ( rule__Box__ChildBoxAssignment_8_2 ) )
            // InternalECFDL.g:2406:2: ( rule__Box__ChildBoxAssignment_8_2 )
            {
             before(grammarAccess.getBoxAccess().getChildBoxAssignment_8_2()); 
            // InternalECFDL.g:2407:2: ( rule__Box__ChildBoxAssignment_8_2 )
            // InternalECFDL.g:2407:3: rule__Box__ChildBoxAssignment_8_2
            {
            pushFollow(FOLLOW_2);
            rule__Box__ChildBoxAssignment_8_2();

            state._fsp--;


            }

             after(grammarAccess.getBoxAccess().getChildBoxAssignment_8_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_8__2__Impl"


    // $ANTLR start "rule__Box__Group_8__3"
    // InternalECFDL.g:2415:1: rule__Box__Group_8__3 : rule__Box__Group_8__3__Impl rule__Box__Group_8__4 ;
    public final void rule__Box__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:2419:1: ( rule__Box__Group_8__3__Impl rule__Box__Group_8__4 )
            // InternalECFDL.g:2420:2: rule__Box__Group_8__3__Impl rule__Box__Group_8__4
            {
            pushFollow(FOLLOW_20);
            rule__Box__Group_8__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Box__Group_8__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_8__3"


    // $ANTLR start "rule__Box__Group_8__3__Impl"
    // InternalECFDL.g:2427:1: rule__Box__Group_8__3__Impl : ( ( rule__Box__Group_8_3__0 )* ) ;
    public final void rule__Box__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:2431:1: ( ( ( rule__Box__Group_8_3__0 )* ) )
            // InternalECFDL.g:2432:1: ( ( rule__Box__Group_8_3__0 )* )
            {
            // InternalECFDL.g:2432:1: ( ( rule__Box__Group_8_3__0 )* )
            // InternalECFDL.g:2433:2: ( rule__Box__Group_8_3__0 )*
            {
             before(grammarAccess.getBoxAccess().getGroup_8_3()); 
            // InternalECFDL.g:2434:2: ( rule__Box__Group_8_3__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==14) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalECFDL.g:2434:3: rule__Box__Group_8_3__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Box__Group_8_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getBoxAccess().getGroup_8_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_8__3__Impl"


    // $ANTLR start "rule__Box__Group_8__4"
    // InternalECFDL.g:2442:1: rule__Box__Group_8__4 : rule__Box__Group_8__4__Impl ;
    public final void rule__Box__Group_8__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:2446:1: ( rule__Box__Group_8__4__Impl )
            // InternalECFDL.g:2447:2: rule__Box__Group_8__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Box__Group_8__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_8__4"


    // $ANTLR start "rule__Box__Group_8__4__Impl"
    // InternalECFDL.g:2453:1: rule__Box__Group_8__4__Impl : ( ')' ) ;
    public final void rule__Box__Group_8__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:2457:1: ( ( ')' ) )
            // InternalECFDL.g:2458:1: ( ')' )
            {
            // InternalECFDL.g:2458:1: ( ')' )
            // InternalECFDL.g:2459:2: ')'
            {
             before(grammarAccess.getBoxAccess().getRightParenthesisKeyword_8_4()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getBoxAccess().getRightParenthesisKeyword_8_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_8__4__Impl"


    // $ANTLR start "rule__Box__Group_8_3__0"
    // InternalECFDL.g:2469:1: rule__Box__Group_8_3__0 : rule__Box__Group_8_3__0__Impl rule__Box__Group_8_3__1 ;
    public final void rule__Box__Group_8_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:2473:1: ( rule__Box__Group_8_3__0__Impl rule__Box__Group_8_3__1 )
            // InternalECFDL.g:2474:2: rule__Box__Group_8_3__0__Impl rule__Box__Group_8_3__1
            {
            pushFollow(FOLLOW_8);
            rule__Box__Group_8_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Box__Group_8_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_8_3__0"


    // $ANTLR start "rule__Box__Group_8_3__0__Impl"
    // InternalECFDL.g:2481:1: rule__Box__Group_8_3__0__Impl : ( ',' ) ;
    public final void rule__Box__Group_8_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:2485:1: ( ( ',' ) )
            // InternalECFDL.g:2486:1: ( ',' )
            {
            // InternalECFDL.g:2486:1: ( ',' )
            // InternalECFDL.g:2487:2: ','
            {
             before(grammarAccess.getBoxAccess().getCommaKeyword_8_3_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getBoxAccess().getCommaKeyword_8_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_8_3__0__Impl"


    // $ANTLR start "rule__Box__Group_8_3__1"
    // InternalECFDL.g:2496:1: rule__Box__Group_8_3__1 : rule__Box__Group_8_3__1__Impl ;
    public final void rule__Box__Group_8_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:2500:1: ( rule__Box__Group_8_3__1__Impl )
            // InternalECFDL.g:2501:2: rule__Box__Group_8_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Box__Group_8_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_8_3__1"


    // $ANTLR start "rule__Box__Group_8_3__1__Impl"
    // InternalECFDL.g:2507:1: rule__Box__Group_8_3__1__Impl : ( ( rule__Box__ChildBoxAssignment_8_3_1 ) ) ;
    public final void rule__Box__Group_8_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:2511:1: ( ( ( rule__Box__ChildBoxAssignment_8_3_1 ) ) )
            // InternalECFDL.g:2512:1: ( ( rule__Box__ChildBoxAssignment_8_3_1 ) )
            {
            // InternalECFDL.g:2512:1: ( ( rule__Box__ChildBoxAssignment_8_3_1 ) )
            // InternalECFDL.g:2513:2: ( rule__Box__ChildBoxAssignment_8_3_1 )
            {
             before(grammarAccess.getBoxAccess().getChildBoxAssignment_8_3_1()); 
            // InternalECFDL.g:2514:2: ( rule__Box__ChildBoxAssignment_8_3_1 )
            // InternalECFDL.g:2514:3: rule__Box__ChildBoxAssignment_8_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Box__ChildBoxAssignment_8_3_1();

            state._fsp--;


            }

             after(grammarAccess.getBoxAccess().getChildBoxAssignment_8_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_8_3__1__Impl"


    // $ANTLR start "rule__Box__Group_9__0"
    // InternalECFDL.g:2523:1: rule__Box__Group_9__0 : rule__Box__Group_9__0__Impl rule__Box__Group_9__1 ;
    public final void rule__Box__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:2527:1: ( rule__Box__Group_9__0__Impl rule__Box__Group_9__1 )
            // InternalECFDL.g:2528:2: rule__Box__Group_9__0__Impl rule__Box__Group_9__1
            {
            pushFollow(FOLLOW_16);
            rule__Box__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Box__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_9__0"


    // $ANTLR start "rule__Box__Group_9__0__Impl"
    // InternalECFDL.g:2535:1: rule__Box__Group_9__0__Impl : ( 'motherOfGroup' ) ;
    public final void rule__Box__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:2539:1: ( ( 'motherOfGroup' ) )
            // InternalECFDL.g:2540:1: ( 'motherOfGroup' )
            {
            // InternalECFDL.g:2540:1: ( 'motherOfGroup' )
            // InternalECFDL.g:2541:2: 'motherOfGroup'
            {
             before(grammarAccess.getBoxAccess().getMotherOfGroupKeyword_9_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getBoxAccess().getMotherOfGroupKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_9__0__Impl"


    // $ANTLR start "rule__Box__Group_9__1"
    // InternalECFDL.g:2550:1: rule__Box__Group_9__1 : rule__Box__Group_9__1__Impl rule__Box__Group_9__2 ;
    public final void rule__Box__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:2554:1: ( rule__Box__Group_9__1__Impl rule__Box__Group_9__2 )
            // InternalECFDL.g:2555:2: rule__Box__Group_9__1__Impl rule__Box__Group_9__2
            {
            pushFollow(FOLLOW_8);
            rule__Box__Group_9__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Box__Group_9__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_9__1"


    // $ANTLR start "rule__Box__Group_9__1__Impl"
    // InternalECFDL.g:2562:1: rule__Box__Group_9__1__Impl : ( '(' ) ;
    public final void rule__Box__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:2566:1: ( ( '(' ) )
            // InternalECFDL.g:2567:1: ( '(' )
            {
            // InternalECFDL.g:2567:1: ( '(' )
            // InternalECFDL.g:2568:2: '('
            {
             before(grammarAccess.getBoxAccess().getLeftParenthesisKeyword_9_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getBoxAccess().getLeftParenthesisKeyword_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_9__1__Impl"


    // $ANTLR start "rule__Box__Group_9__2"
    // InternalECFDL.g:2577:1: rule__Box__Group_9__2 : rule__Box__Group_9__2__Impl rule__Box__Group_9__3 ;
    public final void rule__Box__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:2581:1: ( rule__Box__Group_9__2__Impl rule__Box__Group_9__3 )
            // InternalECFDL.g:2582:2: rule__Box__Group_9__2__Impl rule__Box__Group_9__3
            {
            pushFollow(FOLLOW_20);
            rule__Box__Group_9__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Box__Group_9__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_9__2"


    // $ANTLR start "rule__Box__Group_9__2__Impl"
    // InternalECFDL.g:2589:1: rule__Box__Group_9__2__Impl : ( ( rule__Box__ChildGroupAssignment_9_2 ) ) ;
    public final void rule__Box__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:2593:1: ( ( ( rule__Box__ChildGroupAssignment_9_2 ) ) )
            // InternalECFDL.g:2594:1: ( ( rule__Box__ChildGroupAssignment_9_2 ) )
            {
            // InternalECFDL.g:2594:1: ( ( rule__Box__ChildGroupAssignment_9_2 ) )
            // InternalECFDL.g:2595:2: ( rule__Box__ChildGroupAssignment_9_2 )
            {
             before(grammarAccess.getBoxAccess().getChildGroupAssignment_9_2()); 
            // InternalECFDL.g:2596:2: ( rule__Box__ChildGroupAssignment_9_2 )
            // InternalECFDL.g:2596:3: rule__Box__ChildGroupAssignment_9_2
            {
            pushFollow(FOLLOW_2);
            rule__Box__ChildGroupAssignment_9_2();

            state._fsp--;


            }

             after(grammarAccess.getBoxAccess().getChildGroupAssignment_9_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_9__2__Impl"


    // $ANTLR start "rule__Box__Group_9__3"
    // InternalECFDL.g:2604:1: rule__Box__Group_9__3 : rule__Box__Group_9__3__Impl rule__Box__Group_9__4 ;
    public final void rule__Box__Group_9__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:2608:1: ( rule__Box__Group_9__3__Impl rule__Box__Group_9__4 )
            // InternalECFDL.g:2609:2: rule__Box__Group_9__3__Impl rule__Box__Group_9__4
            {
            pushFollow(FOLLOW_20);
            rule__Box__Group_9__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Box__Group_9__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_9__3"


    // $ANTLR start "rule__Box__Group_9__3__Impl"
    // InternalECFDL.g:2616:1: rule__Box__Group_9__3__Impl : ( ( rule__Box__Group_9_3__0 )* ) ;
    public final void rule__Box__Group_9__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:2620:1: ( ( ( rule__Box__Group_9_3__0 )* ) )
            // InternalECFDL.g:2621:1: ( ( rule__Box__Group_9_3__0 )* )
            {
            // InternalECFDL.g:2621:1: ( ( rule__Box__Group_9_3__0 )* )
            // InternalECFDL.g:2622:2: ( rule__Box__Group_9_3__0 )*
            {
             before(grammarAccess.getBoxAccess().getGroup_9_3()); 
            // InternalECFDL.g:2623:2: ( rule__Box__Group_9_3__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==14) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalECFDL.g:2623:3: rule__Box__Group_9_3__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Box__Group_9_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getBoxAccess().getGroup_9_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_9__3__Impl"


    // $ANTLR start "rule__Box__Group_9__4"
    // InternalECFDL.g:2631:1: rule__Box__Group_9__4 : rule__Box__Group_9__4__Impl ;
    public final void rule__Box__Group_9__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:2635:1: ( rule__Box__Group_9__4__Impl )
            // InternalECFDL.g:2636:2: rule__Box__Group_9__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Box__Group_9__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_9__4"


    // $ANTLR start "rule__Box__Group_9__4__Impl"
    // InternalECFDL.g:2642:1: rule__Box__Group_9__4__Impl : ( ')' ) ;
    public final void rule__Box__Group_9__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:2646:1: ( ( ')' ) )
            // InternalECFDL.g:2647:1: ( ')' )
            {
            // InternalECFDL.g:2647:1: ( ')' )
            // InternalECFDL.g:2648:2: ')'
            {
             before(grammarAccess.getBoxAccess().getRightParenthesisKeyword_9_4()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getBoxAccess().getRightParenthesisKeyword_9_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_9__4__Impl"


    // $ANTLR start "rule__Box__Group_9_3__0"
    // InternalECFDL.g:2658:1: rule__Box__Group_9_3__0 : rule__Box__Group_9_3__0__Impl rule__Box__Group_9_3__1 ;
    public final void rule__Box__Group_9_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:2662:1: ( rule__Box__Group_9_3__0__Impl rule__Box__Group_9_3__1 )
            // InternalECFDL.g:2663:2: rule__Box__Group_9_3__0__Impl rule__Box__Group_9_3__1
            {
            pushFollow(FOLLOW_8);
            rule__Box__Group_9_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Box__Group_9_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_9_3__0"


    // $ANTLR start "rule__Box__Group_9_3__0__Impl"
    // InternalECFDL.g:2670:1: rule__Box__Group_9_3__0__Impl : ( ',' ) ;
    public final void rule__Box__Group_9_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:2674:1: ( ( ',' ) )
            // InternalECFDL.g:2675:1: ( ',' )
            {
            // InternalECFDL.g:2675:1: ( ',' )
            // InternalECFDL.g:2676:2: ','
            {
             before(grammarAccess.getBoxAccess().getCommaKeyword_9_3_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getBoxAccess().getCommaKeyword_9_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_9_3__0__Impl"


    // $ANTLR start "rule__Box__Group_9_3__1"
    // InternalECFDL.g:2685:1: rule__Box__Group_9_3__1 : rule__Box__Group_9_3__1__Impl ;
    public final void rule__Box__Group_9_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:2689:1: ( rule__Box__Group_9_3__1__Impl )
            // InternalECFDL.g:2690:2: rule__Box__Group_9_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Box__Group_9_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_9_3__1"


    // $ANTLR start "rule__Box__Group_9_3__1__Impl"
    // InternalECFDL.g:2696:1: rule__Box__Group_9_3__1__Impl : ( ( rule__Box__ChildGroupAssignment_9_3_1 ) ) ;
    public final void rule__Box__Group_9_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:2700:1: ( ( ( rule__Box__ChildGroupAssignment_9_3_1 ) ) )
            // InternalECFDL.g:2701:1: ( ( rule__Box__ChildGroupAssignment_9_3_1 ) )
            {
            // InternalECFDL.g:2701:1: ( ( rule__Box__ChildGroupAssignment_9_3_1 ) )
            // InternalECFDL.g:2702:2: ( rule__Box__ChildGroupAssignment_9_3_1 )
            {
             before(grammarAccess.getBoxAccess().getChildGroupAssignment_9_3_1()); 
            // InternalECFDL.g:2703:2: ( rule__Box__ChildGroupAssignment_9_3_1 )
            // InternalECFDL.g:2703:3: rule__Box__ChildGroupAssignment_9_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Box__ChildGroupAssignment_9_3_1();

            state._fsp--;


            }

             after(grammarAccess.getBoxAccess().getChildGroupAssignment_9_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_9_3__1__Impl"


    // $ANTLR start "rule__Box__Group_10__0"
    // InternalECFDL.g:2712:1: rule__Box__Group_10__0 : rule__Box__Group_10__0__Impl rule__Box__Group_10__1 ;
    public final void rule__Box__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:2716:1: ( rule__Box__Group_10__0__Impl rule__Box__Group_10__1 )
            // InternalECFDL.g:2717:2: rule__Box__Group_10__0__Impl rule__Box__Group_10__1
            {
            pushFollow(FOLLOW_16);
            rule__Box__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Box__Group_10__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_10__0"


    // $ANTLR start "rule__Box__Group_10__0__Impl"
    // InternalECFDL.g:2724:1: rule__Box__Group_10__0__Impl : ( 'mutex' ) ;
    public final void rule__Box__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:2728:1: ( ( 'mutex' ) )
            // InternalECFDL.g:2729:1: ( 'mutex' )
            {
            // InternalECFDL.g:2729:1: ( 'mutex' )
            // InternalECFDL.g:2730:2: 'mutex'
            {
             before(grammarAccess.getBoxAccess().getMutexKeyword_10_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getBoxAccess().getMutexKeyword_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_10__0__Impl"


    // $ANTLR start "rule__Box__Group_10__1"
    // InternalECFDL.g:2739:1: rule__Box__Group_10__1 : rule__Box__Group_10__1__Impl rule__Box__Group_10__2 ;
    public final void rule__Box__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:2743:1: ( rule__Box__Group_10__1__Impl rule__Box__Group_10__2 )
            // InternalECFDL.g:2744:2: rule__Box__Group_10__1__Impl rule__Box__Group_10__2
            {
            pushFollow(FOLLOW_8);
            rule__Box__Group_10__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Box__Group_10__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_10__1"


    // $ANTLR start "rule__Box__Group_10__1__Impl"
    // InternalECFDL.g:2751:1: rule__Box__Group_10__1__Impl : ( '(' ) ;
    public final void rule__Box__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:2755:1: ( ( '(' ) )
            // InternalECFDL.g:2756:1: ( '(' )
            {
            // InternalECFDL.g:2756:1: ( '(' )
            // InternalECFDL.g:2757:2: '('
            {
             before(grammarAccess.getBoxAccess().getLeftParenthesisKeyword_10_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getBoxAccess().getLeftParenthesisKeyword_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_10__1__Impl"


    // $ANTLR start "rule__Box__Group_10__2"
    // InternalECFDL.g:2766:1: rule__Box__Group_10__2 : rule__Box__Group_10__2__Impl rule__Box__Group_10__3 ;
    public final void rule__Box__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:2770:1: ( rule__Box__Group_10__2__Impl rule__Box__Group_10__3 )
            // InternalECFDL.g:2771:2: rule__Box__Group_10__2__Impl rule__Box__Group_10__3
            {
            pushFollow(FOLLOW_20);
            rule__Box__Group_10__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Box__Group_10__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_10__2"


    // $ANTLR start "rule__Box__Group_10__2__Impl"
    // InternalECFDL.g:2778:1: rule__Box__Group_10__2__Impl : ( ( rule__Box__MutexAssignment_10_2 ) ) ;
    public final void rule__Box__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:2782:1: ( ( ( rule__Box__MutexAssignment_10_2 ) ) )
            // InternalECFDL.g:2783:1: ( ( rule__Box__MutexAssignment_10_2 ) )
            {
            // InternalECFDL.g:2783:1: ( ( rule__Box__MutexAssignment_10_2 ) )
            // InternalECFDL.g:2784:2: ( rule__Box__MutexAssignment_10_2 )
            {
             before(grammarAccess.getBoxAccess().getMutexAssignment_10_2()); 
            // InternalECFDL.g:2785:2: ( rule__Box__MutexAssignment_10_2 )
            // InternalECFDL.g:2785:3: rule__Box__MutexAssignment_10_2
            {
            pushFollow(FOLLOW_2);
            rule__Box__MutexAssignment_10_2();

            state._fsp--;


            }

             after(grammarAccess.getBoxAccess().getMutexAssignment_10_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_10__2__Impl"


    // $ANTLR start "rule__Box__Group_10__3"
    // InternalECFDL.g:2793:1: rule__Box__Group_10__3 : rule__Box__Group_10__3__Impl rule__Box__Group_10__4 ;
    public final void rule__Box__Group_10__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:2797:1: ( rule__Box__Group_10__3__Impl rule__Box__Group_10__4 )
            // InternalECFDL.g:2798:2: rule__Box__Group_10__3__Impl rule__Box__Group_10__4
            {
            pushFollow(FOLLOW_20);
            rule__Box__Group_10__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Box__Group_10__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_10__3"


    // $ANTLR start "rule__Box__Group_10__3__Impl"
    // InternalECFDL.g:2805:1: rule__Box__Group_10__3__Impl : ( ( rule__Box__Group_10_3__0 )* ) ;
    public final void rule__Box__Group_10__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:2809:1: ( ( ( rule__Box__Group_10_3__0 )* ) )
            // InternalECFDL.g:2810:1: ( ( rule__Box__Group_10_3__0 )* )
            {
            // InternalECFDL.g:2810:1: ( ( rule__Box__Group_10_3__0 )* )
            // InternalECFDL.g:2811:2: ( rule__Box__Group_10_3__0 )*
            {
             before(grammarAccess.getBoxAccess().getGroup_10_3()); 
            // InternalECFDL.g:2812:2: ( rule__Box__Group_10_3__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==14) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalECFDL.g:2812:3: rule__Box__Group_10_3__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Box__Group_10_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getBoxAccess().getGroup_10_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_10__3__Impl"


    // $ANTLR start "rule__Box__Group_10__4"
    // InternalECFDL.g:2820:1: rule__Box__Group_10__4 : rule__Box__Group_10__4__Impl ;
    public final void rule__Box__Group_10__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:2824:1: ( rule__Box__Group_10__4__Impl )
            // InternalECFDL.g:2825:2: rule__Box__Group_10__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Box__Group_10__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_10__4"


    // $ANTLR start "rule__Box__Group_10__4__Impl"
    // InternalECFDL.g:2831:1: rule__Box__Group_10__4__Impl : ( ')' ) ;
    public final void rule__Box__Group_10__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:2835:1: ( ( ')' ) )
            // InternalECFDL.g:2836:1: ( ')' )
            {
            // InternalECFDL.g:2836:1: ( ')' )
            // InternalECFDL.g:2837:2: ')'
            {
             before(grammarAccess.getBoxAccess().getRightParenthesisKeyword_10_4()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getBoxAccess().getRightParenthesisKeyword_10_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_10__4__Impl"


    // $ANTLR start "rule__Box__Group_10_3__0"
    // InternalECFDL.g:2847:1: rule__Box__Group_10_3__0 : rule__Box__Group_10_3__0__Impl rule__Box__Group_10_3__1 ;
    public final void rule__Box__Group_10_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:2851:1: ( rule__Box__Group_10_3__0__Impl rule__Box__Group_10_3__1 )
            // InternalECFDL.g:2852:2: rule__Box__Group_10_3__0__Impl rule__Box__Group_10_3__1
            {
            pushFollow(FOLLOW_8);
            rule__Box__Group_10_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Box__Group_10_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_10_3__0"


    // $ANTLR start "rule__Box__Group_10_3__0__Impl"
    // InternalECFDL.g:2859:1: rule__Box__Group_10_3__0__Impl : ( ',' ) ;
    public final void rule__Box__Group_10_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:2863:1: ( ( ',' ) )
            // InternalECFDL.g:2864:1: ( ',' )
            {
            // InternalECFDL.g:2864:1: ( ',' )
            // InternalECFDL.g:2865:2: ','
            {
             before(grammarAccess.getBoxAccess().getCommaKeyword_10_3_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getBoxAccess().getCommaKeyword_10_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_10_3__0__Impl"


    // $ANTLR start "rule__Box__Group_10_3__1"
    // InternalECFDL.g:2874:1: rule__Box__Group_10_3__1 : rule__Box__Group_10_3__1__Impl ;
    public final void rule__Box__Group_10_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:2878:1: ( rule__Box__Group_10_3__1__Impl )
            // InternalECFDL.g:2879:2: rule__Box__Group_10_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Box__Group_10_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_10_3__1"


    // $ANTLR start "rule__Box__Group_10_3__1__Impl"
    // InternalECFDL.g:2885:1: rule__Box__Group_10_3__1__Impl : ( ( rule__Box__MutexAssignment_10_3_1 ) ) ;
    public final void rule__Box__Group_10_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:2889:1: ( ( ( rule__Box__MutexAssignment_10_3_1 ) ) )
            // InternalECFDL.g:2890:1: ( ( rule__Box__MutexAssignment_10_3_1 ) )
            {
            // InternalECFDL.g:2890:1: ( ( rule__Box__MutexAssignment_10_3_1 ) )
            // InternalECFDL.g:2891:2: ( rule__Box__MutexAssignment_10_3_1 )
            {
             before(grammarAccess.getBoxAccess().getMutexAssignment_10_3_1()); 
            // InternalECFDL.g:2892:2: ( rule__Box__MutexAssignment_10_3_1 )
            // InternalECFDL.g:2892:3: rule__Box__MutexAssignment_10_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Box__MutexAssignment_10_3_1();

            state._fsp--;


            }

             after(grammarAccess.getBoxAccess().getMutexAssignment_10_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_10_3__1__Impl"


    // $ANTLR start "rule__Box__Group_11__0"
    // InternalECFDL.g:2901:1: rule__Box__Group_11__0 : rule__Box__Group_11__0__Impl rule__Box__Group_11__1 ;
    public final void rule__Box__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:2905:1: ( rule__Box__Group_11__0__Impl rule__Box__Group_11__1 )
            // InternalECFDL.g:2906:2: rule__Box__Group_11__0__Impl rule__Box__Group_11__1
            {
            pushFollow(FOLLOW_16);
            rule__Box__Group_11__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Box__Group_11__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_11__0"


    // $ANTLR start "rule__Box__Group_11__0__Impl"
    // InternalECFDL.g:2913:1: rule__Box__Group_11__0__Impl : ( 'features' ) ;
    public final void rule__Box__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:2917:1: ( ( 'features' ) )
            // InternalECFDL.g:2918:1: ( 'features' )
            {
            // InternalECFDL.g:2918:1: ( 'features' )
            // InternalECFDL.g:2919:2: 'features'
            {
             before(grammarAccess.getBoxAccess().getFeaturesKeyword_11_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getBoxAccess().getFeaturesKeyword_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_11__0__Impl"


    // $ANTLR start "rule__Box__Group_11__1"
    // InternalECFDL.g:2928:1: rule__Box__Group_11__1 : rule__Box__Group_11__1__Impl rule__Box__Group_11__2 ;
    public final void rule__Box__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:2932:1: ( rule__Box__Group_11__1__Impl rule__Box__Group_11__2 )
            // InternalECFDL.g:2933:2: rule__Box__Group_11__1__Impl rule__Box__Group_11__2
            {
            pushFollow(FOLLOW_21);
            rule__Box__Group_11__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Box__Group_11__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_11__1"


    // $ANTLR start "rule__Box__Group_11__1__Impl"
    // InternalECFDL.g:2940:1: rule__Box__Group_11__1__Impl : ( '(' ) ;
    public final void rule__Box__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:2944:1: ( ( '(' ) )
            // InternalECFDL.g:2945:1: ( '(' )
            {
            // InternalECFDL.g:2945:1: ( '(' )
            // InternalECFDL.g:2946:2: '('
            {
             before(grammarAccess.getBoxAccess().getLeftParenthesisKeyword_11_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getBoxAccess().getLeftParenthesisKeyword_11_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_11__1__Impl"


    // $ANTLR start "rule__Box__Group_11__2"
    // InternalECFDL.g:2955:1: rule__Box__Group_11__2 : rule__Box__Group_11__2__Impl rule__Box__Group_11__3 ;
    public final void rule__Box__Group_11__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:2959:1: ( rule__Box__Group_11__2__Impl rule__Box__Group_11__3 )
            // InternalECFDL.g:2960:2: rule__Box__Group_11__2__Impl rule__Box__Group_11__3
            {
            pushFollow(FOLLOW_20);
            rule__Box__Group_11__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Box__Group_11__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_11__2"


    // $ANTLR start "rule__Box__Group_11__2__Impl"
    // InternalECFDL.g:2967:1: rule__Box__Group_11__2__Impl : ( ( rule__Box__FeatureAssignment_11_2 ) ) ;
    public final void rule__Box__Group_11__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:2971:1: ( ( ( rule__Box__FeatureAssignment_11_2 ) ) )
            // InternalECFDL.g:2972:1: ( ( rule__Box__FeatureAssignment_11_2 ) )
            {
            // InternalECFDL.g:2972:1: ( ( rule__Box__FeatureAssignment_11_2 ) )
            // InternalECFDL.g:2973:2: ( rule__Box__FeatureAssignment_11_2 )
            {
             before(grammarAccess.getBoxAccess().getFeatureAssignment_11_2()); 
            // InternalECFDL.g:2974:2: ( rule__Box__FeatureAssignment_11_2 )
            // InternalECFDL.g:2974:3: rule__Box__FeatureAssignment_11_2
            {
            pushFollow(FOLLOW_2);
            rule__Box__FeatureAssignment_11_2();

            state._fsp--;


            }

             after(grammarAccess.getBoxAccess().getFeatureAssignment_11_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_11__2__Impl"


    // $ANTLR start "rule__Box__Group_11__3"
    // InternalECFDL.g:2982:1: rule__Box__Group_11__3 : rule__Box__Group_11__3__Impl rule__Box__Group_11__4 ;
    public final void rule__Box__Group_11__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:2986:1: ( rule__Box__Group_11__3__Impl rule__Box__Group_11__4 )
            // InternalECFDL.g:2987:2: rule__Box__Group_11__3__Impl rule__Box__Group_11__4
            {
            pushFollow(FOLLOW_20);
            rule__Box__Group_11__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Box__Group_11__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_11__3"


    // $ANTLR start "rule__Box__Group_11__3__Impl"
    // InternalECFDL.g:2994:1: rule__Box__Group_11__3__Impl : ( ( rule__Box__Group_11_3__0 )* ) ;
    public final void rule__Box__Group_11__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:2998:1: ( ( ( rule__Box__Group_11_3__0 )* ) )
            // InternalECFDL.g:2999:1: ( ( rule__Box__Group_11_3__0 )* )
            {
            // InternalECFDL.g:2999:1: ( ( rule__Box__Group_11_3__0 )* )
            // InternalECFDL.g:3000:2: ( rule__Box__Group_11_3__0 )*
            {
             before(grammarAccess.getBoxAccess().getGroup_11_3()); 
            // InternalECFDL.g:3001:2: ( rule__Box__Group_11_3__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==14) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalECFDL.g:3001:3: rule__Box__Group_11_3__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Box__Group_11_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getBoxAccess().getGroup_11_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_11__3__Impl"


    // $ANTLR start "rule__Box__Group_11__4"
    // InternalECFDL.g:3009:1: rule__Box__Group_11__4 : rule__Box__Group_11__4__Impl ;
    public final void rule__Box__Group_11__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:3013:1: ( rule__Box__Group_11__4__Impl )
            // InternalECFDL.g:3014:2: rule__Box__Group_11__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Box__Group_11__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_11__4"


    // $ANTLR start "rule__Box__Group_11__4__Impl"
    // InternalECFDL.g:3020:1: rule__Box__Group_11__4__Impl : ( ')' ) ;
    public final void rule__Box__Group_11__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:3024:1: ( ( ')' ) )
            // InternalECFDL.g:3025:1: ( ')' )
            {
            // InternalECFDL.g:3025:1: ( ')' )
            // InternalECFDL.g:3026:2: ')'
            {
             before(grammarAccess.getBoxAccess().getRightParenthesisKeyword_11_4()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getBoxAccess().getRightParenthesisKeyword_11_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_11__4__Impl"


    // $ANTLR start "rule__Box__Group_11_3__0"
    // InternalECFDL.g:3036:1: rule__Box__Group_11_3__0 : rule__Box__Group_11_3__0__Impl rule__Box__Group_11_3__1 ;
    public final void rule__Box__Group_11_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:3040:1: ( rule__Box__Group_11_3__0__Impl rule__Box__Group_11_3__1 )
            // InternalECFDL.g:3041:2: rule__Box__Group_11_3__0__Impl rule__Box__Group_11_3__1
            {
            pushFollow(FOLLOW_21);
            rule__Box__Group_11_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Box__Group_11_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_11_3__0"


    // $ANTLR start "rule__Box__Group_11_3__0__Impl"
    // InternalECFDL.g:3048:1: rule__Box__Group_11_3__0__Impl : ( ',' ) ;
    public final void rule__Box__Group_11_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:3052:1: ( ( ',' ) )
            // InternalECFDL.g:3053:1: ( ',' )
            {
            // InternalECFDL.g:3053:1: ( ',' )
            // InternalECFDL.g:3054:2: ','
            {
             before(grammarAccess.getBoxAccess().getCommaKeyword_11_3_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getBoxAccess().getCommaKeyword_11_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_11_3__0__Impl"


    // $ANTLR start "rule__Box__Group_11_3__1"
    // InternalECFDL.g:3063:1: rule__Box__Group_11_3__1 : rule__Box__Group_11_3__1__Impl ;
    public final void rule__Box__Group_11_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:3067:1: ( rule__Box__Group_11_3__1__Impl )
            // InternalECFDL.g:3068:2: rule__Box__Group_11_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Box__Group_11_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_11_3__1"


    // $ANTLR start "rule__Box__Group_11_3__1__Impl"
    // InternalECFDL.g:3074:1: rule__Box__Group_11_3__1__Impl : ( ( rule__Box__FeatureAssignment_11_3_1 ) ) ;
    public final void rule__Box__Group_11_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:3078:1: ( ( ( rule__Box__FeatureAssignment_11_3_1 ) ) )
            // InternalECFDL.g:3079:1: ( ( rule__Box__FeatureAssignment_11_3_1 ) )
            {
            // InternalECFDL.g:3079:1: ( ( rule__Box__FeatureAssignment_11_3_1 ) )
            // InternalECFDL.g:3080:2: ( rule__Box__FeatureAssignment_11_3_1 )
            {
             before(grammarAccess.getBoxAccess().getFeatureAssignment_11_3_1()); 
            // InternalECFDL.g:3081:2: ( rule__Box__FeatureAssignment_11_3_1 )
            // InternalECFDL.g:3081:3: rule__Box__FeatureAssignment_11_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Box__FeatureAssignment_11_3_1();

            state._fsp--;


            }

             after(grammarAccess.getBoxAccess().getFeatureAssignment_11_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_11_3__1__Impl"


    // $ANTLR start "rule__GroupBox__Group__0"
    // InternalECFDL.g:3090:1: rule__GroupBox__Group__0 : rule__GroupBox__Group__0__Impl rule__GroupBox__Group__1 ;
    public final void rule__GroupBox__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:3094:1: ( rule__GroupBox__Group__0__Impl rule__GroupBox__Group__1 )
            // InternalECFDL.g:3095:2: rule__GroupBox__Group__0__Impl rule__GroupBox__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__GroupBox__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GroupBox__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupBox__Group__0"


    // $ANTLR start "rule__GroupBox__Group__0__Impl"
    // InternalECFDL.g:3102:1: rule__GroupBox__Group__0__Impl : ( 'GroupBox' ) ;
    public final void rule__GroupBox__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:3106:1: ( ( 'GroupBox' ) )
            // InternalECFDL.g:3107:1: ( 'GroupBox' )
            {
            // InternalECFDL.g:3107:1: ( 'GroupBox' )
            // InternalECFDL.g:3108:2: 'GroupBox'
            {
             before(grammarAccess.getGroupBoxAccess().getGroupBoxKeyword_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getGroupBoxAccess().getGroupBoxKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupBox__Group__0__Impl"


    // $ANTLR start "rule__GroupBox__Group__1"
    // InternalECFDL.g:3117:1: rule__GroupBox__Group__1 : rule__GroupBox__Group__1__Impl rule__GroupBox__Group__2 ;
    public final void rule__GroupBox__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:3121:1: ( rule__GroupBox__Group__1__Impl rule__GroupBox__Group__2 )
            // InternalECFDL.g:3122:2: rule__GroupBox__Group__1__Impl rule__GroupBox__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__GroupBox__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GroupBox__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupBox__Group__1"


    // $ANTLR start "rule__GroupBox__Group__1__Impl"
    // InternalECFDL.g:3129:1: rule__GroupBox__Group__1__Impl : ( ':' ) ;
    public final void rule__GroupBox__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:3133:1: ( ( ':' ) )
            // InternalECFDL.g:3134:1: ( ':' )
            {
            // InternalECFDL.g:3134:1: ( ':' )
            // InternalECFDL.g:3135:2: ':'
            {
             before(grammarAccess.getGroupBoxAccess().getColonKeyword_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getGroupBoxAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupBox__Group__1__Impl"


    // $ANTLR start "rule__GroupBox__Group__2"
    // InternalECFDL.g:3144:1: rule__GroupBox__Group__2 : rule__GroupBox__Group__2__Impl rule__GroupBox__Group__3 ;
    public final void rule__GroupBox__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:3148:1: ( rule__GroupBox__Group__2__Impl rule__GroupBox__Group__3 )
            // InternalECFDL.g:3149:2: rule__GroupBox__Group__2__Impl rule__GroupBox__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__GroupBox__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GroupBox__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupBox__Group__2"


    // $ANTLR start "rule__GroupBox__Group__2__Impl"
    // InternalECFDL.g:3156:1: rule__GroupBox__Group__2__Impl : ( ( rule__GroupBox__NameAssignment_2 ) ) ;
    public final void rule__GroupBox__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:3160:1: ( ( ( rule__GroupBox__NameAssignment_2 ) ) )
            // InternalECFDL.g:3161:1: ( ( rule__GroupBox__NameAssignment_2 ) )
            {
            // InternalECFDL.g:3161:1: ( ( rule__GroupBox__NameAssignment_2 ) )
            // InternalECFDL.g:3162:2: ( rule__GroupBox__NameAssignment_2 )
            {
             before(grammarAccess.getGroupBoxAccess().getNameAssignment_2()); 
            // InternalECFDL.g:3163:2: ( rule__GroupBox__NameAssignment_2 )
            // InternalECFDL.g:3163:3: rule__GroupBox__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__GroupBox__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getGroupBoxAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupBox__Group__2__Impl"


    // $ANTLR start "rule__GroupBox__Group__3"
    // InternalECFDL.g:3171:1: rule__GroupBox__Group__3 : rule__GroupBox__Group__3__Impl rule__GroupBox__Group__4 ;
    public final void rule__GroupBox__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:3175:1: ( rule__GroupBox__Group__3__Impl rule__GroupBox__Group__4 )
            // InternalECFDL.g:3176:2: rule__GroupBox__Group__3__Impl rule__GroupBox__Group__4
            {
            pushFollow(FOLLOW_22);
            rule__GroupBox__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GroupBox__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupBox__Group__3"


    // $ANTLR start "rule__GroupBox__Group__3__Impl"
    // InternalECFDL.g:3183:1: rule__GroupBox__Group__3__Impl : ( '{' ) ;
    public final void rule__GroupBox__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:3187:1: ( ( '{' ) )
            // InternalECFDL.g:3188:1: ( '{' )
            {
            // InternalECFDL.g:3188:1: ( '{' )
            // InternalECFDL.g:3189:2: '{'
            {
             before(grammarAccess.getGroupBoxAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getGroupBoxAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupBox__Group__3__Impl"


    // $ANTLR start "rule__GroupBox__Group__4"
    // InternalECFDL.g:3198:1: rule__GroupBox__Group__4 : rule__GroupBox__Group__4__Impl rule__GroupBox__Group__5 ;
    public final void rule__GroupBox__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:3202:1: ( rule__GroupBox__Group__4__Impl rule__GroupBox__Group__5 )
            // InternalECFDL.g:3203:2: rule__GroupBox__Group__4__Impl rule__GroupBox__Group__5
            {
            pushFollow(FOLLOW_22);
            rule__GroupBox__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GroupBox__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupBox__Group__4"


    // $ANTLR start "rule__GroupBox__Group__4__Impl"
    // InternalECFDL.g:3210:1: rule__GroupBox__Group__4__Impl : ( ( rule__GroupBox__ExclusifAssignment_4 )? ) ;
    public final void rule__GroupBox__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:3214:1: ( ( ( rule__GroupBox__ExclusifAssignment_4 )? ) )
            // InternalECFDL.g:3215:1: ( ( rule__GroupBox__ExclusifAssignment_4 )? )
            {
            // InternalECFDL.g:3215:1: ( ( rule__GroupBox__ExclusifAssignment_4 )? )
            // InternalECFDL.g:3216:2: ( rule__GroupBox__ExclusifAssignment_4 )?
            {
             before(grammarAccess.getGroupBoxAccess().getExclusifAssignment_4()); 
            // InternalECFDL.g:3217:2: ( rule__GroupBox__ExclusifAssignment_4 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==31) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalECFDL.g:3217:3: rule__GroupBox__ExclusifAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__GroupBox__ExclusifAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGroupBoxAccess().getExclusifAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupBox__Group__4__Impl"


    // $ANTLR start "rule__GroupBox__Group__5"
    // InternalECFDL.g:3225:1: rule__GroupBox__Group__5 : rule__GroupBox__Group__5__Impl rule__GroupBox__Group__6 ;
    public final void rule__GroupBox__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:3229:1: ( rule__GroupBox__Group__5__Impl rule__GroupBox__Group__6 )
            // InternalECFDL.g:3230:2: rule__GroupBox__Group__5__Impl rule__GroupBox__Group__6
            {
            pushFollow(FOLLOW_16);
            rule__GroupBox__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GroupBox__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupBox__Group__5"


    // $ANTLR start "rule__GroupBox__Group__5__Impl"
    // InternalECFDL.g:3237:1: rule__GroupBox__Group__5__Impl : ( 'superBox' ) ;
    public final void rule__GroupBox__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:3241:1: ( ( 'superBox' ) )
            // InternalECFDL.g:3242:1: ( 'superBox' )
            {
            // InternalECFDL.g:3242:1: ( 'superBox' )
            // InternalECFDL.g:3243:2: 'superBox'
            {
             before(grammarAccess.getGroupBoxAccess().getSuperBoxKeyword_5()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getGroupBoxAccess().getSuperBoxKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupBox__Group__5__Impl"


    // $ANTLR start "rule__GroupBox__Group__6"
    // InternalECFDL.g:3252:1: rule__GroupBox__Group__6 : rule__GroupBox__Group__6__Impl rule__GroupBox__Group__7 ;
    public final void rule__GroupBox__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:3256:1: ( rule__GroupBox__Group__6__Impl rule__GroupBox__Group__7 )
            // InternalECFDL.g:3257:2: rule__GroupBox__Group__6__Impl rule__GroupBox__Group__7
            {
            pushFollow(FOLLOW_8);
            rule__GroupBox__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GroupBox__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupBox__Group__6"


    // $ANTLR start "rule__GroupBox__Group__6__Impl"
    // InternalECFDL.g:3264:1: rule__GroupBox__Group__6__Impl : ( '(' ) ;
    public final void rule__GroupBox__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:3268:1: ( ( '(' ) )
            // InternalECFDL.g:3269:1: ( '(' )
            {
            // InternalECFDL.g:3269:1: ( '(' )
            // InternalECFDL.g:3270:2: '('
            {
             before(grammarAccess.getGroupBoxAccess().getLeftParenthesisKeyword_6()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getGroupBoxAccess().getLeftParenthesisKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupBox__Group__6__Impl"


    // $ANTLR start "rule__GroupBox__Group__7"
    // InternalECFDL.g:3279:1: rule__GroupBox__Group__7 : rule__GroupBox__Group__7__Impl rule__GroupBox__Group__8 ;
    public final void rule__GroupBox__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:3283:1: ( rule__GroupBox__Group__7__Impl rule__GroupBox__Group__8 )
            // InternalECFDL.g:3284:2: rule__GroupBox__Group__7__Impl rule__GroupBox__Group__8
            {
            pushFollow(FOLLOW_17);
            rule__GroupBox__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GroupBox__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupBox__Group__7"


    // $ANTLR start "rule__GroupBox__Group__7__Impl"
    // InternalECFDL.g:3291:1: rule__GroupBox__Group__7__Impl : ( ( rule__GroupBox__SuperBoxAssignment_7 ) ) ;
    public final void rule__GroupBox__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:3295:1: ( ( ( rule__GroupBox__SuperBoxAssignment_7 ) ) )
            // InternalECFDL.g:3296:1: ( ( rule__GroupBox__SuperBoxAssignment_7 ) )
            {
            // InternalECFDL.g:3296:1: ( ( rule__GroupBox__SuperBoxAssignment_7 ) )
            // InternalECFDL.g:3297:2: ( rule__GroupBox__SuperBoxAssignment_7 )
            {
             before(grammarAccess.getGroupBoxAccess().getSuperBoxAssignment_7()); 
            // InternalECFDL.g:3298:2: ( rule__GroupBox__SuperBoxAssignment_7 )
            // InternalECFDL.g:3298:3: rule__GroupBox__SuperBoxAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__GroupBox__SuperBoxAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getGroupBoxAccess().getSuperBoxAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupBox__Group__7__Impl"


    // $ANTLR start "rule__GroupBox__Group__8"
    // InternalECFDL.g:3306:1: rule__GroupBox__Group__8 : rule__GroupBox__Group__8__Impl rule__GroupBox__Group__9 ;
    public final void rule__GroupBox__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:3310:1: ( rule__GroupBox__Group__8__Impl rule__GroupBox__Group__9 )
            // InternalECFDL.g:3311:2: rule__GroupBox__Group__8__Impl rule__GroupBox__Group__9
            {
            pushFollow(FOLLOW_9);
            rule__GroupBox__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GroupBox__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupBox__Group__8"


    // $ANTLR start "rule__GroupBox__Group__8__Impl"
    // InternalECFDL.g:3318:1: rule__GroupBox__Group__8__Impl : ( ')' ) ;
    public final void rule__GroupBox__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:3322:1: ( ( ')' ) )
            // InternalECFDL.g:3323:1: ( ')' )
            {
            // InternalECFDL.g:3323:1: ( ')' )
            // InternalECFDL.g:3324:2: ')'
            {
             before(grammarAccess.getGroupBoxAccess().getRightParenthesisKeyword_8()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getGroupBoxAccess().getRightParenthesisKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupBox__Group__8__Impl"


    // $ANTLR start "rule__GroupBox__Group__9"
    // InternalECFDL.g:3333:1: rule__GroupBox__Group__9 : rule__GroupBox__Group__9__Impl rule__GroupBox__Group__10 ;
    public final void rule__GroupBox__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:3337:1: ( rule__GroupBox__Group__9__Impl rule__GroupBox__Group__10 )
            // InternalECFDL.g:3338:2: rule__GroupBox__Group__9__Impl rule__GroupBox__Group__10
            {
            pushFollow(FOLLOW_16);
            rule__GroupBox__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GroupBox__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupBox__Group__9"


    // $ANTLR start "rule__GroupBox__Group__9__Impl"
    // InternalECFDL.g:3345:1: rule__GroupBox__Group__9__Impl : ( 'boxes' ) ;
    public final void rule__GroupBox__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:3349:1: ( ( 'boxes' ) )
            // InternalECFDL.g:3350:1: ( 'boxes' )
            {
            // InternalECFDL.g:3350:1: ( 'boxes' )
            // InternalECFDL.g:3351:2: 'boxes'
            {
             before(grammarAccess.getGroupBoxAccess().getBoxesKeyword_9()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getGroupBoxAccess().getBoxesKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupBox__Group__9__Impl"


    // $ANTLR start "rule__GroupBox__Group__10"
    // InternalECFDL.g:3360:1: rule__GroupBox__Group__10 : rule__GroupBox__Group__10__Impl rule__GroupBox__Group__11 ;
    public final void rule__GroupBox__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:3364:1: ( rule__GroupBox__Group__10__Impl rule__GroupBox__Group__11 )
            // InternalECFDL.g:3365:2: rule__GroupBox__Group__10__Impl rule__GroupBox__Group__11
            {
            pushFollow(FOLLOW_8);
            rule__GroupBox__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GroupBox__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupBox__Group__10"


    // $ANTLR start "rule__GroupBox__Group__10__Impl"
    // InternalECFDL.g:3372:1: rule__GroupBox__Group__10__Impl : ( '(' ) ;
    public final void rule__GroupBox__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:3376:1: ( ( '(' ) )
            // InternalECFDL.g:3377:1: ( '(' )
            {
            // InternalECFDL.g:3377:1: ( '(' )
            // InternalECFDL.g:3378:2: '('
            {
             before(grammarAccess.getGroupBoxAccess().getLeftParenthesisKeyword_10()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getGroupBoxAccess().getLeftParenthesisKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupBox__Group__10__Impl"


    // $ANTLR start "rule__GroupBox__Group__11"
    // InternalECFDL.g:3387:1: rule__GroupBox__Group__11 : rule__GroupBox__Group__11__Impl rule__GroupBox__Group__12 ;
    public final void rule__GroupBox__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:3391:1: ( rule__GroupBox__Group__11__Impl rule__GroupBox__Group__12 )
            // InternalECFDL.g:3392:2: rule__GroupBox__Group__11__Impl rule__GroupBox__Group__12
            {
            pushFollow(FOLLOW_14);
            rule__GroupBox__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GroupBox__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupBox__Group__11"


    // $ANTLR start "rule__GroupBox__Group__11__Impl"
    // InternalECFDL.g:3399:1: rule__GroupBox__Group__11__Impl : ( ( rule__GroupBox__BoxAssignment_11 ) ) ;
    public final void rule__GroupBox__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:3403:1: ( ( ( rule__GroupBox__BoxAssignment_11 ) ) )
            // InternalECFDL.g:3404:1: ( ( rule__GroupBox__BoxAssignment_11 ) )
            {
            // InternalECFDL.g:3404:1: ( ( rule__GroupBox__BoxAssignment_11 ) )
            // InternalECFDL.g:3405:2: ( rule__GroupBox__BoxAssignment_11 )
            {
             before(grammarAccess.getGroupBoxAccess().getBoxAssignment_11()); 
            // InternalECFDL.g:3406:2: ( rule__GroupBox__BoxAssignment_11 )
            // InternalECFDL.g:3406:3: rule__GroupBox__BoxAssignment_11
            {
            pushFollow(FOLLOW_2);
            rule__GroupBox__BoxAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getGroupBoxAccess().getBoxAssignment_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupBox__Group__11__Impl"


    // $ANTLR start "rule__GroupBox__Group__12"
    // InternalECFDL.g:3414:1: rule__GroupBox__Group__12 : rule__GroupBox__Group__12__Impl rule__GroupBox__Group__13 ;
    public final void rule__GroupBox__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:3418:1: ( rule__GroupBox__Group__12__Impl rule__GroupBox__Group__13 )
            // InternalECFDL.g:3419:2: rule__GroupBox__Group__12__Impl rule__GroupBox__Group__13
            {
            pushFollow(FOLLOW_17);
            rule__GroupBox__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GroupBox__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupBox__Group__12"


    // $ANTLR start "rule__GroupBox__Group__12__Impl"
    // InternalECFDL.g:3426:1: rule__GroupBox__Group__12__Impl : ( ( ( rule__GroupBox__Group_12__0 ) ) ( ( rule__GroupBox__Group_12__0 )* ) ) ;
    public final void rule__GroupBox__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:3430:1: ( ( ( ( rule__GroupBox__Group_12__0 ) ) ( ( rule__GroupBox__Group_12__0 )* ) ) )
            // InternalECFDL.g:3431:1: ( ( ( rule__GroupBox__Group_12__0 ) ) ( ( rule__GroupBox__Group_12__0 )* ) )
            {
            // InternalECFDL.g:3431:1: ( ( ( rule__GroupBox__Group_12__0 ) ) ( ( rule__GroupBox__Group_12__0 )* ) )
            // InternalECFDL.g:3432:2: ( ( rule__GroupBox__Group_12__0 ) ) ( ( rule__GroupBox__Group_12__0 )* )
            {
            // InternalECFDL.g:3432:2: ( ( rule__GroupBox__Group_12__0 ) )
            // InternalECFDL.g:3433:3: ( rule__GroupBox__Group_12__0 )
            {
             before(grammarAccess.getGroupBoxAccess().getGroup_12()); 
            // InternalECFDL.g:3434:3: ( rule__GroupBox__Group_12__0 )
            // InternalECFDL.g:3434:4: rule__GroupBox__Group_12__0
            {
            pushFollow(FOLLOW_6);
            rule__GroupBox__Group_12__0();

            state._fsp--;


            }

             after(grammarAccess.getGroupBoxAccess().getGroup_12()); 

            }

            // InternalECFDL.g:3437:2: ( ( rule__GroupBox__Group_12__0 )* )
            // InternalECFDL.g:3438:3: ( rule__GroupBox__Group_12__0 )*
            {
             before(grammarAccess.getGroupBoxAccess().getGroup_12()); 
            // InternalECFDL.g:3439:3: ( rule__GroupBox__Group_12__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==14) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalECFDL.g:3439:4: rule__GroupBox__Group_12__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__GroupBox__Group_12__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getGroupBoxAccess().getGroup_12()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupBox__Group__12__Impl"


    // $ANTLR start "rule__GroupBox__Group__13"
    // InternalECFDL.g:3448:1: rule__GroupBox__Group__13 : rule__GroupBox__Group__13__Impl rule__GroupBox__Group__14 ;
    public final void rule__GroupBox__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:3452:1: ( rule__GroupBox__Group__13__Impl rule__GroupBox__Group__14 )
            // InternalECFDL.g:3453:2: rule__GroupBox__Group__13__Impl rule__GroupBox__Group__14
            {
            pushFollow(FOLLOW_18);
            rule__GroupBox__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GroupBox__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupBox__Group__13"


    // $ANTLR start "rule__GroupBox__Group__13__Impl"
    // InternalECFDL.g:3460:1: rule__GroupBox__Group__13__Impl : ( ')' ) ;
    public final void rule__GroupBox__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:3464:1: ( ( ')' ) )
            // InternalECFDL.g:3465:1: ( ')' )
            {
            // InternalECFDL.g:3465:1: ( ')' )
            // InternalECFDL.g:3466:2: ')'
            {
             before(grammarAccess.getGroupBoxAccess().getRightParenthesisKeyword_13()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getGroupBoxAccess().getRightParenthesisKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupBox__Group__13__Impl"


    // $ANTLR start "rule__GroupBox__Group__14"
    // InternalECFDL.g:3475:1: rule__GroupBox__Group__14 : rule__GroupBox__Group__14__Impl ;
    public final void rule__GroupBox__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:3479:1: ( rule__GroupBox__Group__14__Impl )
            // InternalECFDL.g:3480:2: rule__GroupBox__Group__14__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GroupBox__Group__14__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupBox__Group__14"


    // $ANTLR start "rule__GroupBox__Group__14__Impl"
    // InternalECFDL.g:3486:1: rule__GroupBox__Group__14__Impl : ( '}' ) ;
    public final void rule__GroupBox__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:3490:1: ( ( '}' ) )
            // InternalECFDL.g:3491:1: ( '}' )
            {
            // InternalECFDL.g:3491:1: ( '}' )
            // InternalECFDL.g:3492:2: '}'
            {
             before(grammarAccess.getGroupBoxAccess().getRightCurlyBracketKeyword_14()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getGroupBoxAccess().getRightCurlyBracketKeyword_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupBox__Group__14__Impl"


    // $ANTLR start "rule__GroupBox__Group_12__0"
    // InternalECFDL.g:3502:1: rule__GroupBox__Group_12__0 : rule__GroupBox__Group_12__0__Impl rule__GroupBox__Group_12__1 ;
    public final void rule__GroupBox__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:3506:1: ( rule__GroupBox__Group_12__0__Impl rule__GroupBox__Group_12__1 )
            // InternalECFDL.g:3507:2: rule__GroupBox__Group_12__0__Impl rule__GroupBox__Group_12__1
            {
            pushFollow(FOLLOW_8);
            rule__GroupBox__Group_12__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GroupBox__Group_12__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupBox__Group_12__0"


    // $ANTLR start "rule__GroupBox__Group_12__0__Impl"
    // InternalECFDL.g:3514:1: rule__GroupBox__Group_12__0__Impl : ( ',' ) ;
    public final void rule__GroupBox__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:3518:1: ( ( ',' ) )
            // InternalECFDL.g:3519:1: ( ',' )
            {
            // InternalECFDL.g:3519:1: ( ',' )
            // InternalECFDL.g:3520:2: ','
            {
             before(grammarAccess.getGroupBoxAccess().getCommaKeyword_12_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getGroupBoxAccess().getCommaKeyword_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupBox__Group_12__0__Impl"


    // $ANTLR start "rule__GroupBox__Group_12__1"
    // InternalECFDL.g:3529:1: rule__GroupBox__Group_12__1 : rule__GroupBox__Group_12__1__Impl ;
    public final void rule__GroupBox__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:3533:1: ( rule__GroupBox__Group_12__1__Impl )
            // InternalECFDL.g:3534:2: rule__GroupBox__Group_12__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GroupBox__Group_12__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupBox__Group_12__1"


    // $ANTLR start "rule__GroupBox__Group_12__1__Impl"
    // InternalECFDL.g:3540:1: rule__GroupBox__Group_12__1__Impl : ( ( rule__GroupBox__BoxAssignment_12_1 ) ) ;
    public final void rule__GroupBox__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:3544:1: ( ( ( rule__GroupBox__BoxAssignment_12_1 ) ) )
            // InternalECFDL.g:3545:1: ( ( rule__GroupBox__BoxAssignment_12_1 ) )
            {
            // InternalECFDL.g:3545:1: ( ( rule__GroupBox__BoxAssignment_12_1 ) )
            // InternalECFDL.g:3546:2: ( rule__GroupBox__BoxAssignment_12_1 )
            {
             before(grammarAccess.getGroupBoxAccess().getBoxAssignment_12_1()); 
            // InternalECFDL.g:3547:2: ( rule__GroupBox__BoxAssignment_12_1 )
            // InternalECFDL.g:3547:3: rule__GroupBox__BoxAssignment_12_1
            {
            pushFollow(FOLLOW_2);
            rule__GroupBox__BoxAssignment_12_1();

            state._fsp--;


            }

             after(grammarAccess.getGroupBoxAccess().getBoxAssignment_12_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupBox__Group_12__1__Impl"


    // $ANTLR start "rule__Feature__Group__0"
    // InternalECFDL.g:3556:1: rule__Feature__Group__0 : rule__Feature__Group__0__Impl rule__Feature__Group__1 ;
    public final void rule__Feature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:3560:1: ( rule__Feature__Group__0__Impl rule__Feature__Group__1 )
            // InternalECFDL.g:3561:2: rule__Feature__Group__0__Impl rule__Feature__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__Feature__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Feature__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__0"


    // $ANTLR start "rule__Feature__Group__0__Impl"
    // InternalECFDL.g:3568:1: rule__Feature__Group__0__Impl : ( () ) ;
    public final void rule__Feature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:3572:1: ( ( () ) )
            // InternalECFDL.g:3573:1: ( () )
            {
            // InternalECFDL.g:3573:1: ( () )
            // InternalECFDL.g:3574:2: ()
            {
             before(grammarAccess.getFeatureAccess().getFeatureAction_0()); 
            // InternalECFDL.g:3575:2: ()
            // InternalECFDL.g:3575:3: 
            {
            }

             after(grammarAccess.getFeatureAccess().getFeatureAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__0__Impl"


    // $ANTLR start "rule__Feature__Group__1"
    // InternalECFDL.g:3583:1: rule__Feature__Group__1 : rule__Feature__Group__1__Impl ;
    public final void rule__Feature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:3587:1: ( rule__Feature__Group__1__Impl )
            // InternalECFDL.g:3588:2: rule__Feature__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Feature__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__1"


    // $ANTLR start "rule__Feature__Group__1__Impl"
    // InternalECFDL.g:3594:1: rule__Feature__Group__1__Impl : ( ( rule__Feature__NameAssignment_1 )? ) ;
    public final void rule__Feature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:3598:1: ( ( ( rule__Feature__NameAssignment_1 )? ) )
            // InternalECFDL.g:3599:1: ( ( rule__Feature__NameAssignment_1 )? )
            {
            // InternalECFDL.g:3599:1: ( ( rule__Feature__NameAssignment_1 )? )
            // InternalECFDL.g:3600:2: ( rule__Feature__NameAssignment_1 )?
            {
             before(grammarAccess.getFeatureAccess().getNameAssignment_1()); 
            // InternalECFDL.g:3601:2: ( rule__Feature__NameAssignment_1 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=RULE_STRING && LA25_0<=RULE_ID)) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalECFDL.g:3601:3: rule__Feature__NameAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Feature__NameAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFeatureAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__1__Impl"


    // $ANTLR start "rule__File__EcfdAssignment_2"
    // InternalECFDL.g:3610:1: rule__File__EcfdAssignment_2 : ( ruleEcfd ) ;
    public final void rule__File__EcfdAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:3614:1: ( ( ruleEcfd ) )
            // InternalECFDL.g:3615:2: ( ruleEcfd )
            {
            // InternalECFDL.g:3615:2: ( ruleEcfd )
            // InternalECFDL.g:3616:3: ruleEcfd
            {
             before(grammarAccess.getFileAccess().getEcfdEcfdParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEcfd();

            state._fsp--;

             after(grammarAccess.getFileAccess().getEcfdEcfdParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__EcfdAssignment_2"


    // $ANTLR start "rule__File__EcfdAssignment_3_1"
    // InternalECFDL.g:3625:1: rule__File__EcfdAssignment_3_1 : ( ruleEcfd ) ;
    public final void rule__File__EcfdAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:3629:1: ( ( ruleEcfd ) )
            // InternalECFDL.g:3630:2: ( ruleEcfd )
            {
            // InternalECFDL.g:3630:2: ( ruleEcfd )
            // InternalECFDL.g:3631:3: ruleEcfd
            {
             before(grammarAccess.getFileAccess().getEcfdEcfdParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEcfd();

            state._fsp--;

             after(grammarAccess.getFileAccess().getEcfdEcfdParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__EcfdAssignment_3_1"


    // $ANTLR start "rule__Ecfd__NameAssignment_3"
    // InternalECFDL.g:3640:1: rule__Ecfd__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Ecfd__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:3644:1: ( ( RULE_ID ) )
            // InternalECFDL.g:3645:2: ( RULE_ID )
            {
            // InternalECFDL.g:3645:2: ( RULE_ID )
            // InternalECFDL.g:3646:3: RULE_ID
            {
             before(grammarAccess.getEcfdAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEcfdAccess().getNameIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ecfd__NameAssignment_3"


    // $ANTLR start "rule__Ecfd__BoxesAssignment_5_2"
    // InternalECFDL.g:3655:1: rule__Ecfd__BoxesAssignment_5_2 : ( ruleBox ) ;
    public final void rule__Ecfd__BoxesAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:3659:1: ( ( ruleBox ) )
            // InternalECFDL.g:3660:2: ( ruleBox )
            {
            // InternalECFDL.g:3660:2: ( ruleBox )
            // InternalECFDL.g:3661:3: ruleBox
            {
             before(grammarAccess.getEcfdAccess().getBoxesBoxParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            ruleBox();

            state._fsp--;

             after(grammarAccess.getEcfdAccess().getBoxesBoxParserRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ecfd__BoxesAssignment_5_2"


    // $ANTLR start "rule__Ecfd__BoxesAssignment_5_3_1"
    // InternalECFDL.g:3670:1: rule__Ecfd__BoxesAssignment_5_3_1 : ( ruleBox ) ;
    public final void rule__Ecfd__BoxesAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:3674:1: ( ( ruleBox ) )
            // InternalECFDL.g:3675:2: ( ruleBox )
            {
            // InternalECFDL.g:3675:2: ( ruleBox )
            // InternalECFDL.g:3676:3: ruleBox
            {
             before(grammarAccess.getEcfdAccess().getBoxesBoxParserRuleCall_5_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBox();

            state._fsp--;

             after(grammarAccess.getEcfdAccess().getBoxesBoxParserRuleCall_5_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ecfd__BoxesAssignment_5_3_1"


    // $ANTLR start "rule__Ecfd__GroupsAssignment_6_2"
    // InternalECFDL.g:3685:1: rule__Ecfd__GroupsAssignment_6_2 : ( ruleGroupBox ) ;
    public final void rule__Ecfd__GroupsAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:3689:1: ( ( ruleGroupBox ) )
            // InternalECFDL.g:3690:2: ( ruleGroupBox )
            {
            // InternalECFDL.g:3690:2: ( ruleGroupBox )
            // InternalECFDL.g:3691:3: ruleGroupBox
            {
             before(grammarAccess.getEcfdAccess().getGroupsGroupBoxParserRuleCall_6_2_0()); 
            pushFollow(FOLLOW_2);
            ruleGroupBox();

            state._fsp--;

             after(grammarAccess.getEcfdAccess().getGroupsGroupBoxParserRuleCall_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ecfd__GroupsAssignment_6_2"


    // $ANTLR start "rule__Ecfd__BoxesAssignment_6_3_1"
    // InternalECFDL.g:3700:1: rule__Ecfd__BoxesAssignment_6_3_1 : ( ruleGroupBox ) ;
    public final void rule__Ecfd__BoxesAssignment_6_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:3704:1: ( ( ruleGroupBox ) )
            // InternalECFDL.g:3705:2: ( ruleGroupBox )
            {
            // InternalECFDL.g:3705:2: ( ruleGroupBox )
            // InternalECFDL.g:3706:3: ruleGroupBox
            {
             before(grammarAccess.getEcfdAccess().getBoxesGroupBoxParserRuleCall_6_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleGroupBox();

            state._fsp--;

             after(grammarAccess.getEcfdAccess().getBoxesGroupBoxParserRuleCall_6_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ecfd__BoxesAssignment_6_3_1"


    // $ANTLR start "rule__Ecfd__MutexAssignment_7_2_0"
    // InternalECFDL.g:3715:1: rule__Ecfd__MutexAssignment_7_2_0 : ( ruleMutex ) ;
    public final void rule__Ecfd__MutexAssignment_7_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:3719:1: ( ( ruleMutex ) )
            // InternalECFDL.g:3720:2: ( ruleMutex )
            {
            // InternalECFDL.g:3720:2: ( ruleMutex )
            // InternalECFDL.g:3721:3: ruleMutex
            {
             before(grammarAccess.getEcfdAccess().getMutexMutexParserRuleCall_7_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleMutex();

            state._fsp--;

             after(grammarAccess.getEcfdAccess().getMutexMutexParserRuleCall_7_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ecfd__MutexAssignment_7_2_0"


    // $ANTLR start "rule__Ecfd__MutexAssignment_7_2_1_1"
    // InternalECFDL.g:3730:1: rule__Ecfd__MutexAssignment_7_2_1_1 : ( ruleMutex ) ;
    public final void rule__Ecfd__MutexAssignment_7_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:3734:1: ( ( ruleMutex ) )
            // InternalECFDL.g:3735:2: ( ruleMutex )
            {
            // InternalECFDL.g:3735:2: ( ruleMutex )
            // InternalECFDL.g:3736:3: ruleMutex
            {
             before(grammarAccess.getEcfdAccess().getMutexMutexParserRuleCall_7_2_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMutex();

            state._fsp--;

             after(grammarAccess.getEcfdAccess().getMutexMutexParserRuleCall_7_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ecfd__MutexAssignment_7_2_1_1"


    // $ANTLR start "rule__Mutex__NameAssignment_2"
    // InternalECFDL.g:3745:1: rule__Mutex__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Mutex__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:3749:1: ( ( RULE_ID ) )
            // InternalECFDL.g:3750:2: ( RULE_ID )
            {
            // InternalECFDL.g:3750:2: ( RULE_ID )
            // InternalECFDL.g:3751:3: RULE_ID
            {
             before(grammarAccess.getMutexAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMutexAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mutex__NameAssignment_2"


    // $ANTLR start "rule__Mutex__BoxAssignment_6"
    // InternalECFDL.g:3760:1: rule__Mutex__BoxAssignment_6 : ( ( RULE_ID ) ) ;
    public final void rule__Mutex__BoxAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:3764:1: ( ( ( RULE_ID ) ) )
            // InternalECFDL.g:3765:2: ( ( RULE_ID ) )
            {
            // InternalECFDL.g:3765:2: ( ( RULE_ID ) )
            // InternalECFDL.g:3766:3: ( RULE_ID )
            {
             before(grammarAccess.getMutexAccess().getBoxBoxCrossReference_6_0()); 
            // InternalECFDL.g:3767:3: ( RULE_ID )
            // InternalECFDL.g:3768:4: RULE_ID
            {
             before(grammarAccess.getMutexAccess().getBoxBoxIDTerminalRuleCall_6_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMutexAccess().getBoxBoxIDTerminalRuleCall_6_0_1()); 

            }

             after(grammarAccess.getMutexAccess().getBoxBoxCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mutex__BoxAssignment_6"


    // $ANTLR start "rule__Mutex__BoxAssignment_7_1"
    // InternalECFDL.g:3779:1: rule__Mutex__BoxAssignment_7_1 : ( ( RULE_ID ) ) ;
    public final void rule__Mutex__BoxAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:3783:1: ( ( ( RULE_ID ) ) )
            // InternalECFDL.g:3784:2: ( ( RULE_ID ) )
            {
            // InternalECFDL.g:3784:2: ( ( RULE_ID ) )
            // InternalECFDL.g:3785:3: ( RULE_ID )
            {
             before(grammarAccess.getMutexAccess().getBoxBoxCrossReference_7_1_0()); 
            // InternalECFDL.g:3786:3: ( RULE_ID )
            // InternalECFDL.g:3787:4: RULE_ID
            {
             before(grammarAccess.getMutexAccess().getBoxBoxIDTerminalRuleCall_7_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMutexAccess().getBoxBoxIDTerminalRuleCall_7_1_0_1()); 

            }

             after(grammarAccess.getMutexAccess().getBoxBoxCrossReference_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mutex__BoxAssignment_7_1"


    // $ANTLR start "rule__Box__NameAssignment_3"
    // InternalECFDL.g:3798:1: rule__Box__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Box__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:3802:1: ( ( RULE_ID ) )
            // InternalECFDL.g:3803:2: ( RULE_ID )
            {
            // InternalECFDL.g:3803:2: ( RULE_ID )
            // InternalECFDL.g:3804:3: RULE_ID
            {
             before(grammarAccess.getBoxAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getBoxAccess().getNameIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__NameAssignment_3"


    // $ANTLR start "rule__Box__RootAssignment_5"
    // InternalECFDL.g:3813:1: rule__Box__RootAssignment_5 : ( ( 'Root' ) ) ;
    public final void rule__Box__RootAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:3817:1: ( ( ( 'Root' ) ) )
            // InternalECFDL.g:3818:2: ( ( 'Root' ) )
            {
            // InternalECFDL.g:3818:2: ( ( 'Root' ) )
            // InternalECFDL.g:3819:3: ( 'Root' )
            {
             before(grammarAccess.getBoxAccess().getRootRootKeyword_5_0()); 
            // InternalECFDL.g:3820:3: ( 'Root' )
            // InternalECFDL.g:3821:4: 'Root'
            {
             before(grammarAccess.getBoxAccess().getRootRootKeyword_5_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getBoxAccess().getRootRootKeyword_5_0()); 

            }

             after(grammarAccess.getBoxAccess().getRootRootKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__RootAssignment_5"


    // $ANTLR start "rule__Box__SuperBoxAssignment_6_2"
    // InternalECFDL.g:3832:1: rule__Box__SuperBoxAssignment_6_2 : ( ( RULE_ID ) ) ;
    public final void rule__Box__SuperBoxAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:3836:1: ( ( ( RULE_ID ) ) )
            // InternalECFDL.g:3837:2: ( ( RULE_ID ) )
            {
            // InternalECFDL.g:3837:2: ( ( RULE_ID ) )
            // InternalECFDL.g:3838:3: ( RULE_ID )
            {
             before(grammarAccess.getBoxAccess().getSuperBoxBoxCrossReference_6_2_0()); 
            // InternalECFDL.g:3839:3: ( RULE_ID )
            // InternalECFDL.g:3840:4: RULE_ID
            {
             before(grammarAccess.getBoxAccess().getSuperBoxBoxIDTerminalRuleCall_6_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getBoxAccess().getSuperBoxBoxIDTerminalRuleCall_6_2_0_1()); 

            }

             after(grammarAccess.getBoxAccess().getSuperBoxBoxCrossReference_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__SuperBoxAssignment_6_2"


    // $ANTLR start "rule__Box__SuperBoxAssignment_6_3_1"
    // InternalECFDL.g:3851:1: rule__Box__SuperBoxAssignment_6_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__Box__SuperBoxAssignment_6_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:3855:1: ( ( ( RULE_ID ) ) )
            // InternalECFDL.g:3856:2: ( ( RULE_ID ) )
            {
            // InternalECFDL.g:3856:2: ( ( RULE_ID ) )
            // InternalECFDL.g:3857:3: ( RULE_ID )
            {
             before(grammarAccess.getBoxAccess().getSuperBoxBoxCrossReference_6_3_1_0()); 
            // InternalECFDL.g:3858:3: ( RULE_ID )
            // InternalECFDL.g:3859:4: RULE_ID
            {
             before(grammarAccess.getBoxAccess().getSuperBoxBoxIDTerminalRuleCall_6_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getBoxAccess().getSuperBoxBoxIDTerminalRuleCall_6_3_1_0_1()); 

            }

             after(grammarAccess.getBoxAccess().getSuperBoxBoxCrossReference_6_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__SuperBoxAssignment_6_3_1"


    // $ANTLR start "rule__Box__GroupboxAssignment_7_2"
    // InternalECFDL.g:3870:1: rule__Box__GroupboxAssignment_7_2 : ( ( RULE_ID ) ) ;
    public final void rule__Box__GroupboxAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:3874:1: ( ( ( RULE_ID ) ) )
            // InternalECFDL.g:3875:2: ( ( RULE_ID ) )
            {
            // InternalECFDL.g:3875:2: ( ( RULE_ID ) )
            // InternalECFDL.g:3876:3: ( RULE_ID )
            {
             before(grammarAccess.getBoxAccess().getGroupboxGroupBoxCrossReference_7_2_0()); 
            // InternalECFDL.g:3877:3: ( RULE_ID )
            // InternalECFDL.g:3878:4: RULE_ID
            {
             before(grammarAccess.getBoxAccess().getGroupboxGroupBoxIDTerminalRuleCall_7_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getBoxAccess().getGroupboxGroupBoxIDTerminalRuleCall_7_2_0_1()); 

            }

             after(grammarAccess.getBoxAccess().getGroupboxGroupBoxCrossReference_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__GroupboxAssignment_7_2"


    // $ANTLR start "rule__Box__GroupboxAssignment_7_3_1"
    // InternalECFDL.g:3889:1: rule__Box__GroupboxAssignment_7_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__Box__GroupboxAssignment_7_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:3893:1: ( ( ( RULE_ID ) ) )
            // InternalECFDL.g:3894:2: ( ( RULE_ID ) )
            {
            // InternalECFDL.g:3894:2: ( ( RULE_ID ) )
            // InternalECFDL.g:3895:3: ( RULE_ID )
            {
             before(grammarAccess.getBoxAccess().getGroupboxGroupBoxCrossReference_7_3_1_0()); 
            // InternalECFDL.g:3896:3: ( RULE_ID )
            // InternalECFDL.g:3897:4: RULE_ID
            {
             before(grammarAccess.getBoxAccess().getGroupboxGroupBoxIDTerminalRuleCall_7_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getBoxAccess().getGroupboxGroupBoxIDTerminalRuleCall_7_3_1_0_1()); 

            }

             after(grammarAccess.getBoxAccess().getGroupboxGroupBoxCrossReference_7_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__GroupboxAssignment_7_3_1"


    // $ANTLR start "rule__Box__ChildBoxAssignment_8_2"
    // InternalECFDL.g:3908:1: rule__Box__ChildBoxAssignment_8_2 : ( ( RULE_ID ) ) ;
    public final void rule__Box__ChildBoxAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:3912:1: ( ( ( RULE_ID ) ) )
            // InternalECFDL.g:3913:2: ( ( RULE_ID ) )
            {
            // InternalECFDL.g:3913:2: ( ( RULE_ID ) )
            // InternalECFDL.g:3914:3: ( RULE_ID )
            {
             before(grammarAccess.getBoxAccess().getChildBoxBoxCrossReference_8_2_0()); 
            // InternalECFDL.g:3915:3: ( RULE_ID )
            // InternalECFDL.g:3916:4: RULE_ID
            {
             before(grammarAccess.getBoxAccess().getChildBoxBoxIDTerminalRuleCall_8_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getBoxAccess().getChildBoxBoxIDTerminalRuleCall_8_2_0_1()); 

            }

             after(grammarAccess.getBoxAccess().getChildBoxBoxCrossReference_8_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__ChildBoxAssignment_8_2"


    // $ANTLR start "rule__Box__ChildBoxAssignment_8_3_1"
    // InternalECFDL.g:3927:1: rule__Box__ChildBoxAssignment_8_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__Box__ChildBoxAssignment_8_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:3931:1: ( ( ( RULE_ID ) ) )
            // InternalECFDL.g:3932:2: ( ( RULE_ID ) )
            {
            // InternalECFDL.g:3932:2: ( ( RULE_ID ) )
            // InternalECFDL.g:3933:3: ( RULE_ID )
            {
             before(grammarAccess.getBoxAccess().getChildBoxBoxCrossReference_8_3_1_0()); 
            // InternalECFDL.g:3934:3: ( RULE_ID )
            // InternalECFDL.g:3935:4: RULE_ID
            {
             before(grammarAccess.getBoxAccess().getChildBoxBoxIDTerminalRuleCall_8_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getBoxAccess().getChildBoxBoxIDTerminalRuleCall_8_3_1_0_1()); 

            }

             after(grammarAccess.getBoxAccess().getChildBoxBoxCrossReference_8_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__ChildBoxAssignment_8_3_1"


    // $ANTLR start "rule__Box__ChildGroupAssignment_9_2"
    // InternalECFDL.g:3946:1: rule__Box__ChildGroupAssignment_9_2 : ( ( RULE_ID ) ) ;
    public final void rule__Box__ChildGroupAssignment_9_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:3950:1: ( ( ( RULE_ID ) ) )
            // InternalECFDL.g:3951:2: ( ( RULE_ID ) )
            {
            // InternalECFDL.g:3951:2: ( ( RULE_ID ) )
            // InternalECFDL.g:3952:3: ( RULE_ID )
            {
             before(grammarAccess.getBoxAccess().getChildGroupGroupBoxCrossReference_9_2_0()); 
            // InternalECFDL.g:3953:3: ( RULE_ID )
            // InternalECFDL.g:3954:4: RULE_ID
            {
             before(grammarAccess.getBoxAccess().getChildGroupGroupBoxIDTerminalRuleCall_9_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getBoxAccess().getChildGroupGroupBoxIDTerminalRuleCall_9_2_0_1()); 

            }

             after(grammarAccess.getBoxAccess().getChildGroupGroupBoxCrossReference_9_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__ChildGroupAssignment_9_2"


    // $ANTLR start "rule__Box__ChildGroupAssignment_9_3_1"
    // InternalECFDL.g:3965:1: rule__Box__ChildGroupAssignment_9_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__Box__ChildGroupAssignment_9_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:3969:1: ( ( ( RULE_ID ) ) )
            // InternalECFDL.g:3970:2: ( ( RULE_ID ) )
            {
            // InternalECFDL.g:3970:2: ( ( RULE_ID ) )
            // InternalECFDL.g:3971:3: ( RULE_ID )
            {
             before(grammarAccess.getBoxAccess().getChildGroupGroupBoxCrossReference_9_3_1_0()); 
            // InternalECFDL.g:3972:3: ( RULE_ID )
            // InternalECFDL.g:3973:4: RULE_ID
            {
             before(grammarAccess.getBoxAccess().getChildGroupGroupBoxIDTerminalRuleCall_9_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getBoxAccess().getChildGroupGroupBoxIDTerminalRuleCall_9_3_1_0_1()); 

            }

             after(grammarAccess.getBoxAccess().getChildGroupGroupBoxCrossReference_9_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__ChildGroupAssignment_9_3_1"


    // $ANTLR start "rule__Box__MutexAssignment_10_2"
    // InternalECFDL.g:3984:1: rule__Box__MutexAssignment_10_2 : ( ( RULE_ID ) ) ;
    public final void rule__Box__MutexAssignment_10_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:3988:1: ( ( ( RULE_ID ) ) )
            // InternalECFDL.g:3989:2: ( ( RULE_ID ) )
            {
            // InternalECFDL.g:3989:2: ( ( RULE_ID ) )
            // InternalECFDL.g:3990:3: ( RULE_ID )
            {
             before(grammarAccess.getBoxAccess().getMutexMutexCrossReference_10_2_0()); 
            // InternalECFDL.g:3991:3: ( RULE_ID )
            // InternalECFDL.g:3992:4: RULE_ID
            {
             before(grammarAccess.getBoxAccess().getMutexMutexIDTerminalRuleCall_10_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getBoxAccess().getMutexMutexIDTerminalRuleCall_10_2_0_1()); 

            }

             after(grammarAccess.getBoxAccess().getMutexMutexCrossReference_10_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__MutexAssignment_10_2"


    // $ANTLR start "rule__Box__MutexAssignment_10_3_1"
    // InternalECFDL.g:4003:1: rule__Box__MutexAssignment_10_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__Box__MutexAssignment_10_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:4007:1: ( ( ( RULE_ID ) ) )
            // InternalECFDL.g:4008:2: ( ( RULE_ID ) )
            {
            // InternalECFDL.g:4008:2: ( ( RULE_ID ) )
            // InternalECFDL.g:4009:3: ( RULE_ID )
            {
             before(grammarAccess.getBoxAccess().getMutexMutexCrossReference_10_3_1_0()); 
            // InternalECFDL.g:4010:3: ( RULE_ID )
            // InternalECFDL.g:4011:4: RULE_ID
            {
             before(grammarAccess.getBoxAccess().getMutexMutexIDTerminalRuleCall_10_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getBoxAccess().getMutexMutexIDTerminalRuleCall_10_3_1_0_1()); 

            }

             after(grammarAccess.getBoxAccess().getMutexMutexCrossReference_10_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__MutexAssignment_10_3_1"


    // $ANTLR start "rule__Box__FeatureAssignment_11_2"
    // InternalECFDL.g:4022:1: rule__Box__FeatureAssignment_11_2 : ( ruleFeature ) ;
    public final void rule__Box__FeatureAssignment_11_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:4026:1: ( ( ruleFeature ) )
            // InternalECFDL.g:4027:2: ( ruleFeature )
            {
            // InternalECFDL.g:4027:2: ( ruleFeature )
            // InternalECFDL.g:4028:3: ruleFeature
            {
             before(grammarAccess.getBoxAccess().getFeatureFeatureParserRuleCall_11_2_0()); 
            pushFollow(FOLLOW_2);
            ruleFeature();

            state._fsp--;

             after(grammarAccess.getBoxAccess().getFeatureFeatureParserRuleCall_11_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__FeatureAssignment_11_2"


    // $ANTLR start "rule__Box__FeatureAssignment_11_3_1"
    // InternalECFDL.g:4037:1: rule__Box__FeatureAssignment_11_3_1 : ( ruleFeature ) ;
    public final void rule__Box__FeatureAssignment_11_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:4041:1: ( ( ruleFeature ) )
            // InternalECFDL.g:4042:2: ( ruleFeature )
            {
            // InternalECFDL.g:4042:2: ( ruleFeature )
            // InternalECFDL.g:4043:3: ruleFeature
            {
             before(grammarAccess.getBoxAccess().getFeatureFeatureParserRuleCall_11_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFeature();

            state._fsp--;

             after(grammarAccess.getBoxAccess().getFeatureFeatureParserRuleCall_11_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__FeatureAssignment_11_3_1"


    // $ANTLR start "rule__GroupBox__NameAssignment_2"
    // InternalECFDL.g:4052:1: rule__GroupBox__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__GroupBox__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:4056:1: ( ( RULE_ID ) )
            // InternalECFDL.g:4057:2: ( RULE_ID )
            {
            // InternalECFDL.g:4057:2: ( RULE_ID )
            // InternalECFDL.g:4058:3: RULE_ID
            {
             before(grammarAccess.getGroupBoxAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getGroupBoxAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupBox__NameAssignment_2"


    // $ANTLR start "rule__GroupBox__ExclusifAssignment_4"
    // InternalECFDL.g:4067:1: rule__GroupBox__ExclusifAssignment_4 : ( ( 'Exclusif' ) ) ;
    public final void rule__GroupBox__ExclusifAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:4071:1: ( ( ( 'Exclusif' ) ) )
            // InternalECFDL.g:4072:2: ( ( 'Exclusif' ) )
            {
            // InternalECFDL.g:4072:2: ( ( 'Exclusif' ) )
            // InternalECFDL.g:4073:3: ( 'Exclusif' )
            {
             before(grammarAccess.getGroupBoxAccess().getExclusifExclusifKeyword_4_0()); 
            // InternalECFDL.g:4074:3: ( 'Exclusif' )
            // InternalECFDL.g:4075:4: 'Exclusif'
            {
             before(grammarAccess.getGroupBoxAccess().getExclusifExclusifKeyword_4_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getGroupBoxAccess().getExclusifExclusifKeyword_4_0()); 

            }

             after(grammarAccess.getGroupBoxAccess().getExclusifExclusifKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupBox__ExclusifAssignment_4"


    // $ANTLR start "rule__GroupBox__SuperBoxAssignment_7"
    // InternalECFDL.g:4086:1: rule__GroupBox__SuperBoxAssignment_7 : ( ( RULE_ID ) ) ;
    public final void rule__GroupBox__SuperBoxAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:4090:1: ( ( ( RULE_ID ) ) )
            // InternalECFDL.g:4091:2: ( ( RULE_ID ) )
            {
            // InternalECFDL.g:4091:2: ( ( RULE_ID ) )
            // InternalECFDL.g:4092:3: ( RULE_ID )
            {
             before(grammarAccess.getGroupBoxAccess().getSuperBoxBoxCrossReference_7_0()); 
            // InternalECFDL.g:4093:3: ( RULE_ID )
            // InternalECFDL.g:4094:4: RULE_ID
            {
             before(grammarAccess.getGroupBoxAccess().getSuperBoxBoxIDTerminalRuleCall_7_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getGroupBoxAccess().getSuperBoxBoxIDTerminalRuleCall_7_0_1()); 

            }

             after(grammarAccess.getGroupBoxAccess().getSuperBoxBoxCrossReference_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupBox__SuperBoxAssignment_7"


    // $ANTLR start "rule__GroupBox__BoxAssignment_11"
    // InternalECFDL.g:4105:1: rule__GroupBox__BoxAssignment_11 : ( ( RULE_ID ) ) ;
    public final void rule__GroupBox__BoxAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:4109:1: ( ( ( RULE_ID ) ) )
            // InternalECFDL.g:4110:2: ( ( RULE_ID ) )
            {
            // InternalECFDL.g:4110:2: ( ( RULE_ID ) )
            // InternalECFDL.g:4111:3: ( RULE_ID )
            {
             before(grammarAccess.getGroupBoxAccess().getBoxBoxCrossReference_11_0()); 
            // InternalECFDL.g:4112:3: ( RULE_ID )
            // InternalECFDL.g:4113:4: RULE_ID
            {
             before(grammarAccess.getGroupBoxAccess().getBoxBoxIDTerminalRuleCall_11_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getGroupBoxAccess().getBoxBoxIDTerminalRuleCall_11_0_1()); 

            }

             after(grammarAccess.getGroupBoxAccess().getBoxBoxCrossReference_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupBox__BoxAssignment_11"


    // $ANTLR start "rule__GroupBox__BoxAssignment_12_1"
    // InternalECFDL.g:4124:1: rule__GroupBox__BoxAssignment_12_1 : ( ( RULE_ID ) ) ;
    public final void rule__GroupBox__BoxAssignment_12_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:4128:1: ( ( ( RULE_ID ) ) )
            // InternalECFDL.g:4129:2: ( ( RULE_ID ) )
            {
            // InternalECFDL.g:4129:2: ( ( RULE_ID ) )
            // InternalECFDL.g:4130:3: ( RULE_ID )
            {
             before(grammarAccess.getGroupBoxAccess().getBoxBoxCrossReference_12_1_0()); 
            // InternalECFDL.g:4131:3: ( RULE_ID )
            // InternalECFDL.g:4132:4: RULE_ID
            {
             before(grammarAccess.getGroupBoxAccess().getBoxBoxIDTerminalRuleCall_12_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getGroupBoxAccess().getBoxBoxIDTerminalRuleCall_12_1_0_1()); 

            }

             after(grammarAccess.getGroupBoxAccess().getBoxBoxCrossReference_12_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupBox__BoxAssignment_12_1"


    // $ANTLR start "rule__Feature__NameAssignment_1"
    // InternalECFDL.g:4143:1: rule__Feature__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Feature__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalECFDL.g:4147:1: ( ( ruleEString ) )
            // InternalECFDL.g:4148:2: ( ruleEString )
            {
            // InternalECFDL.g:4148:2: ( ruleEString )
            // InternalECFDL.g:4149:3: ruleEString
            {
             before(grammarAccess.getFeatureAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getFeatureAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__NameAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000000C2000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000102000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x000000005F082000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000404000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000081000000L});

}