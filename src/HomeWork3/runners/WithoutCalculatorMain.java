package HomeWork3.runners;

//method of primitive calculation
//4.1 + 15.0 * 7.0 + (28.0/5) * (28.0/5);


public class WithoutCalculatorMain {
    public static void main(String[] args) {

        double a  = 28.0 / 5;
        double c = a * a;
        double b = 15 * 7;
        double result = 4.1 + b + c;

        System.out.println(result);//140.45999999999998

    }
}
