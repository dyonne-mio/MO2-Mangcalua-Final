package model.commands;

public interface ConditionalCommand extends Command {
    public abstract void addIfCommand(Command c);
    public abstract void addElseCommand(Command c);
}