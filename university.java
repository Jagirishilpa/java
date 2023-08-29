class university
{
  public static void main(String[]args)
  {
     char mainsub='a',subsidiarysub='b';
     int n1=65,n2=40;
      String grade;
     if(n1>=55 && n2>=45)
     {  
         grade="qualify";
       System.out.println(grade);
     }
    else if((n1<55 && n1<=45) && n2>=65)
     {
         grade="pass";
        System.out.println(grade);
     }
   else if(n1>=45 && n2<=65)
    {
         grade="reappear";
         System.out.println(grade);
   }
   else
   {
     System.out.println("fail");
   }
}
}      
     