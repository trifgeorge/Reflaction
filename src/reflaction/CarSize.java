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
public enum CarSize {

BIGCARS("BigCars"), SMALLCARS("SmallCars"), MEDIUMCARS("MediumCars");

private final String nameAsString;

private CarSize(String nameAsString){
    this.nameAsString=nameAsString;
}

    @Override
    public String toString() {
        return this.nameAsString;
    }


}