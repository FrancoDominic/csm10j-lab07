/*
Programmer: Franco Lavares
Title:      Lab 7   
Date:       October 13, 2015
Filename:   Program.java
*/

import csm10jlab07.Line;

//package csm10jlab07;

public class Program 
{
 
    //default constructor
    public static void main(String[] args)
    {
        
        Line test = new Line();
        
        //test the setters with the default constructor for Line 1
        test.setLine1(1, 0, 3);
        test.setLine2(0, 2, 5);
        
        //test the getters for Line 1 and Line 2
        System.out.println("Testing the setters and getters:");
        System.out.println();
        System.out.println("Line 1:");
        System.out.println("The value of 'a' in Line 1 is " + (test.getA1()));
        System.out.println("The value of 'b' in Line 1 is " + (test.getB1()));
        System.out.println("The value of 'c' in Line 1 is " + (test.getC1()));
        System.out.println();
        System.out.println("Line 2:");
        System.out.println("The value of 'a' in Line 2 is " + (test.getA2()));
        System.out.println("The value of 'b' in Line 2 is " + (test.getB2()));
        System.out.println("The value of 'c' in Line 2 is " + (test.getC2()));
        System.out.println();
        
        //The special constructor doesn't work properly
//        Line test2 = new Line(2, 4, 5);
        
        //test the getters for Line 2 (doesn't work properly)
//        System.out.println("Line 2:");
//        System.out.println("The value of 'a' in Line 2 is " + (test2.getA2()));
//        System.out.println("The value of 'b' in Line 2 is " + (test2.getB2()));
//        System.out.println("The value of 'c' in Line 2 is " + (test2.getC2()));
        
        //test if the slope is defined
        System.out.println("Test: Is the slope of Line1 is defined?");
        System.out.println("The slope of Line1 is " + test.getSlope1());
        System.out.println();
        System.out.println("Test: Slope of Line2 is defined.");
        System.out.println("The slope of Line2 is " + test.getSlope2());
        System.out.println();
        
        //test if the slope is undefined using Double.isNaN
        Double testSlope1 = new Double(test.getA1() / test.getB1());
        Double testSlope2 = new Double(test.getA2() / test.getB2());
        System.out.println("Test: Is the slope of Line1 undefined?");
        System.out.println(Double.isNaN(testSlope1));
        System.out.println("Test: Is the slope of Line2 undefined?");
        System.out.println(Double.isNaN(testSlope2));
        System.out.println();
        
        //test 'equals' method
        System.out.println("Are the two lines equal?");
        System.out.println(test.equals());
        System.out.println();
        
        //test 'parallelTo' method
        System.out.println("Are the two lines parallel?");
        System.out.println(test.parallelTo());
        System.out.println();
        
        //test 'perpendicularTo' method
        System.out.println("Are the two lines perpendicular?");
        System.out.println(test.perpendicularTo());
        System.out.println();
    }
    
    
}
