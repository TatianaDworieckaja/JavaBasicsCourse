package HomeWork1;

public class MathClass {
    public static void main(String[] args) {

        //abs() значение по модулю
        System.out.println(Math.abs(-543));//543
        System.out.println(Math.abs(-1654L));//1654

        //Math.round() - округлим число до ближайшего целого
        System.out.println(Math.round(2.123456F)); //round(float a) = 2
        System.out.println(Math.round(3.59345678910D)); //round(double a) =4

        //Math.max  - сравним и выведем большее число
        System.out.println(Math.max(12.123456f, 2.123456f));//12.123456

        // Math.random - сгенерируем и выведем на экран рандомное число от 0 до 100
        double x = Math.random() * 100;
        System.out.println(x);//74.6359759137533

        //Полученное значение возведем во вторую степень с помощью Math.pow
        double x1 = Math.pow(x, 2);
        System.out.println(x1);//5570.528900598362

        //Представим, что полученное значение x1 - это радианы, которые мы хотим перевести в градусы с пом. Math.toDegrees()
        double x2 = Math.toDegrees(x1);
        System.out.println(x2);//319167.7956599366

        //и заокруглим x2
        System.out.println(Math.round(x2));//319168

        //Использование числа PI
        double numPI = Math.PI;
        System.out.println(numPI); //3.141592653589793

        //И сравним его с другим числом - найдём, какое меньше с пом. Math.min()
        System.out.println(Math.min(numPI, 3.14));//3.14

        //Округлим PI в меньшую сторону до ближайшего целого значения
        System.out.println(Math.floor(numPI));//3.0
    }
}


