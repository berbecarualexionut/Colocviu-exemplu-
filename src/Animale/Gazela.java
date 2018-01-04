/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Animale;

/**
 *
 * @author Alex
 */
public class Gazela extends Animal {
     private String alimentatie="carnivor";
    private int mancare;
    
    public Gazela(String a,int b,int c){
        super(a,b);
        mancare=c;
               
    }
    
    public int getMancare(){
        return mancare;
    }
    
    public String showClass(){
        return "Gazela";
    }

    @Override
    public String getAlimentatie() {
        return alimentatie;
    }
    
}
