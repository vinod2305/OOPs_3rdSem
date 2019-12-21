import java.util.*;
public class vowel{
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		String a=in.next();
		a=a.toLowerCase();
		StringBuffer n=new StringBuffer(a);
		for(int i=0;i<n.length();i++){
			if(n.charAt(i)=='a'||n.charAt(i)=='e'||n.charAt(i)=='o'||n.charAt(i)=='i'||n.charAt(i)=='u'){
				int x=a.charAt(i);
				x=x+1;
				n.setCharAt(i,(char)x);

	}
		}
		System.out.println(n);

}
}
