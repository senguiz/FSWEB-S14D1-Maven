package com.developers;

public class MidDeveloper extends Employee{
    public MidDeveloper(int id, String name, int salary) {
        super(id, name, salary);
    }
    @Override
    public void work(){
        System.out.println(getName()+" "+"Mid Developer starts working");
        setSalary(getSalary()*2);
    }
}
