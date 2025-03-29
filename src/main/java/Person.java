public class Person {
    protected String name;
    protected int age;
    protected String gender;
    protected String role;

    public Person(String name, int age, String gender, String role) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
