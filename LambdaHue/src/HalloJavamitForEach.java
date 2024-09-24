import java.util.ArrayList;

public class HalloJavamitForEach {

    ArrayList<String> list = new ArrayList<String>();


    public void printList() {
        for (String s : list) {
            System.out.println(s);
        }

        list.forEach(System.out::println);
    }

}
