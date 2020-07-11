import java.util.*;

class Pile1{
	private int sommet;
	private int[] piles;
	Pile1(int capacite){
		piles = new int[capacite]; //créer une nouvelle p
		sommet = -1; //lorsque tu auras empiler un élément
	}
	int getSommet(){
		return piles[sommet];
	}
	boolean estVide(){
		if(sommet == -1){
		return true;
	}
		return false;
	}
	boolean estPleine(){
		if(sommet == piles.length-1){
		return true;
	}
	return false;
	}
	void empile(int element){
	if (estPleine()){
			//new throw Error("La pile est pleine impossible d")
		}
	piles[sommet+1] = element;
		sommet++;
	}
	int depile(){
		if (estVide()){
		//new throw Error("La pile est vide impossible de depile ")
		}
		sommet--; //inutile de la remplacer par une valeur
		return piles[sommet+1]; //on retourne la valeu
	}
	public void vider (){
		sommet =-1;
	}

	String versChaine(){ //Pour visualiser ta pile
		if(estVide()){
		return "[]";
		}
		if(sommet == 0){
		return "["+getSommet()+"]";
	}
	String nom =" ";
		for (int i=0;i<piles.length-1 ;i++ ) {
			nom+=" " +piles[i];			
		}
		return "["+getSommet()+""+nom+"]";
	}
	
	}