package 集合类例题;
import java.util.*;
public class Example03242 {
	public static void main(String[] args){
		ArrayList list=new ArrayList();//创建ArrayList集合
		list.add("data_1");
		list.add("data_2");
		list.add("data_3");
		list.add("data_4");
		Iterator it=list.iterator();//获取Iterator对象
		while(it.hasNext()){//判断ArrayList集合中是否存在下一个元素
			Object obj=it.next();//取出ArrayList中的元素
			System.out.println(obj);
		}
	}

}
