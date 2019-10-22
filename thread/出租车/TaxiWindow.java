class TaxiWindow implements Runnable{
	private int passengers=100;
	public void run(){
	while(true){
		if(passengers>0){
			Thread pa=Thread.currentThread();
			String pa_name=pa.getName();
			System.out.println(pa_name+"正在派送第"+passengers--+"个乘客");
		  }
	  }
   }
}