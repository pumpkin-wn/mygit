class Down implements Runnable{
	private int []arr=new int[100];
	public void run(){
		while (true){
		for(int i=0;i<100;i++){
			Thread th=Thread.currentThread();
			String th_name=th.getName();
			System.out.println(th_name+"正在下载第"+i+"段文件");
		}
		}
	}
}
