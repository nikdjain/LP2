package package1;
import java.util.Scanner;
public class Fun {
	private static Scanner s;

	public static void read()

	{
		s = new Scanner(System.in);
	}
	
	
public static float area_of_circle()
	{
       System.out.println("\n\tArea of a Circle");
       System.out.println("Enter radius:");
       float r=s.nextFloat();
       float ac=3.14f*r*r;
       System.out.println("\tArea:"+ac);
       return ac;
	 }
	
public static float perimeter_of_circle()
	   {
	System.out.println("\n\tPerimeter of a circle");
	System.out.println("Enter radius:");
            float r=s.nextFloat();
            float pc=3.14f*2*r;
           System.out.println("\tArea:"+pc);
	return pc;
	   }
	
	
 public static int area_of_squre()
	 {
      System.out.println("\n\tArea of a Square");
      System.out.println("Enter side:");
       int x=s.nextInt();
       int as=x*x;
       System.out.println("\tArea:"+as);
      return as;
	 }
	
public static int perimeter_of_squre()
              {
      System.out.println("\n\tPerimeter of Square");
      System.out.println("Enter side:");
      int X=s.nextInt();
      int p=4*X;
      System.out.println("\tPerimeter:"+p);
      return p;
	   }
		
public static float right_angled()
	{
      System.out.println("\n\tArea of a Right Angled Triangle");
       System.out.println("Enter height and base:");
       float h=s.nextFloat();
       float bs=s.nextFloat();
       float art=0.5f*h*bs;
       System.out.println("\tArea:"+art);
       return art;
	}
		
public static int area_of_rectangle()
	{
     System.out.println("\n\tArea of a Rectangle");
      System.out.println("Enter length and breadth:");
       int l=s.nextInt();
       int b=s.nextInt();
       int ar=l*b;
       if(ar<0)
       {
    	   System.out.println("Area: "+ar+" which is negative");
    	   return ar;
       }
       System.out.println("\tArea:"+ar);
       return ar;
	}
	
public static float curcumference_of_circle()
	{
       System.out.println("\n\tCircumference of a Circle");
        System.out.println("Enter radius:");
        float R=s.nextFloat();
       float C=3.14f*2f*R;
       System.out.println("\tCircumference:"+C);
       return C;
	}
	
public static int area_of_cube()
	   {
          System.out.println("\n\tArea of cube");
	System.out.println("Enter area of cube:");
            int a=s.nextInt();
            int acc=6*a*a;
            System.out.println("\tCube:"+acc);
	return acc;
	    }
	
public static int perimeter_of_rectangle()
	{
      System.out.println("\n\tPerimeter of a rectangle");
      System.out.println("Enter length and breadth:");
      int l=s.nextInt();
       int b=s.nextInt();
       int arr=2*l*b;
       System.out.println("\tPerimeter:"+arr);
       return arr;
	}
	
public static float area_of_sphere()
	{
      System.out.println("\n\tArea of sphere");
      System.out.println("Enter radius:");
       float r=s.nextFloat();
       float sp=3.14f*4*r*r;
       System.out.println("\tSurface_Area:"+sp);
       return sp;
	}
	
public static int cylinder()
	{
      System.out.println("\n\tVolume of cylinder");
      System.out.println("Enter base and height:");
       int h=s.nextInt();
       int b=s.nextInt();
       int vc=h*b;
       System.out.println("\tVolume:"+vc);
       return vc;
	}
	
public static float area_of_cylinder()
	{
   System.out.println("\n\tArea of cylinder");
   System.out.println("Enter radius and height:");
    float r=s.nextFloat();
    float h=s.nextFloat();
    float sc=3.14f*2*r*h;
       System.out.println("\tArea_of_cylinder:"+sc);
       return sc;
		}
	public static void main(String[] args)
	{
		read();
		area_of_circle();
		perimeter_of_circle();
		area_of_squre();
		perimeter_of_squre();
		right_angled();
		area_of_rectangle();
		curcumference_of_circle();
		area_of_cube();
		perimeter_of_rectangle();
		area_of_sphere();
		cylinder();
		area_of_cylinder();
		}


}
