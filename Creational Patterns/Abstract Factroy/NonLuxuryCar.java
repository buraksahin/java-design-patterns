/**
 * NonLuxuryCar Class
 */
public class NonLuxuryCar implements Car{
	// NonLuxuryCar Variables
	private String name;
	private String features = "Non-Luxury Car";

	// Initialization
	{
		System.out.println("Initialized NonLuxuryCar @" + hashCode());
	}

	public NonLuxuryCar(String cName){
		name = cName; }

	public String getCarName(){
		return name;
	}

	public String getCarFeatures(){
		return features;
	}
	
	public void setCarFeatures(String _features){
		features = _features;
	}
}
