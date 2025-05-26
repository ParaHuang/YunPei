package day4;

public class Test1 {
    public static void main(String[] args) {
        int score = 64;
        //0~100正确范围，进一步判断
            //<60       不及格
            //60～69     及格
            //70～79     良好
            //>=80      优秀

        if(score>=0 && score<=100){//0～100

            //进一步判断(嵌套)
            if(score<60){
                System.out.println("不及格");
            }else if(score<=69){
                System.out.println("及格");
            }else if(score<=79){
                System.out.println("良好");
            }else{
                System.out.println("优秀");
            }

//            if(score>=80){
//                System.out.println("优秀");
//            }else if(score>=70 && score<=79){
//                System.out.println("良好");
//            }

        }else{
            //不在正确范围：“无效成绩”
            System.out.println("无效成绩");
        }


    }
}
