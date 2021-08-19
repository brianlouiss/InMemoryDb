package commands.dataCommands;

import data.InMemoryDataStore;

import java.util.List;

public class Unset implements DataCommand {
    @Override
    public int execute(List<String> arguments) {
        InMemoryDataStore inMemoryDataStore = InMemoryDataStore.getInstance();
        inMemoryDataStore.remove(arguments.get(0));
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
