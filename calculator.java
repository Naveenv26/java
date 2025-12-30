

public class calculator {
    public static void main(String[] args) {
        int []num={10,20,30};

        try{
            System.out.println(num[1]/0);
        }
                catch(ArithmeticException e){
            System.out.println("maths problen");
        }
        
        catch (Exception e) {
            System.out.println("error"+e);
        }

    }
}

