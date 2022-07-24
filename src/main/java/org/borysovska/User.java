package org.borysovska;

public class User {
    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", money=" + money +
                '}';
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

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    private final int id;
    private String firstName;
    private String lastName;
    private double money;

    public User(int id) {
        this.id = id;
    }

    public static User createUser (int id, String firstName, String lastName,double money){
        User us = new User(id);
        us.setLastName(lastName);
        us.setFirstName(firstName);
        us.setMoney(money);
        return us;
    }
}
