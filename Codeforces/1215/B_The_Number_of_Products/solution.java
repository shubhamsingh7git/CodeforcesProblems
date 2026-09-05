import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long pos=0,neg=0;
        long ansPos=0,ansNeg=0;
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            if(x>0){
                pos++;
            }else{
                long temp=pos;
                pos=neg;
                neg=temp+1;
            }
            ansPos+=pos;
            ansNeg+=neg;
        }
        System.out.println(ansNeg+" "+ansPos);
    }
}