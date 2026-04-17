package Invoker;

import Command.Command;
import java.util.ArrayList;
import java.util.List;

public class AppointmentManager {

    private List<Command> history = new ArrayList<>();

    public void executeCommand(Command command) {
        command.execute();
        history.add(command);
        System.out.println("AppointmentManager: command executed. Total commands: " + history.size());
    }

    public List<Command> getHistory() {
        return history;
    }
}
