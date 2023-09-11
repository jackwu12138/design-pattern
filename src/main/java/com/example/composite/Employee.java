package com.example.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jackwu
 */
public class Employee {

    private final String name;

    private final String dept;

    private final int salary;

    private final List<Employee> subordinates;

    public Employee(String name, String dept, int salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
        this.subordinates = new ArrayList<>();
    }

    public void add(Employee e) {
        this.subordinates.add(e);
    }

    public void remove(Employee e) {
        this.subordinates.remove(e);
    }

    @Override
    public String toString() {
        return toString(0);
    }

    public String toString(int tab) {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("[name: %-10s, dept: %-10s, salary: %-6d]", name, dept, salary).indent(4*tab));
        for (Employee subordinate : subordinates) {
            sb.append(subordinate.toString(tab + 1));
        }
        return sb.toString();
    }
}
