package last;

public class Toyota implements Vehicle {

    int gear;
    int speed;

    public Toyota(int gear, int speed) {
        this.gear = gear;
        this.speed = speed;
    }


    @Override
    public void changegear(int gear) {
        this.gear=gear;
    }

    @Override
    public void speedup(int inc) {
       speed=speed+inc;
    }

    @Override
    public void applybreaks(int dec) {
          speed=speed-dec;
    }

    @Override
    public String toString() {
        return "Toyota{" +
                "gear=" + gear +
                ", speed=" + speed +
                '}';
    }

    public static void main(String[] args) {
        Vehicle Vitz=new Toyota(3,100);
        Vitz.applybreaks(20);
        Vitz.changegear(1);


        System.out.println(Vitz.toString());


    }
}
