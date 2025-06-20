package day15;

public class Exer1HeroMain {
    public static void main(String[] args) {
        Exer1Hero hero1 = new Exer1Hero() ;

        hero1.setName("Alex");
        hero1.setLife(500);
        hero1.setPower(50);
        hero1.setAttackSkill("xxxx");
        hero1.setDefendSkill("nnn");


        hero1.attackEnemy();
        hero1.defendEnemy();
        hero1.doTask("Find the gold",10);
        System.out.println();

//        F.after last step, directly print all the data about this hero, format as below：
//        Name：xxx
//        Life：xxx
//        Power：xxx
//        Attack Skill：xxx
//        Defend Skill：xxx
        System.out.println("Name:"+hero1.getName());
        System.out.println("Life:"+hero1.getLife());
        System.out.println("Power:"+hero1.getPower());
        System.out.println("Attack Skill:"+hero1.getAttackSkill());
        System.out.println("Defend Skill:"+hero1.getDefendSkill());
    }
}
