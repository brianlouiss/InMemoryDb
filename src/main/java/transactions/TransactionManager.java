package transactions;

import java.util.Stack;

public class TransactionManager {
    private static TransactionManager manager;
    private Stack<Transaction> existingTransactions;

    private TransactionManager() {
        existingTransactions = new Stack<>();
    }

    public static TransactionManager getInstance()
    {
        if (manager == null) manager = new TransactionManager();
        return manager;
    }

    public boolean isTransactionInProgress() {
        return !existingTransactions.empty();
    }

    public void addTransaction(Transaction transaction) {
        existingTransactions.push(transaction);
    }
}
