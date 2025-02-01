package june19;

public class LightOnCommand implements CommandInt{
    private Command command;

    public LightOnCommand(Command command){
        this.command = command;
    }
    @Override
    public void execute() {
        command.turnOn();
    }
}
