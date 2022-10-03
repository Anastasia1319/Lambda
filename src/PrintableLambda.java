public class PrintableLambda {
    public static void main(String[] args) {
        //Написать лямбда выражение для интерфейса Printable,
        // который содержит один метод void print().
        Printable print = ()-> System.out.println("This is the Lambda of Printable");
        print.print();

        //Переделать класс использующий Printable используя ссылку на статический метод.
        Printable printable = PrintableStatic::printStatic;
        printable.print();
    }
}
