import java.util.function.Function;

public class FunctionLambda {
    public static void main(String[] args) {
        //Написать лямбда выражение, которое принимает на вход число и возвращает значение
        // “Положительное число”, “Отрицательное число” или “Ноль”.
        // Используем функциональный интерфейс Function.
        Function<Integer, String> function = number -> {
            if (number >0) {
                return "Положительное число";
            } else if (number <0) {
                return "Отрицательное число";
            } else {
                return "Ноль";
            }
        };
        String str = function.apply(18);
        System.out.println("Function 1. " + str);
        String str1 = function.apply(-8);
        System.out.println("Function 2. " + str1);
    }
}
