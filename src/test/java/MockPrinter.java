import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MockPrinter extends Printer {

    boolean printed = false;
    private String message = "";

    public void print(String message) {
        this.printed = true;
        this.message = message;

    }

    public void verifyPrinted(String expected) {
        assertTrue(printed);
        assertEquals(expected, message, "应打印指定信息!");

    }

}
