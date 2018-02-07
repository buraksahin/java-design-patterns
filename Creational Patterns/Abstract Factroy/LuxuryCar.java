public class LuxuryCar implements Car{
	// LuxuryCar Variables
	private String name;
	private String features = "Luxury Car";

	// Initialization
	{
		System.out.println("Initialized LuxuryCar @" + hashCode());
	}

	public LuxuryCar(String cName){
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
