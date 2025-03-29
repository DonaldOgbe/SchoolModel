import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


import static org.junit.jupiter.api.Assertions.*;

class PrincipalTest {
    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out; // Save original System.out

    String name;
    int age;
    String gender;
    Principal testPrincipal;

    @BeforeEach
    void setup() {
        System.setOut(new PrintStream(outputStream));
        name = "Mark";
        age = 55;
        gender = "Male";
        testPrincipal = new Principal(name, age, gender);
    }

    @AfterEach
    void tearDown() {
        System.setOut(originalOut);
    }

    @Test
    void printAllInfoAsIntroduction() {
        String result = String.format("My name is %s, im %d years old," +
                " and im a %s %s", name, age, gender, "Principal");
        testPrincipal.introduce();
        assertEquals(result.trim(), outputStream.toString().trim());
    }

    @ParameterizedTest
    @CsvSource({"Darren, 15,Admitted",
    "Terry, 9,not Admitted"})
    void admitApplicant(String name, int age, String expected) {
        Applicant testApplicant = new Applicant(name, age, "Male");
        String result = String.format("%s is %s", name, expected);
        testPrincipal.admitApplicant(testApplicant);
        assertEquals(result.trim(), outputStream.toString().trim());
    }

    @Test
    void expelStudent() {
        Student testStudent = new Student(name, 15, gender);
        String result = String.format("%s is Expelled", name);
        testPrincipal.expelStudent(testStudent);
        assertEquals(result.trim(), outputStream.toString().trim());
    }



}