public class Example03{
	public static void main(String[] args){
		//下面的代码定义了一个try...catch语句用于捕捉异常
		try{
			int result=divide(4,0);//调用divide（）方法
			System.out.println(result);
		} catch (Exception e){//对异常处理Exception
			System.out.println("捕捉的异常信息为："+e.getMessage());
		}
		System.out.println("程序继续往下进行执行...");
	}
	//下面的方法实现了两个整数相除
	public static int divide(int x,int y){
		int result=x/y;//定义一个变量result记录两数相除的结果
		return result;//将结果返回
	}
}
//在java语言中引入异常，以异常类的形式对这些非正常的情况进行封装通过异常处理机制对程序运行时发生的各种问题进行处理。