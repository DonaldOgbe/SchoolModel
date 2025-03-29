import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class TeacherTest {
    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out; // Save original System.out

    String name;
    int age;
    String gender;
    Teacher testTeacher;

    @BeforeEach
    void setup() {
        System.setOut(new PrintStream(outputStream));
        name = "Perry";
        age = 29;
        gender = "Male";
        testTeacher = new Teacher(name, age, gender);
    }

    @Test
    void printNewlyAddedCourse() {
        String course = "Maths";
        String result = String.format("%s is teaching %s", name, course);
        testTeacher.addCourse(course);
        assertEquals(result.trim(), outputStream.toString().trim());
    }

    @Test
    void printAllInfoAsIntroduction() {
        String result = String.format("My name is %s, im %d years old," +
                " and im a %s %s", name, age, gender, "Teacher");
        testTeacher.introduce();
        assertEquals(result.trim(), outputStream.toString().trim());
    }
}