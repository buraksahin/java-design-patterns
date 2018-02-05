import java.util.function.Supplier;

/**
 * Functional Interface 
 */
public interface Builder {
	/**
	 * Adding builder with name of the factory.
	 * @param enum carType specified {@link CarTypes}, supplier classes implementing {@Car} interface
	 * @return void
	 */
	void AddCar(CarTypes carType, Supplier<Car> supplier);
}
