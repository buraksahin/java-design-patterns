/**
 * Car Class
 */
class Car{
	// Variables
	private String name;

	{System.out.println("Car initialized @" + hashCode());}
	// Constructor
	public Car(String s){
		name = s;
	}

	// Getters and Setters
	public String getName(){
		return name;
	}
	
	public void setName(String s){
		name = s;
	}
}