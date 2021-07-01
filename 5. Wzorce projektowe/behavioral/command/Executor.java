package pl.sdacademy.behavioral.command;

import java.util.Stack;

public class Executor {
    private Stack<Command> commandStack = new Stack<>();

    public void execute(Command command) {
        System.out.println("Egzekutor wykonuje polecenie");
        command.execute();
        commandStack.push(command);
    }

    public void undoLast() {
        if (commandStack.isEmpty()) {
            return;
        }
        System.out.println("Egzekutor wycofuje polecenie");
        Command command = commandStack.pop();
        command.undo();
    }
}
