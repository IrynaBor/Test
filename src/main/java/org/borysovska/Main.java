package org.borysovska;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Start");
        boolean work = true;
        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
        String line;
        Main main = new Main();
        main.initialize();
        while (work) {
            System.out.println("Menu");
            System.out.println("1. list of all user");
            System.out.println("2. list of all products");
            System.out.println("3. Exit");
            line = obj.readLine();
            if (line.equals("1")) {
                for (int i = 0; i < 3; i++)
                {
                    System.out.println(main.user.get(i));
                }
            } else if (line.equals(("2"))){
                for (int i = 0; i<3; i++){
                    System.out.println(main.product.get(i));
                }
            } else if (line.equals("3")) work = false;
        }
        System.out.println("End");
    }
    private List<Product> product = new LinkedList<>();
    private List<User> user = new LinkedList<>();

    private void initialize(){
       product.add(Product.createProduct(1, "Apple", 2000.0));
       product.add(Product.createProduct(2, "Sumsung", 1500.0));
       product.add(Product.createProduct(3, "Nokia", 500.0));
       user.add(User.createUser(1,"Ira", "Ira", 8000.0));
       user.add(User.createUser(2,"Olya", "OLya", 6000.0));
       user.add(User.createUser(3,"Katya", "Katya", 15000.0));
    }
}
