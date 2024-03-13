import java.util.Arrays;

public class main {
    static void skriv_ut_array (int[] array) {
        System.out.println(Arrays.toString(array));
    }
    public static void main(String[] args) {
       int[] minArray = {1,2,3,4,5,6,8,9,10,11};

        for (int i = 0; i < minArray.length; i++) {
            System.out.println(minArray[i]);
        }

        skriv_ut_array(minArray);

    }
}
