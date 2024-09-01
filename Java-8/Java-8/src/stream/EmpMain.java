package stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class EmpMain {
    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(101,"John",10000.0));
        employeeList.add(new Employee(102,"Mark",12000.0));
        employeeList.add(new Employee(103,"Leonard",9000.0));
        employeeList.add(new Employee(104,"Naveen",15000.0));
        employeeList.add(new Employee(105,"Siri",8000.0));

        employeeList.stream()
                .filter(employee -> employee.getEmpSalary()>9000.0)
                .forEach((s)->System.out.println("Employee Id: "+s.getEmpId()+" Employee Name: "+s.getEmpName()+" " +
                        "Employee Salary: "+s.getEmpSalary()));

        long counted = employeeList.stream()
                .filter(employee -> employee.getEmpSalary()>10000.0)
                .count();
        System.out.println(counted);

        Employee maxSalaryEmp = employeeList.stream()
                .max(Comparator.comparing(Employee::getEmpSalary)).get();
        System.out.println(maxSalaryEmp.getEmpName());

    }
}
