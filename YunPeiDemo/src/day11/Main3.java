package day11;

public class Main3 {
    public static void main(String[] args) {
        int[] arr = {11,22,33,44,55,66};
        boolean result = contains(arr,22);
        System.out.println(result);

    }

    //take in 2 parameter
    //see if the value exists in this arrary
    public static boolean contains(int[] arr, int value){
        for(int a:arr){
            if(a==value){
                return true;
            }
        }
        return false;//不存在
    }

    //1.define a method
    //take in 2 parameters. one is an int array, the other one int an int value
    //return the first display of value in this array(返回这个value第一次在array中出现的位置)
    //return -1 if this value doesn't exist in this array
    //param1    {11,22,33,44,22,66}
    //param2    33
    //return    2

    //param1    {11,22,33,44,22,66}
    //param2    22
    //return    1

    //param1    {11,22,33,44,22,66}
    //param2    88
    //return    -1

    //2.define a method
    //take in 2 parameters. one is an int array, the other one int an int value
    //return the last display of value in this array(返回这个value最后一次在array中出现的位置)
    //return -1 if this value doesn't exist in this array
    //param1    {11,22,33,44,22,66}
    //param2    33
    //return    2

    //param1    {11,22,33,44,22,66}
    //param2    22
    //return    4

    //param1    {11,22,33,44,22,66}
    //param2    88
    //return    -1

    //3.define a method
    //take in 2 parameters. one is an int array, the other one int an int value
    //return the evident if this value is unique in this array
    //return false if this value is not unique or doesn't exist in this array
    //param1    {11,22,33,44,22,66}
    //param2    33
    //return    true

    //param1    {11,22,33,44,22,66}
    //param2    22
    //return    false

    //param1    {11,22,33,44,22,66}
    //param2    88
    //return    false

    //4.define a method
    //take in 2 parameters. one is an int array, the other one int an int value
    //return how many times this value exists in this array
    //param1    {11,22,33,44,22,66}
    //param2    33
    //return    1

    //param1    {11,22,33,44,22,66}
    //param2    22
    //return    2

    //param1    {11,22,33,44,22,66}
    //param2    88
    //return    0
}
