package HomeWork1;

public class PhoneNumber {
    public static String createNumber(int[] phone){
        StringBuilder string = new StringBuilder();
        for (int i = 0; i < phone.length; i++) {

            if (i==0){
                string.append("(");
            }
            else if (i == 3) {
                string.append(") ");
            } else if (i==6)
                string.append("-");
            string.append(phone[i]);
        }
        return string.toString();
    }
}
