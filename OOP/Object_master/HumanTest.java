public class HumanTest{


public static void main(String[] args)
{


Human h = new Human();

Human a = new Human();

h.attack(a);


System.out.println(a.getHealth());

Ninja ninja1 = new Ninja();
        Wizard wizard1 = new Wizard();
        Samurai samurai1 = new Samurai();
        ninja1.viewNinja();
        wizard1.viewWizard();
        samurai1.viewSamurai();

        ninja1.steal(wizard1);
        

        ninja1.viewNinja();
        wizard1.viewWizard();
        samurai1.viewSamurai();


}











}