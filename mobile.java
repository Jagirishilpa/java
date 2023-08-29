class mobile
{ 
  public static void main(String []args)
   { 
      String mname="appleiphone14";
      double cost=79900;
      double offer=99,exoffer=7000;
       double bankoffer=5;
      double disc=14/100.0*79900;
      System.out.println(disc);
      double price=cost-disc;
      System.out.println(price);
         price=price+offer;
     System.out.println(price);
     bankoffer=5.0/100*price;
     System.out.println(bankoffer);
      price=price-bankoffer-exoffer;
     System.out.println(price);
    
   }
 }    