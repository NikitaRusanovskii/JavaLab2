package com.nikita.app.commands;

import com.nikita.app.Processor;

public class CommandStore implements ICommand{
    private String reg1;
    private int addr;
    
    public CommandStore(int address, String r1) {
        addr = address;
        reg1 = r1;
    }

    public void execute(Processor processor) {
        processor.getMemory()[addr] = processor.getRegisters().get(reg1);
    }
}