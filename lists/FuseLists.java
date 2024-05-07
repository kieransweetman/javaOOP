package lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FuseLists {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<String>();
        list1.add("Rouge");
        list1.add("Vert");
        list1.add("Orange");

        List<String> list2 = new ArrayList<String>();
        list2.add("Blanc");
        list2.add("Bleu");
        list2.add("Orange");
        // TODO Développements à réaliser ci-dessous

        List<String> list3 = new ArrayList<String>();

        list3.addAll(list1);
        list3.addAll(list2);

        System.out.println(list3);
    }
}
