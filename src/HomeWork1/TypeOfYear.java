//4.6 Определить високосный год или нет
package HomeWork1;


public class TypeOfYear {
    public static String typeOfYear(int year){
        boolean value = year%4 == 0;

        if(value){
            return "Этот год - високосный";
        }
        return "Этот год - невисокосный";
    }
}