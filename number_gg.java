
import java.util.Random;
import java.util.Scanner;

public class number_gg {
    public static void main(String[] args) {
        Random r=new Random();
        int n=r.nextInt(0,100);
        int uinput,cnt=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("now guess the number between o to 200");
        do { 
           
            uinput=sc.nextInt();
            cnt++;
            if(uinput==n)
                break;
            else
                System.out.println("wrong answer please try once again");

        } while (uinput!=n);
        System.out.println("you have guessed correct answer in "+cnt+" attempts");
    }
    
}
