package adris.altoclef.commands;

import adris.altoclef.AltoClef;
import adris.altoclef.commandsystem.ArgParser;
import adris.altoclef.commandsystem.Command;

public class DisconnectCommand extends Command {
    public DisconnectCommand() {
        super("disconnect", "Disconnects from the server");
    }

    @Override
    protected void call(AltoClef mod, ArgParser parser) {
        mod.log("Disconnecting from the server");
        mod.getWorld().disconnect();
        finish();
    }
}