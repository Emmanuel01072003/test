package model;
import java.util.*;

import enums.TypeAnimal;
import service.ZooService;

public class App {

	public static void main(String[] args) {
		
		
		//Animal
		Animal animal1=new Chien("Doggy",TypeAnimal.CARNIVORE);
		Animal animal2=new Chat("catty",TypeAnimal.CARNIVORE);
		
		//Secteur
		Secteur secteur1 = new Secteur(TypeAnimal.CARNIVORE,Arrays.asList(animal1,animal2));
		List<Secteur> secteurList = new ArrayList<Secteur>();
		secteurList.add(secteur1);
		
		//Mon Zoo
		Zoo monZoo= new Zoo(0,secteurList);
		
		ZooService zooService= new ZooService();
		
		System.out.println(monZoo.getSecteursAnimaux().size());
		System.out.println(monZoo.getVisiteur());
		
		zooService.ajouterSecteur(monZoo,TypeAnimal.HERBIVORE);
		zooService.ajouterVisiteur(monZoo);
		
		
		System.out.println(monZoo.getSecteursAnimaux().size());
		System.out.println(monZoo.getVisiteur());
	}

}
