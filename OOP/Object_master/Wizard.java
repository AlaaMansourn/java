public class Wizard extends Human{




int defaulthealth=50;
int defaultintelligence=8;

public Wizard(){

this.health=defaulthealth;
this.intelligence=defaultintelligence;




}



public void heal(Human h){

    h.health=h.health +this.intelligence;


}

public void fireball(Human h){


    h.health=h.health-3*this.intelligence;

}


    
}

    