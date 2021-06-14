public class Human {

protected int strength;
protected int stealth;
protected int intelligence;
protected int health;


int defaultstrength=3;
int defaultstealth=3;
int defaultintelligence=3;
int defaulthealth=100;

public void setStrength(int strength){

this.strength=strength;



}

public void setStealth(int stealth){
this.stealth=stealth;

}
public void setIntelligence(int intelligence){
this.intelligence=intelligence;

}

public void setHealth(int health){
this.health=health;

}

public int getStrength(){

return strength;



}
public int getStealth(){

return stealth;



}

public int getIntelligence(){

return intelligence;



}
public int getHealth(){

return health;



}


public Human(){

this.strength=defaultstrength;
this.stealth=defaultstealth;
this.intelligence=defaultintelligence;
this.health=defaulthealth;








}

public void attack(Human h){

h.health=h.health-this.strength;





}










}