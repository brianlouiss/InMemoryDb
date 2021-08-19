package commands;

import commands.dataCommands.*;

public class CommandFactory {

    private CommandFactory() {}

    public static CommandFactory getInstance() {
        return new CommandFactory();
    }

    public Command getCommand(String command) {
        command = standardizeData(command);

        Command currentCommand = null;
        switch (command) {
            case CommandConstants.END:
                currentCommand = new End();
                break;
            case CommandConstants.GET:
                currentCommand = new Get();
                break;
            case CommandConstants.NUM_EQUAL_TO:
                currentCommand = new NumEqualTo();
                break;
            case CommandConstants.SET:
                currentCommand = new Set();
                break;
            case CommandConstants.UNSET:
                currentCommand = new Unset();
                break;
            default:
                currentCommand = new DefaultCommand();
                break;
        }

        return currentCommand;
    }

    private String standardizeData(String inputCommand) {
        return inputCommand.toLowerCase();
    }
}
