package recursion2;

public class problem12 {
    public static void RemoveDuplicates(String s,int i,StringBuilder newString,boolean map[]){
        if(i==s.length()){
            System.out.println(newString);
            return;
        }
        char currentChar=s.charAt(i);
        if(map[currentChar-'a']==true){
            RemoveDuplicates(s, i+1, newString, map);
        }else{
            map[currentChar-'a']=true;
            RemoveDuplicates(s, i+1, newString.append(currentChar), map);
        }
    }
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder();
        boolean map[]=new boolean[26];
        RemoveDuplicates("apnnacollege", 0, sb, map);
    }
}
