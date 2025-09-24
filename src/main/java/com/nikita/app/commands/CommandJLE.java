package com.nikita.app.commands;

import com.nikita.app.Processor;

public class CommandJLE implements ICommand {
    int addr;
    public CommandJLE(int address) {
        addr = address;
    }

    public void execute(Processor processor) {
        if (processor.getCompareFlag() <= -1) processor.setCommandPointer(addr);
    }
}
