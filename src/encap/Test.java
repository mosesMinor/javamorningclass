package encap;

public class Test {
    public static void main(String[] args) {

        Patients pone=new Patients();

        pone.setAge(21);
        pone.setName("ruth njeri");
        pone.setPat_no(101);

        System.out.println("Patient name is" +pone.getName());
        System.out.println("Patient age is"+pone.getAge() );
        System.out.println("Patient number is" +pone.getPat_no());


    }
}
