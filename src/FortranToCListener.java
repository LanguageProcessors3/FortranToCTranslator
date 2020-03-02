// Generated from FortranToC.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FortranToCParser}.
 */
public interface FortranToCListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link FortranToCParser#prg}.
	 * @param ctx the parse tree
	 */
	void enterPrg(FortranToCParser.PrgContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortranToCParser#prg}.
	 * @param ctx the parse tree
	 */
	void exitPrg(FortranToCParser.PrgContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortranToCParser#dcllist}.
	 * @param ctx the parse tree
	 */
	void enterDcllist(FortranToCParser.DcllistContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortranToCParser#dcllist}.
	 * @param ctx the parse tree
	 */
	void exitDcllist(FortranToCParser.DcllistContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortranToCParser#cabecera}.
	 * @param ctx the parse tree
	 */
	void enterCabecera(FortranToCParser.CabeceraContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortranToCParser#cabecera}.
	 * @param ctx the parse tree
	 */
	void exitCabecera(FortranToCParser.CabeceraContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortranToCParser#cablist}.
	 * @param ctx the parse tree
	 */
	void enterCablist(FortranToCParser.CablistContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortranToCParser#cablist}.
	 * @param ctx the parse tree
	 */
	void exitCablist(FortranToCParser.CablistContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortranToCParser#decsubprog}.
	 * @param ctx the parse tree
	 */
	void enterDecsubprog(FortranToCParser.DecsubprogContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortranToCParser#decsubprog}.
	 * @param ctx the parse tree
	 */
	void exitDecsubprog(FortranToCParser.DecsubprogContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortranToCParser#sentlist}.
	 * @param ctx the parse tree
	 */
	void enterSentlist(FortranToCParser.SentlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortranToCParser#sentlist}.
	 * @param ctx the parse tree
	 */
	void exitSentlist(FortranToCParser.SentlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortranToCParser#dcl}.
	 * @param ctx the parse tree
	 */
	void enterDcl(FortranToCParser.DclContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortranToCParser#dcl}.
	 * @param ctx the parse tree
	 */
	void exitDcl(FortranToCParser.DclContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortranToCParser#defcte}.
	 * @param ctx the parse tree
	 */
	void enterDefcte(FortranToCParser.DefcteContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortranToCParser#defcte}.
	 * @param ctx the parse tree
	 */
	void exitDefcte(FortranToCParser.DefcteContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortranToCParser#ctelist}.
	 * @param ctx the parse tree
	 */
	void enterCtelist(FortranToCParser.CtelistContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortranToCParser#ctelist}.
	 * @param ctx the parse tree
	 */
	void exitCtelist(FortranToCParser.CtelistContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortranToCParser#simpvalue}.
	 * @param ctx the parse tree
	 */
	void enterSimpvalue(FortranToCParser.SimpvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortranToCParser#simpvalue}.
	 * @param ctx the parse tree
	 */
	void exitSimpvalue(FortranToCParser.SimpvalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortranToCParser#defvar}.
	 * @param ctx the parse tree
	 */
	void enterDefvar(FortranToCParser.DefvarContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortranToCParser#defvar}.
	 * @param ctx the parse tree
	 */
	void exitDefvar(FortranToCParser.DefvarContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortranToCParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(FortranToCParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortranToCParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(FortranToCParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortranToCParser#charlength}.
	 * @param ctx the parse tree
	 */
	void enterCharlength(FortranToCParser.CharlengthContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortranToCParser#charlength}.
	 * @param ctx the parse tree
	 */
	void exitCharlength(FortranToCParser.CharlengthContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortranToCParser#varlist}.
	 * @param ctx the parse tree
	 */
	void enterVarlist(FortranToCParser.VarlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortranToCParser#varlist}.
	 * @param ctx the parse tree
	 */
	void exitVarlist(FortranToCParser.VarlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortranToCParser#init}.
	 * @param ctx the parse tree
	 */
	void enterInit(FortranToCParser.InitContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortranToCParser#init}.
	 * @param ctx the parse tree
	 */
	void exitInit(FortranToCParser.InitContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortranToCParser#decproc}.
	 * @param ctx the parse tree
	 */
	void enterDecproc(FortranToCParser.DecprocContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortranToCParser#decproc}.
	 * @param ctx the parse tree
	 */
	void exitDecproc(FortranToCParser.DecprocContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortranToCParser#formal_paramlist}.
	 * @param ctx the parse tree
	 */
	void enterFormal_paramlist(FortranToCParser.Formal_paramlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortranToCParser#formal_paramlist}.
	 * @param ctx the parse tree
	 */
	void exitFormal_paramlist(FortranToCParser.Formal_paramlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortranToCParser#nomparamlist}.
	 * @param ctx the parse tree
	 */
	void enterNomparamlist(FortranToCParser.NomparamlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortranToCParser#nomparamlist}.
	 * @param ctx the parse tree
	 */
	void exitNomparamlist(FortranToCParser.NomparamlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortranToCParser#dec_s_paramlist}.
	 * @param ctx the parse tree
	 */
	void enterDec_s_paramlist(FortranToCParser.Dec_s_paramlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortranToCParser#dec_s_paramlist}.
	 * @param ctx the parse tree
	 */
	void exitDec_s_paramlist(FortranToCParser.Dec_s_paramlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortranToCParser#tipoparam}.
	 * @param ctx the parse tree
	 */
	void enterTipoparam(FortranToCParser.TipoparamContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortranToCParser#tipoparam}.
	 * @param ctx the parse tree
	 */
	void exitTipoparam(FortranToCParser.TipoparamContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortranToCParser#decfun}.
	 * @param ctx the parse tree
	 */
	void enterDecfun(FortranToCParser.DecfunContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortranToCParser#decfun}.
	 * @param ctx the parse tree
	 */
	void exitDecfun(FortranToCParser.DecfunContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortranToCParser#dec_f_paramlist}.
	 * @param ctx the parse tree
	 */
	void enterDec_f_paramlist(FortranToCParser.Dec_f_paramlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortranToCParser#dec_f_paramlist}.
	 * @param ctx the parse tree
	 */
	void exitDec_f_paramlist(FortranToCParser.Dec_f_paramlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortranToCParser#sent}.
	 * @param ctx the parse tree
	 */
	void enterSent(FortranToCParser.SentContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortranToCParser#sent}.
	 * @param ctx the parse tree
	 */
	void exitSent(FortranToCParser.SentContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortranToCParser#doval}.
	 * @param ctx the parse tree
	 */
	void enterDoval(FortranToCParser.DovalContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortranToCParser#doval}.
	 * @param ctx the parse tree
	 */
	void exitDoval(FortranToCParser.DovalContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortranToCParser#casos}.
	 * @param ctx the parse tree
	 */
	void enterCasos(FortranToCParser.CasosContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortranToCParser#casos}.
	 * @param ctx the parse tree
	 */
	void exitCasos(FortranToCParser.CasosContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortranToCParser#etiquetas}.
	 * @param ctx the parse tree
	 */
	void enterEtiquetas(FortranToCParser.EtiquetasContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortranToCParser#etiquetas}.
	 * @param ctx the parse tree
	 */
	void exitEtiquetas(FortranToCParser.EtiquetasContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortranToCParser#listaetiqetas}.
	 * @param ctx the parse tree
	 */
	void enterListaetiqetas(FortranToCParser.ListaetiqetasContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortranToCParser#listaetiqetas}.
	 * @param ctx the parse tree
	 */
	void exitListaetiqetas(FortranToCParser.ListaetiqetasContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortranToCParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(FortranToCParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortranToCParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(FortranToCParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortranToCParser#expAux}.
	 * @param ctx the parse tree
	 */
	void enterExpAux(FortranToCParser.ExpAuxContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortranToCParser#expAux}.
	 * @param ctx the parse tree
	 */
	void exitExpAux(FortranToCParser.ExpAuxContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortranToCParser#op}.
	 * @param ctx the parse tree
	 */
	void enterOp(FortranToCParser.OpContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortranToCParser#op}.
	 * @param ctx the parse tree
	 */
	void exitOp(FortranToCParser.OpContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortranToCParser#oparit}.
	 * @param ctx the parse tree
	 */
	void enterOparit(FortranToCParser.OparitContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortranToCParser#oparit}.
	 * @param ctx the parse tree
	 */
	void exitOparit(FortranToCParser.OparitContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortranToCParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(FortranToCParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortranToCParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(FortranToCParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortranToCParser#explist}.
	 * @param ctx the parse tree
	 */
	void enterExplist(FortranToCParser.ExplistContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortranToCParser#explist}.
	 * @param ctx the parse tree
	 */
	void exitExplist(FortranToCParser.ExplistContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortranToCParser#proc_call}.
	 * @param ctx the parse tree
	 */
	void enterProc_call(FortranToCParser.Proc_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortranToCParser#proc_call}.
	 * @param ctx the parse tree
	 */
	void exitProc_call(FortranToCParser.Proc_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortranToCParser#subpparamlist}.
	 * @param ctx the parse tree
	 */
	void enterSubpparamlist(FortranToCParser.SubpparamlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortranToCParser#subpparamlist}.
	 * @param ctx the parse tree
	 */
	void exitSubpparamlist(FortranToCParser.SubpparamlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortranToCParser#subproglist}.
	 * @param ctx the parse tree
	 */
	void enterSubproglist(FortranToCParser.SubproglistContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortranToCParser#subproglist}.
	 * @param ctx the parse tree
	 */
	void exitSubproglist(FortranToCParser.SubproglistContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortranToCParser#codproc}.
	 * @param ctx the parse tree
	 */
	void enterCodproc(FortranToCParser.CodprocContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortranToCParser#codproc}.
	 * @param ctx the parse tree
	 */
	void exitCodproc(FortranToCParser.CodprocContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortranToCParser#codfun}.
	 * @param ctx the parse tree
	 */
	void enterCodfun(FortranToCParser.CodfunContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortranToCParser#codfun}.
	 * @param ctx the parse tree
	 */
	void exitCodfun(FortranToCParser.CodfunContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortranToCParser#expcond}.
	 * @param ctx the parse tree
	 */
	void enterExpcond(FortranToCParser.ExpcondContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortranToCParser#expcond}.
	 * @param ctx the parse tree
	 */
	void exitExpcond(FortranToCParser.ExpcondContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortranToCParser#oplog}.
	 * @param ctx the parse tree
	 */
	void enterOplog(FortranToCParser.OplogContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortranToCParser#oplog}.
	 * @param ctx the parse tree
	 */
	void exitOplog(FortranToCParser.OplogContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortranToCParser#factorcond}.
	 * @param ctx the parse tree
	 */
	void enterFactorcond(FortranToCParser.FactorcondContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortranToCParser#factorcond}.
	 * @param ctx the parse tree
	 */
	void exitFactorcond(FortranToCParser.FactorcondContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortranToCParser#opcomp}.
	 * @param ctx the parse tree
	 */
	void enterOpcomp(FortranToCParser.OpcompContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortranToCParser#opcomp}.
	 * @param ctx the parse tree
	 */
	void exitOpcomp(FortranToCParser.OpcompContext ctx);
}