//�ڳ����У���ʱ������ϣ����Щ������۳����Ƿ����쳣��Ҫִ�У���try..catch..finally������ڲ�׽�쳣
public class Example04{
	public static void main(String[] args){
		//����Ĵ��붨����һ��try...catch...finally������ڲ�׽�쳣
		try{
			int result=divide(4,0);//����divide��������
			System.out.println(result);
		} catch (Exception e){//���쳣����Exception
			System.out.println("��׽���쳣��ϢΪ��"+e.getMessage());
			return;
		}finally{
			System.out.println("����finally�����");
		}
		System.out.println("����������½���ִ��S...");
	}
	//����ķ���ʵ���������������
	public static int divide(int x,int y){
		int result=x/y;//����һ������result��¼��������Ľ��
		return result;//���������
	}
}