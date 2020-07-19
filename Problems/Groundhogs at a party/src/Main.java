import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cups = scanner.nextInt();
        boolean isWeekend = scanner.nextBoolean();
        boolean partyOK = ((10<=cups)&&(cups<=20) && (isWeekend!=true)) | ((15<=cups) && (cups<=25) &&(isWeekend==true));

            System.out.println(partyOK);

    }
}