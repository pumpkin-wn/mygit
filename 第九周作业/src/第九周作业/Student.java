package �ھ�����ҵ;

public class Student {
	public static void main(String[] args){
		System.out.println("-------��ӭ����ѧ������ϵͳ-------");
		add();
		System.out.println("-------����ɾ��ѡ��------");
		remove();
		System.out.println("-------�����޸�ѡ��------");
		alter();
		System.out.println("-------���в�ѯѡ��------");
		find();
	}
	public static void add(){
		StringBuffer sb=new StringBuffer();
		sb.append("������ѧ�ţ�");
		sb.insert(6,"184805029 ");
		System.out.println(" "+sb);
		StringBuffer sc=new StringBuffer();
		sc.append("������������");
		sc.insert(6,"��� ");
		System.out.println(" "+sc);
		StringBuffer sd=new StringBuffer();
		sd.append("�������Ա�");
		sd.insert(6,"Ů ");
		System.out.println(" "+sd);
    }
	public static void remove(){
		StringBuffer sb=new StringBuffer("ѧ�ţ�184805029  ������ ���   �Ա�Ů ");
		sb.delete(0,12);
		System.out.println("ɾ��ѧ�ź�"+sb);
		StringBuffer sc=new StringBuffer("ѧ�ţ�184805029  ������ ���   �Ա�Ů ");
		sc.delete(14,21);
		System.out.println("ɾ��������"+sc);
		StringBuffer sd=new StringBuffer("ѧ�ţ�184805029  ������ ���   �Ա�Ů ");
		sd.delete(23,28);
		System.out.println("ɾ���Ա��"+sd);
	}
	public static void alter(){
		StringBuffer sb=new StringBuffer("ѧ��:184805029  ����:���   �Ա�Ů");
		sb.replace(10,11,"11");
		sb.replace(12,13,"");
		sb.replace(17,18,"�ް�");
		sb.replace(19,20," ");
		sb.replace(26,27,"�� ");
		System.out.println("�滻����������Ϣ֮��"+sb);
	}
	private static void find() {
		StringBuffer sb=new StringBuffer("ѧ��:184805029  ������ ���   �Ա�Ů ;ѧ�ţ�184805011 �������ް�   �Ա���");
		sb.toString();
		System.out.println("��һ��ͬѧ��ѧ��:"+sb.substring(3,12));
	}
}

