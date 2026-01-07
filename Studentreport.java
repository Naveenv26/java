public class Studentreport {

    public static void main(String[] args) {
        Student s1=new Student("nagul", 1522);
        s1.mark(50,60,50);
        s1.display();
        Student s2=new Student("mojh", 1523);
        s2.mark(58, 30, 30);
        s2.display();
    }
}

class Student{
    String name;
    int rollno;
    Student(String name,int rollno){
        this.name=name;
        this.rollno=rollno;

    }

    double maths;
    double science;
    double english;
    double avg;

    void mark(double maths,double science,double english){
        
        this.maths=maths;
        this.science=science;
        this.english=english;
    }

    double avg(){
        
        return total()/3;
    }
    double total;
    double total(){
        return maths+science+english;
        
    }

    String pass(){
        if(avg>=40){
            String a="Pass";
            return a;
        }
        else{
            String b="fail";
            return b;
        }
    }

    void display (){
        System.out.println("------------*******----------");
        System.out.println("Student name: "+name);
        System.out.println("Student Rollno : "+rollno);
        System.out.println("Total marks : "+total());
        System.out.println("Average mark : "+avg());
        System.out.println("PASS OR FAIL : "+ pass());
        System.out.println("***********-----------***********");
    }
}
