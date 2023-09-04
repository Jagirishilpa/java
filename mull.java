class mull
{
  public static void main(String[]args)
  { 
     //backend
    int var=1,input=1,end=5;
     while(end>=input)
      {
        var=var*end;
        end--;
     }
    System.out.println(var);
     //frontend
       var=1;
      input=1;
      end=5;
     while(input<=end)
      {
        var=var*input;
        input++;
     }
    System.out.println(var);
 
}
}