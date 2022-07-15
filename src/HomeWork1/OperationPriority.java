package HomeWork1;

public class OperationPriority {
    public static void main(String[] args) {

        int x;
        x = 8;
        int y;
        y = 2;

        int a = 5 + 2/8;
        System.out.println(a);//по приоритету: сначала 2:8 = 0.25(в int сохраняется 0), затем 5+0=5.

        int b = (5 + 2) / 8;
        System.out.println(b);//по приоритету:сначала выполняется 5+2 = 7, затем 7:8 = 0,875. В переменную типа int сохраняется 0.

        int c = (5 + y++) / 8;
        System.out.println(c);//по приоритету: 2+1 = 3, 5+3 = 8, 8/8=1.

        int d = (5 + y++) / --x;
        System.out.println(d);//по приоритету:2+1=3, 5+3=8, 8-1 = 7, 8/7 = 1,14..В int записывается 1.

        int e = (5 * 2 >> y++) / --x;
        System.out.println(e);//по приоритету: 8+1 = 9, 5*2 = 10, 10>>9 = 0, 8-1=7, 0/7 = 0

        int f = (5 + 7 > 20 ? 68 : 22 * 2 >> y++) / --x;
        System.out.println(f);//по приоритету: y++ или 2+1 = 3, 5+7 = 12, 22*2 = 44, 2>>3 = 0, (12>20)?68(true):0(false) = 0, 8-1=7, 0/7=0 =

        //int g = (5 + 7 > 20 ? 68 >= 68 : 22 * 2 >> y++) / --x; ошибка компилляции, невозможно вычислить выражение, в котором boolean делится на int
       //System.out.println(g);

        boolean h = 6 - 2 > 3 && 12 * 12 <= 119;//4>3 (=true) && 144 <=119 (=false) В итоге false
        System.out.println(h);

        boolean i = true && false;
        System.out.println(i);// условное умножение true и false даёт false



    }
}
