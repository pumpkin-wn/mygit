package factoryphone;
public abstract class FactoryMobile implements FactoryPhone{
	public MobileUser createPhoneuser1(){
		return new MobileUser();
	}

	public MobileUser createPhoneuser() {
		// TODO 自动生成的方法存根
		return null;
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