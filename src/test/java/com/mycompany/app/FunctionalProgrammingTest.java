package com.mycompany.app;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.math.BigDecimal;
import java.util.*;

public class FunctionalProgrammingTest
{
    /*
    Implement Comparator class and pass an object to to sort() to sort numbers in descending order
     */
    @Test
    public void should_sort_descending_order_without_using_lambda_expression()
    {

        List<Integer> numbers = Arrays.asList(2, 1, 5, 4);

        // numbers.sort();

        assertEquals(new Integer(5), numbers.get(0));
    }

    /*
    Pass a lambda expression to sort() in descending order
     */
    @Test
    public void should_sort_descending_order_using_lambda_expression()
    {

        List<Integer> numbers = Arrays.asList(2, 1, 5, 4);

        // numbers.sort();

        assertEquals(new Integer(5), numbers.get(0));
    }

    /*
    Hint: Use a for loops and remove() of List
     */
    @Test
    public void should_remove_number_13_and_null_and_sort_descending_order_without_functional_features()
    {
        List<Integer> numbers = Arrays.asList(2, 13, 5, 4);
        List<Integer> filteredAndSortedNumbers = new ArrayList<>();

        /*for (int i = 0; i < numbers.size(); i++) {

        }*/

        assertEquals(3, filteredAndSortedNumbers.size());
        assertEquals(new Integer(5), filteredAndSortedNumbers.get(0));
        assertEquals(new Integer(4), filteredAndSortedNumbers.get(1));
    }

    /*
    Hint: Use Stream API : stream(), filter() and sorted()
     */
    @Test
    public void should_remove_number_13_and_null_and_sort_descending_order_using_functional_features()
    {
        List<Integer> numbers = Arrays.asList(2, 13, 5, 4);

        // code here
        List<Integer> filteredAndSortedNumbers = new ArrayList<>();

        assertEquals(3, filteredAndSortedNumbers.size());
        assertEquals(new Integer(5), filteredAndSortedNumbers.get(0));
        assertEquals(new Integer(4), filteredAndSortedNumbers.get(1));
    }

    /*
    Use Stream API : reduce() or map() then reduce()
     */
    @Test
    public void should_calculate_total_balance_of_all_accounts()
    {
        List<Account> accounts = TestHelper.getAccounts();
        BigDecimal totalBalance;

        // code here

    }

    /*
    Use Stream API : filter(), reduce()
     */
    @Test
    public void should_calculate_total_balance_of_only_saving_accounts()
    {
        List<Account> accounts = TestHelper.getAccounts();
        // BigDecimal totalBalance = accounts.stream();

        // code here
        assertTrue(true);
    }
}
