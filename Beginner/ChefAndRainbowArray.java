import java.io.IOException;
import java.util.Scanner;
class ChefAndRainbowArray {
    public static void main(String[] args) throws IOException{
            Scanner sc=new Scanner(System.in);
            int no=Integer.parseInt(sc.nextLine()),f=0,te=1;
            String[] ip=new String[no];
            for(int i=0;i<no;i++){
                sc.nextLine();
                ip[i]=sc.nextLine();
            }
            for(int i=0;i<ip.length;i++){
                String[] temp=ip[i].split(" ");
                f=1;
                if(temp[temp.length/2].equals("7")){
                    f=0;
                for(int j=0;j<temp.length/2;j++){
                   if(!temp[j].equals(temp[temp.length-1-j]) || Integer.parseInt(temp[j])>=8 || Integer.parseInt(temp[temp.length-1-j])>=8){
                       f=1;
                       break;
                   }
                 }
                }
                if(f==0)
                    System.out.println("yes");
                else
                    System.out.println("no");
            }
    }
    
}
