



package assignment;

public class Employee {
    public int number;
    public String name;
    public int address;

    public Employee(int number, String name, int address) {
        this.number = number;
        this.name = name;
        this.address = address;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public int getAddress() {
        return address;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(int address) {
        this.address = address;
    }
    public void checkin(){
        System.out.println("You have checked in");
    }

    @Override
    public String toString() {
        return "Employee{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Employee wambui=new Employee(10,"wambui",78);
        wambui.checkin();
        System.out.println(wambui.toString());
    }
}


