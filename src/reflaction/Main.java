/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reflaction;

import java.lang.reflect.Constructor;

/**
 *
 * @author G
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Car c=new Car(CarSize.BIGCARS,CarColor.BLACK);
        //System.out.println(c.toString());
        Class<?> cc=c.getClass();
        
        //System.out.println(cc.getSimpleName());
        
        Constructor<?>[] con=cc.getConstructors();
        System.out.println(con[0].toString());
        Constructor<?> conn=con[0];
        
        Object obj=null;
        
        try {
            obj=conn.newInstance(CarSize.MEDIUMCARS, CarColor.YELLOW);
            System.out.println(obj);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        
        Object o=new BMW();
        
        Class<?> ccc=o.getClass();
        System.out.println(ccc.getName());
        
        Class<?> sup=ccc.getSuperclass();
        System.out.println(sup.getName());
        
        Class<?> top=sup.getSuperclass();
        System.out.println(top.getName());
    }
    
}
