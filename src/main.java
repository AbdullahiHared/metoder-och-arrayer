import java.util.Arrays;

public class main {
    static void skriv_ut_array (int[] array) {
        System.out.println(Arrays.toString(array));

    }

    static void antal_över_8(int[] array) {
        System.out.println("Tal som är över 8 i arrayen");
        for (int i = 0; i < array.length; i++) {
            if(array[i] > 8) {
                System.out.println(array[i]);
            }
        }
    }
    public static void main(String[] args) {
       int[] minArray = {1,2,3,4,5,6,8,9,10,11};
        skriv_ut_array(minArray);
        antal_över_8(minArray);
    }
}
