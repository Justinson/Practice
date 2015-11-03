/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import javax.swing.JOptionPane;

/**
 *
 * @author Justinson
 */
public class Practice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        testCircle();
//        main();
//        testUserCircle();
//        testUserRectangle();
          testCylinder();
    }

    public static void testCircle() {
//        double myRad = Circle.getArea(1.0);
//        System.out.println("The radius is " + myRad);
//
//        double myDiameter = Circle.getDiameter(3.14);
//        System.out.println("The diameter is " + myDiameter);
//
//        double myCircumference = Circle.getCircumference(3.14);
//        System.out.println("The circumference is " + myCircumference);
    }


    private static void testUserCircle() {
//        double aRadius = Double.valueOf( JOptionPane.showInputDialog("Please enter a radius"));
//        System.out.println("The radius is " + aRadius);
//        
//        double aDiameter = Circle.getDiameter(aRadius);
//        System.out.println("The diameter " + aDiameter);
//        
//        double aArea = Circle.getArea(aRadius);
//        System.out.println("The area is " + aArea);
//        
//        System.out.println("The area is " + Circle.getArea(aRadius));
//        
    }
    private static void testUserRectangle(){
//        double aLength = Double.valueOf( JOptionPane.showInputDialog("Please enter a length"));
//        System.out.println("The length is " + aLength);
//        
//        double aWidth = Double.valueOf( JOptionPane.showInputDialog ("Please enter a width"));
//        System.out.println("The width is " + aWidth);
//        
//        double aArea = Rectangle.getArea(aLength, aWidth);
//        System.out.println("The area is " + aArea);
//        
//        System.out.println("The perimeter is " + Rectangle.getPerimeter(aLength, aWidth));
    }
    private static void testCylinder(){
        double aRadius = Double.valueOf( JOptionPane.showInputDialog("Please enter a radius"));
        System.out.println("The radius is " + aRadius);
        
        double aHeight = Double.valueOf( JOptionPane.showInputDialog("Please enter a height"));
        System.out.println("The height is " + aHeight);
        
        double aVolume = Cylinder.getVolume(aRadius, aHeight);
        System.out.println("The volume is " + aVolume);
        
    }
}



