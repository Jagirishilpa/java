class sum
{
  public static void main(String[]args)
  {
    //backend
    int var=0,input=1,end=10;
     while(end>=input)
      {
        var=var+end;
        end--;
     }
    System.out.println(var);
  //frontend
        var=0;
      input=1;
      end=10;
     while(input<=end)
      {
        var=var+input;
        input++;
     }
    System.out.println(var);
}
}