public class NonAcademicStaff extends Staff implements Introduce{
    public NonAcademicStaff(String name, int age, String gender) {
        super(name, age, gender, "Non-Academic Staff");
    }

    @Override
    public void introduce() {
        String result = String.format("My name is %s, im %d years old," +
                " and im a %s %s", name, age, gender, role);
        System.out.println(result);
    }
}
