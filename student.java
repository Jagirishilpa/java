class student
{
  public static void main(String[] args)
  {
    int s1=75,s2=65,s3=76,s4=44,s5=90,s6=37;
    int maxmarks=600,fee=74000;
    char section='a';
    String grade;
    int donation=0,scholarship=0;
    int total=s1+s2+s3+s4+s5+s6;
    double percentage=total/maxmarks*100;
     if(percentage>80)
      {
         section='a';
         scholarship=10000;
         donation=0;
         grade="distinction";
      }
      else
      {
        section='b';
        scholarship=0;
        donation=15000;
        grade="fail";
      }
     fee=fee+donation-scholarship;
     System.out.println(grade + fee + percentage );
   }
}  
      