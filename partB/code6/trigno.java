class thread1 extends Thread{
	double x;
	double a1;
	thread1(double x){
		this.x=x;
	}
	public void run(){
		a1=Math.sin(x);
	}
}
class thread2 extends Thread{
        double x;
	double a2;
        thread2(double x){
                this.x=x;
        }
        public void run(){
                a2=Math.cos(x);
        }
}
class thread3 extends Thread{
        double x;
	double a3;
        thread3(double x){
                this.x=x;
        }
        public void run(){
                a3=Math.tan(x);
        }
}

public class trigno{
	public static void main(String args[]){
		thread1 a=new thread1(30);
		thread2 b=new thread2(30);
		thread3 c=new thread3(30);
		a.start();
		b.start();
		c.start();
		try{
			a.join();
			b.join();
			c.join();
			System.out.println("ans is "+(a.a1+b.a2+c.a3));
		}
		catch(InterruptedException e){}
	}
}


