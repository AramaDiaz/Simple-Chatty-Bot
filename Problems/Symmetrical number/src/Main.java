import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int val = s.nextInt();
        int half = val/100;
        int otherHalf = val%100;
        if (half/10 == otherHalf%10 && half%10==otherHalf/10) {
            System.out.println(1);
        } else {
            System.out.println(37);
        }
    }
}