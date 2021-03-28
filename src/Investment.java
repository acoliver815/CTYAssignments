/* inputs required for creating part two of your Java program are listed below: :

Amount invested (typically a percentage of current valuation equal to percent ownership given)
Current company valuation (in millions)
Estimated rate of growth as a percentage (use a value between 60-100%)
Percentage of company given for investment (usually 20-40%)
Number of investment years (use a number between 5-10 years)
The calculations required are: :

Calculate the total future value of company:
  The formula is:
        FV = PV(1+G)T
You’ll need these values to calculate FV:
PV = present value: the current valuation of the company
T = number of years
G = Growth rate (converted to decimal figure)
Future value of investor’s percentage:
        investor's percentage * Total future value
Owner future value:
 Total future value – (amount invested + future value of investor’s percentage)
The outputs required are: :

All input information
Owner future value */

import java.util.Scanner;

public class Investment {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter the amount invested in the company, the current value of the company in millions, and estimated rate of growth for the company between 60 and 100 as a percent:");
        int invest = myObj.nextInt();

        int compval = myObj.nextInt();
        int growthr = myObj.nextInt()/100;
        System.out.println(" Enter the percent of company given for investment between 20 and 40%, and the number of investment years:");
        int compinves = myObj.nextInt();

        int numinves = myObj.nextInt();

        double futcomval = compval * Math.pow((1+growthr),numinves );
        double futinvesval = compinves * futcomval;
        double ownfutval = futinvesval-(invest + futinvesval);

        //outputs
        System.out.println("Investment amount: " + invest);
        System.out.println("Value of the company: " + compval);
        System.out.println("Growthrate of the company in decimals: " + growthr);
        System.out.println("Percent of the company given for investment:" + compinves);
        System.out.println("Number of investment years:" + numinves);
        System.out.println("The owner's future value:" + ownfutval);

    }
}


