class primenum
 {
  public static void main(String[] args)
   {
     int num=17,start=1,count=0;
      while(start<=num)
      {
        if(num%start==0)
         {
           count++;
         }
         start++;
      }
      if(count==2)
       {
        System.out.println(num + "prime num");
        }
       else
         System.out.println("not a prime num");
   
}
}