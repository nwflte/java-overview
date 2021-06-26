package com.mycompany.app;

import org.junit.Test;

import java.util.Optional;

public class OptionalTest {

    private static Account getClientAccountService() {
        return TestHelper.databaseService();
    }

    /*
    Account may be null, fix the code
     */
    @Test
    public void should_display_account_number() {
        Account account;

        int n = 10;
        // Repeat 10 times
        while (n > 0) {
            account = getClientAccountService();
            System.out.println(account.getAccountNumber());
            n--;
        }
    }

    /*
    Modify getClientAccountService() to use Optional to better handle nullable values
    Only display account number if the account is not null
    hint: use the appropriate Optional method: isPresent(), ifPresent(), orElse(), orElseGet()
     */
    @Test
    public void should_display_account_number_using_optional() {
        Optional<Account> account;

        int n = 10;
        // Repeat 10 times
        while (n > 0) {
            // account = getClientAccountService();
            // display number
            n--;
        }
    }

    /*
    After modifying getClientAccountService(), only display account number if the account balance is positive
    Hint: use filter()
     */
    @Test
    public void should_display_account_number_only_if_it_is_not_null_and_and_balance_is_positive_using_optional() {
        Optional<Account> account;
        System.out.println();
    }
}
