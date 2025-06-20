package day15;

public class Hero {
    //create a class, Hero
    //fields:name,life,power,attackSkill,defendSkill
    //methods:attackEnemy,defendEnemy,doTask
    //A.make all fields private, add setters for them
    //for the setter of life, value has to be in the range of 1 to 1000
    //for the setter of power, value has to be in the range of 1 to 500

    private String name ;
    private int life ;
    private int power ;
    private String attackSkill ;
    private String defendSkill ;

    //constructor:
    // 1.special method without the concept of return,same name as class
    // 2.call constructor by new
    // 3.every class has an invisible constructor in the beginning , public Hero(){}
    // 4.once your start to write constructor, then the invisible disappear
    // 5.the purpose of constructor is to initialize fields
    public Hero(String name,int life){
        System.out.println("-----------constructor of Hero--------------");
        this.name = name;
        this.life = life;
//        power = ??;
//        attackSkill = ??;
//        defendSkill = ??;
    }


    //right click -> generate -> getter and setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        //checking process
        if(life<1 || life>1000){
            throw new RuntimeException("life must be 1~1000");
        }

        this.life = life;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        //checking process
        if(power<1 || power>500){
            throw new RuntimeException("power must be 1~500");
        }
        //this:current instance
        this.power = power;
        //外面        参数
        //当field与参数同名时，通过this.去指代field
    }

    public String getAttackSkill() {
        return attackSkill;
    }

    public void setAttackSkill(String attackSkill) {
        this.attackSkill = attackSkill;
    }

    public String getDefendSkill() {
        return defendSkill;
    }

    public void setDefendSkill(String defendSkill) {
        this.defendSkill = defendSkill;
    }

    public void attackEnemy(){
        System.out.println(name + " use " + attackSkill + " hits the enemy for " + power + " damage." );
    }

    public void defendEnemy() {
        System.out.println(name + " blocked the attack using " + defendSkill + " HP remains " + life);
    }

    public void doTask(String taskName,int lifeGain) {
        life += lifeGain ;
        System.out.println(name + " finish " + taskName + ", gain " + lifeGain + " points of life, now life point is " + life );
    }
}
