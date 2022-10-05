package paquetquiz;

import java.util.Scanner;

public class EnsEtu {

  private Etudiant[] E ;
  private int taille1 ;
  
  Scanner s=new Scanner(System.in);
  
  public EnsEtu ()
  {
	  E =new Etudiant [20];
	  taille1=0;
  }
  public int getTaille1() {
		return taille1;
	}
	public void setTaille1(int taille1) {
		this.taille1 = taille1;
	}
	
	public void AjouterEtudiant(Etudiant E1) 
	{  
	
			E[taille1]=new Etudiant();	
	    	E[taille1].CopieEtudiant(E1);
	    	taille1++;
		
	}
	
	public void AfficherEns()
	{
		for(int i=0;i<taille1;i++)
		{
			E[i].AfficherEtudiant();
		}
	}
	
	public void AfficheScore()
	{
		for(int i=0;i<taille1;i++)
		{
			System.out.println(E[i].getScore());
		}
	}
	
	public int NomEnsEtu(String c)
	{  int d=0;
		for(int i=0;i<taille1;i++)
		{
			if(E[i].NomEtu(c))
				d=i;
		}
		return d;
	}
	
	public Etudiant RetourEtu(int i)
	{
		Etudiant a=new Etudiant() ;
		a.CopieEtudiant(E[i]);
		return a;
	}
	
	public boolean NomEtu (String ch)
	{ boolean trouve=false;
		for(int i=0 ;i<taille1;i++)
		{
			if(ch.equals(E[i].getNom()))
			trouve=true;
		}
		return trouve;
	}
	
	
	
}
