public class Example05{
	public static void main(String[] args){
		TicketWindow tw=new TicketWindow();
		new Thread(tw,"����1").start();
		new Thread(tw,"����2").start();
		new Thread(tw,"����3").start();
		new Thread(tw,"����4").start();
	}
}