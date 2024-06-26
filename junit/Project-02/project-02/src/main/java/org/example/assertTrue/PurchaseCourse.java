package org.example.assertTrue;

public class PurchaseCourse {
    private Course course;

    public boolean proceedWithCourse(Course course){
        return course.coursePurchase();
    }
}
