public class ProjectTest{


public static void main(String[]args){



 Project p = new Project("test");

 System.out.println(p.elevatorPitch());

Project p1= new Project();
System.out.println(p1.elevatorPitch());


Project p2= new Project("now","alaa");
System.out.println(p2.elevatorPitch());


Project p3= new Project("now","alaa");
p3.setDescription("edit");
System.out.println(p3.elevatorPitch());





}








}