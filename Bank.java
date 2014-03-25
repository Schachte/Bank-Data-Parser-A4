// Assignment #: 4
// Name: Ryan Schachte
// StudentID: 1206017757
// Lecture: 1
// Section: A
// Description: The Bank class applies the data in the split array to each method so it can print the data in the main Assignment 4 method. 
public class Bank {
	
	//Private instance variables for the class
	private String BankName;
	private String BankID;
	private String BankAddress;


		//Constructor for the bank class that pre-initializes the values of the variables to "?";
		public Bank()
		{
			BankName = "?";
			BankID = "?";
			BankAddress = "?";

		}
		
		//Returns the bankName string which is called from the parameter of the BankParser class in another method
		public String getBankName()
		{
			
			return BankName;
		}
		
		//BankID called from the setter method for BankID
		public String getBankID()
		{
			return BankID;
		}
		
		//Returns the BankAddress which is called as a parameter from the BankParser class in another method
		public String getBankAddress()
		{
			return BankAddress;
		}
		
		//Sets the name of the bank which is called as a parameter from the bankParser class
		public void setBankName(String bankName)
		{
			BankName = bankName;
		}
		
		//Sets the bankID of the user which is called as a parameter called from the bankParser class
		public void setBankID(String bankID)
		{
			BankID = bankID;
		}
		
		//Sets the bank address of the user which is called from two parameters called from the bankParser class
		public void setBankAddress(String city, String state)
		{
			BankAddress = city + "," + state;
		}
		
		//Formats all the data from all the classes and formats it nicely into a single string. This
		//method is called in the main method to print all the data is a nice fashion for the user to see
		public String toString()
		{
		
		return String.format("\nBank name:\t\t" + BankName+"\nBank ID:\t\t" + BankID+"\nBank address:\t\t"+getBankAddress()+"\n\n");
		
		}
		


	 
	
	
	
	

}
