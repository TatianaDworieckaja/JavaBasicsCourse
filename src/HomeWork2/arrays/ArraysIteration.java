package HomeWork2.arrays;

import HomeWork2.utils.ArrayUtils;

public class ArraysIteration {
    public static void main(String[] args) {
        printAllFor();
        System.out.println();
        printAllDoWhile();
        System.out.println();
        printAllWhile();
        System.out.println();
        printAllForeach();
        System.out.println();
        printEverySecondFor();
        System.out.println();
        printEverySecondDoWhile();
        System.out.println();
        printEverySecondWhile();
        System.out.println();
        printEverySecondForeach();
        System.out.println();
        printReverseFor();
        System.out.println();
        printReverseDoWhile();
        System.out.println();
        printReverseWhile();
        System.out.println();
        printReverseForeach();
    }

    /*This method outputs all elements of array with 'for' cycle*/
        public static void printAllFor() {
        System.out.println("This method outputs all elements of array with 'for' cycle");
        int[]array = ArrayUtils.arrayFromConsole();
            for (int i = 0; i<array.length; i++) {
            System.out.print(array[i]+ " ");
            }
        }

    /*This method outputs all elements of array with 'do while' cycle*/
    public static void printAllDoWhile() {
        System.out.println("This method outputs all elements of array with 'do while' cycle");
        int[]array = ArrayUtils.arrayFromConsole();
        int i = 0;
        do {
            System.out.print(array[i]+ " ");
            i++;
        }
        while (i<array.length);
    }

    /*This method outputs all elements of array with 'while' cycle*/
    public static void printAllWhile() {
        System.out.println("This method outputs all elements of array with 'while' cycle");
        int[]array = ArrayUtils.arrayFromConsole();
        int i = 0;
        while (i<array.length){
            System.out.print(array[i]+ " ");
            i++;
        }
    }

    /*This method outputs all elements of array with 'foreach' cycle*/
    public static void printAllForeach() {
        System.out.println("This method outputs all elements of array with 'foreach' cycle");
        int[]array = ArrayUtils.arrayFromConsole();
        for (int element:array) {
            System.out.print(element + " ");
        }
    }

    /*This method outputs every second element of array with 'for' cycle*/

        public static void printEverySecondFor(){
        System.out.println("This method outputs every second element of array with 'for' cycle");
        int[]array = ArrayUtils.arrayFromConsole();
            for (int i = 1; i<array.length; i+=2) {
                System.out.print(array[i] + " ");
            }
        }

    /*This method outputs every second element of array with 'do while' cycle*/

    public static void printEverySecondDoWhile(){
        System.out.println("This method outputs every second element of array with 'do while' cycle");
        int[]array = ArrayUtils.arrayFromConsole();
        int i = 1;
        do {
            System.out.print(array[i] + " ");
            i+=2;
        } while (i<array.length);
    }

    /*This method outputs every second element of array with 'while' cycle*/

    public static void printEverySecondWhile(){
        System.out.println("This method outputs every second element of array with 'while' cycle");
        int[]array = ArrayUtils.arrayFromConsole();
        int i = 1;
        while (i<array.length){
        System.out.print(array[i] + " ");
            i+=2;
        }
    }


    /*This method outputs every second element of array with 'foreach' cycle*/

    public static void printEverySecondForeach(){
        System.out.println("This method outputs every second element of array with 'Foreach' cycle");
        int[]array = ArrayUtils.arrayFromConsole();
        int count = 1;

        for (int element:array){
             if (count % 2 == 0) {
                 System.out.print(element + " ");
             }
            count++;
        }
    }

/*This method allows to reverse order of elements of array and output them using 'for' cycle */

    public static void printReverseFor(){
        System.out.println("This method allows to reverse order of elements of array and output them using 'for' cycle");
        int[]array = ArrayUtils.arrayFromConsole();
        for (int i = array.length-1; i>=0; i--) {
            System.out.print(array[i] + " ");
        }
    }

    /*This method allows to reverse order of elements of array and output them using 'do while' cycle */

    public static void printReverseDoWhile(){
        System.out.println("This method allows to reverse order of elements of array and output them using 'do while' cycle");
        int[]array = ArrayUtils.arrayFromConsole();
        int i = array.length-1;
        do {
            System.out.print(array[i] + " ");
            i--;
        }while (i>=0);

    }

    /*This method allows to reverse order of elements of array and output them using 'while' cycle */

    public static void printReverseWhile() {
        System.out.println("This method allows to reverse order of elements of array and output them using 'while' cycle");
        int[] array = ArrayUtils.arrayFromConsole();
        int i = array.length - 1;
        while (i >= 0) {
            System.out.print(array[i] + " ");
            i--;
        }
    }


    /*This method allows to reverse order of elements of array and output them using 'foreach' cycle */

    public static void printReverseForeach() {
        System.out.println("This method allows to reverse order of elements of array and output them using 'foreach' cycle");
        int[] array = ArrayUtils.arrayFromConsole();
        int[] arrayFinal = new int[array.length];
        int i = array.length - 1;

        for (int element : array) {
            arrayFinal[i] = element;
            i--;
        }
        for (int element : arrayFinal) {
            System.out.print(element + " ");
        }
    }

 }




