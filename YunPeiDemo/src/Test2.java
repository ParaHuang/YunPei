public class Test2 {
    public static void main(String[] args) {
//        System.out.println(10>3);
//        System.out.println(10>=10);
//        System.out.println(5 < 25/4);

        //&& : both expression are true, then the final result is true
        System.out.println(true && true);       //true
        System.out.println(true && false);      //false
        System.out.println(false && true);      //false
        System.out.println(false && false);     //false

        //||: any expression is true, then the final result is true
        System.out.println(true || true);       //true
        System.out.println(true || false);      //true
        System.out.println(false || true);      //true
        System.out.println(false || false);     //false

        //!
        System.out.println(!true);              //false
        System.out.println(!false);              //true

        // &&   >   ||

        System.out.println(3+4>7 || 5*7%6==2 && 3+5>9-3);


    }
}
