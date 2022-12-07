public class Main {

	public static void main(String[] args) {
		
		Monde monde1 = new Monde();
		Pays France = new Pays("France", 0, 0, 0, 0, 0, 0);
		Pays Allemagne = new Pays("Allemagne", 0, 0, 0, 0, 0, 0);
		monde1.attaquerPays(France, Allemagne);
		
//		int numIncrement = 0;
//		while(numIncrement < 101) {
//			System.out.println("--------------------------------------------------------------");
//			System.out.println("Nom d'incrementation : " + numIncrement);
//			System.out.println("Nombre total de pays : " + monde1.getMondeNbPays());
//			System.out.println("Nombre total de population dans le monde : " + monde1.getMondePopulation());
//			System.out.println("--------------------------------------------------------------");
//			numIncrement++;
//		}
		
	}

}
