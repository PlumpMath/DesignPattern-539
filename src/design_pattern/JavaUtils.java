package design_pattern;
/**
 * Created by Nianzu on 3/21/2015.
 */
public class JavaUtils {

    public static void main(String[] args) {
        System.out.println(stringRepeat("-", 3));
    }

    public static String stringRepeat(String line, int times){
        String newline = "";
        for(int i=0; i<times; i++){
            newline += line;
        }
        return newline;
    }
}
