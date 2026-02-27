import java.util.HashMap;

public class Word {
    public static void main(String[] args) {
        String s, pattern;
        wordPattern( pattern, s);
    }
}

class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] word=s.split(" ");
        if(pattern.length() != word.length){
            return false;
        }
        HashMap<Character,String> map=new HashMap<>();
        HashMap<String,Character> map2=new HashMap<>();
        for(int i=0;i<pattern.length();i++){
            char c=pattern.charAt(i);
            String w=word[i];
            if(map.containsKey(c)){
                if(!map.get(c).equals(w)){
                    return false;
                }
            }
            if(map2.containsKey(w)){
                if(map2.get(w)!=c){
                    return false;
                }
            }
            map.put(c, w);
            map2.put(w, c);
        }
        return true;
    }
}