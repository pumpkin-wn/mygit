class PaperWindow implements Runnable{
	private int papers=80;
	public void run(){
		while(true){
			if(papers>0){
				Thread pa=Thread.currentThread();
				String pa_name=pa.getName();
				System.out.println(pa_name+"���ڷַ���"+papers--+"�ݱʼ�");
			}
		}
	}
}