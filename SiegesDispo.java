/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Projet;



/**
 *
 * @author riadn
 */
public class SiegesDispo {
    private int capacite;
    private int nbpassager;
    
    //public SiegesDispo(int capa, int passagers){this.capacite=capa;this.nbpassager=passagers;}

    
    
    public int getCapacite(){
        return this.capacite;
    }
    
    public int getNbpassager(){
        return this.nbpassager;
    }
    
    public void setNombre1(int nombre){this.capacite=nombre;}
    public void setNombre2(int nombre){this.nbpassager=nombre;}
    
    public int calculplacedispo(){
        return this.capacite-this.nbpassager;
    }
}
