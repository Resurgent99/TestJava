package june19;

public class LightOffCommand implements CommandInt{
    private Command command;

    public LightOffCommand(Command command){
        this.command = command;
    }
    @Override
    public void execute() {
        command.turnOff();
    }
}
