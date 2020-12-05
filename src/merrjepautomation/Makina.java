/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package merrjepautomation;

/**
 *
 * @author firec0de
 */
public class Makina {
    String name;
    
    public void setName (String name){
        this.name = name;
    }
    
    public String getName () {
        return name;
    }
    
     @Override
    public String toString(){
    return getName();}
}
