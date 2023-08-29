class vowel
{
  public static void main(String[]args)
   {
     char c='A';
     if(c>=65 && c<=97)
     {
      if(c=='A'||c=='I'||c=='O'||c=='E'||c=='U')
     {
       System.out.println("capital " + "vowel");
      }
      else
      {
       System.out.println("capital" + "consonant");
      }
     }
      else if(c<=97 && c>=122)
        {
         if(c=='a' || c=='i' || c=='o' ||c=='u')
         { 
           System.out.println("small" + "vowel");
          }
         else      
         {
            System.out.println("small" +"is consonant");
        }
       
      }
     else if(c>=0 && c<=9)
      {
        System.out.println(c + "is a number");
       }
     else
     {
       System.out.println(c + "is special symbol");
     }
}
}