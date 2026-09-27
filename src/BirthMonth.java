import java.util.Scanner;
public class BirthMonth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //num birthMonth
        int birthMonth = 0;
        //output "What is your birth month? (1-12):
        System.out.print("What is your birth month? (1-12): ");
        //input birthMonth
        if (input.hasNextInt()) {
            birthMonth = input.nextInt();
            input.nextLine();
            //if birthMonth >= 1 AND birthMonth <= 12 then
            if (birthMonth >= 1 && birthMonth <= 12) {
                //output "Your birth month is: " + birthMonth
                System.out.println("Your birth month is: " + birthMonth);
            }
            //else
            else {
                //output "You entered an incorrect month value: " + birthMonth
                System.out.println("You entered an incorrect month value: " + birthMonth);

                //end if
            }
        } else {
            System.out.println("That's not a number. Run the program again and enter 1 to 12.");
        }
    }
}

