public class Project{

private String name;
private String description;



public void setName(String name){
this.name=name;

}

public String getName(){



return name;

}

public void setDescription(String description){


this.description=description;



}

public String getDescription(){


return description;


}

public String elevatorPitch()
{


return String.format("%s  %s",name,description);






}

public Project(){


this("buliding","building a project");


}

public Project(String name) {

this.name=name;


}

public Project(String name, String description) {

this.name=name;
this.description=description;


}




}