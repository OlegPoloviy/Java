package com.invast.invast;

import java.time.LocalDate;

public class Employee {
    private String lastName;
    private String homeAddress;
    private String position;
    private int yearOfBirth;
    private int numberOfChildren;
    private LocalDate hireDate;
    private boolean isPermanent;

    // Конструктор
    public Employee(String lastName, String homeAddress, String position, int yearOfBirth,
                    int numberOfChildren, LocalDate hireDate, boolean isPermanent) {
        this.lastName = lastName;
        this.homeAddress = homeAddress;
        this.position = position;
        this.yearOfBirth = yearOfBirth;
        this.numberOfChildren = numberOfChildren;
        this.hireDate = hireDate;
        this.isPermanent = isPermanent;
    }

    // Метод для перевірки, чи працівник постійний
    public boolean isPermanent() {
        return isPermanent;
    }

    // Метод для отримання посади працівника
    public String getPosition() {
        return position;
    }

    // Метод для підрахунку стажу роботи
    public int getYearsOfService() {
        return LocalDate.now().getYear() - hireDate.getYear();
    }

    // Метод для відображення інформації про працівника
    @Override
    public String toString() {
        return "Employee{" +
                "lastName='" + lastName + '\'' +
                ", position='" + position + '\'' +
                ", hireDate=" + hireDate +
                ", isPermanent=" + (isPermanent ? "Permanent" : "Part-time") +
                '}';
    }
}
