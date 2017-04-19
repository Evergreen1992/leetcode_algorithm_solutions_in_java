package concurrentprogramming;

public class ConCurr extends Thread{
	static int num = 0 ;
	public void run(){
		synchronized(this){
			System.out.println(num ++);
		}
	}

	public static void main(String[] args) {
		for(int i = 0 ; i < 10; i ++){
			new ConCurr().start();
		}
	}

}
interface test{
	int a=1;
}





