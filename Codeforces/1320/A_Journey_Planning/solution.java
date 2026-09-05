import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        HashMap<Long,Long> map=new HashMap<>();
        for(int i=1;i<=n;i++){
            long b=sc.nextLong();
            long key=b-i;
            map.put(key,map.getOrDefault(key,0L)+b);
        }
        long ans=0;
        for(long sum:map.values()){
            ans=Math.max(ans,sum);
        }
        System.out.println(ans);
    }
}