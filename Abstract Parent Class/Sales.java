import java.io.FileNotFoundException;

public class Sales extends Customer{
	
	public Sales(String _customerName, int _customerID) {
		super(_customerName, _customerID);
	}

	public void CalculateTotalSales(double total) {
		try {
			Save(total, "without discount");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
