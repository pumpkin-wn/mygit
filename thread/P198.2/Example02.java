public class Example02{
	public static void main(String[] args){
		MyThread myThread=new MyThread();
		myThread.start();
		for(int i=1;i<=100;i++){
			System.out.println("main");
		}
	}
}