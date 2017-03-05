/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reflaction;

/**
 *
 * @author G
 */
public enum CarColor {
    
    BLACK("Black"),GREEN("Green"),YELLOW("Yellow");
    
    private final String colorAsString;
    
    private CarColor(String colorString){
        this.colorAsString=colorString;
    }

    @Override
    public String toString() {
        return this.colorAsString;
    }
    
    
}
