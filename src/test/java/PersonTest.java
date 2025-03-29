import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    String name;
    int age;
    String gender;
    Person testPerson;

    @BeforeEach
    void setup() {
        name = "Pascal";
        age = 28;
        gender = "Male";
        testPerson = new Person(name, age, gender, "Person");
    }

    @Test
    void getName() {
        assertEquals(name, testPerson.getName());
    }

    @Test
    void getAge() {
        assertEquals(age, testPerson.getAge());
    }

    @Test
    void getGender() {
        assertEquals(gender, testPerson.getGender());
    }

    @Test
    void getRole() {
        assertEquals("Person", testPerson.getRole());
    }
}