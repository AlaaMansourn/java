import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.*;

public class PuzzleJava{

public ArrayList<Integer> greater(int[] array){


 ArrayList <Integer>  arr = new ArrayList<Integer>();              
int sum=0;
for (int i=0;i<array.length;i++)
{
sum+=array[i];

if (array[i]>10){

arr.add(array[i]) ;


}




}
return arr;

}
public ArrayList<String> names(ArrayList<String> array){
Collections.shuffle(array);

  ArrayList<String>  arr = new ArrayList<String>();              
int sum=0;
for (int i=0;i<array.size();i++)
{
System.out.println(array.get(i));

if (array.get(i).length()>5){

arr.add(array.get(i)) ;


}




 }
 
 System.out.println(arr.size());
return arr;


}

public void gchar(){

ArrayList<Character> list = new ArrayList<Character>();
for(int i=97;i<122;i++)
{
char c = (char)i;


list.add(c);



}

Collections.shuffle(list);
char l=list.get(1);
if(l=='i' || l=='e' || l=='o'||l=='u'){


    System.out.println("hiiiiiiiiiiii");
}
}


public ArrayList<Integer> garr(){

ArrayList<Integer> list = new ArrayList<Integer>();
for(int i=0;i<10;i++)
{

    
    Random r = new Random();
list.add(r.nextInt(45)+55);


}
Collections.sort(list);






return list;

}


public String gstring(){

String str ="";
for(int i=0;i<5;i++){


Random r = new Random();
 
char c= (char) (r.nextInt(25)+97);
str+=c;



}


return str;





}


public ArrayList<String> g10string(){

 ArrayList<String>  arr = new ArrayList<String>();
for(int i=0;i<10;i++){
String str ="";
for(int j=0;j<5;j++){


Random r = new Random();
 
char c= (char) (r.nextInt(25)+97);
str+=c;




}


 arr.add(str);




}
return arr;
}
public static void main(String[]args){

// int [] ar = { 3,5,1,2,7,9,8,13,25,32};

// PuzzleJava p = new PuzzleJava();
// ArrayList<Integer> p1=p.greater(ar);


// ArrayList<String> ar1= new ArrayList<String>();
// ar1.add("Nancy");
// ar1.add("Jinichi");
// ar1.add("Fujibayashi");
// ar1.add("Momochi");
// ar1.add("Ishikawa");

// PuzzleJava pz = new PuzzleJava();
// ArrayList<String> pz1=pz.names(ar1);

// PuzzleJava pz1 = new PuzzleJava();
//  pz1.gchar();

// PuzzleJava ga = new PuzzleJava();
// System.out.println(ga.garr());

// PuzzleJava gt = new PuzzleJava();
//  System.out.println(gt.gstring());

PuzzleJava gm = new PuzzleJava();
  System.out.println(gm.g10string());




}








}