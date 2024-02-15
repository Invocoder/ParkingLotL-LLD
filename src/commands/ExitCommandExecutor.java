package commands;

import model.Command;
import service.OutputPrinter;
import service.ParkingLotService;

public class ExitCommandExecutor extends CommandExecutor{
    public static String COMMAND_NAME = "exit";
    public ExitCommandExecutor(
            final ParkingLotService parkingLotService,
            final OutputPrinter outputPrinter) {
        super(parkingLotService, outputPrinter);
    }

    @Override
    public boolean validate(Command command) {
        return command.getParams().isEmpty();
    }

    @Override
    public void execute(Command command) {
        outputPrinter.end();
    }
}
