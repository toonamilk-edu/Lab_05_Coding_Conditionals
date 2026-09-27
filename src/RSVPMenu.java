import java.util.Scanner;

public class RSVPMenu {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //String menuChoice
        String menuChoice = "";
        //output “Enter your meal (C, F, V)”
        System.out.print("Enter your meal (C, F, V): ");
        //input menuChoice
        menuChoice = input.nextLine();
        //if menuChoice == “C” then
        if (menuChoice.equals("C")) {
            //output “You get the Chicken Parmesan!”
            System.out.println("You get the Chicken Parmesan!");
            //else if menuChoice == “F” then
        } else if (menuChoice.equals("F")) {
            //output “You get the Roast Salmon!”
            System.out.println("You get the Roast Salmon!");
            //else if menuChoice == “V” then
        } else if (menuChoice.equals("V")) {
            //output “You get the Butternut Squash!”
            System.out.println("You get the Butternut Squash!");
            //else
        } else {
            //output “Sorry, you must choose C, F, or V”
            System.out.println("Sorry, you must choose C, F, or V");
        }
        //end if

    }
}
