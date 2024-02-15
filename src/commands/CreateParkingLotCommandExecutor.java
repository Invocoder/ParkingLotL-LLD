package commands;

import model.Command;
import model.ParkingLot;
import model.parking.strategy.NaturalOrderingParkingStrategy;
import service.OutputPrinter;
import service.ParkingLotService;
import validator.IntegerValidator;

import java.util.List;

public class CreateParkingLotCommandExecutor extends CommandExecutor{
    public static String COMMAND_NAME = "create_parking_lot";

    public CreateParkingLotCommandExecutor(
            final ParkingLotService parkingLotService,
            final OutputPrinter outputPrinter) {
        super(parkingLotService, outputPrinter);
    }

    protected String getName(){
        return COMMAND_NAME;
    }
    @Override
    public boolean validate(final Command command) {
        if (!command.getCommandName().equals(COMMAND_NAME)){
            return false;
        }
       final List<String> params = command.getParams();
       if (params.size() != 1){
           return false;
       }
       return IntegerValidator.isInteger(params.get(0));
    }

    @Override
    public void execute(Command command) {
        final int parkingLotCapacity = Integer.parseInt(command.getParams().get(0));
        final ParkingLot parkingLot = new ParkingLot(parkingLotCapacity);
        parkingLotService.createParkingLot(parkingLot, new NaturalOrderingParkingStrategy());
        outputPrinter.printWithNewLine(
                "Created a parking loy with" + parkingLot.getCapacity() + "slots");
    }
}
