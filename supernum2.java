class supernum2
 {
  public static void main(String[] args)
   {
     int num=4,end=1,count=0;
      while(end>=num)
      {
        if(num%end==0)
         {
           count++;
         }
         end--;
      }
      if(count==3)
       {
        System.out.println(num + "supernum");
        }
       else
         System.out.println("not a super num");
   }
}