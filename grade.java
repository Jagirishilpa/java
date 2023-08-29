class grade
{
  public static void main(String[]args)
  {
    int hardness=70;
    double carbon=0.5;
     int tensile=5700;
    int grade;
    if(hardness>50 && carbon<0.7 && tensile>5700)
     {
       grade=10;
     
     }
     else if(hardness>50 && carbon<0.7 && tensile>5700)
      {
         grade=9;
         
       } 
     else if(hardness>50 && carbon<0.7 && tensile>5700)
     {
       grade=8;
      
     }
     else if(hardness>50 && carbon<0.7 && tensile>5700)
     {
       grade=7;
    
     }
    else if(hardness>50 && carbon<0.7 && tensile>5700)
     {
       grade=6;
       
     }
     else 
     {
       grade=5;
      System.out.println("none of the conditions are met");
     }
    
       System.out.println(hardness);
       System.out.println(carbon);
       System.out.println(tensile);
       System.out.println(grade);
   }
}