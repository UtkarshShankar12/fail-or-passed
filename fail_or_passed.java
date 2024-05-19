import java.util.Scanner;
public class fail_or_passed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER YOUR MATHS NUMBER");
        float m = sc.nextFloat();
        System.out.println("ENTER YOUR PHY NUMBER");
        float p = sc.nextFloat();
        System.out.println("ENTER YOUR CHEM NUMBER");
        float c = sc.nextFloat();
        float sum = m+p+c;
        if (sum>=120 && m>=33 && p>=33 && c>=33){
            System.out.println("CONGRATS YOU  PASSED");
        }
        else {
            System.out.println("SORRY DUDE YOU FAILED");
        }
    }
}
