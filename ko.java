
import java.util.ArrayList;


class ko{
    public static void main(String[] args) {
        ArrayList<String> a=new ArrayList<>();
        a.add("flower");
        a.add("flow");
        a.add("flight");
        int min=a.get(0).length();
        for(int i=0;i<a.size();i++ ){
            min=Math.min(min, a.get(i).length());
        }
boolean mis=false;
        for(int i=0;i<min;i++){
            char c=a.get(0).charAt(i);

            for(int j=1;j<a.size();j++){
                if(a.get(j).charAt(i)!=c){
                    mis=true;
                    break;
                }
                
            }

            if (mis) {
                break;
            }
            System.out.println(c);
        }


    }

}