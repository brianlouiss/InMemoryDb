package commands.dataCommands;

import java.util.List;

public class End implements DataCommand {
    @Override
    public int execute(List<String> arguments) {
        return 0;
    }

    @Override
    public boolean isEnd() {
        return true;
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
