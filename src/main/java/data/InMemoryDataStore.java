package data;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class InMemoryDataStore implements DataStore {
    private static InMemoryDataStore dataStore;
    private Map<String, Integer> data;

    private InMemoryDataStore() {
        data = new ConcurrentHashMap<>();
    }

    public static InMemoryDataStore getInstance()
    {
        if (dataStore == null) dataStore = new InMemoryDataStore();
        return dataStore;
    }

    public void set(String key, int value) {
        data.put(key, value);
    }

    public int get(String key) {
        if(data.get(key) != null) {
            return data.get(key);
        }
        return -1;
    }

    public void remove(String key) {
        data.remove(key);
    }

    public int count(int requestedValue) {
        int count = 0;
        for(int i: data.values()) {
            if (requestedValue == i) ++count;
        }
        return count;
    }

    @Override
    public String toString() {
        return data.toString();
    }
}
