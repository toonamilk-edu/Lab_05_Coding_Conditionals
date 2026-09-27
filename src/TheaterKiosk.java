import java.util.Scanner;

public class TheaterKiosk {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //num age
        int age = 0;
        //output "Enter your age: "
        System.out.print("Enter your age: ");
        //input age
        if (input.hasNextInt()) {
            age = input.nextInt();
            input.nextLine();
            //if age >= 21 then
            if (age >= 21) {
                //output "You get a wrist band!"
                System.out.println("You get a wrist band!");
            }
            //end if
        } else {
            System.out.println("That's not a number. Please enter your age.");
        }


    }

}

