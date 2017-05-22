package org.xtext.ter_metamodel.ecfdl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.ter_metamodel.ecfdl.services.ECFDLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalECFDLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'listEcfd'", "'{'", "','", "'}'", "'Ecfd'", "':'", "'boxes'", "'groups'", "'mutex'", "'Mutex'", "'('", "')'", "'Box'", "'Root'", "'superBox'", "'groupbox'", "'motherOf'", "'motherOfGroup'", "'features'", "'GroupBox'", "'Exclusif'"
    };
    public static final int RULE_STRING=5;
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
    public static final int RULE_ID=4;
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

        public InternalECFDLParser(TokenStream input, ECFDLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "File";
       	}

       	@Override
       	protected ECFDLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleFile"
    // InternalECFDL.g:64:1: entryRuleFile returns [EObject current=null] : iv_ruleFile= ruleFile EOF ;
    public final EObject entryRuleFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFile = null;


        try {
            // InternalECFDL.g:64:45: (iv_ruleFile= ruleFile EOF )
            // InternalECFDL.g:65:2: iv_ruleFile= ruleFile EOF
            {
             newCompositeNode(grammarAccess.getFileRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFile=ruleFile();

            state._fsp--;

             current =iv_ruleFile; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFile"


    // $ANTLR start "ruleFile"
    // InternalECFDL.g:71:1: ruleFile returns [EObject current=null] : (otherlv_0= 'listEcfd' otherlv_1= '{' ( (lv_ecfd_2_0= ruleEcfd ) ) (otherlv_3= ',' ( (lv_ecfd_4_0= ruleEcfd ) ) )* otherlv_5= '}' ) ;
    public final EObject ruleFile() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_ecfd_2_0 = null;

        EObject lv_ecfd_4_0 = null;



        	enterRule();

        try {
            // InternalECFDL.g:77:2: ( (otherlv_0= 'listEcfd' otherlv_1= '{' ( (lv_ecfd_2_0= ruleEcfd ) ) (otherlv_3= ',' ( (lv_ecfd_4_0= ruleEcfd ) ) )* otherlv_5= '}' ) )
            // InternalECFDL.g:78:2: (otherlv_0= 'listEcfd' otherlv_1= '{' ( (lv_ecfd_2_0= ruleEcfd ) ) (otherlv_3= ',' ( (lv_ecfd_4_0= ruleEcfd ) ) )* otherlv_5= '}' )
            {
            // InternalECFDL.g:78:2: (otherlv_0= 'listEcfd' otherlv_1= '{' ( (lv_ecfd_2_0= ruleEcfd ) ) (otherlv_3= ',' ( (lv_ecfd_4_0= ruleEcfd ) ) )* otherlv_5= '}' )
            // InternalECFDL.g:79:3: otherlv_0= 'listEcfd' otherlv_1= '{' ( (lv_ecfd_2_0= ruleEcfd ) ) (otherlv_3= ',' ( (lv_ecfd_4_0= ruleEcfd ) ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getFileAccess().getListEcfdKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getFileAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalECFDL.g:87:3: ( (lv_ecfd_2_0= ruleEcfd ) )
            // InternalECFDL.g:88:4: (lv_ecfd_2_0= ruleEcfd )
            {
            // InternalECFDL.g:88:4: (lv_ecfd_2_0= ruleEcfd )
            // InternalECFDL.g:89:5: lv_ecfd_2_0= ruleEcfd
            {

            					newCompositeNode(grammarAccess.getFileAccess().getEcfdEcfdParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_ecfd_2_0=ruleEcfd();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFileRule());
            					}
            					add(
            						current,
            						"ecfd",
            						lv_ecfd_2_0,
            						"org.xtext.ter_metamodel.ecfdl.ECFDL.Ecfd");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalECFDL.g:106:3: (otherlv_3= ',' ( (lv_ecfd_4_0= ruleEcfd ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalECFDL.g:107:4: otherlv_3= ',' ( (lv_ecfd_4_0= ruleEcfd ) )
            	    {
            	    otherlv_3=(Token)match(input,13,FOLLOW_4); 

            	    				newLeafNode(otherlv_3, grammarAccess.getFileAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalECFDL.g:111:4: ( (lv_ecfd_4_0= ruleEcfd ) )
            	    // InternalECFDL.g:112:5: (lv_ecfd_4_0= ruleEcfd )
            	    {
            	    // InternalECFDL.g:112:5: (lv_ecfd_4_0= ruleEcfd )
            	    // InternalECFDL.g:113:6: lv_ecfd_4_0= ruleEcfd
            	    {

            	    						newCompositeNode(grammarAccess.getFileAccess().getEcfdEcfdParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_5);
            	    lv_ecfd_4_0=ruleEcfd();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getFileRule());
            	    						}
            	    						add(
            	    							current,
            	    							"ecfd",
            	    							lv_ecfd_4_0,
            	    							"org.xtext.ter_metamodel.ecfdl.ECFDL.Ecfd");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_5=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getFileAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFile"


    // $ANTLR start "entryRuleEcfd"
    // InternalECFDL.g:139:1: entryRuleEcfd returns [EObject current=null] : iv_ruleEcfd= ruleEcfd EOF ;
    public final EObject entryRuleEcfd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEcfd = null;


        try {
            // InternalECFDL.g:139:45: (iv_ruleEcfd= ruleEcfd EOF )
            // InternalECFDL.g:140:2: iv_ruleEcfd= ruleEcfd EOF
            {
             newCompositeNode(grammarAccess.getEcfdRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEcfd=ruleEcfd();

            state._fsp--;

             current =iv_ruleEcfd; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEcfd"


    // $ANTLR start "ruleEcfd"
    // InternalECFDL.g:146:1: ruleEcfd returns [EObject current=null] : ( () otherlv_1= 'Ecfd' otherlv_2= ':' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' (otherlv_5= 'boxes' otherlv_6= '{' ( (lv_boxes_7_0= ruleBox ) ) (otherlv_8= ',' ( (lv_boxes_9_0= ruleBox ) ) )* otherlv_10= '}' ) (otherlv_11= 'groups' otherlv_12= '{' ( (lv_groups_13_0= ruleGroupBox ) ) (otherlv_14= ',' ( (lv_boxes_15_0= ruleGroupBox ) ) )* otherlv_16= '}' )? (otherlv_17= 'mutex' otherlv_18= '{' ( ( (lv_mutex_19_0= ruleMutex ) ) (otherlv_20= ',' ( (lv_mutex_21_0= ruleMutex ) ) )* )? otherlv_22= '}' )? otherlv_23= '}' ) ;
    public final EObject ruleEcfd() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        EObject lv_boxes_7_0 = null;

        EObject lv_boxes_9_0 = null;

        EObject lv_groups_13_0 = null;

        EObject lv_boxes_15_0 = null;

        EObject lv_mutex_19_0 = null;

        EObject lv_mutex_21_0 = null;



        	enterRule();

        try {
            // InternalECFDL.g:152:2: ( ( () otherlv_1= 'Ecfd' otherlv_2= ':' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' (otherlv_5= 'boxes' otherlv_6= '{' ( (lv_boxes_7_0= ruleBox ) ) (otherlv_8= ',' ( (lv_boxes_9_0= ruleBox ) ) )* otherlv_10= '}' ) (otherlv_11= 'groups' otherlv_12= '{' ( (lv_groups_13_0= ruleGroupBox ) ) (otherlv_14= ',' ( (lv_boxes_15_0= ruleGroupBox ) ) )* otherlv_16= '}' )? (otherlv_17= 'mutex' otherlv_18= '{' ( ( (lv_mutex_19_0= ruleMutex ) ) (otherlv_20= ',' ( (lv_mutex_21_0= ruleMutex ) ) )* )? otherlv_22= '}' )? otherlv_23= '}' ) )
            // InternalECFDL.g:153:2: ( () otherlv_1= 'Ecfd' otherlv_2= ':' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' (otherlv_5= 'boxes' otherlv_6= '{' ( (lv_boxes_7_0= ruleBox ) ) (otherlv_8= ',' ( (lv_boxes_9_0= ruleBox ) ) )* otherlv_10= '}' ) (otherlv_11= 'groups' otherlv_12= '{' ( (lv_groups_13_0= ruleGroupBox ) ) (otherlv_14= ',' ( (lv_boxes_15_0= ruleGroupBox ) ) )* otherlv_16= '}' )? (otherlv_17= 'mutex' otherlv_18= '{' ( ( (lv_mutex_19_0= ruleMutex ) ) (otherlv_20= ',' ( (lv_mutex_21_0= ruleMutex ) ) )* )? otherlv_22= '}' )? otherlv_23= '}' )
            {
            // InternalECFDL.g:153:2: ( () otherlv_1= 'Ecfd' otherlv_2= ':' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' (otherlv_5= 'boxes' otherlv_6= '{' ( (lv_boxes_7_0= ruleBox ) ) (otherlv_8= ',' ( (lv_boxes_9_0= ruleBox ) ) )* otherlv_10= '}' ) (otherlv_11= 'groups' otherlv_12= '{' ( (lv_groups_13_0= ruleGroupBox ) ) (otherlv_14= ',' ( (lv_boxes_15_0= ruleGroupBox ) ) )* otherlv_16= '}' )? (otherlv_17= 'mutex' otherlv_18= '{' ( ( (lv_mutex_19_0= ruleMutex ) ) (otherlv_20= ',' ( (lv_mutex_21_0= ruleMutex ) ) )* )? otherlv_22= '}' )? otherlv_23= '}' )
            // InternalECFDL.g:154:3: () otherlv_1= 'Ecfd' otherlv_2= ':' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' (otherlv_5= 'boxes' otherlv_6= '{' ( (lv_boxes_7_0= ruleBox ) ) (otherlv_8= ',' ( (lv_boxes_9_0= ruleBox ) ) )* otherlv_10= '}' ) (otherlv_11= 'groups' otherlv_12= '{' ( (lv_groups_13_0= ruleGroupBox ) ) (otherlv_14= ',' ( (lv_boxes_15_0= ruleGroupBox ) ) )* otherlv_16= '}' )? (otherlv_17= 'mutex' otherlv_18= '{' ( ( (lv_mutex_19_0= ruleMutex ) ) (otherlv_20= ',' ( (lv_mutex_21_0= ruleMutex ) ) )* )? otherlv_22= '}' )? otherlv_23= '}'
            {
            // InternalECFDL.g:154:3: ()
            // InternalECFDL.g:155:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEcfdAccess().getEcfdAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,15,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getEcfdAccess().getEcfdKeyword_1());
            		
            otherlv_2=(Token)match(input,16,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getEcfdAccess().getColonKeyword_2());
            		
            // InternalECFDL.g:169:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalECFDL.g:170:4: (lv_name_3_0= RULE_ID )
            {
            // InternalECFDL.g:170:4: (lv_name_3_0= RULE_ID )
            // InternalECFDL.g:171:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_name_3_0, grammarAccess.getEcfdAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEcfdRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_4=(Token)match(input,12,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getEcfdAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalECFDL.g:191:3: (otherlv_5= 'boxes' otherlv_6= '{' ( (lv_boxes_7_0= ruleBox ) ) (otherlv_8= ',' ( (lv_boxes_9_0= ruleBox ) ) )* otherlv_10= '}' )
            // InternalECFDL.g:192:4: otherlv_5= 'boxes' otherlv_6= '{' ( (lv_boxes_7_0= ruleBox ) ) (otherlv_8= ',' ( (lv_boxes_9_0= ruleBox ) ) )* otherlv_10= '}'
            {
            otherlv_5=(Token)match(input,17,FOLLOW_3); 

            				newLeafNode(otherlv_5, grammarAccess.getEcfdAccess().getBoxesKeyword_5_0());
            			
            otherlv_6=(Token)match(input,12,FOLLOW_9); 

            				newLeafNode(otherlv_6, grammarAccess.getEcfdAccess().getLeftCurlyBracketKeyword_5_1());
            			
            // InternalECFDL.g:200:4: ( (lv_boxes_7_0= ruleBox ) )
            // InternalECFDL.g:201:5: (lv_boxes_7_0= ruleBox )
            {
            // InternalECFDL.g:201:5: (lv_boxes_7_0= ruleBox )
            // InternalECFDL.g:202:6: lv_boxes_7_0= ruleBox
            {

            						newCompositeNode(grammarAccess.getEcfdAccess().getBoxesBoxParserRuleCall_5_2_0());
            					
            pushFollow(FOLLOW_5);
            lv_boxes_7_0=ruleBox();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getEcfdRule());
            						}
            						add(
            							current,
            							"boxes",
            							lv_boxes_7_0,
            							"org.xtext.ter_metamodel.ecfdl.ECFDL.Box");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            // InternalECFDL.g:219:4: (otherlv_8= ',' ( (lv_boxes_9_0= ruleBox ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==13) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalECFDL.g:220:5: otherlv_8= ',' ( (lv_boxes_9_0= ruleBox ) )
            	    {
            	    otherlv_8=(Token)match(input,13,FOLLOW_9); 

            	    					newLeafNode(otherlv_8, grammarAccess.getEcfdAccess().getCommaKeyword_5_3_0());
            	    				
            	    // InternalECFDL.g:224:5: ( (lv_boxes_9_0= ruleBox ) )
            	    // InternalECFDL.g:225:6: (lv_boxes_9_0= ruleBox )
            	    {
            	    // InternalECFDL.g:225:6: (lv_boxes_9_0= ruleBox )
            	    // InternalECFDL.g:226:7: lv_boxes_9_0= ruleBox
            	    {

            	    							newCompositeNode(grammarAccess.getEcfdAccess().getBoxesBoxParserRuleCall_5_3_1_0());
            	    						
            	    pushFollow(FOLLOW_5);
            	    lv_boxes_9_0=ruleBox();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getEcfdRule());
            	    							}
            	    							add(
            	    								current,
            	    								"boxes",
            	    								lv_boxes_9_0,
            	    								"org.xtext.ter_metamodel.ecfdl.ECFDL.Box");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_10=(Token)match(input,14,FOLLOW_10); 

            				newLeafNode(otherlv_10, grammarAccess.getEcfdAccess().getRightCurlyBracketKeyword_5_4());
            			

            }

            // InternalECFDL.g:249:3: (otherlv_11= 'groups' otherlv_12= '{' ( (lv_groups_13_0= ruleGroupBox ) ) (otherlv_14= ',' ( (lv_boxes_15_0= ruleGroupBox ) ) )* otherlv_16= '}' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==18) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalECFDL.g:250:4: otherlv_11= 'groups' otherlv_12= '{' ( (lv_groups_13_0= ruleGroupBox ) ) (otherlv_14= ',' ( (lv_boxes_15_0= ruleGroupBox ) ) )* otherlv_16= '}'
                    {
                    otherlv_11=(Token)match(input,18,FOLLOW_3); 

                    				newLeafNode(otherlv_11, grammarAccess.getEcfdAccess().getGroupsKeyword_6_0());
                    			
                    otherlv_12=(Token)match(input,12,FOLLOW_11); 

                    				newLeafNode(otherlv_12, grammarAccess.getEcfdAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalECFDL.g:258:4: ( (lv_groups_13_0= ruleGroupBox ) )
                    // InternalECFDL.g:259:5: (lv_groups_13_0= ruleGroupBox )
                    {
                    // InternalECFDL.g:259:5: (lv_groups_13_0= ruleGroupBox )
                    // InternalECFDL.g:260:6: lv_groups_13_0= ruleGroupBox
                    {

                    						newCompositeNode(grammarAccess.getEcfdAccess().getGroupsGroupBoxParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_5);
                    lv_groups_13_0=ruleGroupBox();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEcfdRule());
                    						}
                    						add(
                    							current,
                    							"groups",
                    							lv_groups_13_0,
                    							"org.xtext.ter_metamodel.ecfdl.ECFDL.GroupBox");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalECFDL.g:277:4: (otherlv_14= ',' ( (lv_boxes_15_0= ruleGroupBox ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==13) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalECFDL.g:278:5: otherlv_14= ',' ( (lv_boxes_15_0= ruleGroupBox ) )
                    	    {
                    	    otherlv_14=(Token)match(input,13,FOLLOW_11); 

                    	    					newLeafNode(otherlv_14, grammarAccess.getEcfdAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalECFDL.g:282:5: ( (lv_boxes_15_0= ruleGroupBox ) )
                    	    // InternalECFDL.g:283:6: (lv_boxes_15_0= ruleGroupBox )
                    	    {
                    	    // InternalECFDL.g:283:6: (lv_boxes_15_0= ruleGroupBox )
                    	    // InternalECFDL.g:284:7: lv_boxes_15_0= ruleGroupBox
                    	    {

                    	    							newCompositeNode(grammarAccess.getEcfdAccess().getBoxesGroupBoxParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_5);
                    	    lv_boxes_15_0=ruleGroupBox();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEcfdRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"boxes",
                    	    								lv_boxes_15_0,
                    	    								"org.xtext.ter_metamodel.ecfdl.ECFDL.GroupBox");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,14,FOLLOW_12); 

                    				newLeafNode(otherlv_16, grammarAccess.getEcfdAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalECFDL.g:307:3: (otherlv_17= 'mutex' otherlv_18= '{' ( ( (lv_mutex_19_0= ruleMutex ) ) (otherlv_20= ',' ( (lv_mutex_21_0= ruleMutex ) ) )* )? otherlv_22= '}' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalECFDL.g:308:4: otherlv_17= 'mutex' otherlv_18= '{' ( ( (lv_mutex_19_0= ruleMutex ) ) (otherlv_20= ',' ( (lv_mutex_21_0= ruleMutex ) ) )* )? otherlv_22= '}'
                    {
                    otherlv_17=(Token)match(input,19,FOLLOW_3); 

                    				newLeafNode(otherlv_17, grammarAccess.getEcfdAccess().getMutexKeyword_7_0());
                    			
                    otherlv_18=(Token)match(input,12,FOLLOW_13); 

                    				newLeafNode(otherlv_18, grammarAccess.getEcfdAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalECFDL.g:316:4: ( ( (lv_mutex_19_0= ruleMutex ) ) (otherlv_20= ',' ( (lv_mutex_21_0= ruleMutex ) ) )* )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==20) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // InternalECFDL.g:317:5: ( (lv_mutex_19_0= ruleMutex ) ) (otherlv_20= ',' ( (lv_mutex_21_0= ruleMutex ) ) )*
                            {
                            // InternalECFDL.g:317:5: ( (lv_mutex_19_0= ruleMutex ) )
                            // InternalECFDL.g:318:6: (lv_mutex_19_0= ruleMutex )
                            {
                            // InternalECFDL.g:318:6: (lv_mutex_19_0= ruleMutex )
                            // InternalECFDL.g:319:7: lv_mutex_19_0= ruleMutex
                            {

                            							newCompositeNode(grammarAccess.getEcfdAccess().getMutexMutexParserRuleCall_7_2_0_0());
                            						
                            pushFollow(FOLLOW_5);
                            lv_mutex_19_0=ruleMutex();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getEcfdRule());
                            							}
                            							add(
                            								current,
                            								"mutex",
                            								lv_mutex_19_0,
                            								"org.xtext.ter_metamodel.ecfdl.ECFDL.Mutex");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            // InternalECFDL.g:336:5: (otherlv_20= ',' ( (lv_mutex_21_0= ruleMutex ) ) )*
                            loop5:
                            do {
                                int alt5=2;
                                int LA5_0 = input.LA(1);

                                if ( (LA5_0==13) ) {
                                    alt5=1;
                                }


                                switch (alt5) {
                            	case 1 :
                            	    // InternalECFDL.g:337:6: otherlv_20= ',' ( (lv_mutex_21_0= ruleMutex ) )
                            	    {
                            	    otherlv_20=(Token)match(input,13,FOLLOW_14); 

                            	    						newLeafNode(otherlv_20, grammarAccess.getEcfdAccess().getCommaKeyword_7_2_1_0());
                            	    					
                            	    // InternalECFDL.g:341:6: ( (lv_mutex_21_0= ruleMutex ) )
                            	    // InternalECFDL.g:342:7: (lv_mutex_21_0= ruleMutex )
                            	    {
                            	    // InternalECFDL.g:342:7: (lv_mutex_21_0= ruleMutex )
                            	    // InternalECFDL.g:343:8: lv_mutex_21_0= ruleMutex
                            	    {

                            	    								newCompositeNode(grammarAccess.getEcfdAccess().getMutexMutexParserRuleCall_7_2_1_1_0());
                            	    							
                            	    pushFollow(FOLLOW_5);
                            	    lv_mutex_21_0=ruleMutex();

                            	    state._fsp--;


                            	    								if (current==null) {
                            	    									current = createModelElementForParent(grammarAccess.getEcfdRule());
                            	    								}
                            	    								add(
                            	    									current,
                            	    									"mutex",
                            	    									lv_mutex_21_0,
                            	    									"org.xtext.ter_metamodel.ecfdl.ECFDL.Mutex");
                            	    								afterParserOrEnumRuleCall();
                            	    							

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop5;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_22=(Token)match(input,14,FOLLOW_15); 

                    				newLeafNode(otherlv_22, grammarAccess.getEcfdAccess().getRightCurlyBracketKeyword_7_3());
                    			

                    }
                    break;

            }

            otherlv_23=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_23, grammarAccess.getEcfdAccess().getRightCurlyBracketKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEcfd"


    // $ANTLR start "entryRuleMutex"
    // InternalECFDL.g:375:1: entryRuleMutex returns [EObject current=null] : iv_ruleMutex= ruleMutex EOF ;
    public final EObject entryRuleMutex() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMutex = null;


        try {
            // InternalECFDL.g:375:46: (iv_ruleMutex= ruleMutex EOF )
            // InternalECFDL.g:376:2: iv_ruleMutex= ruleMutex EOF
            {
             newCompositeNode(grammarAccess.getMutexRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMutex=ruleMutex();

            state._fsp--;

             current =iv_ruleMutex; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMutex"


    // $ANTLR start "ruleMutex"
    // InternalECFDL.g:382:1: ruleMutex returns [EObject current=null] : (otherlv_0= 'Mutex' otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'boxes' otherlv_5= '(' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )+ otherlv_9= ')' otherlv_10= '}' ) ;
    public final EObject ruleMutex() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;


        	enterRule();

        try {
            // InternalECFDL.g:388:2: ( (otherlv_0= 'Mutex' otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'boxes' otherlv_5= '(' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )+ otherlv_9= ')' otherlv_10= '}' ) )
            // InternalECFDL.g:389:2: (otherlv_0= 'Mutex' otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'boxes' otherlv_5= '(' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )+ otherlv_9= ')' otherlv_10= '}' )
            {
            // InternalECFDL.g:389:2: (otherlv_0= 'Mutex' otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'boxes' otherlv_5= '(' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )+ otherlv_9= ')' otherlv_10= '}' )
            // InternalECFDL.g:390:3: otherlv_0= 'Mutex' otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'boxes' otherlv_5= '(' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )+ otherlv_9= ')' otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getMutexAccess().getMutexKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getMutexAccess().getColonKeyword_1());
            		
            // InternalECFDL.g:398:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalECFDL.g:399:4: (lv_name_2_0= RULE_ID )
            {
            // InternalECFDL.g:399:4: (lv_name_2_0= RULE_ID )
            // InternalECFDL.g:400:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_name_2_0, grammarAccess.getMutexAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMutexRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getMutexAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,17,FOLLOW_16); 

            			newLeafNode(otherlv_4, grammarAccess.getMutexAccess().getBoxesKeyword_4());
            		
            otherlv_5=(Token)match(input,21,FOLLOW_7); 

            			newLeafNode(otherlv_5, grammarAccess.getMutexAccess().getLeftParenthesisKeyword_5());
            		
            // InternalECFDL.g:428:3: ( (otherlv_6= RULE_ID ) )
            // InternalECFDL.g:429:4: (otherlv_6= RULE_ID )
            {
            // InternalECFDL.g:429:4: (otherlv_6= RULE_ID )
            // InternalECFDL.g:430:5: otherlv_6= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMutexRule());
            					}
            				
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_17); 

            					newLeafNode(otherlv_6, grammarAccess.getMutexAccess().getBoxBoxCrossReference_6_0());
            				

            }


            }

            // InternalECFDL.g:441:3: (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==13) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalECFDL.g:442:4: otherlv_7= ',' ( (otherlv_8= RULE_ID ) )
            	    {
            	    otherlv_7=(Token)match(input,13,FOLLOW_7); 

            	    				newLeafNode(otherlv_7, grammarAccess.getMutexAccess().getCommaKeyword_7_0());
            	    			
            	    // InternalECFDL.g:446:4: ( (otherlv_8= RULE_ID ) )
            	    // InternalECFDL.g:447:5: (otherlv_8= RULE_ID )
            	    {
            	    // InternalECFDL.g:447:5: (otherlv_8= RULE_ID )
            	    // InternalECFDL.g:448:6: otherlv_8= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getMutexRule());
            	    						}
            	    					
            	    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_18); 

            	    						newLeafNode(otherlv_8, grammarAccess.getMutexAccess().getBoxBoxCrossReference_7_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);

            otherlv_9=(Token)match(input,22,FOLLOW_15); 

            			newLeafNode(otherlv_9, grammarAccess.getMutexAccess().getRightParenthesisKeyword_8());
            		
            otherlv_10=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getMutexAccess().getRightCurlyBracketKeyword_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMutex"


    // $ANTLR start "entryRuleBox"
    // InternalECFDL.g:472:1: entryRuleBox returns [EObject current=null] : iv_ruleBox= ruleBox EOF ;
    public final EObject entryRuleBox() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBox = null;


        try {
            // InternalECFDL.g:472:44: (iv_ruleBox= ruleBox EOF )
            // InternalECFDL.g:473:2: iv_ruleBox= ruleBox EOF
            {
             newCompositeNode(grammarAccess.getBoxRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBox=ruleBox();

            state._fsp--;

             current =iv_ruleBox; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBox"


    // $ANTLR start "ruleBox"
    // InternalECFDL.g:479:1: ruleBox returns [EObject current=null] : ( () otherlv_1= 'Box' otherlv_2= ':' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_Root_5_0= 'Root' ) )? (otherlv_6= 'superBox' otherlv_7= '(' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* otherlv_11= ')' )? (otherlv_12= 'groupbox' otherlv_13= '(' ( (otherlv_14= RULE_ID ) ) (otherlv_15= ',' ( (otherlv_16= RULE_ID ) ) )* otherlv_17= ')' )? (otherlv_18= 'motherOf' otherlv_19= '(' ( (otherlv_20= RULE_ID ) ) (otherlv_21= ',' ( (otherlv_22= RULE_ID ) ) )* otherlv_23= ')' )? (otherlv_24= 'motherOfGroup' otherlv_25= '(' ( (otherlv_26= RULE_ID ) ) (otherlv_27= ',' ( (otherlv_28= RULE_ID ) ) )* otherlv_29= ')' )? (otherlv_30= 'mutex' otherlv_31= '(' ( (otherlv_32= RULE_ID ) ) (otherlv_33= ',' ( (otherlv_34= RULE_ID ) ) )* otherlv_35= ')' )? (otherlv_36= 'features' otherlv_37= '(' ( (lv_feature_38_0= ruleFeature ) ) (otherlv_39= ',' ( (lv_feature_40_0= ruleFeature ) ) )* otherlv_41= ')' )? otherlv_42= '}' ) ;
    public final EObject ruleBox() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token lv_Root_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        Token otherlv_32=null;
        Token otherlv_33=null;
        Token otherlv_34=null;
        Token otherlv_35=null;
        Token otherlv_36=null;
        Token otherlv_37=null;
        Token otherlv_39=null;
        Token otherlv_41=null;
        Token otherlv_42=null;
        EObject lv_feature_38_0 = null;

        EObject lv_feature_40_0 = null;



        	enterRule();

        try {
            // InternalECFDL.g:485:2: ( ( () otherlv_1= 'Box' otherlv_2= ':' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_Root_5_0= 'Root' ) )? (otherlv_6= 'superBox' otherlv_7= '(' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* otherlv_11= ')' )? (otherlv_12= 'groupbox' otherlv_13= '(' ( (otherlv_14= RULE_ID ) ) (otherlv_15= ',' ( (otherlv_16= RULE_ID ) ) )* otherlv_17= ')' )? (otherlv_18= 'motherOf' otherlv_19= '(' ( (otherlv_20= RULE_ID ) ) (otherlv_21= ',' ( (otherlv_22= RULE_ID ) ) )* otherlv_23= ')' )? (otherlv_24= 'motherOfGroup' otherlv_25= '(' ( (otherlv_26= RULE_ID ) ) (otherlv_27= ',' ( (otherlv_28= RULE_ID ) ) )* otherlv_29= ')' )? (otherlv_30= 'mutex' otherlv_31= '(' ( (otherlv_32= RULE_ID ) ) (otherlv_33= ',' ( (otherlv_34= RULE_ID ) ) )* otherlv_35= ')' )? (otherlv_36= 'features' otherlv_37= '(' ( (lv_feature_38_0= ruleFeature ) ) (otherlv_39= ',' ( (lv_feature_40_0= ruleFeature ) ) )* otherlv_41= ')' )? otherlv_42= '}' ) )
            // InternalECFDL.g:486:2: ( () otherlv_1= 'Box' otherlv_2= ':' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_Root_5_0= 'Root' ) )? (otherlv_6= 'superBox' otherlv_7= '(' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* otherlv_11= ')' )? (otherlv_12= 'groupbox' otherlv_13= '(' ( (otherlv_14= RULE_ID ) ) (otherlv_15= ',' ( (otherlv_16= RULE_ID ) ) )* otherlv_17= ')' )? (otherlv_18= 'motherOf' otherlv_19= '(' ( (otherlv_20= RULE_ID ) ) (otherlv_21= ',' ( (otherlv_22= RULE_ID ) ) )* otherlv_23= ')' )? (otherlv_24= 'motherOfGroup' otherlv_25= '(' ( (otherlv_26= RULE_ID ) ) (otherlv_27= ',' ( (otherlv_28= RULE_ID ) ) )* otherlv_29= ')' )? (otherlv_30= 'mutex' otherlv_31= '(' ( (otherlv_32= RULE_ID ) ) (otherlv_33= ',' ( (otherlv_34= RULE_ID ) ) )* otherlv_35= ')' )? (otherlv_36= 'features' otherlv_37= '(' ( (lv_feature_38_0= ruleFeature ) ) (otherlv_39= ',' ( (lv_feature_40_0= ruleFeature ) ) )* otherlv_41= ')' )? otherlv_42= '}' )
            {
            // InternalECFDL.g:486:2: ( () otherlv_1= 'Box' otherlv_2= ':' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_Root_5_0= 'Root' ) )? (otherlv_6= 'superBox' otherlv_7= '(' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* otherlv_11= ')' )? (otherlv_12= 'groupbox' otherlv_13= '(' ( (otherlv_14= RULE_ID ) ) (otherlv_15= ',' ( (otherlv_16= RULE_ID ) ) )* otherlv_17= ')' )? (otherlv_18= 'motherOf' otherlv_19= '(' ( (otherlv_20= RULE_ID ) ) (otherlv_21= ',' ( (otherlv_22= RULE_ID ) ) )* otherlv_23= ')' )? (otherlv_24= 'motherOfGroup' otherlv_25= '(' ( (otherlv_26= RULE_ID ) ) (otherlv_27= ',' ( (otherlv_28= RULE_ID ) ) )* otherlv_29= ')' )? (otherlv_30= 'mutex' otherlv_31= '(' ( (otherlv_32= RULE_ID ) ) (otherlv_33= ',' ( (otherlv_34= RULE_ID ) ) )* otherlv_35= ')' )? (otherlv_36= 'features' otherlv_37= '(' ( (lv_feature_38_0= ruleFeature ) ) (otherlv_39= ',' ( (lv_feature_40_0= ruleFeature ) ) )* otherlv_41= ')' )? otherlv_42= '}' )
            // InternalECFDL.g:487:3: () otherlv_1= 'Box' otherlv_2= ':' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_Root_5_0= 'Root' ) )? (otherlv_6= 'superBox' otherlv_7= '(' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* otherlv_11= ')' )? (otherlv_12= 'groupbox' otherlv_13= '(' ( (otherlv_14= RULE_ID ) ) (otherlv_15= ',' ( (otherlv_16= RULE_ID ) ) )* otherlv_17= ')' )? (otherlv_18= 'motherOf' otherlv_19= '(' ( (otherlv_20= RULE_ID ) ) (otherlv_21= ',' ( (otherlv_22= RULE_ID ) ) )* otherlv_23= ')' )? (otherlv_24= 'motherOfGroup' otherlv_25= '(' ( (otherlv_26= RULE_ID ) ) (otherlv_27= ',' ( (otherlv_28= RULE_ID ) ) )* otherlv_29= ')' )? (otherlv_30= 'mutex' otherlv_31= '(' ( (otherlv_32= RULE_ID ) ) (otherlv_33= ',' ( (otherlv_34= RULE_ID ) ) )* otherlv_35= ')' )? (otherlv_36= 'features' otherlv_37= '(' ( (lv_feature_38_0= ruleFeature ) ) (otherlv_39= ',' ( (lv_feature_40_0= ruleFeature ) ) )* otherlv_41= ')' )? otherlv_42= '}'
            {
            // InternalECFDL.g:487:3: ()
            // InternalECFDL.g:488:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBoxAccess().getBoxAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,23,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getBoxAccess().getBoxKeyword_1());
            		
            otherlv_2=(Token)match(input,16,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getBoxAccess().getColonKeyword_2());
            		
            // InternalECFDL.g:502:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalECFDL.g:503:4: (lv_name_3_0= RULE_ID )
            {
            // InternalECFDL.g:503:4: (lv_name_3_0= RULE_ID )
            // InternalECFDL.g:504:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_name_3_0, grammarAccess.getBoxAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBoxRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_4=(Token)match(input,12,FOLLOW_19); 

            			newLeafNode(otherlv_4, grammarAccess.getBoxAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalECFDL.g:524:3: ( (lv_Root_5_0= 'Root' ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==24) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalECFDL.g:525:4: (lv_Root_5_0= 'Root' )
                    {
                    // InternalECFDL.g:525:4: (lv_Root_5_0= 'Root' )
                    // InternalECFDL.g:526:5: lv_Root_5_0= 'Root'
                    {
                    lv_Root_5_0=(Token)match(input,24,FOLLOW_20); 

                    					newLeafNode(lv_Root_5_0, grammarAccess.getBoxAccess().getRootRootKeyword_5_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBoxRule());
                    					}
                    					setWithLastConsumed(current, "Root", true, "Root");
                    				

                    }


                    }
                    break;

            }

            // InternalECFDL.g:538:3: (otherlv_6= 'superBox' otherlv_7= '(' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* otherlv_11= ')' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==25) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalECFDL.g:539:4: otherlv_6= 'superBox' otherlv_7= '(' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* otherlv_11= ')'
                    {
                    otherlv_6=(Token)match(input,25,FOLLOW_16); 

                    				newLeafNode(otherlv_6, grammarAccess.getBoxAccess().getSuperBoxKeyword_6_0());
                    			
                    otherlv_7=(Token)match(input,21,FOLLOW_7); 

                    				newLeafNode(otherlv_7, grammarAccess.getBoxAccess().getLeftParenthesisKeyword_6_1());
                    			
                    // InternalECFDL.g:547:4: ( (otherlv_8= RULE_ID ) )
                    // InternalECFDL.g:548:5: (otherlv_8= RULE_ID )
                    {
                    // InternalECFDL.g:548:5: (otherlv_8= RULE_ID )
                    // InternalECFDL.g:549:6: otherlv_8= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBoxRule());
                    						}
                    					
                    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_18); 

                    						newLeafNode(otherlv_8, grammarAccess.getBoxAccess().getSuperBoxBoxCrossReference_6_2_0());
                    					

                    }


                    }

                    // InternalECFDL.g:560:4: (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==13) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalECFDL.g:561:5: otherlv_9= ',' ( (otherlv_10= RULE_ID ) )
                    	    {
                    	    otherlv_9=(Token)match(input,13,FOLLOW_7); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getBoxAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalECFDL.g:565:5: ( (otherlv_10= RULE_ID ) )
                    	    // InternalECFDL.g:566:6: (otherlv_10= RULE_ID )
                    	    {
                    	    // InternalECFDL.g:566:6: (otherlv_10= RULE_ID )
                    	    // InternalECFDL.g:567:7: otherlv_10= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getBoxRule());
                    	    							}
                    	    						
                    	    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_18); 

                    	    							newLeafNode(otherlv_10, grammarAccess.getBoxAccess().getSuperBoxBoxCrossReference_6_3_1_0());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,22,FOLLOW_21); 

                    				newLeafNode(otherlv_11, grammarAccess.getBoxAccess().getRightParenthesisKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalECFDL.g:584:3: (otherlv_12= 'groupbox' otherlv_13= '(' ( (otherlv_14= RULE_ID ) ) (otherlv_15= ',' ( (otherlv_16= RULE_ID ) ) )* otherlv_17= ')' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==26) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalECFDL.g:585:4: otherlv_12= 'groupbox' otherlv_13= '(' ( (otherlv_14= RULE_ID ) ) (otherlv_15= ',' ( (otherlv_16= RULE_ID ) ) )* otherlv_17= ')'
                    {
                    otherlv_12=(Token)match(input,26,FOLLOW_16); 

                    				newLeafNode(otherlv_12, grammarAccess.getBoxAccess().getGroupboxKeyword_7_0());
                    			
                    otherlv_13=(Token)match(input,21,FOLLOW_7); 

                    				newLeafNode(otherlv_13, grammarAccess.getBoxAccess().getLeftParenthesisKeyword_7_1());
                    			
                    // InternalECFDL.g:593:4: ( (otherlv_14= RULE_ID ) )
                    // InternalECFDL.g:594:5: (otherlv_14= RULE_ID )
                    {
                    // InternalECFDL.g:594:5: (otherlv_14= RULE_ID )
                    // InternalECFDL.g:595:6: otherlv_14= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBoxRule());
                    						}
                    					
                    otherlv_14=(Token)match(input,RULE_ID,FOLLOW_18); 

                    						newLeafNode(otherlv_14, grammarAccess.getBoxAccess().getGroupboxGroupBoxCrossReference_7_2_0());
                    					

                    }


                    }

                    // InternalECFDL.g:606:4: (otherlv_15= ',' ( (otherlv_16= RULE_ID ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==13) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalECFDL.g:607:5: otherlv_15= ',' ( (otherlv_16= RULE_ID ) )
                    	    {
                    	    otherlv_15=(Token)match(input,13,FOLLOW_7); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getBoxAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalECFDL.g:611:5: ( (otherlv_16= RULE_ID ) )
                    	    // InternalECFDL.g:612:6: (otherlv_16= RULE_ID )
                    	    {
                    	    // InternalECFDL.g:612:6: (otherlv_16= RULE_ID )
                    	    // InternalECFDL.g:613:7: otherlv_16= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getBoxRule());
                    	    							}
                    	    						
                    	    otherlv_16=(Token)match(input,RULE_ID,FOLLOW_18); 

                    	    							newLeafNode(otherlv_16, grammarAccess.getBoxAccess().getGroupboxGroupBoxCrossReference_7_3_1_0());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,22,FOLLOW_22); 

                    				newLeafNode(otherlv_17, grammarAccess.getBoxAccess().getRightParenthesisKeyword_7_4());
                    			

                    }
                    break;

            }

            // InternalECFDL.g:630:3: (otherlv_18= 'motherOf' otherlv_19= '(' ( (otherlv_20= RULE_ID ) ) (otherlv_21= ',' ( (otherlv_22= RULE_ID ) ) )* otherlv_23= ')' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==27) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalECFDL.g:631:4: otherlv_18= 'motherOf' otherlv_19= '(' ( (otherlv_20= RULE_ID ) ) (otherlv_21= ',' ( (otherlv_22= RULE_ID ) ) )* otherlv_23= ')'
                    {
                    otherlv_18=(Token)match(input,27,FOLLOW_16); 

                    				newLeafNode(otherlv_18, grammarAccess.getBoxAccess().getMotherOfKeyword_8_0());
                    			
                    otherlv_19=(Token)match(input,21,FOLLOW_7); 

                    				newLeafNode(otherlv_19, grammarAccess.getBoxAccess().getLeftParenthesisKeyword_8_1());
                    			
                    // InternalECFDL.g:639:4: ( (otherlv_20= RULE_ID ) )
                    // InternalECFDL.g:640:5: (otherlv_20= RULE_ID )
                    {
                    // InternalECFDL.g:640:5: (otherlv_20= RULE_ID )
                    // InternalECFDL.g:641:6: otherlv_20= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBoxRule());
                    						}
                    					
                    otherlv_20=(Token)match(input,RULE_ID,FOLLOW_18); 

                    						newLeafNode(otherlv_20, grammarAccess.getBoxAccess().getChildBoxBoxCrossReference_8_2_0());
                    					

                    }


                    }

                    // InternalECFDL.g:652:4: (otherlv_21= ',' ( (otherlv_22= RULE_ID ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==13) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalECFDL.g:653:5: otherlv_21= ',' ( (otherlv_22= RULE_ID ) )
                    	    {
                    	    otherlv_21=(Token)match(input,13,FOLLOW_7); 

                    	    					newLeafNode(otherlv_21, grammarAccess.getBoxAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalECFDL.g:657:5: ( (otherlv_22= RULE_ID ) )
                    	    // InternalECFDL.g:658:6: (otherlv_22= RULE_ID )
                    	    {
                    	    // InternalECFDL.g:658:6: (otherlv_22= RULE_ID )
                    	    // InternalECFDL.g:659:7: otherlv_22= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getBoxRule());
                    	    							}
                    	    						
                    	    otherlv_22=(Token)match(input,RULE_ID,FOLLOW_18); 

                    	    							newLeafNode(otherlv_22, grammarAccess.getBoxAccess().getChildBoxBoxCrossReference_8_3_1_0());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    otherlv_23=(Token)match(input,22,FOLLOW_23); 

                    				newLeafNode(otherlv_23, grammarAccess.getBoxAccess().getRightParenthesisKeyword_8_4());
                    			

                    }
                    break;

            }

            // InternalECFDL.g:676:3: (otherlv_24= 'motherOfGroup' otherlv_25= '(' ( (otherlv_26= RULE_ID ) ) (otherlv_27= ',' ( (otherlv_28= RULE_ID ) ) )* otherlv_29= ')' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==28) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalECFDL.g:677:4: otherlv_24= 'motherOfGroup' otherlv_25= '(' ( (otherlv_26= RULE_ID ) ) (otherlv_27= ',' ( (otherlv_28= RULE_ID ) ) )* otherlv_29= ')'
                    {
                    otherlv_24=(Token)match(input,28,FOLLOW_16); 

                    				newLeafNode(otherlv_24, grammarAccess.getBoxAccess().getMotherOfGroupKeyword_9_0());
                    			
                    otherlv_25=(Token)match(input,21,FOLLOW_7); 

                    				newLeafNode(otherlv_25, grammarAccess.getBoxAccess().getLeftParenthesisKeyword_9_1());
                    			
                    // InternalECFDL.g:685:4: ( (otherlv_26= RULE_ID ) )
                    // InternalECFDL.g:686:5: (otherlv_26= RULE_ID )
                    {
                    // InternalECFDL.g:686:5: (otherlv_26= RULE_ID )
                    // InternalECFDL.g:687:6: otherlv_26= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBoxRule());
                    						}
                    					
                    otherlv_26=(Token)match(input,RULE_ID,FOLLOW_18); 

                    						newLeafNode(otherlv_26, grammarAccess.getBoxAccess().getChildGroupGroupBoxCrossReference_9_2_0());
                    					

                    }


                    }

                    // InternalECFDL.g:698:4: (otherlv_27= ',' ( (otherlv_28= RULE_ID ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==13) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalECFDL.g:699:5: otherlv_27= ',' ( (otherlv_28= RULE_ID ) )
                    	    {
                    	    otherlv_27=(Token)match(input,13,FOLLOW_7); 

                    	    					newLeafNode(otherlv_27, grammarAccess.getBoxAccess().getCommaKeyword_9_3_0());
                    	    				
                    	    // InternalECFDL.g:703:5: ( (otherlv_28= RULE_ID ) )
                    	    // InternalECFDL.g:704:6: (otherlv_28= RULE_ID )
                    	    {
                    	    // InternalECFDL.g:704:6: (otherlv_28= RULE_ID )
                    	    // InternalECFDL.g:705:7: otherlv_28= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getBoxRule());
                    	    							}
                    	    						
                    	    otherlv_28=(Token)match(input,RULE_ID,FOLLOW_18); 

                    	    							newLeafNode(otherlv_28, grammarAccess.getBoxAccess().getChildGroupGroupBoxCrossReference_9_3_1_0());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);

                    otherlv_29=(Token)match(input,22,FOLLOW_24); 

                    				newLeafNode(otherlv_29, grammarAccess.getBoxAccess().getRightParenthesisKeyword_9_4());
                    			

                    }
                    break;

            }

            // InternalECFDL.g:722:3: (otherlv_30= 'mutex' otherlv_31= '(' ( (otherlv_32= RULE_ID ) ) (otherlv_33= ',' ( (otherlv_34= RULE_ID ) ) )* otherlv_35= ')' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==19) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalECFDL.g:723:4: otherlv_30= 'mutex' otherlv_31= '(' ( (otherlv_32= RULE_ID ) ) (otherlv_33= ',' ( (otherlv_34= RULE_ID ) ) )* otherlv_35= ')'
                    {
                    otherlv_30=(Token)match(input,19,FOLLOW_16); 

                    				newLeafNode(otherlv_30, grammarAccess.getBoxAccess().getMutexKeyword_10_0());
                    			
                    otherlv_31=(Token)match(input,21,FOLLOW_7); 

                    				newLeafNode(otherlv_31, grammarAccess.getBoxAccess().getLeftParenthesisKeyword_10_1());
                    			
                    // InternalECFDL.g:731:4: ( (otherlv_32= RULE_ID ) )
                    // InternalECFDL.g:732:5: (otherlv_32= RULE_ID )
                    {
                    // InternalECFDL.g:732:5: (otherlv_32= RULE_ID )
                    // InternalECFDL.g:733:6: otherlv_32= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBoxRule());
                    						}
                    					
                    otherlv_32=(Token)match(input,RULE_ID,FOLLOW_18); 

                    						newLeafNode(otherlv_32, grammarAccess.getBoxAccess().getMutexMutexCrossReference_10_2_0());
                    					

                    }


                    }

                    // InternalECFDL.g:744:4: (otherlv_33= ',' ( (otherlv_34= RULE_ID ) ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==13) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalECFDL.g:745:5: otherlv_33= ',' ( (otherlv_34= RULE_ID ) )
                    	    {
                    	    otherlv_33=(Token)match(input,13,FOLLOW_7); 

                    	    					newLeafNode(otherlv_33, grammarAccess.getBoxAccess().getCommaKeyword_10_3_0());
                    	    				
                    	    // InternalECFDL.g:749:5: ( (otherlv_34= RULE_ID ) )
                    	    // InternalECFDL.g:750:6: (otherlv_34= RULE_ID )
                    	    {
                    	    // InternalECFDL.g:750:6: (otherlv_34= RULE_ID )
                    	    // InternalECFDL.g:751:7: otherlv_34= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getBoxRule());
                    	    							}
                    	    						
                    	    otherlv_34=(Token)match(input,RULE_ID,FOLLOW_18); 

                    	    							newLeafNode(otherlv_34, grammarAccess.getBoxAccess().getMutexMutexCrossReference_10_3_1_0());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);

                    otherlv_35=(Token)match(input,22,FOLLOW_25); 

                    				newLeafNode(otherlv_35, grammarAccess.getBoxAccess().getRightParenthesisKeyword_10_4());
                    			

                    }
                    break;

            }

            // InternalECFDL.g:768:3: (otherlv_36= 'features' otherlv_37= '(' ( (lv_feature_38_0= ruleFeature ) ) (otherlv_39= ',' ( (lv_feature_40_0= ruleFeature ) ) )* otherlv_41= ')' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==29) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalECFDL.g:769:4: otherlv_36= 'features' otherlv_37= '(' ( (lv_feature_38_0= ruleFeature ) ) (otherlv_39= ',' ( (lv_feature_40_0= ruleFeature ) ) )* otherlv_41= ')'
                    {
                    otherlv_36=(Token)match(input,29,FOLLOW_16); 

                    				newLeafNode(otherlv_36, grammarAccess.getBoxAccess().getFeaturesKeyword_11_0());
                    			
                    otherlv_37=(Token)match(input,21,FOLLOW_26); 

                    				newLeafNode(otherlv_37, grammarAccess.getBoxAccess().getLeftParenthesisKeyword_11_1());
                    			
                    // InternalECFDL.g:777:4: ( (lv_feature_38_0= ruleFeature ) )
                    // InternalECFDL.g:778:5: (lv_feature_38_0= ruleFeature )
                    {
                    // InternalECFDL.g:778:5: (lv_feature_38_0= ruleFeature )
                    // InternalECFDL.g:779:6: lv_feature_38_0= ruleFeature
                    {

                    						newCompositeNode(grammarAccess.getBoxAccess().getFeatureFeatureParserRuleCall_11_2_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_feature_38_0=ruleFeature();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBoxRule());
                    						}
                    						add(
                    							current,
                    							"feature",
                    							lv_feature_38_0,
                    							"org.xtext.ter_metamodel.ecfdl.ECFDL.Feature");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalECFDL.g:796:4: (otherlv_39= ',' ( (lv_feature_40_0= ruleFeature ) ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==13) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // InternalECFDL.g:797:5: otherlv_39= ',' ( (lv_feature_40_0= ruleFeature ) )
                    	    {
                    	    otherlv_39=(Token)match(input,13,FOLLOW_26); 

                    	    					newLeafNode(otherlv_39, grammarAccess.getBoxAccess().getCommaKeyword_11_3_0());
                    	    				
                    	    // InternalECFDL.g:801:5: ( (lv_feature_40_0= ruleFeature ) )
                    	    // InternalECFDL.g:802:6: (lv_feature_40_0= ruleFeature )
                    	    {
                    	    // InternalECFDL.g:802:6: (lv_feature_40_0= ruleFeature )
                    	    // InternalECFDL.g:803:7: lv_feature_40_0= ruleFeature
                    	    {

                    	    							newCompositeNode(grammarAccess.getBoxAccess().getFeatureFeatureParserRuleCall_11_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_18);
                    	    lv_feature_40_0=ruleFeature();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getBoxRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"feature",
                    	    								lv_feature_40_0,
                    	    								"org.xtext.ter_metamodel.ecfdl.ECFDL.Feature");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);

                    otherlv_41=(Token)match(input,22,FOLLOW_15); 

                    				newLeafNode(otherlv_41, grammarAccess.getBoxAccess().getRightParenthesisKeyword_11_4());
                    			

                    }
                    break;

            }

            otherlv_42=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_42, grammarAccess.getBoxAccess().getRightCurlyBracketKeyword_12());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBox"


    // $ANTLR start "entryRuleGroupBox"
    // InternalECFDL.g:834:1: entryRuleGroupBox returns [EObject current=null] : iv_ruleGroupBox= ruleGroupBox EOF ;
    public final EObject entryRuleGroupBox() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroupBox = null;


        try {
            // InternalECFDL.g:834:49: (iv_ruleGroupBox= ruleGroupBox EOF )
            // InternalECFDL.g:835:2: iv_ruleGroupBox= ruleGroupBox EOF
            {
             newCompositeNode(grammarAccess.getGroupBoxRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGroupBox=ruleGroupBox();

            state._fsp--;

             current =iv_ruleGroupBox; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGroupBox"


    // $ANTLR start "ruleGroupBox"
    // InternalECFDL.g:841:1: ruleGroupBox returns [EObject current=null] : (otherlv_0= 'GroupBox' otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_Exclusif_4_0= 'Exclusif' ) )? otherlv_5= 'superBox' otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) otherlv_8= ')' otherlv_9= 'boxes' otherlv_10= '(' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )+ otherlv_14= ')' otherlv_15= '}' ) ;
    public final EObject ruleGroupBox() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_Exclusif_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;


        	enterRule();

        try {
            // InternalECFDL.g:847:2: ( (otherlv_0= 'GroupBox' otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_Exclusif_4_0= 'Exclusif' ) )? otherlv_5= 'superBox' otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) otherlv_8= ')' otherlv_9= 'boxes' otherlv_10= '(' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )+ otherlv_14= ')' otherlv_15= '}' ) )
            // InternalECFDL.g:848:2: (otherlv_0= 'GroupBox' otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_Exclusif_4_0= 'Exclusif' ) )? otherlv_5= 'superBox' otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) otherlv_8= ')' otherlv_9= 'boxes' otherlv_10= '(' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )+ otherlv_14= ')' otherlv_15= '}' )
            {
            // InternalECFDL.g:848:2: (otherlv_0= 'GroupBox' otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_Exclusif_4_0= 'Exclusif' ) )? otherlv_5= 'superBox' otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) otherlv_8= ')' otherlv_9= 'boxes' otherlv_10= '(' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )+ otherlv_14= ')' otherlv_15= '}' )
            // InternalECFDL.g:849:3: otherlv_0= 'GroupBox' otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_Exclusif_4_0= 'Exclusif' ) )? otherlv_5= 'superBox' otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) otherlv_8= ')' otherlv_9= 'boxes' otherlv_10= '(' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )+ otherlv_14= ')' otherlv_15= '}'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getGroupBoxAccess().getGroupBoxKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getGroupBoxAccess().getColonKeyword_1());
            		
            // InternalECFDL.g:857:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalECFDL.g:858:4: (lv_name_2_0= RULE_ID )
            {
            // InternalECFDL.g:858:4: (lv_name_2_0= RULE_ID )
            // InternalECFDL.g:859:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_name_2_0, grammarAccess.getGroupBoxAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGroupBoxRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_27); 

            			newLeafNode(otherlv_3, grammarAccess.getGroupBoxAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalECFDL.g:879:3: ( (lv_Exclusif_4_0= 'Exclusif' ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==31) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalECFDL.g:880:4: (lv_Exclusif_4_0= 'Exclusif' )
                    {
                    // InternalECFDL.g:880:4: (lv_Exclusif_4_0= 'Exclusif' )
                    // InternalECFDL.g:881:5: lv_Exclusif_4_0= 'Exclusif'
                    {
                    lv_Exclusif_4_0=(Token)match(input,31,FOLLOW_28); 

                    					newLeafNode(lv_Exclusif_4_0, grammarAccess.getGroupBoxAccess().getExclusifExclusifKeyword_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getGroupBoxRule());
                    					}
                    					setWithLastConsumed(current, "Exclusif", true, "Exclusif");
                    				

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,25,FOLLOW_16); 

            			newLeafNode(otherlv_5, grammarAccess.getGroupBoxAccess().getSuperBoxKeyword_5());
            		
            otherlv_6=(Token)match(input,21,FOLLOW_7); 

            			newLeafNode(otherlv_6, grammarAccess.getGroupBoxAccess().getLeftParenthesisKeyword_6());
            		
            // InternalECFDL.g:901:3: ( (otherlv_7= RULE_ID ) )
            // InternalECFDL.g:902:4: (otherlv_7= RULE_ID )
            {
            // InternalECFDL.g:902:4: (otherlv_7= RULE_ID )
            // InternalECFDL.g:903:5: otherlv_7= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGroupBoxRule());
            					}
            				
            otherlv_7=(Token)match(input,RULE_ID,FOLLOW_29); 

            					newLeafNode(otherlv_7, grammarAccess.getGroupBoxAccess().getSuperBoxBoxCrossReference_7_0());
            				

            }


            }

            otherlv_8=(Token)match(input,22,FOLLOW_8); 

            			newLeafNode(otherlv_8, grammarAccess.getGroupBoxAccess().getRightParenthesisKeyword_8());
            		
            otherlv_9=(Token)match(input,17,FOLLOW_16); 

            			newLeafNode(otherlv_9, grammarAccess.getGroupBoxAccess().getBoxesKeyword_9());
            		
            otherlv_10=(Token)match(input,21,FOLLOW_7); 

            			newLeafNode(otherlv_10, grammarAccess.getGroupBoxAccess().getLeftParenthesisKeyword_10());
            		
            // InternalECFDL.g:926:3: ( (otherlv_11= RULE_ID ) )
            // InternalECFDL.g:927:4: (otherlv_11= RULE_ID )
            {
            // InternalECFDL.g:927:4: (otherlv_11= RULE_ID )
            // InternalECFDL.g:928:5: otherlv_11= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGroupBoxRule());
            					}
            				
            otherlv_11=(Token)match(input,RULE_ID,FOLLOW_17); 

            					newLeafNode(otherlv_11, grammarAccess.getGroupBoxAccess().getBoxBoxCrossReference_11_0());
            				

            }


            }

            // InternalECFDL.g:939:3: (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )+
            int cnt23=0;
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==13) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalECFDL.g:940:4: otherlv_12= ',' ( (otherlv_13= RULE_ID ) )
            	    {
            	    otherlv_12=(Token)match(input,13,FOLLOW_7); 

            	    				newLeafNode(otherlv_12, grammarAccess.getGroupBoxAccess().getCommaKeyword_12_0());
            	    			
            	    // InternalECFDL.g:944:4: ( (otherlv_13= RULE_ID ) )
            	    // InternalECFDL.g:945:5: (otherlv_13= RULE_ID )
            	    {
            	    // InternalECFDL.g:945:5: (otherlv_13= RULE_ID )
            	    // InternalECFDL.g:946:6: otherlv_13= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getGroupBoxRule());
            	    						}
            	    					
            	    otherlv_13=(Token)match(input,RULE_ID,FOLLOW_18); 

            	    						newLeafNode(otherlv_13, grammarAccess.getGroupBoxAccess().getBoxBoxCrossReference_12_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt23 >= 1 ) break loop23;
                        EarlyExitException eee =
                            new EarlyExitException(23, input);
                        throw eee;
                }
                cnt23++;
            } while (true);

            otherlv_14=(Token)match(input,22,FOLLOW_15); 

            			newLeafNode(otherlv_14, grammarAccess.getGroupBoxAccess().getRightParenthesisKeyword_13());
            		
            otherlv_15=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getGroupBoxAccess().getRightCurlyBracketKeyword_14());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGroupBox"


    // $ANTLR start "entryRuleFeature"
    // InternalECFDL.g:970:1: entryRuleFeature returns [EObject current=null] : iv_ruleFeature= ruleFeature EOF ;
    public final EObject entryRuleFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeature = null;


        try {
            // InternalECFDL.g:970:48: (iv_ruleFeature= ruleFeature EOF )
            // InternalECFDL.g:971:2: iv_ruleFeature= ruleFeature EOF
            {
             newCompositeNode(grammarAccess.getFeatureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFeature=ruleFeature();

            state._fsp--;

             current =iv_ruleFeature; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFeature"


    // $ANTLR start "ruleFeature"
    // InternalECFDL.g:977:1: ruleFeature returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) )? ) ;
    public final EObject ruleFeature() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalECFDL.g:983:2: ( ( () ( (lv_name_1_0= ruleEString ) )? ) )
            // InternalECFDL.g:984:2: ( () ( (lv_name_1_0= ruleEString ) )? )
            {
            // InternalECFDL.g:984:2: ( () ( (lv_name_1_0= ruleEString ) )? )
            // InternalECFDL.g:985:3: () ( (lv_name_1_0= ruleEString ) )?
            {
            // InternalECFDL.g:985:3: ()
            // InternalECFDL.g:986:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFeatureAccess().getFeatureAction_0(),
            					current);
            			

            }

            // InternalECFDL.g:992:3: ( (lv_name_1_0= ruleEString ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=RULE_ID && LA24_0<=RULE_STRING)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalECFDL.g:993:4: (lv_name_1_0= ruleEString )
                    {
                    // InternalECFDL.g:993:4: (lv_name_1_0= ruleEString )
                    // InternalECFDL.g:994:5: lv_name_1_0= ruleEString
                    {

                    					newCompositeNode(grammarAccess.getFeatureAccess().getNameEStringParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_name_1_0=ruleEString();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFeatureRule());
                    					}
                    					set(
                    						current,
                    						"name",
                    						lv_name_1_0,
                    						"org.xtext.ter_metamodel.ecfdl.ECFDL.EString");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFeature"


    // $ANTLR start "entryRuleEString"
    // InternalECFDL.g:1015:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalECFDL.g:1015:47: (iv_ruleEString= ruleEString EOF )
            // InternalECFDL.g:1016:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalECFDL.g:1022:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalECFDL.g:1028:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalECFDL.g:1029:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalECFDL.g:1029:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_STRING) ) {
                alt25=1;
            }
            else if ( (LA25_0==RULE_ID) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalECFDL.g:1030:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalECFDL.g:1038:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000000C4000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000084000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000104000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000402000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x000000003F084000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000000003E084000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000000003C084000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000038084000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000030084000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000020084000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000020004000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000402030L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000082000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000400000L});

}