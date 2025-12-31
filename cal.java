import java.util.ArrayList;

public class cal {

    
    public static void main(String[] args) {
        ArrayList<String> item=new ArrayList<>();
        item.add("Milk");
        item.add("egg");
        item.add("bread");
        System.out.println(item);
        item.remove("egg");
        item.add("butter");
        System.out.println(item.get(1));

        System.out.println(item);

    }
}