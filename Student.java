public class Student {
    int id,total=0;
    float average=0;
    String name;
    int[]mark;
    static int count;

    Student(){
        count++;
    }


    int totalmark(int[] a){
        for(int tt: a){
            total=total+tt;
        }
        return total;
    }


    float averagemark(){
        average=total/mark.length;
        return average;
    }


    void display(){
        System.out.println("Student Id : "+id);
        System.out.println("Name : "+name);
        System.out.println("Total mark : "+total);
        System.out.println("average : "+average);
        
        System.out.println("----------------------");
    }


    public static void main(String[] args) {
        Student s=new Student();
        Student s1=new Student();
        
        s.id=101;
        s.name="Naveen";
        s.mark=new int[]{10,20,30,20,10};
        s.total=s.totalmark(s.mark);
        s.average=s.averagemark();
        s.display();
        s1.id=102;
        s1.name="Arun";
        s1.mark=new int[]{90,10,100,10,90};
        s1.total=s1.totalmark(s1.mark);
        s1.average=s1.averagemark();
        s1.display();

        System.out.println("Total student: "+ count);
    }
}
