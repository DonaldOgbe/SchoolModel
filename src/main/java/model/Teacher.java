package model;

import interfaces.Introduce;
import interfaces.NewCourse;

public class Teacher extends Staff implements NewCourse, Introduce {
    public Teacher(String name, int age, String gender) {
        super(name, age, gender, "models.Teacher");
    }

    @Override
    public void addCourse(String course) {
        String result = String.format("%s is teaching %s", this.getName(), course);
        System.out.println(result);
    }

    @Override
    public void introduce() {
        String result = String.format("My name is %s, im %d years old," +
                " and im a %s %s", this.getName(), this.getAge(), this.getGender(), this.getRole());
        System.out.println(result);
    }
}
