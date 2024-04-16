package taskCompanyManagement;

public class Employee {
    public int no;
    public String name;
    public static int year=1;
    public String department;
    public static final int BASE_SALARY = 500;
//    public int salary;

//    work methodu++++++
//    ile esasen maas alir++
//strategic class
//    saraly meyhodu
    public Employee(int no, String name, int year, String department) {
        this.no = no;
        this.name = name;
        this.year =year;
        this.department = department;
//        this.salary=BASE_SALARY*year;

    }

    public  void work(){
        System.out.println("This worker is Employee");
    }

    public void calculateSalary(int year){
        System.out.println(BASE_SALARY*year);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", year=" + year +
                ", department='" + department + '\'' +
//                "Salary= "+salary+
                '}';
    }
}
