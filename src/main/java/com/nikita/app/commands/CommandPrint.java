package com.nikita.app.commands;

import com.nikita.app.Processor;

public class CommandPrint implements ICommand {
    private String reg1;
    
    public CommandPrint(String r1) {
        reg1 = r1;
    }

    public void execute(Processor processor) {
        System.out.println(processor.getRegisters().get(reg1));
    }
}
