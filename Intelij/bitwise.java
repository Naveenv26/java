public class bitwise {
    public static void main(String[] args) {
        int n = 4;
        table(n, 1);
    }


    static void table(int n, int i) {


        if (n <= 0) {
            System.out.println("Zero");
            return;
        } else if (i == 11) {
            return;
        }
        else {
            System.out.println(i + " * " + n + " = " + i * n);
        }
        table(n,i+1);
    }
}