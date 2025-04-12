package model;

public class Staff extends Person{
    protected int salary;
    public Staff(String name, int age, String gender, String role) {
        super(name, age, gender, role);
        salary = switch (role) {
            case "models.Teacher" -> 120000;
            case "models.Principal" -> 200000;
            case "Non-Academic models.Staff" -> 80000;
            default -> throw new IllegalStateException("Unexpected value: " + role);
        };
    }

    public void giveRaise(int percent) {
        salary += (salary / 100) * percent;
    }
}
