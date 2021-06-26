package com.mycompany.app;

import java.math.BigDecimal;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class TestHelper {
    private static final Random random = new Random();

    public static List<Account> getAccounts() {
        return random.doubles(10, 10, 99999).mapToObj(n ->
                new Account(random.nextInt(), "AHMAD", random.nextInt() % 2 == 0 ? AccountType.SAVING : AccountType.CURRENT, new BigDecimal(n)))
                .collect(Collectors.toList());
    }

    public static Account databaseService() {
        boolean isFound = random.nextInt() % 2 == 0;
        return isFound ? null : new Account(122, "ABC", AccountType.SAVING, new BigDecimal(9352));
    }
}
