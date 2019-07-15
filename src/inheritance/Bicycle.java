package inheritance;

public class Bicycle {
    public int gear;
    public int speed;

    public Bicycle(int gear, int speed) {
        this.gear = gear;
        this.speed = speed;
    }
    public void aplplyBrake(int dec){
        speed-=dec;
    }
    public void speedup(int inc){
        speed+=inc;
    }
    public void changegear(int g){
        this.gear=g;
    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "gear=" + gear +
                ", speed=" + speed +
                '}';
    }

    public static void main(String[] args) {
        Bicycle bike1=new Bicycle(5,89);

        bike1.speedup(6);
        System.out.println(bike1.toString());
    }
}

