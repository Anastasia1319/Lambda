public class PrintableLambda {
    public static void main(String[] args) {
        //�������� ������ ��������� ��� ���������� Printable,
        // ������� �������� ���� ����� void print().
        Printable print = ()-> System.out.println("This is the Lambda of Printable");
        print.print();

        //���������� ����� ������������ Printable ��������� ������ �� ����������� �����.
        Printable printable = PrintableStatic::printStatic;
        printable.print();
    }
}
