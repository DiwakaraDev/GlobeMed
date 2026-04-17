package Command;

/**
 * COMMAND PATTERN — Command Interface
 * Every action (Book, Cancel) implements this.
 */
public interface Command {
    void execute();
}