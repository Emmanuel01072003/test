package service;
import java.util.*;

import enums.TypeAnimal;
import model.Animal;
import model.Secteur;
import model.Zoo;


public class ZooService {
	
	public void ajouterSecteur(Zoo zoo, TypeAnimal typeAnimal) {
		List<Animal> animalList = new ArrayList<Animal>();
		Secteur secteur = new Secteur(typeAnimal,animalList);
		
		List<Secteur> secteurs = zoo.getSecteursAnimaux();
	}
	
	public void ajouterVisiteur(Zoo zoo) {
		zoo.setVisiteur(zoo.getVisiteur()+1);
	}
}
