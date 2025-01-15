import java.util.Scanner;

public class Payroll {
    public static final double HOURLY_RATE = 12.75;
    public static final double FED_TAX_RATE = 0.20;
    public static final double STATE_TAX_RATE = 0.09;

  public static void main (String[] args){
    Scanner input = new Scanner(System.in);

    System.out.println (" Employee's Name:");
    String name = input.nextLine ();

    System.out.print ("Hours Worked:");
    double hours = input.nextDouble();

    double grossPay = hours * HOURLY_RATE;
    System.out.println("Gross Pay: $" + grossPay);
   
    double fedTax = grossPay * FED_TAX_RATE;
    System.out.println("Federal Tax: $" + FED_TAX_RATE);
    
    double stateTax = grossPay * STATE_TAX_RATE;
    System.out.println("State Tax: $"+ STATE_TAX_RATE);
   
    double netPay =grossPay - fedTax - stateTax;
    System.out.printf("Net Pay: $%.2f\n", + netPay);
  }  
}
