public class hell {
    public static void main(String[] args) {
        student s1=new student();
        s1.name="john";
        s1.age=5;
        student s2=new student();
        s2.name="vara";
        s2.age=50;

        s1.display();
        s2.display();
        }
    }

class student{
        String name;
        int age;

        void display(){
            System.out.println(name +':'+ age);
        }
}