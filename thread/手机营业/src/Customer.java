import factoryphone.*;
import phoneuser.*;
public class Customer {
	public static void main(String[] args){
		FactoryMobile factoryMobile=new FactoryMobile();
		MobileUser mobileuser=factoryMobile.createPhoneuser();
		MobileUser MobileUser=new MobileUser();
				//����ͨ����¼
				MobileUser.generateCommubicateRecord();
				//��ӡͨ���굥
				MobileUser.printDetails();
		 
				FactoryTelecom factoryTelecom=new FactoryTelecom();
		        TelecomUser telecomUser=factoryTelecom.createPhoneuser();
		       //ʵ����һ�������û���TelcomUser
		        TelecomUser telcomUser=new TelecomUser();
				//����ͨ����¼
				telcomUser.generateCommubicateRecord();
				//��ӡͨ���굥
				telcomUser.printDtails();
				
	}
}
