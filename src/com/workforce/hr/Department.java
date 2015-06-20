package com.workforce.hr;

/**
 * Created by mikeboyd5 on 6/19/15.
 */
public class Department {

    private String name;

    private Employee employee[] = null;
    private Manager managers[] = null;


    public Department(String name){//Argument constructor
        this.name = name;
    }

    public void calculateBonuses(){
        //calculate bonuses for all the individuals (Employees and Managers) for this department
    }

    public void calculateVacationDays() {
        //calculate vacation days for all the individuals (Employees and Managers) for this department
    }

}
