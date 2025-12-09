package bestiaire;

public class Monstre {
private String nom; //Nom du monstre (ex : dragon, zombie ...)
private int type; //0 -> Aerien et 1 -> Terrestre
private int lvl; //Niveau du monstre
private int stat_attaque; //Statistique d'attaque
private int stat_defense; //Statistique de defense

public static void main(String args[]) {

}

public Monstre(String nom, int stat_attaque, int stat_defense) { //Constructeur
	type=0;
	lvl=0;
	this.nom=nom;
	this.stat_attaque = stat_attaque;
	this.stat_defense=stat_defense;
}

public void attaquer() { //Methode d'attaque
	
}

}
