package demo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    @DisplayName("Class Employee Test")
    void calculateAge() {
        Employee employee1 = new Employee();
//        Employee employee2 = new Employee();

        employee1.setBirthDate(LocalDate.of(2000, 1, 1));
//        System.out.println( employee1.calculateAge() );
        assertEquals(21 , employee1.calculateAge());
        }
}