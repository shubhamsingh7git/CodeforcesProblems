import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int ans=0;
            boolean in=false;
            for(int i=0;i<n;i++){
                int x=sc.nextInt();
                if(x!=0&&!in){
                    ans++;
                    in=true;
                }else if(x==0){
                    in=false;
                }
            }
            System.out.println(Math.min(ans,2));
        }
    }
}