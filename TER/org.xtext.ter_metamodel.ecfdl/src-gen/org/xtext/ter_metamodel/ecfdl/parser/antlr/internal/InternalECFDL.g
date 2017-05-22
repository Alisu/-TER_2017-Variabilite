/*
 * generated by Xtext 2.10.0
 */
grammar InternalECFDL;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.xtext.ter_metamodel.ecfdl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleFile
entryRuleFile returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFileRule()); }
	iv_ruleFile=ruleFile
	{ $current=$iv_ruleFile.current; }
	EOF;

// Rule File
ruleFile returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='listEcfd'
		{
			newLeafNode(otherlv_0, grammarAccess.getFileAccess().getListEcfdKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getFileAccess().getLeftCurlyBracketKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getFileAccess().getEcfdEcfdParserRuleCall_2_0());
				}
				lv_ecfd_2_0=ruleEcfd
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFileRule());
					}
					add(
						$current,
						"ecfd",
						lv_ecfd_2_0,
						"org.xtext.ter_metamodel.ecfdl.ECFDL.Ecfd");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_3=','
			{
				newLeafNode(otherlv_3, grammarAccess.getFileAccess().getCommaKeyword_3_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getFileAccess().getEcfdEcfdParserRuleCall_3_1_0());
					}
					lv_ecfd_4_0=ruleEcfd
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getFileRule());
						}
						add(
							$current,
							"ecfd",
							lv_ecfd_4_0,
							"org.xtext.ter_metamodel.ecfdl.ECFDL.Ecfd");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		otherlv_5='}'
		{
			newLeafNode(otherlv_5, grammarAccess.getFileAccess().getRightCurlyBracketKeyword_4());
		}
	)
;

// Entry rule entryRuleEcfd
entryRuleEcfd returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEcfdRule()); }
	iv_ruleEcfd=ruleEcfd
	{ $current=$iv_ruleEcfd.current; }
	EOF;

// Rule Ecfd
ruleEcfd returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getEcfdAccess().getEcfdAction_0(),
					$current);
			}
		)
		otherlv_1='Ecfd'
		{
			newLeafNode(otherlv_1, grammarAccess.getEcfdAccess().getEcfdKeyword_1());
		}
		otherlv_2=':'
		{
			newLeafNode(otherlv_2, grammarAccess.getEcfdAccess().getColonKeyword_2());
		}
		(
			(
				lv_name_3_0=RULE_ID
				{
					newLeafNode(lv_name_3_0, grammarAccess.getEcfdAccess().getNameIDTerminalRuleCall_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getEcfdRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_3_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_4='{'
		{
			newLeafNode(otherlv_4, grammarAccess.getEcfdAccess().getLeftCurlyBracketKeyword_4());
		}
		(
			otherlv_5='boxes'
			{
				newLeafNode(otherlv_5, grammarAccess.getEcfdAccess().getBoxesKeyword_5_0());
			}
			otherlv_6='{'
			{
				newLeafNode(otherlv_6, grammarAccess.getEcfdAccess().getLeftCurlyBracketKeyword_5_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getEcfdAccess().getBoxesBoxParserRuleCall_5_2_0());
					}
					lv_boxes_7_0=ruleBox
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getEcfdRule());
						}
						add(
							$current,
							"boxes",
							lv_boxes_7_0,
							"org.xtext.ter_metamodel.ecfdl.ECFDL.Box");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_8=','
				{
					newLeafNode(otherlv_8, grammarAccess.getEcfdAccess().getCommaKeyword_5_3_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getEcfdAccess().getBoxesBoxParserRuleCall_5_3_1_0());
						}
						lv_boxes_9_0=ruleBox
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getEcfdRule());
							}
							add(
								$current,
								"boxes",
								lv_boxes_9_0,
								"org.xtext.ter_metamodel.ecfdl.ECFDL.Box");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_10='}'
			{
				newLeafNode(otherlv_10, grammarAccess.getEcfdAccess().getRightCurlyBracketKeyword_5_4());
			}
		)
		(
			otherlv_11='groups'
			{
				newLeafNode(otherlv_11, grammarAccess.getEcfdAccess().getGroupsKeyword_6_0());
			}
			otherlv_12='{'
			{
				newLeafNode(otherlv_12, grammarAccess.getEcfdAccess().getLeftCurlyBracketKeyword_6_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getEcfdAccess().getGroupsGroupBoxParserRuleCall_6_2_0());
					}
					lv_groups_13_0=ruleGroupBox
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getEcfdRule());
						}
						add(
							$current,
							"groups",
							lv_groups_13_0,
							"org.xtext.ter_metamodel.ecfdl.ECFDL.GroupBox");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_14=','
				{
					newLeafNode(otherlv_14, grammarAccess.getEcfdAccess().getCommaKeyword_6_3_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getEcfdAccess().getBoxesGroupBoxParserRuleCall_6_3_1_0());
						}
						lv_boxes_15_0=ruleGroupBox
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getEcfdRule());
							}
							add(
								$current,
								"boxes",
								lv_boxes_15_0,
								"org.xtext.ter_metamodel.ecfdl.ECFDL.GroupBox");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_16='}'
			{
				newLeafNode(otherlv_16, grammarAccess.getEcfdAccess().getRightCurlyBracketKeyword_6_4());
			}
		)?
		(
			otherlv_17='mutex'
			{
				newLeafNode(otherlv_17, grammarAccess.getEcfdAccess().getMutexKeyword_7_0());
			}
			otherlv_18='{'
			{
				newLeafNode(otherlv_18, grammarAccess.getEcfdAccess().getLeftCurlyBracketKeyword_7_1());
			}
			(
				(
					(
						{
							newCompositeNode(grammarAccess.getEcfdAccess().getMutexMutexParserRuleCall_7_2_0_0());
						}
						lv_mutex_19_0=ruleMutex
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getEcfdRule());
							}
							add(
								$current,
								"mutex",
								lv_mutex_19_0,
								"org.xtext.ter_metamodel.ecfdl.ECFDL.Mutex");
							afterParserOrEnumRuleCall();
						}
					)
				)
				(
					otherlv_20=','
					{
						newLeafNode(otherlv_20, grammarAccess.getEcfdAccess().getCommaKeyword_7_2_1_0());
					}
					(
						(
							{
								newCompositeNode(grammarAccess.getEcfdAccess().getMutexMutexParserRuleCall_7_2_1_1_0());
							}
							lv_mutex_21_0=ruleMutex
							{
								if ($current==null) {
									$current = createModelElementForParent(grammarAccess.getEcfdRule());
								}
								add(
									$current,
									"mutex",
									lv_mutex_21_0,
									"org.xtext.ter_metamodel.ecfdl.ECFDL.Mutex");
								afterParserOrEnumRuleCall();
							}
						)
					)
				)*
			)?
			otherlv_22='}'
			{
				newLeafNode(otherlv_22, grammarAccess.getEcfdAccess().getRightCurlyBracketKeyword_7_3());
			}
		)?
		otherlv_23='}'
		{
			newLeafNode(otherlv_23, grammarAccess.getEcfdAccess().getRightCurlyBracketKeyword_8());
		}
	)
;

// Entry rule entryRuleMutex
entryRuleMutex returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMutexRule()); }
	iv_ruleMutex=ruleMutex
	{ $current=$iv_ruleMutex.current; }
	EOF;

// Rule Mutex
ruleMutex returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Mutex'
		{
			newLeafNode(otherlv_0, grammarAccess.getMutexAccess().getMutexKeyword_0());
		}
		otherlv_1=':'
		{
			newLeafNode(otherlv_1, grammarAccess.getMutexAccess().getColonKeyword_1());
		}
		(
			(
				lv_name_2_0=RULE_ID
				{
					newLeafNode(lv_name_2_0, grammarAccess.getMutexAccess().getNameIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getMutexRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_2_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_3='{'
		{
			newLeafNode(otherlv_3, grammarAccess.getMutexAccess().getLeftCurlyBracketKeyword_3());
		}
		otherlv_4='boxes'
		{
			newLeafNode(otherlv_4, grammarAccess.getMutexAccess().getBoxesKeyword_4());
		}
		otherlv_5='('
		{
			newLeafNode(otherlv_5, grammarAccess.getMutexAccess().getLeftParenthesisKeyword_5());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getMutexRule());
					}
				}
				otherlv_6=RULE_ID
				{
					newLeafNode(otherlv_6, grammarAccess.getMutexAccess().getBoxBoxCrossReference_6_0());
				}
			)
		)
		(
			otherlv_7=','
			{
				newLeafNode(otherlv_7, grammarAccess.getMutexAccess().getCommaKeyword_7_0());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getMutexRule());
						}
					}
					otherlv_8=RULE_ID
					{
						newLeafNode(otherlv_8, grammarAccess.getMutexAccess().getBoxBoxCrossReference_7_1_0());
					}
				)
			)
		)+
		otherlv_9=')'
		{
			newLeafNode(otherlv_9, grammarAccess.getMutexAccess().getRightParenthesisKeyword_8());
		}
		otherlv_10='}'
		{
			newLeafNode(otherlv_10, grammarAccess.getMutexAccess().getRightCurlyBracketKeyword_9());
		}
	)
;

// Entry rule entryRuleBox
entryRuleBox returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getBoxRule()); }
	iv_ruleBox=ruleBox
	{ $current=$iv_ruleBox.current; }
	EOF;

// Rule Box
ruleBox returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getBoxAccess().getBoxAction_0(),
					$current);
			}
		)
		otherlv_1='Box'
		{
			newLeafNode(otherlv_1, grammarAccess.getBoxAccess().getBoxKeyword_1());
		}
		otherlv_2=':'
		{
			newLeafNode(otherlv_2, grammarAccess.getBoxAccess().getColonKeyword_2());
		}
		(
			(
				lv_name_3_0=RULE_ID
				{
					newLeafNode(lv_name_3_0, grammarAccess.getBoxAccess().getNameIDTerminalRuleCall_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getBoxRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_3_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_4='{'
		{
			newLeafNode(otherlv_4, grammarAccess.getBoxAccess().getLeftCurlyBracketKeyword_4());
		}
		(
			(
				lv_Root_5_0='Root'
				{
					newLeafNode(lv_Root_5_0, grammarAccess.getBoxAccess().getRootRootKeyword_5_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getBoxRule());
					}
					setWithLastConsumed($current, "Root", true, "Root");
				}
			)
		)?
		(
			otherlv_6='superBox'
			{
				newLeafNode(otherlv_6, grammarAccess.getBoxAccess().getSuperBoxKeyword_6_0());
			}
			otherlv_7='('
			{
				newLeafNode(otherlv_7, grammarAccess.getBoxAccess().getLeftParenthesisKeyword_6_1());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getBoxRule());
						}
					}
					otherlv_8=RULE_ID
					{
						newLeafNode(otherlv_8, grammarAccess.getBoxAccess().getSuperBoxBoxCrossReference_6_2_0());
					}
				)
			)
			(
				otherlv_9=','
				{
					newLeafNode(otherlv_9, grammarAccess.getBoxAccess().getCommaKeyword_6_3_0());
				}
				(
					(
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getBoxRule());
							}
						}
						otherlv_10=RULE_ID
						{
							newLeafNode(otherlv_10, grammarAccess.getBoxAccess().getSuperBoxBoxCrossReference_6_3_1_0());
						}
					)
				)
			)*
			otherlv_11=')'
			{
				newLeafNode(otherlv_11, grammarAccess.getBoxAccess().getRightParenthesisKeyword_6_4());
			}
		)?
		(
			otherlv_12='groupbox'
			{
				newLeafNode(otherlv_12, grammarAccess.getBoxAccess().getGroupboxKeyword_7_0());
			}
			otherlv_13='('
			{
				newLeafNode(otherlv_13, grammarAccess.getBoxAccess().getLeftParenthesisKeyword_7_1());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getBoxRule());
						}
					}
					otherlv_14=RULE_ID
					{
						newLeafNode(otherlv_14, grammarAccess.getBoxAccess().getGroupboxGroupBoxCrossReference_7_2_0());
					}
				)
			)
			(
				otherlv_15=','
				{
					newLeafNode(otherlv_15, grammarAccess.getBoxAccess().getCommaKeyword_7_3_0());
				}
				(
					(
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getBoxRule());
							}
						}
						otherlv_16=RULE_ID
						{
							newLeafNode(otherlv_16, grammarAccess.getBoxAccess().getGroupboxGroupBoxCrossReference_7_3_1_0());
						}
					)
				)
			)*
			otherlv_17=')'
			{
				newLeafNode(otherlv_17, grammarAccess.getBoxAccess().getRightParenthesisKeyword_7_4());
			}
		)?
		(
			otherlv_18='motherOf'
			{
				newLeafNode(otherlv_18, grammarAccess.getBoxAccess().getMotherOfKeyword_8_0());
			}
			otherlv_19='('
			{
				newLeafNode(otherlv_19, grammarAccess.getBoxAccess().getLeftParenthesisKeyword_8_1());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getBoxRule());
						}
					}
					otherlv_20=RULE_ID
					{
						newLeafNode(otherlv_20, grammarAccess.getBoxAccess().getChildBoxBoxCrossReference_8_2_0());
					}
				)
			)
			(
				otherlv_21=','
				{
					newLeafNode(otherlv_21, grammarAccess.getBoxAccess().getCommaKeyword_8_3_0());
				}
				(
					(
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getBoxRule());
							}
						}
						otherlv_22=RULE_ID
						{
							newLeafNode(otherlv_22, grammarAccess.getBoxAccess().getChildBoxBoxCrossReference_8_3_1_0());
						}
					)
				)
			)*
			otherlv_23=')'
			{
				newLeafNode(otherlv_23, grammarAccess.getBoxAccess().getRightParenthesisKeyword_8_4());
			}
		)?
		(
			otherlv_24='motherOfGroup'
			{
				newLeafNode(otherlv_24, grammarAccess.getBoxAccess().getMotherOfGroupKeyword_9_0());
			}
			otherlv_25='('
			{
				newLeafNode(otherlv_25, grammarAccess.getBoxAccess().getLeftParenthesisKeyword_9_1());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getBoxRule());
						}
					}
					otherlv_26=RULE_ID
					{
						newLeafNode(otherlv_26, grammarAccess.getBoxAccess().getChildGroupGroupBoxCrossReference_9_2_0());
					}
				)
			)
			(
				otherlv_27=','
				{
					newLeafNode(otherlv_27, grammarAccess.getBoxAccess().getCommaKeyword_9_3_0());
				}
				(
					(
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getBoxRule());
							}
						}
						otherlv_28=RULE_ID
						{
							newLeafNode(otherlv_28, grammarAccess.getBoxAccess().getChildGroupGroupBoxCrossReference_9_3_1_0());
						}
					)
				)
			)*
			otherlv_29=')'
			{
				newLeafNode(otherlv_29, grammarAccess.getBoxAccess().getRightParenthesisKeyword_9_4());
			}
		)?
		(
			otherlv_30='mutex'
			{
				newLeafNode(otherlv_30, grammarAccess.getBoxAccess().getMutexKeyword_10_0());
			}
			otherlv_31='('
			{
				newLeafNode(otherlv_31, grammarAccess.getBoxAccess().getLeftParenthesisKeyword_10_1());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getBoxRule());
						}
					}
					otherlv_32=RULE_ID
					{
						newLeafNode(otherlv_32, grammarAccess.getBoxAccess().getMutexMutexCrossReference_10_2_0());
					}
				)
			)
			(
				otherlv_33=','
				{
					newLeafNode(otherlv_33, grammarAccess.getBoxAccess().getCommaKeyword_10_3_0());
				}
				(
					(
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getBoxRule());
							}
						}
						otherlv_34=RULE_ID
						{
							newLeafNode(otherlv_34, grammarAccess.getBoxAccess().getMutexMutexCrossReference_10_3_1_0());
						}
					)
				)
			)*
			otherlv_35=')'
			{
				newLeafNode(otherlv_35, grammarAccess.getBoxAccess().getRightParenthesisKeyword_10_4());
			}
		)?
		(
			otherlv_36='features'
			{
				newLeafNode(otherlv_36, grammarAccess.getBoxAccess().getFeaturesKeyword_11_0());
			}
			otherlv_37='('
			{
				newLeafNode(otherlv_37, grammarAccess.getBoxAccess().getLeftParenthesisKeyword_11_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getBoxAccess().getFeatureFeatureParserRuleCall_11_2_0());
					}
					lv_feature_38_0=ruleFeature
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getBoxRule());
						}
						add(
							$current,
							"feature",
							lv_feature_38_0,
							"org.xtext.ter_metamodel.ecfdl.ECFDL.Feature");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_39=','
				{
					newLeafNode(otherlv_39, grammarAccess.getBoxAccess().getCommaKeyword_11_3_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getBoxAccess().getFeatureFeatureParserRuleCall_11_3_1_0());
						}
						lv_feature_40_0=ruleFeature
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getBoxRule());
							}
							add(
								$current,
								"feature",
								lv_feature_40_0,
								"org.xtext.ter_metamodel.ecfdl.ECFDL.Feature");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_41=')'
			{
				newLeafNode(otherlv_41, grammarAccess.getBoxAccess().getRightParenthesisKeyword_11_4());
			}
		)?
		otherlv_42='}'
		{
			newLeafNode(otherlv_42, grammarAccess.getBoxAccess().getRightCurlyBracketKeyword_12());
		}
	)
;

// Entry rule entryRuleGroupBox
entryRuleGroupBox returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGroupBoxRule()); }
	iv_ruleGroupBox=ruleGroupBox
	{ $current=$iv_ruleGroupBox.current; }
	EOF;

// Rule GroupBox
ruleGroupBox returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GroupBox'
		{
			newLeafNode(otherlv_0, grammarAccess.getGroupBoxAccess().getGroupBoxKeyword_0());
		}
		otherlv_1=':'
		{
			newLeafNode(otherlv_1, grammarAccess.getGroupBoxAccess().getColonKeyword_1());
		}
		(
			(
				lv_name_2_0=RULE_ID
				{
					newLeafNode(lv_name_2_0, grammarAccess.getGroupBoxAccess().getNameIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGroupBoxRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_2_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_3='{'
		{
			newLeafNode(otherlv_3, grammarAccess.getGroupBoxAccess().getLeftCurlyBracketKeyword_3());
		}
		(
			(
				lv_Exclusif_4_0='Exclusif'
				{
					newLeafNode(lv_Exclusif_4_0, grammarAccess.getGroupBoxAccess().getExclusifExclusifKeyword_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGroupBoxRule());
					}
					setWithLastConsumed($current, "Exclusif", true, "Exclusif");
				}
			)
		)?
		otherlv_5='superBox'
		{
			newLeafNode(otherlv_5, grammarAccess.getGroupBoxAccess().getSuperBoxKeyword_5());
		}
		otherlv_6='('
		{
			newLeafNode(otherlv_6, grammarAccess.getGroupBoxAccess().getLeftParenthesisKeyword_6());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGroupBoxRule());
					}
				}
				otherlv_7=RULE_ID
				{
					newLeafNode(otherlv_7, grammarAccess.getGroupBoxAccess().getSuperBoxBoxCrossReference_7_0());
				}
			)
		)
		otherlv_8=')'
		{
			newLeafNode(otherlv_8, grammarAccess.getGroupBoxAccess().getRightParenthesisKeyword_8());
		}
		otherlv_9='boxes'
		{
			newLeafNode(otherlv_9, grammarAccess.getGroupBoxAccess().getBoxesKeyword_9());
		}
		otherlv_10='('
		{
			newLeafNode(otherlv_10, grammarAccess.getGroupBoxAccess().getLeftParenthesisKeyword_10());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGroupBoxRule());
					}
				}
				otherlv_11=RULE_ID
				{
					newLeafNode(otherlv_11, grammarAccess.getGroupBoxAccess().getBoxBoxCrossReference_11_0());
				}
			)
		)
		(
			otherlv_12=','
			{
				newLeafNode(otherlv_12, grammarAccess.getGroupBoxAccess().getCommaKeyword_12_0());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getGroupBoxRule());
						}
					}
					otherlv_13=RULE_ID
					{
						newLeafNode(otherlv_13, grammarAccess.getGroupBoxAccess().getBoxBoxCrossReference_12_1_0());
					}
				)
			)
		)+
		otherlv_14=')'
		{
			newLeafNode(otherlv_14, grammarAccess.getGroupBoxAccess().getRightParenthesisKeyword_13());
		}
		otherlv_15='}'
		{
			newLeafNode(otherlv_15, grammarAccess.getGroupBoxAccess().getRightCurlyBracketKeyword_14());
		}
	)
;

// Entry rule entryRuleFeature
entryRuleFeature returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFeatureRule()); }
	iv_ruleFeature=ruleFeature
	{ $current=$iv_ruleFeature.current; }
	EOF;

// Rule Feature
ruleFeature returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getFeatureAccess().getFeatureAction_0(),
					$current);
			}
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getFeatureAccess().getNameEStringParserRuleCall_1_0());
				}
				lv_name_1_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFeatureRule());
					}
					set(
						$current,
						"name",
						lv_name_1_0,
						"org.xtext.ter_metamodel.ecfdl.ECFDL.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)?
	)
;

// Entry rule entryRuleEString
entryRuleEString returns [String current=null]:
	{ newCompositeNode(grammarAccess.getEStringRule()); }
	iv_ruleEString=ruleEString
	{ $current=$iv_ruleEString.current.getText(); }
	EOF;

// Rule EString
ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_STRING_0=RULE_STRING
		{
			$current.merge(this_STRING_0);
		}
		{
			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
		}
		    |
		this_ID_1=RULE_ID
		{
			$current.merge(this_ID_1);
		}
		{
			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
		}
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
