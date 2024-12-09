package builder1;

public class PizzaChef {
	
	private PizzaBuilder pizzaBuilder;

	public PizzaChef(PizzaBuilder pizzaBuiler) {
		this.pizzaBuilder = pizzaBuiler;
	}
	
	public Pizza makePizza() {
		this.pizzaBuilder.putDough();
		this.pizzaBuilder.putSauce();
		this.pizzaBuilder.putCheese();
		this.pizzaBuilder.putMeat();
		return this.pizzaBuilder.getPizza();
	}

}
