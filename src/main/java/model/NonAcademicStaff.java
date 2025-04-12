package model;

import interfaces.Introduce;

public class NonAcademicStaff extends Staff implements Introduce {
    public NonAcademicStaff(String name, int age, String gender) {
        super(name, age, gender, "Non-Academic models.Staff");
    }

    @Override
    public void introduce() {
        String result = String.format("My name is %s, im %d years old," +
                " and im a %s %s", this.getName(), this.getAge(), this.getGender(), this.getRole());
        System.out.println(result);
    }
}
