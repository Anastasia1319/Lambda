import java.util.function.Function;

public class FunctionLambda {
    public static void main(String[] args) {
        //�������� ������ ���������, ������� ��������� �� ���� ����� � ���������� ��������
        // �������������� �����, �������������� ����� ��� ������.
        // ���������� �������������� ��������� Function.
        Function<Integer, String> function = number -> {
            if (number >0) {
                return "������������� �����";
            } else if (number <0) {
                return "������������� �����";
            } else {
                return "����";
            }
        };
        String str = function.apply(18);
        System.out.println("Function 1. " + str);
        String str1 = function.apply(-8);
        System.out.println("Function 2. " + str1);
    }
}
