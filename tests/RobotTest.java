import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static java.time.Duration.ofMillis;
import static org.junit.jupiter.api.Assertions.*;

class RobotTest {

    Robot buddy = new Robot("buddy", 0);

    @org.junit.jupiter.api.Test
    void getName() {
        assertEquals("buddy", buddy.getName());
    }

    @org.junit.jupiter.api.Test
    void setName() {
    }

    @org.junit.jupiter.api.Test
    void getAge() {
        assertEquals(10, buddy.getAge());
    }

    @org.junit.jupiter.api.Test
    void setAge() {
    }

    @Test
    public void isNotWorking() {
        assertFalse(buddy.isWorking());
    }

    @Test
    public void isWorking() {
        buddy.talkToRobot();
        assertTrue(buddy.isWorking());
    }

    @Test
    public void getWorkingMsg() {
        buddy.talkToRobot();
        assertEquals("I am in working mode", buddy.getWorkingMsg());
    }

    @Test()
    @DisplayName("getWorkingMsgFail catch the expection")
    public void getWorkingMsgFail() {

        assertThrows(IllegalStateException.class, () -> {
            buddy.getWorkingMsg();
        });
    }

    @Test()
    public void testName_Fail() {

        assertThrows(IllegalArgumentException.class, () -> {
            Robot chuck = new Robot("", 0);


        });
    }

    @Test
    public void waitTillWorking() throws InterruptedException {
        buddy.waitTillWorking();
    }
    @Test
    void timeoutExceeded()
    {
        // The following assertion fails with an error message similar to:
        // execution exceeded timeout of 10 ms by 91 ms
        assertTimeout(ofMillis(10), () -> {
            // Simulate task that takes more than 10 ms.
            buddy.waitTillWorking();
        });
    }

    //need to finish
    /*@ParameterizedTest
    @CsvSource({"3,10000.00", "9,7500.00", "11,5000.00"})
    void checkCost() {
        Robot buddy = new Robot("buddy", age);
        assertEquals(expected, buddy.checkage() );
    }*/
}