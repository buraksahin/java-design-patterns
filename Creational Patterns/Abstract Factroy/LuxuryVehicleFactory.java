/**
 * Luxury Vehicle Factory
 */
public class LuxuryVehicleFactory extends VehicleFactory{
	// Initialization
	{
		System.out.println("Initialized LuxuryVehicleFactory @" + hashCode());
	}

	/**
	 * getCar: Luxury Car
	 * @return LuxuryCar
	 */
	public Car getCar(){
		return new LuxuryCar("Luxury Car");
	}

	/**
	 * getCar: Luxury SUV
	 * @return LuxurySUV
	 */
	public SUV getSUV(){
		return new LuxurySUV("Luxury SUV");
	}
}
