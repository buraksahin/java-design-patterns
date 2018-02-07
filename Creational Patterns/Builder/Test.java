/**
 * Builder Test
 */
public class Test{
	public static void main(String[] args){
		// Create car1
		Car car1 = new Car.Builder("C series", Manufacturer.MERCEDES).build();
		System.out.println(car1);

		// Create car2
		Car car2 = new Car.Builder("6 series", Manufacturer.BMW).withColor(Color.WHITE).build();
		System.out.println(car2);

		// Create car3
		Car car3 = new Car.Builder("360 Modena", Manufacturer.FERRARI).withColor(Color.RED).withWheel(Wheel.BLACK).build();
		System.out.println(car3);

		// Create car4
		Car car4 = new Car.Builder("911 S Turbo", Manufacturer.PORSCHE).withColor(Color.BLACK).withWheel(Wheel.SILVER).withColor(Color.RED).withColor(Color.WHITE).build();
		System.out.println(car4);
	}
}
