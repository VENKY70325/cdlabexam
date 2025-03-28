class Journey
{
  Car c=new Car();
  public void startjourney()
  {
    c.travel();   
  }
}
class Car
{
  public void travel()
  { 
   System.out.println("travel by car");
  }
}
class Demo
{
  public static void main(String args[])
  {
    Journey j=new Journey();
    j.startjourney();
  }
}