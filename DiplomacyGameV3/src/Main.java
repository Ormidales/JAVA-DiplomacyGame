public class Main {

	public static void main(String[] args) {
		
		Pays france = new Pays("France", 10, 4);
		Pays allemagne = new Pays("Allemagne", 1, 4);

		// La France attaque l'Allemagne
		france.attaque(allemagne);

	}

}
