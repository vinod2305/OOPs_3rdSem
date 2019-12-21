import java.util.*;
public class seq{
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		String a=in.nextLine();
		a=a.toUpperCase();
		int c=0;
		for(int i=0;i<a.length()-1;i++){
			if(a.charAt(i)==a.charAt(i+1))
				c++;
		}
		System.out.println(a);
		System.out.println(c);
	}
}

