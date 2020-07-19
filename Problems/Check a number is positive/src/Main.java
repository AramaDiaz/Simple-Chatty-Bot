import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int no = s.nextInt();
        if (no>0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}