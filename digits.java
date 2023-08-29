class digits
{
  public static void main(String[] args)
   {
      int num=500;
      if(num>=0&&num<=9)
       System.out.println("one digit");
      else if(num>10&&num<99)
        System.out.println("two digit");
      else if(num>100&&num<999)
        System.out.println("three digit");
       else
        System.out.println("zero");
      }
}