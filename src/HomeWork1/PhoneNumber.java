package HomeWork1;

public class PhoneNumber {
    public static String createNumber(int phone[]){
        String string = "";
        for (int i = 0; i < phone.length; i++) {

            if (i==0){
                string = string + "(";
            }
            else if (i == 3) {
                string = string + ") ";
            } else if (i==6)
                string = string + "-";
            string = string + phone[i];
        }
        return string;
    }

    public static void main(String[] args) {
        int phone[] = {1, 2, 3, 4, 5 ,6 ,7, 8, 9, 0};
        System.out.println(createNumber(phone));
    }
}
