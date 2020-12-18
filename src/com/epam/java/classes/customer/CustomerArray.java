package com.epam.java.classes.customer;

public class CustomerArray {

    private final Customer[] customerArray;

    public CustomerArray(Customer[] customerArray) {
        this.customerArray = customerArray;
    }

    public Customer[] sortAlphabetOrder() {
        Customer[] filteredCustomers = this.customerArray;
        Customer temp;
        boolean isNotSorted = true;
        while (isNotSorted) {
            isNotSorted = false;
            for (int i = 0; i < filteredCustomers.length; i++) {
                if (i + 1 < filteredCustomers.length &&
                        filteredCustomers[i].getLastName().compareTo(filteredCustomers[i + 1].getLastName()) > 0) {
                    temp = filteredCustomers[i];
                    filteredCustomers[i] = filteredCustomers[i + 1];
                    filteredCustomers[i + 1] = temp;
                    isNotSorted = true;
                }
            }
        }
        return filteredCustomers;
    }

    public Customer[] filterByCreditCardNumber(Long min, Long max) {
        Customer[] filteredCustomers = this.customerArray;
        for (int i = 0; i < filteredCustomers.length; i++) {
            long creditCardNumber = Long.parseLong(filteredCustomers[i].getCreditCard());
            if (!(creditCardNumber > min && creditCardNumber < max)) {
                filteredCustomers[i] = null;
            }
        }
        return filteredCustomers;
    }
}
