import java.util.Arrays;
public class MyMain {

    // Shuffles an array, using the perfect shuffle algorithm
    public static int[] perfectShuffle(int[] arr) { 
        int spltdeck = (arr.length)/2;
        int [] ynk = new int[arr.length];
        int c1 = 0;
        int c2 = 0;
        for(; c1 < spltdeck; c1++){
            ynk[c2] = arr[c1];
            c2 += 2;
        }
        c2 = 1;
        for(; c1 < arr.length; c1++){
            ynk[c2] = arr[c1];
            c2 += 2;
        }
        for(; c1 < arr.length; c1++){
            arr[c1] = ynk[c1];
        }

        

        return ynk;

    }

    // Shuffles an array, using the selection shuffle algorithm
    public static int[] selectionShuffle(int[] arr) { 
        for(int k = 0; k < arr.length; k++){
            int jkl = (int) (Math.random() * 10);
            int gba = arr[k];
            arr[k] = arr[jkl];
            arr[jkl] = gba;
        }
        return arr;
    }


    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,21,22,23,24,25};
        System.out.println(Arrays.toString(perfectShuffle(arr)));
        System.out.println(Arrays.toString(selectionShuffle(arr)));
    }
}
