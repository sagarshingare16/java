package FunctionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerI implements Consumer<Integer> {
    @Override
    public void accept(Integer integer) {
        System.out.println("Printing value: "+ integer);
    }

    public static void main(String[] args) {
        ConsumerI consumerI = new ConsumerI();
        consumerI.accept(56);

        Consumer<Integer> consumer = (t)-> {
            System.out.println("Integer Value: " + t);
        };
        consumer.accept(10);

        List<Integer> list = Arrays.asList(1,2,5,-1,6);
        list.stream().forEach((t)-> {
            int a = 0;
            a = a+t;
            System.out.println(a);
        });
    }

}
