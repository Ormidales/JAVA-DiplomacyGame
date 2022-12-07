import java.util.ArrayList;
import java.util.List;

public class Monde {
	
	private String mondeNom;
	@SuppressWarnings("unused")
	private int mondePopulation;
	@SuppressWarnings("unused")
	private int mondeNbPays;
	private List<Pays> pays;
	private int day;
	private int month;
	private int year;
	
	// METHODE PRINCIPALE
	public Monde() {
		this.mondeNom = "Monde";
		this.mondePopulation = 0;
		this.mondeNbPays = 0;
		this.pays = new ArrayList<>();
		this.day = 0;
		this.month = 0;
		this.year = 0;
	}
	
	// CREER UN PAYS
	public Pays createPays(String paysNom, int paysPopulation, int paysRelation, int paysArgent, int paysTaxes, int paysDefense, int paysOffense) {
		Pays pays = new Pays(paysNom, paysPopulation, paysRelation, paysArgent, paysTaxes, paysDefense, paysOffense);
		this.pays.add(pays);
		this.mondeNbPays++;
		return pays;
	}
	
	public String attaquerPays(Pays attaquant, Pays attaquer) {
	    int perteAttaquant = attaquer.getPaysDefense() - attaquant.getPaysOffense();
	    int perteAttaque = attaquant.getPaysDefense() - attaquer.getPaysOffense();
	    
	    attaquant.setPaysPopulation(attaquant.getPaysPopulation() - perteAttaquant);
	    attaquant.setPaysArgent(attaquant.getPaysArgent() - perteAttaquant);
	    attaquer.setPaysPopulation(attaquer.getPaysPopulation() - perteAttaque);
	    attaquer.setPaysArgent(attaquer.getPaysArgent() - perteAttaque);
	    
	    if (attaquer.getPaysPopulation() < 0) {
	        return attaquant.getPaysNom() + " a gagné la guerre contre " + attaquer.getPaysNom();
	    } else if (attaquant.getPaysPopulation() < 0) {
	        return attaquer.getPaysNom() + " a gagné la guerre contre " + attaquant.getPaysNom();
	    } else {
	        return "La guerre entre " + attaquant.getPaysNom() + " et " + attaquer.getPaysNom() + " est terminée en un match nul.";
	    }
	}
	
	// INCREMENT DAY
	public void incrementDay() {
	    this.day++;
	    	if (this.day > 30) {
	    	this.day = 1;
	      	this.month++;
	      	if (this.month > 12) {
	    	  this.month = 1;
	        	this.year++;
	      	}
	    }
	}
	
	// GETS
	public String getMondeNom() {
		return mondeNom;
	}
	public int getMondePopulation() {
		int totalPopulation = 0;
		for (Pays p : this.pays) {
			totalPopulation += p.getPaysPopulation();
		}
		return totalPopulation;
	}
	public int getMondeNbPays() {
		return this.pays.size();
	}
	public List<Pays> getPays() {
		  return this.pays;
	}
	public int getDay() {
		return day;
	}
	public int getMonth() {
		return month;
	}
	public int getYear() {
		return year;
	}
	
	// SETS
	public void setMondeNom(String mondeNom) {
		this.mondeNom = mondeNom;
	}
	public void setMondePopulation(int mondePopulation) {
		this.mondePopulation = mondePopulation;
	}
	public void setMondeNbPays(int mondeNbPays) {
		this.mondeNbPays = mondeNbPays;
	}
	public void setGames(List<Pays> pays) {
		  this.pays = pays;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	// RENOMMER SON MONDE
	public void renameMondeNom(String mondeNomNew) {
	  if (!this.mondeNom.equals(mondeNomNew)) {
	    this.setMondeNom(mondeNomNew);
	    this.mondeNbPays++;
	  }
	}
	
}
