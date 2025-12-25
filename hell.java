public class Hell {
    static int track;
    Hell(){
        this.track=track+1;
        System.out.println(track);

    }
    public static void main(String[] args) {
        Hell a=new Hell();
        Hell a1=new Hell();
        Hell a2=new Hell();
    }
}