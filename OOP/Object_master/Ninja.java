public class Ninja extends Human{

int stealth;


int defaultstealth=3;

public Ninja(){


    this.stealth=defaultstealth;
}


public void steal(Human h){
h.health=h.health-this.stealth;
this.health=this.health+this.stealth;


}

public void runAway(){







    this.health=this.health-10;
}



}