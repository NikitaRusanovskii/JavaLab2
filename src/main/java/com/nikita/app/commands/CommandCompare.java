package com.nikita.app.commands;

import com.nikita.app.Processor;

public class CommandCompare implements ICommand{
    private String reg1, reg2;
    public CommandCompare(String r1, String r2) {
        reg1 = r1;
        reg2 = r2;
    }

    public void execute(Processor processor) {
        if (processor.getRegisters().get(reg1) == processor.getRegisters().get(reg2)) processor.setCompareFlag(0);
        if (processor.getRegisters().get(reg1) < processor.getRegisters().get(reg2)) processor.setCompareFlag(-1);
        if (processor.getRegisters().get(reg1) > processor.getRegisters().get(reg2)) processor.setCompareFlag(1);
        if (processor.getRegisters().get(reg1) <= processor.getRegisters().get(reg2)) processor.setCompareFlag(-2);
        if (processor.getRegisters().get(reg1) >= processor.getRegisters().get(reg2)) processor.setCompareFlag(2);
    }
}
