interface Car{
   String getName();
   int getPrince();
   abstract float getRatio();
}

class BMW320 implements Car{
    public String getName(){
    return "BMW320";
  }
   public int getPrince(){
   return 10;
  }
   public float getRatio(){
   return 4;
  }
}


class BMW523 implements Car{
public String getName(){
return "BMW523";
}
public int getPrince(){
return 30;
}
//public String getColor(){
//return "ºÚÉ«";
//} 
public float getRatio(){
return 7;
}
}