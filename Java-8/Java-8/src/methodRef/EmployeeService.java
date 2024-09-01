package methodRef;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class EmployeeService {
    public List<Employee> getEmployeesDetails(){
        return IntStream.rangeClosed(1,10)
                .mapToObj(i->new Employee(i,"Employee"+i,new Random().nextDouble()))
                .collect(Collectors.toList());
    }
}
