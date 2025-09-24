package com.nikita.app;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
import com.nikita.app.commands.*;

public class Interpretator {

    private ArrayList<String> commands = new ArrayList<>();
    private Processor proc;

    public Interpretator(Processor processor) {
        proc = processor;
    }

    private void readCommands() {
        Scanner in = new Scanner(System.in);
        while (true) {
            if (!in.hasNextLine()) {
                System.out.print("Input closed");
                break;
            }
            String some_command = in.nextLine();
            if (some_command == "") break;
            System.out.println(some_command);
            commands.add(some_command);
        }
        in.close();
    }

    private void executeCommands() {
        while (proc.getCommandPointer() < commands.size()) {
            String command = commands.get(proc.getCommandPointer());
            String[] kwords = command.split(" ");
            ICommand cmd = CommandFabric.getCommand(kwords[0], Arrays.copyOfRange(kwords, 1, kwords.length));
            cmd.execute(proc);
        }
    }

    public void run() {
        readCommands();
        executeCommands();
    }
    
}
