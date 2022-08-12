package class_15.generic;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Generics {
  public static void main(String[] args) {
    OpsEmployee employee1 = new OpsEmployee(50, 3);
    OpsEmployee employee2 = new OpsEmployee(50, 0);
    OpsEmployee employee3 = new OpsEmployee(50, 12);
    OpsEmployee employee4 = new OpsEmployee(50, 5);
    OpsEmployee employee5 = new OpsEmployee(50, 2);
    OpsEmployee employee6 = new OpsEmployee(50, 8);

    Manager manager1 = new Manager(60, List.of(employee1));
    Manager manager2 = new Manager(60, List.of(employee3, employee4, employee2));
    Manager manager3 = new Manager(60, List.of(employee5, employee6));

    List<OpsEmployee> opsEmployees = List.of(employee1, employee2, employee3, employee4, employee5, employee6);
    List<Manager> managers = List.of(manager1, manager2, manager3);

    System.out.printf("Number of Ops employees with salary bigger than 6000 is %d",
        filterEmployeesForWeeksSalary(opsEmployees).size());

//    System.out.printf("Number of employees with salary bigger than 6000 is %d ops and %d managers",
//        filterEmployeesForWeeksSalary(opsEmployees).size(),
//        filterEmployeesForWeeksSalary(managers).size()
//    );
  }

  private static List<OpsEmployee> filterEmployeesForWeeksSalary(List<OpsEmployee> opsEmployees) {
    return opsEmployees.stream()
        .filter(e -> e.calculatePay(40) > 6000)
        .collect(Collectors.toList());
  }

//  private static <T extends Employee> List<T> filterEmployeesForWeeksSalary(List<T> employees) {
//    return employees.stream()
//        .filter(e -> e.calculatePay(40) > 6000)
//        .collect(Collectors.toList());
//  }

  private static abstract class Employee {
    protected int basePay;

    protected Employee(int basePay) {
      this.basePay = basePay;
    }

    public abstract int calculatePay(int hoursWorked);
  }

  private static class OpsEmployee extends Employee {
    private int tasksDone;

    protected OpsEmployee(int basePay, int tasksDone) {
      super(basePay);
      this.tasksDone = tasksDone;
    }

    @Override
    public int calculatePay(int hoursWorked) {
      return super.basePay * hoursWorked * tasksDone;
    }
  }

  private static class Manager extends Employee {
    List<OpsEmployee> managedEmployees;

    protected Manager(int basePay, List<OpsEmployee> managedEmployees) {
      super(basePay);
      this.managedEmployees = managedEmployees;
    }

    @Override
    public int calculatePay(int hoursWorked) {
      return basePay * hoursWorked * managedEmployees.size();
    }
  }
}
