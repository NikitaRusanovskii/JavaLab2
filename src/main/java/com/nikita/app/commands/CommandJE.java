package com.nikita.app.commands;

import com.nikita.app.Processor;

public class CommandJE implements ICommand {
    int addr;
    public CommandJE(int address) {
        addr = address;
    }

    public void execute(Processor processor) {
        if (processor.getCompareFlag() == 0) processor.setCommandPointer(addr);
    }
}
