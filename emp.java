class emp
{
 public static void main(String[] args)
 {
  String ename="chinni";
  int basicsalary=25000;
  double  ta=15,pf=7,tax=2.5;
  double da=12;
  double hra=19;
  ta=15.0/100*basicsalary;
  da=12.0/100*basicsalary;
  hra=19.0/100*basicsalary;
  double totalsalary=basicsalary+ta+da+hra;
  if(totalsalary>40000)
  {
     pf=11.0/100*basicsalary;
     tax=5.0/100*basicsalary;
  }
  else
  {
    pf=7.0/100*basicsalary;
    tax=2.5/100*basicsalary;
  }
double grosssalary=totalsalary-pf-tax;
double packagesalary=grosssalary*12;
System.out.println(totalsalary);
System.out.println(grosssalary);
System.out.println(packagesalary);
}
}