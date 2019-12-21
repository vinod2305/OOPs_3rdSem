import java.util.*;
class ValidateTriangle extends Exception{
	public String toString(){
		return "Enter valid Sides";
	}
}
public class triangle{
	public static void main(String args[]) throws ValidateTriangle{
		Scanner in=new Scanner(System.in);
		System.out.println("enter 3 sides");
		int a=in.nextInt();
		int b=in.nextInt();
		int c=in.nextInt();
		try{
			if(a+b<=c||b+c<=a||c+a<=b){
				throw new ValidateTriangle();
			}
			else{
				System.out.println("Valid triangle");
				double s=((double)a+(double)b+(double)c)/2;
				System.out.println("Area: "+(double)Math.sqrt(s*(s-(double)a)*(s-(double)b)*(s-(double)c)));
			}

		}
		catch(ValidateTriangle e){
			System.out.println(e);
		}
	}
}


