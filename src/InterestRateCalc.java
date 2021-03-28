import java.util.Scanner;

public class InterestRateCalc {
        public static void main(String[] args) {
            Scanner myObj = new Scanner(System.in);

            System.out.println("Enter the loan amount, percent interest per year, and the amount of years for the loan:");

            int loan = myObj.nextInt();

            double yearint = myObj.nextDouble() / 100;
            int yearnum = myObj.nextInt();
            int payperiods = yearnum * 12;
            double monthint = yearint / 12;
            //only works for 12 ayments per year
            double periintrate = monthint;
            double discount = ((Math.pow((1 + periintrate), payperiods) - 1)) / (periintrate * Math.pow((1 + periintrate), payperiods));
            double monthpay = loan / discount;
            double totalpay = (Math.round((monthpay * payperiods) * 100)) / 100d;
            //outputs
            System.out.println("Loan amount: " + loan);
            System.out.println("interest per year: " + yearint);
            System.out.println("Number of years for the loan: " + yearnum);
            System.out.println("Monthly interest:" + monthint);
            System.out.println("Number of Payment periods:" + payperiods);
            System.out.println("Periodic interest rate:" + periintrate);
            System.out.println("Discount:" + discount);
            System.out.println("The monthly payment:" + monthpay);
            System.out.println("The total payment: $" + totalpay);
        }
    }
