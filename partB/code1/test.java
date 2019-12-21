class odd extends Thread{
	public void run(){
		int i=0,c=0;
		while(c<5){
			if(i%2!=0){
				System.out.println(i);
				c++;
			}
			i++;
			if(c==3){
				try{
					stop();
				}
				catch(Exception e){}
			}	
		}	
	}
}
class reverse extends Thread{
	int n;
	reverse(int n){
		this.n=n;
	}
	public void run(){
		int num=0,no=n;
		while(no>0){
			int dig=no%10;
			num=(num*10)+dig;
			no=no/10;
		}
		System.out.println("reverse of "+ n+" is "+num);
	}
}
public class test{
	public static void main(String args[]){
		odd obj1=new odd();
		obj1.start();
		reverse obj2=new reverse(123);
		obj2.start();
	}
}


