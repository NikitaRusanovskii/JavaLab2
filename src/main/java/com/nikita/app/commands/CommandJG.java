package com.nikita.app.commands;

import com.nikita.app.Processor;

public class CommandJG implements ICommand {
    int addr;
    public CommandJG(int address) {
        addr = address;
    }

    public void execute(Processor processor) {
        if (processor.getCompareFlag() == 1) processor.setCommandPointer(addr);
    }
}
