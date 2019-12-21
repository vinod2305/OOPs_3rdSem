class table{
	public synchronized void mul(int n){
	       for(int i=1;i<=10;i++){
	       		System.out.println(i+"*"+n+"="+i*n);
		}
	}
}

class test extends Thread{
	table a;
	int n;
	test(table a,int n){
		this.a=a;
		this.n=n;
	}
	public void run(){
		a.mul(n);
	}
}
public class tables{
	public static void main(String args[]){
		table a=new table();
		test obj=new test(a,8);
		test obj1=new test(a,9);
		obj.start();
		obj1.start();
	}
}
