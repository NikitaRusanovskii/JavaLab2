package com.nikita.app;

import com.nikita.app.commands.*;

public class CommandFabric {
    public static ICommand getCommand(String name, String[] args) {
        switch (name) {
            case "add":
                return new CommandAdd(args[0], args[1], args[2]);       
            case "mul":
                return new CommandMul(args[0], args[1], args[2]);
            case "sub":
                return new CommandSub(args[0], args[1], args[2]);
            case "div":
                return new CommandDiv(args[0], args[1], args[2]);
            case "ld":
                return new CommandLoad(Integer.parseInt(args[0]), args[1]);
            case "st":
                return new CommandStore(Integer.parseInt(args[0]), args[1]);
            case "init":
                return new CommandInit(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
            case "print":
                return new CommandPrint(args[0]);
            case "jmp":
                return new CommandJump(Integer.parseInt(args[0]));
            case "je":
                return new CommandJE(Integer.parseInt(args[0]));
            case "jle":
                return new CommandJLE(Integer.parseInt(args[0]));
            case "jge":
                return new CommandJGE(Integer.parseInt(args[0]));
            case "jg":
                return new CommandJG(Integer.parseInt(args[0]));
            case "jne":
                return new CommandJNE(Integer.parseInt(args[0]));
            case "cmp":
                return new CommandCompare(args[0], args[1]);
        }
        return null;
    }
}
