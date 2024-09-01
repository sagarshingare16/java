package methodRef;

import java.util.List;
import java.util.stream.Collectors;

public class EmployeeMain {
    public static void main(String[] args) {

        EmployeeService service = new EmployeeService();

        //lambda expression
        /*service.getEmployeesDetails()
                 .forEach((employee)->System.out.println(employee));

        // method reference
        service.getEmployeesDetails()
                .forEach(EmployeeMain::print);

        //System is class, out is reference of PrintStream and print is method
        service.getEmployeesDetails()
                .forEach(System.out::println);*/

        /*----------------------------------------------*/

        /*List<EmployeeDO> employeeDOList = service.getEmployeesDetails()
                .stream()
                .map((employee -> {
                    EmployeeDO employeeDO = new EmployeeDO();
                    employeeDO.setId(employee.getId());
                    employeeDO.setName(employee.getName());
                    employeeDO.setSalary(employee.getSalary());
                    return employeeDO;
                }))
                .collect(Collectors.toList());
        System.out.println(employeeDOList);

        service.getEmployeesDetails()
                .stream()
                .map(EmployeeMapper::convert)
                .forEach(System.out::println);*/

        /*---------------------------------------------*/
        // instance method reference
        /*EmployeeMapper mapper = new EmployeeMapper();
        service.getEmployeesDetails()
                .stream()
                .map(mapper::convert)
                .forEach(System.out::println);*/

        /*--------------------------------------------*/
        /*List<String> employeeNameList = service.getEmployeesDetails()
                .stream()
                //.map(employee -> employee.getName())
                .map(Employee::getName)
                .collect(Collectors.toList());
        System.out.println(employeeNameList);*/

        /*-------------------------------------------*/
        //constructor reference


    }

    /*// EmployeeMain::print
    public static void print(Employee employee){
        System.out.println(employee);
    }*/
}
