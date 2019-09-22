//定义测试类
public class Exampel3{
	public static void main(String[] args){
		Animal an1=new Cat();
		Animal an2=new Dog();
		animalshout(an1);
		animalshout(an2);
	}
	//定义静态的animalshout()方法，接收一个Animal类型的参数
	public static void animalshout(Animal an){
		an.shout();
	}
}