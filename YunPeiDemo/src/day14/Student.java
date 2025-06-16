package day14;

public class Student {

    //fields:id,name,age,gender -- define as a student, what information it needs
    private int id;         //private:only accessible inside of current class
    private String name;
    private int age;
    private String gender;

    //2 operations for a variable
    //id = 12;                          -> set up a value   ->setter, setXxx:setId,setName,setAge,setGender
    //System.out.println(id); x=id;     -> get a value      ->getter, getXxx:getId,getName,getAge,getGender

    //id:>1000
    //name:没有要求
    //age:3~70
    //gender:male/female
    public void setId(int i){//>1000
        if(i<=1000){
            throw new RuntimeException("invalid id, id must be greater than 1000");
        }
        id = i;
    }
    public void setName(String n){
        name = n;
    }
    public void setAge(int a){//3~70
        //add a checking process
        if(a<3 || a>70){//错误数据
            //扔    炸弹
            throw new RuntimeException("invalid age, age must be 3~70");
        }
        age = a;
    }
    public void setGender(String g){
        gender = g;
    }



    //methods--define as a student, what it can do
    //study, takeExam
    public void study(){    //public:accessible everywhere
        System.out.println(name+" is studying");
    }
    public void takeExam(){
        System.out.println("this student is taking an exam, the id is "+id+",and age is "+age);
    }

}
