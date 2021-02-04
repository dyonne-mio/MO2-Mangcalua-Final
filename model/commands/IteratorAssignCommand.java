package model.commands;

import model.symboltable.LocalScope;
import model.symboltable.SymbolTableManager;
import org.antlr.v4.runtime.tree.TerminalNode;

import parser.MangcaluaParser.SimpleExpressionContext;
import model.*;
import model.representations.*;
import model.semantics.*;

public class IteratorAssignCommand implements Command {
    private TerminalNode id;
    private SimpleExpressionContext expCtx;
    private EvaluateCommand evalCommand;
    private LocalScope localScope;

    public IteratorAssignCommand(TerminalNode id, SimpleExpressionContext expCtx) {
        this.expCtx = expCtx;
        this.id = id;
        this.localScope = SymbolTableManager.getInstance().getCurScope();
        UndeclaredChecker checker = new UndeclaredChecker(expCtx);
        checker.check();
        MangcaluaValue mangcaluaValue = localScope.getVariableAllScope(id.getText());

        if (mangcaluaValue != null) {
            if (mangcaluaValue.getPrimitiveType() != PrimitiveType.ARRAY) {
                ConstantChecker checker1 = new ConstantChecker(this.id);
                checker1.check();
            }

            TypeMismatchChecker checker2 = new TypeMismatchChecker(mangcaluaValue, this.expCtx);
            checker2.check();
        }

        evalCommand = new EvaluateCommand(expCtx);
    }

    @Override
    public void execute() {
        evalCommand.execute();
        MangcaluaValue mangcaluaValue = localScope.getVariableAllScope(id.getText());
        Util.assignValue(mangcaluaValue, evalCommand.getEvaluated());
    }
}
