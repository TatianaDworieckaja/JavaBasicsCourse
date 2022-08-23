package HomeWork5.methods;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class RndData {

   private final static String cyrillicRow = "бвгдеёжзийклмнопростуфхцщшъьэыюя";
   private  final static String latinRow = "abcdefghijklmnopqrstuvwxyz";
   private final static String symbols = "1234567890!@#$%^&*?><";
   private final static String allInOne = cyrillicRow + symbols  + latinRow;
   private final static String[] persons = {"Tanya", "Anya", "Alice", "Milena", "Aleksandra"};
   private final static String[] animals = {"Barsik", "Vaska", "Bimka", "Bobik", "Sharik"};

    /*@return random string built of random double values*/

    public static String getAnyString(){
        Random rnd = new Random();
        return String.valueOf(rnd.nextDouble());
    }


    /* @return random name built of
    @param row which is  cyrillic or latin symbols*/

    public static String getSymbol(String row){
        Random rnd = new Random();
        char[] name = new char[rnd.nextInt(10)+1];
        for (int j = 0; j < name.length; j++) {
            int randomIndex = rnd.nextInt(row.length());
            char a = row.charAt(randomIndex);
            name[j] = a;
        }
        return String.valueOf(name);
    }

    /* @return random name consisting of cyrillic symbols*/
    public static String getCyrillicName() {
        return getSymbol(cyrillicRow);
    }

    /* @return random name consisting of latin symbols*/
    public static String getLatinName() {
        return getSymbol(latinRow);
    }

    /* generate a real Pet name from the "library" 'animals'
    @return random real name from library */

   public static String getRealPet(){
       Random rnd = new Random();
       int randomIndex = rnd.nextInt(animals.length);
       return animals[randomIndex];
        }

    /* generate a real Person name from the "library" 'persons'
    @return random real name from library */

    public static String getRealPerson(){
        Random rnd = new Random();
        int randomIndex = rnd.nextInt(persons.length);
        return persons[randomIndex];
    }
    /*create random password with length between 5 and 10 symbols
    @param int min - min. password length
    @param int max - max. password length
    * @return p - password in String format */
    public static String randomPassword(int min, int max){
        Random rnd = new Random();
        int randomLength = ThreadLocalRandom.current().nextInt(min, max + 1);
        char[] p = new char[randomLength];
        for (int j = 0; j < p.length; j++) {
            //aLLinOne - is a string containing different symbols,
            // needed to build random password
            int randomIndex = rnd.nextInt(allInOne.length());
            char a = allInOne.charAt(randomIndex);
            p[j] = a;
        }
        return String.valueOf(p);
    }


    /*@return random age from 1 to 15 inclusively*/

    public static int randomAge(int max) {
        Random rnd = new Random();
        return rnd.nextInt(max) + 1;
    }

}
