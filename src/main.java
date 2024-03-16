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


    static int hitta_tal(int[] array, int tal) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == tal) {
                return i; // Return index if number is found
            }
        }
        return -1; // Return -1 if number is not found
    }

    static void bytPlats (int array[], int element1, int element2 ) {
       int temp = array[element1];
       array[element1] = array[element2];
       array[element2] = temp;
    }

    public static void main(String[] args) {
       int[] minArray = {1,2,3,4,5,6,8,9,10,11};
        bytPlats(minArray, 0,3);
        skriv_ut_array(minArray);
    }
}
