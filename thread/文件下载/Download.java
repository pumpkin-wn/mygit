public class Download{
	public static void main(String[] args){
		new Thread(new Down(),"路线一").start();
		new Thread(new Down(),"路线二").start();
	}
}