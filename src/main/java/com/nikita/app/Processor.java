package com.nikita.app;

import java.util.HashMap;

public class Processor {

    private int commandPointer = 0, compareFlag = 0;
    private int[] memory = new int[1024];
    private HashMap<String, Integer> registers = new HashMap<>() {{
        put("R1", 0);
        put("R2", 0);
        put("R3", 0);
        put("R4", 0);
    }};

    public Processor() {}

    public int[] getMemory() { return memory; }
    public HashMap<String, Integer> getRegisters() { return registers; }
    public int getCommandPointer() { return commandPointer; }
    public int getCompareFlag() { return compareFlag; }

    public void setRegister(String reg, Integer val) {
        registers.put(reg, val);
    }

    public void setCompareFlag(int compare_flag) {
        compareFlag = compare_flag;
    }

    public void setCommandPointer(int command_pointer) {
        if (command_pointer < 0) throw new RuntimeException("CommandPointer under zero");
        commandPointer = command_pointer;
    }
}
