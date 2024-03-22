import java.util.HashMap;
import java.util.Map;

public class AtLeastOneOccurence {
    public static int numberOfSubstrings(String s) {
        int i=0;
        int j=0;
        int n=s.length();
        int ans=0;
        int nooccurence_sub=0;
        int total_subs=0;
        Map<Character,Integer> mp=new HashMap<>();

        for(j=0;j<n;j++){
            mp.put(s.charAt(j),mp.getOrDefault(s.charAt(j),0)+1);
            while(i<=j && mp.size()==3){
                mp.put(s.charAt(i),mp.get(s.charAt(i))-1);
                if(mp.get(s.charAt(i))==0){
                    mp.remove(s.charAt(i));
                }
                i++;
            }
            nooccurence_sub=nooccurence_sub+(j-i+1);
        }
        for(int k=1;k<=n;k++){
            total_subs=total_subs+k;
        }
        ans=total_subs-nooccurence_sub;
        return ans;

        

        
    }
    public static void main(String[] args) {
        String s="abcabc";
        int res=numberOfSubstrings(s);
        System.out.println(res);

    }
}
