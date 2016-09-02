import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

/**
 * Created by mebitech on 2.9.2016.
 */
public class RomanNumeralErrorTest {
    @Test
    public void fail_to_convert_unknown(){
        try {
            RomanNumeral roman = new RomanNumeral();
            roman.convert("Z");
            fail("should fail with unknown roman Z");

        }catch (Exception e){
            assertThat(e.getMessage(),containsString("Z"));
        }

    }
}
