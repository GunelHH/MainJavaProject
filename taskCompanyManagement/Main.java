package taskCompanyManagement;

public class Main {
    public static  void main(String[] args) {
        Employee employee=new Employee(1,"Employee1",3,"employeeDepartment");

        Manager manager=new Manager(2,"Manager1",4,"ManagerDepartment","department");
        System.out.println(employee);
        employee.work();
        employee.calculateSalary(employee.year);
//       System.out.println(manager);
//       manager.work();

    }
}
