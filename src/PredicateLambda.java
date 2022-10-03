import java.util.function.Predicate;

public class PredicateLambda {
    public static void main(String[] args) {
        //—оздать л€мбда выражение, которое возвращает значение true, если строка не null,
        // использу€ функциональный интерфейс Predicate.
        Predicate<String> predicate = s -> s!= null;
        boolean result = predicate.test("Home");
        System.out.println("predicate 1. " + result);
        boolean result1 = predicate.test(null);
        System.out.println("predicate 2. " + result1);

        //—оздать л€мбда выражение, которое провер€ет, что строка не пуста,
        // использу€ функциональный интерфейс Predicate.
        Predicate <String> predicate2 = s -> s!= "";
        boolean result2 = predicate2.test("");
        System.out.println("predicate 3. " + result2);
        boolean result3 = predicate2.test("Task");
        System.out.println("predicate 4. " + result3);

        //Ќаписать программу, котора€ провер€ет, что строка начинаетс€ буквой УJФили УNФ
        // и заканчиваетс€ УAФ. »спользуем функциональный интерфейс Predicate.
        Predicate <String> predicate3 = s -> (s.charAt(0) =='J' | s.charAt(0) == 'N' & s.charAt(s.length()-1) == 'A');
        boolean result4 = predicate3.test("Number");
        System.out.println("predicate 5. " + result4);
        boolean result5 = predicate3.test("Julia");
        System.out.println("predicate 6. " + result5);
    }
}
