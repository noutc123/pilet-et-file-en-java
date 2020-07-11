 class Liste{

 int contenu;
Liste suivant ;

//creationl liste vide 
Liste (int x,Liste a){

	contenu =x ;
	suivant =a ;

 }
 public Liste supprimer() {
		Liste p=this; //référence vers objet/cellule courant(e)
		Liste prec = null; //prédécesseur de p
		
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
 
 public int tete(){
 	return contenu ;//retourne la tete de la liste
 } 
 public Liste queue (){
 	return  suivant;
 }





  public Liste insertion (int elem ,Liste a){
 	return new Liste(elem , a);//insertion en tete de liste
 }



public  void affiche(Liste node ){

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
public void insererEnQueue (int x){
//insere x en queue de liste
Liste p=this;//p=this, donc p différent de null ici !
Liste q = new Liste(x, null);
while(p.suivant != null){//on va à la fin de la liste
p=p.suivant;
}
p.suivant=q;
}




}