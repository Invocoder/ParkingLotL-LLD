package modes;

import commands.CommandExecutor;
import commands.CommandExecutorFactory;
import exception.InvalidCommandException;
import model.Command;
import service.OutputPrinter;

import java.io.IOException;

public abstract class Mode {
    private CommandExecutorFactory commandExecutorFactory;
    protected OutputPrinter outputPrinter;

    public Mode(final CommandExecutorFactory commandExecutorFactory, final OutputPrinter outputPrinter)
    {
        this.commandExecutorFactory = commandExecutorFactory;
        this.outputPrinter = outputPrinter;
    }

    protected void processCommand(final Command command)
    {
        final CommandExecutor commandExecutor = commandExecutorFactory.getCommandExecutor(command);
        if (commandExecutor.validate(command))
        {
            commandExecutor.execute(command);
        }
        else {
            throw new InvalidCommandException();
        }
    }

    public abstract void process() throws IOException;
}
