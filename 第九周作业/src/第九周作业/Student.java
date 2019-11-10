package 第九周作业;

public class Student {
	public static void main(String[] args){
		System.out.println("-------欢迎进入学生管理系统-------");
		add();
		System.out.println("-------进行删除选项------");
		remove();
		System.out.println("-------进行修改选项------");
		alter();
		System.out.println("-------进行查询选项------");
		find();
	}
	public static void add(){
		StringBuffer sb=new StringBuffer();
		sb.append("请输入学号：");
		sb.insert(6,"184805029 ");
		System.out.println(" "+sb);
		StringBuffer sc=new StringBuffer();
		sc.append("请输入姓名：");
		sc.insert(6,"王楠 ");
		System.out.println(" "+sc);
		StringBuffer sd=new StringBuffer();
		sd.append("请输入性别：");
		sd.insert(6,"女 ");
		System.out.println(" "+sd);
    }
	public static void remove(){
		StringBuffer sb=new StringBuffer("学号：184805029  姓名： 王楠   性别：女 ");
		sb.delete(0,12);
		System.out.println("删除学号后："+sb);
		StringBuffer sc=new StringBuffer("学号：184805029  姓名： 王楠   性别：女 ");
		sc.delete(14,21);
		System.out.println("删除姓名后："+sc);
		StringBuffer sd=new StringBuffer("学号：184805029  姓名： 王楠   性别：女 ");
		sd.delete(23,28);
		System.out.println("删除性别后："+sd);
	}
	public static void alter(){
		StringBuffer sb=new StringBuffer("学号:184805029  姓名:王楠   性别：女");
		sb.replace(10,11,"11");
		sb.replace(12,13,"");
		sb.replace(17,18,"崔八");
		sb.replace(19,20," ");
		sb.replace(26,27,"男 ");
		System.out.println("替换成张三的信息之后："+sb);
	}
	private static void find() {
		StringBuffer sb=new StringBuffer("学号:184805029  姓名： 王楠   性别：女 ;学号：184805011 姓名：崔八   性别：男");
		sb.toString();
		System.out.println("第一名同学的学号:"+sb.substring(3,12));
	}
}

