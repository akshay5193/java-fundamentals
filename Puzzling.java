import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.*;

//import com.sun.glass.ui.Size;
//import com.sun.org.apache.xpath.internal.operations.String;

public class Puzzling {

    private ArrayList<Integer> printSum(int[] array) {
        int sum = 0;
        ArrayList<Integer> myList = new ArrayList<Integer>();

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            if (array[i] > 10) {
                myList.add(array[i]);
            }
        }
        System.out.print(sum);
        return myList;
    }

    private String[] printNames(String[] array) {
        ArrayList<String> myList = new ArrayList<String>();
        String[] newArray = new String[10];
        int z = 0;

        for (int i = 0; i < array.length; i++) {
            myList.add(array[i]);
            String s = array[i];
            if (s.length() >= 5) {
                newArray[z] = array[i];
                z++;
            }
            System.out.println(s.length());
        }
        Collections.shuffle(myList);
        System.out.print("Shuffled List: \n");
        System.out.print(myList);
        System.out.print("\nWords with Length Greater than 5: \n");

        return newArray;
    }

    private void alphabetsPlay(char[] array) {
        ArrayList<Character> shuffledList = new ArrayList<Character>();
        ArrayList<Character> vowels = new ArrayList<Character>();

        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');

        for (int i = 0; i < array.length; i++) {
            shuffledList.add(array[i]);
        }

        Collections.shuffle(shuffledList);
        System.out.print("\nThe Shuffled List is : \n");
        System.out.print(shuffledList);

        System.out.print("\nFirst Element of Shuffled List : \n");
        System.out.print(shuffledList.get(0));
        if (vowels.contains(shuffledList.get(0))) {
            System.out.println("\nThe first element was a VOWEL!!!\n");
        }

        System.out.print("\nLast Element of Shuffled List : \n");
        System.out.print(shuffledList.get(shuffledList.size() - 1));
    }

    private int[] randomIntegerGenerator(int low, int high) {
        Random r = new Random();
        int[] randomArray = new int[10];
        int randomNumber;

        for (int j = 0; j < 10; j++) {
            randomNumber = r.nextInt(high - low) + low;
            randomArray[j] = randomNumber;
        }
        return randomArray;
    }

    private void randomSorted(int low, int high) {
        Random r = new Random();
        int[] randomArray = new int[10];
        ArrayList<Integer> sortedList = new ArrayList<Integer>();
        int randomNumber;

        for (int j = 0; j < 10; j++) {
            randomNumber = r.nextInt(high - low) + low;
            sortedList.add(randomNumber);
        }
        Collections.sort(sortedList);
        System.out.print(sortedList);
        System.out.print(sortedList.get(0));
        System.out.print(sortedList.get(sortedList.size() - 1));
    }

    private String randomWords(String str) {
        Random r = new Random();
        StringBuilder randomStr = new StringBuilder();

        for (int i = 0; i < 5; i++) {
            int randomIndex = r.nextInt(str.length());
            randomStr.append(str.charAt(randomIndex));
        }
        return randomStr.toString();
    }

    private String[] randomWordsArray(String str) {
        Random r = new Random();
        // StringBuilder randomStr = new StringBuilder();
        String[] randomWordsArray = new String[10];

        for (int j = 0; j < 10; j++) {
            StringBuilder randomStr = new StringBuilder();
            for (int i = 0; i < 5; i++) {
                int randomIndex = r.nextInt(str.length());
                randomStr.append(str.charAt(randomIndex));
            }
            randomWordsArray[j] = randomStr.toString();
        }
        return randomWordsArray;
    }

    public static void main(String[] args) {
        int myArray[] = { 3, 5, 1, 2, 7, 9, 8, 13, 25, 32 };
        Puzzling puzzle = new Puzzling();

        System.out.println("Hey There!");
        // ArrayList<Integer> newList = puzzle.printSum(myArray);
        // System.out.println(newList);

        // String[] strArray = { "Nancy", "Jinichi", "Fujibayashi", "Axy", "Momochi",
        // "Ishikawa" };
        // String[] newArray = puzzle.printNames(strArray);
        // System.out.println("--------------------------");
        // for (int i = 0; i < newArray.length; i++) {
        // System.out.println((newArray[i]));
        // }

        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        // puzzle.alphabetsPlay(alphabet);
        // char[] alphabet = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k',
        // 'l', 'm', 'n', 'o', 'p', 'q', 'r','s', 't', 'u', 'v', 'w', 'x', 'y', 'z' };

        // int[] randomNumber = puzzle.randomIntegerGenerator(55, 100);
        // for (int i = 0; i < randomNumber.length; i++) {
        // System.out.println(randomNumber[i]);
        // }

        // puzzle.randomSorted(55, 100);

        String alphabets = "abcdefghijklmnopqrstuvwxyz";
        String randomWord = puzzle.randomWords(alphabets);
        System.out.print(randomWord);

        String[] stringsArray = puzzle.randomWordsArray(alphabets);
        System.out.println("\n\nString Array with 10 random words : \n");
        for (int i = 0; i < stringsArray.length; i++) {
            System.out.println(stringsArray[i]);
        }
    }
}