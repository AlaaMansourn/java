public class  Samurai extends Human{


private  static int SamuraiNum=0;
private static int defaulthealth=200;

public Samurai()
{

this.health()=defaulthealth;
Samurai.SamuraiNum+=1;





}

public void deathBlow(Human h){


h.health=0;

this.health=(this.health /2);
}

public void meditate(){





    this.health=this.health*2;




}


public static int howMany(){


return Samurai.SamuraiNum;



}




}






