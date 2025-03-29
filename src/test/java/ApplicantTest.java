import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class ApplicantTest {
    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out; // Save original System.out

    String name;
    int age;
    String gender;
    Applicant testApplicant;

    @BeforeEach
    void setup() {
        System.setOut(new PrintStream(outputStream));
        name = "Joy";
        age = 12;
        gender = "Female";
        testApplicant = new Applicant(name, age, gender);
    }

    @AfterEach
    void tearDown() {
        System.setOut(originalOut);
    }

    @Test
    void printAllInfoAsIntroduction() {
        String result = String.format("My name is %s, im %d years old," +
                " and im a %s %s", name, age, gender, "Applicant");
        testApplicant.introduce();
        assertEquals(result.trim(), outputStream.toString().trim());
    }
}