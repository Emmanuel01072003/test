package model;
import java.util.List;

public class Zoo {
		private int visiteur;
	private List<Secteur> secteursAnimaux;
	private int nbvisiteurMawParSecteur;
	
	
	public Zoo(int visiteur, List<Secteur> secteursAnimaux, int nbvisiteurMawParSecteur) {
		super();
		this.visiteur = visiteur;
		this.secteursAnimaux = secteursAnimaux;
		this.nbvisiteurMawParSecteur = nbvisiteurMawParSecteur;
	}

	
	
	public int getVisiteur() {
		return visiteur;
	}
	public void setVisiteur(int visiteur) {
		this.visiteur = visiteur;
	}
	public List<Secteur> getSecteursAnimaux() {
		return secteursAnimaux;
	}
	public void setSecteursAnimaux(List<Secteur> secteursAnimaux) {
		this.secteursAnimaux = secteursAnimaux;
	}
	public int getNbvisiteurMawParSecteur() {
		return nbvisiteurMawParSecteur;
	}
	public void setNbvisiteurMawParSecteur(int nbvisiteurMawParSecteur) {
		this.nbvisiteurMawParSecteur = nbvisiteurMawParSecteur;
	}
	
	

}
