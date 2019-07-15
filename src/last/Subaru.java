package last;

public class Subaru implements Vehicle {
    int speed;
    int gear;

    public Subaru(int speed,int gear) {
        this.speed=speed;
        this.gear=gear;
    }

    @Override
    public void changegear(int gear) {
        this.gear=gear;
    }

    @Override
    public void speedup(int increament) {
        speed=speed+increament;
    }

    @Override
    public void applybreaks(int dec) {
        speed= speed- dec;

    }

    @Override
    public String toString() {
        return "Subaru{" +
                "speed=" + speed +
                ", gear=" + gear +
                '}';
    }

    public static void main(String[] args) {
        Subaru forester=new Subaru(120,2);
        System.out.println(forester.toString());
        forester.changegear(1);
        forester.applybreaks(40);
        System.out.println(forester.toString());
    }
}

