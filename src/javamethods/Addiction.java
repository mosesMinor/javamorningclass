package javamethods;

public class Addiction {
     int sum=0;

     public int addNumbers( int a,int b,int c){
         sum=a+b+c;
          return sum;
     }

    public static void main(String[] args) {

         Addiction sales =new Addiction();
        int ans = sales.addNumbers(  45, 48,  50  );
         System.out.println("the sale sum is"+ ans);

    }
}
