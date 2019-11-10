package 第十周作业;
import java.util.Random;
public class Input implements Runnable {
	private Storage st;
	private String num;
	Input(Storage st){
		this.st=st;
	}
	public void run(){
		while(true){
			Random r=new Random();
		    num=String.valueOf(r.nextInt(100));
			st.put(num);
		}
	}
}

