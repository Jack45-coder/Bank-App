package repository;

import domain.Transaction;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TransactionRepository {
    private final Map<String, List<Transaction>> txByAccount = new HashMap<>();

    public void add(Transaction transaction) {
        List<Transaction> list = txByAccount.computeIfAbsent(transaction.getAccountNumber(),
                key -> new ArrayList<>());
        list.add(transaction);
    }
}
