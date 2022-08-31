

package HomeWork2.loops;
/** Эта программа перемноживает  числа от 1 до числа (включительно) введенного через аргумент к исполняемой программе. Используя только цикл
 * @param x - border number
@return count*/

public class Cycles_1_1_1 {
    public static long multiplication(int x) {
        long count = 0;
        if (x == 0){
            return count;
        }
        count++;
        for (int i = 1; i <= x; i++) {
            count = count * i;
        }
        return count;
    }
}

