package entities;

public class Order {
	
	private final String code;	
	private int totalValue;
	//private double totalValue;
	
	
	// totalValue = Double
	
	/*public Order(String code, double totalValue) {
		this.code = code;
		this.totalValue = totalValue;
	}*/	
	
	/*public double getTotalValue() {
		return totalValue;
	}*/
	
	/*public void setTotalValue(double totalValue) {
		this.totalValue = totalValue;
	}*/
	
	// Calculando taxa através do condicional IF	
		/*public double calculateFee() {
			if (getTotalValue() > 100.0) {
				return getTotalValue() * 0.90;
			} else {
				return getTotalValue();
			}		
		}*/
	
	
	// totalValue = int
	
	public Order(String code, int totalValue) {
		this.code = code;
		this.totalValue = totalValue;
	}
	
	public int getTotalValue() {
		return totalValue;
	}
	
	public void setTotalValue(int totalValue) {
		this.totalValue = totalValue;
	}

	// Calculando taxa através do condicional Switch Case	
	public int calculateFee() {
		switch (getTotalValue()) {
			case 100:
				return getTotalValue() * 2;
			case 200:
				return getTotalValue() * 3;
			default:
				return getTotalValue();
 		}
	}
	
	
	@Override
	public String toString() {
		return "Order = {"+ "code: " + code + " value: " + getTotalValue() + "}";		
	}
}
