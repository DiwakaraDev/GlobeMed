package Invoker;

import Command.Command;
import java.util.ArrayDeque;
import java.util.Deque;

public class AppointmentManager {

    private final Deque<Command> history = new ArrayDeque<>();

    public void executeCommand(Command command) {
        command.execute();
        history.push(command);
        System.out.println("AppointmentManager: command executed. Undo stack size: " + history.size());
    }

    public void undoLast() {
        if (history.isEmpty()) {
            System.out.println("AppointmentManager: nothing to undo.");
            return;
        }
        Command lastCommand = history.pop();
        lastCommand.undo();
        System.out.println("AppointmentManager: undo complete. Undo stack size: " + history.size());
    }

    public Deque<Command> getHistory() {
        return history;
    }
}
