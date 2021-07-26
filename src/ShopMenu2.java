
/*
You’re going to need some software to help run and manage the business you defined in unit 1.
 For this project, you will create a menu system that sketches out functionality for your business management system.
   This system will, eventually, perform 2 high level actions: inventory actions and sales actions.
     These high level actions have sub actions – adding products to the system, viewing inventory, viewing products, and purchasing products.

Using the skills you’ve learned so far in the course, create the menu system that your business management system will eventually need.
The functionality to show the high level menu and the sub menus should each be represented in their own methods (i.e. 3 methods for the menu system itself).
You should also define placeholder methods for handling the different sub menu options.
These placeholder methods should be no-op / void methods and should output some placeholder text to the screen.

Your menu system should look something like this:

top level menu with 3 choices:
inventory actions
sales actions
exit
Implement 2 sub menus, 1 each for inventory actions and sales actions
The Inventory Actions sub menu provides the following choices:
adding a product
viewing inventory
go back to the top level menu
The Sales Actions menu provides the following choices:
viewing products
purchasing products
go back to the top level menu
Be mindful of testing and debugging procedures, common errors, and pitfalls learned in order to ensure proper output prior to submitting your code. Use comments to describe the purpose of your code revisions and additions. */
import java.text.*;
import java.util.*;

public class ShopMenu2 {
    public static void main(String[] args) {
        // creating a My HashTable Dictionary
        Hashtable<Integer, String> inventory = new Hashtable<>();

       /*  Using a few dictionary Class methods
        using put method
        invenames.put("01", "Apple");
        invenames.put("10", "Banana");

        using get() method
        System.out.println("\nValue at key = 10 : " + invenames.get("10"));
        System.out.println("Value at key = 11 : " + invenames.get("11"));

        // using isEmpty() method
        System.out.println("\nIs my dictionary empty? : " + invenames.isEmpty() + "\n");

        // using remove() method
        // remove value at key 10
        invenames.remove("10");
        System.out.println("Checking if the removed value exists: " + invenames.get("10"));
        System.out.println("\nSize of my_dict : " + invenames.size());
*/
        if (fina(inventory)) {
            System.out.println("why");
        }

    }


    public static Boolean fina(Hashtable a) {
        Scanner myObj = new Scanner(System.in);
        Boolean fin = false; /**/
        while (!fin) {
            System.out.println("Welcome to Game Bazaar's menu. Would you like to 1. check the inventory menu, 2. check the sales menu, or 3. exit this menu?");
            int choice = myObj.nextInt();
            if (choice == 1) {
                a = inventory(a);
            }
            else if (choice == 2) {
                a = sales(a);
            }
            else if (choice == 3) {
                fin = true;
            }else{
                System.out.println("You typed in something wrong. Please try again.");
            }

        }
        return fin;
    }
    public static Hashtable inventory (Hashtable a) {
        Scanner myObj = new Scanner(System.in);
        Hashtable inventory = a;
        String str;
        Enumeration e;
        int menuselect = 0;
        while (menuselect == 0) {
            System.out.println("Welcome to Game Bazaar's Inventory. Would you like to 1. add an item to the inventory, 2. view the inventory, or 3. exit this menu?");
            int crednum = myObj.nextInt();
            if (crednum == 1) {
                System.out.println("Would you like to 1. add a new item to the inventory, or 2. add an old item to the inventory?");
                int choose = myObj.nextInt();
                if (choose == 1) {
                    System.out.println("Please enter the name of the item you wish to add to the inventory.");
                    String item = myObj.next();
                    System.out.println("Please enter the the number of items you wish to add.");
                    int itemnum = myObj.nextInt();

                    inventory.put(inventory.size(), item + "\n");
                    inventory.put(inventory.size(), itemnum + " of " + "\n");
                } else if (choose == 2) {
                    System.out.println("This is our inventory:\n");
                    System.out.println("Please enter the id of the item you wish to add to.\n" + inventory);
                    String item = myObj.next();
                    System.out.println("Please enter the the number of items you wish to add.");
                    int itemnum = myObj.nextInt();
                    inventory.put(inventory.size(), item + "\n");
                    inventory.put(inventory.size(), itemnum + " of " + "\n");

                }

            } else if (crednum == 2) {
                System.out.println("This is the inventory: \n" + inventory);
            }


            else if (crednum == 3) {
                System.out.println("You are exiting the inventory menu.");
                menuselect++;

            } else {
                System.out.println("You typed in something wrong. Please try again.");
            }


        }
        return inventory;

    }

    public static Hashtable sales (Hashtable b){
        Scanner myObj = new Scanner(System.in);
        int menuselect = 0;
        while (menuselect == 0) {
            System.out.println("Welcome to the sales menu. Here, you can 1.check the sales inventory, 2. purchase an item, or 3. exit this menu.");
            int salenum = myObj.nextInt();
            if (salenum == 1) {
                System.out.println("This is our sales inventory:\n" + b);

            } else if (salenum == 2) {
                System.out.println("Welcome to the Shop! Please enter the name of the item you wish to buy from the inventory:" + b);
                int saleind = myObj.nextInt();


            } else if (salenum == 3) {
                System.out.println("You are exiting the sales menu.");
                menuselect++;

            }else{
                System.out.println("You typed in something wrong. Please try again.");
            }
        }

        return b;

    }
}


