package day11;

public class Main1 {
    public static void main(String[] args) {
        int[] orginalArr = {11,22,33,44,55,66};
        int[] arr1 = copyArray(orginalArr,8);
        for(int e:arr1){
            System.out.println(e);
        }
        System.out.println();

        int[] arr2 = copyArray(orginalArr,2);
        for(int e:arr2){
            System.out.println(e);
        }




        //for-each loop, enhanced for loop
        /*
        for(type n:array){
            n is every element in this array 1 by 1
        }
        */

        //for-i loop    -> care about index
        /*
        for(int i=0 ; i<arr.length ; i++){
            arr[i] is every element in this array 1 by 1
        }
         */
    }


    public static int[] copyArray(int[] originalArr , int newLength){
        //create a new array
        int[] newArray = new int[newLength];        //default value
        int len = Math.min(newLength, originalArr.length);      //谁小就用谁
//        int len = newLength;
//        if(originalArr.length < newLength){
//            len = originalArr.length;
//        }
        for(int i=0 ; i<len ; i++){
            newArray[i] = originalArr[i];
        }

        return newArray;
    }
}
