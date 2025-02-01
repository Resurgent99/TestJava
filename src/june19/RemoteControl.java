package june19;

public class RemoteControl{
    private CommandInt command;

    public void setCommand(CommandInt command){
        this.command = command;
    }

    public void pressButton(){
       command.execute();
   }

}
