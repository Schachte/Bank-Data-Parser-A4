// Assignment #: 4
// Name: Ryan Schachte
// StudentID: 1206017757
// Lecture: 1
// Section: A
// Description: Bank parser class parses the data the user enters so it can be segregated through the other classes. 
public class BankParser {
	
	public static Bank bankParser(String lineToParse)
	{
	
		Address AddressDetails = new Address(); // Creates a new object linking the Address class
		Bank BankDetails = new Bank(); // Creates a new object linking the Bank class
		
		String BankName = null;
		String BankID = null;
		String BankCity = null;
		String BankState = null;
		
		String splitInformation = lineToParse; //Stores the parameter into a string to add into the array
		
		String userInformation[] = splitInformation.split("/|,"); //Splits the users data from a single string into multiple sectors of an array
		
		
		//Assigning the users split data to the pre-defined variables.
		
		BankName = userInformation[0];
		BankID = userInformation[1];
		BankCity = userInformation[2];
		BankState =userInformation[3];
		
		//Setting the values to Address class
		
		AddressDetails.setCity(BankCity);
		AddressDetails.setState(BankState);
		
		
		//Setting the values to the Bank class
		
		BankDetails.setBankAddress(BankCity, BankState);
		BankDetails.setBankID(BankID);
		BankDetails.setBankName(BankName);
		
		
		return BankDetails;

		
	}

}
