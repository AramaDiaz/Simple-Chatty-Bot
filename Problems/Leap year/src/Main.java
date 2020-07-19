import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int no = s.nextInt();
        if (1900 <= no && no <= 3000) {
            if ((no % 4 == 0) && !(no % 100== 0) || (no % 400 == 0)) {
                System.out.println("Leap");
            } else {
                System.out.println("Regular");
            }
        }
    }
}