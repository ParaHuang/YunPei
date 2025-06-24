package day16;

public class CarMain {
    public static void main(String[] args) {
        Car oldJunker = new Car("Ford ", "Pinto ", 1972, 17.5, 132480, 12, 8);
        System.out.println(oldJunker);
        oldJunker.drive(5);
        System.out.println(oldJunker.toString());
        oldJunker.fillTank(1);

        oldJunker.getFuelRemaining();
        System.out.println(oldJunker.getFuelRemaining());
        System.out.println(oldJunker.toString());

        oldJunker.test1();
        oldJunker.test1(20);
        oldJunker.test1("whatever");
        oldJunker.test1(33,"hello");
        oldJunker.test1("lalallalala",100);

//        Car car1 = new Car("Ford");   //Ford
//        Car car2 = new Car("VW");   //VW
//        Car car3 = new Car("XiaoMi");   //XiaoMi

        Car car1 = new Car();
        //后续通过setters去设置数据
        Car car2 = new Car("VW");
        System.out.println(car1);
        System.out.println(car2);

    }
}




