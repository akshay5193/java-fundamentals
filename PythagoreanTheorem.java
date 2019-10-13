import java.lang.Math;

public class PythagoreanTheorem {
    public double calculateHypotenuse(int legA, int legB) {

        double hypotenuse;

        hypotenuse = Math.sqrt((legA * legA) + (legB * legB));

        return hypotenuse;
    }
}