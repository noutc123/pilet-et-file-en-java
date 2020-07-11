 class List{

 char contenu;
List suivant ;

//creationl liste vide 
List (char x ,List a){

	contenu =x ;
	suivant =a ;

 }
 public List supprimer() {
		List p=this; //référence vers objet/cellule courant(e)
		List prec = null; //prédécesseur de p
		
		if(p!=null) { //x trouvé
			if (prec==null) //premier élément de la liste
				return (p.suivant);
		else {
				prec.suivant=p.suivant;
		return this;
		}
	}
	return this;
}
 
 public char  tete(){
 	return contenu ;
 } 
 public List queue (){
 	return  suivant;
 }





  public List insertion (char elem ,List a){
 	return new List(elem , a);
 }



public  void affiche(List node ){

	System.out.print("liste chaine entre :  " );
		while (node !=null) {

			
			System.out.print(" ["+node.contenu+"] " );
			node=node.suivant;
			if (node.suivant==null) {
				System.out.print(" ["+node.contenu+"] " );
			
				break;
			}
		}
	}

// permet d'inser en que de liste
public void insererEnQueue (char x){
//insere x en queue de liste
List p=this;//p=this, donc p différent de null ici !
List q = new List(x, null);
while(p.suivant != null){//on va à la fin de la liste
p=p.suivant;
}
p.suivant=q;
}




}