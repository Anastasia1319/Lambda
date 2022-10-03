import java.util.Random;
import java.util.function.Supplier;

public class SupplierLambda {
    public static void main(String[] args) {
        //Написать лямбда выражение, которое возвращает случайное число от 0 до 10.
        // Используем функциональный интерфейс Supplier.
        Supplier<Integer> supplier = () -> {
            Random r = new Random();
            int low = 1;
            int high = 10;
            return (r.nextInt(high-low) + low);
        };
        Integer num = supplier.get();
        System.out.println("Supplier 1. " + num);

        Supplier<Double> supplier1 = () -> (Math.random()*10);
        Double num1 = supplier1.get();
        System.out.printf("Supplier 2. %.2f", num1);
    }
}
