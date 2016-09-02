import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

/**
 * Created by mebitech on 2.9.2016.
 */
@RunWith(Parameterized.class)
public class RomanNumeralTest {

    private RomanNumeral roman = new RomanNumeral();
    private String romanNumeral;
    private Integer expected;


    public RomanNumeralTest(String romanNumeral, Integer expected) {
        super();
        this.romanNumeral = romanNumeral;
        this.expected = expected;
    }

//    @Test
//    public void convert_I_to_1(){
//
//        assertThat(roman.convert("I"),equalTo(1));
//    }

    @Test
    public void convert_IV_to_4(){
        assertThat(roman.convert("IV"),equalTo(4));
    }

    @Test
    public void convert_as_expected(){
        assertThat(roman.convert(romanNumeral),equalTo(expected));
    }

    @Parameterized.Parameters
    public static List<Object[]> parameters() {
        List<Object[]> list= new ArrayList<Object[]>();
        list.add(new Object[] {"I", 1});
        list.add(new Object[] {"V", 5});
        list.add(new Object[] {"X", 10});
        list.add(new Object[] {"VI", 6});
        list.add(new Object[] {"C", 100});
        list.add(new Object[] {"XXI", 21});
        list.add(new Object[] {"MCMXCIX", 1999});
        list.add(new Object[] {"IV", 4});

        return list;
    }

}
