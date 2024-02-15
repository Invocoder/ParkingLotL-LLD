package service;
public class OutputPrinter {
    public void welcome(){
        printWithNewLine("Welcome to parking lot");
    }
    public void end(){
        printWithNewLine("Thank you for using parking lot service");
    }
    public void notFound(){
        printWithNewLine("Not found");
    }
    public void statusHeader(){
        printWithNewLine("Slot no.   Registration no.     Colour");
    }
    public void parkingLotFull(){
        printWithNewLine("Sorry, parking lot is full at the moment");
    }
    public void parkingLotEmpty(){
        printWithNewLine("Parking lot is currently empty");
    }
    public void invalidFile(){
        printWithNewLine("Invalid file given");
    }
    public void printWithNewLine(final String msg){
        System.out.println(msg);
    }
}
