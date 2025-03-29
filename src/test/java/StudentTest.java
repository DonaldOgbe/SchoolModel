import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out; // Save original System.out

    String name;
    int age;
    String gender;
    Student testStudent;

    @BeforeEach
    void setup() {
        System.setOut(new PrintStream(outputStream));
        name = "Mary";
        age = 14;
        gender = "Female";
        testStudent = new Student(name, age, gender);

    }

    @Test
    void getRole() {
        assertEquals("Student", testStudent.getRole());
    }

    @Test
    void getGrade() {
        assertEquals(age - 9, testStudent.getGrade());
    }

    @Test
    void printAllInfoAsIntroduction() {
        String result = String.format("My name is %s, im %d years old," +
                " im a %s and im a %s in grade %d", name, age, gender, testStudent.getRole(), testStudent.getGrade());
        testStudent.introduce();
        assertEquals(result.trim(), outputStream.toString().trim());
    }

    @Test
    void printNewlyAddedCourse() {
        String course = "Maths";
        String result = String.format("%s is taking %s", name, course);
        testStudent.addCourse(course);
        assertEquals(result.trim(), outputStream.toString().trim());
    }


}