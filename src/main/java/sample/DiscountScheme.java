package sample;

/**
 * We have 3 prices, calculate the total, the mean.
 * If the total is greater than some amount (minTotalForDiscount), we apply a discount to the total.
 */
public class DiscountScheme {

	public static void main(String[] args) {

		// variable declaration
		int price1 = 30; // together with assignment
		int price2;
		int price3;
		double meanPrice;
		double total;

		// assignment
		price2 = 1200;
		price3 = 40;
		total = price1 + price2 + price3;
		meanPrice = total / 3;
		
		System.out.println("The meanprice is " + meanPrice);

		double minTotalForDiscount = 500; // Java: camel case
		//min_total_for_discount; // snake case (Ruby?)
		
		double discount = 0.1;
				
		if (total > minTotalForDiscount) {
			System.out.println("The total before discount is " + total);
			total = total * (1 - discount);
			System.out.println("The total after discount is " + total);
		} else {
			System.out.println("The total without discount is " + total);
		}
	}
}
