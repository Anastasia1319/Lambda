import java.util.function.Predicate;

public class PredicateLambda {
    public static void main(String[] args) {
        //������� ������ ���������, ������� ���������� �������� true, ���� ������ �� null,
        // ��������� �������������� ��������� Predicate.
        Predicate<String> predicate = s -> s!= null;
        boolean result = predicate.test("Home");
        System.out.println("predicate 1. " + result);
        boolean result1 = predicate.test(null);
        System.out.println("predicate 2. " + result1);

        //������� ������ ���������, ������� ���������, ��� ������ �� �����,
        // ��������� �������������� ��������� Predicate.
        Predicate <String> predicate2 = s -> s!= "";
        boolean result2 = predicate2.test("");
        System.out.println("predicate 3. " + result2);
        boolean result3 = predicate2.test("Task");
        System.out.println("predicate 4. " + result3);

        //�������� ���������, ������� ���������, ��� ������ ���������� ������ �J���� �N�
        // � ������������� �A�. ���������� �������������� ��������� Predicate.
        Predicate <String> predicate3 = s -> (s.charAt(0) =='J' | s.charAt(0) == 'N' & s.charAt(s.length()-1) == 'A');
        boolean result4 = predicate3.test("Number");
        System.out.println("predicate 5. " + result4);
        boolean result5 = predicate3.test("Julia");
        System.out.println("predicate 6. " + result5);
    }
}
