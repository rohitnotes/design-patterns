public class ConcreteHandler3 extends Handler {

    @Override
    protected void action(Request request) {
        //do specific action for ConcreteHandler3
    }

    @Override
    protected boolean canExecute(Request request) {
        if(request.getType() == Type.TYPE3)
            return true;
        else
            return false;
    }
}