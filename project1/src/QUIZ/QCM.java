package paquetquiz;

import java.util.Scanner;

public class QCM {
private int Num;
private String texte1;
private option o11;
private option o21;
private option o31;
private option o41;

Scanner s= new Scanner (System.in);


public QCM()

{
	Num=0;
	texte1="";
	 o11= new option ();
	 o21= new option ();
	 o31= new option ();
	 o41= new option ();
}
public int getNum() {
	return Num;
}
public void setNum(int num) {
	Num = num;
}
public String getTexte1() {
	return texte1;
}
public void setTexte1(String texte1) {
	this.texte1 = texte1;
}
public option getO11() {
	return o11;
}
public void setO11(option o11) {
	this.o11 = o11;
}
public option getO21() {
	return o21;
}
public void setO21(option o21) {
	this.o21 = o21;
}
public option getO31() {
	return o31;
}
public void setO31(option o31) {
	this.o31 = o31;
}
public option getO41() {
	return o41;
}
public void setO41(option o41) {
	this.o41 = o41;
}



public void CreerQcm ()
{ 
 System.out.println("\ndonner le numéro de QCM");
 Num=s.nextInt();
 System.out.println(" donner le question de QCM");
 texte1=s.next();
 o11.CreerOption();
 o21.CreerOption();
 o31.CreerOption();
 o41.CreerOption();
}

public void AjouterOption (option a , option b , option c ,option d)
{
   o11.CopieOption(a);
   o21.CopieOption(b);	
   o31.CopieOption(c);	
   o41.CopieOption(d);	
}

public void AfficherQcm()
{

 System.out.println(Num + "-" + texte1 );
 System.out.println("\n");
 o11.AfficherOption();
 o21.AfficherOption();
 o31.AfficherOption();
 o41.AfficherOption();
 

}
 
public void ModifierQCM ()
{   
	int l,k;
	System.out.println(" donner le question de QCM modofié");
	 texte1=s.next(); 
	 do {
		 do {
	          System.out.println("donner le num d'option qui vous voulez le modifier");
	      	  k =s.nextInt();
	        }while((k>5)||(k<0));
	 switch(k) {
	 case 1 : o11.ModifierOption();break;
	 case 2 : o21.ModifierOption();break;
	 case 3 : o31.ModifierOption();break;
	 case 4 : o41.ModifierOption();break;
	 default: System.out.println("non");
	 }
	 
	 do{
      System.out.println("est-ce-que vous voulez modifier une autre chose ");
	  System.out.println("1-oui");
	  System.out.println("2-non");
	  l=s.nextInt();
	   }while((l!=1)&&(l!=2));
	 
	 }while((l==1));
	 
}
public void repondreQcm ()
{
	System.out.println( texte1 );
	System.out.println("\n");
	o11.repondreOption();
	o21.repondreOption();
	o31.repondreOption();
	o41.repondreOption();
	
	
}
public boolean RetourValidte(option a)
{ 
	return(a.isValidite());
}


public int validiteQcm ()
{
   int a ;
   if ((o11.comparer())&&(o21.comparer())&&(o31.comparer())&&(o41.comparer()))
   {a=1;} else {a=0;}
   return a;
}
public void CopieQcm (QCM a)
{
	Num= a.Num;
	texte1=a.texte1;
	o11.CopieOption(a.o11);
    o21.CopieOption(a.o21);	
	o31.CopieOption(a.o31);	
	o41.CopieOption(a.o41);
	
	
}

public void CorrectionQcm ()
{
	System.out.println("\n");
	System.out.println( texte1 );
	o11.correction();
	o21.correction();
	o31.correction();
	o41.correction();
	
}



}
