
import java.util.Scanner;

public class work2 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.println("This is the shop for the Game Bazaar! Type 1 for games and game consoles. Type 2 for posters, figurines, stickers and other various items");
        int stype = myObj.nextInt();
        if (stype == 1 ) {
            System.out.println("Please enter the video game or video game console you would like to buy, and the amount");
            String vg = myObj.next();
            int quant = myObj.nextInt();
            int cost = quant * 7;
            if (quant <= 10 && quant > 0) {
                System.out.println("You ordered" + quant + vg + "s. The total cost is:" + cost);
            } else {
                System.out.println("You did not enter a number within the allowed amount. Please re-enter the amount of items you wish to buy between 1 and 10.");
            }
        }
        else if (stype == 2)  {
            System.out.println("Please enter the item with the item type you would like to buy, and the amount between 1 and 10");
            String misc = myObj.next();
            int mquant = myObj.nextInt();
            int mcost = mquant * 7;
            if (mquant <= 10 && mquant >0) {
                System.out.println("You ordered " + mquant + " " + misc + ". The total cost is:" + mcost);
            }
        }


    }

}
