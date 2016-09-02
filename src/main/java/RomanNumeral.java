import java.util.HashMap;
import java.util.Map;

/**
 * Created by mebitech on 2.9.2016.
 */
public class RomanNumeral {

    Map<String,Integer> map =new HashMap<String, Integer>() {
        {
            put("I",1);
            put("V", 5);
            put("X", 10);
            put("C", 100);
            put("M", 1000);

        }
    };

    public int convert(String roman) {
        Integer result = 0;
        String unparsed = roman;
        while (unparsed.length()>1){

            Integer current = toNumber(unparsed.substring(0,1));

            Integer next = toNumber(unparsed.substring(1,2));

            result +=current < next ? -current : +current;

            unparsed = unparsed.substring(1);

        }
        return result += toNumber(unparsed);
    }

    private Integer toNumber(String roman) {
        checkRoman(roman);
        return map.get(roman);
    }

    private void checkRoman(String roman) {
        if (!map.containsKey(roman))
            throw new UnknownRoman(roman+"is unknown roman");
    }

    private class UnknownRoman extends RuntimeException {
        public  UnknownRoman(String msg) {
            super(msg);
        }
    }
}
