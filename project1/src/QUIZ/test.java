package paquetquiz;

import java.util.ArrayList;
import java.util.Scanner;

//import java.util.Scanner;


public class test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner (System.in);
 option A1= new option ();
 option A2= new option ();
 option A3= new option ();
 option A4= new option ();
 A1.setTexte("Orienté objet");
 A1.setReponse(false);
 A2.setTexte("Hiérarchique");
 A2.setReponse(false);
 A3.setTexte("Relationnel");
 A3.setReponse(true);
 A4.setTexte("Réseau");
 A4.setReponse(false);
 QCM B1=new QCM();
 B1.setNum(1);
 B1.setTexte1("MySQL est un système de gestion de base de données");
 B1.AjouterOption(A1, A2, A3, A4);
 option A5= new option ();
 option A6= new option ();
 option A7= new option ();
 option A8= new option ();
 A5.setTexte("Objets");
 A5.setReponse(false);
 A6.setTexte("Tables");
 A6.setReponse(true);
 A7.setTexte("Reseaux");
 A7.setReponse(false);
 A8.setTexte("Systèmes de fichiers");
 A8.setReponse(false);
 QCM B2=new QCM();
 B2.setNum(2);
 B2.setTexte1("À quoi correspondent les données d’une base de données MySQL?");
 B2.AjouterOption(A5, A6, A7,A8);
 option A9= new option ();
 option A10= new option ();
 option A11= new option ();
 option A12= new option ();
 A9.setTexte("SQL");
 A9.setReponse(true);
 A10.setTexte("Des appels réseau");
 A10.setReponse(false);
 A11.setTexte("Un langage de programmation comme C ++");
 A11.setReponse(false);
 A12.setTexte("APIs");
 A12.setReponse(false);
 QCM B3=new QCM();
 B3.setNum(2);
 B3.setTexte1("Comment la communication est-elle établie avec le serveur MySQL ?");
 B3.AjouterOption(A9, A10, A11,A12);
 
 Quiz C1 = new Quiz ();
 C1.setTheme("BASE DE DONNEES");
 C1.setAuteur("ROUDEINA");
 C1.AjoutQcm(B1);
 C1.AjoutQcm(B2);
 C1.AjoutQcm(B3);
 //C1.AfficherQuiz();
 option B11= new option ();
 option B21= new option ();
 option B31= new option ();
 option B4= new option ();
 B11.setTexte("Héritage");
 B11.setReponse(false);
 B21.setTexte("Encapsulation");
 B21.setReponse(false);
 B31.setTexte("Polymorphisme");
 B31.setReponse(false);
 B4.setTexte("Compilation");
 B4.setReponse(true);
 QCM D1=new QCM();
 D1.setNum(1);
 D1.setTexte1("Lequel des éléments suivants n’est pas un concept POO en Java?");
 D1.AjouterOption(B11, B21, B31, B4);
 option B5= new option ();
 option B6= new option ();
 option B7= new option ();
 option B8= new option ();
 B5.setTexte("Au moment de l’exécution");
 B5.setReponse(false);
 B6.setTexte("Au moment de la compilation");
 B6.setReponse(true);
 B7.setTexte("Au moment du codage");
 B7.setReponse(false);
 B8.setTexte("Au moment de l’exécution");
 B8.setReponse(false);
 QCM D2=new QCM();
 D2.setNum(2);
 D2.setTexte1("Quand la surcharge de méthode est-elle déterminée?");
 D2.AjouterOption(B5, B6, B7,B8);
 Quiz C2 = new Quiz ();
 C2.setTheme("POO");
 C2.setAuteur("ROUDEINA");
 C2.AjoutQcm(D1);
 C2.AjoutQcm(D2);
 //C2.AfficherQuiz();
 
 TABQUIZ T = new TABQUIZ ();
 T.AjoutQuiz(C1);
 T.AjoutQuiz(C2);
 Etudiant e1 = new Etudiant();
 Etudiant e2 = new Etudiant();
 Etudiant e3 = new Etudiant();
 e1.setNom("mkd");
 e1.setPrenom("Rima");
 e1.setCin(01733654);
 e1.setGrp(5);
 e1.setScore(3);
 T.AjouterEtudiant(0, e1);
 e2.setNom("Inoubli");
 e2.setPrenom("mariem");
 e2.setCin(00123456);
 e2.setGrp(3);
 e2.setScore(2);
 T.AjouterEtudiant(0, e2);
 e3.setNom("jmail");
 e3.setPrenom("nour");
 e3.setCin(00374625);
 e3.setGrp(6);
 e3.setScore(2);
 T.AjouterEtudiant(1, e3);
 
 

 
 
 
 
 
 
 
 
 
 
 

 int l=0,t=0;


// for(int i=0;i<T.getTaille();i++)
// T.ConsulterTabQuiz(i);
 ArrayList<Etudiant> etudiants = new ArrayList<Etudiant>();
 System.out.println("*****************Bienvenue*****************\n");
 do {
System.out.println("Veuillez choisir :\n");
System.out.println("1-Enseignant\n");
System.out.println("2-Etudiant\n");
int k=s.nextInt();

if(k==1)
{
 do {
       
	System.out.println("0-Se connecter\n");
	System.out.println("1-Créer un nouveau Quiz\n");
	System.out.println("2-Visualiser le Quiz d’un module donné\n");
	System.out.println("3-Supprimer le Quiz d’un module donné\n");
	System.out.println("4-Modifier le Quiz d’un module donné\n");
	System.out.println("5-Visualiser la liste des étudiants ayant passé le Quiz d’un module\n");
	System.out.println("6-Visualiser le taux de réponses justes et le taux de réponses fausses\n");
	System.out.println("7-Quitter Enseignant \n");
	System.out.println("8-Quitter completement \n");
      do {
     t=s.nextInt();
         }while(t>9);
     switch(t)
     {
     
     case 0 : {
    	        Enseignant Eng = new Enseignant ();
                Eng.CreerEnseignant();
              } break;
     case 1 : {
    	       Quiz C3 = new Quiz ();
               C3.CreerQuiz();
                T.AjoutQuiz(C3); 
                
              } break;
     case 2 : { for(int i=0 ;i<T.getTaille();i++)
                     { System.out.println((i) + "-" + T.RetourTheme(i));}
    	        int z =s.nextInt();
    	        String ch= T.RetourTheme(z);
    	        T.rechercheQuiz(ch);
    	        System.out.println(T.getTaille());
              }break;
     case 3 : {
    	          for(int i=0 ;i<T.getTaille();i++)
                    { System.out.println(i + "-" + T.RetourTheme(i));}
                      int z =s.nextInt();
                       T.SupprimerTabQuiz(z);
              }break;
     case 4 : {
                 T.ModifierTabQuiz(); 
              }break;
     case 5 : {
    	 for(int i=0 ;i<T.getTaille();i++)
               { System.out.println(i + "-" + T.RetourTheme(i));}
                int z =s.nextInt();
                T.ConsulterEnsEtu(z);
                T.ConsulterEtudiant(z);
                
              }break;
     case 6 : {
    	 
              }break;
     
     }
     

}while(t!=7);
 }
if(k==2)
{
	do{

	System.out.println("0-se connecter\n");
	System.out.println("1-visualiser les Quiz\n");
	System.out.println("2-Répondre à un Quiz d’un module donné\n");
	System.out.println("3-Consulter le Score totale\n");
	System.out.println("4-Consulter la correction d'un Quiz d’un module donné \n");
	System.out.println("5-Quitter Etudiant\n");
	System.out.println("6-Quitter completement\n");
	
	l=s.nextInt();
	switch(l)
    {
    
    case 0 : {
   	        Etudiant Etu = new Etudiant ();
               Etu.CreerEtudiant();
               etudiants.add(Etu);
             } break;
    case 1 : {
   	         T.ConsulterTabQuizVu(); 
             } break;
    case 2 : { 
    	 System.out.println("donnez votre nom svp");
            String ch = s.next();
    	System.out.println("es-tu inscrit ??");  
    	System.out.println("1-oui");  
    	System.out.println("2-oui");  
    	int q= s.nextInt();
    	int d=0;
    	if(q==1)
    	       { for(int i=0 ;i<T.getTaille();i++)
                    { System.out.println(i + "-" + T.RetourTheme(i));}
   	                int z =s.nextInt();
   	               
   	                for(int i=0 ;i<etudiants.size();i++)  // for(int i=0 ;i<T.getTaille();i++)
   	                   { 
   	                 	   if(ch.equals(etudiants.get(i).getNom()))
   	                 	   { d=i; }
   	                   }
   	                T.AjouterEtudiant(z,etudiants.get(d));
   	          T.RepondreTabQuiz(z);
   	          T.AffecterScore(z, ch);
   	           }
    	else
    	{
    		Etudiant Etu = new Etudiant ();
            Etu.CreerEtudiant();
            etudiants.add(Etu);
            for(int i=0 ;i<T.getTaille();i++)
            { System.out.println(i + "-" + T.RetourTheme(i));}
                  int z =s.nextInt();
                  T.AjouterEtudiant(z,Etu);
    	          T.RepondreTabQuiz(z);
    	          T.AffecterScore(z, ch);
    	}
   	          
   	        
             }break;
    case 3 : {
    	        System.out.println("donnez votre nom svp");
                String ch = s.next();
                
                System.out.println(T.TotaleScore(ch));
   	          
             }break;
    case 4 : {
    	         for(int i=0 ;i<T.getTaille();i++)
                  { System.out.println(i + "-" + T.RetourTheme(i));}
                    int z =s.nextInt();
                    
                    T.CorrectionTabQuiz(z); 
             }break;
    
    }
	

}while(l!=5);
}
 }while((t!=8)&&(l!=6));
 
 
 
 

 
 

 
 
 
 
		
		
 
   
  
  
  
  
  
  
	}

}
