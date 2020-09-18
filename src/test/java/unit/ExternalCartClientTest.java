package unit;

import implementationChange.ExternalCartClient;
import org.junit.Assert;
import org.junit.Test;

public class ExternalCartClientTest {


    @Test
    public void format_total_price_message() throws Exception {
        ExternalCartClient client = new ExternalCartClient();

        Assert.assertEquals("Total price is 50 euro", client.formattedTotalPrice(50));
    }

}
