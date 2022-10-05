package paquetquiz;

import java.util.Scanner;

public class TABQUIZ {
    private EnsEtu [] S;
	private Quiz [] T ;
	private int N ;
	private int taille ;
	Scanner s=new Scanner (System.in);
	public TABQUIZ ()
	{
		N=0;
		taille= 0;
		T = new Quiz[20] ;
		S = new EnsEtu [20];
	}
	
	
	
	
	
	public Quiz[] getT()
	{return T;}
	public void setT(Quiz[] t)
	{T = t;}
	public int getN()
	{return N;}
	public void setN(int n) 
	{N = n;}
	public int getTaille() 
	{return taille;}
	public void setTaille(int taille)
{this.taille = taille;}
	public EnsEtu[] getS() {
		return S;
	}
	public void setS(EnsEtu[] s) {
		S = s;
	}




	public void CreerTabQuiz ()
	{   System.out.println("donner le nombre de quiz max");
	    N=s.nextInt();
		T = new Quiz[N];
		S = new EnsEtu[20] ;
		
	}
	public String RetourTheme (int i)
	{
		return T[i].getTheme();
	}
	
	public void AjouterEtudiant(int a, Etudiant b)
	{    
		if(S[a]==null)
		{S[a]=new EnsEtu();
		S[a].AjouterEtudiant(b);
		}
		else 
		S[a].AjouterEtudiant(b);	
	}
	public void AjouterEnsEtu()
	{
		S[taille]=new EnsEtu();
		taille++;
	}
	public void AjouterTabQuiz ()
	{
		T[taille]= new Quiz ();
		T[taille].CreerQuiz();
		taille ++;
		
		
	}
	
	public void AjoutQuiz (Quiz a)
	{
		T[taille]=new Quiz();
		T[taille].CopieQuiz(a);
		taille ++;
	}
	
	public void ConsulterTabQuiz (int i)
	{
	  
	  T[i].AfficherQuiz();
	}
	

	public void ConsulterEtudiant(int i)
	{
	  S[i].AfficheScore();
	}
	
	public void ConsulterEnsEtu (int i)
	{
	  S[i].AfficherEns();
	}
	
	public void ConsulterTabQuizVu()
	{   
		for(int i=0;i<taille;i++)
		   {if(T[i].VuQuiz())
           T[i].AfficherQuiz();}
	}
	public void SupprimerTabQuiz(int pos)
	{
		if(pos==(taille-1))
			taille--;
		for(int i=pos ;i<taille ;i++)	
		{ T[i]=T[i+1]; taille--;}
		
	}
	
	public void SupprimerEnsEtu(int pos)
	{
		for(int i=pos ;i<taille ;i++)	
		{ S[i]=S[i+1]; }
	}
	
	public void ModifierTabQuiz ()
	{
		System.out.println("donner le nom de Quiz qui vous voulez le modifier");
		String ch = s.next();
		for(int i=0 ;i<taille ;i++)
		{ if (ch.equals(T[i].getTheme()))
			T[i].ModifierQuiz(); 
		}
	}
	
	public void rechercheQuiz(String ch)
	{ Quiz Z ;
	  for(int i=0;i<taille;i++)
	  {
		  if(ch.equals(T[i].getTheme()))
		  {
	         Z=T[i];
		     Z.AfficherQuiz();
		  }
	  }
	  
	}
	
	public int rechercheEnsEtu(String ch)
	{ int Z=0 ;
	  for(int i=0;i<taille;i++)
	  {
		  if(ch.equals(T[i].getTheme()))
		  {
	         Z=i;
		    
		  }
	  }
	  return Z;
	  
	}
	//fail
	public void RepondreTabQuiz (int i)
	{
		T[i].RepondreQuiz();
		
	}
	
	public void CorrectionTabQuiz (int i)
	{
		
			T[i].correctionQuiz();
		
	}
	
	public int ScoreQuiz(int i)
	{
		int a;
		a =T[i].ScoreQuiz();
		return a;
	}
	
	public int TotaleScore (String ch)
	{
		int a=0;
		for(int i=0;i<taille;i++)
		{
			if(S[i].NomEtu(ch)) {
			int z=S[i].NomEnsEtu(ch);
			a= a + S[i].RetourEtu(z).getScore();
			}
		}
		
		return a;
	}
	
	public void AffecterScore (int i,String NOM)
	{
		int a = T[i].ScoreQuiz();
		int e=S[i].NomEnsEtu(NOM);
		S[i].RetourEtu(e).setScore(a);
		System.out.println(S[i].RetourEtu(e).getScore());
	}
	
	public void statistique ()
	{
		
	}
	
	
	
}
