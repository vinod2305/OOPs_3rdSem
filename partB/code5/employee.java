import java.util.*;
class name extends Exception{
	String n;
	name(String n){
		this.n=n;
	}
	public String toString(){
		return n+"is not valid";
	}
}
class age extends Exception{
	int n;
	age(int n){
		this.n=n;
	}
	public String toString(){
		return n+"not valid";
	}
}
public class employee{
	public static void main(String args[]) throws age,name{
		Scanner in=new Scanner(System.in);
		System.out.println("enter employee and age");
		String n=in.next();
		int a=in.nextInt();
		int h;
		boolean f=true;
		try{
				h=Integer.parseInt(n);
				f=false;	
				throw new name(n);
			
		}
		catch(name e){
			System.out.println(e);
		}
		catch(Exception e){}	
		try{
			if(a>50){
				f=false;
				throw new age(a);
			}
		}
		catch(age e){
			System.out.println(e);
		}
		if(f==true){
			System.out.println("Deatils: "+n+" "+a);
		}
	}
}
