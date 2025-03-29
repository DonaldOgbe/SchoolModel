import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class PersonTest {
    String name;
    int age;
    Person person;

    @BeforeEach
    void setup() {
        name = "Frank";
        age = 35;
        person = new Person(name, age, "Male", "Person");
    }

    @Test
    void getName() {
        assertEquals(name, person.getName());
    }

    @Test
    void getAge() {
        assertEquals(age, person.getAge());
    }
}