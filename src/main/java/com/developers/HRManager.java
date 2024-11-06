package com.developers;

import java.sql.SQLOutput;
import java.util.Arrays;

public class HRManager extends Employee {

    JuniorDeveloper[] juniorDevelopers = new JuniorDeveloper[5];
    MidDeveloper[] midDevelopers = new MidDeveloper[5];
    SeniorDeveloper[] seniorDevelopers = new SeniorDeveloper[5];

    public HRManager(int id, String name, int salary) {
        super(id, name, salary);
    }

    public HRManager(int id, String name, int salary, JuniorDeveloper[] juniorDevelopers, MidDeveloper[] midDevelopers, SeniorDeveloper[] seniorDevelopers) {
        super(id, name, salary);
        this.juniorDevelopers = juniorDevelopers;
        this.midDevelopers = midDevelopers;
        this.seniorDevelopers = seniorDevelopers;
    }

    @Override
    public void work() {
        System.out.println("HR Manager starts to working");
    }

    public void setSalary(int salary) {
        super.setSalary(salary);
    }

    public void addEmployee(JuniorDeveloper juniorDeveloper) {
        boolean add = false;
        for (int i = 0; i < juniorDevelopers.length; i++) {
            if (juniorDevelopers[i] == null) {
                juniorDevelopers[i] = juniorDeveloper;
                System.out.println("Junior Developer added");
                add=true;
                break;
            }
        }
        if(!add){
            System.out.println("Junior Developer can not be added");
        }
    }

    public void addEmployee(MidDeveloper midDeveloper) {
        boolean add = false;
        for (int i = 0; i < midDevelopers.length; i++) {
            if (midDevelopers[i] == null) {
                midDevelopers[i] = midDeveloper;
                System.out.println("Mid Developer added");
                add=true;
                break;
            }
        }
        if(!add){
            System.out.println("Mid Developer can not be added");
        }
    }

    public void addEmployee(SeniorDeveloper seniorDeveloper) {
        boolean add = false;
        for (int i = 0; i < seniorDevelopers.length; i++) {
            if (seniorDevelopers[i] == null) {
                seniorDevelopers[i] = seniorDeveloper;
                System.out.println("Senior Developer added");
                add=true;
                break;
            }
        }
        if(!add){
            System.out.println("Senior Developer can not be added");
        }
    }
    public String toString(){
        return "HR Manager{ "+
                "Junior Developers : " + Arrays.toString(juniorDevelopers) +
                "Mid Developers : "+ Arrays.toString(midDevelopers)+
                "Senior Developers : "+Arrays.toString(seniorDevelopers)+"}";
    }
}




