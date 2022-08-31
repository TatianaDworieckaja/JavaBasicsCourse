//Проверка делимости одного числа на другое
package HomeWork1;

public class Division {
    public static String division(double num1, double num2){
        double result = num1%num2;
        boolean ifResult = result == 0;
        if (num2 == 0) {
            return "На ноль делить нельзя";
        }
        else if (ifResult) {
            return num1 + " делится на " + num2 + " без остатка. Результат = " + result;
        }
        else {
            return num1 + " не делится на " + num2 + " без остатка. Остаток: " + result;
        }
    }
}


