package builder2;

public class TestBuilder2 {

	public static void main(String[] args) {
		Sandwich.Builder builder = new Sandwich.Builder("Integralna kiflu");
		
		builder.spread("majonez").spread("pavlaka").meat("kulen").salad("zelena").spread("kečap");
		builder.meat("šunka");
		
		
		Sandwich sandwich = builder.build();
		System.out.println(sandwich);

	}

}
