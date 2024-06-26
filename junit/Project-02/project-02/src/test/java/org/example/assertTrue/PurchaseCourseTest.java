package org.example.assertTrue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PurchaseCourseTest {

    PurchaseCourse purchaseCourse = new PurchaseCourse();

    @Test
    void proceedWithCourse() {
        assertTrue(purchaseCourse.proceedWithCourse(new JavaCourse()));
        assertFalse(purchaseCourse.proceedWithCourse(new SpringBootCourse()));
    }
}