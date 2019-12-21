public class alive extends Thread{
	public static void main(String args[]) throws InterruptedException{
		Thread t1=new Thread();
		Thread t2=new Thread();
		Thread t3=new Thread();
		Thread t4=new Thread();
		Thread t5=new Thread();
		t1.setPriority(7);
		t2.setPriority(2);
		t3.setPriority(5);
		t4.setPriority(10);
		t5.setPriority(1);
		t1.start();
		t1.sleep(1000);
		System.out.println("t1 "+t1.isAlive());
		t2.start();
                System.out.println("t2 "+t2.isAlive());
		t3.start();
                System.out.println("t3 "+t3.isAlive());
		t4.start();
		t4.sleep(1000);
                System.out.println("t4 "+t4.isAlive());
		t5.start();
                System.out.println("t5 "+t5.isAlive());

	}
}
