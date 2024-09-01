package optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalMain {
    public static void main(String[] args) {
        Customer customer = new Customer(101,"John",null, new String[]{"9854671264","9125487469"});
        List<String> customerEmail = new ArrayList<>();

        Optional<Object> emptyOptional = Optional.empty();
        System.out.println(emptyOptional);

        Optional<String> customerEmailOpt = Optional.of(customer.getEmail());
        System.out.println(customerEmailOpt);  // nullPointerException

        Optional<String> customerEmailOpt1 = Optional.ofNullable(customer.getEmail());
        if(customerEmailOpt1.isPresent()){
            customerEmail.add(customerEmailOpt1.get());
        }

        System.out.println(customerEmailOpt1.orElse("default@email.com"));



    }
}
