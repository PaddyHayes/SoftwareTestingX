import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class DriverClassTest {

    @Test
    void getDriverNum() {
    }

    @Test
    void getDriverName() {
    }

    @Test
    void check_status() {
    }

    @Test
    void waitTillbanned() {
    }

    @ParameterizedTest
    @CsvSource({"1,Age ok", "1000,Age ok", "5000,Too old"})
    void checkNumberValid() {
    }

    /*@ParameterizedTest
    @CsvSource({"10,Age ok", "20,Age ok", "25,Too old"})
    void testcheckageAll( int age, String expected) {
        Robot buddy = new Robot("buddy", age);
        assertEquals(expected, buddy.checkage() );

    }*/
}