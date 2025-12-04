import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ReverseArray {


    static void reverseUsingBuiltIn(){
        Integer[] arr = {1, 2, 3, 4, 5};

        Collections.reverse(Arrays.asList(arr));

        System.out.println("Reversed array (built-in): " + Arrays.toString(arr));

    }


    public static void main(String[] args){
        int [] arr = {1, 2, 3, 4, 5};
//
//        int start = 0;
//        int end = arr.length -1;
//        while(start < end){
//            int temp = arr[start];
//            arr[start] = arr[end];
//            arr[end] = temp;
//
//            start++;
//            end--;
//
//        }
//        for(int num : arr){
//            System.out.print(num + " ");
//        }

        int start = 0;
        int end = arr.length-1;
        while(start < end){
            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;
            start++;
            end--;
        }
        for(int num : arr){
            System.out.print(num + " ");
        }
        reverseUsingBuiltIn();
    }
}
