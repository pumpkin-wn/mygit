public class Example04{
	public static void main(String[] args){
		TaxiWindow ta=new TaxiWindow();
		new Thread(ta,"司机1").start();
		new Thread(ta,"司机2").start();
		new Thread(ta,"司机3").start();
		new Thread(ta,"司机4").start();
		new Thread(ta,"司机5").start();
	}
}