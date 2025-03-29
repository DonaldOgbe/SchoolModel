import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class StaffTest {
    static Stream<Arguments> provideStaffsForTesting() {
        return Stream.of(
                Arguments.of("Alice", 25, "Female", "Teacher", 132000),
                Arguments.of("Sarah", 60, "Female", "Principal", 220000),
                Arguments.of("Doyle", 55, "Male", "Non-Academic Staff", 88000)
        );
    }

    @ParameterizedTest
    @MethodSource("provideStaffsForTesting")
    void increaseSalaryByTenPercent(String name, int age, String gender, String role, int expected) {
        Staff testStaff = new Staff(name, age, gender, role);
        testStaff.giveRaise(10);
        assertEquals(expected, testStaff.salary);
    }
}