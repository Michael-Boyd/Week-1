package com.workforce.hr;

        import java.util.ArrayList;

/**
 * Created by mikeboyd5 on 6/19/15.
 */
public class Manager extends Employee{
    // list of employee ids who are reporting
    private ArrayList reports = new ArrayList();

    public void addEmployee(int employeeId){
        reports.add(employeeId);
    }

    public void removeEmployee(int employeeId){
        //remove his report
    }
}
