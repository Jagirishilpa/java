class phone2
 { 
   public  static void main(String []args)
    { 
      String phonename="redmi";
      double actualprice=7000,packagefee=5;
      double offerprice=10.0/100*actualprice;
      System.out.println( phonename);
      System.out.println( actualprice);
      System.out.println( offerprice);
      double orginalcost=actualprice-offerprice;
      System.out.println(orginalcost);
      double total=packagefee+orginalcost;
      System.out.println(total);


     }
 }
