public class Command2 implements Command {

    private Receiver receiver;

    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }
    
    @Override
    public void execute() {
        //run specific action by itself or using receiver
        receiver.action2();
    }
}