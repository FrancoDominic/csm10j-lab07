/*
Programmer: Franco Lavares
Title:      Lab 7   
Date:       October 13, 2015
Filename:   Line.java
*/

package csm10jlab07;

public class Line 
{
    private static double x1, y1, z1, x2, y2, z2;
    
    //default constructor
    public Line(){}
    
//    //special constructor (doesn't work properly in test program)
//    public Line(double a, double b, double c)
//    {
//        x2 = a;
//        
//        y2 = b;
//        
//        z2 = c;
//    }
    
    //setters for Line1
    public void setLine1(double a, double b, double c)
    {
        x1 = a;
        
        y1 = b;
        
        z1 = c;
                
    }
    
    //setters for Line2
    public void setLine2(double a, double b, double c)
    {
        x2 = a;
        
        y2 = b;
        
        z2 = c;
    }
    
    //calculates the slope of Line1
    public String getSlope1()
    {
    
        if (y1 == 0)
        {
         return ("vertical. The slope is undefined.");
        }
    
        if (x1 == 0)
        {
         return ("horizontal. The slope is 0.");
        }
        
        else
        {
            Double m = new Double(x1);
            Double m2 = new Double(y1);
            Double slope1;
            
            slope1 = ((-1*m) / m2);
            
            return ("The slope of Line 1 is " + slope1);
        }
    }
    
    //calculates the slope of Line1
    public String getSlope2()
    {
    
        if (y2 == 0)
        {
         return ("vertical. The slope is undefined.");
        }
    
        if (x2 == 0)
        {
         return ("horizontal. The slope is 0.");
        }
        
        else
        {
            Double m3 = new Double(x2);
            Double m4 = new Double(y2);
            Double slope2;
            
            slope2 = ((-1*m3) / m4);
            
            return ("The slope of Line 2 is " + slope2);
        }
    }
    
    public String equals()
    {
        if ((x1 == x2) && (y1 == y2) && (z1 == z1))
            return ("The two lines are equal.");
        
        else
            return ("The two lines are not equal.");
    }
    
    public String parallelTo()
    {
        double m = ((-1 * x1) / y1);
        
        double m1 = ((-1 * x2) / y2);
        
        if (m == m1)
        {
            return ("The two lines are parallel.");
        }
        
        else 
        {
            return ("The two lines are not parallel.");
        }
    }
    
    public String perpendicularTo()
    {
        double m = ((-1 * x1) / y1);
        
        double m1 = ((-1 * x2) / y2);
        
        if ((x1 == 0) & (y2 == 0))
        {
            return ("The two lines are perpendicular.");
        }
        
        if ((x2 == 0) & (y1 == 0))
        {
            return ("The two lines are perpendicular.");
        }
        
        else if ((m * m1) == -1)
        {
            return ("The two lines are perpendicular.");
        }
        
        else
        {
            return ("The two lines are not perpendicular.");
        }
    }
    
    //getter methods for the variables
    public double getA1()
    {
        return x1;
    }
    
    public double getB1()
    {
        return y1;
    }
    
    public double getC1()
    {
        return z1;
    }
    
    public double getA2()
    {
        return x2;
    }
    
    public double getB2()
    {
        return y2;
    }
    
    public double getC2()
    {
        return z2;
    }
  
}
