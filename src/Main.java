import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the item price: ");
        double itemPrice = in.nextDouble();

        double shippingCost;
        double totalPrice;

        if (itemPrice >= 100) {
            shippingCost = 0.00;
        } else {
            shippingCost = itemPrice * 0.02;
        }

        totalPrice = itemPrice + shippingCost;

        System.out.println("Item Price: $" + itemPrice);
        System.out.println("Shipping Cost: $" + shippingCost);
        System.out.println("Total Price: $" + totalPrice);
    }
}