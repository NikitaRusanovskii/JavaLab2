package com.nikita.app.commands;

import com.nikita.app.Processor;

public class CommandJump implements ICommand {
    int addr;
    public CommandJump(int address) {
        addr = address;
    }

    public void execute(Processor processor) {
        processor.setCommandPointer(addr);
    }
}
