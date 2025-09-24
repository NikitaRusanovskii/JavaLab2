package com.nikita.app.commands;

import com.nikita.app.Processor;

public class CommandInit implements ICommand {
    private int val, addr;

    public CommandInit(int address, int value) {
        val = value;
        addr = address;
    }

    public void execute(Processor processor) {
        processor.getMemory()[addr] = val;
    }
}
