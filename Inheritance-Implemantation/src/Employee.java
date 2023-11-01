public class Employee extends Person {
    private int id;
    private double hourlyPay;
    public Employee(String name,int age,String nationality,char gender,int id,double hourlyPay){
        super(name,age,nationality,gender);
        this.id=id;
        this.hourlyPay=hourlyPay;
    }
    public double getRaise(){
        this.hourlyPay += (this.hourlyPay * (15/100));
        return this.hourlyPay;
    }
    public double payDay(double workedHour){
        if(workedHour>40){
            double overtimePay=(workedHour-40)*(hourlyPay*(3/2));
            double normalPay=(40 * hourlyPay);
            return (overtimePay + normalPay);
        }
        else{
            return (workedHour * hourlyPay);
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getHourlyPay() {
        return hourlyPay;
    }

    public void setHourlyPay(double hourlyPay) {
        this.hourlyPay = hourlyPay;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", nationality='" + nationality + '\'' +
                ", gender=" + gender +
                ", id=" + id +
                ", hourlyPay=" + hourlyPay +
                '}';
    }
}
