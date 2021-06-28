package com.octo.service;

import com.octo.infra.Cache;
import com.octo.infra.Database;
import com.octo.entity.Customer;

public class CustomerService {

    private Database databaseConnection = new Database();

    private Cache cacheConnection = new Cache();

    private EquipmentService equipmentService;

    public Customer getFromDatabase(String customerId) {
        System.out.println("Retrieving from DB");
        return (Customer) databaseConnection.get();
    }

    public Customer getFromCache(String customerId) {
        System.out.println("Retrieving from cache");
        return (Customer) cacheConnection.get();
    }

    public void remove(Customer customer) {
        System.out.println("Removing customer");
        customer.getCards().forEach(equipmentService::cancelCard);
        customer.getCredits().forEach(equipmentService::cancelCredit);
    }
}
