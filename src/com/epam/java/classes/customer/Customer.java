package com.epam.java.classes.customer;

public class Customer {

    private int id;
    private String firstName;
    private String lastName;
    private String middleName;
    private String address;
    private String creditCard;
    private String bankAccount;

    public Customer(int id) {
        this.id = id;
    }

    public Customer(int id, String firstName, String lastName, String middleName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
    }

    public Customer(int id, String firstName, String lastName, String middleName,
                    String address, String creditCard, String bankAccount) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.address = address;
        this.creditCard = creditCard;
        this.bankAccount = bankAccount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(String creditCard) {
        this.creditCard = creditCard;
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public String toString() {
        return String.format("Customer (id: %d, firstName: %s, lastName: %s, middleName: %s," +
                " address: %s, creditCard: %s, bankAccount: %s",
                id, firstName, lastName, middleName, address, creditCard, bankAccount);
    }
}
