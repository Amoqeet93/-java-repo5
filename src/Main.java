import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int totalHeight;
        HeightInFeet feet = new HeightInFeet();
        Scanner userInput = new Scanner(System.in);

        HeightInInches inches = new HeightInInches();

        totalHeight = feet.getHeightInFeet(userInput) + inches.getHeightInInches(userInput);

        System.out.println(totalHeight);

    }
}