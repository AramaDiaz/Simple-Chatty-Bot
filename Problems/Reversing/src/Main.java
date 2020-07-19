import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int val = scanner.nextInt();
        if (100<=val && val<=999) {
            if (val%10 == 0) {
                System.out.println(val/100 + ((val/10)%10)*10);
            } else {
                System.out.println(val/100 + ((val/10)%10)*10 + (val%10)*100);
            }
        }
    }
}