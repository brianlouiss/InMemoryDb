package commands.dataCommands;

import data.InMemoryDataStore;

import java.util.List;

public class NumEqualTo implements DataCommand {

    private int value = Integer.MIN_VALUE;
    @Override
    public int execute(List<String> arguments) {
        InMemoryDataStore inMemoryDataStore = InMemoryDataStore.getInstance();
        int requestedValue = Integer.parseInt(arguments.get(0));
        value = inMemoryDataStore.count(requestedValue);
        return 0;
    }

    @Override
    public boolean isEnd() {
        return false;
    }

    @Override
    public int commandData() {
        return value;
    }

    @Override
    public boolean containsData() {
        return value != Integer.MIN_VALUE;
    }
}
