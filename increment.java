class increment
{
  public static void main(String[]args)
   {  //example1
     int a=10;
     System.out.println(a++);
     System.out.println(a);
     //example2
     a=10;
     int b;
     b=a++;//b=10,a=10
     System.out.println(b);
     System.out.println(a);//a=11
      //example3
      a=10;
      b=19;
      System.out.println(a++ + ++a + --b);
      //example4
      a=11;
      b=a;
      System.out.println(b++ + b++ + b);
     
      
   }
}