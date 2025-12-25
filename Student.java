public class Student {
    int id,total=0;
    float average=0;
    String name;
    int[]mark;
    static int count;

    Student(int id,String name,int[]mark){
        this.mark=mark;
        this.id=id;
        this.name=name;
        count++;
        totalmark(mark);
        averagemark();
        
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
        Student s=new Student(101,"Naveen",new int[]{10,20,30});
        Student s1=new Student(102,"arun",new int[]{10,50,40});
        

        s.display();

        s1.display();

        System.out.println("Total student: "+ count);
    }
}
