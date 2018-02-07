/**
 * NonLuxury SUV Class
 */
public class NonLuxurySUV implements SUV{
	// NonLuxurySUV Variables
	private String name;
	private String features = "Non-Luxury SUV";

	// Initialization
	{
		System.out.println("Initialized NonLuxurySUV @" + hashCode());
	}

	public NonLuxurySUV(String sName){
		name = sName;
	}

	public String getSUVName(){
		return name;
	}

	public String getSUVFeatures(){
		return features;
	}
	
	public void setSUVFeatures(String _features){
		features = _features;
	}
}
