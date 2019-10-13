public class DivideByMinusException extends Exception{
	public DivideByMinusException(){
		super();//调用Exception无参的方法进行构造
	}
	public DivideByMinusException(String message){
		super(message);//调用Exception有参的方法进行构造
	}
}