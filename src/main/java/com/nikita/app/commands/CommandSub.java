package com.nikita.app.commands;

import com.nikita.app.Processor;

public class CommandSub implements ICommand{
    String reg1, reg2, reg3;
    public CommandSub(String r1, String r2, String r3) {
        reg1 = r1;
        reg2 = r2;
        reg3 = r3;
    }

    public void execute(Processor processor) {
        processor.setRegister(reg3, processor.getRegisters().get(reg1) - processor.getRegisters().get(reg2));
    }
}
