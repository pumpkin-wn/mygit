package ��ʮ����ҵ;

public class Storage{
	private String[] cells=new String[10];//���ݴ洢����
	private int inPos,outPos;
	private int count=0,students=0;
	public synchronized void put(String num){
		try{
			//����������ݵ���cells�ĳ��ȣ����̵߳ȴ�
			while(count==cells.length){
				this.wait();
			}
			cells[inPos]=num;//�������з�������
			System.out.println("�û�"+cells[inPos]+"��¼---");
			inPos++;//����Ԫ����λ�ã�1
			if(inPos==cells.length)//����cells[9]�������ݺ��ٴ�cells[0]��ʼ
			      inPos=0;
			count++;
			students++;
			this.notify();
		}catch(Exception e){
			e.printStackTrace();
		}
		System.out.println("��ǰ��������"+students);
	}
	public synchronized void get(){
		try{
			while(count==0){
				this.wait();
			}
			String data=cells[outPos];
			System.out.println("�û�"+data+"ע��---");
			cells[outPos]="0";
			outPos++;
			if(outPos==cells.length)
				outPos=0;
			count--;
			students--;
			this.notify();
		}catch(Exception e){
			e.printStackTrace();
		}
		System.out.println("��ǰ��������"+students);
	}
}