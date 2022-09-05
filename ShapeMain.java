package Assessment1;
import java.util.*;

public class ShapeMain {

	

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			System.out.println("\tArea Calculator for different Shapes");
			System.out.println("\t------------------------------------");
			System.out.println("Enter 1 for Square");
			System.out.println("Enter 2 for Rectangle");
			System.out.println("Enter 3 for Circle");
			System.out.println("Enter 4 for Hexgon");
			System.out.println("Enter any other Number to exit");
			System.out.println("\n*****************************************************");
			int choice=sc.nextInt();
			if(choice==1) {
				System.out.print("Enter value for side: ");
				int side=sc.nextInt();
				Square obj=new Square(side);
				System.out.println("Area of Square: "+obj.calculateArea());
			}
			else if(choice==2) {
				System.out.print("Enter value for length: ");
				int length=sc.nextInt();
				System.out.print("Enter value for breadth: ");
				int breadth=sc.nextInt();
				Rectangle obj=new Rectangle(length,breadth);
				System.out.println("Area of Rectangle: "+obj.calculateArea());
			}
			else if(choice==3) {
				System.out.println("Enter value for radius: ");
				int radius=sc.nextInt();
				Circle obj=new Circle(radius);
				System.out.println("Area of Circle: "+obj.calculateArea());
			}
			else if(choice == 4)
			{
				System.out.print("Enter value for  hexagon side: ");
				int a = sc.nextInt();
				Hexagon obj=new Hexagon(a);
				System.out.println("Area of Hexagon: "+obj.HexagonArea());
			}
			else {
				System.out.println("Wrong choice");
			}
			

		}

	}
