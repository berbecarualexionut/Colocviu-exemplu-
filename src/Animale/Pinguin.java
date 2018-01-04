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
public class Pinguin extends Animal {
     private String alimentatie="omnivor";
    private int mancare;
    
    public Pinguin(String a,int b,int c){
        super(a,b);
        mancare=c;
               
    }
    
    public int getMancare(){
        return mancare;
    }
    
    public String showClass(){
        return "Pinguin";
    }

    @Override
    public String getAlimentatie() {
        return alimentatie;
    }
}
