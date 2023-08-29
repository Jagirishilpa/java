class person
 {
   public static void main(String []args)
    {
       String name="srikanth";
       String health="excellent";
       int age=29;
      String address="city";
      String gender="male";
      int premium_per_thousand=4;
      int policy_amount=200000;
      int totalpremium=policy_amount/1000;
      if( age>25 && age<35&& address=="city")
       {
         if(gender=="male"&& health=="excellent")
       	  { 
       	    System.out.println("person age is:"+ age);
          }
       }
      else
       {
         System.out.println("person age not matched");
       }
      int calculation_of_premium=totalpremium*premium_per_thousand;
       System.out.println("calculation of total premium :"+calculation_of_premium);
    

      
         name="mouna";
        health="excellent";
        age=29;
       address="city";
       gender="female";
       premium_per_thousand=3;
      policy_amount=100000;
       totalpremium=policy_amount/1000;
      if( age>25 && age<35&& address=="city")
       { 
         if(gender=="female"&& health=="excellent")
       	  { 
       	    System.out.println("person age is:"+age);
          }
       }
      else
       {
         System.out.println("person age not matched");
       }
      calculation_of_premium=totalpremium*premium_per_thousand;
       System.out.println("calculation of total premium :"+calculation_of_premium);
      
      name="hari";
        health="poor";
        age=29;
       address="village";
       gender="male";
       premium_per_thousand=6;
      policy_amount=10000;
      totalpremium=policy_amount/1000;
      if( age>25 && age<35&& address=="village")
       { 
         if(gender=="male"&& health=="poor")
       	  { 
       	    System.out.println("person age is:"+age);
          }
       }
      else
       {
         System.out.println("person age not matched");
       }
      calculation_of_premium=totalpremium*premium_per_thousand;
       System.out.println("calculation of total premium :"+calculation_of_premium);  
     }
}