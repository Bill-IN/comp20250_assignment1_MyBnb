import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 * This class contains methods that fill,print and perform calculations on
 * the Property class and its subclasses.
 *
 */
public class PropertyProcessor 
{
	//Constructor
	
	/**
	 * Empty constructor
	 */
	PropertyProcessor(){}
	
	//Methods
    /**
    * FillInProperties method inserts the data to Array Lists. First, the method inserts the properties and then it adds 
    * some rents to them in order to increase the total rental days for all properties.
    * @param apartments,houses,villas
	*/  
	public static void FillInProperties(ArrayList<BnbApartment> apartments, ArrayList<BnbHouse> houses, ArrayList<BnbVilla> villas) 
	{
		int i=0;
		
		/*User input variables*/
		
		/*Common variables used to read input or trace for each arraylist 
		int userInteger1 = 0, userInteger2 = 0, userInteger3 = 0, userInteger4 = 0, userInteger5 = 0;
		String userString1 = "", userString2 = "", userString3 = "", userString4 = "" ;
		
		//Apartment user input variables
		String userInputStoreyNum = "";
		String userInputNumBeds = "";
		
		//House input variables
		String userInputTotalNumStoreys = "";
		String userInputClearing_Fees = "";
		
		//Villa input variables
		String userInputLuxuryTaxPerDay = "";
		String userInputRoomServiceCostPerDay = "";
		String userInputTotalNumRooms = "";*/
		
		
		/*User input for apartment ArrayList*/
		
		/*This loop adds three objects of class BnbApartment to the apartments Arraylist.
		JOptionPane.showMessageDialog(null, "Enter details for the apartments please");		
		
		for(i = 0;i < 3;i++)
		{
			JOptionPane.showMessageDialog(null, "Enter details for apartment" + "[" + i + "]");		

			userInputStoreyNum = JOptionPane.showInputDialog(null, "Enter the storey number");	
			userInputNumBeds = JOptionPane.showInputDialog(null, "Enter the number of beds to rent out");	
			userString1 = JOptionPane.showInputDialog(null, "Enter owner's name");	
			userString2 = JOptionPane.showInputDialog(null, "Enter postal address");	
			userString3 = JOptionPane.showInputDialog(null, "Enter daily rent cost");	
			userString4 = JOptionPane.showInputDialog(null, "Enter total number of season rental days");	
			userInteger1 = Integer.parseInt(userInputStoreyNum);
			userInteger2 = Integer.parseInt(userInputNumBeds);
			userInteger4 = Integer.parseInt(userString3);
			userInteger5 = Integer.parseInt(userString4);

			apartments.add(new BnbApartment(userInteger1, userInteger2, userString1, userString2, userInteger4, userInteger5));
		}*/
		
		   apartments.add(new BnbApartment(0,2,"Darren Shan","3 Cirque Du Frique Rd.",20,100));
		   apartments.add(new BnbApartment(1,3,"Terry Pratchett","2 Ring Rd.",20,90));
           apartments.add(new BnbApartment(2,4,"Agatha Christie","64 ABC Lane",20,162));
		
		//Calling the RentProperty method 3 times for each apartment in the apartments ArrayList
		for(BnbApartment element : apartments)
		{
			for(i = 1;i <= 3;i++)
			{
				/*Increasing rental days by multiples of 5.
				 * Could ask the user for input.
				 */
				element.RentProperty(i*5);
			}
		}
		
		/*--------------------------------------------------------------------------------------------*/
		
		/*User input for houses ArrayList*/
		
		/*This loop adds three objects of class BnbHouses to the houses Arraylist.
		JOptionPane.showMessageDialog(null, "Enter details for the houses please");		
		
		for(i = 0;i < 3;i++)
		{
			JOptionPane.showMessageDialog(null, "Enter details for house" + "[" + i + "]");		
			
			userInputTotalNumStoreys = JOptionPane.showInputDialog(null, "Enter the number of storeys in the house");	
			userInputClearing_Fees = JOptionPane.showInputDialog(null, "Enter the clearing fees");	
			userString1 = JOptionPane.showInputDialog(null, "Enter owner's name");	
			userString2 = JOptionPane.showInputDialog(null, "Enter postal address");	
			userString3 = JOptionPane.showInputDialog(null, "Enter daily rent cost");	
			userString4 = JOptionPane.showInputDialog(null, "Enter total number of season rental days");	
			userInteger1 = Integer.parseInt(userInputTotalNumStoreys);
			userInteger2 = Integer.parseInt(userInputClearing_Fees);
			userInteger4 = Integer.parseInt(userString3);
			userInteger5 = Integer.parseInt(userString4);
			
			houses.add(new BnbHouse(userInteger1, userInteger2, userString1, userString2, userInteger4, userInteger5));
		}*/
		
          houses.add(new BnbHouse(3,150,"Izaya Orihara","70 Dollarville Lane",20,111));
          houses.add(new BnbHouse(4,200,"Jane Doe","78 Horton avenue",20,14));
          houses.add(new BnbHouse(2,100,"Rocket","12 Sandy drive",20,45));
		
		//Calling the RentProperty method 3 times for each house in the houses ArrayList
		for(BnbHouse element : houses)
		{
			for(i = 1;i <= 3;i++)
			{
				/*Increasing rental days by multiples of 5.
				 * Could ask the user for input.
				 */
				element.RentProperty(i*5);
			}
		}
		
		/*--------------------------------------------------------------------------------------------*/
		
		/*User input for villas ArrayList*/
		
		/*This loop adds three objects of class BnbVilla to the villas Arraylist.
		JOptionPane.showMessageDialog(null, "Enter details for the villas please");		
		
		for(i = 0;i < 3;i++)
		{
			JOptionPane.showMessageDialog(null, "Enter details for villa" + "[" + i + "]");		
			
			userInputTotalNumRooms = JOptionPane.showInputDialog(null, "Enter the number of beds to rent out");
			userInputRoomServiceCostPerDay = JOptionPane.showInputDialog(null, "Enter the room service cost per day");			
			userInputLuxuryTaxPerDay = JOptionPane.showInputDialog(null, "Enter the luxury tax per day");	
			userString1 = JOptionPane.showInputDialog(null, "Enter owner's name");	
			userString2 = JOptionPane.showInputDialog(null, "Enter postal address");	
			userString3 = JOptionPane.showInputDialog(null, "Enter daily rent cost");	
			userString4 = JOptionPane.showInputDialog(null, "Enter total number of season rental days");	
			userInteger1 = Integer.parseInt(userInputLuxuryTaxPerDay);
			userInteger2 = Integer.parseInt(userInputRoomServiceCostPerDay);
			userInteger3 = Integer.parseInt(userInputTotalNumRooms);
			userInteger4 = Integer.parseInt(userString3);
			userInteger5 = Integer.parseInt(userString4);
			
			villas.add(new BnbVilla(userInteger1, userInteger2, userInteger3, userString1, userString2, userInteger4, userInteger5));
		}*/
		
          villas.add(new BnbVilla(1,100,200,"James Bond","007 Baker Street",20,26));
          villas.add(new BnbVilla(3,300,200,"Dr. Halsey","2558 Oni Drive",20,57));
          villas.add(new BnbVilla(7,700,200,"John Sierra","117 Requiem Rd.",20,365));
		
		//Calling the RentProperty method 3 times for each villa in the villas ArrayList
		for(BnbVilla element : villas)
		{
			for(i = 1;i <= 3;i++)
			{
				/*Increasing rental days by multiples of 5.
				 * Could ask the user for input.
				 */
				element.RentProperty(i*5);
			}
		}
		
		/*--------------------------------------------------------------------------------------------*/
		
		
		/* Hard-coded array list entries in case user does not want to input or for testing. 
		 * 
		 * apartments.add(new BnbApartment(0,2,"Darren Shan","3 Cirque Du Frique Rd.",20,100));
		 * apartments.add(new BnbApartment(1,3,"Terry Pratchett","2 Ring Rd.",20,90));
         * apartments.add(new BnbApartment(2,4,"Agatha Christie","64 ABC Lane",20,162));
         * 
         * houses.add(new BnbHouse(3,150,"Izaya Orihara","70 Dollarville Lane",20,111));
         * houses.add(new BnbHouse(4,200,"Jane Doe","78 Horton avenue",20,14));
         * houses.add(new BnbHouse(2,100,"Rocket","12 Sandy drive",20,45));
         * 
         * villas.add(new BnbVilla(1,100,200,"James Bond","007 Baker Street",20,26));
         * villas.add(new BnbVilla(3,300,200,"Dr. Halsey","2558 Oni Drive",20,57));
         * villas.add(new BnbVilla(7,700,200,"John Sierra","117 Requiem Rd.",20,365));
         * 
         */
		
	}
	
	
	/**
	 * This method displays the contents of all ArrayLists
	 * @param apartments,houses,villas
	 */
	public static void PrintAllProperties(ArrayList<BnbApartment> apartments, ArrayList<BnbHouse> houses, ArrayList<BnbVilla> villas)
	{
		int i = 0;
		String welcomeString = "", newLines = "\n\n\n", outputString = ""; 
		String apartmentHeader = "", apartmentAttributes = "", apartmentString = ""; 
		String houseHeader = "", houseAttributes = "", houseString = ""; 
		String villaHeader = "", villaAttributes = "", villaString = ""; 
				
		welcomeString = String.format("%s","-------------------------------------------------------------------------------------------------------------------------------------------------------MyBnb---------------------------------------------------------------------------------------------------------------------------------------------------------\n\n\n");

		/*apartments*/
		apartmentHeader = String.format("%s","_____________________________________________________________________________________Apartments_____________________________________________________________________________________\n\n");

		apartmentAttributes = String.format("%s\t %s\t %s\t %s\t %s\t %s\t %s\t \n", "UniqueReg no.","Owner","Address","Total Days rented","Rent-Cost-Per-Day","Storey no.","no. beds");

		for(i = 0;i < apartments.size();i++)
		{		
			apartmentString += String.format("%s\t %s\t %s\t %s\t %s\t %s\t %s\t \n", apartments.get(i).getUniqueRegNum(),apartments.get(i).getOwnerName(),apartments.get(i).getPostalAddress(),
			apartments.get(i).getTotalNumberOfSeasonsRentalDays(), apartments.get(i).getRentalCostPerDay(), apartments.get(i).getStoreyNumber(), apartments.get(i).getNumberOfBeds());
		}
		
		outputString += welcomeString + apartmentHeader + apartmentAttributes + apartmentString + newLines;
		
		/*--------------------------------------------------------------------------------------------*/	

		
		/*houses*/
		houseHeader = String.format("%s","______________________________________________________________________________________Houses_______________________________________________________________________________________\n\n");

		houseAttributes = String.format("%s\t %s\t %s\t %s\t %s\t %s\t %s\t \n", "UniqueReg no.","Owner","Address","Total Days rented","Rent-Cost-Per-Day","no. stories","Clearing fees");

		for(i = 0;i < houses.size();i++)
		{		
			houseString += String.format("%s\t %s\t %s\t %s\t %s\t %s\t %s\t \n", houses.get(i).getUniqueRegNum(),houses.get(i).getOwnerName(),houses.get(i).getPostalAddress(),
			houses.get(i).getTotalNumberOfSeasonsRentalDays(), houses.get(i).getRentalCostPerDay(), houses.get(i).getTotalNumberOfStoreys(), houses.get(i).getClearingFees());
		}
		
		outputString += houseHeader + houseAttributes + houseString + newLines;
		
		/*--------------------------------------------------------------------------------------------*/	

		
		/*villas*/
		villaHeader = String.format("%s","_______________________________________________________________________________________Villas________________________________________________________________________________________\n\n");

		villaAttributes = String.format("%s\t %s\t %s\t %s\t %s\t %s\t %s\t %s\t \n", "UniqueReg no.","Owner","Address","Total Days rented","Rent-Cost-Per-Day","Total no. rooms","Room service cost per day","Luxury tax per day");

		for(i = 0;i < villas.size();i++)
		{		
			villaString += String.format("%s\t %s\t %s\t %s\t %s\t %s\t %s\t %s\t \n", villas.get(i).getUniqueRegNum(),villas.get(i).getOwnerName(),villas.get(i).getPostalAddress(),
			villas.get(i).getTotalNumberOfSeasonsRentalDays(),villas.get(i).getRentalCostPerDay(), villas.get(i).getTotalNumberOfRooms(), villas.get(i).getRoomServiceCostPerDay(),
			villas.get(i).getLuxuryTaxPerDay());
		}
		
		outputString += villaHeader + villaAttributes + villaString + newLines;

		/*--------------------------------------------------------------------------------------------*/	
		
		//Creating TextArea to properly format output for JOptionPane
		JTextArea jt = new JTextArea(outputString);
		jt.setOpaque(false);
		jt.setEditable(false);
		jt.setTabSize(15);
		JOptionPane.showMessageDialog(null, jt);
		
	}
	
	
	/**
	 * This method will calculate the total income from all properties including the additional costs and taxes .
	 * @param apartments,houses,villas
	 */
	public static int CalculateTotallIncome(ArrayList<BnbApartment> apartments, ArrayList<BnbHouse> houses, ArrayList<BnbVilla> villas)
	{
    	int TotalRentalIncome = 0, i;
    	
        for(i = 0;i < apartments.size();i++)
        	TotalRentalIncome += apartments.get(i).getTotalNumberOfSeasonsRentalDays() * apartments.get(i).getRentalCostPerDay();
        
        for(i = 0;i < houses.size();i++)
        	TotalRentalIncome += houses.get(i).getTotalNumberOfSeasonsRentalDays() * houses.get(i).getRentalCostPerDay()+houses.get(i).getClearingFees();
        
        for(i = 0;i < villas.size();i++)
        	TotalRentalIncome += (villas.get(i).getRentalCostPerDay() + villas.get(i).getRoomServiceCostPerDay() + villas.get(i).getLuxuryTaxPerDay()) * villas.get(i).getTotalNumberOfSeasonsRentalDays();
        
        return TotalRentalIncome;
    }

}

