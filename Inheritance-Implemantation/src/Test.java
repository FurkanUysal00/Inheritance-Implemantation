import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Person> employees = new ArrayList<>();
        employees.add(new Employee("John Swing",34,"American",'M',132456741,14.45));
        employees.add(new Employee("Lale Kuzey",45,"Turkish",'F',465321456,16.45));
        employees.add(new Employee("Will Smith",33,"Britsh",'M',416542313,15.45));
        employees.add(new Employee("lenz Kingston",23,"Jewish",'M',564213244,12.45));
        getInfo(employees);
    }
    private static void getInfo(ArrayList<Person> list){
        for(Person e : list){
            System.out.println(e);
        }
    }
}