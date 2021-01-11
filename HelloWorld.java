/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

/**
 *
 * @author crush
 */
public class HelloWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hello Java 2020!");
       
        // nedan skapar vi en objekt som heter circle1
        Circle circle1 = new Circle();
        
        // nedan ger vi objektet circle1 tillgång till metoden display() som finns i klassen Circle, 
        circle1.display();
        
    }
    
}
