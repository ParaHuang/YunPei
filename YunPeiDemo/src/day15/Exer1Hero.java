package day15;

public class Exer1Hero {
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

    public void setName(String n) {
        name = n ;
    }

    public void setLife(int l) {
        if(l < 1 || l > 1000){ // write wrong condition
            throw new RuntimeException("The life is " + l + "," + "life must be 1~1000");
        }
        life = l ; //l >=1 && l <=1000
    }

    public void setPower(int p) {
        if(p < 1 || p > 500){
            throw new RuntimeException("The power is " + p + "," + "power must be 1~500");
        }
        power = p ;
    }

    public void setAttackSkill(String attS) {
        attackSkill = attS ;
    }

    public void setDefendSkill(String deS) {
        defendSkill = deS ;
    }
    //getters for every field
    public String getName(){
        return name;
    }
    public int getLife(){
        return life;
    }
    public int getPower(){
        return power;
    }
    public String getAttackSkill(){
        return attackSkill;
    }
    public String getDefendSkill(){
        return defendSkill;
    }

    //method : attackEnemy,defendEnemy,doTask
   // B.attackEnemy(no parameter no return），inside of method,print：
    // ? use ? hits the enemy for ？ damage.
    //（first ？as attackSkill，second ？as power）
    public void attackEnemy(){
        System.out.println(name + " use " + attackSkill + " hits the enemy for " + power + " damage." );
    }

    //C.defendEnemy(no parameter no return），print：
    // ? blocked the attack using ? ,HP remains ?.
    //（first ？as  name，second ？as defendSkill，third ？ as life）
    public void defendEnemy() {
        System.out.println(name + " blocked the attack using " + defendSkill + " HP remains " + life);
    }

    //D.doTask（with parameter, no return）
    //parameter：taskName, lifeGain
    //operations：increase life with lifeGain，then print “？finsish ？，gain ？points of life，now life point is ？“
    // (first ？as  name，second ？as taskName,，third ？ as lifeGain , last ? as life）
    public void doTask(String taskName,int lifeGain) {
        life += lifeGain ;
        System.out.println(name + " finish " + taskName + ", gain " + lifeGain + " points of life, now life point is " + life );
    }
}
