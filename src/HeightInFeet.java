import java.util.Scanner;

public class HeightInFeet {

    private int heightInFeet;


    public int getHeightInFeet(Scanner userInput) {
        heightInFeet = userInput.nextInt();
        return (heightInFeet*12);
    }

}
