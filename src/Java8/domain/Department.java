/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Java8.domain;

/**
 *
 * @author krishna
 */
public class Department {

    private String departmentName;

    private Integer noOfEmployees;

    public Department(String departmentName, Integer noOfEmployees) {
        this.departmentName = departmentName;
        this.noOfEmployees = noOfEmployees;
    }
    
    

    // getters and setters

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Integer getNoOfEmployees() {
        return noOfEmployees;
    }

    public void setNoOfEmployees(Integer noOfEmployees) {
        this.noOfEmployees = noOfEmployees;
    }
}
