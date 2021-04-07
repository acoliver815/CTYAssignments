import java.util.Scanner;
import java.text.*;

/*
Input
The product or service (for example, the product Coffee or the service of Consulting)
The product quantity or number of hours of service requested (use the variable PQ for product quantity or the variable SH for service hours

Calculate the total cost of the product.
For a product, each unit cost is $7.00.

or a product, there should be 3 possible decisions: >10 units, 10 units, and <10 units.

Option A - Complete this option if your company sells products - If the number of units requested is:
greater than 10, the message “The number of units requested, (PQ), is not currently in stock. Please try ordering your (product name) when supplies are in stock.” should be displayed.
10, the message “We have 10 units of (product name) available in stock. Your total cost is $###.##” should be displayed.
Less than 10, the message “You have requested (PQ) units of (product name). Your total cost is $###.##. There are X units remaining in stock.”
       */
import java.util.Scanner;

public class work {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Welcome to the Game Bazaar's shop!");

        int cost = 7;
        DecimalFormat decFormat = new DecimalFormat("$#,###.00");
        System.out.println("What game or game console would you like?");
        String item = myObj.next();
        System.out.println("How many (" + item +") would you like?");
        int stock_count = 10;
        int PQ = myObj.nextInt(); //scan pquantity
        int cart_price = PQ * cost;
        String resp1 = "The number of units requested, " + PQ +", is currently greeater than the amount in stock. Please try ordering your (" + item + ") when supplies are in stock.";
        String resp2 = "We have "+ stock_count +" units of (" + item + ") available in stock. Your total cost is "+ decFormat.format(cart_price);
        String resp3 = "You have requested "  + PQ +" units of (" + item + "). Your total cost is " + decFormat.format(cart_price)+ " There are "+(stock_count - PQ) +" units remaining in stock.";

        if (PQ > stock_count) {
            System.out.println(resp1);
        } else if (PQ == stock_count) {
            /* execute this if condition_1 is not met and
             * condition_2 is met
             */
            System.out.println(resp2);
        } else if (PQ < stock_count) {
            /* execute this if condition_1 & condition_2 are
             * not met and condition_3 is met
             */
            System.out.println(resp3);
        }
    }
}
