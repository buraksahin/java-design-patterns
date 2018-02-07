/**
 * Wheel Enumeration
 */
public enum Wheel{
	BLACK(18), SILVER(18), GREY(20);

	private int inch;
	
	Wheel(int inch){
	    this.inch = inch;
	}
	
	@Override
	public String toString(){
		return name().toString();
	}
}
