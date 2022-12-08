public class Pays {
  private String nom;
  private int nombreArmees;
  private int niveauAlliance;

  public Pays(String nom, int nombreArmees, int niveauAlliance) {
    this.nom = nom;
    this.nombreArmees = nombreArmees;
    this.niveauAlliance = niveauAlliance;
  }

  public String getNom() {
    return this.nom;
  }

  public int getNombreArmees() {
    return this.nombreArmees;
  }

  public void setNombreArmees(int nombreArmees) {
    this.nombreArmees = nombreArmees;
  }
  
  public int getNiveauAlliance(Pays autrePays) {
    return this.niveauAlliance;
  }
  
  public void attaque(Pays paysAttaque) {
    // Déterminez le nombre d'armées du pays attaquant et du pays attaqué
    int nombreArmeesAttaquant = this.getNombreArmees();
    int nombreArmeesAttaque = paysAttaque.getNombreArmees();

    // Appliquez les règles du Diplomacy pour déterminer le résultat de l'attaque
    if (this.getNiveauAlliance(paysAttaque) > 5) {
        // Les deux pays ont un niveau d'alliance élevé : ils n'attaquent pas
        System.out.println(this.getNom() + " et " + paysAttaque.getNom() + " ont un niveau d'alliance élevé, ils ne s'attaquent pas !");
    } else if (nombreArmeesAttaquant > nombreArmeesAttaque) {
      // L'attaquant gagne : il enlève une armée au pays attaqué
      paysAttaque.setNombreArmees(nombreArmeesAttaque - 1);
      System.out.println(this.getNom() + " a gagné l'attaque contre " + paysAttaque.getNom() + " !");
      System.out.println(paysAttaque.getNom() + " à perdu 1 armée sur ce tour ! Il lui en reste " + paysAttaque.getNombreArmees() + " !");
      if (paysAttaque.estElimine()) {
    	  System.out.println(paysAttaque.getNom() + " a été éliminé du jeu !");
      }
    } else if (nombreArmeesAttaquant < nombreArmeesAttaque) {
      // L'attaquant perd : il enlève une armée à lui-même
      this.setNombreArmees(nombreArmeesAttaquant - 1);
      System.out.println(this.getNom() + " a perdu l'attaque contre " + paysAttaque.getNom() + " !");
      System.out.println(this.getNom() + " à perdu 1 armée sur ce tour ! Il lui en reste " + this.getNombreArmees() + " !");
    } else {
      // Egalité : chacun enlève une armée à l'autre
      paysAttaque.setNombreArmees(nombreArmeesAttaque - 1);
      this.setNombreArmees(nombreArmeesAttaquant - 1);
      System.out.println("L'attaque entre " + this.getNom() + " et " + paysAttaque.getNom() + " s'est soldée par une égalité !");
      System.out.println("Les deux nations perdent donc 1 armée chacune, il en reste " + this.getNombreArmees() + " pour " + this.getNom() + " et il en reste " + paysAttaque.getNombreArmees() + " pour " + paysAttaque.getNom() + " !");
    }
  }
  
  public boolean estElimine() {
    return this.getNombreArmees() == 0;
  }

  public void elimine(Pays paysElimine) {
    if (paysElimine.estElimine()) {
      System.out.println(paysElimine.getNom() + " a été éliminé du jeu !");
      // Supprimez les informations sur le pays éliminé (par exemple en le retirant d'une liste de pays)
    }
  }
}
