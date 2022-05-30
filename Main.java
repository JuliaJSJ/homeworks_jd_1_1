public class Main {
    static Calculator calc = Calculator.instance.get();

    public static void main(String args[]) {
        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1,1);
        int c = calc.divide.apply(a, b);

        calc.println.accept(c);
    }
}
