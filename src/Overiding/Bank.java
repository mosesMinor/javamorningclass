package Overiding;

public class Bank {

    public int RateofInterest(){
        return 0;

    }
}
class CBA extends Bank{
    @Override
    public int RateofInterest() {
        return 9;
    }
}
class KCB extends Bank{

    @Override
    public int RateofInterest() {
        return 12;

    }
}class EQUITY extends Bank{
    @Override
    public int RateofInterest() {
        return 11;
    }
}
class Test{
    public static void main(String[] args) {
        CBA westy=new CBA();
        KCB cbd=new KCB();
        EQUITY upper=new EQUITY();
        System.out.println("CBA westy rate is "+westy.RateofInterest());
        System.out.println("KCB cbd rate is "+cbd.RateofInterest());
        System.out.println("EQUITY upper rate is "+upper.RateofInterest());
    }
}



