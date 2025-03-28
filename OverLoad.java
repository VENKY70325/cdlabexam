class Sample
{
   void add(int a,int b)
     {
        System.out.println("Sum of two="+(a+b));
     }
   void add(int a,int b,int c)
     {
        System.out.println("Sum of three="+(a+b+c));
     }
}

class OverLoad
{
   public static void main(String args[])
   {
       Sample s=new Sample();
       s.add(20,25);
       s.add(20,25,30);
   }
}