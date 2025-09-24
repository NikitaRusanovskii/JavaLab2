package com.nikita.app.commands;

import com.nikita.app.Processor;

public class CommandJGE implements ICommand {
    int addr;
    public CommandJGE(int address) {
        addr = address;
    }

    public void execute(Processor processor) {
        if (processor.getCompareFlag() >= 1) processor.setCommandPointer(addr);
    }
}
