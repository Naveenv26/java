import java.util.ArrayList;

public class cal {

    
    public static void main(String[] args) {
        ArrayList<Student> st=new ArrayList<>();
        st.add(new Student(80, "naveen"));
        st.add(new Student(35, "rahul"));
        st.add(new Student(86,"joij"));
        for(Student jj : st){
            if(jj.mark>40){
                System.out.println(jj.name);
        }

        }
       
    }
}

class Student{
    int mark;
    String name;

    Student(int mark,String name){
        this.mark=mark;
        this.name=name;
    }


}