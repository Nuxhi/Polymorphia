package polymorphia;

import java.io.*;
import java.util.ArrayList;

public class personnage {

	private String Nom;

	private float Atk_Lvl;
	private float Def_Lvl;
	private int Cpt_Lvl; // Niveau de compétence 
	private int health;

	//Zone de l'inventaire 
	
	//monnaie 
	private int IntCoin;
	private int Materia;
	
	//Equipement
	private ArrayList<Item> equipement_lst;
	private int equipement_atk;
	private int equipement_def;
	
	
	public personnage(String Nom) {
		this.Nom = Nom;
		Atk_Lvl = 1;
		Def_Lvl = 1;
		Cpt_Lvl = 1;
		health = 100;
		
		IntCoin = 50;
		Materia = 0;
		equipement_lst = new ArrayList<>();  // ← inventaire initialisé
		equipement_def = null; // par défaut on a pas d'item
		equipement_atk = null; // par défaut on a pas d'item

		
	}
	
	public void deplacer() {
		System.out.println(this.Nom + "se déplace");
	}
	
	public void attaquer() {
		System.out.println("commerce");
	}
	
	public void soigner() {
		System.out.println("commerce");
	}
	
	public void commercer() {
		System.out.println("commerce");
	}
	
	public void inventaire() {
		System.out.println("Voici les objets de votre inventaire :\n\n");
		
		System.out.println("Equipement : ");		
		System.out.println("Armur : " + this.equipement_def);
		System.out.println("Arme : " + this.equipement_atk);
		System.out.println("Arme : " + this.equipement_atk);
		
		System.out.println("Voici les objets de votre inventaire :\n\n");
		System.out.println("Autre : " + this.equipement_lst);
		
		System.out.println("Voici les monnaies disponbiles :\n\n");
		System.out.println("INTCOIN : " + this.IntCoin);
		System.out.println("Materia : " + this.Materia);
		
	}
	
	public void connexionMulti() {
		System.out.println("Indisponible");
	}
	
}
