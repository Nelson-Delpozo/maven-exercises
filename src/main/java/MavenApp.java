import static org.apache.commons.lang3.StringUtils.capitalize;

public class MavenApp {

    public static void main(String[] args) {
        System.out.println("hello from maven project");

        String test = "hello";

        String newTest = capitalize(test);
        System.out.println(newTest);

    }



}
