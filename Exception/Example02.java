public class Example02{
	public static void main(String[] args){
		try{
			int result=divide(4,-2);
			System.out.println(result);
		}
		catch (DivideByMinusException e){
			System.out.println(e.getMessage());
		}
	}
	public static int divide(int x,int y) throws DivideByMinusException {
		if(y<0){
			throw new DivideByMinusException("�������Ǹ���");
		}
		int result=x / y;
		return result;
	}
}