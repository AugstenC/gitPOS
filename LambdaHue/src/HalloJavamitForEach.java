import java.util.Arrays;
import java.util.List;

public class HalloJavamitForEach {
    public static void main(String[] args) {
        List<String> liste = Arrays.asList("Hallo", "Java", "mit", "ForEach");

        for (String s : liste) {
            System.out.println(s);
        }

        liste.forEach(s -> System.out.println(s));

        liste.forEach(System.out::println);
    }
}