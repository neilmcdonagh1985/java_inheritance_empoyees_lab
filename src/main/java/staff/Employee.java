package staff;

public class Employee {

    private String name;
    private String NINum;
    private int salary;

    public Employee(String name, String NINum, int salary){
        this.name = name;
        this.NINum = NINum;
        this.salary = salary;

    }

    public String getName(){
        return this.name;

    }

    public String getNINum(){
        return this.NINum;
    }

    public int getSalary(){
        return this.salary;
    }

    public void raiseSalary(int amount){
        if (amount > 0){
            salary += amount;
        }
    }

    public int payBonus(){
        return salary / 100;

    }


}
