package commands.dataCommands;

import data.InMemoryDataStore;

import java.util.List;

public class Set implements DataCommand {
    @Override
    public int execute(List<String> arguments) {
        System.out.println("In Set");
        InMemoryDataStore dataStore = InMemoryDataStore.getInstance();
        dataStore.set(arguments.get(0), Integer.parseInt(arguments.get(1)));

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
