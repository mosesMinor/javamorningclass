package last;

public enum Days {

    MONDAY,TUESADY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY;

}
 class Test{

     Days day ;

     public Test(Days day) {
         this.day = day;
     }
     public void dayislike(){
         switch (day){
             case MONDAY:
                 System.out.println("mondays are cold");
             break;
             case TUESADY:
                 System.out.println("tuesdayare okay");
                 break;
             case SATURDAY:
                 System.out.println("weekends are lit");
                 break;
                 default:
                     System.out.println("midweek are quite busy");
         }
     }

     public static void main(String[] args) {
         Days one= Days.MONDAY;
         Days two= Days.THURSDAY;

         String a="MONDAY";
         String b="FRIDAY";


         Test test1=new Test(one);
         Test test2=new Test(two);


         Test test3=new Test(Days.valueOf(a));
         Test test4=new Test(Days.valueOf(b));


         test1.dayislike();
         test4.dayislike();


     }


 }