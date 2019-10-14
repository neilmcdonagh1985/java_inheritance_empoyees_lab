package management;


public class Director extends Manager {

    private int budget;


    public Director(String name, String NINum, int salary, String deptName, int budget){
        super(name, NINum, salary, deptName);
        this.budget = budget;
    }

    public int getBudget(){
        return this.budget;
    }

    public int payBonus(){
        return getSalary() / 100 * 2;
    }




}
