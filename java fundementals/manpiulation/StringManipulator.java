


public class StringManipulator{


String trimAndConcat(String x , String y){

 x = x.trim();
 y = y.trim();
String d = x+y;
return d;

    
}

Integer getIndexOrNull(String  str, char i ){

int u = str.indexOf(i);


return u ;


}

String concatSubstring(String str , int i , int j, String  y) {

{
String m = str.substring(i,j);
String r = m.concat(y);


return r;

}





}

public static void main(String[] args){

StringManipulator manipulator = new StringManipulator();
String str = manipulator.trimAndConcat("    Hello     ","     World    ");
System.out.println(str); // HelloWorld 


StringManipulator manipulator2 = new StringManipulator();

int t = manipulator2.getIndexOrNull("hello",'o');
System.out.println(t);


StringManipulator manipulator3 = new StringManipulator();
String word = manipulator3.concatSubstring("Hello", 1, 2, "world");
System.out.println(word);

}

}