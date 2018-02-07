/**
 * Luxury Vehicle Factory
 */
public class NonLuxuryVehicleFactory extends VehicleFactory{
	// Initialization
	{
		System.out.println("Initialized NonLuxuryVehicleFactory @" + hashCode());
	}

	/**
	 * getCar: get Non-Luxury Car
	 * @return NonLuxuryCar
	 */
	public Car getCar(){
		return new NonLuxuryCar("Non-Luxury Car");
	}

	/**
	 * getCar: get Non-Luxury SUV
	 * @return NonLuxurySUV
	 */
	public SUV getSUV(){
		return new NonLuxurySUV("Non-Luxury SUV");
	}
}
