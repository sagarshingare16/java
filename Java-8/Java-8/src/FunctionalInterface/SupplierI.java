package FunctionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierI implements Supplier<String> {
    @Override
    public String get() {
        return "Hello and Welcome!";
    }

    public static void main(String[] args) {
        Supplier<String> supplier = new SupplierI();
        System.out.println(supplier.get());

        Supplier<String> stringSupplier = ()-> "Hello from supplier lambda...";
        System.out.println(stringSupplier.get());

        List<String> stringList = Arrays.asList("A","B","C","D");
        stringList.stream().findAny().orElseGet(()->
           "No Such thing is present"
        );
    }
}
