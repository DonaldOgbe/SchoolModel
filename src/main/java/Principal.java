public class Principal extends Staff implements Introduce, AdmitApplicant, ExpelStudent {
    public Principal(String name, int age, String gender) {
        super(name, age, gender, "Principal");
    }

    @Override
    public void introduce() {
        String result = String.format("My name is %s, im %d years old," +
                " and im a %s %s", this.getName(), this.getAge(), this.getGender(), this.getRole());
        System.out.println(result);
    }

    @Override
    public void admitApplicant(Applicant applicant) {
        String result = applicant.getAge() < 10 ? String.format("%s is not Admitted", applicant.getName())
                : String.format("%s is Admitted", applicant.getName());
        System.out.println(result);
    }

    @Override
    public void expelStudent(Student student) {
        System.out.printf("%s is Expelled%n", student.getName());
    }
}
