// Assignment #: 4
// Name: Ryan Schachte
// StudentID: 1206017757
// Lecture: 1
// Section: A
// Description: The address class takes the city/state data from the split array in the bankparser method to be print in the main assignment4 method. 
public class Address {

	//Private instance variables
	private String City;
	private String State;
	
	//Constructor for the Address class initializing the variables to a pre-defined value
	public Address()
	{
		City = "?";
		State = "?";
	}
	
	//Returns the city string called through parameter of another method
	public String getCity()
	{
		return City;
		
	}
	
	//Returns the state string called through parameter of another method
	public String getState()
	{
		return State;
		
	}
	
	//Sets the value of the city which is called from the bankParser class
	public void setCity(String city)
	{
		City = city;
	}
	
	//Sets the value of the state which is called from the bankParser clss
	public void setState(String state)
	{
		State = state;
	}
	
	//Outputs the bank location data to a nicely formatted string value
	public String toString()
	{

		return String.format(City+","+State);

	}
	

}
