package arrays;
import java.util.ArrayList;
import java.util.Arrays;

public class ExtractNumbersFromString {
    public static ArrayList<String> extract(String str) {
        ArrayList<String> list = new ArrayList<>();
        StringBuilder num = new StringBuilder();

        for (char ch : str.toCharArray()) {
            if (Character.isDigit(ch)) {
                num.append(ch);
            } else {
                if (num.length() != 0) {
                    list.add(num.toString());
                    num.setLength(0);
                }
            }
        }
        if (num.length() != 0) {
            list.add(num.toString());
        }
        return list;
    }

    public static void main(String[] args) {
        String str = "1.sharik agarwal , 2.nijamoodhen32 , 3.kishore raj54";
        ArrayList<String> result=extract(str);
        System.out.println(result);
    }
}