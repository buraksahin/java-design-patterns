import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 *	Functional Interface
 */
public interface CarFactory {
	/**
	 * Creates factory placeholder for specified {@link Builder}s.
	 * @param consumer for the new builder to the factory.
	 * @return factory with specifiedConsumer<T>Builder}s
	 */
	static CarFactory Factory(Consumer<Builder> consumer){
		Map<CarTypes, Supplier<Car>> map = new HashMap<>();
		consumer.accept(map::put);
		return name -> map.get(name).get();
	}

	/**
	 * Creates an instance of the given type.
	 * @param carType representing enum of an object type to be created.
	 * @return new instance of a requested class implementing {@link Car} interface.
	 */
	Car Create(CarTypes carType);

}
