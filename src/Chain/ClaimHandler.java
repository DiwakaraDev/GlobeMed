package Chain;

public abstract class ClaimHandler {

    protected ClaimHandler nextHandler;

    public void setNextHandler(ClaimHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void processRequest(ClaimRequest request);
}
