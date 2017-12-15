/**
 * Main class to run MyBnb program.
 */

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Main
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		//Variables
		ArrayList<BnbApartment> Apartments = new ArrayList<BnbApartment>();
		ArrayList<BnbHouse> Houses = new ArrayList<BnbHouse>(); 
		ArrayList<BnbVilla> Villas = new ArrayList<BnbVilla>();
		
		//Welcome message
		JOptionPane.showMessageDialog(null, "***Welcome to MyBnb***");
		
		//Initializing property ArrayLists and calling RentalDays method
		PropertyProcessor.FillInProperties(Apartments, Houses, Villas);
		
		//Printing all properties
		PropertyProcessor.PrintAllProperties(Apartments, Houses, Villas);
		
		//Calculating total Income for all properties
		JOptionPane.showMessageDialog(null, "Total rental income is " + PropertyProcessor.CalculateTotallIncome(Apartments, Houses, Villas));
	}

}
