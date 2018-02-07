/**
 * Abstract Factory Test Class
 */
public class Test {
	public static void main(String[] args){
		// Create VehicleFactory
		VehicleFactory vehicleFactory = VehicleFactory.getVehicleFactory(VehicleFactory.LUXURY_VEHICLE);

		//Create Car1
		Car car1 = vehicleFactory.getCar();
		System.out.println(car1.getCarFeatures());

		// Create Car2
		Car car2 = vehicleFactory.getCar();
		System.out.println(car2.getCarFeatures());

		// Create SUV
		SUV suv = vehicleFactory.getSUV();
		System.out.println(suv.getSUVFeatures());
		
	}
}
