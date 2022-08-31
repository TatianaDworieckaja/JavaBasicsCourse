//1. Побитовые операции:
package HomeWork1;

import java.util.Scanner;

public class BitOperations {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the first number: ");
        int num1 = scanner.nextInt();
        // e.g. 232 in binary system = 11101000

        System.out.print("Input the second number: ");
        int num2 = scanner.nextInt();
        //e.g. 254 in binary system = 11111110

        int andOperationResult = num1 & num2;
        //11101000 = 232
        int orOperationResult = num1 | num2;
        //11111110 = 254

        System.out.println("The result of 'AND' operation is:" + andOperationResult);
        System.out.println("The result of 'OR' operation is:" + orOperationResult);







    }
}
