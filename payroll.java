public class payroll {
    public static void main(String[] args) {
        Fulltime f=new Fulltime(101, "naveen", 5000,100);
        Employee b=new Employee(201, "jiji", 500);
        f.display();
        b.display();
        System.out.println("total employee : "+ Employee.employeecount);
    }
}

class Employee{
    private int id,basesalary;
    private String name;
    static int employeecount;

    Employee(int id, String name,int basesalary){
        this.id=id;
        this.basesalary=basesalary;
        this.name=name;
        employeecount++;
    }
    int id(){
        return id;
    }
    String na(){
        return name;
    }
    int cal(){
        return basesalary;
    }
    void display(){
        System.out.println("ID : "+id);
        System.out.println("name : "+name);
        System.out.println("salary : "+cal());
    }


}
class Fulltime extends Employee{
    private int bonus=0;
    Fulltime(int id,String name,int basesalary,int bonus){
        super(id,name,basesalary);
        this.bonus=bonus;
    }
    int []history=new int[10];
    int i=0;
    void his() {
        if (i < history.length) {
            history[i] = this.cal();
            
            System.out.println("History updated: " + history[i]);
            i++;
        } else {
            System.out.println("Memory Full!");
        }
    }
    int cal(){
        return super.cal()+bonus;
    }
    void display(){
        System.out.println("ID : "+super.id());
        System.out.println("name : "+super.na());

        System.out.println("salary : "+cal());
        his();
    }
}
