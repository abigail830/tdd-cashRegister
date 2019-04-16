import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class CashRegisterTest {

    @Mock
    Purchase globalMockPurchase;
    @Mock
    Printer globalMockPrinter;

//    @BeforeEach
//    void setUp() {
//        initMocks(this);
//    }

    @Test
    void should_able_to_invoke_printer_with_right_content_with_manual_mockprinter() {
        //given
        final Item item = new Item("Name", 100.0);
        Purchase purchase = new Purchase(Arrays.asList(item));
        final MockPrinter mockPrinter = new MockPrinter();
        final CashRegister cashRegister = new CashRegister(mockPrinter);

        //when
        cashRegister.process(purchase);

        //then
        mockPrinter.verifyPrinted("Name\t100.0\n");
    }

    @Test
    void should_able_to_invoke_printer_with_right_content_with_mokito_mockprinter() {
        //given
        final Item item = new Item("Name", 100.0);
        Purchase purchase = new Purchase(Arrays.asList(item));
        Printer printer = mock(Printer.class);
        final CashRegister cashRegister = new CashRegister(printer);

        //when
        cashRegister.process(purchase);

        //then
        verify(printer).print("Name\t100.0\n");
    }

    @Test
    void should_able_to_invoke_printer_with_right_content_with_mokito_mockprinter_and_mockpurchase() {
        //given
        Purchase purchase = mock(Purchase.class);
        when(purchase.getDescription()).thenReturn("Purchase Description");
        Printer printer = mock(Printer.class);
        final CashRegister cashRegister = new CashRegister(printer);

        //when
        cashRegister.process(purchase);

        //then
        verify(printer).print("Purchase Description");
    }

    @Test
    void should_able_to_invoke_printer_with_right_content_with_another_way_of_mock() {
        //given
        when(globalMockPurchase.getDescription()).thenReturn("Purchase Description");
        final CashRegister cashRegister = new CashRegister(globalMockPrinter);

        //when
        cashRegister.process(globalMockPurchase);

        //then
        verify(globalMockPrinter).print("Purchase Description");
    }

}