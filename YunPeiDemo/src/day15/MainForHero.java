package day15;

public class MainForHero {
    public static void main(String[] args) {
        Hero hero1 = new Hero("Jackson",400);    //calling constructor
        //jackson
//        hero1.setName("Jackson");
//        hero1.setLife(400);
//        hero1.setPower(150);
//        hero1.setAttackSkill("hit");
//        hero1.setDefendSkill("shied");

        hero1.attackEnemy();
        hero1.defendEnemy();
        hero1.doTask("Find the gold",10);
        System.out.println();

        System.out.println("Name:"+hero1.getName());
        System.out.println("Life:"+hero1.getLife());
        System.out.println("Power:"+hero1.getPower());
        System.out.println("Attack Skill:"+hero1.getAttackSkill());
        System.out.println("Defend Skill:"+hero1.getDefendSkill());
        System.out.println();

        Hero hero2 = new Hero("Mike",900);    //Mike
        hero2.attackEnemy();
        hero2.defendEnemy();
    }
}
