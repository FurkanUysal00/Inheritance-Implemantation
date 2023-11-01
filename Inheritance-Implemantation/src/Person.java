public class Person {
    protected String name;
    protected int age;
    protected String nationality;
    protected char gender;
    public Person(String name,int age,String nationality,char gender){
        this.name=name;
        this.age=age;
        this.nationality=nationality;
        this.gender=gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", nationality='" + nationality + '\'' +
                ", gender=" + gender +
                '}';
    }
}
