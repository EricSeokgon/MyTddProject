package com.hadeslee;

/**
 * Project: MyTddProject
 * FileName: Employee
 * Date: 2016-11-29
 * Time: 오후 2:12
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                '}';
    }
}
