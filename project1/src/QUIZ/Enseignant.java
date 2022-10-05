package paquetquiz;

import java.util.Scanner;

public class Enseignant {
  private String nomEsn ;
  private int num ;
  
  public Enseignant ()
  {
	  nomEsn ="";
	  num=0;
  }
  
  Scanner s= new Scanner (System.in);
  
  public void CreerEnseignant()
  {
	  System.out.println("donner votre nom");
	  nomEsn=s.next();
	  nomEsn=s.nextLine();
	  System.out.println("donner votre num ID");
	  num=s.nextInt();
  }
  
  public void AfficherEnseignant ()
  {
	  System.out.println(nomEsn);
	  System.out.println(num);
  }
  public Quiz EnsCreerQuiz ()
  {
	  Quiz A = new Quiz ();
	  A.CreerQuiz();
	  return A;
	  
  }
  public void EnsAfficherQuiz (String ch)
  {
	  TABQUIZ  Z = new TABQUIZ ();
	  Z.CreerTabQuiz();
	  for(int i=0; i< Z.getTaille();i++)
	  { 
		  if (ch.equals(Z.RetourTheme(i)))
		  {
			  Z.ConsulterTabQuiz(i);
		  }
		  }
	  
  }
  public void EnsSupprimerQuiz (String ch)
  {
	  TABQUIZ Z = new TABQUIZ ();
	  Z.CreerTabQuiz();
	  for(int i=0; i< Z.getTaille();i++)
	  { 
		  if (ch.equals(Z.RetourTheme(i)))
		  {
			  Z.SupprimerTabQuiz(i);
		  }
		  }
	  
  }
  public void EnsModifierQuiz (String ch)
  {
	  TABQUIZ Z = new TABQUIZ ();
	  Z.CreerTabQuiz();
	  Z.ModifierTabQuiz();
  }
  
  
}
