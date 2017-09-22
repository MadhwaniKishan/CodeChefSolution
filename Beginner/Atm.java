import java.io.IOException;
import java.util.Scanner;
class Atm {
    public static void main(String[] args) throws IOException{
            Scanner sc=new Scanner(System.in);
            int withdraw=sc.nextInt();
            float deposit=sc.nextFloat();
            if(withdraw%5==0&&withdraw+0.50<=deposit)
                System.out.printf("%.2f",deposit-withdraw-0.50);
            else
                System.out.printf("%.2f",deposit);
    }
}
