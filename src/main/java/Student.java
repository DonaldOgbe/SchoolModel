public class Student extends Person implements Introduce, NewCourse{
    private final int grade;

    public Student(String name, int age, String gender) {
        super(name, age, gender, "Student");
        grade = age - 9;
    }

    public int getGrade() {
        return grade;
    }

    public String getRole() {
        return this.role;
    }

    @Override
    public void introduce() {
        String result = String.format("My name is %s, im %d years old," +
                " im a %s and im a %s in grade %d", name, age, gender, role, grade);
        System.out.println(result);
    }

    @Override
    public void addCourse(String course) {
        String result = String.format("%s is taking %s", name, course);
        System.out.println(result);
    }
}
