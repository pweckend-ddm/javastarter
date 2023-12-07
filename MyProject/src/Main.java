import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) { // the main function is what gets run when you execute Java code

        // Some example code
        ///////////////////////////////////////////////////////////
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
            whileLoopOutput += "Orange"; // string concatenation
            j++;
        }
        System.out.println(whileLoopOutput);

        int a = 7;
        int b = 10;
        System.out.println("a + b = " + (a + b));

        // Exercises for Dec 8
        ///////////////////////////////////////////////////////////

        // Update getLargestValue to return the largest number
        System.out.println(getLargestValue(14, 5)); // should return 5

        // Update getWhatClothingToWearForWeather to return "Jacket" if "Rainy" is passed in,
        // "Mittens" if "Snowy" is passed in, "Scarf" if "Windy" is passed in, and "T-shirt" for any other value
        System.out.println(getWhatClothingToWearForWeather("Rainy")); // should output "Jacket"
        System.out.println(getWhatClothingToWearForWeather("Snowy")); // should output "Mittens"
        System.out.println(getWhatClothingToWearForWeather("Windy")); // should output "Scarf"
        System.out.println(getWhatClothingToWearForWeather("Sunny")); // should output "T-shirt"

        // Update printEveryOddNumber to output every odd number from 0 to the endNumber
        // For example, for printEveryOddNumber(5), it should print out 1, 3, and 5.
        printEveryOddNumber(10); // prints out 1, 3, 5, 7, 9

        // Exercises for Dec 16
        ///////////////////////////////////////////////////////////

//        List<String> listOfCities = new ArrayList<>();
//        listOfCities.add("Edmonton");
//        listOfCities.add("Vancouver");
//        listOfCities.add("St John's");
//        System.out.println(makeListAlphabetical(listOfCities)); // should output [Edmonton, St John's, Vancouver]
//
//        System.out.println(containsTheLetterA("adidas")); // should return true
//        System.out.println(containsTheLetterA("nike")); // should return false
//        System.out.println(containsTheLetterA("")); // should return false
//        System.out.println(containsTheLetterA(null)); // should return false
    }

    // Exercises for Dec 8
    ///////////////////////////////////////////////////////////

    public static int getLargestValue(int a, int b) {
        return -1; // replace with your code
    }

    public static String getWhatClothingToWearForWeather(String weatherCondition) {
        return null; // replace with your code
    }

    public static void printEveryOddNumber(int endNumber) {
        // replace with your code
    }

    // Exercises for Dec 16
    ///////////////////////////////////////////////////////////

    public static List<String> makeListAlphabetical(List<String> myList) {
        return null; // replace with your code
    }

    public static boolean containsTheLetterA(String myString) {
        return false; // replace with your code
    }
}
