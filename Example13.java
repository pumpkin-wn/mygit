//���������
public class Exampel3{
	public static void main(String[] args){
		Animal an1=new Cat();
		Animal an2=new Dog();
		animalshout(an1);
		animalshout(an2);
	}
	//���徲̬��animalshout()����������һ��Animal���͵Ĳ���
	public static void animalshout(Animal an){
		an.shout();
	}
}