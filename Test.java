// import PythagoreanTheorem;

public class Test {
    public static void main(String[] args) {
        PythagoreanTheorem pythagorean = new PythagoreanTheorem();
        FizzBuzz fb = new FizzBuzz();

        int legA = 4;
        int legB = 5;

        String fizzBuzz = fb.fizzBuzz(13);

        double hypotenuse = pythagorean.calculateHypotenuse(legA, legB);
        System.out.print(hypotenuse);
        System.out.println(fizzBuzz);
    }
}