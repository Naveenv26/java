import java.util.ArrayList;


import java.util.Iterator;

public class cal {

    public static void main(String[] args) {
        ArrayList<Integer> task=new ArrayList<>();
        task.add(80);
        task.add(70);
        task.add(20);
        task.add(50);
        task.add(40);

        Iterator<Integer> it=task.iterator();

        while(it.hasNext()){
            int num=it.next();
            if(num <50){
                it.remove();
            }
        }
        System.out.println(task);

    }
}