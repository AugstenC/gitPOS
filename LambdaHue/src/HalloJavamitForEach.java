import java.util.ArrayList;

public class HalloJavamitForEach {

    ArrayList<String> list = new ArrayList<String>();
    public HalloJavamitForEach() {
        list.add("Hallo");
        list.add("Welt");
        list.add("!");

    }

    public void printList() {
        for (String s : list) {
            System.out.println(s);
        }
    }
}
