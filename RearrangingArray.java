import java.util.Arrays;

public class RearrangingArray {
    public static void main(String[] args) {

        Integer[] arrayA = {2, 2, 3, 5, 4, 6, 2, 1, 3, 6, 4};
        put4NextTo3(arrayA);
    }

    public static void put4NextTo3(Integer[] arrayA) {
        Integer tempStore;
        Integer number4Location = 0;
        for (int i = 0; i < arrayA.length; i++) {
            if (arrayA[i] == 3) {
                while (arrayA[number4Location] != 4) {
                    number4Location++;
                }
                tempStore = arrayA[i + 1];
                arrayA[i + 1] = 4;
                arrayA[number4Location] = tempStore;
            }
        }
         System.out.println(Arrays.toString(arrayA));
    }
}
