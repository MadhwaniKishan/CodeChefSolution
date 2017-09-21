import java.io.IOException;
import java.util.*;
class SubsequenceEqaulity{
    public static void main(String[] args) throws IOException{
       Scanner sc=new Scanner(System.in);
        int no=Integer.parseInt(sc.nextLine());
        String[] a=new String[no];
        int f=0;
         for(int i=0;i<no;i++){
            a[i]=sc.nextLine();
        }
         for(int i=0;i<a.length;i++){
             int[] c=new int[26];
             f=0;
             for(int j=0;j<a[i].length();j++){
                 c[(int)a[i].charAt(j)-97]++;
                 if(c[(int)a[i].charAt(j)-97]>=2)
                 {
                     System.out.println("yes");
                     f=1;
                     break;
                 }
             }
          if(f==0)
              System.out.println("no");
         }
    }
}
 
