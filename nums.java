class nums
{
  public static void main(String[] args)
  {
   int number1=413,number2=76,number3=451;
   if(number1>number2)
    { 
      if(number1>number3)
      {
       System.out.println(number1 +" is largest");
      }
      else
      {
       System.out.println(number3 +" is largest");
      }
    }
    else
    {
     if(number2>number3)
      {
        System.out.println(number2 +" is largest");
      }
      else
      {
        System.out.println(number3 +" is greatest");
      }
    }
  } 
}