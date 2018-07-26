/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;
import java.util.Date;
/**
 *
 * @author iqbael17
 */
public class Employee {
    private int employeeId;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String jobId;
    private Date hireDate; 
    private int managerid;
    private int departmentid;
    private int salary;
    private double commisionPct;

    /**
     * @return the employeeId
     */
    public int getEmployeeId() {
        return employeeId;
    }

    /**
     * @param employeeId the employeeId to set
     */
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the phoneNumber
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * @param phoneNumber the phoneNumber to set
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * @return the jobId
     */
    public String getJobId() {
        return jobId;
    }

    /**
     * @param jobId the jobId to set
     */
    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * @return the hireDate
     */
    public Date getHireDate() {
        return hireDate;
    }

    /**
     * @param hireDate the hireDate to set
     */
    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    /**
     * @return the managerid
     */
    public int getManagerid() {
        return managerid;
    }

    /**
     * @param managerid the managerid to set
     */
    public void setManagerid(int managerid) {
        this.managerid = managerid;
    }

    /**
     * @return the departmentid
     */
    public int getDepartmentid() {
        return departmentid;
    }

    /**
     * @param departmentid the departmentid to set
     */
    public void setDepartmentid(int departmentid) {
        this.departmentid = departmentid;
    }

    /**
     * @return the salary
     */
    public int getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(int salary) {
        this.salary = salary;
    }

    /**
     * @return the commisionPct
     */
    public double getCommisionPct() {
        return commisionPct;
    }

    /**
     * @param commisionPct the commisionPct to set
     */
    public void setCommisionPct(double commisionPct) {
        this.commisionPct = commisionPct;
    }

 
    
    
    
    
}
