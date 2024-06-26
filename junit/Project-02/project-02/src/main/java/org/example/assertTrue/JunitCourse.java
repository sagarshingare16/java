package org.example.assertTrue;

public class JunitCourse implements Course {
    @Override
    public boolean coursePurchase() {
        System.out.println("JunitCourse purchased..");
        return true;
    }
}
