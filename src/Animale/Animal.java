
package Animale;

/**
 *
 * @author Alex
 */
public abstract class Animal {
    private String nume;
    private int varsta;
    
    public Animal(String a,int b){
        nume=a;
        varsta=b;
       }
    
    public void setNume(String a){
        nume=a;
    }
    
    public String getNume(){
        return nume;
    }
    
    public void setVarsta(int a){
        varsta=a;
        }
    
    public int getVarsta(){
        return varsta;
    }
    
    public abstract String showClass();
    public abstract int getMancare();
    public abstract String getAlimentatie();    
   
           
  
    public static void main(String[] args) {
       
    }
    
}
