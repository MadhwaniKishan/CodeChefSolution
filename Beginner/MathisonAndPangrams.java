import java.io.IOException;
import java.util.*;
class MathisonAndPangrams {
    public static void main(String[] args) throws IOException{
            Scanner sc=new Scanner(System.in);
            int no=Integer.parseInt(sc.nextLine()),ans=0;
            String[] price=new String[no];
            String[] sentence=new String[no];
            for(int i=0;i<no;i++){
                price[i]=sc.nextLine();
                sentence[i]=sc.nextLine();
            }
            for(int i=0;i<no;i++){
                String[] ptemp=price[i].split(" ");
                ans=0;
                int[] temp=new int[26];
                for(int j=0;j<sentence[i].length();j++){
                    temp[(int)sentence[i].charAt(j) -97]++;
                }
                for(int j=0;j<26;j++){
                    if(temp[j]<1){
                      ans+=Integer.parseInt(ptemp[j]);  
                    }
                }
                System.out.println(ans);
            }
    }
    
}
