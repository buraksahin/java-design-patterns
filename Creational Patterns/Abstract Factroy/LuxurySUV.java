/**
 * Luxury SUV Class
 */
public class LuxurySUV implements SUV{
	// LuxurySUV Variables
	private String name;
	private String features = "Luxury SUV";

	// Initialization
	{
		System.out.println("Initialized LuxurySUV @" + hashCode());
	}

	public LuxurySUV(String sName){
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
