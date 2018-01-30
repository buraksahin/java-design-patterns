/**
 *
 *	Exponent Calculator
 *
 */

public class ExponentCalculatorV1 implements ExponentCalculate{

	double base;			// Base Number
	double exponent;		// Exponent Number
	
	// Constructor
	public ExponentCalculatorV1(double _base, double _exponent){
		base = _base;
		exponent = _exponent;
	}

	//region POWER
	public double pow(){
		if(exponent==0){
			return 1.0;
		}
		else {
			exponent--;
			return base * pow();			
		}
	}
	//endregion

	// Getters and Setters
	protected double getBase(){
		return base;
	}

	protected void setBase(double _base){
		base = _base;
	}

	protected double getExponent() {
		return exponent;
	}

	protected void setExponent(double _exponent){
		exponent = _exponent;
	}

}
