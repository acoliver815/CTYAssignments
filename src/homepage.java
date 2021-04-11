import java.text.DecimalFormat;
import java.util.Scanner;
public class homepage {
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);
        System.out.println("      *******                  ******* ");
        System.out.println("     ***^^***                  ********");
        System.out.println("     ***  ***                  **    ** ");
        System.out.println("     **   ***   GAME           ** O  **");
        System.out.println("     ***  ***     BAZAAR       **    ** ");
        System.out.println("     ***||***                  ********");
        System.out.println("     *||   ||*                 ***   **");
        System.out.println("     ***||***                  *** 0 **");
        System.out.println("     ********                  ***   **");
        System.out.println("     ********                  ********");
        System.out.println("      *******                  *******");
        System.out.println("Welcome to the Game Bazaar's shop!");

        int stock_count = 23;
        int menu_1_picked = 0;
        int menu_2_picked = 0;
        int menu_3_picked = 0;
        int menu_4_picked = 0;
        int menu_1_gt10 = 0;
        int menu_2_gt10 = 0;
        int menu_3_gt10 = 0;
        int menu_4_gt10 = 0;
        char menu_exit = 'N';
        double receipt = 0.0;
        String item_list = "";
        DecimalFormat decFormat = new DecimalFormat("$#,###.00");
        while (menu_exit == 'N') {
            System.out.println("If you need to purchase a game, please enter 1. \nIf you want to purchase a game console, enter 2. \nIf you need a repair consultant, please enter 3. \nIf you want various types of merchandise, type 4.");
            System.out.println("If you are done selecting items please enter 5");
        /*Identify if the first and second menu items have been selected, If so, calculate and apply a multi-product/service discount of 10%. Otherwise, no discount is applied.
Identify if the user has requested more than 10 units or service hours for both menu selections. If so, a 5% discount will be applied. Otherwise, no discount is applied.
*/
            System.out.println("If you purchase two different items, you will receive 10% off");
            System.out.println("If you purchase more than 10 of two different menu items, you will receive an additional 5% off");

            int type = myObj.nextInt();
            if (type == 1) {
                System.out.println(" Here you can buy games. Please enter the name of the game you wish to buy.");
                String game = myObj.next();
                System.out.println("How many (" + game + ") would you like?");
                int gPQ = myObj.nextInt();
                double gprice = gPQ * 59.99;
                String gresp1 = "The number of units requested, " + gPQ + ", is currently greater than the amount in stock. Please try ordering your (" + game + ") when supplies are in stock.";
                String gresp2 = "You have requested " + gPQ + " units of (" + game + "). Your total cost is " + decFormat.format(gprice) + " There are " + (stock_count - gPQ) + " units remaining in stock.";

                if (gPQ > stock_count) {
                    System.out.println(gresp1);
                } else if (gPQ >= 10 && gPQ <= stock_count) {
                    System.out.println(gresp2);
                    menu_1_gt10++;
                    menu_1_picked++;
                    item_list = item_list + gPQ + " of " + game+" ";
                    receipt = receipt + gprice;

                } else if (gPQ < stock_count && gPQ > 0) {
                    /* execute this if condition_1 is not met and
                     * condition_2 is met
                     */
                    System.out.println(gresp2);
                    menu_1_picked++;
                    item_list = item_list + gPQ + " of " + game+" ";
                    receipt = receipt + gprice;


                }
            } else if (type == 2) {
                System.out.println(" Here you can buy game consoles. Please enter the name of the game console you wish to buy.");
                String console = myObj.next();
                System.out.println("How many (" + console + ") would you like?");
                int cPQ = myObj.nextInt();
                double cprice = cPQ * 299.99;
                String cresp1 = "The number of units requested, " + cPQ + ", is currently greater than the amount in stock. Please try ordering your (" + console + ") when supplies are in stock.";
                String cresp2 = "You have requested " + cPQ + " units of (" + console + "). Your total cost is " + decFormat.format(cprice) + " There are " + (stock_count - cPQ) + " units remaining in stock.";

                if (cPQ > stock_count) {
                    System.out.println(cresp1);

                } else if (cPQ >= 10) {
                    System.out.println(cresp2);
                    menu_2_gt10++;
                    menu_2_picked++;
                    item_list = item_list + cPQ + " of " + console+" ";
                    receipt = receipt + cprice;

                } else if (cPQ <= stock_count && cPQ > 0) {
                    /* execute this if condition_1 is not met and
                     * condition_2 is met
                     */
                    System.out.println(cresp2);
                    menu_2_picked++;
                    item_list = item_list + cPQ + " of " + console+" ";
                    receipt = receipt + cprice;


                }


            } else if (type == 3) {
                System.out.println("Welcome to our help center! If a video game is acting up, please enter 1. \n If a console is acting up, please enter 2. \n If merchandise was bought here and you have problems with it, please enter 3");
                int help = myObj.nextInt();
                int hgame = 10;
                int hconsole = 60;
                int hmerch = 3;
                String helperr = "The number you entered is not a viable answer. Please try again.";
                String help1 = "You have requested for game consultation. If you send in the game, your total cost is " + decFormat.format(hgame);
                String help2 = "You have requested for game console consultation. If you send in the console, Your total cost is " + decFormat.format(hconsole);
                String help3 = "You have requested for refunds on merchandise, or repair on merchandise. If you send in the merchandise, Your total cost is " + decFormat.format(hmerch);


                if (help < 1) {
                    System.out.println(helperr);

                } else if (help == 1) {
                    System.out.println(help1);
                    menu_3_gt10++;
                    menu_3_picked++;
                    item_list = item_list + "renovation of game"+" ";
                    receipt = receipt + hgame;

                } else if (help == 2) {
                    System.out.println(help2);
                    menu_3_picked++;
                    menu_3_gt10++;
                    item_list = item_list + "renovation of console"+" ";
                    receipt = receipt + hconsole;

                } else if (help == 3) {
                    System.out.println(help3);
                    menu_3_picked++;
                    item_list = item_list + "refund/fixing of merchandise"+" ";
                    receipt = receipt + hmerch;


                }


            } else if (type == 4) {
                System.out.println(" Here you can buy merchandise. Please enter the merchandise you want.");
                String merch = myObj.next();
                System.out.println("How many (" + merch + ") would you like?");
                int mPQ = myObj.nextInt();
                double mprice = mPQ * 69.99;
                String mresp1 = "The number of units requested, " + mPQ + ", is currently greater than the amount in stock. Please try ordering your (" + merch + ") when supplies are in stock.";
                String mresp2 = "You have requested " + mPQ + " units of (" + merch + "). Your total cost is " + decFormat.format(mprice) + " There are " + (stock_count - mPQ) + " units remaining in stock.";
                if (mPQ > stock_count) {
                    System.out.println(mresp1);

                } else if (mPQ >= 10) {
                    System.out.println(mresp2);
                    menu_4_gt10++;
                    item_list = item_list + mPQ + " of " + merch+" ";
                    receipt = receipt + mprice;

                } else if (mPQ <= stock_count && mPQ > 0) {
                    /* execute this if condition_1 is not met and
                     * condition_2 is met
                     */
                    System.out.println(mresp2);
                    menu_4_gt10++;
                    item_list = item_list + mPQ + " of " + merch+" ";
                    receipt = receipt + mprice;

                }
                menu_4_picked++;
            } else if (type == 5) {
                menu_exit = 'Y';
                System.out.println("Thank you for shopping with the Game Bazaar.");

            }


        }
        if (menu_1_picked + menu_2_picked + menu_3_picked + menu_4_picked >= 2 && menu_1_gt10 + menu_2_gt10 + menu_3_gt10 + menu_4_gt10 >= 2) {
            System.out.println("you get a discount! 15%");
            receipt = receipt * 0.85;
        } else if (menu_1_gt10 + menu_2_gt10 + menu_3_gt10 + menu_4_gt10 >= 2) {
            System.out.println("you get a discount! 5%");
            receipt = receipt * 0.95;
        } else if (menu_1_picked + menu_2_picked + menu_3_picked + menu_4_picked >= 2) {
            System.out.println("you get a discount! 10%");
            receipt = receipt * 0.9;
        }
        System.out.println("Would you like to confirm your purchase? (Y/N)");
        String confirm = myObj.next();
        if (confirm.equals("y")  || confirm.equals("Y")) {
            System.out.println("Your final receipt is $" + receipt + " for " + item_list + ". Congratulations on your purchase!");

        } else {
            System.out.println("We are sorry for you not purchasing these items. We hope you will visit us again!");

        }

    }
}
