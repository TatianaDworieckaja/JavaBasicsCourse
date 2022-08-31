package HomeWork2.loops;

public class MultTable {

    public static String multTable() {
        StringBuilder builder = new StringBuilder();
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int result;
        for (int j = 0; j < 10; j++) {
            for (int i = 1; i < 5; i++) {
                result = array[i] * array[j];
                if (array[i] != 5) {
                    builder.append(array[i]).append(" * ").append(array[j]).append(" = ").append(result).append("\t");
                } else {
                    builder.append(array[i]).append(" * ").append(array[j]).append(" = ").append(result).append("\n");
                }
            }
        }
        builder.append("\n");
        for (int j = 0; j < 10; j++) {
            for (int i = 5; i < 10; i++) {
                result = array[i] * array[j];
                if (array[i] != 10) {
                    builder.append(array[i]).append(" * ").append(array[j]).append(" = ").append(result).append("\t");
                } else {
                    builder.append(array[i]).append(" * ").append(array[j]).append(" = ").append(result).append("\n");
                }
            }
        }
        return builder.toString();
    }
}