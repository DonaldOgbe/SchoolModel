public class Staff extends Person{
    protected int salary;
    public Staff(String name, int age, String gender, String role) {
        super(name, age, gender, role);
        salary = switch (role) {
            case "Teacher" -> 120000;
            case "Principal" -> 200000;
            case "Non-Academic Staff" -> 80000;
            default -> throw new IllegalStateException("Unexpected value: " + role);
        };
    }

    public void giveRaise(int percent) {
        salary += (salary / 100) * percent;
    }
}
