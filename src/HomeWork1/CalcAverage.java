//4.2 Среди трёх чисел найти среднее
package HomeWork1;

public class CalcAverage {

    public static int calcAverage(int num1, int num2, int num3) {
        if (num1 > num2 && num1 < num3 || num1 > num3 && num1 < num2) {
            return num1;
        }
        else if (num2 > num1 && num2 < num3 || num2 > num3 && num2 < num1) {
                return num2;
            } else {
                return num3;
            }
    }
}



