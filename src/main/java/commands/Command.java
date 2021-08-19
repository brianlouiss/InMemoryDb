package commands;

import java.util.List;

public interface Command {
    boolean isEnd();
    int execute(List<String> arguments);
    int commandData();
    boolean containsData();
}
