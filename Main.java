package com.bl.linecomparison;

public class Main {
     public static void main (String[] args) {
    	 
    	 Point p1 = new Point();
        p1.x = 4;
        p1.y = 2;

   	 Point p2 = new Point();
     p2.x = 5;
     p2.y = 9;
     
   	 Point p3 = new Point();
     p3.x = 4;
     p3.y = 2;
     
   	 Point p4 = new Point();
      p4.x = 5;
      p4.y = 9;
      
      Line line1 = new Line();
      line1.p1 = p1;
      line1.p2 = p2;
      
      Line line2 = new Line();
      line2.p3 = p3;
      line2.p4 = p4;
      
      Double lineLength1 = line1.getLengthLine1(p1, p2);
      Double lineLength2 = line2.getLengthLine1(p3, p4);
      System.out.println("Line 1 Length:" +lineLength1);
      System.out.println("Line 2 Length:" +lineLength2);
     		if (lineLength1.equals(lineLength2)) {
				System.out.println("Line 1 and Line 2 are equal");
			}
			else {
				System.out.println("Line 1 and Line 2 are not equal");
			}
		
     }
}
