import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

import static org.apache.commons.lang3.StringUtils.capitalize;
import static org.apache.commons.lang3.StringUtils.reverse;

public class MavenApp {

    public static void main(String[] args) {
        System.out.println("hello from maven project");
        Scanner scannyhead = new Scanner(System.in);
        System.out.print("enter a string: ");
        String test = scannyhead.nextLine();

        String capitalize = capitalize(test);
        System.out.println("capitalize = " + capitalize);

        String reversed = reverse(test);
        System.out.println("reversed = " + reversed);

        String swapCase = StringUtils.swapCase(test);
        System.out.println("swapCase = " + swapCase);

        boolean isAlpha = StringUtils.isAlphaSpace(test);
        System.out.println("isAlpha = " + isAlpha);

    }



}
