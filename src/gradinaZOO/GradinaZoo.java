/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gradinaZOO;

import Animale.*;
import java.util.ArrayList;

/**
 *
 * @author Alex
 */
public class GradinaZoo {
    private String nume;
    public ArrayList<Animal> array=new ArrayList<Animal>();
    private int nr_animale;
    private int carne=0;
    private int plante=0;
    
    public GradinaZoo(String a,int b){
        nume=a;
        nr_animale=b;
    }


public int getNrAnimale(){
    return nr_animale;
}

public void addAnimal(Animal a){
    array.add(a);
}

public void removeAnimal(Animal a){
    array.remove(a);
}

public void show_animal_in_cage(int cage){
    Animal temp=array.get(cage);
    if (temp==null){
        System.out.println("goala");
    }
    else{
        System.out.println(temp.showClass()+" "+temp.getNume()+" "+temp.getVarsta());
    }
}

public void afiseaza_animale(){
    for(Animal am:array){
        System.out.println(am.showClass()+" "+am.getNume()+" "+am.getVarsta()+" "+am.getAlimentatie());
    }
}

public void calculateFood(){
    for(Animal am:array){
        if(am.getAlimentatie().equals("carnivor")){
            carne=carne+am.getMancare();
            }
        else if(am.getAlimentatie().equals("ierbivor")){
            plante=plante+am.getMancare();
        }
        else if(am.getAlimentatie().equals("omnivor")){
        carne=carne+(am.getMancare()/2);
        plante=plante+(am.getMancare()/2);    
        }
        
    }
    System.out.println("cantitate carne:"+carne);
    System.out.println("cantitate plante:" +plante);
    
}

public String getName(){
    return nume;
}



public static void main(String[] args){
    GradinaZoo zoo=new GradinaZoo("Zoo",10);
    Leu leu=new Leu("Amir",10,2);
    Gazela gazela=new Gazela("Gazi",12,3);
    Lup lup=new Lup("Ion",7,4);
    Pinguin ping=new Pinguin("Marina",4,2);
    Urs urs=new Urs("Martin",12,6);
    zoo.addAnimal(urs);
    zoo.addAnimal(lup);
    zoo.addAnimal(gazela);
    zoo.addAnimal(ping);
    zoo.addAnimal(leu);
    zoo.show_animal_in_cage(3);
    zoo.afiseaza_animale();
    zoo.calculateFood();
    
}

}