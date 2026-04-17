package Chain;

/**
 * CHAIN OF RESPONSIBILITY — Abstract Handler
 * Every handler in the chain extends this class.
 */
public abstract class ClaimHandler {

    protected ClaimHandler nextHandler;

    // Links this handler to the next one in the chain
    public void setNextHandler(ClaimHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    // Each concrete handler implements its own processing logic
    public abstract void processRequest(ClaimRequest request);
}