package ����������;
import java.util.*;
public class Example04243 {
	public static void main(String[] args){
		ArrayList list=new ArrayList();//����ArrayList����
		//��ArrayList����������ַ���Ԫ��
		list.add("Jack");//��ArrayList����������ַ���Ԫ��
		list.add("Rose");
		list.add("Tom");
		for (Object obj : list){//ʹ��foreachѭ������Arraylist����
			System.out.println(obj);//ȡ������ӡArrayList�����е�Ԫ��
		}
	}
}
