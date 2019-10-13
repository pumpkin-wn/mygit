//在程序中，有时候我们希望有些语句无论程序是否发生异常都要执行，用try..catch..finally语句用于捕捉异常
public class Example04{
	public static void main(String[] args){
		//下面的代码定义了一个try...catch...finally语句用于捕捉异常
		try{
			int result=divide(4,0);//调用divide（）方法
			System.out.println(result);
		} catch (Exception e){//对异常处理Exception
			System.out.println("捕捉的异常信息为："+e.getMessage());
			return;
		}finally{
			System.out.println("进入finally代码块");
		}
		System.out.println("程序继续往下进行执行S...");
	}
	//下面的方法实现了两个整数相除
	public static int divide(int x,int y){
		int result=x/y;//定义一个变量result记录两数相除的结果
		return result;//将结果返回
	}
}