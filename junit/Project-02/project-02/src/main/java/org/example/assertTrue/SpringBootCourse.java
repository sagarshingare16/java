package org.example.assertTrue;

public class SpringBootCourse implements Course{
    @Override
    public boolean coursePurchase() {
        System.out.println("Spring-boot course purchased..");
        return true;
    }
}
