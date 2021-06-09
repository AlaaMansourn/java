import java.lang.Math;

public class Pythagorean {
    public double calculateHypotenuse(int legA, int legB) {
       int a = legA*legA;
       int b =legB*legB;
        int c = a*b;
       double p = Math.sqrt(c);
       return p;
    }
}


