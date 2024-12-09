package strategy;

public class TestStrategy {

	public static void main(String[] args) {
		ShoppingCart studentShoppingCart = new ShoppingCart(new StudentDiscount());
		ShoppingCart pensionersShoppingCart = new ShoppingCart(new PensionersDiscount());
		
		double amount = 1000.0;
		
		System.out.println("Regularna cena: " + amount + " RSD");
		System.out.println("Studentska cena: " + studentShoppingCart.calculateTotal(amount) + " RSD");
		System.out.println("Penzionerska cena: " + pensionersShoppingCart.calculateTotal(amount) + " RSD");

		// BuffredWriter and BuffredReader
		// ObjectOutputStream and ObjectInputStream
	}

}
