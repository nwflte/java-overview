package com.octo;

import com.octo.entity.Card;
import com.octo.entity.Credit;
import com.octo.entity.Customer;
import com.octo.infra.Database;
import com.octo.infra.IDataStore;
import com.octo.service.CustomerService;
import com.octo.service.EquipmentService;
import org.junit.Test;

import java.util.Random;

public class ExerciseTest {

    /*
       Hint: create another class and use inheritance
     */
    @Test
    public void reduce_repetitive_code_in_Card_and_Credit() {
        Card card = new Card();
        Credit credit = new Credit();
    }

    /*
       Hint: create a single list instead of two
     */
    @Test
    public void reduce_properties_in_Customer() {
        // display customer equipments
        Customer customer = new Customer();
        customer.getCredits().forEach(System.out::println);
        customer.getCards().forEach(System.out::println);
    }

    /*
    Hint: use one cancel method that works for all types of equipments
     */
    @Test
    public void reduce_repetitive_code_in_EquipmentService_method_overriding() {
        Card card = new Card();
        Credit credit = new Credit();

        EquipmentService equipmentService = new EquipmentService();

        equipmentService.cancelCard(card);
        equipmentService.cancelCredit(credit);
    }


    /*
    CustomerService is doing too much and has a large API (public methods) than it should, let's make it cleaner
    Hint: use interfaces or use dependency injection
     */
    @Test
    public void refactor_CustomerService() {
        CustomerService customerService = new CustomerService();

        if (isCacheActive()) {
            customerService.getFromCache("1");
        } else {
            customerService.getFromDatabase("1");
        }
    }

    private boolean isCacheActive() {
        Random random = new Random();
        return random.nextInt() % 2 == 0;
    }

    /*
   Database doesn't support removing but has to implement remove() so it throws an exception. propose a better design.
    */
    @Test
    public void refactor_Cache_Database_IData() {
        Customer customer = new Customer();
        IDataStore database = new Database();
        database.remove(customer); // throws exception
    }

}
