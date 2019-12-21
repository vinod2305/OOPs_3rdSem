import java.util.*;
abstract class Vehicle{
	boolean hashelmet;
	int year_of_manufacture;
	
	Vehicle(boolean h,int y){
		hashelmet=h;
		year_of_manufacture=y;
	}

	abstract void getData();
	abstract void putData();
}
class TwoWheeler extends Vehicle{
	private String brand;
	protected int cost;
	String engineType;
	public String color;

	TwoWheeler(int y){
                super(true,y);
        }
	void getData(){
		Scanner in=new Scanner(System.in);
		System.out.println("Enter Brand name:");
		brand=in.next();
		System.out.println("Enter Cost:");
                cost=in.nextInt();
		System.out.println("Enter Engine Type:");
                engineType=in.next();
		System.out.println("Enter Color:");
                color=in.next();
	}
	void putData(){
		System.out.println("----------Details-----------");
		System.out.println("Brand: "+brand);
		System.out.println("Cost: "+cost);
		System.out.println("Engine Type: "+engineType);
		System.out.println("Color: "+color);
		System.out.println("Year of manufacture: "+year_of_manufacture);
		System.out.println("Has Helmet: "+hashelmet);
	}
}

class MyTwoWheeler extends TwoWheeler{
	String ownerName;
	MyTwoWheeler(String name,int y){
		super(y);
		ownerName=name;
	}
	void display(){
		getData();
		putData();
		System.out.println("OwnerName: "+ownerName);
	}
}

final class FourWheeler extends Vehicle{
	private String brand;
        protected int cost;
        String engineType;
        public String color;

	FourWheeler(int y){
             	super(false,y);
        }
	void getData(){
		Scanner in=new Scanner(System.in);
                System.out.println("Enter Brand name:");
                brand=in.next();
                System.out.println("Enter Cost:");
                cost=in.nextInt();
                System.out.println("Enter Engine Type:");
                engineType=in.next();
                System.out.println("Enter Color:");
                color=in.next();
	}
	void putData(){
                System.out.println("----------------Details------------");
                System.out.println("Brand: "+brand);
                System.out.println("Cost: "+cost);
                System.out.println("Engine Type: "+engineType);
                System.out.println("Color: "+color);
                System.out.println("Year of manufacture: "+year_of_manufacture);
                System.out.println("Has Helmet: "+hashelmet);
        }


}

//class test extends FourWheeler{}

public class testVehicle{
	public static void main(String args[]){
	//	Vehicle obj=new Vehicle();
		FourWheeler obj=new FourWheeler(1990);
		obj.getData();
		obj.putData();		
	}
}
