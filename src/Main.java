import java.util.*;

public class Main {
    public static void main(String[] args) {
        // get the birth year from the user
        Scanner inp = new Scanner(System.in);
        System.out.print("Please enter your birth year: ");
        int year = inp.nextInt();
        int result = year % 12;

        // calculate the Chinese zodiac sign
        String zodiacSign = "";
        switch (result) {
            case 0:
                zodiacSign = "Monkey";
                break;
            case 1:
                zodiacSign = "Rooster";
                break;
            case 2:
                zodiacSign = "Dog";
                break;
            case 3:
                zodiacSign = "Pig";
                break;
            case 4:
                zodiacSign = "Rat";
                break;
            case 5:
                zodiacSign = "Ox";
                break;
            case 6:
                zodiacSign = "Tiger";
                break;
            case 7:
                zodiacSign = "Rabbit";
                break;
            case 8:
                zodiacSign = "Dragon";
                break;
            case 9:
                zodiacSign = "Snake";
                break;
            case 10:
                zodiacSign = "Horse";
                break;
            case 11:
                zodiacSign = "Sheep";
                break;
            default:
                System.out.println("Invalid entry! Please enter a valid birth year.");
                return;
        }

        // Print the result to the console
        System.out.println("Your Chinese zodiac is " + zodiacSign + ".");
    }
}