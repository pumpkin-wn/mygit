package ����������;
import java.util.*;
public class Example02241 {
	public static void main(String[] args){
		LinkedList link=new LinkedList();//����LinkedList����
		link.add("stu1");
		link.add("stu2");
		link.add("stu3");
		link.add("stu4");
		System.out.println(link.toString());//ȡ������ӡ�ü����е�Ԫ��
		link.add(3,"Student");//��ü����е�ָ��Ԫ�ز���Ԫ��
		link.addFirst("First");//��ü����еĵ�һ��λ�ò���Ԫ��
		System.out.println(link);
		System.out.println(link.getFirst());//ȡ���ü����еĵ�һ��Ԫ��
		link.remove(3);//�Ƴ��ü����е�ָ��λ�õ�Ԫ��
		link.removeFirst();//�Ƴ��ü�����ָ��λ�õ�Ԫ��
		System.out.println(link);
	}
}
