/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aetoile;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

/**
 *
 * @author TECHNOLOGIE
 */
public class AEtoile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.println("Entrez la longueur de la grille");
        int longueur =clavier.nextInt();
        System.out.println("Entrez la hauteur de la grille");
        int hauteur =clavier.nextInt();
        
        //création des états el leur ajout ligne par ligne dans la liste
        
        ArrayList<Etat> listEtat = new ArrayList<Etat>();
        
        for(int i=0;i<hauteur;i++)
        {
          for(int j= 0; j<longueur;j++)
          {
              Etat etat = new Etat(i,j);
              listEtat.add(etat);
              System.out.print("X");
              System.out.print("\t");
           }
          System.out.print("\n");
        }
        System.out.println("Entrez les coordonnées de l'états initial puis ceux des états finaux ");
        String initFInal=null; 
        try{ 
              InputStreamReader lecteur=new InputStreamReader(System.in); 
              BufferedReader entree=new BufferedReader(lecteur); 
              initFInal=entree.readLine(); 
           } 
        catch(IOException err){ 
        }
        //Je récupère l'état initial
        
        int xdebut=Integer.parseInt(initFInal.charAt(1)+"");
        int ydebut=Integer.parseInt(initFInal.charAt(3)+"");
        
        listEtat.get(xdebut*longueur+ydebut).setX(xdebut);
        listEtat.get(xdebut*longueur+ydebut).setY(ydebut);
        listEtat.get(xdebut*longueur+ydebut).setInitialState();
        
        //je récupère les états finaux
        
        String FInal=initFInal.substring(5, initFInal.length());
        int count =1;
        while(FInal!=null&&5<=FInal.length() )
        {
            System.out.println(FInal);
            xdebut=Integer.parseInt(FInal.charAt(1)+"");
            ydebut=Integer.parseInt(FInal.charAt(3)+"");
            listEtat.get(xdebut*longueur+ydebut).setX(xdebut);
            listEtat.get(xdebut*longueur+ydebut).setY(ydebut);
            listEtat.get(xdebut*longueur+ydebut).setFinalState();
            FInal=FInal.substring(5, FInal.length());
        }
        
        for(int i=0;i<hauteur;i++)
        {
          for(int j= 0; j<longueur;j++)
          {
              if(listEtat.get(i*longueur+j).isFinal())
                 System.out.print("F");
              else
                 if(listEtat.get(i*longueur+j).isInitial())
                     System.out.print("I");
                  else
                     System.out.print("X");
              System.out.print("\t");
           }
          System.out.print("\n");
        }
    }
        
    
}
