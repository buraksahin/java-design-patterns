import java.io.*;

/**
 *
 *	Customer Abstract Class
 *
 */

public abstract class Customer{
	
	// Customer Variables
	String customerName;
	int	customerID;
	
	// Customer Constructor
	public Customer(String _customerName, int _customerID) {
		customerName = _customerName;
		customerID = _customerID;
	}
	
	// Abstract Method
	protected abstract void CalculateTotalSales(double total);
	
	// Customer Save
	protected void Save(double salesPrice, String priceNote) throws FileNotFoundException{
		try{
			File fileUtil = new File(customerID + ".txt");
			FileOutputStream fOS = new FileOutputStream(fileUtil);
			OutputStreamWriter oSW = new OutputStreamWriter(fOS);    
            Writer fileWriter = new BufferedWriter(oSW);
            fileWriter.write(customerID + " " + customerName + " Total Sales: " + salesPrice + " " + priceNote);
            fileWriter.close();
		}
		catch (IOException e){
			e.printStackTrace();
		}	
	}

	// toString Method
	public String toString(){
		return "Customer Name: " + customerName + " Customer ID: " + customerID;
	}

	// Getters and Setters
	protected String getCustomerName() {
		return customerName;
	}

	protected void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	protected int getCustomerID() {
		return customerID;
	}

	protected void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	
}
