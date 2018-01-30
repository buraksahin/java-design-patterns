/**
 *
 *	Java Interface Usage Example
 *
 */

public class Test{

	public static void main(String[] args){	
		// Create ExponentCaclulate as a new ExponentCalculatorV2
		ExponentCalculate powerCalculate = new ExponentCalculatorV1(4, 2);
		System.out.println(powerCalculate.pow());
		
		// Set ExponentCaclulate as a new ExponentCalculatorV2
		powerCalculate = new ExponentCalculatorV2(4, -2);
		System.out.println(powerCalculate.pow());
	}

}
