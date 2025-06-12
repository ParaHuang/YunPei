package day12;

import java.util.Arrays;

public class Main1 {
    public static void main(String[] args) {
//                   0  1  2  3  4  5
        int[] arr = {11,22,33,44,55,66};
        System.out.println(indexOf(arr,33));
        System.out.println(lastIndexOf(arr,33));
        System.out.println(unique(arr,33));
        System.out.println();

        System.out.println(indexOf(arr,22));
        System.out.println(lastIndexOf(arr,22));
        System.out.println(unique(arr,22));
        System.out.println();

        System.out.println(indexOf(arr,88));
        System.out.println(lastIndexOf(arr,88));
        System.out.println(unique(arr,88));
        System.out.println();

        int[] newArr = copyArray(arr,8,2);
        System.out.println(   Arrays.toString(newArr)    );
//        for (int x : newArr) {
//            System.out.println(x);
//        }


    }
    public static int[] copyArray(int[] originalArr, int newLength, int from){
        //copy new array
        int[] newArr = new int[newLength];
        //                      8
        for (int i = 0 ; i < Math.min(newLength,originalArr.length-from) ; i++){
            newArr[i] = originalArr[from + i];
            //
        }
        //oldArr           0    1     2     3      4      5
        //                11   22    33    44     55     66



        //newArr          0    1     2     3      4      5      6      7
        //                33   44    55  66       0      0      0      0

        //from index :2
        return newArr;
    }

    public static int indexOf(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return i;
            }
        }
        return -1;
    }
    public static int lastIndexOf(int[] arr, int value) {
        for (int i = arr.length-1; i >= 0; i--) {
            if (arr[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public static boolean unique(int[] arr, int value){
        int firstIndex = indexOf(arr,value);
        if(firstIndex == -1){
            return false;
        }
        int lastIndex = lastIndexOf(arr,value);
        return firstIndex==lastIndex;
//        if(firstIndex == lastIndex){
//            return true;
//        }else{
//            return false;
//        }
    }

}
