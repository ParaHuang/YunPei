package day21;

public class Main {
    public static void main(String[] args) {
        /*
        Chinese c = new Chinese();
        c.eat();            //call the eat from Chinese
        c.sleep();
        System.out.println();

        American a = new American();
        a.eat();
        a.sleep();

         */
        Chinese chinese = new Chinese();
        American american = new American();
        Indian indian = new Indian();
        Japanese japanese = new Japanese();

        Company company = new Company();

        company.party(chinese);
        System.out.println();
        company.party(american);
        System.out.println();
        company.party(indian);
        System.out.println();
        company.party(japanese);



//        Random random = new Random();
//        random.nextInt
    }
}

//polymorphism:1 thing shows in different way
//2 precondition:
//a. reference type change
//b. override