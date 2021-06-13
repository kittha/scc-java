package demo;

import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;

public class Employee {
    private int id;
    private String name;
    private double salary;
    private LocalDate birthDate;

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public int calculateAge() {
        int age = 0;
//      TODO : Current Year - Birth Year = year
//        https://docs.oracle.com/javase/8/docs/api/java/time/LocalDate.html
        LocalDate _birthDate = birthDate;


//        https://docs.oracle.com/javase/8/docs/api/java/time/Period.html
        Period period = Period.between(_birthDate, LocalDate.now());

        return period.getYears();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
