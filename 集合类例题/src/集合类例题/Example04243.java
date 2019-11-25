package 集合类例题;
import java.util.*;
public class Example04243 {
	public static void main(String[] args){
		ArrayList list=new ArrayList();//创建ArrayList集合
		//向ArrayList集合中添加字符串元素
		list.add("Jack");//向ArrayList集合中添加字符串元素
		list.add("Rose");
		list.add("Tom");
		for (Object obj : list){//使用foreach循环遍历Arraylist对象
			System.out.println(obj);//取出并打印ArrayList集合中的元素
		}
	}
}
