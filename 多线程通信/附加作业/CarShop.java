public class CarShop{
   private int money=0;
   public void sellCar(Car car){
   System.out.println("车型"+car.getName()+"起步价格"+car.getPrince()+"费率"+car.getRatio());
}
public static void main(String[] args){
   CarShop ashop=new CarShop();
   ashop.sellCar(new BMW320());
   ashop.sellCar(new BMW523());

  }
}