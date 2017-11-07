/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aetoile;

import java.util.ArrayList;

/**
 *
 * @author TECHNOLOGIE
 */
public class Etat {
    
   private int x;
   private int y;
   private ArrayList<Etat> successeur= new ArrayList<Etat>();
   private boolean etatFinal= false;
   private double f;
    
    public boolean getState()
    {
        return this.etatFinal;
    }
    public void setState()
    {
        this.etatFinal=true;
    }
    public Etat (int x, int y)
    {
        this.x=x;
        this.y=y;
    }
}
