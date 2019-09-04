import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DateFormatterTest {
    DateFormatter dateFormatter = new DateFormatter();
    @Test
    public void test(){
        Assert.assertFalse(dateFormatter.isAfter("20190707","20190707"));
    }
}