package com.invast.invast;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class EmployeeManager {
    private List<Employee> employees;

    // Конструктор
    public EmployeeManager() {
        employees = new ArrayList<>();
    }

    // Метод для додавання працівника до списку
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    // Метод для отримання списку постійних працівників
    public List<Employee> getPermanentEmployees() {
        List<Employee> permanentEmployees = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.isPermanent()) {
                permanentEmployees.add(employee);
            }
        }
        return permanentEmployees;
    }

    // Метод для отримання списку працівників за сумісництвом
    public List<Employee> getPartTimeEmployees() {
        List<Employee> partTimeEmployees = new ArrayList<>();
        for (Employee employee : employees) {
            if (!employee.isPermanent()) {
                partTimeEmployees.add(employee);
            }
        }
        return partTimeEmployees;
    }

    // Метод для пошуку працівників за посадою і мінімальним стажем
    public List<Employee> searchEmployees(String position, int minYearsOfService) {
        List<Employee> result = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getPosition().equalsIgnoreCase(position) &&
                    employee.getYearsOfService() >= minYearsOfService) {
                result.add(employee);
            }
        }
        return result;
    }

    // Головний метод для тестування програми
    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager();

        // Створення працівників
        Employee emp1 = new Employee("Ivanov", "123 Main St", "Manager", 1985, 2, LocalDate.of(2010, 5, 10), true);
        Employee emp2 = new Employee("Petrov", "456 Elm St", "Developer", 1990, 1, LocalDate.of(2015, 8, 15), false);
        Employee emp3 = new Employee("Sidorov", "789 Oak St", "Manager", 1975, 3, LocalDate.of(2005, 2, 1), true);

        // Додавання працівників до списку
        manager.addEmployee(emp1);
        manager.addEmployee(emp2);
        manager.addEmployee(emp3);

        // Виведення списку постійних працівників
        System.out.println("Permanent Employees:");
        for (Employee emp : manager.getPermanentEmployees()) {
            System.out.println(emp);
        }

        // Виведення списку працівників за сумісництвом
        System.out.println("\nPart-time Employees:");
        for (Employee emp : manager.getPartTimeEmployees()) {
            System.out.println(emp);
        }

        // Пошук працівників за посадою та стажем роботи
        System.out.println("\nSearch Results (Manager, 10+ years of service):");
        for (Employee emp : manager.searchEmployees("Manager", 10)) {
            System.out.println(emp);
        }
    }
}
