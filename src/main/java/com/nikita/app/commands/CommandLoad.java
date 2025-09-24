package com.nikita.app.commands;

import com.nikita.app.Processor;

public class CommandLoad implements ICommand{
    private String reg1;
    private int addr;
    
    public CommandLoad(int address, String r1) {
        addr = address;
        reg1 = r1;
    }

    public void execute(Processor processor) {
        processor.getRegisters().put(reg1, processor.getMemory()[addr]);
    }
}
