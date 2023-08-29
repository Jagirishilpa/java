class bitwise
{
  public static void main(String[] args)
  {
     //example1
    int n1=17,n2=19;
    System.out.println(n1&n2);
    System.out.println(n1|n2);
    System.out.println(n1^n2);
    //example2
    n1=16;
    n2=15;
    System.out.println(n1&n2);
    System.out.println(n1|n2);
    System.out.println(n1^n2);
    //example3
    n1=17;
    n2=19;
    n1=n1^n2;
    n2=n1^n2;
    n1=n1^n2;
    System.out.println(n1);
    System.out.println(n2);
    System.out.println(n1);
}
}