package commands.transactionCommands;

import commands.Command;

import java.util.List;

public class Begin implements Command {
    @Override
    public int execute(List<String> arguments) {
        return 0;
    }

    @Override
    public boolean isEnd() {
        return false;
    }

    @Override
    public int commandData() {
        return 0;
    }

    @Override
    public boolean containsData() {
        return false;
    }
}
