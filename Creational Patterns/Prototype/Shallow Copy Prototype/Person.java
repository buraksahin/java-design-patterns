/**
 * Person Class
 */
class Person implements Cloneable{
	//Low-level object
	private Car car;
	private String name; 

	public Person(String personName, String carName){
		name = personName;
		car = new Car(carName);
	}

	// Getters and Setters
	public Car getCar(){
		return car;
	}

	public String getName(){
		return name;
	}

	public void setName(String personName){
		name = personName;
	}

	// Clone Object
	public Object clone() {
		// Shallow Copy
		try{
			return super.clone();
		}
		catch (CloneNotSupportedException e){
			return null;
		}
	}
}
