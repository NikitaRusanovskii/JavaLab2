package com.nikita.app.commands;

import com.nikita.app.Processor;

public interface ICommand {
    public void execute(Processor processor);
}
