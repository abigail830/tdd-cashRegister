import org.junit.jupiter.api.Test;

import java.util.Arrays;

class CashRegisterTest {

    @Test
    void should_able_to_invoke_printer_with_right_content_with_mockprinter() {
        //given
        final Item item = new Item("Name", 100.0);
        Purchase purchase = new Purchase(Arrays.asList(item));
        final MockPrinter printer = new MockPrinter();
        final CashRegister cashRegister = new CashRegister(printer);

        //when
        cashRegister.process(purchase);

        //then
        printer.verifyPrinted("Name\t100.0\n");
    }
}