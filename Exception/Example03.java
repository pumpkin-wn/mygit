public class Example03{
	public static void main(String[] args){
		//����Ĵ��붨����һ��try...catch������ڲ�׽�쳣
		try{
			int result=divide(4,0);//����divide��������
			System.out.println(result);
		} catch (Exception e){//���쳣����Exception
			System.out.println("��׽���쳣��ϢΪ��"+e.getMessage());
		}
		System.out.println("����������½���ִ��...");
	}
	//����ķ���ʵ���������������
	public static int divide(int x,int y){
		int result=x/y;//����һ������result��¼��������Ľ��
		return result;//���������
	}
}
//��java�����������쳣�����쳣�����ʽ����Щ��������������з�װͨ���쳣������ƶԳ�������ʱ�����ĸ���������д���