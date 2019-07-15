package inheritance;

public class MountainBike extends Bicycle{

    public int seatH;


    public MountainBike(int gear, int speed,int seatH) {
        super(gear, speed);
        this.seatH=seatH;
    }

    public void setSeatH(int seatH) {
        this.seatH = seatH;
    }

    @Override
    public String toString() {
        return "MountainBike{" +
                "seatH=" + seatH +
                ", gear=" + gear +
                ", speed=" + speed +
                '}';
    }

    public static void main(String[] args) {
        MountainBike mybike=new MountainBike(5,56,89);
        mybike.aplplyBrake(5);
        System.out.println(mybike.toString());

        Bicycle bike2=new MountainBike(2,20,4);
        bike2.aplplyBrake(6);
        ( (MountainBike) bike2).setSeatH(2);


        System.out.println(bike2.toString());


    }
}
