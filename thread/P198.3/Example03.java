public class Example03{
	public static void main(String[] args){
	PaperWindow pa=new PaperWindow();
    new Thread(pa,"��ʦ1").start();
	new Thread(pa,"��ʦ2").start();
	new Thread(pa,"��ʦ3").start();
	}
}