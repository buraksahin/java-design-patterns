import java.io.FileNotFoundException;

/**
 * 
 * Abstract Parent Class
 *
 */

public class Test{

	public static void main(String[] args) throws FileNotFoundException {
		// Create OnlineSales
		OnlineSales customer1 = new OnlineSales("Burak", 1);
		customer1.setDiscount(15.0);
		customer1.CalculateTotalSales(100.0);
		
		// Create Sales
		Sales customer2 = new Sales("Sahin", 2);
		customer2.CalculateTotalSales(100.0);
	}

}
