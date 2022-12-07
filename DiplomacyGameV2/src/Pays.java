public class Pays {
	
	private String paysNom;
	private int paysPopulation;
	private int paysRelation;
	private int paysArgent;
	private int paysTaxes;
	private int paysDefense;
	private int paysOffense;
	
	// METHODE PRINCIPALE
	public Pays(String paysNom, int paysPopulation, int paysRelation, int paysArgent, int paysTaxes, int paysDefense, int paysOffense) {
		this.setPaysNom(paysNom);
		this.setPaysPopulation(paysPopulation);
		this.setPaysRelation(paysRelation);
		this.setPaysArgent(paysArgent);
		this.setPaysTaxes(paysTaxes);
		this.setPaysDefense(paysDefense);
		this.setPaysOffense(paysOffense);
	}
	
	// TOUTS LES GETS
	public String getPaysNom() {
		return paysNom;
	}
	public int getPaysPopulation() {
		return paysPopulation;
	}
	public int getPaysRelation() {
		return paysRelation;
	}
	public int getPaysArgent() {
		return paysArgent;
	}
	public int getPaysTaxes() {
		return paysTaxes;
	}
	public int getPaysDefense() {
		return paysDefense;
	}
	public int getPaysOffense() {
		return paysOffense;
	}
	
	// TOUTS LES SETS
	public void setPaysNom(String paysNom) {
		this.paysNom = paysNom;
	}
	public void setPaysPopulation(int paysPopulation) {
		this.paysPopulation = paysPopulation;
	}
	public void setPaysRelation(int paysRelation) {
		this.paysRelation = paysRelation;
	}
	public void setPaysArgent(int paysArgent) {
		this.paysArgent = paysArgent;
	}
	public void setPaysTaxes(int paysTaxes) {
		this.paysTaxes = paysTaxes;
	}
	public void setPaysDefense(int paysDefense) {
		this.paysDefense = paysDefense;
	}
	public void setPaysOffense(int paysOffense) {
		this.paysOffense = paysOffense;
	}
	
	// METHODE POUR RENOMMER LE PAYS
	public void renamePaysNom(String paysNameNew) {
		this.setPaysNom(paysNameNew);
	}
	
	
}
