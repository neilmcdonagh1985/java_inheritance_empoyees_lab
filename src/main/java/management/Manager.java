package management;

import staff.Employee;

public class Manager extends Employee {

    private String deptName;

    public Manager(String name, String NINum, int salary, String deptName){
        super(name, NINum, salary);
        this.deptName = deptName;

    }

    public String getDeptName(){
        return this.deptName;
    }
}

