package paquetquiz;

import java.util.Scanner;

public class Quiz {
	private boolean check;
	private String theme ;
	private String auteur;
	private QCM [] tab ;
	private int m;
	
	
	public Quiz ()
	{   check = false ;
		theme ="";
		auteur="";
		tab = new QCM [20];
		m=0;
		
	}

	public boolean isCheck() {
		return check;
	}
	public void setCheck(boolean check) {
		this.check = check;
	}
	public String getTheme() {
		return theme;
	}
	public void setTheme(String theme) {
		this.theme = theme;
	}
	public String getAuteur() {
		return auteur;
	}
	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}
	public QCM[] getTab() {
		return tab;
	}
	public void setTab(QCM[] tab) {
		this.tab = tab;
	}
	public int getM() {
		return m;
	}
	public void setM(int m) {
		this.m = m;
	}
	

	Scanner s= new Scanner (System.in);
	public void CreerQuiz()
	{  
		System.out.println("donner le theme de Quiz");
		theme=s.next();
		System.out.println("donner le nom d'auteur");
		auteur=s.next();
		System.out.println("donner le nombre de QCM");
		m=s.nextInt();;
		tab = new QCM[20] ;
		for(int i=0 ; i<m ; i++)
		{ 
		  tab[i]=new QCM();
		  tab[i].CreerQcm();	
		}
		
	}
	public void AjoutQcm (QCM a)
	{
		tab[m]=new QCM();
		tab[m].CopieQcm(a);
		m++;
		
	}
	
	public void CopieQuiz (Quiz a)
	{
		theme=a.theme;
		auteur=a.auteur;
		m=a.m;
		check=a.check;
		for(int i=0; i<20;i++)
		{
			tab[i]=a.tab[i];
		}
	}
	public void AfficherQuiz()
	{
		System.out.println(theme);
		System.out.println("\n");
		System.out.println(auteur);
		System.out.println("\n");
		for(int i=0 ; i<m ; i++)
		{   
			tab[i].AfficherQcm();
			System.out.println("\n");
		}
		
	}
	public boolean VuQuiz ()
	{
		boolean vu ;
		if((tab[1].RetourValidte(tab[1].getO11())==false)&&(tab[1].RetourValidte(tab[1].getO21())==false)&&(tab[1].RetourValidte(tab[1].getO31())==false)&&(tab[1].RetourValidte(tab[1].getO41())==false))
			vu=true;
		else 
			vu=false;
		
		return vu;
	}
	//pour verifier si l'etudiant a repondu a ce quiz
	
	public void ModifierQuiz ()
	{  
		int f,l;
	do{
	   { System.out.println("donner le numéro de QCM qui vous voulez le modifier");
	   f=s.nextInt();
	   } while (f>m);
	   tab[f].ModifierQCM();
	   do{
		      System.out.println("est-ce-que vous voulez modifier une autre chose ");
			  System.out.println("1-oui");
			  System.out.println("2-non");
			  l=s.nextInt();
		 }while((l!=1)&&(l!=2));
	   
	 }while((l==1));
	   
	}
	
	public void SupprimerQuiz(int pos)
	{
		for(int i=pos ;i<m ;i++)	
		{ tab[i]=tab[i+1]; }
	}
	
	public void RepondreQuiz ()
	{
		System.out.println("le theme :" +theme);
		System.out.println("\n");
		System.out.println("l auteur :" +auteur);
		System.out.println("\n");
		for(int i=0 ; i<m ; i++)
		{   
			tab[i].repondreQcm();
			System.out.println("\n");
		}
		
	}
	
	public int ScoreQuiz()
	{ int score=0;
	     
	for(int i=0 ; i<m ; i++)
	{   
		score=tab[i].validiteQcm();
	}
	
	   return score ;
		
	}
	
	public void correctionQuiz ()
	{
		for(int i=0;i<m;i++)
			tab[i].CorrectionQcm();
	}
	
	
	
	
	
}
