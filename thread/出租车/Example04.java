public class Example04{
	public static void main(String[] args){
		TaxiWindow ta=new TaxiWindow();
		new Thread(ta,"˾��1").start();
		new Thread(ta,"˾��2").start();
		new Thread(ta,"˾��3").start();
		new Thread(ta,"˾��4").start();
		new Thread(ta,"˾��5").start();
	}
}