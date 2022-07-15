//4.2 Среди трёх чисел найти среднее
package HomeWork1;

import java.util.Scanner;

public class CalcAverage {
    public static void main (String[] args){
        Scanner console = new Scanner(System.in);
        int result;

        System.out.println("Provide three numbers to find an average");
        System.out.print("Number 1:");
        int num1 = console.nextInt();

        System.out.print("Number 2:");
        int num2 = console.nextInt();

        System.out.print("Number 3:");
        int num3 = console.nextInt();


        if (num1>num2 && num1<num3){
          result = num1;
        }else if (num1>num3 && num1<num2){
            result = num1;
        }
        else if (num2>num1 && num2<num3) {
            result = num2;
        }else if (num2>num3 && num2<num1){
            result = num2;
        }else {
            result = num3;
        }
        System.out.printf("The average number is " + result);
    }
}
