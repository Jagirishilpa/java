class charac
{
  public static void main(String[] args)
   {  
     char c='A';
     int c1=(int)(c);
     int t=0;
     if(c1>=65)
      {
       if(c1<=90)   
        {
          t=c1+32;
        }
     }
     else if(c1>=97)
     {
       if(c1<=122)
       {
        t=c1-32;
      }
    }
    t=(char)t;
    System.out.println(t);
   }
}