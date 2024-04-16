package taskCompanyManagement;

public class Director extends Manager{
    public double bonus;
    public Employee employee;
//    meneger employee bonus
    //ile gore maas


    public Director(int no, String name, int year, String department, String departmentManaged, double bonus) {
        super(no, name, year, department, departmentManaged);
        this.bonus = bonus;
    }

    @Override
    public void work() {
        System.out.println("This worker is Manager");
    }
}
