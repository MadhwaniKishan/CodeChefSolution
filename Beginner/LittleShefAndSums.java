import java.io.IOException;
import java.util.Scanner;
class LittleShefAndSums {
     public static void main(String[] args) throws IOException{
       Scanner sc=new Scanner(System.in);
        int no=Integer.parseInt(sc.nextLine()),ans=0;
        long psum=0,ssum=0,sum=0,min=0;
        String[] ip=new String[no];
        for(int i=0;i<no;i++){
            sc.nextLine();
            ip[i]=sc.nextLine();
        }
        for(int i=0;i<ip.length;i++){
            String[] te=ip[i].split(" ");
            sum=0;
            for(int j=0;j<te.length;j++){
                sum+=Long.parseLong(te[j]);
            }
            psum=sum;
            ssum=Long.parseLong(te[0]);
            min=psum+ssum;
            ans=0;
            for(int j=1;j<te.length;j++){
                psum-=Long.parseLong(te[j-1]);
                ssum+=Long.parseLong(te[j]);
                if(psum+ssum<min){
                    min=psum+ssum;
                    ans=j;
                }
            }
            System.out.println(ans+1);
        }
     }
    
}
