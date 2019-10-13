import java.util.Arrays;

import com.sun.org.apache.xalan.internal.xsltc.util.IntegerArray;

public class BasicJava {
    private void printIntegers() {
        for (int i = 1; i < 256; i++) {
            System.out.println(i);
        }
    }

    private void printOdds(int startNumber, int endNumber) {
        for (int i = startNumber; i <= endNumber; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    private void printSum(int startNumber, int endNumber) {
        int sum = 0;
        for (int i = startNumber; i <= endNumber; i++) {
            sum += i;
            System.out.println("New Number: " + i + " Sum: " + sum);
        }
    }

    private void iterateArray(int[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    private Integer printMax(int[] array) {
        int max = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    private Integer printAverage(int[] array) {
        int average;
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        average = sum / array.length;

        return average;
    }

    private int[] oddArray(int startNumber, int endNumber) {
        int[] array = new int[128];

        for (int i = startNumber, j = 0; i <= endNumber; i++) {
            if (i % 2 != 0) {
                array[j] = i;
                j++;
            }
        }
        return array;
    }

    private int greaterThanCounter(int[] array, int value) {
        int counter = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > value) {
                counter++;
            }
        }
        return counter;
    }

    private int[] squareArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] * array[i];
        }
        return array;
    }

    private int[] removeNegatives(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                array[i] = 0;
            }
        }
        return array;
    }

    private int[] minMaxAvg(int[] array) {
        int[] result = new int[3];
        int min = array[0];
        int max = array[0];
        int avg;
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] <= min) {
                min = array[i];
            }
            if (array[i] >= max) {
                max = array[i];
            }
            sum += array[i];
        }
        avg = sum / array.length;

        result[0] = min;
        result[1] = max;
        result[2] = avg;

        return result;
    }

    private int[] myArrayShift(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i != array.length - 1) {
                array[i] = array[i + 1];
            } else {
                array[i] = 0;
            }
        }
        return array;
    }

    public static void main(String[] args) {
        BasicJava bj = new BasicJava();

        // bj.printIntegers();
        // bj.printOdds(1, 10);
        // bj.printSum(1, 255);

        int myArray[] = { 1, 3, 5, 27, -72, 9, 18, -39, 45, 30 };
        // bj.iterateArray(myArray);

        // int max = bj.printMax(myArray);
        // System.out.print("Maximum: ");
        // System.out.println(max);

        // int avg = bj.printAverage(myArray);
        // System.out.print("Average: ");
        // System.out.print(avg);

        // int[] oddArray = bj.oddArray(1, 255);
        // for (int i = 0; i < oddArray.length; i++) {
        // System.out.println(oddArray[i]);
        // }

        // int count = bj.greaterThanCounter(myArray, 9);
        // System.out.print(count);

        // int[] squareArray = bj.squareArray(myArray);
        // for (int i = 0; i < squareArray.length; i++) {
        // System.out.println(squareArray[i]);
        // }

        // int[] allPositives = bj.removeNegatives(myArray);
        // for (int i = 0; i < allPositives.length; i++) {
        // System.out.println(allPositives[i]);
        // }

        // int[] mam = bj.minMaxAvg(myArray);
        // System.out.println("Min, Max, Avg : ");
        // for (int i = 0; i < mam.length; i++) {
        // System.out.println(mam[i]);
        // }

        int[] shiftedArray = bj.myArrayShift(myArray);
        System.out.println("Shifted Array is: ");
        for (int i = 0; i < shiftedArray.length; i++) {
            System.out.println(shiftedArray[i]);
        }
    }
}