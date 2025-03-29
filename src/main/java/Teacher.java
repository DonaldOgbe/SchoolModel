public class Teacher extends Staff implements NewCourse, Introduce{
    public Teacher(String name, int age, String gender) {
        super(name, age, gender, "Teacher");
    }

    @Override
    public void addCourse(String course) {
        String result = String.format("%s is teaching %s", name, course);
        System.out.println(result);
    }

    @Override
    public void introduce() {
        String result = String.format("My name is %s, im %d years old," +
                " and im a %s %s", name, age, gender, role);
        System.out.println(result);
    }
}
