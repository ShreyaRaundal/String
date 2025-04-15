import java.util.*;

public class Codec {
    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String s : strs)
            sb.append(s.length()).append("#").append(s);
        return sb.toString();
    }

    public List<String> decode(String s) {
        List<String> res = new ArrayList<>();
        int i = 0;
        while (i < s.length()) {
            int j = i;
            while (s.charAt(j) != '#') j++;
            int len = Integer.parseInt(s.substring(i, j));
            res.add(s.substring(j + 1, j + 1 + len));
            i = j + 1 + len;
        }
        return res;
    }

    public static void main(String[] args) {
        Codec codec = new Codec();
        List<String> input = Arrays.asList("leet", "code", "123");
        String encoded = codec.encode(input);
        System.out.println("Encoded: " + encoded);
        System.out.println("Decoded: " + codec.decode(encoded));
    }
}
