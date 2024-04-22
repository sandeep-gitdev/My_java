  class Shape {
  
  public static void main(String[] args){
               
            Shape shape = new Shape();
       
         // Area of circle
     int  radius = 7;
    double circle = shape.circle(radius);
       System.out.println(circle);
       
       
       // Area of rectangle
    int length = 4;
    int breath = 2;
    int rectangle = shape.rectangle(length,breath);
    System.out.println(rectangle);   
    
        // Area of triangle
      int base = 2;
      int height = 6;
      double triangle = shape.triangle(base,height);
      System.out.println(shape.triangle(base,height));
      
  
   }
  
  
  double circle (int r) {
        double area = (3.14)*(r*r);
   	return area;
   }
  
  int rectangle(int l, int b){
  	int area = l*b;
  	return area;
  }
  
  double triangle(int b, int h){
  	double area = (0.5)*b*h;
  	return area;
  }
  
  }
