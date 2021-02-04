package model.commands;

public interface ControlledCommand extends Command {
    public abstract void addCommand(Command c);
}