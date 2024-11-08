package singleton;

public class DatabaseConnection {
	
	// nestrpljivo učitavanje (eager loading)
	
	private static DatabaseConnection instance = new DatabaseConnection();
	
	private /*public*/ DatabaseConnection() {
		
	}

	// Implementacija neke konekcije na BP
	
	public static DatabaseConnection getInstance() {
		return instance;
	}	
	
}
