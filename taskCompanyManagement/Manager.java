package taskCompanyManagement;

import java.util.Base64;

public class Manager extends Employee {
    public String departmentManaged;

    public static final int MANAGEMENT_PAYMENT = 5000;


//    bonuslar alir hem employee
//    manage methodu var overridedir
//    salary hesablayir
    //ile gore maas
    //infolarre
    public Manager(int no, String name, int year, String department, String departmentManaged) {
        super(no, name, year, department);
        this.departmentManaged = departmentManaged;

    }
    @Override
    public void work() {
        System.out.println("This worker is Manager");
    }


    @Override
    public String toString() {
        return "Manager{"+
                "name='" + name + '\'' +
                "departmentManaged='" + departmentManaged + '\'' +
                "Salary= "+BASE_SALARY*year +'\''+
                "Bonus= "+ BASE_SALARY*2.5 + '\''+
//                "Employee salary= "+ employee.salary + '\''+
                '}';
    }
}
