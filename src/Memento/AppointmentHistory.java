package Memento;

import java.util.Stack;

public class AppointmentHistory {

    private final Stack<AppointmentMemento> history = new Stack<>();

    public void push(AppointmentMemento memento) {
        history.push(memento);
        System.out.println("[Caretaker] Snapshot saved. History size: " + history.size());
    }

    public AppointmentMemento pop() {
        if (history.isEmpty()) {
            System.out.println("[Caretaker] No history to undo.");
            return null;
        }
        AppointmentMemento memento = history.pop();
        System.out.println("[Caretaker] Restoring snapshot from: " + memento.getSavedAt());
        return memento;
    }

    public boolean hasHistory() {
        return !history.isEmpty();
    }

    public int historySize() {
        return history.size();
    }
}
