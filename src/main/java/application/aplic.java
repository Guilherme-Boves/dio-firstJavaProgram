package application;
import entities.Order;

public class aplic {

	public static void main(String[] args) {
		
		Order order = new Order("1234", 200);		
		order.setTotalValue(order.calculateFee());
    	System.out.println(order);

	}
}
