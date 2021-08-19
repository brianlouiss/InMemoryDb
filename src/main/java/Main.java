import commands.Command;
import commands.CommandConstants;
import commands.CommandFactory;
import transactions.TransactionManager;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static Scanner kb = new Scanner(System.in);
    private static CommandFactory commandFactory;
    private static TransactionManager transactionManager;

    private static void initialize() {
        commandFactory = CommandFactory.getInstance();
        transactionManager = TransactionManager.getInstance();
    }

    public static void main(String... args) {
        initialize();

        Command currentCommand = commandFactory.getCommand(CommandConstants.DEFAULT);

        System.out.println("Initialized and Read to Use.");
        while (!currentCommand.isEnd())
        {
            try {
                System.out.print("> ");
                String userInput = kb.nextLine();
                List<String> inputAsList =  Arrays.asList(userInput.split(" "));
                String inputCommandName = inputAsList.get(0);
                currentCommand = commandFactory.getCommand(inputCommandName);

                currentCommand.execute(inputAsList.subList(1, inputAsList.size()));
                if(currentCommand.containsData()) {
                    if (currentCommand.commandData() == -1) {
                        System.out.println("Data: NULL");
                    } else {
                        System.out.println("Data: " + currentCommand.commandData());
                    }

                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
