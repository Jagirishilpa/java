class supernum
 {
  public static void main(String[] args)
   {
     int num=4,start=1,count=0;
      while(start<=num)
      {
        if(num%start==0)
         {
           count++;
         }
         start++;
      }
      if(count==3)
       {
        System.out.println(num + "supernum");
        }
       else
         System.out.println("not a super num");
   }
}