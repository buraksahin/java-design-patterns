/**
 * Car Class - Builder Design Pattern
 * Includes Builder Class to build a new Car Object
 */
public final class Car{
	// Variables
	private final String name;
	private final Manufacturer manufacturer;
	private final Wheel wheel;
	private final Color color;

	// Initialization
	{System.out.println("Car initialized @" + hashCode());}

	// Constructor
	private Car(Builder builder){
		this.name = builder.name;
		this.manufacturer = builder.manufacturer;
		this.wheel = builder.wheel;
		this.color = builder.color;
	}

	// Getters and Setters
	/**
	 * @return name : String
	 */
	protected String getName() {
		return name;
	}

	/**
	 * 
	 * @return manufacturer : Manufacturer {@link Manufacturer}
	 */
	protected Manufacturer getmanufacturer() {
		return manufacturer;
	}

	/**
	 * 
	 * @return wheel : Wheel {@link Wheel}
	 */
	protected Wheel getWheel() {
		return wheel;
	}

	/**
	 * 
	 * @return color : Color {@link Color}
	 */
	protected Color getColor() {
		return color;
	}

	@Override
	public String toString(){
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("Created car is a ")
			.append(name)
			.append(", manufacturer is ")
			.append(manufacturer);
		if(color != null){
			stringBuilder.append(", car color is ").append(color);
		}
		if(wheel != null){
			stringBuilder.append(", has ").append(wheel).append(" wheels.");
		}
		return stringBuilder.toString();
	}

	/**
	 * Builder Class 
	 */
	public static class Builder{
		// Variables
		private String name;
		private Manufacturer manufacturer;
		private Wheel wheel;
		private Color color;
	
		// Initialization
		{System.out.println("Builder initialized @" + hashCode());}

		/**
		 * Builder Constructor with name and manufacturer
		 * @param name : String {@link String}
		 * @param manufacturer : Manufacturer {@link Manufacturer}
		 */
		public Builder(String name, Manufacturer manufacturer){
			if(name == null || manufacturer == null){
				throw new IllegalArgumentException("Name and manufacturer cannot be null.");
			}
			else{
				this.name = name;
				this.manufacturer = manufacturer;
			}
		}

		/**
		 * Get Builder withColor
		 * @param color : Color {@link Color}
		 * @return Builder {@link Builder}
		 */
		public Builder withColor(Color color){
			this.color = color;
			return this;
		}

		/**
		 * Get Builder with Wheel
		 * @param wheel : Wheel {@link Wheel}
		 * @return Builder {@link Builder}
		 */
		public Builder withWheel(Wheel wheel){
			this.wheel = wheel;
			return this;
		}
		
		/**
		 * Car Builder
		 * @return Car {@link Car}
		 */
		public Car build(){
			return new Car(this);
		}
	}
}
