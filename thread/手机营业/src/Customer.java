import factoryphone.*;
import phoneuser.*;
public class Customer {
	public static void main(String[] args){
		FactoryMobile factoryMobile=new FactoryMobile();
		MobileUser mobileuser=factoryMobile.createPhoneuser();
		MobileUser MobileUser=new MobileUser();
				//生成通话记录
				MobileUser.generateCommubicateRecord();
				//打印通话详单
				MobileUser.printDetails();
		 
				FactoryTelecom factoryTelecom=new FactoryTelecom();
		        TelecomUser telecomUser=factoryTelecom.createPhoneuser();
		       //实例化一个电信用户类TelcomUser
		        TelecomUser telcomUser=new TelecomUser();
				//生成通话记录
				telcomUser.generateCommubicateRecord();
				//打印通话详单
				telcomUser.printDtails();
				
	}
}
