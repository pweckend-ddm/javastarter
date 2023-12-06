import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");

        // Press Ctrl+R or click the green arrow button in the gutter to run the code.
        for (int i = 1; i <= 5; i++) {

            // Press Ctrl+D to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Cmd+F8.
            System.out.println("i = " + i);
        }

        int j = 0;
        String whileLoopOutput = "Apple";
        while (j < 3) {
            whileLoopOutput += "Orange";
            j++;
        }
        System.out.println(whileLoopOutput);

        printArithmetic();

        System.out.println(getLargestValue(14, 5)); // should return 5

        List<String> listOfCities = new ArrayList<>();
        listOfCities.add("Edmonton");
        listOfCities.add("Vancouver");
        listOfCities.add("St John's");
        System.out.println(makeListAlphabetical(listOfCities)); // should output [Edmonton, St John's, Vancouver]

        System.out.println(containsTheLetterA("adidas")); // should return true
        System.out.println(containsTheLetterA("nike")); // should return false
        System.out.println(containsTheLetterA("")); // should return false
        System.out.println(containsTheLetterA(null)); // should return false
    }

    public static void printArithmetic() {
        int a = 7;
        int b = 10;
        System.out.println("a + b = " + (a + b));
    }

    public static int getLargestValue(int a, int b) {
        return -1; // replace with your code
    }

    public static List<String> makeListAlphabetical(List<String> myList) {
        return null; // replace with your code
    }

    public static boolean containsTheLetterA(String myString) {
        return false; // replace with your code
    }
}
