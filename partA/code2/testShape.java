abstract class Shape{
	String color;
	boolean filled;

	Shape(){
		color="Green";
		filled=true;
	}
	Shape(String color,boolean filled){
		this.color=color;
		this.filled=filled;
	}

	boolean isFilled(){
		return filled;
	}
	String getColor(){
		return color;
	}
	void setFilled(boolean filled){
		this.filled=filled;
	}
	void setColor(String color){
		this.color=color;
	}
	public String toString(){
		if(filled)
			return "A Shape with color of "+color+" and filled";
		else
			return "A Shape with color of "+color+" and not filled";
	}
	abstract double getArea();
}

class Circle extends Shape{
	int radius;
	Circle(String color,boolean filled,int radius){
		super(color,filled);
		this.radius=radius;
	}
	
	double getArea(){
		return 3.14*(double)radius*(double)radius;
	}
	void display(){
		System.out.println("Area of circle is "+getArea());
	}
	void change(String c,boolean b){
		setColor(c);
		setFilled(b);
	}
}

class Rectangle extends Shape{
        int length, breadth;
        Rectangle(String color,boolean filled,int length,int breadth){
                super(color,filled);
                this.length=length;
                this.breadth=breadth;
        }
        double getArea(){
                return (double)length*(double)breadth;
        }
        void display(){
                System.out.println("Area of Rectangle is "+getArea());
        }
}

class Square extends Rectangle{
        Square(String color,boolean filled,int length){
                super(color,filled,length,length);
        }
        void display(){
                System.out.println("Area of Square is "+super.getArea());
        }
}

public class testShape{
	public static void main(String args[]){
	//	 Shape obj=new Shape();
	Circle obj1=new Circle("red",false,5);
	Rectangle obj2=new Rectangle("yellow",true,8,9);
	System.out.println(obj1);
	obj1.display();
	obj1.change("blue",true);
	System.out.println(obj1);
	System.out.println(obj2);
	obj2.display();
	}
}
