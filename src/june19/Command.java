package june19;

interface CommandInt{
    void execute();
}
public class Command {
    public void turnOn(){
        System.out.println("Свет включён");
    }
    public void turnOff(){
        System.out.println("Свет выключен");
    }

    public static void main(String[] args) {
        RemoteControl turnofff = new RemoteControl();


    }
}


