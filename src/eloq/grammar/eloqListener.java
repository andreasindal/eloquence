// Generated from /Users/andreas/code/sys/eloquence/src/eloq/grammar/eloq.g4 by ANTLR 4.5.1
package eloq.grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link eloqParser}.
 */
public interface eloqListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link eloqParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(eloqParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link eloqParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(eloqParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link eloqParser#code}.
	 * @param ctx the parse tree
	 */
	void enterCode(eloqParser.CodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link eloqParser#code}.
	 * @param ctx the parse tree
	 */
	void exitCode(eloqParser.CodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link eloqParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(eloqParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link eloqParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(eloqParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link eloqParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(eloqParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link eloqParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(eloqParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link eloqParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(eloqParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link eloqParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(eloqParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link eloqParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(eloqParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link eloqParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(eloqParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link eloqParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(eloqParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link eloqParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(eloqParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link eloqParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(eloqParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link eloqParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(eloqParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link eloqParser#addExpr}.
	 * @param ctx the parse tree
	 */
	void enterAddExpr(eloqParser.AddExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link eloqParser#addExpr}.
	 * @param ctx the parse tree
	 */
	void exitAddExpr(eloqParser.AddExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link eloqParser#mulExpr}.
	 * @param ctx the parse tree
	 */
	void enterMulExpr(eloqParser.MulExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link eloqParser#mulExpr}.
	 * @param ctx the parse tree
	 */
	void exitMulExpr(eloqParser.MulExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link eloqParser#intervalLoop}.
	 * @param ctx the parse tree
	 */
	void enterIntervalLoop(eloqParser.IntervalLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link eloqParser#intervalLoop}.
	 * @param ctx the parse tree
	 */
	void exitIntervalLoop(eloqParser.IntervalLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link eloqParser#atomExpr}.
	 * @param ctx the parse tree
	 */
	void enterAtomExpr(eloqParser.AtomExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link eloqParser#atomExpr}.
	 * @param ctx the parse tree
	 */
	void exitAtomExpr(eloqParser.AtomExprContext ctx);
}