/*
 * File name: IncomeTax.java
 * Author: Sahil Alamgir
 * Date: October 10 2024
 * Description:
 * This program will calculate the income tax that the user owes. It
 * will ask for the user's salary, federal and provincial tax percentage.
 * It will also display a tax bracket chart. Then, it will calculate and
 * output the sum of the federal and provincial tax, which is equal to the
 * income tax.
 */
package incometax;

// import statements
import java.util.Scanner; // for keyboard input
public class IncomeTax {

    public static void main(String[] args) {
        
        // setting keyboard as input
        Scanner keyedInput = new Scanner(System.in);
        
        // declare and initialize variables
        final double FED_MONEY1 = 221708;
        final double FED_MONEY2 = 155625;
        final double FED_MONEY3 = 100392;
        final double FED_MONEY4 = 50197;
        final double PROV_MONEY1 = 220000;
        final double PROV_MONEY2 = 150000;
        final double PROV_MONEY3 = 92454;
        final double PROV_MONEY4 = 46226;
        final double FED_TAX1 = 0.33;
        final double FED_TAX2 = 0.29;
        final double FED_TAX3 = 0.26;
        final double FED_TAX4 = 0.205;
        final double FED_TAX5 = 0.15;
        final double PROV_TAX1 = 0.1316;
        final double PROV_TAX2 = 0.1216;
        final double PROV_TAX3 = 0.1116;
        final double PROV_TAX4 = 0.0915;
        final double PROV_TAX5 = 0.0505;
        double salary;
        double fed_first_diff;
        double fed_second_diff;
        double fed_third_diff;
        double fed_fourth_diff;
        double fed_fifth_diff;
        double prov_first_diff;
        double prov_second_diff;
        double prov_third_diff;
        double prov_fourth_diff;
        double prov_fifth_diff;
        double fed_salary1;
        double fed_salary2;
        double fed_salary3;
        double fed_salary4;
        double fed_salary5;
        double taxed_fed_salary1;
        double taxed_fed_salary2;
        double taxed_fed_salary3;
        double taxed_fed_salary4;
        double taxed_fed_salary5;
        double prov_salary1;
        double prov_salary2;
        double prov_salary3;
        double prov_salary4;
        double prov_salary5;
        double taxed_prov_salary1;
        double taxed_prov_salary2;
        double taxed_prov_salary3;
        double taxed_prov_salary4;
        double taxed_prov_salary5;
        double total_fed_tax;
        double total_prov_tax;
        double income_tax;
        
        // display tax bracket chart
        System.out.println("Federal tax:");
        System.out.println("Portion of salary that is less than or equal to "
                + "$50,197: 15%");
        System.out.println("Portion of salary that is more than $50,197 and "
                + "less than or equal to $100,392: 20.5%");
        System.out.println("Portion of salary that is more than $100,392 and "
                + "less than or equal to $155,625: 26%");
        System.out.println("Portion of salary that is more than $155,625 and "
                + "less than or equal to $221,708: 29%");
        System.out.println("Portion of salary that is more than $221,708: 33%");
        System.out.println("");
        System.out.println("Provincial tax (for Ontario):");
        System.out.println("Portion of salary that is less than or equal to "
                + "$46,226: 5.05%");
        System.out.println("Portion of salary that is more than $46,226 and "
                + "less than or equal to $92,454: 9.15%");
        System.out.println("Portion of salary that is more than $92,454 and "
                + "less than or equal to $150,000: 11.16%");
        System.out.println("Portion of salary that is more than $150,000 and "
                + "less than or equal to $220,000: 12.16%");
        System.out.println("Portion of salary that is more than $220,000: "
                + "13.16%");
        System.out.println("");
        
        // prompt user for their salary
        System.out.println("What is your salary ($)?:");
        salary = keyedInput.nextDouble();
        System.out.println("");
        
        // calculate the difference between salary and $221,708
        fed_first_diff = salary - FED_MONEY1;
        
        // prompt user for first difference or '0' if it is negative
        System.out.println("Enter " + fed_first_diff + " or '0' if negative:");
        fed_salary1 = keyedInput.nextDouble();
        
        // calculate portion of salary higher than $221,708 when it is taxed
        taxed_fed_salary1 = fed_salary1 * FED_TAX1;
        
        // calculate the difference between (salary and first difference)
        // and $155,625
        fed_second_diff = salary - fed_salary1 - FED_MONEY2;
        
        // prompt user for second difference or '0' if it is negative
        System.out.println("Enter " + fed_second_diff + " or '0' if negative:");
        fed_salary2 = keyedInput.nextDouble();
        
        // calculate portion of salary between $221,708 and $155,625
        // when it is taxed
        taxed_fed_salary2 = fed_salary2 * FED_TAX2;
        
        // calculate the difference between ((salary and first difference)
        // and second difference) and $100,392
        fed_third_diff = salary - fed_salary1 - fed_salary2 - FED_MONEY3;
        
        // prompt user for third difference or '0' if it is negative
        System.out.println("Enter " + fed_third_diff + " or '0' if negative:");
        fed_salary3 = keyedInput.nextDouble();
        
        // calculate portion of salary between $155,625 and $100,392
        // when it is taxed
        taxed_fed_salary3 = fed_salary3 * FED_TAX3;
        
        // calculate the difference between (((salary and first difference)
        // and second difference) and third difference) and $50,197
        fed_fourth_diff = salary - fed_salary1 - fed_salary2 - fed_salary3 - 
                FED_MONEY4;
        
        // prompt user for fourth difference or '0' if it is negative
        System.out.println("Enter " + fed_fourth_diff + " or '0' if negative:");
        fed_salary4 = keyedInput.nextDouble();
        
        // calculate portion of salary between $100,392 and $50,197
        // when it is taxed
        taxed_fed_salary4 = fed_salary4 * FED_TAX4;
        
        // calculate the difference between (((salary and first difference)
        // and second difference) and third difference) and fourth difference
        fed_fifth_diff = salary - fed_salary1 - fed_salary2 - fed_salary3 - 
                fed_salary4;
        
        // prompt user for fifth difference or '0' if it is negative
        System.out.println("Enter " + fed_fifth_diff + " or '0' if negative:");
        fed_salary5 = keyedInput.nextDouble();
        
        // calculate portion of salary below $50,197 when it is taxed
        taxed_fed_salary5 = fed_salary5 * FED_TAX5;
        
        // calculate total federal tax user has to pay
        total_fed_tax = taxed_fed_salary1 + taxed_fed_salary2 +
                taxed_fed_salary3 + taxed_fed_salary4 + taxed_fed_salary5;
        
        // round total federal tax user has to pay
        total_fed_tax = total_fed_tax * 100;
        total_fed_tax = Math.round(total_fed_tax);
        total_fed_tax = total_fed_tax / 100;
        
        // print total federal tax user has to pay
        System.out.println("");
        System.out.println("Total Federal Tax: $" + total_fed_tax);
        System.out.println("");
        
        // calculate the difference between salary and $220,000
        prov_first_diff = salary - PROV_MONEY1;
        
        // prompt user for first difference or '0' if it is negative
        System.out.println("Enter " + prov_first_diff + " or '0' if negative:");
        prov_salary1 = keyedInput.nextDouble();
        
        // calculate portion of salary higher than $220,000 when it is taxed
        taxed_prov_salary1 = prov_salary1 * PROV_TAX1;
        
        // calculate the difference between (salary and first difference)
        // and $150,000
        prov_second_diff = salary - prov_salary1 - PROV_MONEY2;
        
        // prompt user for second difference or '0' if it is negative
        System.out.println("Enter " + prov_second_diff + " or '0' if negative:");
        prov_salary2 = keyedInput.nextDouble();
        
        // calculate portion of salary between $220,000 and $150,000
        // when it is taxed
        taxed_prov_salary2 = prov_salary2 * PROV_TAX2;
        
        // calculate the difference between ((salary and first difference)
        // and second difference) and $92,454
        prov_third_diff = salary - prov_salary1 - prov_salary2 - PROV_MONEY3;
        
        // prompt user for third difference or '0' if it is negative
        System.out.println("Enter " + prov_third_diff + " or '0' if negative:");
        prov_salary3 = keyedInput.nextDouble();
        
        // calculate portion of salary between $150,000 and $92,454
        // when it is taxed
        taxed_prov_salary3 = prov_salary3 * PROV_TAX3;
        
        // calculate the difference between (((salary and first difference)
        // and second difference) and third difference) and $46,226
        prov_fourth_diff = salary - prov_salary1 - prov_salary2 - prov_salary3 - 
                PROV_MONEY4;
        
        // prompt user for fourth difference or '0' if it is negative
        System.out.println("Enter " + prov_fourth_diff + " or '0' if negative:");
        prov_salary4 = keyedInput.nextDouble();
        
        // calculate portion of salary between $92,454 and $46,226
        // when it is taxed
        taxed_prov_salary4 = prov_salary4 * PROV_TAX4;
        
        // calculate the difference between (((salary and first difference)
        // and second difference) and third difference) and fourth difference
        prov_fifth_diff = salary - prov_salary1 - prov_salary2 - prov_salary3 - 
                prov_salary4;
        
        // prompt user for fifth difference or '0' if it is negative
        System.out.println("Enter " + prov_fifth_diff + " or '0' if negative:");
        prov_salary5 = keyedInput.nextDouble();
        
        // calculate portion of salary below $46,226 when it is taxed
        taxed_prov_salary5 = prov_salary5 * PROV_TAX5;
        
        // calculate total provincial tax user has to pay
        total_prov_tax = taxed_prov_salary1 + taxed_prov_salary2 +
                taxed_prov_salary3 + taxed_prov_salary4 + taxed_prov_salary5;
        
        // round total provincial tax user has to pay
        total_prov_tax = total_prov_tax * 100;
        total_prov_tax = Math.round(total_prov_tax);
        total_prov_tax = total_prov_tax / 100;
        
        // print total provincial tax user has to pay
        System.out.println("");
        System.out.println("Total Provincial Tax: $" + total_prov_tax);
        System.out.println("");
        
        // calculate total income tax owed to government
        income_tax = total_fed_tax + total_prov_tax;
        
        // print total incoem tax owed to government
        System.out.println("Total Income Tax: $" + income_tax);
        System.out.println("Remaining Money: $" + (salary - income_tax));
    }
    
}
