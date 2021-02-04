package model.commands;

import model.symboltable.LocalScope;
import model.symboltable.SymbolTableManager;
import org.antlr.v4.runtime.tree.TerminalNode;
import parser.MangcaluaParser.MutableContext;
import model.representations.*;

public class InitializeArrayCommand implements Command {
    private LocalScope localScope;
    private TerminalNode id;
    private MutableContext mutableCtx;

    public InitializeArrayCommand(TerminalNode id, MutableContext mutableCtx) {
        this.mutableCtx = mutableCtx;
        this.id = id;
        this.localScope = SymbolTableManager.getInstance().getCurScope();
    }

    @Override
    public void execute() {
        MangcaluaValue rhsValue = localScope.getVariableAllScope(mutableCtx.Identifier().getText());
		MangcaluaValue mangcaluaValue = localScope.getVariableAllScope(id.getText());
		mangcaluaValue.setValue(rhsValue.getValue());
    }

}