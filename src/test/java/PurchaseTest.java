import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class PurchaseTest {

    @Test
    void should_get_description_for_items() {
        //given
        final Item item = new Item("Name", 100.0);
        Purchase purchase = new Purchase(Arrays.asList(item));
        //when
        final String description = purchase.getDescription();
        //then
        Assertions.assertEquals("Name\t100.0\n", description);
    }
}