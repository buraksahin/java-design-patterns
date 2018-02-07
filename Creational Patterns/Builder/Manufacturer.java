/**
 * Manufacturer Enumeration
 */
public enum Manufacturer{
	MERCEDES, BMW, PORSCHE, FERRARI;

	@Override
	public String toString(){
		return name().toString();
	}
}
