import java.util.*;

public class probleme {
    //Trie bulle
    public static void echanger(int Tableau[], int i, int j) {
        int temp;
        temp = Tableau[i];
        Tableau[i] = Tableau[j];
        Tableau[j] = temp;
    }
    public static void Trie_bulle(int Tableau[]){
        int i;
        boolean inv;
        int taille = Tableau.length;

        do{
            inv = false;
            for(i=0; i<taille-1;i++)
            {
                if(Tableau[i]>Tableau[i+1]){
                    echanger(Tableau,i,i+1);
                    inv = true;
                }
            }
        }while(inv);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int p[];
        int nb,k;

        System.out.println("***Entrez le nombre d'elements du vecteur a trier***");
        nb = s.nextInt();
        p = new int[nb];
        System.out.println("Entrer les elements du vecteur");
        for(k=0; k<nb;k++)
            p[k] = s.nextInt();
        System.out.println("**VECTEURS NON TRIEE**");
        for(k=0; k<nb;k++)
            System.out.print("[ "+p[k]+" ]");
        Trie_bulle(p);
        System.out.println("\n**VECTEURS TRIEE PAR ORDRE CROISSANT**");
        for(k=0; k<nb;k++)
            System.out.print("[ "+p[k]+" ]");
    }
}