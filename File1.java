import java.util.*;
class File1 {

	Liste premier;
	File1(Liste suiv){
		premier=suiv;
	}

void enfiler ( int nvNombre )
 {
 	Liste  nouveau =new Liste(0,null); 	

		nouveau.contenu = nvNombre ;
	 nouveau.suivant = null ;
	 if (this.premier != null ) /* La file n'est pas vide */
 		{
 			Liste elementActuel = premier ;
			 while ( elementActuel.suivant != null )
			 {
			 elementActuel = elementActuel.suivant ;
			 }
			 elementActuel.suivant = nouveau ;
 		}

	 else /* La file est vide , notre élé ment est le premier */
	 {
	  this.premier = nouveau ;

	 }	
	}
String setvider(){
	this.premier=null;
	return "la File est de nouveau vide ";
}
	int defiler ( File1  file ){
		if ( file == null )
		 {
		  return -1;
		 }

		int nombreDefile = 0;
		 /* On vé rifie s'il y a quelque chose à dé filer */
		 if (file.premier != null )
		 {
			Liste elementDefile = file.premier ;
			 nombreDefile = elementDefile.contenu ;
			 file.premier = elementDefile.suivant ;
			  elementDefile =null;
 		}

 return nombreDefile ;

	}







	void afficherPile ( File1  pile )
	 {
		 if ( pile == null )
		 {
			System.out.printf("la pile est vide  " );
		 }
		 Liste actuel = pile.premier ;
System.out.printf("[  " );
		while ( actuel !=null )
		 {
		 System.out.printf("%d, ", actuel.contenu );
		 actuel = actuel.suivant ;
		 }
System.out.printf("] " );
		System.out.printf("\n");

	 }
	

}