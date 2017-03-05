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
public class Car {

    private final CarSize carSize;
    private final CarColor color;

    public Car(CarSize carSize, CarColor color) {
        this.carSize = carSize;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" + "carSize=" + carSize + ", color=" + color + '}';
    }

}
