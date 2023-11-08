package model;
import java.util.List;

import enums.TypeAnimal;

public class Secteur {
	private TypeAnimal typeAnimalDansSecteur;
	private List<Animal> animauxDansSecteur;
	
	public Secteur(TypeAnimal typeAnimalDansSecteur, List<Animal> animauxDansSecteur) {
		super();
		this.typeAnimalDansSecteur = typeAnimalDansSecteur;
		this.animauxDansSecteur = animauxDansSecteur;
	}
	
	
	public TypeAnimal getTypeAnimalDansSecteur() {
		return typeAnimalDansSecteur;
	}
	public void setTypeAnimalDansSecteur(TypeAnimal typeAnimalDansSecteur) {
		this.typeAnimalDansSecteur = typeAnimalDansSecteur;
	}
	public List<Animal> getAnimauxDansSecteur() {
		return animauxDansSecteur;
	}
	public void setAnimauxDansSecteur(List<Animal> animauxDansSecteur) {
		this.animauxDansSecteur = animauxDansSecteur;
	}
	

}
