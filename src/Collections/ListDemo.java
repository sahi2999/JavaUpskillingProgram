package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListDemo {
	public static void main(String[] args) {
        List<String> list =new ArrayList<>();
        list.add("sai");
        list.add("cap");
        list.add("bemini");
         Collections.sort(list);
        System.out.println(list);
}
}
