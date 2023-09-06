class year2
{ 
  public static void main(String []args)
  {  
     int oneyear=365;
     int myage=22;
     int hour=24;
     int min=60;
     int months=12;
     System.out.println("oneyear=" +oneyear);
     System.out.println("myage=" +myage);
     System.out.println("hour=" +hour);
     System.out.println("min=" +min);
     int totaldays=oneyear*myage;
     System.out.println(totaldays);
     int totalhours=totaldays*hour;
     System.out.println(totalhours);
     int totalminutes=totalhours*min;
     System.out.println(totalminutes);
     int totalmonths=oneyear*months;
     System.out.println(totalmonths);  
    }
} 
