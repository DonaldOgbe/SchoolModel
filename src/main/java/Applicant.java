public class Applicant extends Person implements Introduce{
    public Applicant (String name, int age, String gender) {
        super(name, age, gender, "Applicant");
    }

    @Override
    public void introduce() {
        String result = String.format("My name is %s, im %d years old," +
                " and im a %s %s", name, age, gender, role);
        System.out.println(result);
    }
}
