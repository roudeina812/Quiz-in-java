package paquetquiz;

import java.util.Scanner;

public class option {
	
	private String texte;
	private boolean reponse; 
	private boolean validite ;
	
	Scanner s= new Scanner (System.in);
	
	public option ()
	{
		texte=""      ;
		reponse=false ;
		validite=false;
		
	}
	public String getTexte() {
		return texte;
	}
	public boolean isValidite() {
		return validite;
	}
	public void setValidite(boolean validite) {
		this.validite = validite;
	}
	public void setTexte(String texte) {
		this.texte = texte;
	}
	public boolean isReponse() {
		return reponse;
	}
	public void setReponse(boolean reponse) {
		this.reponse = reponse;
	}
	
	public void CreerOption ()
	{int n;
	System.out.println("donner un texte");
	texte=s.nextLine();
	System.out.println("1-option valide");
	System.out.println("2-option invalide");
	do {
	 n =s.nextInt();
	}while((n!=1)&&(n!=2));
	if (n==1)
		reponse=true;
	else 
		reponse=false;
	}
	
	public void CopieOption(option a)
	{
		texte=a.texte;
		reponse=a.reponse;
		validite=a.validite;
	}
	
	public void AfficherOption ()
	{ 
		System.out.println(texte);
		System.out.println("\n");
	}
	
	

	/*public String gettexte()
	{ return texte;}
	public void settexte (String texte)
	{this.texte = texte;}*/
	
	public void repondreOption ()
	{
		int n;
		System.out.println(texte);
		System.out.println("1-option valide");
		System.out.println("2-option invalide");
		do {
		 n =s.nextInt();
		}while((n!=1)&&(n!=2));
		if (n==1)
			validite=true;
		else 
			validite=false;
	}
	public void ModifierOption ()
	{ 
		
		int n;
		System.out.println("donner le texte modifié");
	    texte=s.next();
		System.out.println("1-option valide");
		System.out.println("2-option invalide");
		do 
		{
		 n =s.nextInt();
		} while((n!=1)&&(n!=2));
		
		if (n==1)
			reponse=true;
		else 
			reponse=false;
		
		
		
	}
	public boolean comparer ()
	{
		
		return(reponse =validite) ;
		
	}
	
	public void correction ()
	{
		if(reponse==true)
			System.out.println(texte);
		
	}
}

