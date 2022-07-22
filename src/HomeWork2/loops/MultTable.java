package HomeWork2.loops;

public class MultTable {
    public static void main(String[] args) {
        /*for(int i = 1; i<=10; i++) {
            for (int j = 2; j <= 5; j++) {
                System.out.print(j + " x " + i + " = " + (j * i) + "\t");
            }
            System.out.print("\n");
        }
        System.out.print("\n");

        for(int i = 1; i<=10; i++) {
                for (int j = 6; j <= 9; j++){
                    System.out.print(j + " x " + i + " = " + (j * i) + "\t");
                }
                System.out.print("\n");

        }*/
        tableRow(2, 5);
        System.out.println();
        tableRow(6, 9);
    }

    //output of multiplication table
    //@param a  - start column number
    //@param b  - end column number
    public static void tableRow (int a, int b) {
        for (int i = 1; i <= 10; i++) {
            for (int j = a; j <= b; j++) {
                System.out.print(j + " x " + i + " = " + (j * i) + "\t");
            }
            System.out.print("\n");
        }
    }
}
