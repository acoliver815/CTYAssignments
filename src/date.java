import java.util.Scanner;
public class date {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Welcome to the Game Bazaar! Please enter the item you wish to buy!");
        String item = myObj.next();
        System.out.println("Do you have a preference for the date you wish to receive this product before? (Y/N)");
        String choice1 = myObj.next();
        int month = 0;
        int year = 0;
        int day = 0;
        int menuselect = 0;
        while (menuselect == 0) {
            menuselect++;
            if (choice1.equals("y") || choice1.equals("Y")) {
                for (int monttrue = 0; monttrue < 1; ) {
                    System.out.println("Please the number for the corresponding month. (i.e. 1 = January, 2 = February, etc.)");
                    int mont2 = myObj.nextInt();
                    if (mont2 <= 12) {
                        month += mont2;
                        monttrue++;
                    } else {
                        System.out.println("Please enter a valid number between 1 and 12.");
                    }


                } for (int daytrue = 0; daytrue < 1; ) {
                    System.out.println("Please enter the number for the day of delivery");
                    int day2 = myObj.nextInt();
                    if (day2 <= 31 && month != 2) {
                        day += day2;
                        daytrue++;
                    }else if (day2 <=28 && month == 2 ){
                        day += day2;
                        daytrue++;
                    }
                    else {
                        System.out.println("Please enter a valid number between 1 and 31, unless you chose February, in which case between 1 and 28.");
                    }


                } for (int yeartrue = 0; yeartrue < 1; ) {
                    System.out.println("Please the number for the corresponding year.");
                    int year2 = myObj.nextInt();
                    if (year2 >= 2020 && year2 < 2023) {
                        year += year2;
                        yeartrue++;
                    } else {
                        System.out.println("Please enter a valid number between 2020 and 2022.");
                    }


                } if( (month == 1 && day == 1) || (month == 3 && day == 20) ||(month == 4 && day == 22) ||(month == 5 && day == 1) ||(month == 6 && day == 5) ||(month == 8 && day == 2) ||(month == 12 && day == 31) ){
                    System.out.println("We sre very sorry, but he date you have selected is a break for the company. These dates are:\n January 1 \n" +
                            "March 20  \n" +
                            "April 22  \n" +
                            "May 1  \n" +
                            "June 5  \n" +
                            "August 2  \n" +
                            "December 31 ");
                    menuselect --;
                    month = 0;
                    day = 0;
                    year = 0;

                }



            } else if (choice1.equals("n") || choice1.equals("N")) {
                System.out.println("Thank you for purchasing " + item + ". We will get this to you as fast as possible.");
                menuselect++;
            }
            System.out.println("Are you sure this is the final date? (Y/N). If you want to restart type n.");
            String choice2 = myObj.next();

            if (choice2.equals("y") || choice2.equals("Y")) {
                System.out.println("Thank you for purchasing " + item + ". We will get this to you before: " + day + month + ", " + year + ".");

            } else if(choice2.equals("n") || choice2.equals("N")){
                menuselect--;
                month = 0;
                day = 0;
                year = 0;

            }
        }
    }
}
