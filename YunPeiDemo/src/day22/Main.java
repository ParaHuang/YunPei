package day22;

public class Main {
    public static void main(String[] args) {
        PS5 ps5 = new PS5();
        Nintendo nintendo = new Nintendo();
        XBox xbox = new XBox();

        Polaroid polaroid = new Polaroid();
        GoPro goPro = new GoPro();
        DigitalCamera digitalCamera = new DigitalCamera();

        YoungPeople youngPeople = new YoungPeople();

        youngPeople.haveFun(ps5);
        youngPeople.haveFun(nintendo);
        youngPeople.haveFun(xbox);
        System.out.println();

        youngPeople.recordGoodMoments(polaroid);
        youngPeople.recordGoodMoments(goPro);
        youngPeople.recordGoodMoments(digitalCamera);

        System.out.println();
        CellPhone cellPhone = new CellPhone();      //1 thing in different ways
        youngPeople.haveFun(cellPhone);
        youngPeople.recordGoodMoments(cellPhone);

    }
}
//年轻人->找乐子，
class YoungPeople{
    public void haveFun(GameMachine gameMachine){
        System.out.println("young people want to have fun");
        gameMachine.playGames();//polymorphism. all we know is gameMachine playGames, but it works in different ways
    }

    public void recordGoodMoments(Camera camera){
        System.out.println("young people want to record good moments");
        camera.takePicture();
    }
}

//游戏机->打游戏
interface GameMachine{
    void playGames();
}

class PS5 implements GameMachine{
    @Override
    public void playGames() {
        System.out.println("buy a game CD，connect with TV，there we go!");
    }
}

class Nintendo implements GameMachine{
    @Override
    public void playGames() {
        System.out.println("turn it on，choose a game，playing alone，so nice");
    }
}

class XBox implements GameMachine{
    @Override
    public void playGames() {
        System.out.println("connect with TV,choose a game from game store, then play");
    }
}

//照相机->照相
interface Camera{
    void takePicture();
}
class Polaroid implements Camera{
    @Override
    public void takePicture() {
        System.out.println("press the shutter, get an instant photo");
    }
}
class GoPro implements Camera{
    @Override
    public void takePicture() {
        System.out.println("diving into ocean,let's memorize this beautiful world");
    }
}
class DigitalCamera implements Camera{
    @Override
    public void takePicture() {
        System.out.println("press the shutter,get an digital picture");
    }
}

class CellPhone implements GameMachine, Camera{

    @Override
    public void playGames() {
        System.out.println("take my phone out, login, play some online games with my teammates");
    }

    @Override
    public void takePicture() {
        System.out.println("take my phone out, take a picture that I can watch it everyday");
    }
}

//single extends
class A{}       //假装是游戏机
class B{}       //假装是相机
class C extends A{} //假装是手机,它只能extends游戏机或相机，不能同时extends他们

//multiple implements
interface D{}   //假装是游戏机
interface E{}   //假装是相机
class F implements D,E{}       //假装是手机










