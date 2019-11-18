package factoryphone;
import phoneuser.*;
public  class FactoryTelecom implements FactoryPhone{
	public TelecomUser createPhoneuser(){
		return new TelecomUser();
	}
}
/*package factorybmw;
import bmw.*;
public class FactoryBMW320 implements FactoryBMW{
		public BMW320 createBMW(){
			
			return new BMW320();
		}
	}
	*/