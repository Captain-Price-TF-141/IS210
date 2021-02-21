//Captain-Price-TF-141




import java.io.*;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Amortization

{

	public static void main(String[] args) 
		
	{ // primary
		
	try 
	
		{
		
		String input = "";
		
		while (!input.equalsIgnoreCase("n")) //Program Statements
			
			{
			double loan = 0;
			double rate = 0;
			int time = 0;
			
			String file_name = "LoanAmortization.txt";
			
			//double loan_amount = Double.parseDouble(JOptionPane.showInputDialog("Enter the loan amount."));
			double loan_amount = getLoanAmount(loan);
			
			//double interest_rate = Double.parseDouble(JOptionPane.showInputDialog("Enter the annual interest rate."));
			double interest_rate = getInterestRate(rate);
					
			//int years = Integer.parseInt(JOptionPane.showInputDialog("Enter the years of the loan."));
			int years = getLoanYears(time);
					
			Amortization amortization = new Amortization(loan_amount, interest_rate, years);
			
			try 
				{
				amortization.saveReport(file_name);
				} 
			
			catch (IOException e) 
				{
				// TODO Auto-generated catch block
				e.printStackTrace();
				}
			
			JOptionPane.showMessageDialog(null, "Report saved to the file " + file_name);
			
			input=JOptionPane.showInputDialog("Would you like to run another report? Enter Y for yes or N for no:");
			
			}
		
		} 
	finally 
	{

	}
		// stop primary
	
		//secondary
	}
	
	double loanAmount; // amount of the loan
	
	double interestRate; //Annual Interest Rate
	
	double loanBalance; // Monthly Balance
	
	double term; // used in the calculation of the monthly payment
	
	double payment; // a double variable to hold the amount of the monthly payment
	
	int loanYears; // number of years of the loan



/*
constructor accept three arguments

*/
	
	public Amortization(double loan, double rate, int years)
	{
		loanAmount = loan;
		loanBalance = loan;
		interestRate = rate;
		loanYears = years;
		calcPayment();
	}

/**
* private method that is used to calculate the monthly payment amount.
* The result is stored in the payment field.
*/

	public void calcPayment()
	{
		// get value of Term
		term = Math.pow((1+interestRate/12.0), 12.0 * loanYears);

		// get monthly payment
		payment = (loanAmount * interestRate/12.0 * term) / (term - 1);
	}

/**
	returns as an int the number of loan payments
*/

	public int getNumberOfPayments()
	{
		return 12 * loanYears;
	}

/**
saves the amortization report to a text file
*/

	public void saveReport(String filename) throws IOException
	
	{
		
		double monthlyInterest; // The monthly interest rate
		
		double principal; // The amount of principal
		
		DecimalFormat dollar = new DecimalFormat("#,##0.00");
		
		FileWriter fwriter = new FileWriter(filename);
		
		PrintWriter outputFile = new PrintWriter(fwriter);

		// Print monthly payment amount.
		outputFile.println("Monthly Payment: $" + dollar.format(payment));

		// Print the report header.
		outputFile.println("Month" + "		" + "Interest" + "		" + "Principal" + "		" + "Balance");
		
		outputFile.println("----------------------------------------------------------------------------");

		// Display the amortization table.
		for (int month = 1; month <= getNumberOfPayments(); month++)
				
		{
			// Calculate monthly interest.
			monthlyInterest = interestRate / 12.0 * loanBalance;

			if (month != getNumberOfPayments())
				
			{
				// Calculate payment applied to principal
				principal = payment - monthlyInterest;
			}
			else // This is the last month.
			
			{
				principal = loanBalance;
				payment = loanBalance + monthlyInterest;
			}

			// Calculate the new loan balance.
			loanBalance -= principal;

			// Display a line of data.
			outputFile.println(month + "		" + dollar.format(monthlyInterest) + "		" + dollar.format(principal) + "		" + dollar.format(loanBalance));
		}

// Close the file
		outputFile.close();
	}

/**
 * @return 
*/

	public static double getLoanAmount(double loan)
	{
		loan = Double.parseDouble(JOptionPane.showInputDialog("Enter the loan amount."));
		
		return loan;
	}

/**
@return annual interest rate
*/

	public static double getInterestRate(double rate)
	{
		rate = Double.parseDouble(JOptionPane.showInputDialog("Enter the annual interest rate."));
		
		return rate;
	}

/**
  
@return number of years of the loan.
*/

	public static int getLoanYears(int time)
	{
		time = Integer.parseInt(JOptionPane.showInputDialog("Enter the years of the loan."));
		
		return time;
	}
}
