package adris.altoclef.commands;

import adris.altoclef.AltoClef;
import adris.altoclef.commandsystem.Arg;
import adris.altoclef.commandsystem.ArgParser;
import adris.altoclef.commandsystem.Command;
import adris.altoclef.commandsystem.CommandException;
import adris.altoclef.ui.MessagePriority;

public class SayCommand extends Command {
    public SayCommand() throws CommandException {
        //todo maybe use some kind of vararg to allow not escaping the message if it contains spaces
        super("say", "Writes to chat", new Arg(String.class, "message", null, 0));
    }

    @Override
    protected void call(AltoClef mod, ArgParser parser) throws CommandException {
        String message = parser.get(String.class);
        mod.getMessageSender().enqueueChat(message, MessagePriority.ASAP);
        finish();
    }
}