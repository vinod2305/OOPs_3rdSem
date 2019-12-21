import java.util.*;
interface cal{
	public int fun(int a,int b);
}
public class calc{
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		int x=in.nextInt();
		int y=in.nextInt();
		cal obj=(a,b)->(a+b);
		System.out.println("sum is "+obj.fun(x,y));
		cal obj1=(a,b)->(a-b);
		System.out.println("sub is "+obj1.fun(x,y));
	}
}







