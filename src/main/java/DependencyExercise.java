import java.util.Scanner;

import org.apache.commons.lang3.StringUtils;

public class DependencyExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter something: ");
        String userInput = scanner.nextLine();
        System.out.println("You entered " + userInput);
        if (StringUtils.isNumeric(userInput)) {
            System.out.println(userInput + " is a number.");
        } else {
            System.out.println(userInput + " is not a number.");
            System.out.println("Flipped Case: " + StringUtils.swapCase(userInput));
            System.out.println("Reversed: " + StringUtils.reverse(userInput));
        }
    }
}




