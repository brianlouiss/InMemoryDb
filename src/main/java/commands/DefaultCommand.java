package commands;

import java.util.List;

public class DefaultCommand implements Command{
    @Override
    public boolean isEnd() {
        return false;
    }

    @Override
    public int execute(List<String> arguments) {
        return 0;
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
