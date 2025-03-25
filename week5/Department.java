/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week5;

import java.util.ArrayList;

/**
 *
 * @author Axioo Pongo
 */
public class Department {

    private String id, name;
    private int maxNum;
    private ArrayList<Employee> employeelist = new ArrayList<Employee>();

    public Department(String name, String id, int maxNum) {

        this.name = name;
        this.id = id;
        this.maxNum = maxNum;
    }

    public String getId() {
        return id;

    }

    public String getName() {
        return name;

    }

    public String setName(String name) {

        return name;
    }

    public int getMaxNum() {
        return maxNum;
    }

    public int getEmployeeCount() {
        return this.employeelist.size();

    }

    public void printEmployeeList() {
        System.out.println("Angotta tim teknik");

    }

    public boolean canAddEmployee() {

        if (getMaxNum() <= getEmployeeCount()) {
            System.out.println("Penuh cui");
            return true;
        } else {
           
            return true;
        }

    }

    public void deleteEmployee(Employee employee) {

    }

    public void addEmployee(Employee employee) {

    }

}
