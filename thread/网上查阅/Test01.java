public class Test01{
	public static void main(String[] args){
		Teacher t=new Teacher();
		new Thread(t,"����ʦ").start();
		new Thread(t,"����ʦ").start();
		new Thread(t,"ţ��ʦ").start();
	}
}