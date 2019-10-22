public class Test01{
	public static void main(String[] args){
		Teacher t=new Teacher();
		new Thread(t,"陈老师").start();
		new Thread(t,"杨老师").start();
		new Thread(t,"牛老师").start();
	}
}