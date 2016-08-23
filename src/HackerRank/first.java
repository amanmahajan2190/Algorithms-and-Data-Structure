package HackerRank;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by AMAN on 8/11/2016.
 */
public class first {
    public String firstDuplicate(String s) {

        String[] res = s.split("[.:;,\\-\\s+]");
        Set<String> set = new HashSet<String>();
        int len = res.length;
        for (String curr : res) {
            if(curr.equals("")) {
                continue;
            }
            if (!set.add(curr)) {
                return (curr);
            }
        }
        return "";

    }

}
