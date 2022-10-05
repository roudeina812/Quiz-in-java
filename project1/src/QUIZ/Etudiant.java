package paquetquiz;

import java.util.Scanner;

public class Etudiant {
	private String nom;
	private String prenom;
	private int cin;
	private int grp;
	private int score ;
	
	Scanner s= new Scanner (System.in);
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getCin() {
		return cin;
	}

	public void setCin(int cin) {
		this.cin = cin;
	}

	public int getGrp() {
		return grp;
	}

	public void setGrp(int grp) {
		this.grp = grp;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public Etudiant ()
	{
		nom ="";
		prenom="";
		cin=0;
		grp=0;
	}
	
	public boolean NomEtu (String ch)
	{
		boolean e;
		if(ch.equals(nom))
		{e=true; }
		else
		{e=false;}
		return e;
	}
	public void CopieEtudiant (Etudiant a)
	{
		nom=a.nom;
		prenom=a.prenom;
		cin=a.cin;
		grp=a.grp;
		score=a.score;
		
	}

	public void CreerEtudiant ()
	{
		System.out.println("donner votre nom");
		nom=s.next();
		System.out.println("donner votre prénom");
		prenom=s.next();
		System.out.println("saisir votre num de cin");
		cin=s.nextInt();
		System.out.println("donner le nom de votre groupe");
		grp=s.nextInt();
	}
	
	public void AfficherEtudiant ()
	{
		System.out.println("le nom    :" +nom);
		System.out.println("le prenom :" +prenom);
		System.out.println("le CIN    :" +cin);
		System.out.println("le groupe :" +grp);
		System.out.println("le score  :" +score);
		System.out.println("\n");
		
	}

}
