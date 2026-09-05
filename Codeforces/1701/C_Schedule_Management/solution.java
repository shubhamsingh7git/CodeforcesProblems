import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            int[] cnt=new int[n];
            for(int i=0;i<m;i++) cnt[sc.nextInt()-1]++;
            int l=1,r=2*m;
            while(l<r){
                int mid=(l+r)/2;
                long free=0,need=0;
                for(int i=0;i<n;i++){
                    if(cnt[i]>mid) need+=cnt[i]-mid;
                    else free+=(mid-cnt[i])/2;
                }
                if(free>=need) r=mid;
                else l=mid+1;
            }
            System.out.println(l);
        }
    }
}