/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aetoile;

import java.util.ArrayList;
import java.util.Scanner;

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
        String initFinal=clavier.nextLine();
        System.out.println("Entrez les coordonnées de l'états initial puis ceux des états finaux ");
         
    }
        
    
}
