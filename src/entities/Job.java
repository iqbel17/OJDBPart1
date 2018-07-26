/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author iqbael17
 */
public class Job {
    private String jobId;
    private String jobTittle;
    private int minSalary;
    private int maxSalary;    

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
     * @return the jobTittle
     */
    public String getJobTittle() {
        return jobTittle;
    }

    /**
     * @param jobTittle the jobTittle to set
     */
    public void setJobTittle(String jobTittle) {
        this.jobTittle = jobTittle;
    }

    /**
     * @return the minSalary
     */
    public int getMinSalary() {
        return minSalary;
    }

    /**
     * @param minSalary the minSalary to set
     */
    public void setMinSalary(int minSalary) {
        this.minSalary = minSalary;
    }

    /**
     * @return the maxSalary
     */
    public int getMaxSalary() {
        return maxSalary;
    }

    /**
     * @param maxSalary the maxSalary to set
     */
    public void setMaxSalary(int maxSalary) {
        this.maxSalary = maxSalary;
    }
    
}
