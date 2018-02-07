public abstract class VehicleFactory{
	// Variables
	public static final String LUXURY_VEHICLE = "Luxury";
	public static final String NON_LUXURY_VEHICLE = "Non-Luxury";

	// Abstract Methods
	public abstract Car getCar();
	public abstract SUV getSUV();

	// Initialization
	{
		System.out.println("Initialized VehicleFactory @" + hashCode());
	}

	/**
	 * getVehicleFactory
	 * 
	 * @param String type: Vehicle type
	 * @return VehicleFactory
	 */
	public static VehicleFactory getVehicleFactory(String type){
		if (type.equals(VehicleFactory.LUXURY_VEHICLE)){
			return new LuxuryVehicleFactory();
		}
		if (type.equals(VehicleFactory.NON_LUXURY_VEHICLE)){
			return new NonLuxuryVehicleFactory();
		}
		return new LuxuryVehicleFactory();
	}
}
