
import java.util.ArrayList;
public class BasicJava{


public void print(){


for(int i=1;i<=255;i++){

System.out.println(i);
}

}

public void printodd(){


for(int i=1;i<=255;i++){

if(i%2==1)
System.out.println(i);
}

}


public void printsum(){
int sum =0;

for(int i=0;i<=255;i++){

sum+=i;

System.out.println("New number: " + i +"  sum: "+sum );
}

}

public void iterating(int x[]){


for(int i=0;i<x.length;i++){



System.out.println(x[i]);
}

}

public void max(int x[]){

int max=x[0];
for(int i=0;i<x.length;i++){
if(x[i]> max){

max=x[i];
}
}

System.out.println(max);
}


public void average(int x[]){

int sum=0;
double avg=0;
for(int i=0;i<x.length;i++){
sum+=x[i];


}


avg=sum/x.length;

System.out.println(avg);



}


public ArrayList<Integer> arrayofodd(){

ArrayList<Integer> ar = new ArrayList<Integer>();
for(int i=0;i<=255;i++){

if(i%2==1)
ar.add(i);
}
return ar;
}


public int greater(int x[], int y){

int count = 0;

for(int i=0;i<x.length;i++){
if(x[i]> y){

count++;
}
}

return count;
}

public void squaring(int x[]){


for(int i=0;i<x.length;i++){

x[i]=x[i]*x[i];


}

}

public void elnegative(int x[])

{


for(int i=0;i<x.length;i++){

if(x[i]<0)
x[i]=0;

}

}

public ArrayList<Object> minmaxavg(int x[]){

ArrayList <Object> ma =new ArrayList<Object>();
int sum = 0;
int min=x[0];
int max=x[0];

double avg;
for (int i =0;i<x.length;i++){

if(x[i]<min){

    min=x[i];



}
if(x[i]>max){

    max=x[i];

}

sum+=x[i];


}
avg = sum/x.length;
ma.add(max);
ma.add(min);
ma.add(avg);

return ma;

}

public void shift(int x[])

{


for(int i=1;i<x.length;i++){

x[i-1]=x[i];


}
x[x.length]=0;

}



public static void main(String [] args){

// BasicJava b = new BasicJava();
// b.print();

// BasicJava b1 = new BasicJava();
// b1.printodd();


// BasicJava b2 = new BasicJava();
// b2.printsum();

// BasicJava b3 = new BasicJava();

// int c[] ={1,2,3,4,5};
//  b3.iterating(c);

// BasicJava b4 = new BasicJava();
//  int m[] ={1,2,3,4,-5};
//   b4.max(m);

// BasicJava b5 = new BasicJava();
//  int m[] ={1,2,3,4,20};
//   b5.average(m);

// BasicJava b6 = new BasicJava();
// ArrayList<Integer> f = b6.arrayofodd();
// System.out.println(f);



// BasicJava b6 = new BasicJava();
// int x[] = {1,2,6,7,11,12};
// int y = 7;
// int e = b6.greater(x,y);
// System.out.println(e);

// BasicJava b7 = new BasicJava();
// int o[] = {1,2,6,7,11,1};

// b7.squaring(o);
// // travese the array to check if it has really sguared
// for (int i =0;i<=o.length;i++)
// {
// System.out.println(o[i]);

// }


// BasicJava b7 = new BasicJava();
// int t[] = {1,-2,6,-7,11,1};

// b7.elnegative(t);
// // travese the array to check if it has really eliminated
// for (int i =0;i<=t.length;i++)
// {
// System.out.println(t[i]);

// }
// }

    // BasicJava b8 = new BasicJava();
    // int ta[] = {1,-2,6,-7,11,1};

    // ArrayList<Object> s = b8.minmaxavg(ta);

    // for (int i =0;i<s.size();i++)
    // {
    // System.out.println(ta[i]);

    // }

    BasicJava b9 = new BasicJava();

    int ts[]={1,-2,6,-7,11,1};

    b9.shift(ts);
    for (int i =0;i<ts.length;i++)
    {
    System.out.println(ts[i]);

    }


}




}