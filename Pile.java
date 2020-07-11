import java.util.*;

public class Pile {
	private Liste L=null;
	public boolean estVide(){
		return (L==null);
	}
	public void empiler(int a) {
		L = new Liste(a, L);
	}
	public void affiche()
	{
		System.out.printf("pile version ");
		L.affiche(L);
	} 
	public int depiler() {//suppose que L!=null
		if (estVide()) {
			return -1;
		}

		int t=L.tete();
		L = L.queue();
		return t;
	}
	public int sommet(){
		return (L.tete());
	}
	public boolean vider (){
		L=null;
		return estVide();
	}
	
}