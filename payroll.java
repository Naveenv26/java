public class payroll {
    public static void main(String[] args) {
        Fulltime emp=new Fulltime(101, "hilo", 10000.0);
        contractor ee=new contractor(201, "logwer", 100, 50.0);
        emp.display();
        ee.display();
    }
}

abstract class Employee{
    private int id;
    private String name;


    Employee(int id, String name){
        this.id=id;
        this.name=name;

    }

    abstract Double calculatesalary();

    void display(){
        System.out.println("ID : "+id);
        System.out.println("name : "+name);
        System.out.println("name : "+calculatesalary());
    }


}
class Fulltime extends Employee{

    int []history=new int[10];
    int i=0;
    Double monthlysalary;

    Fulltime(int id,String name,Double monthlysalary){
        super(id,name);
        this.monthlysalary=monthlysalary;
    }

    Double calculatesalary(){
        return monthlysalary;
    }

}

class contractor extends Employee{
    Double hourlyrate;
    int hoursworked;

    contractor(int id,String name,int hoursworked,Double hourlyrate){
        super(id, name);
        this.hourlyrate=hourlyrate;
        this.hoursworked=hoursworked;
    }

    @Override
    Double calculatesalary() {
        return hourlyrate*hoursworked;
    }
}
