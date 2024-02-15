package modes;

import commands.CommandExecutorFactory;
import commands.ExitCommandExecutor;
import model.Command;
import service.OutputPrinter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InteractiveMode extends Mode{
    public InteractiveMode(final CommandExecutorFactory commandExecutorFactory, final OutputPrinter outputPrinter)
    {
        super(commandExecutorFactory, outputPrinter);
    }

    public void process() throws IOException{
        final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            final String input = reader.readLine();;
            final Command command = new Command(input);
            processCommand(command);
            if (command.getCommandName().equals(ExitCommandExecutor.COMMAND_NAME)){
                break;
            }
        }
    }
}
