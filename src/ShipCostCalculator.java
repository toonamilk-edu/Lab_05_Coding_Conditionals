
import java.util.Scanner;
public class ShipCostCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//num itemPrice
        double itemPrice = 0.0;
//num shippingCost
        double shippingCost = 0.0;
//num totalPrice
        double totalPrice = 0.0;
//output "Enter item price: "
        System.out.print("Enter item price: ");
//input itemPrice
        itemPrice = in.nextDouble();
        //if itemPrice >= 100 then
        if (itemPrice >= 100) {
            //shippingCost = 0
            shippingCost = 0;
            //else
        } else {
//shippingCost = itemPrice * 0.02
            shippingCost = itemPrice * 0.02;
//end if
        }

//totalPrice = itemPrice + shippingCost
        totalPrice = itemPrice + shippingCost;


//output "Shipping cost: " + shippingCost
        System.out.println("Shipping cost: " + shippingCost);
//output "Total price: " + totalPrice
        System.out.println("Total price: " + totalPrice);


    }
}