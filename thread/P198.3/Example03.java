public class Example03{
	public static void main(String[] args){
	PaperWindow pa=new PaperWindow();
    new Thread(pa,"老师1").start();
	new Thread(pa,"老师2").start();
	new Thread(pa,"老师3").start();
	}
}