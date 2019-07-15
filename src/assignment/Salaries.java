package assignment;

public class Salaries extends Employee{

    public double salary;
    public Salaries(int number, String name, int address,double salary) {
        super(number, name, address);
        this.salary=salary;
    }

    @Override
    public void checkin() {
        System.out.println(name+" you checked in");
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void PAYme(){
        System.out.println(name+", your salary is "+salary);
    }

    @Override
    public String toString() {
        return "Salaries{" +
                "salary=" + salary +
                ", number=" + number +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Salaries wambui=new Salaries(10,"wambui",25,6000);
        Employee wangui=new Salaries(11,"wangui",26,7000);

        wambui.setNumber(10);
        System.out.println(wambui.toString());
        ((Salaries) wambui).PAYme();
        wambui.PAYme();
        wambui.setSalary(6000);
        System.out.println("your new salary is "+wambui.getSalary());
        wambui.PAYme();
        wangui.checkin();
        wambui.checkin();
        System.out.println(wangui.toString());
        System.out.printf("wangui your salary is "+((Salaries) wangui).getSalary());

    }
}



