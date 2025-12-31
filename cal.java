import java.util.ArrayList;

import java.util.HashSet;

public class cal {

    public static void main(String[] args) {
        ArrayList<String> email=new ArrayList<>();
        email.add("a@test.com");
        email.add("b@test.com");
        email.add("a@test.com");

        HashSet<String> aa=new HashSet<>(email);
        System.out.println(aa);
    }
}