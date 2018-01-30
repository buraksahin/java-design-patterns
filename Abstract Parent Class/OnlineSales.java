import java.io.FileNotFoundException;

public class OnlineSales extends Customer{
	
	double discount;
	
	public OnlineSales(String _customerName, int _customerID) {
		super(_customerName, _customerID);
	}

	@Override
	public void CalculateTotalSales(double total) {
		try {
			Save(total - total * discount / 100, "with " + discount + " discount.");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	// Setter
	protected void setDiscount(double _discount){
		discount = _discount;
	}

}
