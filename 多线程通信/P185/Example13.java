public class Example13{
	public static void main(String[] args){
		Ticket1 ticket=new Ticket1();
		new Thread(ticket,"�߳�1").start();
		new Thread(ticket,"�߳�2").start();
		new Thread(ticket,"�߳�3").start();
		new Thread(ticket,"�߳�4").start();
		}
}