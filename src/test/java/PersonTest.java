import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    String name;
    int age;
    Person testPerson;

    @BeforeEach
    void setup() {
        name = "Pascal";
        age = 28;
        testPerson = new Person(name, age, "Male", "Person");
    }

    @Test
    void getName() {
        assertEquals(name, testPerson.getName());
    }

    @Test
    void getAge() {
        assertEquals(age, testPerson.getAge());
    }
}