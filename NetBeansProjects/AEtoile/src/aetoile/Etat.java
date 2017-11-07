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
   private boolean etatInitial=false;
   
    
    public boolean isFinal()
    {
        return this.etatFinal;
    }
    public void setFinalState()
    {
        this.etatFinal=true;
    }
    public boolean isInitial()
    {
        return etatInitial;
    }
    public void setInitialState()
    {
        this.etatInitial=true;
    }
    public void setX(int x)
    {
        this.x=x;
    }
    public void setY(int y)
    {
        this.y=y;
    }
    public int getX()
    {
        return x;
    }
    public int getY()
    {
        return y;
    }
    public Etat (int x, int y)
    {
        this.x=x;
        this.y=y;
    }
    
}
