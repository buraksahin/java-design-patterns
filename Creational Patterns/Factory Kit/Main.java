/**
 * Java Design Patterns
 * Main Test Class for Factory Pattern Implementation
 * @author Burak SAHIN 
 */
public class Main {
	public static void main(String[] args){
		
		// Create CarFactory with carTypes supplier
		CarFactory carFactory = CarFactory.Factory( cars -> {
			cars.AddCar(CarTypes.SEDAN, Sedan::new);
			cars.AddCar(CarTypes.COUPE, Coupe::new);
		});
		
		// Create New Car
		Car newCar = carFactory.Create(CarTypes.SEDAN);
		System.out.println(newCar.toString());
	}
}
