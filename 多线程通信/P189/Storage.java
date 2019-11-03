class Storage{
	private int[] cells=new int[10];//���ݴ洢����
	private int inPos,outPos;
	private int count;
	public synchronized void put(int num){
		try{
			//����������ݵ���cells�ĳ��ȣ����̵߳ȴ�
			while(count==cells.length){
				this.wait();
			}
			cells[inPos]=num;//�������з�������
			System.out.println("��cells["+inPos+"]�з�������---"+cells[inPos]);
			inPos++;//����Ԫ����λ�ã�1
			if(inPos==cells.length)//����cells[9]�������ݺ��ٴ�cells[0]��ʼ
			inPos=0;
			count++;
			this.notify();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public synchronized void get(){
		try{
			while(count==0){
				this.wait();
			}
			int data=cells[outPos];
			System.out.println("��cells["+outPos+"]��ȡ������"+data);
			cells[outPos]=0;
			outPos++;
			if(outPos==cells.length)
				outPos=0;
			count--;
			this.notify();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}