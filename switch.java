class switchcase
{
   public static void main(String[] args)
     {
       //example1
      switch(1)
        {
   	  case 1:System.out.println("shilpa");
                    break;
          case 2:System.out.println("mouna");
                     break;
          case 3:System.out.println("souja");
  		     break;
           default:System.out.println("please slect correct name");
         }
     //example2
    char c='a';
    switch(c)
      {
         case 'a':System.out.println("small+vowel");
                  break;
         case 'e':System.out.println("small+vowel");
                   break;
         case 'i': System.out.println("small+vowel");
 		  break;
         case 'o':System.out.println("small+vowel");
         	   break;
          case 'u':System.out.println("small+vowel");
			break;
	  default:System.out.println("consonant");
	}
    //example3
     int x=4;
      switch(1)
         {
            case 1 :if(x%2==0)
 		System.out.println("even number");
    				break;
            default:System.out.println("odd number");
 				
          }
      //example for whileloop
    int n=1,n2=50,sum=0;
     double mul=1;
     while(n<=n2)
       {
         if(n%2==0)
          {
          sum=sum+n;
          System.out.println(sum);
           n++;
          }
         else
         { 
            mul=mul*n;
            System.out.println(mul);
            n++;
         }
	}




       

         
      

}
}