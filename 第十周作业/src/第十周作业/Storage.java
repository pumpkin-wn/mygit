package 第十周作业;

public class Storage{
	private String[] cells=new String[10];//数据存储数组
	private int inPos,outPos;
	private int count=0,students=0;
	public synchronized void put(String num){
		try{
			//如果放入数据等于cells的长度，此线程等待
			while(count==cells.length){
				this.wait();
			}
			cells[inPos]=num;//向数组中放入数据
			System.out.println("用户"+cells[inPos]+"登录---");
			inPos++;//存完元素让位置＋1
			if(inPos==cells.length)//当在cells[9]放完数据后再从cells[0]开始
			      inPos=0;
			count++;
			students++;
			this.notify();
		}catch(Exception e){
			e.printStackTrace();
		}
		System.out.println("当前在线人数"+students);
	}
	public synchronized void get(){
		try{
			while(count==0){
				this.wait();
			}
			String data=cells[outPos];
			System.out.println("用户"+data+"注销---");
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
		System.out.println("当前在线人数"+students);
	}
}